/**
 * Camera_InfoTypeState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.cctv;

public class Camera_InfoTypeState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Camera_InfoTypeState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "0";
    public static final java.lang.String _value2 = "1";
    public static final java.lang.String _value3 = "2";
    public static final java.lang.String _value4 = "3";
    public static final java.lang.String _value5 = "4";
    public static final java.lang.String _value6 = "5";
    public static final java.lang.String _value7 = "6";
    public static final Camera_InfoTypeState value1 = new Camera_InfoTypeState(_value1);
    public static final Camera_InfoTypeState value2 = new Camera_InfoTypeState(_value2);
    public static final Camera_InfoTypeState value3 = new Camera_InfoTypeState(_value3);
    public static final Camera_InfoTypeState value4 = new Camera_InfoTypeState(_value4);
    public static final Camera_InfoTypeState value5 = new Camera_InfoTypeState(_value5);
    public static final Camera_InfoTypeState value6 = new Camera_InfoTypeState(_value6);
    public static final Camera_InfoTypeState value7 = new Camera_InfoTypeState(_value7);
    public java.lang.String getValue() { return _value_;}
    public static Camera_InfoTypeState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Camera_InfoTypeState enumeration = (Camera_InfoTypeState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Camera_InfoTypeState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Camera_InfoTypeState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/cctv", ">Camera_InfoType>State"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
