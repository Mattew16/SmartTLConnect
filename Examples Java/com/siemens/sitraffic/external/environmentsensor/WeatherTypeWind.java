/**
 * WeatherTypeWind.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.environmentsensor;

public class WeatherTypeWind  implements java.io.Serializable {
    /* Windgeschwindigkeit TLS:WGM/TLS:WGS [m/s] */
    private com.siemens.sitraffic.external.environmentsensor.WeatherTypeWindSpeed speed;

    /* Windrichtung [°] (0°==Nord; 90°==Ost;...) */
    private java.lang.Integer direction;

    public WeatherTypeWind() {
    }

    public WeatherTypeWind(
           com.siemens.sitraffic.external.environmentsensor.WeatherTypeWindSpeed speed,
           java.lang.Integer direction) {
           this.speed = speed;
           this.direction = direction;
    }


    /**
     * Gets the speed value for this WeatherTypeWind.
     * 
     * @return speed   * Windgeschwindigkeit TLS:WGM/TLS:WGS [m/s]
     */
    public com.siemens.sitraffic.external.environmentsensor.WeatherTypeWindSpeed getSpeed() {
        return speed;
    }


    /**
     * Sets the speed value for this WeatherTypeWind.
     * 
     * @param speed   * Windgeschwindigkeit TLS:WGM/TLS:WGS [m/s]
     */
    public void setSpeed(com.siemens.sitraffic.external.environmentsensor.WeatherTypeWindSpeed speed) {
        this.speed = speed;
    }


    /**
     * Gets the direction value for this WeatherTypeWind.
     * 
     * @return direction   * Windrichtung [°] (0°==Nord; 90°==Ost;...)
     */
    public java.lang.Integer getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this WeatherTypeWind.
     * 
     * @param direction   * Windrichtung [°] (0°==Nord; 90°==Ost;...)
     */
    public void setDirection(java.lang.Integer direction) {
        this.direction = direction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WeatherTypeWind)) return false;
        WeatherTypeWind other = (WeatherTypeWind) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.speed==null && other.getSpeed()==null) || 
             (this.speed!=null &&
              this.speed.equals(other.getSpeed()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection())));
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
        if (getSpeed() != null) {
            _hashCode += getSpeed().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
