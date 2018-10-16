package sample.server;

/*  SimpleServer.java
*  @author 
*  @version 
*  
*/
 
import java.io.*;
import java.net.*;
import java.util.*;

import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;

import org.apache.axis.types.NMToken;
import org.apache.axis.types.UnsignedInt;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.siemens.sitraffic.external.soap.SimpleExternalIfSoapClient;
import com.siemens.sitraffic.external.soap.protocol.DataListDs;
import com.siemens.sitraffic.external.soap.protocol.FilterList;
import com.siemens.sitraffic.external.soap.protocol.GetContentInfoResponseType;
import com.siemens.sitraffic.external.soap.protocol.GetContentInfoResponseTypeContentInfoListContentInfo;
import com.siemens.sitraffic.external.soap.protocol.GetContentInfoType;
import com.siemens.sitraffic.external.soap.protocol.GetResponseType;
import com.siemens.sitraffic.external.soap.protocol.GetType;
import com.siemens.sitraffic.external.soap.protocol.HeaderResponse;
import com.siemens.sitraffic.external.soap.protocol.IdentifierType;
import com.siemens.sitraffic.external.soap.protocol.InquireAllResponseType;
import com.siemens.sitraffic.external.soap.protocol.InquireAllType;
import com.siemens.sitraffic.external.soap.protocol.PutResponseType;
import com.siemens.sitraffic.external.soap.protocol.PutResponseTypeBadList;
import com.siemens.sitraffic.external.soap.protocol.PutResponseTypeBadListBadds;
import com.siemens.sitraffic.external.soap.protocol.PutType;
import com.siemens.sitraffic.external.soap.protocol.PutTypePutList;
import com.siemens.sitraffic.external.soap.protocol.PutTypePutListPutds;
import com.siemens.sitraffic.external.soap.protocol.Watchdog;
import com.siemens.sitraffic.external.trafficdata.CurrentValueType;
import com.siemens.sitraffic.external.trafficdata.TimelineType;
import com.siemens.sitraffic.external.trafficdata.ValueType;
import com.siemens.sitraffic.external.trafficdata.VehicleType;
import com.siemens.sitraffic.external.trafficmessages.TMType;
import sample.client.ExtIFClient;


/**  When started allows one client to connect. It listens on port 8189.
*  It returns whatever a connected client sends.
*  It shuts down when the client sends a Bye line.
*
*/
public class SimpleServer{
	CurrentValueType trafficData;
	public int controller = -99; // 3 digit controller number Ex."001"
	public int status = 9; //1 is normal mode, 2 is blinking mode, 9 is offline/no connection
	public int count;
	//Method to process the messages received.
	public void splitString(String input){
		//int i = Integer.parseInt(input);
		String command1 = "COR";
		String command2 = "INT";
		String command3 = "OFF";
		//System.out.println ("." + input + ".");

		//System.out.println("Inside splitString:" + i);
		if (Objects.equals(command1, input)) {
			controller = 1;
			status = 1;
		}
		if(Objects.equals(command2, input)){
			controller = 1;
			status = 3;
		}
		if(Objects.equals(command3, input)){
			controller = 1;
			status = 8;
		}
		
			
	}
/**  Instantiates an instance of the SimpleServer class and initilaizes it.
  */
  //public static void main(String[] args){
    //SimpleServer simpleserver = new SimpleServer();
    //simpleserver.init();
  //}
 
  /**  Sets up a ServerSocket and listens on port 8189.
 * @throws IOException 
  */
  @SuppressWarnings({ "resource", "null" })
public int init(int statusInput, int countInput) throws IOException{
    ServerSocket serverSocket = null;
    Socket socket = null;
    Boolean keepReading = true;
    Random generator = new java.util.Random();
    int random;
    
    try{
      
      serverSocket = new ServerSocket(8189);
      serverSocket.setSoTimeout(30000);
      
      System.out.println("\nListening at 127.0.0.1 on port 8189 - Waiting for MCR\n");
      
      
      //wait indefinitely until a client connects to the socket
    } catch (IOException e){
     
      
    }
    
   
    
    while (keepReading){
      try{
        socket = serverSocket.accept();
        socket.setSoTimeout(30000);
      } catch(IOException e){
        System.out.println("I/O error: No Connection. Retrying...\n"); // + e
        //trafficData = null;
        //status = 9;
        try{
        	serverSocket.close();
        } catch(IOException e2){
        	 e.printStackTrace();	
        }
        return status;
      }
      InputStream inp = null;
		BufferedReader in = null;
		PrintWriter out = null;
		try{
			inp = socket.getInputStream();
			in = new BufferedReader(new InputStreamReader(inp));
			out = new PrintWriter(socket.getOutputStream(), true);	
		} catch (IOException e){
			out.flush();
			out.close();
			socket.close();
			serverSocket.close();
			return status;
		}
				String[] messages= {"COR", "INT", "OFF"}; 
				if (countInput == 1){
					out.printf(messages[statusInput]);
					System.out.printf("Message Sent: " + messages[statusInput] + "\n");
				}		
				//String[] messages = {"INT"};
				//random = generator.nextInt((100 - 1) + 1);
				//out.printf(messages[0]);
				//out.printf(messages[countInput]);
				//out.printf(messages[random]);

				//line = "Message Sent";
				//keepReading = false;
				
				//socket.close();
				//serverSocket.close();
				

		String line;
		while (keepReading) {
			try{
				line = in.readLine();

				if ((line == null) || line.equalsIgnoreCase("QUIT")) {
					socket.close();
					out.flush();
					out.close();
					serverSocket.close();
					return status;
					//keepReading = false;
					//return trafficData ;
				} else {
					splitString(line);
					if (controller == -99){
						System.out.println("Message received: " + line);
						System.out.println("No traffic data.\n");
						//out.println(line + "\n\r");
						out.flush();
						out.close();
						socket.close();
						serverSocket.close();
						return status;
					}else if(status == statusInput){
						System.out.println("Message received: " + line);
						System.out.println("Status is the same\n");
						//out.println(line + "\n\r");
						out.flush();
						out.close();
						socket.close();
						serverSocket.close();
						return status;
					}else{


					System.out.println("Message Received:" + line);
					System.out.println("Intersection Status Set.\n");
			        /*try
			        {
			        	 ExtIFClient client = new ExtIFClient(controller, status);
			             
			             // read the available data types
			             client.getContentInfo();
			             
			             // read latest incident messages, remember highest position; the position is managed for 
			             // every data type
			             int lastIncidentPos = client.inquireAllIncidents();
			             
			             // now put some data
			             client.putTrafficData();
			            
			         }
			        catch (Exception e)
			        {
			            e.printStackTrace();
			        }*/

					out.flush();
					out.close();
					keepReading = false;
				}
				/*if (!keepReading){
					out.flush();
					socket.close();
					serverSocket.close();

				}*/
				

				}
			} catch (IOException e) {
				e.printStackTrace();
				out.flush();
				out.close();
				serverSocket.close();
				//socket.close();
				return status;
			}
		}
		/*if (!keepReading){
				out.flush();
				socket.close();
				serverSocket.close(); 

		}*/

     // new MessageHandler(socket).start();
    }
    //out.flush();
    socket.close();
    serverSocket.close();
	return status;
  }

}    
   