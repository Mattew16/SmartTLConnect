/**
 * ValueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.subsystem;

public class ValueType  implements java.io.Serializable {
    /* Calculated device state of the sub system */
    private java.math.BigInteger deviceState;

    /* Detail state of the sub system */
    private java.math.BigInteger detailState;

    public ValueType() {
    }

    public ValueType(
           java.math.BigInteger deviceState,
           java.math.BigInteger detailState) {
           this.deviceState = deviceState;
           this.detailState = detailState;
    }


    /**
     * Gets the deviceState value for this ValueType.
     * 
     * @return deviceState   * Calculated device state of the sub system
     */
    public java.math.BigInteger getDeviceState() {
        return deviceState;
    }


    /**
     * Sets the deviceState value for this ValueType.
     * 
     * @param deviceState   * Calculated device state of the sub system
     */
    public void setDeviceState(java.math.BigInteger deviceState) {
        this.deviceState = deviceState;
    }


    /**
     * Gets the detailState value for this ValueType.
     * 
     * @return detailState   * Detail state of the sub system
     */
    public java.math.BigInteger getDetailState() {
        return detailState;
    }


    /**
     * Sets the detailState value for this ValueType.
     * 
     * @param detailState   * Detail state of the sub system
     */
    public void setDetailState(java.math.BigInteger detailState) {
        this.detailState = detailState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValueType)) return false;
        ValueType other = (ValueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceState==null && other.getDeviceState()==null) || 
             (this.deviceState!=null &&
              this.deviceState.equals(other.getDeviceState()))) &&
            ((this.detailState==null && other.getDetailState()==null) || 
             (this.detailState!=null &&
              this.detailState.equals(other.getDetailState())));
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
        if (getDeviceState() != null) {
            _hashCode += getDeviceState().hashCode();
        }
        if (getDetailState() != null) {
            _hashCode += getDetailState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
