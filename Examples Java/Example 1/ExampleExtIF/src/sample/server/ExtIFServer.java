//***************************************************************************** 
//
//  Projekt:      SITRAFFIC Concert 
//                Siemens AG, I MO TS
//
//  COPYRIGHT (C) SIEMENS AG 2000-2008 ALL RIGHTS RESERVED CONFIDENTIAL 
//
//***************************************************************************** 
//Weitergabe sowie Vervielfaeltigung dieser Daten, Verwertung und Mitteilung 
//ihres Inhalts nicht gestattet, soweit nicht ausdruecklich zugestanden. 
//Zuwiderhandlung verpflichtet zu Schadenersatz. Alle Rechte vorbehalten, ins- 
//besondere fuer den Fall der Patenterteilung oder GM-Eintragung der technischen 
//Inhaltsteile. 
//***************************************************************************** 
//
//  Modulname:    ExtIFServer.java
//  Verfasser:    Thomas Gerner
//***************************************************************************** 

package sample.server;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.namespace.QName;

import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.types.NMToken;
import org.apache.axis.types.URI;
import org.apache.axis.types.UnsignedInt;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.siemens.sitraffic.external.ObjectChangeValueEvent;
import com.siemens.sitraffic.external.ObjectCreateValueEvent;
import com.siemens.sitraffic.external.ObjectDeleteEvent;
import com.siemens.sitraffic.external.ObjectEvent;
import com.siemens.sitraffic.external.ObjectEventBuffer;
import com.siemens.sitraffic.external.ObjectIdentifier;
import com.siemens.sitraffic.external.ObjectInitValueEvent;
import com.siemens.sitraffic.external.ObjectValueEvent;
import com.siemens.sitraffic.external.soap.ExternalIf;
import com.siemens.sitraffic.external.soap.SimpleExternalIfSoapServer;
import com.siemens.sitraffic.external.soap.protocol.DataList;
import com.siemens.sitraffic.external.soap.protocol.DataListDs;
import com.siemens.sitraffic.external.soap.protocol.DeleteResponseType;
import com.siemens.sitraffic.external.soap.protocol.DeleteType;
import com.siemens.sitraffic.external.soap.protocol.ErrorCode;
import com.siemens.sitraffic.external.soap.protocol.GetContentInfoResponseType;
import com.siemens.sitraffic.external.soap.protocol.GetContentInfoResponseTypeContentInfoList;
import com.siemens.sitraffic.external.soap.protocol.GetContentInfoResponseTypeContentInfoListContentInfo;
import com.siemens.sitraffic.external.soap.protocol.GetContentInfoType;
import com.siemens.sitraffic.external.soap.protocol.GetResponseType;
import com.siemens.sitraffic.external.soap.protocol.GetType;
import com.siemens.sitraffic.external.soap.protocol.HeaderRequest;
import com.siemens.sitraffic.external.soap.protocol.IdentifierType;
import com.siemens.sitraffic.external.soap.protocol.InquireAllResponseType;
import com.siemens.sitraffic.external.soap.protocol.InquireAllType;
import com.siemens.sitraffic.external.soap.protocol.ObjectState;
import com.siemens.sitraffic.external.soap.protocol.PutResponseType;
import com.siemens.sitraffic.external.soap.protocol.PutResponseTypeBadList;
import com.siemens.sitraffic.external.soap.protocol.PutType;
import com.siemens.sitraffic.external.soap.protocol.PutTypePutListPutds;
import com.siemens.sitraffic.external.soap.protocol.Wait4GetsResponseType;
import com.siemens.sitraffic.external.soap.protocol.Wait4GetsType;
import com.siemens.sitraffic.external.trafficdata.CurrentValueType;
import com.siemens.sitraffic.external.trafficdata.DetectorType_Helper;
import com.siemens.sitraffic.external.trafficdata.TimelineType;
import com.siemens.sitraffic.external.trafficdata.ValueType;
import com.siemens.sitraffic.external.trafficdata.VehicleType;

/**
 * <p>Title:       SITRAFFIC Concert - ExtIFServer.java</p>
 * <p>Description: </p>
 * 
 * <p>Copyright:   (c) 2008</p>
 * <p>Company:     Siemens AG</p>
 * 
 * @author        Thomas Gerner
 * @created       10.11.2008
 * @version       $Revision$ $Date$
 */
public class ExtIFServer implements ExternalIf
{
    private Calendar startTime;
    
    private ObjectEventBuffer<CurrentValueType> detectorBuffer;
    
    public ExtIFServer()
    {
        startTime = Calendar.getInstance();
        
        detectorBuffer = new ObjectEventBuffer<CurrentValueType>(0L, 3600000L, false);
        
        // fill some sample data; usually the event buffer is updated during runtime 
        // if the content of an object changes
        String ids[] = { "Detector_01", "Detector_02", "Detector_03" };
        
        for (int i = 0; i < ids.length; i++)
        {
            TimelineType tl = new TimelineType(Calendar.getInstance(), null);
            ValueType val = new ValueType(VehicleType.all, 100 + 10 * i, new Integer(25), new Integer(70 + i));
            CurrentValueType trafficData = new CurrentValueType(ids[i], tl, new ValueType[] { val }, null, null, 0);

            ObjectIdentifier objIdent = new ObjectIdentifier(ids[i], "", Collections.<String> emptySet());
            detectorBuffer.writeObject(objIdent, trafficData, false);
        }
    }
    
    /* (non-Javadoc)
     * @see com.siemens.sitraffic.external.soap.ExternalIf#delete(com.siemens.sitraffic.external.soap.protocol.DeleteType)
     */
    public DeleteResponseType delete(DeleteType delete) throws RemoteException
    {
        // not implemented
        throw new UnsupportedOperationException("Method delete is not supported by this server");
    }

    /* (non-Javadoc)
     * @see com.siemens.sitraffic.external.soap.ExternalIf#get(com.siemens.sitraffic.external.soap.protocol.GetType)
     */
    public GetResponseType get(GetType get) throws RemoteException
    {
        // build default positive empty response
        GetResponseType response = new GetResponseType();
        response.setErrorCode(ErrorCode.value1);
        response.setErrorText("");
        response.setLastStart(startTime);
        response.setDataList(new DataList());
        response.setStoretime(Calendar.getInstance());
        response.setPosition(new UnsignedInt(0));
        
        // check user access
        if (checkAccess(get) == false)
        {
            // return error
            response.setErrorCode(ErrorCode.value2);
            response.setErrorText("Wrong user or password");
            return response;
        }
        // check if we can offer the requested type
        if (!get.getObjectType().toString().equals("TrafficData_detector_currentValue"))
        {
            // return error
            response.setErrorCode(ErrorCode.value2);
            response.setErrorText("Illegal object type access");
            return response;
        }
        // here we do not care about the filter. the filter should be used to select the objects
        // we only deliver some sample data
        
        // the position select values which are newer than the values with that position
        int position = get.getPosition().intValue();      
        Map<ObjectEvent<CurrentValueType>,ObjectIdentifier> eventHistory  = detectorBuffer.getEventHistoryFrom(position);
  
        long lastPosition = position;
        Calendar lastTimestamp = Calendar.getInstance();
        lastTimestamp.setTimeInMillis(0);
        List<DataListDs> dsList = new LinkedList<DataListDs>();
        for (Entry<ObjectEvent<CurrentValueType>, ObjectIdentifier> eventHistoryEntry : eventHistory.entrySet())
        {
          ObjectEvent<CurrentValueType> event = eventHistoryEntry.getKey();
          ObjectIdentifier objIdentifier = eventHistoryEntry.getValue();
          
          // check filter (if some is used) and select only filtered objects; if no filter is used all objects are selected
          DataListDs ds = new DataListDs();
          IdentifierType identifier = new IdentifierType();
          identifier.setIdent(objIdentifier.getName());
          identifier.setSource(objIdentifier.getSource());
          ds.setIdentifier(identifier);

          long timestampMillis = event.getTimestamp();
          Calendar storeTime = Calendar.getInstance();
          storeTime.setTimeInMillis(timestampMillis);
          ds.setTstore(storeTime);

          Object data = null;
          ObjectState state = null;
          if (event instanceof ObjectInitValueEvent<?>)
          {
            ObjectInitValueEvent<?> initEvent = (ObjectInitValueEvent<?>)event;
            data = initEvent.getData();
            state = ObjectState.value1;
          }
          else if (event instanceof ObjectCreateValueEvent<?>)
          {
            ObjectCreateValueEvent<?> initEvent = (ObjectCreateValueEvent<?>)event;
            data = initEvent.getData();
            state = ObjectState.value1;
          }
          else if (event instanceof ObjectChangeValueEvent<?>)
          {
            ObjectChangeValueEvent<?> changeEvent = (ObjectChangeValueEvent<?>)event;
            data = changeEvent.getData();
            state = ObjectState.value2;
          }
          else if (event instanceof ObjectDeleteEvent<?>)
          {
            data = "";        // must not be null!!!!!
            state = ObjectState.value3;
          }

          ds.setObjectState(state);
          ds.setData(data);

          dsList.add(ds);

          // remember last times stamp and last position
          if (timestampMillis > lastTimestamp.getTimeInMillis())
          {
            lastTimestamp.setTimeInMillis(timestampMillis);
          }

          long eventPosition = event.getPosition();
          if (eventPosition > lastPosition)
          {
            lastPosition = eventPosition;
          }
        }

        // return success
        response.setDataList(new DataList(dsList.toArray(new DataListDs[dsList.size()])));
        response.setStoretime(lastTimestamp);
        response.setPosition(new UnsignedInt(lastPosition));
        
        return response;
    }

    /* (non-Javadoc)
     * @see com.siemens.sitraffic.external.soap.ExternalIf#getContentInfo(com.siemens.sitraffic.external.soap.protocol.GetContentInfoType)
     */
    public GetContentInfoResponseType getContentInfo(GetContentInfoType getContentInfo) throws RemoteException
    {
        GetContentInfoResponseType response = new GetContentInfoResponseType();
        response.setContentInfoList(new GetContentInfoResponseTypeContentInfoList());
        response.setLastStart(startTime);
        // assume no error
        response.setErrorCode(ErrorCode.value1);
        response.setErrorText("");
        
        // check user access
        if (checkAccess(getContentInfo) == false)
        {
            // return error
            response.setErrorCode(ErrorCode.value2);
            response.setErrorText("Wrong user or password");
            return response;
        }
        // build response list, this server offers only detector values
        GetContentInfoResponseTypeContentInfoListContentInfo[] ctInfoList = new GetContentInfoResponseTypeContentInfoListContentInfo[1];
        // create object type info
        GetContentInfoResponseTypeContentInfoListContentInfo objectTypeInfo = new GetContentInfoResponseTypeContentInfoListContentInfo();
        objectTypeInfo.setObjectTypeName(new NMToken("TrafficData_detector_currentValue"));

        URI dataTypeURI = null;
        try
        {
            TypeDesc typeDesc = DetectorType_Helper.getTypeDesc();
            FieldDesc elemDesc = typeDesc.getFieldByName("currentValue");
            QName dataXmlType = elemDesc.getXmlType();
            dataTypeURI = new URI(dataXmlType.getNamespaceURI() + ":" + dataXmlType.getLocalPart());
        }
        catch (Exception e)
        {
            // should not happen
            dataTypeURI = new URI();
        }
        objectTypeInfo.setObjectTypeURI(dataTypeURI);
        // set access rights of the type: only read and write is allowed
        objectTypeInfo.setCreateable(false);
        objectTypeInfo.setDeleteable(false);
        objectTypeInfo.setReadable(true);
        objectTypeInfo.setWriteable(true);
        
        ctInfoList[0] = objectTypeInfo;
        response.setContentInfoList(new GetContentInfoResponseTypeContentInfoList(ctInfoList));
        
        return response;
    }

    /* (non-Javadoc)
     * @see com.siemens.sitraffic.external.soap.ExternalIf#inquireAll(com.siemens.sitraffic.external.soap.protocol.InquireAllType)
     */
    public InquireAllResponseType inquireAll(InquireAllType inquireAll) throws RemoteException
    {
        // build default positive empty response
        InquireAllResponseType response = new InquireAllResponseType();
        response.setErrorCode(ErrorCode.value1);
        response.setErrorText("");
        response.setLastStart(startTime);
        response.setDataList(new DataList());
        response.setStoretime(Calendar.getInstance());
        response.setPosition(new UnsignedInt(0));
        
        // check user access
        if (checkAccess(inquireAll) == false)
        {
            // return error
            response.setErrorCode(ErrorCode.value2);
            response.setErrorText("Wrong user or password");
            return response;
        }
        // check if we can offer the requested type
        if (!inquireAll.getObjectType().toString().equals("TrafficData_detector_currentValue"))
        {
            // return error
            response.setErrorCode(ErrorCode.value2);
            response.setErrorText("Illegal object type access");
            return response;
        }
        // here we do not care about the filter. the filter should be used to select the objects
        // we only deliver some sample data
        
        // get data from event buffer
        Map<ObjectIdentifier, ObjectValueEvent<CurrentValueType>> lastObjectValueEventMap = detectorBuffer.getLastObjectValueEvents();
        
        List<DataListDs> dsList = new LinkedList<DataListDs>();
        long lastPosition = 0;
        for (Entry<ObjectIdentifier, ObjectValueEvent<CurrentValueType>> lastObjectValueEventEntry : lastObjectValueEventMap.entrySet())
        {
          ObjectIdentifier objIdentifier = lastObjectValueEventEntry.getKey();
          ObjectValueEvent<CurrentValueType> objectValueEvent = lastObjectValueEventEntry.getValue();
          
          // check filter (if some is used) and select only filtered objects; if no filter is used all objects are selected
          Object data = null;
          ObjectState state = null;
          if (objectValueEvent instanceof ObjectInitValueEvent<?>)
          {
            ObjectInitValueEvent<?> objectInitEvent = (ObjectInitValueEvent<?>)objectValueEvent;
            data = objectInitEvent.getData();
            state = ObjectState.value1;
          }
          else if (objectValueEvent instanceof ObjectCreateValueEvent<?>)
          {
            ObjectCreateValueEvent<?> objectCreateEvent = (ObjectCreateValueEvent<?>)objectValueEvent;
            data = objectCreateEvent.getData();
            state = ObjectState.value1;
          }
          else if (objectValueEvent instanceof ObjectChangeValueEvent<?>)
          {
            ObjectChangeValueEvent<?> objectChangeEvent = (ObjectChangeValueEvent<?>)objectValueEvent;
            data = objectChangeEvent.getData();
            state = ObjectState.value2;
          }
          DataListDs ds = new DataListDs();
          IdentifierType identifier = new IdentifierType();
          identifier.setIdent(objIdentifier.getName());
          identifier.setSource(objIdentifier.getSource());
          ds.setIdentifier(identifier);

          long timestampMillis = objectValueEvent.getTimestamp();
          Calendar storeTime = Calendar.getInstance();
          storeTime.setTimeInMillis(timestampMillis);
          ds.setTstore(storeTime);
          ds.setObjectState(state);
          ds.setData(data);

          dsList.add(ds);
          long position = objectValueEvent.getPosition();
          if (position > lastPosition)
          {
            lastPosition = position;
          }
        }
        // return success
        response.setDataList(new DataList(dsList.toArray(new DataListDs[dsList.size()])));
        response.setStoretime(startTime);
        response.setPosition(new UnsignedInt(lastPosition));
        
        return response;
    }

    /* (non-Javadoc)
     * @see com.siemens.sitraffic.external.soap.ExternalIf#put(com.siemens.sitraffic.external.soap.protocol.PutType)
     */
    public PutResponseType put(PutType put) throws RemoteException
    {
        // build default positive empty response
        PutResponseType response = new PutResponseType();
        response.setBadList(new PutResponseTypeBadList());
        response.setErrorCode(ErrorCode.value1);
        response.setErrorText("");
        response.setLastStart(startTime);
        
        // check user access
        if (checkAccess(put) == false)
        {
            // return error
            response.setErrorCode(ErrorCode.value2);
            response.setErrorText("Wrong user or password");
            return response;
        }
        // check if we can offer the requested type
        if (!put.getObjectType().toString().equals("TrafficData_detector_currentValue"))
        {
            // return error
            response.setErrorCode(ErrorCode.value2);
            response.setErrorText("Illegal object type access");
            return response;
        }
        // read data, they are of type TrafficData_detector_currentValue
        // you would do some useful things here; we just print the data
        PutTypePutListPutds[] putds = put.getPutList().getPutds();
        if (putds == null)
            System.out.println("Put without data");
        else
        {
            for (int i = 0; i < putds.length; i++)
            {
                PutTypePutListPutds putObj = putds[i];
                IdentifierType idType = putObj.getIdentifier();
                CurrentValueType curVal = (CurrentValueType) putObj.getData();
                System.out.println("---------- Put -----------");
                System.out.println("Identifier: " + idType.getIdent().toString());
                System.out.println("Timeline:   " + curVal.getTimeline().getTimestamp().getTime().toString());
                ValueType[] val = curVal.getValue();
                if (val != null)
                {
                    for (int j = 0; j < val.length; j++)
                    {
                        ValueType cv = val[j];
                        System.out.println("  Vehicle type: " + cv.getVehicle().toString());
                        System.out.println("  Count:        " + cv.getCount());
                    }
                }
                System.out.println("State:        " + curVal.getDetectorState());
            }
        }
        return response;
    }
    
    /* (non-Javadoc)
     * @see com.siemens.sitraffic.external.soap.ExternalIf#wait4Gets(com.siemens.sitraffic.external.soap.protocol.Wait4GetsType)
     */
    @Override
    public Wait4GetsResponseType wait4Gets(Wait4GetsType arg0) throws RemoteException
    {
      // not implemented
      throw new UnsupportedOperationException("Method wait4Gets is not supported by this server");
    }
   
    /**
     * Check it the user has access to this server
     * @param request
     * @return
     */
    private boolean checkAccess(HeaderRequest request)
    {
        // check for user and password
        String user = request.getUserName().toString();
        String passwd = request.getPassWord();
        if (user.equals("Login") && passwd.equals("Password"))
            return true;
        return false;
    }
    
    /**
     * Create some example data
     * @param objState
     * @return
     */
    private DataListDs[] getData(ObjectState objState)
    {
        String ids[] = { "Detector_01", "Detector_02", "Detector_03" };
        DataListDs[] dsList = new DataListDs[ids.length];
        
        for (int i = 0; i < ids.length; i++)
        {
            TimelineType tl = new TimelineType(Calendar.getInstance(), null);
            ValueType val = new ValueType(VehicleType.all, 100 + 10 * i, new Integer(25), new Integer(70 + i));
            CurrentValueType trafficData = new CurrentValueType(ids[i], tl, new ValueType[] { val }, null, null, 0);

            IdentifierType ident = new IdentifierType(null, ids[i]);
            DataListDs ds = new DataListDs(Calendar.getInstance(), objState, ident, trafficData);
            dsList[i] = ds;
        }
        
        return dsList;
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        BasicConfigurator.configure();      // configure log4j
        Logger.getRootLogger().setLevel(Level.ERROR);
        
        // create a server an start it
        SimpleExternalIfSoapServer server = new SimpleExternalIfSoapServer(85, new ExtIFServer());
        server.start();
        
        System.out.println("Server is up and running, waiting for requests:" + server);
        try
        {
            while (System.in.read() != 'q');
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("Stop server");
        // stop server
        server.interrupt();
        //System.exit(0);
    }
}
