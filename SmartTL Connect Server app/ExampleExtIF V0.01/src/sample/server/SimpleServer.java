package sample.server;

/*  SimpleServer.java
*  @author 
*  @version 
*  
*/
 
import java.io.*;
import java.net.*;
import java.util.*;
 
/**  When started allows one client to connect. It listens on port 8189.
*  It returns whatever a connected client sends.
*  It shuts down when the client sends a Bye line.
*
*/
public class SimpleServer{
 
  

/**  Instantiates an instance of the SimpleServer class and initilaizes it.
  */
  public static void main(String[] args){
    SimpleServer simpleserver = new SimpleServer();
    simpleserver.init();
  }
 
  /**  Sets up a ServerSocket and listens on port 8189.
  */
  public void init(){
    ServerSocket serverSocket = null;
    Socket socket = null;
    
    try{
      
      serverSocket = new ServerSocket(8189);
      System.out.println("Listening at 127.0.0.1 on port 8189");
 
      //wait indefinitely until a client connects to the socket
    } catch (IOException e){
      e.printStackTrace();
    }

    while (true){
      try{
        socket = serverSocket.accept();
      } catch(IOException e){
        System.out.println("I/O error: " + e);
      }

      new MessageHandler(socket).start();
    }
  }

}    
   