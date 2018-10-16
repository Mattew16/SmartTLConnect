package sample.server;

import java.io.*;
import java.net.*;
import java.util.concurrent.TimeUnit;

public class MessageSender extends Thread{
	protected int id;
	protected String serverurl = null;
	protected int serverport;
	private int control = 10;


	public MessageSender (int givenid, int port, String url){
		this.id = givenid;
		this.serverurl = url;
		this.serverport = port;
	}

	public void run(){
		Socket socket = null;
		int both;
		int messageNumber = 100;
		try{
			System.out.println("Connecting to " + serverurl + " on port " + serverport);
			socket = new Socket(serverurl, serverport);
			socket.setSoTimeout(10000);
			System.out.println("Connected");

			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			both = id*1000 + control*100;
			while(control == 10){
				System.out.println("Message Sent: " + both);
				
				out.println(both);
				messageNumber++;
				both++;
				if (control == 11){
					break;
				}
				TimeUnit.SECONDS.sleep(30);	
			}
			System.out.println("Closing connection.");
			socket.close();

		}catch(UnknownHostException unhe){
      		System.out.println("UnknownHostException: " + unhe.getMessage());
    	}catch(InterruptedIOException intioe){
      		System.out.println("Timeout while attempting to establish socket connection.");
    	}catch(IOException ioe){
      		System.out.println("IOException: " + ioe.getMessage());
    	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
      		try{
        		socket.close();
      		}catch(IOException ioe){
       			 System.out.println("IOException: " + ioe.getMessage());
      		}
		}
	}

	public void quit(){
		this.control = 11;
	}
}