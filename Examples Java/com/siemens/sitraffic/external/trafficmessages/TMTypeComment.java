/**
 * TMTypeComment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficmessages;

public class TMTypeComment  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;

    private java.lang.Boolean publicFlag;  // attribute

    public TMTypeComment() {
    }

    // Simple Types must have a String constructor
    public TMTypeComment(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this TMTypeComment.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this TMTypeComment.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }


    /**
     * Gets the publicFlag value for this TMTypeComment.
     * 
     * @return publicFlag
     */
    public java.lang.Boolean getPublicFlag() {
        return publicFlag;
    }


    /**
     * Sets the publicFlag value for this TMTypeComment.
     * 
     * @param publicFlag
     */
    public void setPublicFlag(java.lang.Boolean publicFlag) {
        this.publicFlag = publicFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TMTypeComment)) return false;
        TMTypeComment other = (TMTypeComment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              this._value.equals(other.get_value()))) &&
            ((this.publicFlag==null && other.getPublicFlag()==null) || 
             (this.publicFlag!=null &&
              this.publicFlag.equals(other.getPublicFlag())));
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
        if (get_value() != null) {
            _hashCode += get_value().hashCode();
        }
        if (getPublicFlag() != null) {
            _hashCode += getPublicFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
