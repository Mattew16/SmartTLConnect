import java.io.* ;
import java.util.* ;
import javax.comm.* ;

/* http://stackoverflow.com/questions/336714/reading-serial-port-in-java */

public class SimpleRead implements Runnable, SerialPortEventLisntener {
	static CommPortIdentifier portId;
	static Enumeration portList;

InputStream inputStream;
SerialPort serialPort;
Thread readThread;
byte[] readBuffer;

public static void main(String[] args){
	portList = CommPortIdentifier.getPortIdentifiers();
	System.out.println("portList..." + portList);
	while (portList.hasMoreElements()) {
		portId = (CommPortIdentifier) portList.nextElement();
		if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
			System.out.println("port idendified is Serial.." + portId.getPortType());
			if (portId.getName().equals("COM2")){
				System.out.println("port identified is COM2.." + portID.getName());
				SimpleRead reader = new SimpleRead();	
			} else {
				System.out.println("unable to open port");
			}
		}
	}
}

public SimpleRead() {
	try{
		System.out.println("In SimpleRead() constructor");
		serialPort = (SerialPort) portIdopen("SimpleReadApp1", 500);
		System.out.println(" Serial Port.." + serialPort);
	} catch(PortInUseException e) {
		System.out.println("Port in use Exception");
	}
	try {
		inputStream = serialPort.getInputStream();
		System.out.println("Input Stream..." + inputStream);
	} catch (IOException e) {
		System.out.println("IO Exception");
	}
	try {
		serialPort.addEventListener(this);
	} catch(TooManyListenersException e) {
		System.out.println("Too many Listeneres Exception");
	}
	serialPort.notifyOnDataAvailable(true);
	try{
		serialPort.serSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);

		//No handshaking or other flow control
		serialPort.setFlowControlMode(SerialPort.FLOWCONTROL_NONE);

		//timer on any read of the serial port
		serialPort.enableReceiveTimeout(500);

		System.out.println(".........");
	} catch (UnsupportedCommOperationException e) {
		System.out.println("Unsupported Comm Operation");
	}
	readThread = new Thread(this);
	readThread.start();
}

public void run() {
	try{
		System.out.println("In run() function");
		Thread.sleep(500);
	} catch (InterruptedException e) {
		System.out.println("Interrupted Exception in run() method");
	}
}

public void serialEvent(SerialPortEvent event) {

	switch (event.getEventType()) {
		case SerialPortEvent.DATA_AVAILABLE:
			readBuffer = new byte[8];
			try{
				while (inputStream.available()>0) {
					int numBytes = inputStream.read(readBuffer);
				}
				System.out.print(new String(readBuffer));
			} catch (IOException e) {
				System.out.println("IO Exception in SerialEvent");
			}
			break;
	}
}

}