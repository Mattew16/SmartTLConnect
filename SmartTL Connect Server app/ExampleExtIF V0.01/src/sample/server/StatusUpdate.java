//***************************************************************************** 
//
//  Project:      Pantera Negra 
//                Siemens SA, MO ITS
//
//  COPYRIGHT (C) SIEMENS SA 20014-2016 ALL RIGHTS RESERVED CONFIDENTIAL 
//
//***************************************************************************** 


package sample.server;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Random;

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

/**
 * <p>Title:       Pantera Negra - StatusUpdate.java</p>
 * <p>Description: </p>
 * 
 * <p>Copyright:   (c) 2015</p>
 * <p>Company:     Siemens SA</p>
 * 
 * @author        
 * @created       16.11.2015
 * @version       $Revision$ $Date$
 */

public class StatusUpdate extends Thread{
	private static SimpleExternalIfSoapClient service;
	private static Watchdog watchdog;
	private static int controller = 0;
	private static int status = 0;

	public StatusUpdate(int input1, int input2) throws ServiceException{
		service = new SimpleExternalIfSoapClient("http://localhost:85/ExternalIF");
		//The client is called ClientID and will recall before 5 min.
		watchdog = new Watchdog("ClientID", 5);
		controller = input1;
		status = input2;
	}

	/**
     * Perform the common header data. Here the content is only printed to standard out
     * @param response
     */
    private static void performCommonResponse(HeaderResponse response)
    {
        System.out.println("Last server start: " + response.getLastStart().getTime().toString());
        System.out.println("Error code: " + response.getErrorCode());
        System.out.println("Error text: " + response.getErrorText());
    }

	/**
	*
	* Put the data on the server
	* @param identifier
	* @param
	*/
	public static void put(CurrentValueType[] trafficData) throws RemoteException{
		//Build the list of information to be sent
		PutTypePutListPutds[] putds = new PutTypePutListPutds[trafficData.length];

		for (int i = 0; i < trafficData.length; i++){
			IdentifierType idType = new IdentifierType(null, trafficData[i].getId());
			PutTypePutListPutds putObj = new PutTypePutListPutds(idType, trafficData[i]);
			putds[i] = putObj;
		}

		PutTypePutList putList = new PutTypePutList(putds);

		//Create the put type with user, password, watchdog, object type and put list.
		PutType toPut = new PutType(new NMToken("Login"), "Password", watchdog, new NMToken("TrafficData_detector_currentValue"), putList);

		//execute the  put

		PutResponseType response = service.put(toPut);

		//Need to check if this is needed, or can skip.
		performCommonResponse(response);

		PutResponseTypeBadList badList = response.getBadList();
		PutResponseTypeBadListBadds[] badds = badList != null ? badList.getBadds() : null;
        for (int i = 0; i < (badds != null ? badds.length : 0); i++)
        {
            String ident = badds[i].getIdentifier().getIdent().toString();
            System.out.println("Bad object \"" + ident + "\", error " + badds[i].getErrorCode().getValue() +
                    ": " + badds[i].getErrorText());
        }

	}

	/**
     * Put some example traffic data
     * @throws RemoteException
     */
    public static void putControllerData(int controller, int status) throws RemoteException{

        System.out.println("\n-------- Put example --------\n");
        
        
        // put some traffic data
        String[] ids = { "Controller_001", "Controlelr_002", "Controller_003", "Controller_004", "Controlelr_005"};
        CurrentValueType[] trafficData = new CurrentValueType[ids.length];
        
       	// build detector value	
        TimelineType tl = new TimelineType(Calendar.getInstance(), null);
        ValueType val = new ValueType(VehicleType.all, status, new Integer(25), new Integer(70));
        trafficData[controller] = new CurrentValueType(ids[controller], tl, new ValueType[] { val }, null, null, -1);
        
        put(trafficData);
    }

    public void run(){
    	BasicConfigurator.configure();
    	Logger.getRootLogger().setLevel(Level.ERROR);

    	try{
    		putControllerData(controller, status);
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    }	

}