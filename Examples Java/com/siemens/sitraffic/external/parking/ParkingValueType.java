/**
 * ParkingValueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.parking;

public class ParkingValueType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ParkingValueType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _longterm = "longterm";
    public static final java.lang.String _shortterm = "shortterm";
    public static final java.lang.String _car = "car";
    public static final java.lang.String _truck = "truck";
    public static final java.lang.String _all = "all";
    public static final java.lang.String _other = "other";
    public static final ParkingValueType longterm = new ParkingValueType(_longterm);
    public static final ParkingValueType shortterm = new ParkingValueType(_shortterm);
    public static final ParkingValueType car = new ParkingValueType(_car);
    public static final ParkingValueType truck = new ParkingValueType(_truck);
    public static final ParkingValueType all = new ParkingValueType(_all);
    public static final ParkingValueType other = new ParkingValueType(_other);
    public java.lang.String getValue() { return _value_;}
    public static ParkingValueType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ParkingValueType enumeration = (ParkingValueType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ParkingValueType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ParkingValueType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/parking", ">ParkingValue>Type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
