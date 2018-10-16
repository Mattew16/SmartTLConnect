/**
 * CurrentValueTypeAlarm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;

public class CurrentValueTypeAlarm implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CurrentValueTypeAlarm(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NoVideo = "NoVideo";
    public static final java.lang.String _SpeedAlarm = "SpeedAlarm";
    public static final java.lang.String _OccupancyAlarm = "OccupancyAlarm";
    public static final java.lang.String _CommunicationError = "CommunicationError";
    public static final java.lang.String _StoppedVehicle = "StoppedVehicle";
    public static final java.lang.String _SpeedVariation = "SpeedVariation";
    public static final java.lang.String _InverseDirection = "InverseDirection";
    public static final java.lang.String _SmokeDetected = "SmokeDetected";
    public static final java.lang.String _BadVideo = "BadVideo";
    public static final java.lang.String _DigitalInput = "DigitalInput";
    public static final java.lang.String _UserAlarm = "UserAlarm";
    public static final java.lang.String _ConfigChanged = "ConfigChanged";
    public static final java.lang.String _ZoneActive = "ZoneActive";
    public static final java.lang.String _OutputGroupActive = "OutputGroupActive";
    public static final java.lang.String _PhaseActive = "PhaseActive";
    public static final java.lang.String _IndiffData = "IndiffData";
    public static final java.lang.String _RebootEvent = "RebootEvent";
    public static final java.lang.String _Upgraded = "Upgraded";
    public static final java.lang.String _RecallPressed = "RecallPressed";
    public static final java.lang.String _DownloadFailed = "DownloadFailed";
    public static final java.lang.String _IllegalEvent = "IllegalEvent";
    public static final java.lang.String _SpeedAlarmLevel1 = "SpeedAlarmLevel1";
    public static final java.lang.String _SpeedAlarmLevel2 = "SpeedAlarmLevel2";
    public static final java.lang.String _SpeedAlarmLevel3 = "SpeedAlarmLevel3";
    public static final java.lang.String _IncidentAlarm = "IncidentAlarm";
    public static final java.lang.String _IncidentWarning = "IncidentWarning";
    public static final CurrentValueTypeAlarm NoVideo = new CurrentValueTypeAlarm(_NoVideo);
    public static final CurrentValueTypeAlarm SpeedAlarm = new CurrentValueTypeAlarm(_SpeedAlarm);
    public static final CurrentValueTypeAlarm OccupancyAlarm = new CurrentValueTypeAlarm(_OccupancyAlarm);
    public static final CurrentValueTypeAlarm CommunicationError = new CurrentValueTypeAlarm(_CommunicationError);
    public static final CurrentValueTypeAlarm StoppedVehicle = new CurrentValueTypeAlarm(_StoppedVehicle);
    public static final CurrentValueTypeAlarm SpeedVariation = new CurrentValueTypeAlarm(_SpeedVariation);
    public static final CurrentValueTypeAlarm InverseDirection = new CurrentValueTypeAlarm(_InverseDirection);
    public static final CurrentValueTypeAlarm SmokeDetected = new CurrentValueTypeAlarm(_SmokeDetected);
    public static final CurrentValueTypeAlarm BadVideo = new CurrentValueTypeAlarm(_BadVideo);
    public static final CurrentValueTypeAlarm DigitalInput = new CurrentValueTypeAlarm(_DigitalInput);
    public static final CurrentValueTypeAlarm UserAlarm = new CurrentValueTypeAlarm(_UserAlarm);
    public static final CurrentValueTypeAlarm ConfigChanged = new CurrentValueTypeAlarm(_ConfigChanged);
    public static final CurrentValueTypeAlarm ZoneActive = new CurrentValueTypeAlarm(_ZoneActive);
    public static final CurrentValueTypeAlarm OutputGroupActive = new CurrentValueTypeAlarm(_OutputGroupActive);
    public static final CurrentValueTypeAlarm PhaseActive = new CurrentValueTypeAlarm(_PhaseActive);
    public static final CurrentValueTypeAlarm IndiffData = new CurrentValueTypeAlarm(_IndiffData);
    public static final CurrentValueTypeAlarm RebootEvent = new CurrentValueTypeAlarm(_RebootEvent);
    public static final CurrentValueTypeAlarm Upgraded = new CurrentValueTypeAlarm(_Upgraded);
    public static final CurrentValueTypeAlarm RecallPressed = new CurrentValueTypeAlarm(_RecallPressed);
    public static final CurrentValueTypeAlarm DownloadFailed = new CurrentValueTypeAlarm(_DownloadFailed);
    public static final CurrentValueTypeAlarm IllegalEvent = new CurrentValueTypeAlarm(_IllegalEvent);
    public static final CurrentValueTypeAlarm SpeedAlarmLevel1 = new CurrentValueTypeAlarm(_SpeedAlarmLevel1);
    public static final CurrentValueTypeAlarm SpeedAlarmLevel2 = new CurrentValueTypeAlarm(_SpeedAlarmLevel2);
    public static final CurrentValueTypeAlarm SpeedAlarmLevel3 = new CurrentValueTypeAlarm(_SpeedAlarmLevel3);
    public static final CurrentValueTypeAlarm IncidentAlarm = new CurrentValueTypeAlarm(_IncidentAlarm);
    public static final CurrentValueTypeAlarm IncidentWarning = new CurrentValueTypeAlarm(_IncidentWarning);
    public java.lang.String getValue() { return _value_;}
    public static CurrentValueTypeAlarm fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CurrentValueTypeAlarm enumeration = (CurrentValueTypeAlarm)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CurrentValueTypeAlarm fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurrentValueTypeAlarm.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", ">currentValueType>alarm"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
