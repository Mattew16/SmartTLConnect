/**
 * TMTypeExAddInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficmessages;

public class TMTypeExAddInfo  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;

    private java.lang.String infoType;  // attribute

    public TMTypeExAddInfo() {
    }

    // Simple Types must have a String constructor
    public TMTypeExAddInfo(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this TMTypeExAddInfo.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this TMTypeExAddInfo.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }


    /**
     * Gets the infoType value for this TMTypeExAddInfo.
     * 
     * @return infoType
     */
    public java.lang.String getInfoType() {
        return infoType;
    }


    /**
     * Sets the infoType value for this TMTypeExAddInfo.
     * 
     * @param infoType
     */
    public void setInfoType(java.lang.String infoType) {
        this.infoType = infoType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TMTypeExAddInfo)) return false;
        TMTypeExAddInfo other = (TMTypeExAddInfo) obj;
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
            ((this.infoType==null && other.getInfoType()==null) || 
             (this.infoType!=null &&
              this.infoType.equals(other.getInfoType())));
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
        if (getInfoType() != null) {
            _hashCode += getInfoType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
