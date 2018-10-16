/**
 * ParkingValueCapacity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.parking;

public class ParkingValueCapacity  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private int _value;

    private java.lang.Integer overload;  // attribute

    private java.lang.Integer max;  // attribute

    public ParkingValueCapacity() {
    }

    // Simple Types must have a String constructor
    public ParkingValueCapacity(int _value) {
        this._value = _value;
    }
    public ParkingValueCapacity(java.lang.String _value) {
        this._value = new Integer(_value).intValue();
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return new Integer(_value).toString();
    }


    /**
     * Gets the _value value for this ParkingValueCapacity.
     * 
     * @return _value
     */
    public int get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this ParkingValueCapacity.
     * 
     * @param _value
     */
    public void set_value(int _value) {
        this._value = _value;
    }


    /**
     * Gets the overload value for this ParkingValueCapacity.
     * 
     * @return overload
     */
    public java.lang.Integer getOverload() {
        return overload;
    }


    /**
     * Sets the overload value for this ParkingValueCapacity.
     * 
     * @param overload
     */
    public void setOverload(java.lang.Integer overload) {
        this.overload = overload;
    }


    /**
     * Gets the max value for this ParkingValueCapacity.
     * 
     * @return max
     */
    public java.lang.Integer getMax() {
        return max;
    }


    /**
     * Sets the max value for this ParkingValueCapacity.
     * 
     * @param max
     */
    public void setMax(java.lang.Integer max) {
        this.max = max;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParkingValueCapacity)) return false;
        ParkingValueCapacity other = (ParkingValueCapacity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this._value == other.get_value() &&
            ((this.overload==null && other.getOverload()==null) || 
             (this.overload!=null &&
              this.overload.equals(other.getOverload()))) &&
            ((this.max==null && other.getMax()==null) || 
             (this.max!=null &&
              this.max.equals(other.getMax())));
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
        if (getOverload() != null) {
            _hashCode += getOverload().hashCode();
        }
        if (getMax() != null) {
            _hashCode += getMax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
