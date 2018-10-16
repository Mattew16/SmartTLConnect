/**
 * LocationTypeNetNetAttributsaenderungTyp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.environmentsensor;

public class LocationTypeNetNetAttributsaenderungTyp implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LocationTypeNetNetAttributsaenderungTyp(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Kapazitaet = "Kapazitaet";
    public static final java.lang.String _Geschwindigkeit = "Geschwindigkeit";
    public static final java.lang.String _AnzahlSpuren = "AnzahlSpuren";
    public static final java.lang.String _Andere = "Andere";
    public static final LocationTypeNetNetAttributsaenderungTyp Kapazitaet = new LocationTypeNetNetAttributsaenderungTyp(_Kapazitaet);
    public static final LocationTypeNetNetAttributsaenderungTyp Geschwindigkeit = new LocationTypeNetNetAttributsaenderungTyp(_Geschwindigkeit);
    public static final LocationTypeNetNetAttributsaenderungTyp AnzahlSpuren = new LocationTypeNetNetAttributsaenderungTyp(_AnzahlSpuren);
    public static final LocationTypeNetNetAttributsaenderungTyp Andere = new LocationTypeNetNetAttributsaenderungTyp(_Andere);
    public java.lang.String getValue() { return _value_;}
    public static LocationTypeNetNetAttributsaenderungTyp fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LocationTypeNetNetAttributsaenderungTyp enumeration = (LocationTypeNetNetAttributsaenderungTyp)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LocationTypeNetNetAttributsaenderungTyp fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LocationTypeNetNetAttributsaenderungTyp.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">>>>LocationType>Net>Net>Attributsaenderung>Typ"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
