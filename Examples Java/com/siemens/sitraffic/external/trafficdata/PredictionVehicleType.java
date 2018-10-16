/**
 * PredictionVehicleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;

public class PredictionVehicleType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PredictionVehicleType(java.lang.String value) {
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
    public static final java.lang.String _urban_bus = "urban_bus";
    public static final PredictionVehicleType all = new PredictionVehicleType(_all);
    public static final PredictionVehicleType car = new PredictionVehicleType(_car);
    public static final PredictionVehicleType truck = new PredictionVehicleType(_truck);
    public static final PredictionVehicleType delivery_truck = new PredictionVehicleType(_delivery_truck);
    public static final PredictionVehicleType motorcycle = new PredictionVehicleType(_motorcycle);
    public static final PredictionVehicleType unclassified = new PredictionVehicleType(_unclassified);
    public static final PredictionVehicleType car_with_trailer = new PredictionVehicleType(_car_with_trailer);
    public static final PredictionVehicleType truck_with_trailer = new PredictionVehicleType(_truck_with_trailer);
    public static final PredictionVehicleType truck_with_semi_trailer = new PredictionVehicleType(_truck_with_semi_trailer);
    public static final PredictionVehicleType bus = new PredictionVehicleType(_bus);
    public static final PredictionVehicleType urban_bus = new PredictionVehicleType(_urban_bus);
    public java.lang.String getValue() { return _value_;}
    public static PredictionVehicleType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PredictionVehicleType enumeration = (PredictionVehicleType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PredictionVehicleType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PredictionVehicleType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "predictionVehicleType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
