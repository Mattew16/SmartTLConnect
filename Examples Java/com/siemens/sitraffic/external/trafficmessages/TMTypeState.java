/**
 * TMTypeState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficmessages;

public class TMTypeState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TMTypeState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _unverified = "unverified";
    public static final java.lang.String _future = "future";
    public static final java.lang.String _active = "active";
    public static final java.lang.String _inactive = "inactive";
    public static final java.lang.String _history = "history";
    public static final java.lang.String _undefined = "undefined";
    public static final TMTypeState unverified = new TMTypeState(_unverified);
    public static final TMTypeState future = new TMTypeState(_future);
    public static final TMTypeState active = new TMTypeState(_active);
    public static final TMTypeState inactive = new TMTypeState(_inactive);
    public static final TMTypeState history = new TMTypeState(_history);
    public static final TMTypeState undefined = new TMTypeState(_undefined);
    public java.lang.String getValue() { return _value_;}
    public static TMTypeState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TMTypeState enumeration = (TMTypeState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TMTypeState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TMTypeState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">TMType>state"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
