/**
 * AdminTypePublicdisplayKind.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficmessages;

public class AdminTypePublicdisplayKind implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdminTypePublicdisplayKind(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Web = "Web";
    public static final java.lang.String _SMS = "SMS";
    public static final java.lang.String _WebAndSMS = "WebAndSMS";
    public static final java.lang.String _other = "other";
    public static final AdminTypePublicdisplayKind Web = new AdminTypePublicdisplayKind(_Web);
    public static final AdminTypePublicdisplayKind SMS = new AdminTypePublicdisplayKind(_SMS);
    public static final AdminTypePublicdisplayKind WebAndSMS = new AdminTypePublicdisplayKind(_WebAndSMS);
    public static final AdminTypePublicdisplayKind other = new AdminTypePublicdisplayKind(_other);
    public java.lang.String getValue() { return _value_;}
    public static AdminTypePublicdisplayKind fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdminTypePublicdisplayKind enumeration = (AdminTypePublicdisplayKind)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdminTypePublicdisplayKind fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdminTypePublicdisplayKind.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">>adminType>publicdisplay>kind"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
