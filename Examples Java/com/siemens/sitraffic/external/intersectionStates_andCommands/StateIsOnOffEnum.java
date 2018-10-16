/**
 * StateIsOnOffEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class StateIsOnOffEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected StateIsOnOffEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _none = "none";
    public static final java.lang.String _on = "on";
    public static final java.lang.String _offDefault = "offDefault";
    public static final java.lang.String _offFlashSideStream = "offFlashSideStream";
    public static final java.lang.String _offDark = "offDark";
    public static final java.lang.String _offFlashAll = "offFlashAll";
    public static final java.lang.String _local = "local";
    public static final StateIsOnOffEnum none = new StateIsOnOffEnum(_none);
    public static final StateIsOnOffEnum on = new StateIsOnOffEnum(_on);
    public static final StateIsOnOffEnum offDefault = new StateIsOnOffEnum(_offDefault);
    public static final StateIsOnOffEnum offFlashSideStream = new StateIsOnOffEnum(_offFlashSideStream);
    public static final StateIsOnOffEnum offDark = new StateIsOnOffEnum(_offDark);
    public static final StateIsOnOffEnum offFlashAll = new StateIsOnOffEnum(_offFlashAll);
    public static final StateIsOnOffEnum local = new StateIsOnOffEnum(_local);
    public java.lang.String getValue() { return _value_;}
    public static StateIsOnOffEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        StateIsOnOffEnum enumeration = (StateIsOnOffEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static StateIsOnOffEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(StateIsOnOffEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "stateIsOnOffEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
