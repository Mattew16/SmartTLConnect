/**
 * Depending_messagesTypeMessagetype.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficmessages;

public class Depending_messagesTypeMessagetype implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Depending_messagesTypeMessagetype(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _roadwork = "roadwork";
    public static final java.lang.String _event = "event";
    public static final java.lang.String _incident = "incident";
    public static final Depending_messagesTypeMessagetype roadwork = new Depending_messagesTypeMessagetype(_roadwork);
    public static final Depending_messagesTypeMessagetype event = new Depending_messagesTypeMessagetype(_event);
    public static final Depending_messagesTypeMessagetype incident = new Depending_messagesTypeMessagetype(_incident);
    public java.lang.String getValue() { return _value_;}
    public static Depending_messagesTypeMessagetype fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Depending_messagesTypeMessagetype enumeration = (Depending_messagesTypeMessagetype)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Depending_messagesTypeMessagetype fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Depending_messagesTypeMessagetype.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">depending_messagesType>messagetype"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
