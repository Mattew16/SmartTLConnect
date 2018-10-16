/**
 * DataTypeWeatherForecast.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.environmentsensor;

public class DataTypeWeatherForecast  extends com.siemens.sitraffic.external.environmentsensor.WeatherType  implements java.io.Serializable {
    private java.lang.String predictionClass;  // attribute

    public DataTypeWeatherForecast() {
    }

    public DataTypeWeatherForecast(
           com.siemens.sitraffic.external.environmentsensor.WeatherTypePrecipitation precipitation,
           com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperatur temperatur,
           com.siemens.sitraffic.external.environmentsensor.WeatherTypeWind wind,
           java.lang.Integer humidity,
           java.lang.Integer barometricPressure,
           org.apache.axis.types.Time sunrise,
           org.apache.axis.types.Time sunset,
           java.lang.Integer visibility,
           java.lang.Integer lightness,
           com.siemens.sitraffic.external.environmentsensor.WeatherTypeStateOfLane stateOfLane,
           java.lang.Double laneWetness,
           java.lang.Integer snowHight,
           java.lang.Integer salt,
           java.lang.String textInfo,
           java.lang.Short sunIntensity,
           java.lang.Short cloudDegree,
           java.lang.String predictionClass) {
        super(
            precipitation,
            temperatur,
            wind,
            humidity,
            barometricPressure,
            sunrise,
            sunset,
            visibility,
            lightness,
            stateOfLane,
            laneWetness,
            snowHight,
            salt,
            textInfo,
            sunIntensity,
            cloudDegree);
        this.predictionClass = predictionClass;
    }


    /**
     * Gets the predictionClass value for this DataTypeWeatherForecast.
     * 
     * @return predictionClass
     */
    public java.lang.String getPredictionClass() {
        return predictionClass;
    }


    /**
     * Sets the predictionClass value for this DataTypeWeatherForecast.
     * 
     * @param predictionClass
     */
    public void setPredictionClass(java.lang.String predictionClass) {
        this.predictionClass = predictionClass;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataTypeWeatherForecast)) return false;
        DataTypeWeatherForecast other = (DataTypeWeatherForecast) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.predictionClass==null && other.getPredictionClass()==null) || 
             (this.predictionClass!=null &&
              this.predictionClass.equals(other.getPredictionClass())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPredictionClass() != null) {
            _hashCode += getPredictionClass().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
