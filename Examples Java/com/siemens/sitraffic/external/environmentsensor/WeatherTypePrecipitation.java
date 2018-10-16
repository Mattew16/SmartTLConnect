/**
 * WeatherTypePrecipitation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.environmentsensor;

public class WeatherTypePrecipitation  implements java.io.Serializable {
    /* Niederschlagsintensitaet TLS:NI [mm/h] */
    private java.lang.Double value;

    /* Niederschlagswahrscheinlichkeit [%] */
    private java.lang.Short probability;

    /* Niederschlagsart TLS:NS */
    private java.lang.Short type;

    public WeatherTypePrecipitation() {
    }

    public WeatherTypePrecipitation(
           java.lang.Double value,
           java.lang.Short probability,
           java.lang.Short type) {
           this.value = value;
           this.probability = probability;
           this.type = type;
    }


    /**
     * Gets the value value for this WeatherTypePrecipitation.
     * 
     * @return value   * Niederschlagsintensitaet TLS:NI [mm/h]
     */
    public java.lang.Double getValue() {
        return value;
    }


    /**
     * Sets the value value for this WeatherTypePrecipitation.
     * 
     * @param value   * Niederschlagsintensitaet TLS:NI [mm/h]
     */
    public void setValue(java.lang.Double value) {
        this.value = value;
    }


    /**
     * Gets the probability value for this WeatherTypePrecipitation.
     * 
     * @return probability   * Niederschlagswahrscheinlichkeit [%]
     */
    public java.lang.Short getProbability() {
        return probability;
    }


    /**
     * Sets the probability value for this WeatherTypePrecipitation.
     * 
     * @param probability   * Niederschlagswahrscheinlichkeit [%]
     */
    public void setProbability(java.lang.Short probability) {
        this.probability = probability;
    }


    /**
     * Gets the type value for this WeatherTypePrecipitation.
     * 
     * @return type   * Niederschlagsart TLS:NS
     */
    public java.lang.Short getType() {
        return type;
    }


    /**
     * Sets the type value for this WeatherTypePrecipitation.
     * 
     * @param type   * Niederschlagsart TLS:NS
     */
    public void setType(java.lang.Short type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WeatherTypePrecipitation)) return false;
        WeatherTypePrecipitation other = (WeatherTypePrecipitation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.probability==null && other.getProbability()==null) || 
             (this.probability!=null &&
              this.probability.equals(other.getProbability()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getProbability() != null) {
            _hashCode += getProbability().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
