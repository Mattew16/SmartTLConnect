//***************************************************************************** 
//
//  Projekt:      SITRAFFIC smartTL Connect 
//                Siemens SA, RC-PT MO MM ITS
//
//  COPYRIGHT (C) SIEMENS AG 2000-2008 ALL RIGHTS RESERVED CONFIDENTIAL 
//
//***************************************************************************** 
//
//  Modulname:    ExtIFServer.java
//  Verfasser:    Pedro Silva
//***************************************************************************** 

package sample.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;
import java.util.Arrays;
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
import com.siemens.sitraffic.external.global.CoType;
import com.siemens.sitraffic.external.global.Description;
import com.siemens.sitraffic.external.global.Description_Helper;
import com.siemens.sitraffic.external.global.LocationType;
import com.siemens.sitraffic.external.global.LocationTypeCo_description;
import com.siemens.sitraffic.external.intersectionStates_andCommands.FaultStatusType;
import com.siemens.sitraffic.external.intersectionStates_andCommands.FeaturesType;
import com.siemens.sitraffic.external.intersectionStates_andCommands.IntersectionStatus;
import com.siemens.sitraffic.external.intersectionStates_andCommands.IntersectionStatus_Helper;
import com.siemens.sitraffic.external.intersectionStates_andCommands.IsCommandType;
import com.siemens.sitraffic.external.intersectionStates_andCommands.IsCommandType_Helper;
import com.siemens.sitraffic.external.intersectionStates_andCommands.IsFeatureType;
import com.siemens.sitraffic.external.intersectionStates_andCommands.SignalPlansType;
import com.siemens.sitraffic.external.intersectionStates_andCommands.SignalProgramType;
import com.siemens.sitraffic.external.intersectionStates_andCommands.SpType;
import com.siemens.sitraffic.external.intersectionStates_andCommands.StateIsOnOffEnum;
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
 * <p>Title:       SITRAFFIC smartTL Connect - ExtIFServer.java</p>
 * <p>Description: Main converter software. Handles communications and information.</p>
 * 
 * <p>Copyright:   (c) 2015</p>
 * <p>Company:     Siemens AG</p>
 * 
 * @author        Pedro Silva
 * @created       01.04.2016
 * @version       $Revision$ $Date$
 */
public class ExtIFServer implements ExternalIf
{
    private Calendar startTime;
    
    private ObjectEventBuffer<Object> detectorBuffer;
    private ObjectEventBuffer<Object> intersectionDescriptionBuffer;
    private static ObjectEventBuffer<Object> intersectionStatusBuffer;
    private ObjectEventBuffer<Object> intersectionFeaturesBuffer;
    public static int[] statusUserChange = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public static int[] status = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; 

    /**
    * Constructor for the server where information is stored 
    * and answers requests from a smartGuard instance.
    *
    * Keeps running until the application is stopped.     
    * Does not save persistent data.
    *
    */
    public ExtIFServer()
    {
        startTime = Calendar.getInstance();
        
        detectorBuffer = new ObjectEventBuffer<Object>(0L, 3600000L, false);
        intersectionDescriptionBuffer  = new ObjectEventBuffer<Object>(0L, 3600000L, false);
        intersectionStatusBuffer = new ObjectEventBuffer<Object>(0L, 3600000L, false);
        intersectionFeaturesBuffer = new ObjectEventBuffer<Object>(0L, 3600000L, false);
        
        // fill some sample data; usually the event buffer is updated during runtime 
        // if the content of an object changes
       
        // create detector example values
        String[] detctorids = { "Detector_01", "Detector_02", "Detector_03" };
        
        for (int i = 0; i < detctorids.length; i++)
        {
            TimelineType tl = new TimelineType(Calendar.getInstance(), null);
            ValueType val = new ValueType(VehicleType.all, 100 + 10 * i, new Integer(25), new Integer(70 + i));
            CurrentValueType trafficData = new CurrentValueType(detctorids[i], tl, new ValueType[] { val }, null, null, 0);

            ObjectIdentifier objIdent = new ObjectIdentifier(detctorids[i], "", Collections.<String> emptySet());
            detectorBuffer.writeObject(objIdent, trafficData, false);
        }
        
        // create intersection example values, number of controllers specified on the code.
        //TODO make a seamless cycle for any number.
        String[] intersectionids = { "Intersection_01", "Intersection_02", "Intersection_03", "Intersection_04", "Intersection_05", "Intersection_06", "Intersection_07", "Intersection_08", "Intersection_09", "Intersection_10", "Intersection_11", "Intersection_12", "Intersection_13", "Intersection_14", "Intersection_15"};
        int i = 0;
        // create a description object
        for (String intersectioId : intersectionids)
        {
        	int coordinate = 4287586 + i+3; 
        	i++;
          ObjectIdentifier objIdent = new ObjectIdentifier(intersectioId, "", Collections.<String> emptySet());
          Description isDesc = new Description();
          isDesc.setId(intersectioId);
          isDesc.setName(intersectioId);  // set real name, here only to id is repeated
          isDesc.setSubsystem("smartTLconnect");  // the subsystem has to be configured in SmartGuard
          // TODO: fill other elements if necessary, of interest are ServiceInfo
          // for SmartGuard it is recommended to set a position
          // Note: position must be in UTM projection coordinates
          CoType co = new CoType();
          co.setX(29441224.50);      // some position in UTM zone 29, use right UTM position here
          co.setY(coordinate);
          LocationTypeCo_description coDesc = new LocationTypeCo_description();
          coDesc.setProjectionCategory("UTM WGS84");
          coDesc.setProjectionType("zone=29,band=N"); // zone 29 = Portugal band = N / 31 Netherlands band = U
          coDesc.setCo(new CoType[] { co });
          LocationType loc = new LocationType();
          loc.setCo_description(new LocationTypeCo_description[] { coDesc });
          isDesc.setLocation(loc);
          // put to puffer
          intersectionDescriptionBuffer.writeObject(objIdent, isDesc, false);
        }

        // and create a intersection status object
        i = 0;
        for (String intersectioId : intersectionids)
        {
          ObjectIdentifier objIdent = new ObjectIdentifier(intersectioId, "", Collections.<String> emptySet());
          IntersectionStatus isStatus = new IntersectionStatus();
          isStatus.setIdentifier(intersectioId);
          isStatus.setReceiveTime(Calendar.getInstance());
          // SmartGuard calculates the device state by the detail states, see faultBuildConfig
          // at least the intersection ON/OFF state has to be set
          FaultStatusType fs = new FaultStatusType((short) status[i], null, null);
          isStatus.setFaultStatus(new FaultStatusType[] { fs });
          // Set signal program (mandatory)
          SpType sp = new SpType();
          sp.setSpNr((short) 9);
          isStatus.setSignalProgram(sp);
          // now we have the minimum required values
          intersectionStatusBuffer.writeObject(objIdent, isStatus, false);
          i++;
        }
        
        for (String intersectioId : intersectionids)
        {
          ObjectIdentifier objIdent = new ObjectIdentifier(intersectioId, "", Collections.<String> emptySet());
          
          SignalPlansType signalPlan0 = new SignalPlansType(0, "NCP", "NCP", null, null);
          SignalPlansType signalPlan1 = new SignalPlansType(1, "COR", "COR", null, null);
          SignalPlansType signalPlan2 = new SignalPlansType(3, "INT", "INT", null, null);
          SignalPlansType signalPlan3 = new SignalPlansType(9, "OFF", "OFF", null, null);
          SignalPlansType[] signalPlans = {signalPlan1, signalPlan2, signalPlan3};
          //FeaturesType features = (0, false, false, false);
          IsFeatureType isFeature = new IsFeatureType();
          isFeature.setIdentifier(intersectioId);
          isFeature.setSignalPlans(signalPlans);
          //StateIsOnOffEnum stateIsOn = new StateIsOnOffEnum("on");
          FeaturesType feature = new FeaturesType(null, null, 0, false, false, false);
          isFeature.setFeatures(feature);
          // now we have the minimum required values
          intersectionFeaturesBuffer.writeObject(objIdent, isFeature, false);
        }
    }

    public void createIntersection(String name){

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
        // the position select values which are newer than the values with that position
        int position = get.getPosition().intValue();      
        // check if we can offer the requested type
        String objectTypeName = get.getObjectType().toString();
        Map<ObjectEvent<Object>,ObjectIdentifier> eventHistory;
        if (objectTypeName.equals("TrafficData_detector_currentValue"))
        {
          eventHistory = detectorBuffer.getEventHistoryFrom(position);
        }
        else if (objectTypeName.equals("IntersectionDescription"))
        {
          eventHistory = intersectionDescriptionBuffer.getEventHistoryFrom(position);
        }
        else if (objectTypeName.equals("IntersectionStatus"))
        {
          eventHistory = intersectionStatusBuffer.getEventHistoryFrom(position);
        }
        else if (objectTypeName.equals("IntersectionFeatures"))
        {
          eventHistory = intersectionFeaturesBuffer.getEventHistoryFrom(position);
        }
        else
        {
            // return error
            response.setErrorCode(ErrorCode.value2);
            response.setErrorText("Illegal object type access");
            return response;
        }
        // here we do not care about the filter. the filter should be used to select the objects
        // we only deliver some sample data
        
  
        long lastPosition = position;
        Calendar lastTimestamp = Calendar.getInstance();
        lastTimestamp.setTimeInMillis(0);
        List<DataListDs> dsList = new LinkedList<DataListDs>();
        for (Entry<ObjectEvent<Object>, ObjectIdentifier> eventHistoryEntry : eventHistory.entrySet())
        {
          ObjectEvent<Object> event = eventHistoryEntry.getKey();
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
        // create object type info for detectors
        GetContentInfoResponseTypeContentInfoListContentInfo detectorTypeInfo = new GetContentInfoResponseTypeContentInfoListContentInfo();
        detectorTypeInfo.setObjectTypeName(new NMToken("TrafficData_detector_currentValue"));

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
        detectorTypeInfo.setObjectTypeURI(dataTypeURI);
        // set access rights of the type: only read and write is allowed
        detectorTypeInfo.setCreateable(false);
        detectorTypeInfo.setDeleteable(false);
        detectorTypeInfo.setReadable(true);
        detectorTypeInfo.setWriteable(true);
  
        // create object type info for intersection description
        GetContentInfoResponseTypeContentInfoListContentInfo isDescriptionTypeInfo = new GetContentInfoResponseTypeContentInfoListContentInfo();
        isDescriptionTypeInfo.setObjectTypeName(new NMToken("IntersectionDescription"));

        dataTypeURI = null;
        try
        {
            TypeDesc typeDesc = Description_Helper.getTypeDesc();
            FieldDesc elemDesc = typeDesc.getFieldByName("Description");
            QName dataXmlType = elemDesc.getXmlType();
            dataTypeURI = new URI(dataXmlType.getNamespaceURI() + ":" + dataXmlType.getLocalPart());
        }
        catch (Exception e)
        {
            // should not happen
            dataTypeURI = new URI();
        }
        isDescriptionTypeInfo.setObjectTypeURI(dataTypeURI);
        // set access rights of the type: only read and write is allowed
        isDescriptionTypeInfo.setCreateable(false);
        isDescriptionTypeInfo.setDeleteable(false);
        isDescriptionTypeInfo.setReadable(true);
        isDescriptionTypeInfo.setWriteable(true);

        
        // create object type info for intersection status
        GetContentInfoResponseTypeContentInfoListContentInfo isStatusTypeInfo = new GetContentInfoResponseTypeContentInfoListContentInfo();
        isStatusTypeInfo.setObjectTypeName(new NMToken("IntersectionStatus"));

        dataTypeURI = null;
        try
        {
            TypeDesc typeDesc = IntersectionStatus_Helper.getTypeDesc();
            FieldDesc elemDesc = typeDesc.getFieldByName("IntersectionStatus");
            QName dataXmlType = elemDesc.getXmlType();
            dataTypeURI = new URI(dataXmlType.getNamespaceURI() + ":" + dataXmlType.getLocalPart());
        }
        catch (Exception e)
        {
            // should not happen
            dataTypeURI = new URI();
        }
        isStatusTypeInfo.setObjectTypeURI(dataTypeURI);
        // set access rights of the type: only read and write is allowed
        isStatusTypeInfo.setCreateable(false);
        isStatusTypeInfo.setDeleteable(false);
        isStatusTypeInfo.setReadable(true);
        isStatusTypeInfo.setWriteable(true);

        GetContentInfoResponseTypeContentInfoListContentInfo isFeaturesTypeInfo = new GetContentInfoResponseTypeContentInfoListContentInfo();
        isFeaturesTypeInfo.setObjectTypeName(new NMToken("IntersectionFeatures"));

        dataTypeURI = null;
        try
        {
            TypeDesc typeDesc = IntersectionStatus_Helper.getTypeDesc();
            FieldDesc elemDesc = typeDesc.getFieldByName("IntersectionFeatures");
            QName dataXmlType = elemDesc.getXmlType();
            dataTypeURI = new URI(dataXmlType.getNamespaceURI() + ":" + dataXmlType.getLocalPart());
        }
        catch (Exception e)
        {
            // should not happen
            dataTypeURI = new URI();
        }
        isStatusTypeInfo.setObjectTypeURI(dataTypeURI);
        // set access rights of the type: only read and write is allowed
        isStatusTypeInfo.setCreateable(false);
        isStatusTypeInfo.setDeleteable(false);
        isStatusTypeInfo.setReadable(true);
        isStatusTypeInfo.setWriteable(true);

        // create object type info for intersection status
        GetContentInfoResponseTypeContentInfoListContentInfo isCommandTypeInfo = new GetContentInfoResponseTypeContentInfoListContentInfo();
        isCommandTypeInfo.setObjectTypeName(new NMToken("IntersectionCommand"));

        dataTypeURI = null;
        try
        {
            TypeDesc typeDesc = IsCommandType_Helper.getTypeDesc();
            FieldDesc elemDesc = typeDesc.getFieldByName("IsCommandType");
            QName dataXmlType = elemDesc.getXmlType();
            dataTypeURI = new URI(dataXmlType.getNamespaceURI() + ":" + dataXmlType.getLocalPart());
        }
        catch (Exception e)
        {
            // should not happen
            dataTypeURI = new URI();
        }
        isCommandTypeInfo.setObjectTypeURI(dataTypeURI);
        // set access rights of the type: only read and write is allowed
        isCommandTypeInfo.setCreateable(false);
        isCommandTypeInfo.setDeleteable(false);
        isCommandTypeInfo.setReadable(true);
        isCommandTypeInfo.setWriteable(true);

        // build response list, this server offers only detector values
        GetContentInfoResponseTypeContentInfoListContentInfo[] ctInfoList = new GetContentInfoResponseTypeContentInfoListContentInfo[4];
        ctInfoList[0] = detectorTypeInfo;
        ctInfoList[1] = isDescriptionTypeInfo;
        ctInfoList[2] = isStatusTypeInfo;
        ctInfoList[3] = isCommandTypeInfo;
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
        String objectTypeName = inquireAll.getObjectType().toString();
        // get data from event buffer
        Map<ObjectIdentifier, ObjectValueEvent<Object>> lastObjectValueEventMap;
        if (objectTypeName.equals("TrafficData_detector_currentValue"))
        {
          lastObjectValueEventMap = detectorBuffer.getLastObjectValueEvents();
        }
        else if (objectTypeName.equals("IntersectionDescription"))
        {
          lastObjectValueEventMap = intersectionDescriptionBuffer.getLastObjectValueEvents();
        }
        else if (objectTypeName.equals("IntersectionStatus"))
        {
          lastObjectValueEventMap = intersectionStatusBuffer.getLastObjectValueEvents();
        }
        else if (objectTypeName.equals("IntersectionFeatures"))
        {
          lastObjectValueEventMap = intersectionFeaturesBuffer.getLastObjectValueEvents();
        }
        else
        {
            // return error
            response.setErrorCode(ErrorCode.value2);
            response.setErrorText("Illegal object type access");
            return response;
        }
        // check if we can offer the requested type
        // here we do not care about the filter. the filter should be used to select the objects
        // we only deliver some sample data
        System.out.println("Data Sent to SmartGuard\n");
        List<DataListDs> dsList = new LinkedList<DataListDs>();
        long lastPosition = 0;
        for (Entry<ObjectIdentifier, ObjectValueEvent<Object>> lastObjectValueEventEntry : lastObjectValueEventMap.entrySet())
        {
          ObjectIdentifier objIdentifier = lastObjectValueEventEntry.getKey();
          ObjectValueEvent<Object> objectValueEvent = lastObjectValueEventEntry.getValue();
          
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
    public PutResponseType put(PutType put) throws RemoteException{
    	
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
        if (!put.getObjectType().toString().equals("IntersectionCommand"))
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
        	int z = 0;
            for (int i = 0; i < putds.length; i++)
            {
                PutTypePutListPutds putObj = putds[i];
                IdentifierType idType = putObj.getIdentifier();
                IsCommandType isCommand = (IsCommandType) putObj.getData();
                System.out.println("---------- Put -----------");
                System.out.println("Identifier: " + idType.getIdent().toString());
                System.out.println("Timeline:   " + isCommand.getTimeline().getStart().getTime().toString());
                if (isCommand.getSignalProgram().getSpNr() != status[z]){
                  status[z] = isCommand.getSignalProgram().getSpNr();
                  statusUserChange[z] = 1;

                }
                // TODO read the other command values
            }
        }
        return response;
    }
    
    /* (non-Javadoc)
     * @see com.siemens.sitraffic.external.soap.ExternalIf#wait4Gets(com.siemens.sitraffic.external.soap.protocol.Wait4GetsType)
     */
    @Override
    public Wait4GetsResponseType wait4Gets(Wait4GetsType arg0) throws RemoteException{
    	
      // not implemented
      throw new UnsupportedOperationException("Method wait4Gets is not supported by this server");
    }
   
    /**
     * Check it the user has access to this server
     * @param request
     * @return
     */
    private boolean checkAccess(HeaderRequest request){
    	
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
    private DataListDs[] getData(ObjectState objState){
    	
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
    
    
    public static boolean contains(final int[] array, final int key) {  
        Arrays.sort(array);  
        return Arrays.binarySearch(array, key) != -1;  
   }
    
    
    
    /**
     * @param args
     * @throws IOException 
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws IOException, InterruptedException
    {
        BasicConfigurator.configure();      // configure log4j
        Logger.getRootLogger().setLevel(Level.ERROR);
        int count =0, delay = 0;
        int[] previousStatus ={0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        SpType[] previousStatusControl = {new SpType(), new SpType(), new SpType(), new SpType(), new SpType(), new SpType(), new SpType(), new SpType(), new SpType(), new SpType(), new SpType(), new SpType(), new SpType(), new SpType(), new SpType()};
        for (int i2 = 0; i2 < status.length; i2++){
        	previousStatusControl[i2].setSpNr((short) 0);
        }
       
        String[] intersectionids = { "Intersection_01", "Intersection_02", "Intersection_03", "Intersection_04", "Intersection_05", "Intersection_06", "Intersection_07", "Intersection_08", "Intersection_09", "Intersection_10", "Intersection_11", "Intersection_12", "Intersection_13", "Intersection_14", "Intersection_15"};
        int z, x;
        int t = 2; //Time to wait for input

       
        // create a server an start it
        SimpleExternalIfSoapServer server = new SimpleExternalIfSoapServer(85, new ExtIFServer());
        server.start();
        
        System.out.println("Server is up and running, waiting for requests:" + server);
        for (int i = 0; i < 500000; i++)
            {
              
              System.out.println("\nLooking for Intersection...\n");
              SimpleServer simpleserver = new SimpleServer();
              delay++;
              if ((status != previousStatus) && (contains(statusUserChange, 1))){
                status = simpleserver.init(status, statusUserChange); //count will be replaced by statusUserChange
                for (x = 0; x < statusUserChange.length; x++){
                	statusUserChange[x] = 0;
                }
              }else{
                status = simpleserver.init(previousStatus, statusUserChange);
              }
              
              //count++;
              //previousStatusControl = 
              //if (count == 24){
                //count = 0;
              //}
               
              if(delay != 2){
                previousStatus = status;
              }else if (delay == 2){
                
                previousStatus = status;
                for (z = 0; i<previousStatus.length;i++){
                previousStatusControl[i].setSpNr((short) previousStatus[i]);
                } 
                delay = 0;
                z = 0;  
                
                //Thread.sleep(10000);
                //Thread.sleep(2000);        // wait a minute (5 sec)
                for (String intersectioId : intersectionids){
                 
                  System.out.println("Status set for: " + intersectioId);
                  ObjectIdentifier objIdent = new ObjectIdentifier(intersectioId, "", Collections.<String> emptySet());
                  IntersectionStatus isStatus = new IntersectionStatus();
                  isStatus.setIdentifier(intersectioId);
                  isStatus.setReceiveTime(Calendar.getInstance());
                  // SmartGuard calculates the device state by the detail states, see faultBuildConfig
                  // at least the intersection ON/OFF state has to be set
                  FaultStatusType fs = new FaultStatusType((short) status[z], null, null);
                  isStatus.setFaultStatus(new FaultStatusType[] { fs });
                  // Set signal program (mandatory)
                  //SpType sp = new SpType();
                  //sp.setSpNr((short) 1);
                  isStatus.setSignalProgram(previousStatusControl[z]);
                  // now we have the minimum required values
                  intersectionStatusBuffer.writeObject(objIdent, isStatus, false);
                  z++;
    
               
              }
              }
              
              //Thread.sleep(1000);
              
              BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
              long startTime = System.currentTimeMillis();
              	while ((System.currentTimeMillis() - startTime) < t * 1000
              			&& !in.ready()) {
              		//System.out.println("Waiting for input");
              	}

              	if (in.ready()) {
              		if(in.read() == 'q'){
              			break;
              		//System.out.println("You entered: " + in.readLine());
              			
              		}
              	} else {
              		System.out.println("You did not enter data");
              	}
              	Thread.sleep(1000);
                //lastIncidentPos = client.getIncidents(lastIncidentPos);
                // here you should handle detection of the server start by checking
                // the last server start in the response. If the last server start date 
                // has changed initialise the position (here: lastIncidentPos) with
                // the position of a inquireAll
                
                
            }
        server.interrupt();
        System.exit(0);
        /*try
        {
            while (System.in.read() != 'q');
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }*/
        //System.out.println("Stop server");
        // stop server
       // server.interrupt();
        //System.exit(0);
    }
}
