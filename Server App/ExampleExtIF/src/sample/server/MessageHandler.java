//***************************************************************************** 
//
//  Project:      Pantera Negra 
//                Siemens SA, MO ITS
//
//  COPYRIGHT (C) SIEMENS SA 2014-2016 ALL RIGHTS RESERVED CONFIDENTIAL 
//
//***************************************************************************** 

package sample.server;


import java.io.*;
import java.net.*;

import javax.xml.rpc.ServiceException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import sample.client.ExtIFClient;

/**
* 
* <p>Title: Pantera Negra - MessageHandler.java</p>
* <p>Description: Application called </p>
*
*<p>Copyright: (c)2015</p>
* <p>Company: Siemens SA</p>
*
* @author Pedro Silva
* @created 07.12.2015
* @version $Recision$ $Date$
*/
public class MessageHandler extends Thread {
	
	protected Socket socket;
	private static int controller = 0;
	private static int status = 0;
	


	public void splitString(String input){
		int i = Integer.parseInt(input);
		System.out.println("Inside splitString:" + i);
		controller = i/1000;
		status = (i - controller * 1000);
			
	}

	public int getController(){
		return controller;
	}

	public int getStatus(){
		return status;
	}
	
	public MessageHandler (Socket clientSocket){
		this.socket = clientSocket;		
	}

	public void run (){
		InputStream inp = null;
		BufferedReader in = null;
		PrintWriter out = null;
		
		try{
			inp = socket.getInputStream();
			in = new BufferedReader(new InputStreamReader(inp));
			out = new PrintWriter(socket.getOutputStream(), true);	
		} catch (IOException e){
			return;
		}

		String line;
		while (true) {
			try{
				line = in.readLine();
				if ((line == null) || line.equalsIgnoreCase("QUIT")) {
					socket.close();
					return;
				} else {
					//splitString(line);
					System.out.println(line);
					BasicConfigurator.configure();      // configure log4j
			        Logger.getRootLogger().setLevel(Level.ERROR);
			        
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
					out.println(line + "\n\r");
					out.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}
	}

	
}