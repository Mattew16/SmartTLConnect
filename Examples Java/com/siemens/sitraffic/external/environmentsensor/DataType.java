/**
 * DataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.environmentsensor;

public class DataType  implements java.io.Serializable {
    private java.lang.String id;

    private com.siemens.sitraffic.external.environmentsensor.Time time;

    /* weather information values */
    private com.siemens.sitraffic.external.environmentsensor.DataTypeWeather weather;

    /* environment information values */
    private com.siemens.sitraffic.external.environmentsensor.DataTypeEnvironment environment;

    /* General state */
    private com.siemens.sitraffic.external.environmentsensor.State state;

    public DataType() {
    }

    public DataType(
           java.lang.String id,
           com.siemens.sitraffic.external.environmentsensor.Time time,
           com.siemens.sitraffic.external.environmentsensor.DataTypeWeather weather,
           com.siemens.sitraffic.external.environmentsensor.DataTypeEnvironment environment,
           com.siemens.sitraffic.external.environmentsensor.State state) {
           this.id = id;
           this.time = time;
           this.weather = weather;
           this.environment = environment;
           this.state = state;
    }


    /**
     * Gets the id value for this DataType.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this DataType.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the time value for this DataType.
     * 
     * @return time
     */
    public com.siemens.sitraffic.external.environmentsensor.Time getTime() {
        return time;
    }


    /**
     * Sets the time value for this DataType.
     * 
     * @param time
     */
    public void setTime(com.siemens.sitraffic.external.environmentsensor.Time time) {
        this.time = time;
    }


    /**
     * Gets the weather value for this DataType.
     * 
     * @return weather   * weather information values
     */
    public com.siemens.sitraffic.external.environmentsensor.DataTypeWeather getWeather() {
        return weather;
    }


    /**
     * Sets the weather value for this DataType.
     * 
     * @param weather   * weather information values
     */
    public void setWeather(com.siemens.sitraffic.external.environmentsensor.DataTypeWeather weather) {
        this.weather = weather;
    }


    /**
     * Gets the environment value for this DataType.
     * 
     * @return environment   * environment information values
     */
    public com.siemens.sitraffic.external.environmentsensor.DataTypeEnvironment getEnvironment() {
        return environment;
    }


    /**
     * Sets the environment value for this DataType.
     * 
     * @param environment   * environment information values
     */
    public void setEnvironment(com.siemens.sitraffic.external.environmentsensor.DataTypeEnvironment environment) {
        this.environment = environment;
    }


    /**
     * Gets the state value for this DataType.
     * 
     * @return state   * General state
     */
    public com.siemens.sitraffic.external.environmentsensor.State getState() {
        return state;
    }


    /**
     * Sets the state value for this DataType.
     * 
     * @param state   * General state
     */
    public void setState(com.siemens.sitraffic.external.environmentsensor.State state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataType)) return false;
        DataType other = (DataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.weather==null && other.getWeather()==null) || 
             (this.weather!=null &&
              this.weather.equals(other.getWeather()))) &&
            ((this.environment==null && other.getEnvironment()==null) || 
             (this.environment!=null &&
              this.environment.equals(other.getEnvironment()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getWeather() != null) {
            _hashCode += getWeather().hashCode();
        }
        if (getEnvironment() != null) {
            _hashCode += getEnvironment().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
