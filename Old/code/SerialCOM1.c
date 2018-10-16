#include <bios.h>
#include <conio.h>

#define COM1 0
#define DATA_READY 0x100
#define SETTINGS (0xC0 | 0x02 | 0x00 | 0x00)

int main(void) {
	int in, out, status;
	bioscom(0, SETTINGS, COM1); /* Initializa the port */
	cprintf ("Data sent to you: ");
	while(1) {
		status = bioscom(3, 0, COM1); /*waiting for data*/
		if (status & DATA_READY)
			if ((out = bioscom(2, 0, COM1) & 0x7F) != 0){  /*input a data*/
				putch(out);
			}	
			if (kbhit()) {
				if ((in = getch()) == 27)   /* ASCII of Esc*/
					break;
				bioscom(1, in, COM1);   /*output a data*/
			}

   }

   return 0;
	
}