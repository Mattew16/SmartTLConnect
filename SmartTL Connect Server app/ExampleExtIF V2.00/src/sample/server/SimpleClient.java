package sample.server;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/*  SimpleClient.java
*  @author Charles Bell
*  @version December 15, 2000
*  email: charles@quantumhyperspace.com
*/
 
//import java.io.*;
//import java.net.*;
//import java.util.concurrent.TimeUnit;
 
/**  Connects to a SimpleServer which is listening on port 8189
*/
public class SimpleClient{
 
  String serverurl = "88.217.155.226";
  //String serverurl = "127.0.0.1";
  int serverport = 8189;
  int clientnumber = 5;
  /**  Instantiates an instance of the SimpleClient class and initilaizes it.
 * @throws InterruptedException 
  */
  public static void main(String[] args) throws InterruptedException{
	SimpleClient simpleclient = new SimpleClient();
    simpleclient.init();
    
  }
 
  /**  Connects to the SimpleServer on port 8189 and sends a few demo lines
  *  to the server, and reads, displays the server reply,
  *  then issues a Bye command signaling the server to quit.
 * @throws InterruptedException 
  */
  public void init() throws InterruptedException{
    int i;
    int random;
    MessageSender[] list = new MessageSender[clientnumber];
    Random generator = new java.util.Random();
    for(i=0; i<clientnumber;i++){
      random = generator.nextInt((4 - 0) + 1);
      list[i] = new MessageSender(i, serverport, serverurl);
      list[i].start();
      TimeUnit.SECONDS.sleep(random);
    } 
    try{
      while(System.in.read() != 'q');
    }catch (IOException e){
      e.printStackTrace();
    }
    System.out.println("Stopping Clients");
    for (i=0;i<clientnumber;i++){
      list[i].quit();
    }
  }
}