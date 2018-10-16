/**
 * DetectorGroupType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;

public class DetectorGroupType  implements java.io.Serializable {
    /* objecttype TrafficData_detectorGroup_Description */
    private com.siemens.sitraffic.external.global.Description descr;

    /* objecttype TafficData_detectorGroup_currentValue */
    private com.siemens.sitraffic.external.trafficdata.CurrentValueType currentValue;

    /* objecttype: TrafficData_detectorGroup_calculatedValue */
    private com.siemens.sitraffic.external.trafficdata.CalculatedValueType calculatedValue;

    public DetectorGroupType() {
    }

    public DetectorGroupType(
           com.siemens.sitraffic.external.global.Description descr,
           com.siemens.sitraffic.external.trafficdata.CurrentValueType currentValue,
           com.siemens.sitraffic.external.trafficdata.CalculatedValueType calculatedValue) {
           this.descr = descr;
           this.currentValue = currentValue;
           this.calculatedValue = calculatedValue;
    }


    /**
     * Gets the descr value for this DetectorGroupType.
     * 
     * @return descr   * objecttype TrafficData_detectorGroup_Description
     */
    public com.siemens.sitraffic.external.global.Description getDescr() {
        return descr;
    }


    /**
     * Sets the descr value for this DetectorGroupType.
     * 
     * @param descr   * objecttype TrafficData_detectorGroup_Description
     */
    public void setDescr(com.siemens.sitraffic.external.global.Description descr) {
        this.descr = descr;
    }


    /**
     * Gets the currentValue value for this DetectorGroupType.
     * 
     * @return currentValue   * objecttype TafficData_detectorGroup_currentValue
     */
    public com.siemens.sitraffic.external.trafficdata.CurrentValueType getCurrentValue() {
        return currentValue;
    }


    /**
     * Sets the currentValue value for this DetectorGroupType.
     * 
     * @param currentValue   * objecttype TafficData_detectorGroup_currentValue
     */
    public void setCurrentValue(com.siemens.sitraffic.external.trafficdata.CurrentValueType currentValue) {
        this.currentValue = currentValue;
    }


    /**
     * Gets the calculatedValue value for this DetectorGroupType.
     * 
     * @return calculatedValue   * objecttype: TrafficData_detectorGroup_calculatedValue
     */
    public com.siemens.sitraffic.external.trafficdata.CalculatedValueType getCalculatedValue() {
        return calculatedValue;
    }


    /**
     * Sets the calculatedValue value for this DetectorGroupType.
     * 
     * @param calculatedValue   * objecttype: TrafficData_detectorGroup_calculatedValue
     */
    public void setCalculatedValue(com.siemens.sitraffic.external.trafficdata.CalculatedValueType calculatedValue) {
        this.calculatedValue = calculatedValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DetectorGroupType)) return false;
        DetectorGroupType other = (DetectorGroupType) obj;
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
              this.currentValue.equals(other.getCurrentValue()))) &&
            ((this.calculatedValue==null && other.getCalculatedValue()==null) || 
             (this.calculatedValue!=null &&
              this.calculatedValue.equals(other.getCalculatedValue())));
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
        if (getCalculatedValue() != null) {
            _hashCode += getCalculatedValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
