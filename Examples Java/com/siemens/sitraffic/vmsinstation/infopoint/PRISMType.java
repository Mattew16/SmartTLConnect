/**
 * PRISMType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;

public class PRISMType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;

    private java.lang.String id;  // attribute

    private org.apache.axis.types.UnsignedByte light_brightness;  // attribute

    public PRISMType() {
    }

    // Simple Types must have a String constructor
    public PRISMType(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this PRISMType.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this PRISMType.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }


    /**
     * Gets the id value for this PRISMType.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this PRISMType.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the light_brightness value for this PRISMType.
     * 
     * @return light_brightness
     */
    public org.apache.axis.types.UnsignedByte getLight_brightness() {
        return light_brightness;
    }


    /**
     * Sets the light_brightness value for this PRISMType.
     * 
     * @param light_brightness
     */
    public void setLight_brightness(org.apache.axis.types.UnsignedByte light_brightness) {
        this.light_brightness = light_brightness;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PRISMType)) return false;
        PRISMType other = (PRISMType) obj;
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
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.light_brightness==null && other.getLight_brightness()==null) || 
             (this.light_brightness!=null &&
              this.light_brightness.equals(other.getLight_brightness())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getLight_brightness() != null) {
            _hashCode += getLight_brightness().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
