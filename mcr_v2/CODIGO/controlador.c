
#define led2sinal pin_b5
#define ledpower pin_a6

#define blinkingMode_signal pin_b3
#define blinkingMode pin_a3
#define blinkingMode2 pin_a4
#define jca pin_b6
#define power pin_b0
#define BUFFER_SIZE 60 //Buffer size you can adjust this size 
//*********************************************************************
#include <16F628A.h>
#include <stdio.h>
#include <stdlib.h> 
#include <string.h>

#FUSES PROTECT   // Protecção contra leituras
#FUSES NOWDT      //Watch Dog Timer desabilitado

#FUSES HS  //Oscilador externo RC,
#FUSES PUT      //Power Up Timer activo
#FUSES NOBROWNOUT //Reset de queda de tensão desabilitado
#FUSES MCLR     //Pino MCLR desabilitado, usado para I/O PIN_A5
#FUSES NOLVP      //Programação em baixa voltagem desabilitada, B3(PIC16) ou B5(PIC18) usada para I/O
#FUSES NOCPD      //Proteção EEPROM desabilitada


#use delay(clock=15000000)// Clock de 4MHz
#use rs232(baud=9600,parity=N,xmit=PIN_B2,rcv=PIN_B1,bits=8)
#use fast_io(a)

//#priority int_rd0 //interrupt for power off (not used)
#priority int_rda
#byte RCREG = 0x1A 

unsigned char  charFromModem = 0;
unsigned int8 buffer[4]; 
unsigned int status = 2; //current status of the controller 
unsigned int receivedStatus = 2; //status received from converter

//#int_rd0

#int_rda //called on interruption received data from modem (Serial 232)
void get_232(){
  int i;
  for(i = 0; i<3;i++){
    if(kbhit()){
      charFromModem = getc();
      buffer[i] = charFromModem;
    }
  }
  
  OUTPUT_TOGGLE(led2sinal);

  if(buffer[0]=='I' && buffer[1]=='N'&& buffer[2]=='T'){
    receivedStatus = 2;
  }    
   
  if(buffer[0]=='C' && buffer[1]=='O' && buffer[2]=='R'){
    receivedStatus = 0;
  }
  
}
     
       
void readMessage(){
  delay_ms(500);
  printf("AT^SISR=0,4\r");
  DELAY_MS(500);
}   

void sendMessage (char message){
      delay_ms(500);
      printf("AT^SISW=0,8\r");
      delay_ms(500);
      printf("%s\r", message);
      delay_ms(500);
}

void modemConfiguration(){

  delay_ms(2000);

  printf("AT^SICS=0,conType,GPRS0\r");
  DELAY_MS(1000);

  printf("AT^SICS=0,inactTO,6200\r");
  DELAY_MS(1000);

  printf("AT^SICS=0,user,vodafone\r");
  DELAY_MS(1000);


  printf("AT^SICS=0,passwd,vodafone\r");
  DELAY_MS(1000);

  printf("AT^SICS=0,apn,internet.vodafone.pt\r");
  DELAY_MS(1000);
}  

void setupConnection(){
  printf("AT^SISS=0,srvType,socket\r");
  DELAY_MS(1000);

  printf("AT^SISS=0,conId,0\r");
  DELAY_MS(1000);

  printf("AT^SISS=0,alphabet,1\r");
  DELAY_MS(1000);

  printf("AT^SISS=0,address,socktcp://88.217.155.226:8189\r");
  DELAY_MS(1000);
} 

void openConnection(){
  printf("AT^SISO=0\r");
  delay_ms(500);    
}

void closeConnection(){
  delay_ms(500);
  printf("AT^SISC=0\r");
  delay_ms(500);
}

//Status are coded in numbers. 0 is normal mode, 1 is blinking mode, 2 is power off mode. 
void changeStatus(int newStatus){
 if(newStatus == 1){
    output_high(pin_b7);
    status = newStatus;
 }
 if(newStatus == 0){
    output_low(pin_b7);
    status = newStatus;  
 } 
 if(newStatus == 2){
  status = newStatus;
 }
 if(receivedStatus != status){
  receivedStatus = status;
 }
}

void checkBlinkingMode(){
  int i;
  if(input(blinkingMode) && input(blinkingMode2)){
    for(i = 0; i<15; i++){
      output_high(led2sinal);
      delay_ms(500);
      output_low(led2sinal);
      delay_ms(500);
    }
    if(input(blinkingMode) && input(blinkingMode2)){
      changeStatus(1);
    }else{
      changeStatus(0);
    }
  }
}

void main(){
  
  const char *messageList[3] = {"1COR", "1INT", "1OFF"};
  
  output_low(PIN_A5);
  delay_ms(500);
  output_high(PIN_A5);

  //set_uart_speed(9600);
  enable_interrupts(int_rda);
  enable_interrupts(global);
  setup_timer_0(RTCC_INTERNAL|RTCC_DIV_1);  // Configuração do Timer0
  setup_timer_1(T1_DISABLED);               // Configuração do Timer1
  setup_timer_2(T2_DISABLED,0,1);           // Configuração do Timer2
  setup_ccp1(CCP_OFF);                      // Configuração do CCP1
  setup_comparator(NC_NC_NC_NC);            // Configuração dos Comparadores
  setup_vref(FALSE);       // Configuração da Tensão de referência

  delay_ms(2000);
  //printf("AT+CPIN=5806 \r");
  //DELAY_MS(2000);

  // CONFIGURAÇÃO DO MODEM
  modemConfiguration();
  delay_ms(1000);

  //ligação
  setupConnection();

  //sinaliza fim de inicialização do modem
  output_high(led2sinal);
  delay_ms(500);
  output_low(led2sinal);
  delay_ms(500);

  while (true) {
    inicio:
    if(!input (power)){
      changeStatus(2);
      openConnection();
      delay_ms(1000);
      sendMessage(messageList[status]);
      delay_ms(1000);
      closeConnection();
      delay_ms(1000);
      }
    if(input (power)){
      openConnection();
      delay_ms(1000);
      readMessage();
      delay_ms(1000);
      closeConnection();
      delay_ms(1000);
      if (receivedStatus != status){
        changeStatus(receivedStatus);
        openConnection();
        delay_ms(1000);
        sendMessage(messageList[status]);
        delay_ms(1000);
        closeConnection();
        delay_ms(1000);
      }  
      else{
          checkBlinkingMode();
          openConnection();
          delay_ms(1000);
          sendMessage(messageList[status]);
          delay_ms(1000);
          closeConnection();
          delay_ms(1000);
        }
        
      }
    }
  }
  

       



