//***************************************************************************** 
//
//  Project:      SITRAFFIC smartTL Connect 
//                Siemens SA, RC-PT MO MM ITS
//
//  COPYRIGHT (C) SIEMENS AG 2000-2008 ALL RIGHTS RESERVED CONFIDENTIAL 
//
//***************************************************************************** 
//
//  Module name:  readme.txt
//  Author:  Pedro Silva
//*****************************************************************************

1. SmartTL Connect Main Server Instructions and Requirements.
	
	1.1 - Requirements:
			- Enabled to run on the most used Operative Systems.
			- This application needs a machine with java v1.8.0_92 or later. 
			- A port configured on the Input Server (default is 8189) needs to be open.

	1.2 - How to start the server (in Linux):
			1 - Run the file transfer to the server. 
			2 - Copy the latest version of the .jar package into the default server folder (root).
			3 - Run the SSH connection to the server.
			4 - Run the "screen" command.
			5 - Run the "java -jar ConverterServerApplication*.**.jar 2>> log.txt" command, replacing the *.** for the correct version of the software.
			6 - Input the number of controllers to monitor (default is 5).
			7 - To exit the server hold CTRL + A + D. The message "detached" should appear.
			8 - The window can now be closed. 

	1.3 - How to resume the server (in linux):
			1 - Run the SSH connection to the server.
			2 - Run the "screen -r" command to resume the session.
			
	1.4 - Errors:
			1 - The file "log.txt" will keep a log of all errors that occur during runtime.
			2 - If all of the intersections appear "unknown" in smartGuard interface, the server might be offline. 
			3 - After resuming the server if the only message appearing is "Put without data" the server needs to be restarted. Before restarting the server, save the "log.txt" file and send it to the server admin.
			4 - If a problems persists, contact the admin.
			
			

