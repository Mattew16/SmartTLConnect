/**
 * DataTypeWeather.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.environmentsensor;

public class DataTypeWeather  implements java.io.Serializable {
    /* current values */
    private com.siemens.sitraffic.external.environmentsensor.WeatherType measurement;

    /* predicted values */
    private com.siemens.sitraffic.external.environmentsensor.DataTypeWeatherForecast[] forecast;

    public DataTypeWeather() {
    }

    public DataTypeWeather(
           com.siemens.sitraffic.external.environmentsensor.WeatherType measurement,
           com.siemens.sitraffic.external.environmentsensor.DataTypeWeatherForecast[] forecast) {
           this.measurement = measurement;
           this.forecast = forecast;
    }


    /**
     * Gets the measurement value for this DataTypeWeather.
     * 
     * @return measurement   * current values
     */
    public com.siemens.sitraffic.external.environmentsensor.WeatherType getMeasurement() {
        return measurement;
    }


    /**
     * Sets the measurement value for this DataTypeWeather.
     * 
     * @param measurement   * current values
     */
    public void setMeasurement(com.siemens.sitraffic.external.environmentsensor.WeatherType measurement) {
        this.measurement = measurement;
    }


    /**
     * Gets the forecast value for this DataTypeWeather.
     * 
     * @return forecast   * predicted values
     */
    public com.siemens.sitraffic.external.environmentsensor.DataTypeWeatherForecast[] getForecast() {
        return forecast;
    }


    /**
     * Sets the forecast value for this DataTypeWeather.
     * 
     * @param forecast   * predicted values
     */
    public void setForecast(com.siemens.sitraffic.external.environmentsensor.DataTypeWeatherForecast[] forecast) {
        this.forecast = forecast;
    }

    public com.siemens.sitraffic.external.environmentsensor.DataTypeWeatherForecast getForecast(int i) {
        return this.forecast[i];
    }

    public void setForecast(int i, com.siemens.sitraffic.external.environmentsensor.DataTypeWeatherForecast _value) {
        this.forecast[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataTypeWeather)) return false;
        DataTypeWeather other = (DataTypeWeather) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.measurement==null && other.getMeasurement()==null) || 
             (this.measurement!=null &&
              this.measurement.equals(other.getMeasurement()))) &&
            ((this.forecast==null && other.getForecast()==null) || 
             (this.forecast!=null &&
              java.util.Arrays.equals(this.forecast, other.getForecast())));
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
        if (getMeasurement() != null) {
            _hashCode += getMeasurement().hashCode();
        }
        if (getForecast() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForecast());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForecast(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
