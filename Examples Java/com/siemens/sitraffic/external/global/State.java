/**
 * State.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.global;

public class State implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected State(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "o.k.";
    public static final java.lang.String _value2 = "n.o.k.";
    public static final java.lang.String _value3 = "p.o.k.";
    public static final java.lang.String _value4 = "unknown";
    public static final java.lang.String _value5 = "offline";
    public static final java.lang.String _value6 = "busy";
    public static final java.lang.String _value7 = "substitute_value";
    public static final java.lang.String _value8 = "switch";
    public static final State value1 = new State(_value1);
    public static final State value2 = new State(_value2);
    public static final State value3 = new State(_value3);
    public static final State value4 = new State(_value4);
    public static final State value5 = new State(_value5);
    public static final State value6 = new State(_value6);
    public static final State value7 = new State(_value7);
    public static final State value8 = new State(_value8);
    public java.lang.String getValue() { return _value_;}
    public static State fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        State enumeration = (State)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static State fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(State.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/global", "State"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
