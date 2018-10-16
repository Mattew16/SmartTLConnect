/**
 * DetectorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;

public class DetectorType  implements java.io.Serializable {
    /* object type TrafficData_detector_Description */
    private com.siemens.sitraffic.external.global.Description descr;

    /* current values objecttype TafficData_detector_currentValue */
    private com.siemens.sitraffic.external.trafficdata.CurrentValueType currentValue;

    public DetectorType() {
    }

    public DetectorType(
           com.siemens.sitraffic.external.global.Description descr,
           com.siemens.sitraffic.external.trafficdata.CurrentValueType currentValue) {
           this.descr = descr;
           this.currentValue = currentValue;
    }


    /**
     * Gets the descr value for this DetectorType.
     * 
     * @return descr   * object type TrafficData_detector_Description
     */
    public com.siemens.sitraffic.external.global.Description getDescr() {
        return descr;
    }


    /**
     * Sets the descr value for this DetectorType.
     * 
     * @param descr   * object type TrafficData_detector_Description
     */
    public void setDescr(com.siemens.sitraffic.external.global.Description descr) {
        this.descr = descr;
    }


    /**
     * Gets the currentValue value for this DetectorType.
     * 
     * @return currentValue   * current values objecttype TafficData_detector_currentValue
     */
    public com.siemens.sitraffic.external.trafficdata.CurrentValueType getCurrentValue() {
        return currentValue;
    }


    /**
     * Sets the currentValue value for this DetectorType.
     * 
     * @param currentValue   * current values objecttype TafficData_detector_currentValue
     */
    public void setCurrentValue(com.siemens.sitraffic.external.trafficdata.CurrentValueType currentValue) {
        this.currentValue = currentValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DetectorType)) return false;
        DetectorType other = (DetectorType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descr==null && other.getDescr()==null) || 
             (this.descr!=null &&
              this.descr.equals(other.getDescr()))) &&
            ((this.currentValue==null && other.getCurrentValue()==null) || 
             (this.currentValue!=null &&
              this.currentValue.equals(other.getCurrentValue())));
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
        if (getDescr() != null) {
            _hashCode += getDescr().hashCode();
        }
        if (getCurrentValue() != null) {
            _hashCode += getCurrentValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
