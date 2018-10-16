/**
 * WeatherTypeStateOfLane.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.environmentsensor;

public class WeatherTypeStateOfLane implements java.io.Serializable {
    private int _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WeatherTypeStateOfLane(int value) {
        _value_ = value;
        _table_.put(new java.lang.Integer(_value_),this);
    }

    public static final int _value1 = 0;
    public static final int _value2 = 1;
    public static final int _value3 = 32;
    public static final int _value4 = 64;
    public static final int _value5 = 65;
    public static final int _value6 = 66;
    public static final int _value7 = 67;
    public static final int _value8 = 255;
    public static final WeatherTypeStateOfLane value1 = new WeatherTypeStateOfLane(_value1);
    public static final WeatherTypeStateOfLane value2 = new WeatherTypeStateOfLane(_value2);
    public static final WeatherTypeStateOfLane value3 = new WeatherTypeStateOfLane(_value3);
    public static final WeatherTypeStateOfLane value4 = new WeatherTypeStateOfLane(_value4);
    public static final WeatherTypeStateOfLane value5 = new WeatherTypeStateOfLane(_value5);
    public static final WeatherTypeStateOfLane value6 = new WeatherTypeStateOfLane(_value6);
    public static final WeatherTypeStateOfLane value7 = new WeatherTypeStateOfLane(_value7);
    public static final WeatherTypeStateOfLane value8 = new WeatherTypeStateOfLane(_value8);
    public int getValue() { return _value_;}
    public static WeatherTypeStateOfLane fromValue(int value)
          throws java.lang.IllegalArgumentException {
        WeatherTypeStateOfLane enumeration = (WeatherTypeStateOfLane)
            _table_.get(new java.lang.Integer(value));
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static WeatherTypeStateOfLane fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(java.lang.Integer.parseInt(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return java.lang.String.valueOf(_value_);}
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
        new org.apache.axis.description.TypeDesc(WeatherTypeStateOfLane.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">WeatherType>StateOfLane"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
