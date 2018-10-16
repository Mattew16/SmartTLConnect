/**
 * WeatherTypeTemperatur.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.environmentsensor;

public class WeatherTypeTemperatur  implements java.io.Serializable {
    /* Lufttemperatur TLS:LT [°C] */
    private com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperaturAir air;

    /* Fahrbahntemperatur TLS:FBT [°C] */
    private java.lang.Double lane;

    /* Gefriertemperatur TLS:GT [°C] */
    private java.lang.Double freezing;

    /* Tautemperatur TLS:TPT [°C] */
    private java.lang.Double dewpoint;

    /* Bodentemperatur TLS:TTx [°C] */
    private com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperaturDepth[] depth;

    public WeatherTypeTemperatur() {
    }

    public WeatherTypeTemperatur(
           com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperaturAir air,
           java.lang.Double lane,
           java.lang.Double freezing,
           java.lang.Double dewpoint,
           com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperaturDepth[] depth) {
           this.air = air;
           this.lane = lane;
           this.freezing = freezing;
           this.dewpoint = dewpoint;
           this.depth = depth;
    }


    /**
     * Gets the air value for this WeatherTypeTemperatur.
     * 
     * @return air   * Lufttemperatur TLS:LT [°C]
     */
    public com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperaturAir getAir() {
        return air;
    }


    /**
     * Sets the air value for this WeatherTypeTemperatur.
     * 
     * @param air   * Lufttemperatur TLS:LT [°C]
     */
    public void setAir(com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperaturAir air) {
        this.air = air;
    }


    /**
     * Gets the lane value for this WeatherTypeTemperatur.
     * 
     * @return lane   * Fahrbahntemperatur TLS:FBT [°C]
     */
    public java.lang.Double getLane() {
        return lane;
    }


    /**
     * Sets the lane value for this WeatherTypeTemperatur.
     * 
     * @param lane   * Fahrbahntemperatur TLS:FBT [°C]
     */
    public void setLane(java.lang.Double lane) {
        this.lane = lane;
    }


    /**
     * Gets the freezing value for this WeatherTypeTemperatur.
     * 
     * @return freezing   * Gefriertemperatur TLS:GT [°C]
     */
    public java.lang.Double getFreezing() {
        return freezing;
    }


    /**
     * Sets the freezing value for this WeatherTypeTemperatur.
     * 
     * @param freezing   * Gefriertemperatur TLS:GT [°C]
     */
    public void setFreezing(java.lang.Double freezing) {
        this.freezing = freezing;
    }


    /**
     * Gets the dewpoint value for this WeatherTypeTemperatur.
     * 
     * @return dewpoint   * Tautemperatur TLS:TPT [°C]
     */
    public java.lang.Double getDewpoint() {
        return dewpoint;
    }


    /**
     * Sets the dewpoint value for this WeatherTypeTemperatur.
     * 
     * @param dewpoint   * Tautemperatur TLS:TPT [°C]
     */
    public void setDewpoint(java.lang.Double dewpoint) {
        this.dewpoint = dewpoint;
    }


    /**
     * Gets the depth value for this WeatherTypeTemperatur.
     * 
     * @return depth   * Bodentemperatur TLS:TTx [°C]
     */
    public com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperaturDepth[] getDepth() {
        return depth;
    }


    /**
     * Sets the depth value for this WeatherTypeTemperatur.
     * 
     * @param depth   * Bodentemperatur TLS:TTx [°C]
     */
    public void setDepth(com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperaturDepth[] depth) {
        this.depth = depth;
    }

    public com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperaturDepth getDepth(int i) {
        return this.depth[i];
    }

    public void setDepth(int i, com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperaturDepth _value) {
        this.depth[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WeatherTypeTemperatur)) return false;
        WeatherTypeTemperatur other = (WeatherTypeTemperatur) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.air==null && other.getAir()==null) || 
             (this.air!=null &&
              this.air.equals(other.getAir()))) &&
            ((this.lane==null && other.getLane()==null) || 
             (this.lane!=null &&
              this.lane.equals(other.getLane()))) &&
            ((this.freezing==null && other.getFreezing()==null) || 
             (this.freezing!=null &&
              this.freezing.equals(other.getFreezing()))) &&
            ((this.dewpoint==null && other.getDewpoint()==null) || 
             (this.dewpoint!=null &&
              this.dewpoint.equals(other.getDewpoint()))) &&
            ((this.depth==null && other.getDepth()==null) || 
             (this.depth!=null &&
              java.util.Arrays.equals(this.depth, other.getDepth())));
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
        if (getAir() != null) {
            _hashCode += getAir().hashCode();
        }
        if (getLane() != null) {
            _hashCode += getLane().hashCode();
        }
        if (getFreezing() != null) {
            _hashCode += getFreezing().hashCode();
        }
        if (getDewpoint() != null) {
            _hashCode += getDewpoint().hashCode();
        }
        if (getDepth() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepth());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepth(), i);
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
