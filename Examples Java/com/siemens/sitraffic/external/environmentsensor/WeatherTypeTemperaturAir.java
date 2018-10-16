/**
 * WeatherTypeTemperaturAir.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.environmentsensor;

public class WeatherTypeTemperaturAir  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private double _value;

    private java.lang.Double min;  // attribute

    private java.lang.Double max;  // attribute

    public WeatherTypeTemperaturAir() {
    }

    // Simple Types must have a String constructor
    public WeatherTypeTemperaturAir(double _value) {
        this._value = _value;
    }
    public WeatherTypeTemperaturAir(java.lang.String _value) {
        this._value = new Double(_value).doubleValue();
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return new Double(_value).toString();
    }


    /**
     * Gets the _value value for this WeatherTypeTemperaturAir.
     * 
     * @return _value
     */
    public double get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this WeatherTypeTemperaturAir.
     * 
     * @param _value
     */
    public void set_value(double _value) {
        this._value = _value;
    }


    /**
     * Gets the min value for this WeatherTypeTemperaturAir.
     * 
     * @return min
     */
    public java.lang.Double getMin() {
        return min;
    }


    /**
     * Sets the min value for this WeatherTypeTemperaturAir.
     * 
     * @param min
     */
    public void setMin(java.lang.Double min) {
        this.min = min;
    }


    /**
     * Gets the max value for this WeatherTypeTemperaturAir.
     * 
     * @return max
     */
    public java.lang.Double getMax() {
        return max;
    }


    /**
     * Sets the max value for this WeatherTypeTemperaturAir.
     * 
     * @param max
     */
    public void setMax(java.lang.Double max) {
        this.max = max;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WeatherTypeTemperaturAir)) return false;
        WeatherTypeTemperaturAir other = (WeatherTypeTemperaturAir) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this._value == other.get_value() &&
            ((this.min==null && other.getMin()==null) || 
             (this.min!=null &&
              this.min.equals(other.getMin()))) &&
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
        if (getMin() != null) {
            _hashCode += getMin().hashCode();
        }
        if (getMax() != null) {
            _hashCode += getMax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
