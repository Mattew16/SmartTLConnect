//***************************************************************************** 
//
//  Project:      Pantera Negra 
//                Siemens SA, MO ITS
//
//  COPYRIGHT (C) SIEMENS SA 20014-2016 ALL RIGHTS RESERVED CONFIDENTIAL 
//
//***************************************************************************** 


package sample.client;

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

import sample.server.SimpleServer;

/**
 * <p>Title:       Pantera Negra - ExtIFClient.java</p>
 * <p>Description: </p>
 * 
 * <p>Copyright:   (c) 2015</p>
 * <p>Company:     Siemens SA</p>
 * 
 * @author        
 * @created       16.11.2015
 * @version       $Revision$ $Date$
 */
public class ExtIFClient
{
    private SimpleExternalIfSoapClient service;
    private Watchdog watchdog;
    private int controller;
    private int status;
    private static CurrentValueType[] trafficData;
    
    public ExtIFClient() throws ServiceException
    {
        service = new SimpleExternalIfSoapClient("http://localhost:85/ExternalIF");
        // Our client is called "ClientID"  and we will recall not later than in 10 minutes
        watchdog = new Watchdog("ClientID", 10);
        //controller = controllerin-1;
        //status = statusin;
      
        
    }
    
    /**
     * Perform the common header data. Here the content is only printed to standard out
     * @param response
     */
    private void performCommonResponse(HeaderResponse response)
    {
        System.out.println("Last server start: " + response.getLastStart().getTime().toString());
        System.out.println("Error code: " + response.getErrorCode());
        System.out.println("Error text: " + response.getErrorText());
    }
    
    /**
     * Read the content info and put the result to standard out
     * @throws RemoteException 
     */
    public void getContentInfo() throws RemoteException
    {
        System.out.println("\n-------- Get content info example --------\n");
        
        GetContentInfoType ctType = new GetContentInfoType(new NMToken("Login"), "Password", watchdog);
        
        GetContentInfoResponseType response = service.getContentInfo(ctType);
        
        performCommonResponse(response);
        
        GetContentInfoResponseTypeContentInfoListContentInfo[] ctInfo = response.getContentInfoList().getContentInfo();
        if (ctInfo == null)
        {
            System.out.println("No content info");
            return;
        }
        for (int i = 0; i < ctInfo.length; i++)
        {
            GetContentInfoResponseTypeContentInfoListContentInfo info = ctInfo[i];
            System.out.println("------------------------------");
            System.out.println("  Object type name: " + info.getObjectTypeName());
            System.out.println("    Uri:    " + info.getObjectTypeURI());
            System.out.println("    Read:   " + info.isReadable());
            System.out.println("    Write:  " + info.isWriteable());
            System.out.println("    Create: " + info.isCreateable());
            System.out.println("    Delete: " + info.isDeleteable());
            System.out.println("    Updatecycle: " + info.getUpdateCycle());
            if (info.getActivateMaxWatchdog() != null)
                System.out.println("    Activate max watchdog: " + info.getActivateMaxWatchdog());
        }
    }
    
    /**
     * Read the latest TrafficMessage_Incidents
     * @throws RemoteException 
     */
    public int inquireAllIncidents() throws RemoteException
    {
        System.out.println("\n-------- Inquire all example --------\n");

        InquireAllType iqAllType = new InquireAllType(new NMToken("Login"), "Password", watchdog, 
                new NMToken("TrafficMessage_Incidents"), new FilterList(), null);
        
        InquireAllResponseType response = service.inquireAll(iqAllType);
        
        performCommonResponse(response);
        System.out.println("Storetime:  " + response.getStoretime().getTime().toString());
        System.out.println("Last position: " + response.getPosition());
        
        DataListDs[] ds = response.getDataList().getDs();
        if (ds == null)
        {
            System.out.println("Got no data");
            return response.getPosition().intValue();
        }
        for (int i = 0; i < ds.length; i++)
        {
            System.out.println();
            System.out.println("  Object stored at " + ds[i].getTstore().getTime().toString());
            System.out.println("  Object state: " + ds[i].getObjectState().toString());
            System.out.println("  Identifier: " + ds[i].getIdentifier().getIdent().toString());
            
            // the data must be of type Incidents TMType
            TMType message = (TMType) ds[i].getData();
            System.out.println("  Message ID:   " + message.getAdmin().getId());
            System.out.println("  Messgae Name: " + message.getAdmin().getName());
        }
        return response.getPosition().intValue();
    }
    
    /**
     * Put current traffic data to the server
     * @param identifier
     * @param trafficData
     * @throws RemoteException 
     */
    private void put(CurrentValueType[] trafficData) throws RemoteException
    {
        // Build the put list
        PutTypePutListPutds[] putds = new PutTypePutListPutds[trafficData.length];
        for (int i = 0; i < trafficData.length; i++)
        {
            IdentifierType idType = new IdentifierType(null, trafficData[i].getId());
            PutTypePutListPutds putObj = new PutTypePutListPutds(idType, trafficData[i]);
            putds[i] = putObj;
        }
        PutTypePutList putList = new PutTypePutList(putds);
                
        // create the put type with user, password, watch dog, object type an put list
        PutType toPut = new PutType(new NMToken("Login"), "Password", watchdog, 
                new NMToken("TrafficData_detector_currentValue"), putList);
        
        // execute the put
        PutResponseType response = service.put(toPut);

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
    public void putTrafficData() throws RemoteException
    {
        System.out.println("\n-------- Put example --------\n");
        Random generator = new java.util.Random();
        int random;
        // put some traffic data
        String[] ids = { "Controller_001", "Controlelr_002", "Controller_003", "Controller_004", "Controller_005"};
        
        trafficData = new CurrentValueType[ids.length];
        
        for (int i = 0; i < ids.length; i++)
        {
            // build detector value
        	random = generator.nextInt((1000 - 1) + 1);
            TimelineType tl = new TimelineType(Calendar.getInstance(), null);
            ValueType val = new ValueType(VehicleType.all, random, new Integer(25), new Integer(70 + i));
            trafficData[i] = new CurrentValueType(ids[i], tl, new ValueType[] { val }, null, null, -1);
        }
        put(trafficData);
    }
    
    
    /**
     * Read some incidents
     * @param lastPos
     * @return
     * @throws RemoteException 
     */
    public int getIncidents(int lastPos) throws RemoteException 
    {
        System.out.println("\n-------- Get example --------\n");
        
        GetType getType = new GetType(new NMToken("Login"), "Password", watchdog, new NMToken("TrafficMessage_Incidents"), 
                new FilterList(), null, new UnsignedInt(lastPos), null, null);
        
        GetResponseType response = service.get(getType);

        performCommonResponse(response);
        System.out.println("Storetime:  " + response.getStoretime().getTime().toString());
        System.out.println("Last position: " + response.getPosition());
        
        DataListDs[] ds = response.getDataList().getDs();
        if (ds == null)
        {
            System.out.println("Got no data");
            return response.getPosition().intValue();
        }
        for (int i = 0; i < ds.length; i++)
        {
            System.out.println();
            System.out.println("  Object stored at " + ds[i].getTstore().getTime().toString());
            System.out.println("  Object state: " + ds[i].getObjectState().toString());
            System.out.println("  Identifier: " + ds[i].getIdentifier().getIdent().toString());
            
            // the data must be of type Incidents TMType
            TMType message = (TMType) ds[i].getData();
            System.out.println("  Message ID:   " + message.getAdmin().getId());
            System.out.println("  Messgae Name: " + message.getAdmin().getName());
        }
        return response.getPosition().intValue();
    }
    
    public CurrentValueType[] getTrafficData(){
    	return trafficData;
    }
    
    
    public static void main(String[] args)
    {
        BasicConfigurator.configure();      // configure log4j
        Logger.getRootLogger().setLevel(Level.ERROR);
        
        while(true){
        try
        {
        	
            // Create client for external IF
            ExtIFClient client = new ExtIFClient();
            
            // read the available data types
            client.getContentInfo();
            
            // read latest incident messages, remember highest position; the position is managed for 
            // every data type
            int lastIncidentPos = client.inquireAllIncidents();
            
            // now put some data
            client.putTrafficData();
            
           // System.out.println("\n\n\n\n\n\n\n\n\nDEBUG - STARTING SIMPLE SERVER\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            //SimpleServer simpleserver = new SimpleServer();
            //trafficData = simpleserver.init(trafficData);
            
            // now get new incidents for some time
            for (int i = 0; i < 50000; i++)
            {
            	System.out.println(" DEBUG - INSIDE FOR IN CLIENT");
                Thread.sleep(5000);        // wait a minute (5 sec)
                client.getContentInfo();
                client.putTrafficData();
                lastIncidentPos = client.getIncidents(lastIncidentPos);
                // here you should handle detection of the server start by checking
                // the last server start in the response. If the last server start date 
                // has changed initialise the position (here: lastIncidentPos) with
                // the position of a inquireAll
                
               
            }
         }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        }
    }
}
