/**
 * SignalPlansType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class SignalPlansType  implements java.io.Serializable {
    /* 1 ... 255 */
    private int number;

    private java.lang.String name;

    private java.lang.String description;

    /* 1 ... 254
     * if present this plan is a Emergency Vehicle Route. The content is
     * the route number. */
    private java.lang.Integer routeNumber;

    /* cycle time in seconds */
    private java.lang.Integer cycleTime;

    public SignalPlansType() {
    }

    public SignalPlansType(
           int number,
           java.lang.String name,
           java.lang.String description,
           java.lang.Integer routeNumber,
           java.lang.Integer cycleTime) {
           this.number = number;
           this.name = name;
           this.description = description;
           this.routeNumber = routeNumber;
           this.cycleTime = cycleTime;
    }


    /**
     * Gets the number value for this SignalPlansType.
     * 
     * @return number   * 1 ... 255
     */
    public int getNumber() {
        return number;
    }


    /**
     * Sets the number value for this SignalPlansType.
     * 
     * @param number   * 1 ... 255
     */
    public void setNumber(int number) {
        this.number = number;
    }


    /**
     * Gets the name value for this SignalPlansType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SignalPlansType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this SignalPlansType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SignalPlansType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the routeNumber value for this SignalPlansType.
     * 
     * @return routeNumber   * 1 ... 254
     * if present this plan is a Emergency Vehicle Route. The content is
     * the route number.
     */
    public java.lang.Integer getRouteNumber() {
        return routeNumber;
    }


    /**
     * Sets the routeNumber value for this SignalPlansType.
     * 
     * @param routeNumber   * 1 ... 254
     * if present this plan is a Emergency Vehicle Route. The content is
     * the route number.
     */
    public void setRouteNumber(java.lang.Integer routeNumber) {
        this.routeNumber = routeNumber;
    }


    /**
     * Gets the cycleTime value for this SignalPlansType.
     * 
     * @return cycleTime   * cycle time in seconds
     */
    public java.lang.Integer getCycleTime() {
        return cycleTime;
    }


    /**
     * Sets the cycleTime value for this SignalPlansType.
     * 
     * @param cycleTime   * cycle time in seconds
     */
    public void setCycleTime(java.lang.Integer cycleTime) {
        this.cycleTime = cycleTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignalPlansType)) return false;
        SignalPlansType other = (SignalPlansType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.number == other.getNumber() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.routeNumber==null && other.getRouteNumber()==null) || 
             (this.routeNumber!=null &&
              this.routeNumber.equals(other.getRouteNumber()))) &&
            ((this.cycleTime==null && other.getCycleTime()==null) || 
             (this.cycleTime!=null &&
              this.cycleTime.equals(other.getCycleTime())));
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
        _hashCode += getNumber();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getRouteNumber() != null) {
            _hashCode += getRouteNumber().hashCode();
        }
        if (getCycleTime() != null) {
            _hashCode += getCycleTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
