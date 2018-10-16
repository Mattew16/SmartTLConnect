/**
 * WeatherTypeTemperaturDepth.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.environmentsensor;

public class WeatherTypeTemperaturDepth  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private double _value;

    private com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperaturDepthDepthType depthType;  // attribute

    public WeatherTypeTemperaturDepth() {
    }

    // Simple Types must have a String constructor
    public WeatherTypeTemperaturDepth(double _value) {
        this._value = _value;
    }
    public WeatherTypeTemperaturDepth(java.lang.String _value) {
        this._value = new Double(_value).doubleValue();
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return new Double(_value).toString();
    }


    /**
     * Gets the _value value for this WeatherTypeTemperaturDepth.
     * 
     * @return _value
     */
    public double get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this WeatherTypeTemperaturDepth.
     * 
     * @param _value
     */
    public void set_value(double _value) {
        this._value = _value;
    }


    /**
     * Gets the depthType value for this WeatherTypeTemperaturDepth.
     * 
     * @return depthType
     */
    public com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperaturDepthDepthType getDepthType() {
        return depthType;
    }


    /**
     * Sets the depthType value for this WeatherTypeTemperaturDepth.
     * 
     * @param depthType
     */
    public void setDepthType(com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperaturDepthDepthType depthType) {
        this.depthType = depthType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WeatherTypeTemperaturDepth)) return false;
        WeatherTypeTemperaturDepth other = (WeatherTypeTemperaturDepth) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this._value == other.get_value() &&
            ((this.depthType==null && other.getDepthType()==null) || 
             (this.depthType!=null &&
              this.depthType.equals(other.getDepthType())));
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
        if (getDepthType() != null) {
            _hashCode += getDepthType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
