/**
 * DataTypeEnvironmentForecast.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.environmentsensor;

public class DataTypeEnvironmentForecast  extends com.siemens.sitraffic.external.environmentsensor.EnvironmentType  implements java.io.Serializable {
    private java.lang.String predictionClass;  // attribute

    public DataTypeEnvironmentForecast() {
    }

    public DataTypeEnvironmentForecast(
           java.lang.Double o3,
           java.lang.Double SOx,
           java.lang.Double NOx,
           java.lang.Double NO2,
           java.lang.Double NO,
           java.lang.Double CO,
           java.lang.Double CO2,
           java.lang.Double dust,
           java.lang.String textInfo,
           java.lang.Double benzene,
           java.lang.Double c_pm,
           java.lang.Double PM10,
           java.lang.Double PM25,
           java.lang.Double noise,
           java.lang.String predictionClass) {
        super(
            o3,
            SOx,
            NOx,
            NO2,
            NO,
            CO,
            CO2,
            dust,
            textInfo,
            benzene,
            c_pm,
            PM10,
            PM25,
            noise);
        this.predictionClass = predictionClass;
    }


    /**
     * Gets the predictionClass value for this DataTypeEnvironmentForecast.
     * 
     * @return predictionClass
     */
    public java.lang.String getPredictionClass() {
        return predictionClass;
    }


    /**
     * Sets the predictionClass value for this DataTypeEnvironmentForecast.
     * 
     * @param predictionClass
     */
    public void setPredictionClass(java.lang.String predictionClass) {
        this.predictionClass = predictionClass;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataTypeEnvironmentForecast)) return false;
        DataTypeEnvironmentForecast other = (DataTypeEnvironmentForecast) obj;
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
