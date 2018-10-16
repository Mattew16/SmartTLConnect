Considering the current system in place, smartGuard, along with its features that use the communication protocol OCPI-2 and allow a high level of controller over Siemens controllers, we set on to provide a way to include older and generic controllers with a lower but comparable control features.

An electrical board was developed, named Pantera Negra, that is able to gather some simple information from the controller's wire circuits send it over to smartGuard and receive an answer in case the user wants to change the status of the controller. 
The board is connected to a GSM modem (MC55i) by RS232 serial communication. This modem is connected to an APN network, which is used to send the information to a server side application of the OCPI-2 communication protocol






---------------------------------------------------------------------
Starting from the controller side we have a board that is intercepting electric signals from the contacts. This board is connected to a MC55i modem by a serial RS232 cable, this modem uses an APN network to reach the translator server. The server stores the status of the intersection in real time and waits for requests from a client application, that is used by smartGuard in order to get the necessary information about the controller the user requests  