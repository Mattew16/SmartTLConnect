/**
 * Effect_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;

public class Effect_enum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Effect_enum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Scroll_Left2Right = "Scroll_Left2Right";
    public static final java.lang.String _Scroll_Right2Left = "Scroll_Right2Left";
    public static final java.lang.String _Scroll_Top2Bottom = "Scroll_Top2Bottom";
    public static final java.lang.String _Scroll_Bottom2Top = "Scroll_Bottom2Top";
    public static final java.lang.String _snow = "snow";
    public static final java.lang.String _flash = "flash";
    public static final Effect_enum Scroll_Left2Right = new Effect_enum(_Scroll_Left2Right);
    public static final Effect_enum Scroll_Right2Left = new Effect_enum(_Scroll_Right2Left);
    public static final Effect_enum Scroll_Top2Bottom = new Effect_enum(_Scroll_Top2Bottom);
    public static final Effect_enum Scroll_Bottom2Top = new Effect_enum(_Scroll_Bottom2Top);
    public static final Effect_enum snow = new Effect_enum(_snow);
    public static final Effect_enum flash = new Effect_enum(_flash);
    public java.lang.String getValue() { return _value_;}
    public static Effect_enum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Effect_enum enumeration = (Effect_enum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Effect_enum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Effect_enum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "effect_enum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
