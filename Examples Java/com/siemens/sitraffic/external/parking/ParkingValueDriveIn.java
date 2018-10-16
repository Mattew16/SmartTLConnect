/**
 * ParkingValueDriveIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.parking;

public class ParkingValueDriveIn  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private int _value;

    private org.apache.axis.types.UnsignedInt interval;  // attribute

    public ParkingValueDriveIn() {
    }

    // Simple Types must have a String constructor
    public ParkingValueDriveIn(int _value) {
        this._value = _value;
    }
    public ParkingValueDriveIn(java.lang.String _value) {
        this._value = new Integer(_value).intValue();
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return new Integer(_value).toString();
    }


    /**
     * Gets the _value value for this ParkingValueDriveIn.
     * 
     * @return _value
     */
    public int get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this ParkingValueDriveIn.
     * 
     * @param _value
     */
    public void set_value(int _value) {
        this._value = _value;
    }


    /**
     * Gets the interval value for this ParkingValueDriveIn.
     * 
     * @return interval
     */
    public org.apache.axis.types.UnsignedInt getInterval() {
        return interval;
    }


    /**
     * Sets the interval value for this ParkingValueDriveIn.
     * 
     * @param interval
     */
    public void setInterval(org.apache.axis.types.UnsignedInt interval) {
        this.interval = interval;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParkingValueDriveIn)) return false;
        ParkingValueDriveIn other = (ParkingValueDriveIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this._value == other.get_value() &&
            ((this.interval==null && other.getInterval()==null) || 
             (this.interval!=null &&
              this.interval.equals(other.getInterval())));
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
        if (getInterval() != null) {
            _hashCode += getInterval().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
