/**
 * LocationTypeGeomSystem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;

public class LocationTypeGeomSystem implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LocationTypeGeomSystem(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _WGS84 = "WGS84";
    public static final java.lang.String _GaussKrueger = "GaussKrueger";
    public static final java.lang.String _AnderesNetz = "AnderesNetz";
    public static final LocationTypeGeomSystem WGS84 = new LocationTypeGeomSystem(_WGS84);
    public static final LocationTypeGeomSystem GaussKrueger = new LocationTypeGeomSystem(_GaussKrueger);
    public static final LocationTypeGeomSystem AnderesNetz = new LocationTypeGeomSystem(_AnderesNetz);
    public java.lang.String getValue() { return _value_;}
    public static LocationTypeGeomSystem fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LocationTypeGeomSystem enumeration = (LocationTypeGeomSystem)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LocationTypeGeomSystem fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LocationTypeGeomSystem.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">>LocationType>Geom>System"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
