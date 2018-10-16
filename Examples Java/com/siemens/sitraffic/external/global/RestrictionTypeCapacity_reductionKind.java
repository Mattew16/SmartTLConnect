/**
 * RestrictionTypeCapacity_reductionKind.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.global;

public class RestrictionTypeCapacity_reductionKind implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RestrictionTypeCapacity_reductionKind(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _inCount = "inCount";
    public static final java.lang.String _inSpeed = "inSpeed";
    public static final RestrictionTypeCapacity_reductionKind inCount = new RestrictionTypeCapacity_reductionKind(_inCount);
    public static final RestrictionTypeCapacity_reductionKind inSpeed = new RestrictionTypeCapacity_reductionKind(_inSpeed);
    public java.lang.String getValue() { return _value_;}
    public static RestrictionTypeCapacity_reductionKind fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RestrictionTypeCapacity_reductionKind enumeration = (RestrictionTypeCapacity_reductionKind)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RestrictionTypeCapacity_reductionKind fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RestrictionTypeCapacity_reductionKind.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/global", ">>restrictionType>capacity_reduction>kind"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
