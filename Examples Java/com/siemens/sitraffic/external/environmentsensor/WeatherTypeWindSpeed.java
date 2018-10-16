/**
 * WeatherTypeWindSpeed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.environmentsensor;

public class WeatherTypeWindSpeed  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private double _value;

    private java.lang.Double max;  // attribute

    public WeatherTypeWindSpeed() {
    }

    // Simple Types must have a String constructor
    public WeatherTypeWindSpeed(double _value) {
        this._value = _value;
    }
    public WeatherTypeWindSpeed(java.lang.String _value) {
        this._value = new Double(_value).doubleValue();
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return new Double(_value).toString();
    }


    /**
     * Gets the _value value for this WeatherTypeWindSpeed.
     * 
     * @return _value
     */
    public double get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this WeatherTypeWindSpeed.
     * 
     * @param _value
     */
    public void set_value(double _value) {
        this._value = _value;
    }


    /**
     * Gets the max value for this WeatherTypeWindSpeed.
     * 
     * @return max
     */
    public java.lang.Double getMax() {
        return max;
    }


    /**
     * Sets the max value for this WeatherTypeWindSpeed.
     * 
     * @param max
     */
    public void setMax(java.lang.Double max) {
        this.max = max;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WeatherTypeWindSpeed)) return false;
        WeatherTypeWindSpeed other = (WeatherTypeWindSpeed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this._value == other.get_value() &&
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
        _hashCode += new Double(get_value()).hashCode();
        if (getMax() != null) {
            _hashCode += getMax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
