/**
 * VehicleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;

public class VehicleType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VehicleType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _all = "all";
    public static final java.lang.String _car = "car";
    public static final java.lang.String _truck = "truck";
    public static final java.lang.String _delivery_truck = "delivery_truck";
    public static final java.lang.String _motorcycle = "motorcycle";
    public static final java.lang.String _unclassified = "unclassified";
    public static final java.lang.String _car_with_trailer = "car_with_trailer";
    public static final java.lang.String _truck_with_trailer = "truck_with_trailer";
    public static final java.lang.String _truck_with_semi_trailer = "truck_with_semi_trailer";
    public static final java.lang.String _bus = "bus";
    public static final VehicleType all = new VehicleType(_all);
    public static final VehicleType car = new VehicleType(_car);
    public static final VehicleType truck = new VehicleType(_truck);
    public static final VehicleType delivery_truck = new VehicleType(_delivery_truck);
    public static final VehicleType motorcycle = new VehicleType(_motorcycle);
    public static final VehicleType unclassified = new VehicleType(_unclassified);
    public static final VehicleType car_with_trailer = new VehicleType(_car_with_trailer);
    public static final VehicleType truck_with_trailer = new VehicleType(_truck_with_trailer);
    public static final VehicleType truck_with_semi_trailer = new VehicleType(_truck_with_semi_trailer);
    public static final VehicleType bus = new VehicleType(_bus);
    public java.lang.String getValue() { return _value_;}
    public static VehicleType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VehicleType enumeration = (VehicleType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VehicleType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VehicleType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "vehicleType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
