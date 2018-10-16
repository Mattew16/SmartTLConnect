//***************************************************************************** 
//
//  Project:      SITRAFFIC smartTL Connect 
//                Siemens SA, RC-PT MO MM ITS
//
//  COPYRIGHT (C) SIEMENS AG 2000-2008 ALL RIGHTS RESERVED CONFIDENTIAL 
//
//***************************************************************************** 
//
//  Module name:    ExtIFServer.java
//  Author:    Pedro Silva
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
import com.siemens.sitraffic.external.intersectionStates_andCommands.FeaturesType_Helper;
import com.siemens.sitraffic.external.intersectionStates_andCommands.IntersectionStatus;
import com.siemens.sitraffic.external.intersectionStates_andCommands.IntersectionStatus_Helper;
import com.siemens.sitraffic.external.intersectionStates_andCommands.IsCommandType;
import com.siemens.sitraffic.external.intersectionStates_andCommands.IsCommandType_Helper;
import com.siemens.sitraffic.external.intersectionStates_andCommands.IsFeatureType;
import com.siemens.sitraffic.external.intersectionStates_andCommands.SignalPlansType;
import com.siemens.sitraffic.external.intersectionStates_andCommands.SpType;
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


/**
 * <p>Title:       SITRAFFIC smartTL Connect - ExtIFServer.java</p>
 * <p>Description: Main converter software.</p>
 * 
 * <p>Copyright:   (c) 2015</p>
 * <p>Company:     Siemens SA</p>
 * 
 * @author        Pedro Silva
 * @created       01.04.2016
 * @version       $Revision$ $Date$
 */

public class ExtIFServer implements ExternalIf {

  private Calendar startTime;

  //ObjectEventBuffer stores the objects and their informations. 
  private ObjectEventBuffer<Object> intersectionDescriptionBuffer;
  private static ObjectEventBuffer<Object> intersectionStatusBuffer;
  private static ObjectEventBuffer<Object> intersectionFeaturesBuffer;

  //int[] statusUserChange - if there is a user forced change on the status of the intersection the value is changed to 1 on the index equivalent to a specific intersection. Temporary size/content.
  public static int[] statusUserChange = {0};
  //PutTypePutListPutds[] putds - Input from SG (like a change in signal program).  
  public static PutTypePutListPutds[] putds;
  //int[] status - stores the status of each intersection. Temporary size/content. 0 means unkown, 1 means online, 3 means amber flashing mode, 8 means offline.  
  public static int[] status = {0};
  //int[] previousStatus - copy of status to verify consistency of data and use verify any important changes. Temporary size/content.
  public static int[] previousStatus ={0};
  //String[] intersectionids - Names of the intersections that show in smartGuard, names are generated depending on the number of intersection being monitored. Temporary size/content.
  public static String[] intersectionids = {"Intersection_00"};
  //SpType[] previousStatusControl - Used to check signal program changes. Temporary size/content.
  public static SpType[] previousStatusControl = {new SpType()};


  /**
  * Constructor for the server where information is stored 
  * and answers requests from a smartGuard instance.
  *
  * Keeps running until the application is stopped.     
  * Does not save persistent data.
  * @throws IOException 
  * @throws NumberFormatException 
  *
  */
  public ExtIFServer() throws NumberFormatException, IOException {
    startTime = Calendar.getInstance();
    intersectionDescriptionBuffer  = new ObjectEventBuffer<Object>(0L, 3600000L, false);
    intersectionStatusBuffer = new ObjectEventBuffer<Object>(0L, 3600000L, false);
    intersectionFeaturesBuffer = new ObjectEventBuffer<Object>(0L, 3600000L, false);

    createIntersections();
  }

  /** 
   * Creates a configurable number of intersections. If no input is given, default number is 5.
   * 
   * Sets all the necessary configuration details and puts them in the correct ObjectEventBuffer.
   * The amount of controllers set to be monitores cannot be changed at runtime. 
   *
   */
  public void createIntersections() throws NumberFormatException, IOException{
    
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    long startTime = System.currentTimeMillis();
    int t = 10;
    System.out.println("Enter the number of intersections (default is 5): ");
    while ((System.currentTimeMillis() - startTime) < t * 1000 && !in.ready()) {
    }
    int numIntersections = 5;
    if (in.ready()) {
    	numIntersections = Integer.parseInt(in.readLine());
      } 
    
    int i;
    String name = "Intersection_"; //It is the same for every intersection.
    intersectionids = new String[numIntersections];
    status = new int[numIntersections];
    statusUserChange = new int[numIntersections];
    previousStatus = new int[numIntersections];
    previousStatusControl = new SpType[numIntersections];

    //Creates the necessary Id's and structures to hold the information of the controller, according to the configured number of intersections.
    for(i=0;i<numIntersections;i++){
      status[i] = 8;
      previousStatus[i] = 8;
      statusUserChange[i] = 0;
      intersectionids[i] = name + i;
      previousStatusControl[i] = new SpType();
      previousStatusControl[i].setSpNr((short) 8);
    }


    for (String intersectioId : intersectionids){
      //random coordinates to make the intersections appear on the screen, can be moved after initialization.
      int coordinate = 4287586 + i+3; 
      i++;
      ObjectIdentifier objIdent = new ObjectIdentifier(intersectioId, "", Collections.<String> emptySet());
      Description isDesc = new Description();
      isDesc.setId(intersectioId);
      isDesc.setName(intersectioId);  //set real name, here only to id is repeated
      isDesc.setSubsystem("smartTLconnect");  //the subsystem has to be configured in SmartGuard
      //fill other elements if necessary, of interest are ServiceInfo
      //for SmartGuard it is recommended to set a position
      //Note: position must be in UTM projection coordinates
      CoType co = new CoType();
      co.setX(29441224.50);      //some position in UTM zone 29, use right UTM position here
      co.setY(coordinate);
      LocationTypeCo_description coDesc = new LocationTypeCo_description();
      coDesc.setProjectionCategory("UTM WGS84");
      coDesc.setProjectionType("zone=29,band=N"); // zone 29 = Portugal band = N / 31 Netherlands band = U
      coDesc.setCo(new CoType[] { co });
      LocationType loc = new LocationType();
      loc.setCo_description(new LocationTypeCo_description[] { coDesc });
      isDesc.setLocation(loc);
      // put to buffer
      intersectionDescriptionBuffer.writeObject(objIdent, isDesc, false);
    }

    // and create a intersection status object
    i = 0;
    for (String intersectioId : intersectionids){
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
      sp.setSpNr((short) 8);
      isStatus.setSignalProgram(sp);
      // now we have the minimum required values
      intersectionStatusBuffer.writeObject(objIdent, isStatus, false);
      i++;
    }

    // Creates the object IntersectionFeatures. Includes the signal programs used by the user to change the status of the controller.
    for (String intersectioId : intersectionids){
      ObjectIdentifier objIdent = new ObjectIdentifier(intersectioId, "", Collections.<String> emptySet());

      SignalPlansType signalPlan0 = new SignalPlansType(0, "NCP", "NCP", 0, 60);
      SignalPlansType signalPlan1 = new SignalPlansType(1, "COR", "COR", 1, 60);
      SignalPlansType signalPlan2 = new SignalPlansType(3, "INT", "INT", 3, 60);
      SignalPlansType signalPlan3 = new SignalPlansType(8, "OFF", "OFF", 8, 60);
      SignalPlansType[] signalPlans = {signalPlan0, signalPlan1, signalPlan2, signalPlan3};
      IsFeatureType isFeature = new IsFeatureType();
      isFeature.setIdentifier(intersectioId);
      isFeature.setSignalPlans(signalPlans);
      FeaturesType feature = new FeaturesType(null, null, 1, true, true, true);
      isFeature.setFeatures(feature);
      // now we have the minimum required values
      intersectionFeaturesBuffer.writeObject(objIdent, isFeature, false);
    }
  }
    
  /* (non-Javadoc)
  * @see com.siemens.sitraffic.external.soap.ExternalIf#delete(com.siemens.sitraffic.external.soap.protocol.DeleteType)
  */
  public DeleteResponseType delete(DeleteType delete) throws RemoteException{
    // not implemented
    throw new UnsupportedOperationException("Method delete is not supported by this server");
  }

  /* (non-Javadoc)
  * @see com.siemens.sitraffic.external.soap.ExternalIf#get(com.siemens.sitraffic.external.soap.protocol.GetType)
  */
  public GetResponseType get(GetType get) throws RemoteException{
    // build default positive empty response
    GetResponseType response = new GetResponseType();
    response.setErrorCode(ErrorCode.value1);
    response.setErrorText("");
    response.setLastStart(startTime);
    response.setDataList(new DataList());
    response.setStoretime(Calendar.getInstance());
    response.setPosition(new UnsignedInt(0));

    // check user access
    if (checkAccess(get) == false){
      response.setErrorCode(ErrorCode.value2);
      response.setErrorText("Wrong user or password");
      return response;
    }
    // the position select values which are newer than the values with that position
    int position = get.getPosition().intValue();      
    // check if we can offer the requested type
    String objectTypeName = get.getObjectType().toString();
    Map<ObjectEvent<Object>,ObjectIdentifier> eventHistory;
   
    if (objectTypeName.equals("IntersectionDescription")){
      eventHistory = intersectionDescriptionBuffer.getEventHistoryFrom(position);
    }else if (objectTypeName.equals("IntersectionStatus")){
      eventHistory = intersectionStatusBuffer.getEventHistoryFrom(position);
    }else if (objectTypeName.equals("IntersectionFeature")){
      eventHistory = intersectionFeaturesBuffer.getEventHistoryFrom(position);
    }else{
      response.setErrorCode(ErrorCode.value2);
      response.setErrorText("Illegal object type access");
      return response;
    }
    // here we do not care about the filter. the filter should be used to select the objects
    long lastPosition = position;
    Calendar lastTimestamp = Calendar.getInstance();
    lastTimestamp.setTimeInMillis(0);
    List<DataListDs> dsList = new LinkedList<DataListDs>();
    for (Entry<ObjectEvent<Object>, ObjectIdentifier> eventHistoryEntry : eventHistory.entrySet()){
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
      if (event instanceof ObjectInitValueEvent<?>){
        ObjectInitValueEvent<?> initEvent = (ObjectInitValueEvent<?>)event;
        data = initEvent.getData();
        state = ObjectState.value1;
      }else if (event instanceof ObjectCreateValueEvent<?>){
        ObjectCreateValueEvent<?> initEvent = (ObjectCreateValueEvent<?>)event;
        data = initEvent.getData();
        state = ObjectState.value1;
      }else if (event instanceof ObjectChangeValueEvent<?>){
        ObjectChangeValueEvent<?> changeEvent = (ObjectChangeValueEvent<?>)event;
        data = changeEvent.getData();
        state = ObjectState.value2;
      }else if (event instanceof ObjectDeleteEvent<?>){
        data = "";        // must not be null!!!!!
        state = ObjectState.value3;
      }

      ds.setObjectState(state);
      ds.setData(data);

      dsList.add(ds);

      // remember last times stamp and last position
      if (timestampMillis > lastTimestamp.getTimeInMillis()){
        lastTimestamp.setTimeInMillis(timestampMillis);
      }

      long eventPosition = event.getPosition();
      if (eventPosition > lastPosition){
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
  public GetContentInfoResponseType getContentInfo(GetContentInfoType getContentInfo) throws RemoteException{

    GetContentInfoResponseType response = new GetContentInfoResponseType();
    response.setContentInfoList(new GetContentInfoResponseTypeContentInfoList());
    response.setLastStart(startTime);
    // assume no error
    response.setErrorCode(ErrorCode.value1);
    response.setErrorText("");

    // check user access
    if (checkAccess(getContentInfo) == false){
      // return error
      response.setErrorCode(ErrorCode.value2);
      response.setErrorText("Wrong user or password");
      return response;
    }
    URI dataTypeURI = null;
    
    // create object type info for intersection description
    GetContentInfoResponseTypeContentInfoListContentInfo isDescriptionTypeInfo = new GetContentInfoResponseTypeContentInfoListContentInfo();
    isDescriptionTypeInfo.setObjectTypeName(new NMToken("IntersectionDescription"));

    dataTypeURI = null;
    try{
      TypeDesc typeDesc = Description_Helper.getTypeDesc();
      FieldDesc elemDesc = typeDesc.getFieldByName("Description");
      QName dataXmlType = elemDesc.getXmlType();
      dataTypeURI = new URI(dataXmlType.getNamespaceURI() + ":" + dataXmlType.getLocalPart());
    }catch (Exception e){
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
    try{
      TypeDesc typeDesc = IntersectionStatus_Helper.getTypeDesc();
      FieldDesc elemDesc = typeDesc.getFieldByName("IntersectionStatus");
      QName dataXmlType = elemDesc.getXmlType();
      dataTypeURI = new URI(dataXmlType.getNamespaceURI() + ":" + dataXmlType.getLocalPart());
    }catch (Exception e){
      // should not happen
      dataTypeURI = new URI();
    }
    isStatusTypeInfo.setObjectTypeURI(dataTypeURI);
    // set access rights of the type: only read and write is allowed
    isStatusTypeInfo.setCreateable(false);
    isStatusTypeInfo.setDeleteable(false);
    isStatusTypeInfo.setReadable(true);
    isStatusTypeInfo.setWriteable(true);

    GetContentInfoResponseTypeContentInfoListContentInfo isFeatureTypeInfo = new GetContentInfoResponseTypeContentInfoListContentInfo();
    isFeatureTypeInfo.setObjectTypeName(new NMToken("IntersectionFeature"));

    dataTypeURI = null;
    try{
      TypeDesc typeDesc = FeaturesType_Helper.getTypeDesc();
      FieldDesc elemDesc = typeDesc.getFieldByName("FeaturesType");
      QName dataXmlType = elemDesc.getXmlType();
      dataTypeURI = new URI(dataXmlType.getNamespaceURI() + ":" + dataXmlType.getLocalPart());
    }catch (Exception e){
      // should not happen
      dataTypeURI = new URI();
    }
    isFeatureTypeInfo.setObjectTypeURI(dataTypeURI);
    // set access rights of the type: only read and write is allowed
    isFeatureTypeInfo.setCreateable(false);
    isFeatureTypeInfo.setDeleteable(false);
    isFeatureTypeInfo.setReadable(true);
    isFeatureTypeInfo.setWriteable(true);

    // create object type info for intersection status
    GetContentInfoResponseTypeContentInfoListContentInfo isCommandTypeInfo = new GetContentInfoResponseTypeContentInfoListContentInfo();
    isCommandTypeInfo.setObjectTypeName(new NMToken("IntersectionCommand"));

    dataTypeURI = null;
    try{
      TypeDesc typeDesc = IsCommandType_Helper.getTypeDesc();
      FieldDesc elemDesc = typeDesc.getFieldByName("IsCommandType");
      QName dataXmlType = elemDesc.getXmlType();
      dataTypeURI = new URI(dataXmlType.getNamespaceURI() + ":" + dataXmlType.getLocalPart());
    }catch (Exception e){
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
    ctInfoList[0] = isDescriptionTypeInfo;
    ctInfoList[1] = isStatusTypeInfo;
    ctInfoList[2] = isFeatureTypeInfo;
    ctInfoList[3] = isCommandTypeInfo;
    response.setContentInfoList(new GetContentInfoResponseTypeContentInfoList(ctInfoList));

    return response;
  }

  /* (non-Javadoc)
  * @see com.siemens.sitraffic.external.soap.ExternalIf#inquireAll(com.siemens.sitraffic.external.soap.protocol.InquireAllType)
  */
  public InquireAllResponseType inquireAll(InquireAllType inquireAll) throws RemoteException{
    // build default positive empty response
    InquireAllResponseType response = new InquireAllResponseType();
    response.setErrorCode(ErrorCode.value1);
    response.setErrorText("");
    response.setLastStart(startTime);
    response.setDataList(new DataList());
    response.setStoretime(Calendar.getInstance());
    response.setPosition(new UnsignedInt(0));

    // check user access
    if (checkAccess(inquireAll) == false){
      response.setErrorCode(ErrorCode.value2);
      response.setErrorText("Wrong user or password");
      return response;
    }
    // check if we can offer the requested type
    String objectTypeName = inquireAll.getObjectType().toString();
    // get data from event buffer
    Map<ObjectIdentifier, ObjectValueEvent<Object>> lastObjectValueEventMap;
    
    if (objectTypeName.equals("IntersectionDescription")){
      lastObjectValueEventMap = intersectionDescriptionBuffer.getLastObjectValueEvents();
    }else if (objectTypeName.equals("IntersectionStatus")){
      lastObjectValueEventMap = intersectionStatusBuffer.getLastObjectValueEvents();
    }else if (objectTypeName.equals("IntersectionFeature")){
      lastObjectValueEventMap = intersectionFeaturesBuffer.getLastObjectValueEvents();
    }else{
      response.setErrorCode(ErrorCode.value2);
      response.setErrorText("Illegal object type access");
      return response;
    }
    // check if we can offer the requested type
    // here we do not care about the filter. the filter should be used to select the objects
    // we only deliver some sample data
    System.out.println("Data Sent to SmartGuard.\n");
    List<DataListDs> dsList = new LinkedList<DataListDs>();
    long lastPosition = 0;
    for (Entry<ObjectIdentifier, ObjectValueEvent<Object>> lastObjectValueEventEntry : lastObjectValueEventMap.entrySet()){
      ObjectIdentifier objIdentifier = lastObjectValueEventEntry.getKey();
      ObjectValueEvent<Object> objectValueEvent = lastObjectValueEventEntry.getValue();

      // check filter (if some is used) and select only filtered objects; if no filter is used all objects are selected
      Object data = null;
      ObjectState state = null;
      if (objectValueEvent instanceof ObjectInitValueEvent<?>){
        ObjectInitValueEvent<?> objectInitEvent = (ObjectInitValueEvent<?>)objectValueEvent;
        data = objectInitEvent.getData();
        state = ObjectState.value1;
      }else if (objectValueEvent instanceof ObjectCreateValueEvent<?>){
        ObjectCreateValueEvent<?> objectCreateEvent = (ObjectCreateValueEvent<?>)objectValueEvent;
        data = objectCreateEvent.getData();
        state = ObjectState.value1;
      }else if (objectValueEvent instanceof ObjectChangeValueEvent<?>){
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
      if (position > lastPosition){
        lastPosition = position;
      }
    }
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
    if (checkAccess(put) == false){
      response.setErrorCode(ErrorCode.value2);
      response.setErrorText("Wrong user or password");
      return response;
    }
    // check if we can offer the requested type
    if (!put.getObjectType().toString().equals("IntersectionCommand")){
      response.setErrorCode(ErrorCode.value2);
      response.setErrorText("Illegal object type access");
      return response;
    }
    // Read data type IntersectionCommand.
    // Data is kept in a global variable.
    putds = put.getPutList().getPutds();
    if (putds == null){
      System.out.println("Put without data");
    }
    return response;
  }

  /**
   * This method verifies the information received from SG. If the status of a controller is change in SG 
   * the method will notify the SimpleServer process of this change.
   *
   */
  static void putCheckContent(){
     for (int i = 0; i < putds.length; i++){
        PutTypePutListPutds putObj = putds[i];
        IsCommandType isCommand = (IsCommandType) putObj.getData();
        IdentifierType idType = putObj.getIdentifier();
        String controllerId = idType.getIdent().toString();
        int controllerNr = Integer.parseInt(Character.toString(controllerId.charAt(13)));
	    if(isCommand.getSignalProgram()!= null){    
	    	if ((controllerNr<status.length) && ((int)isCommand.getSignalProgram().getSpNr() != status[controllerNr])){
	          status[controllerNr] = isCommand.getSignalProgram().getSpNr();
	          statusUserChange[controllerNr] = 1; 
          }
	    }
     }
    
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
    if (user.equals("Login") && passwd.equals("Password")){
      return true;
    }
    return false;
  }

  /**
   * Returns true if the array contains the integer.
   * Returns false otherwise.
   */
  public static boolean contains(final int[] array, final int key) {  
    Arrays.sort(array);  
    return Arrays.binarySearch(array, key) != -1;  
  }



  /**
  * @param args
  * @throws IOException 
  * @throws InterruptedException 
  */
  public static void main(String[] args) throws IOException, InterruptedException{
    BasicConfigurator.configure();      // configure log4j
    Logger.getRootLogger().setLevel(Level.ERROR);
    boolean run = true;

    
    int z, x;

    // create a server an start it
    SimpleExternalIfSoapServer server = new SimpleExternalIfSoapServer(85, new ExtIFServer());
    server.start();

    System.out.println("Server is up and running, waiting for requests:" + server);
    while(run){

      System.out.println("\nLooking for Intersection...\n");
      SimpleServer simpleserver = new SimpleServer();
      //Checks for information coming from smartGuard.
      if (putds != null){
    	  putCheckContent();
      }
      
      if ((status != previousStatus) && (contains(statusUserChange, 1))){
        status = simpleserver.init(status, statusUserChange); 
        for (x = 0; x < statusUserChange.length; x++){
          statusUserChange[x] = 0;
        }
      }else{
        status = simpleserver.init(previousStatus, statusUserChange);
      }

      for(int i4 = 0; i4 < status.length; i4++){
        if(status[i4] == 8 && previousStatus[i4] == 2){
          status[i4] = 2;
        }
      }
        previousStatus = status;
        for (z = 0; z<previousStatus.length;z++){
          previousStatusControl[z].setSpNr((short) previousStatus[z]);
        } 
        z = 0; 
         
        

        for (String intersectioId : intersectionids){
          ObjectIdentifier objIdent = new ObjectIdentifier(intersectioId, "", Collections.<String> emptySet());
          IntersectionStatus isStatus = new IntersectionStatus();
          isStatus.setIdentifier(intersectioId);
          isStatus.setReceiveTime(Calendar.getInstance());
          // SmartGuard calculates the device state by the detail states, see faultBuildConfig
          // at least the intersection ON/OFF state has to be set
          FaultStatusType fs = new FaultStatusType((short) status[z], null, null);
          isStatus.setFaultStatus(new FaultStatusType[] { fs });
          isStatus.setSignalProgram(previousStatusControl[z]);
          // now we have the minimum required values
          intersectionStatusBuffer.writeObject(objIdent, isStatus, false);
          z++;
        }
        
        for (String intersectioId : intersectionids){
            ObjectIdentifier objIdent = new ObjectIdentifier(intersectioId, "", Collections.<String> emptySet());
            SignalPlansType signalPlan0 = new SignalPlansType(0, "NCP", "NCP", 0, 60);
            SignalPlansType signalPlan1 = new SignalPlansType(1, "COR", "COR", 1, 60);
            SignalPlansType signalPlan2 = new SignalPlansType(3, "INT", "INT", 3, 60);
            SignalPlansType signalPlan3 = new SignalPlansType(8, "OFF", "OFF", 8, 60);
            SignalPlansType[] signalPlans = {signalPlan0, signalPlan1, signalPlan2, signalPlan3};
            IsFeatureType isFeature = new IsFeatureType();
            isFeature.setIdentifier(intersectioId);
            isFeature.setSignalPlans(signalPlans);
            FeaturesType feature = new FeaturesType(null, null, 1, true, true, true);
            isFeature.setFeatures(feature);
            // now we have the minimum required values
            intersectionFeaturesBuffer.writeObject(objIdent, isFeature, false);
          }
      
       System.out.println("Press CTRL + C to exit the server application.");   
      //Allows the implementation of server side commands. Configuration, debugging, etc.
      //****************************************    
      //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      //long startTime = System.currentTimeMillis();
      //System.out.println("Quit? q to exit");
      //while ((System.currentTimeMillis() - startTime) < timeInput * 2000 && !in.ready()) {
      //}

      //if (in.ready()) {
        //if(in.readLine().equals("q")){
          //System.out.println("Server Offline.");
          //run = false;         
          //break;
        //} 
      //}else{
        //System.out.println("No command issued.");
      //}
      //*****************************************
    }
    server.interrupt();
    System.exit(0);
  }

}