/**
 * LinkControlEffectTypeRestrictiontype.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.action;

public class LinkControlEffectTypeRestrictiontype implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LinkControlEffectTypeRestrictiontype(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _capacity_abs = "capacity_abs";
    public static final java.lang.String _capacity_rel = "capacity_rel";
    public static final java.lang.String _speed_abs = "speed_abs";
    public static final java.lang.String _speed_rel = "speed_rel";
    public static final java.lang.String _lanes_blocked = "lanes_blocked";
    public static final java.lang.String _lanes_added = "lanes_added";
    public static final LinkControlEffectTypeRestrictiontype capacity_abs = new LinkControlEffectTypeRestrictiontype(_capacity_abs);
    public static final LinkControlEffectTypeRestrictiontype capacity_rel = new LinkControlEffectTypeRestrictiontype(_capacity_rel);
    public static final LinkControlEffectTypeRestrictiontype speed_abs = new LinkControlEffectTypeRestrictiontype(_speed_abs);
    public static final LinkControlEffectTypeRestrictiontype speed_rel = new LinkControlEffectTypeRestrictiontype(_speed_rel);
    public static final LinkControlEffectTypeRestrictiontype lanes_blocked = new LinkControlEffectTypeRestrictiontype(_lanes_blocked);
    public static final LinkControlEffectTypeRestrictiontype lanes_added = new LinkControlEffectTypeRestrictiontype(_lanes_added);
    public java.lang.String getValue() { return _value_;}
    public static LinkControlEffectTypeRestrictiontype fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LinkControlEffectTypeRestrictiontype enumeration = (LinkControlEffectTypeRestrictiontype)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LinkControlEffectTypeRestrictiontype fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LinkControlEffectTypeRestrictiontype.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", ">linkControlEffectType>restrictiontype"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
