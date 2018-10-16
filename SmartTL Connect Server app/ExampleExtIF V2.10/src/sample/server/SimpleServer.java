//***************************************************************************** 
//
//  Project:      SITRAFFIC smartTL Connect 
//                Siemens SA, RC-PT MO MM ITS
//
//  COPYRIGHT (C) SIEMENS AG 2000-2008 ALL RIGHTS RESERVED CONFIDENTIAL 
//
//***************************************************************************** 
//
//  Module name:    SimpleServer.java
//  Author:    Pedro Silva
//***************************************************************************** 


package sample.server;

import java.io.*;
import java.net.*;
import java.util.*;


/**
 * <p>Title:       SITRAFFIC smartTL Connect - SimpleServer.java</p>
 * <p>Description: Handles communications and information.</p>
 * 
 * <p>Copyright:   (c) 2015</p>
 * <p>Company:     Siemens SA</p>
 * 
 * @author        Pedro Silva
 * @created       01.04.2016
 * @version       $Revision$ $Date$
 */


/**  When started allows multiple connections. It listens on port 8189.
*  Receives a set number of connections before sending the data on to the 
*  main converter application.
*  It shuts down after a specific number of requests.
*  Verifies user if there are any user made changes and a message to the MCR
*/
public class SimpleServer{
	
	//Temporary store with the id of the controller that sent a message.
	public int controller = -99; // Maximum = 999.

	// Stores the status received and if the information we provide to the main converter software.
	public int[] status = {0}; //0 is disconnected, 1 is normal mode, 2 is offline mode, 3 is amber flashing mode.
	public int count;
	
	//Method to split the received messages into data and process it.
	public void splitString(String input){
		//Commands to compare to the received.
		String command1 = "COR";
		String command2 = "OFF";
		String command3 = "INT";

		//command received
		String command = null;
		
		//id of the intersection
		String intersectionNum = null;
		
		if(input.length() == 4){
			command = Character.toString(input.charAt(1)) + Character.toString(input.charAt(2)) + Character.toString(input.charAt(3));
			intersectionNum = Character.toString(input.charAt(0));	
		}
		if(input.length() == 5){
			command = Character.toString(input.charAt(2)) + Character.toString(input.charAt(3)) + Character.toString(input.charAt(4));
			intersectionNum = Character.toString(input.charAt(0)) +Character.toString(input.charAt(1));	
		}
		if(input.length() == 6){
			command = Character.toString(input.charAt(3)) + Character.toString(input.charAt(4)) + Character.toString(input.charAt(5));
			intersectionNum = Character.toString(input.charAt(0)) + Character.toString(input.charAt(1)) +Character.toString(input.charAt(2));	
		}
		if(input.length() == 3){
			command = Character.toString(input.charAt(0)) + Character.toString(input.charAt(1)) + Character.toString(input.charAt(2));
			intersectionNum = "0";	
		}
		
		
		if (Objects.equals(command1, command)) {
			controller = Integer.parseInt(intersectionNum);
			status[controller] = 1;
		}
		if(Objects.equals(command2, command)){
			controller = Integer.parseInt(intersectionNum);
			status[controller] = 2;
		}
		if(Objects.equals(command3, command)){
			controller = Integer.parseInt(intersectionNum);
			status[controller] = 3;
		}		
	}

	/**  Instantiates an instance of the SimpleServer class and initilaizes it.
	/**  Sets up a ServerSocket and listens on port 8189.
	* @throws IOException 
	*/
	@SuppressWarnings({ "null" })
	public int[] init(int[] statusInput, int[] statusUserChange) throws IOException{
	    //Variable initialization.
	    String[] messages= {"NCP", "COR", "OFF", "INT"};
	    ServerSocket serverSocket = null;
	    Socket socket = null;
	    int connections = statusInput.length * 3;
	    int y = 0;
	    status = new int[statusInput.length];
	    for(int i1 = 0; i1 < status.length; i1++ ){
	    	status[i1] = 8;
		}

	    int t = 3; //Time to wait for input
		BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
		long startTime = System.currentTimeMillis();
		System.out.println("Send general command? 1 for COR, 2 for INT, 3 for OFF\n");
		while ((System.currentTimeMillis() - startTime) < t * 1000 && !in2.ready()) {
		}

		if (in2.ready()) {
			String temp = in2.readLine();
			if(temp.equals("1")){
				y = 1;
				System.out.println("Sending COR.\n");
			}
			if(temp.equals("2")){
				y = 2;
				System.out.println("Sending INT.\n");
			}
			if(temp.equals("3")){
				y = 3;
				System.out.println("Sending OFF.\n");
			}
		}else{
			System.out.println("Sending no message\n");
		}

		try{

		//Opens the socket and starts listening for incoming communications. (Timeout = 5 sec.)
		serverSocket = new ServerSocket(8189);
		serverSocket.setSoTimeout(5000);
		System.out.println("\nListening at 127.0.0.1 on port 8189 - Waiting for MCR...\n");
	      
	      
	    } catch (IOException e){
	     
	      
	    }
	    
	   
	    // This cycle runs after the socket is opened. Tried to make a set number (20) of
	    // connections.
	    for (int connectionsCycle = 0; connectionsCycle<connections; connectionsCycle++){
			try{
				//waits for a connection to be opened. (Timeout = 5 sec.)
				socket = serverSocket.accept();
				socket.setSoTimeout(5000);
			}catch(IOException e){
				try{
					serverSocket.close();
					continue;
				}catch(IOException e2){
					e.printStackTrace();	
				}
			}
			//Initialization of the I/O streams.
			InputStream inp = null;
			BufferedReader in = null;
			PrintWriter out = null;
			try{
				inp = socket.getInputStream();
				in = new BufferedReader(new InputStreamReader(inp));
				out = new PrintWriter(socket.getOutputStream(), true);	
			}catch (IOException e){
				out.flush();
				out.close();
				socket.close();
				serverSocket.close();
				return status;
			}
			//Sending the global message if the user has given an input. 
			if(y == 1){
				out.printf("COR");	
			}
			if(y == 2){
				out.printf("INT");
			}
			if(y == 3){
				out.printf("OFF");
			}
			String line;
			try{
				//Message received from the MCR board.
				line = in.readLine();

				if ((line == null) || line.equalsIgnoreCase("QUIT")) {
				socket.close();
				out.flush();
				out.close();
				}else {
					splitString(line);
					if ((controller<statusUserChange.length) && (statusUserChange[controller] == 1) && (statusInput[controller] != 8)){
						out.printf(messages[statusInput[controller]]);
						System.out.printf("Message Sent: " + messages[statusInput[controller]] + "\n");
					}
					if (controller == -99){
						System.out.println("Message received: " + line);
						System.out.println("No traffic data.\n");

						out.flush();
						out.close();
						socket.close();
					}else if(status[controller] == statusInput[controller]){
						System.out.println("Message received: " + line);
						System.out.println("Status is the same\n");
						out.flush();
						out.close();
						socket.close();
					}else{
						System.out.println("Message Received:" + line);
						System.out.println("Intersection Status Set.\n");
						out.flush();
						out.close();
						socket.close();
					}
				}
			}catch (IOException e) {
				e.printStackTrace();
				out.flush();
				out.close();
			}
			socket.close();
		}
		serverSocket.close();
		return status;
	}

}    
