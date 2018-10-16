/**
 * RestrictionTypeCapacity_reduction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficmessages;

public class RestrictionTypeCapacity_reduction  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private int _value;

    private com.siemens.sitraffic.external.trafficmessages.RestrictionTypeCapacity_reductionKind kind;  // attribute

    private java.lang.String name;  // attribute

    public RestrictionTypeCapacity_reduction() {
    }

    // Simple Types must have a String constructor
    public RestrictionTypeCapacity_reduction(int _value) {
        this._value = _value;
    }
    public RestrictionTypeCapacity_reduction(java.lang.String _value) {
        this._value = new Integer(_value).intValue();
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return new Integer(_value).toString();
    }


    /**
     * Gets the _value value for this RestrictionTypeCapacity_reduction.
     * 
     * @return _value
     */
    public int get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this RestrictionTypeCapacity_reduction.
     * 
     * @param _value
     */
    public void set_value(int _value) {
        this._value = _value;
    }


    /**
     * Gets the kind value for this RestrictionTypeCapacity_reduction.
     * 
     * @return kind
     */
    public com.siemens.sitraffic.external.trafficmessages.RestrictionTypeCapacity_reductionKind getKind() {
        return kind;
    }


    /**
     * Sets the kind value for this RestrictionTypeCapacity_reduction.
     * 
     * @param kind
     */
    public void setKind(com.siemens.sitraffic.external.trafficmessages.RestrictionTypeCapacity_reductionKind kind) {
        this.kind = kind;
    }


    /**
     * Gets the name value for this RestrictionTypeCapacity_reduction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RestrictionTypeCapacity_reduction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RestrictionTypeCapacity_reduction)) return false;
        RestrictionTypeCapacity_reduction other = (RestrictionTypeCapacity_reduction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this._value == other.get_value() &&
            ((this.kind==null && other.getKind()==null) || 
             (this.kind!=null &&
              this.kind.equals(other.getKind()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += get_value();
        if (getKind() != null) {
            _hashCode += getKind().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
