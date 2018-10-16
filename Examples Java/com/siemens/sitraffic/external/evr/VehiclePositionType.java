/**
 * VehiclePositionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.evr;

public class VehiclePositionType  implements java.io.Serializable {
    private java.util.Calendar timestamp;

    private com.siemens.sitraffic.external.global.CoType co;

    private java.lang.Float speed;

    private java.lang.Float direction;

    public VehiclePositionType() {
    }

    public VehiclePositionType(
           java.util.Calendar timestamp,
           com.siemens.sitraffic.external.global.CoType co,
           java.lang.Float speed,
           java.lang.Float direction) {
           this.timestamp = timestamp;
           this.co = co;
           this.speed = speed;
           this.direction = direction;
    }


    /**
     * Gets the timestamp value for this VehiclePositionType.
     * 
     * @return timestamp
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this VehiclePositionType.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the co value for this VehiclePositionType.
     * 
     * @return co
     */
    public com.siemens.sitraffic.external.global.CoType getCo() {
        return co;
    }


    /**
     * Sets the co value for this VehiclePositionType.
     * 
     * @param co
     */
    public void setCo(com.siemens.sitraffic.external.global.CoType co) {
        this.co = co;
    }


    /**
     * Gets the speed value for this VehiclePositionType.
     * 
     * @return speed
     */
    public java.lang.Float getSpeed() {
        return speed;
    }


    /**
     * Sets the speed value for this VehiclePositionType.
     * 
     * @param speed
     */
    public void setSpeed(java.lang.Float speed) {
        this.speed = speed;
    }


    /**
     * Gets the direction value for this VehiclePositionType.
     * 
     * @return direction
     */
    public java.lang.Float getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this VehiclePositionType.
     * 
     * @param direction
     */
    public void setDirection(java.lang.Float direction) {
        this.direction = direction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehiclePositionType)) return false;
        VehiclePositionType other = (VehiclePositionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.co==null && other.getCo()==null) || 
             (this.co!=null &&
              this.co.equals(other.getCo()))) &&
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
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getCo() != null) {
            _hashCode += getCo().hashCode();
        }
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
