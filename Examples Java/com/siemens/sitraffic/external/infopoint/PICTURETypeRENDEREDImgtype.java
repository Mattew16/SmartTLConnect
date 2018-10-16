/**
 * PICTURETypeRENDEREDImgtype.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.infopoint;

public class PICTURETypeRENDEREDImgtype implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PICTURETypeRENDEREDImgtype(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _jpg = "jpg";
    public static final java.lang.String _gif = "gif";
    public static final java.lang.String _png = "png";
    public static final java.lang.String _other = "other";
    public static final PICTURETypeRENDEREDImgtype jpg = new PICTURETypeRENDEREDImgtype(_jpg);
    public static final PICTURETypeRENDEREDImgtype gif = new PICTURETypeRENDEREDImgtype(_gif);
    public static final PICTURETypeRENDEREDImgtype png = new PICTURETypeRENDEREDImgtype(_png);
    public static final PICTURETypeRENDEREDImgtype other = new PICTURETypeRENDEREDImgtype(_other);
    public java.lang.String getValue() { return _value_;}
    public static PICTURETypeRENDEREDImgtype fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PICTURETypeRENDEREDImgtype enumeration = (PICTURETypeRENDEREDImgtype)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PICTURETypeRENDEREDImgtype fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PICTURETypeRENDEREDImgtype.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">>PICTUREType>RENDERED>imgtype"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
