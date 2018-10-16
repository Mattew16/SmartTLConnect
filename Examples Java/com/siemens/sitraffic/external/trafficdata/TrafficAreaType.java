/**
 * TrafficAreaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;

public class TrafficAreaType  implements java.io.Serializable {
    /* objecttype: TrafficData_trafficArea_Description */
    private com.siemens.sitraffic.external.global.Description descr;

    /* objecttype: TrafficData_trafficArea__accumulatedValue */
    private com.siemens.sitraffic.external.trafficdata.AccumulatedValueType accumulatedValue;

    /* objecttype: TrafficData_trafficArea_losValue */
    private com.siemens.sitraffic.external.trafficdata.LosValueType losValue;

    public TrafficAreaType() {
    }

    public TrafficAreaType(
           com.siemens.sitraffic.external.global.Description descr,
           com.siemens.sitraffic.external.trafficdata.AccumulatedValueType accumulatedValue,
           com.siemens.sitraffic.external.trafficdata.LosValueType losValue) {
           this.descr = descr;
           this.accumulatedValue = accumulatedValue;
           this.losValue = losValue;
    }


    /**
     * Gets the descr value for this TrafficAreaType.
     * 
     * @return descr   * objecttype: TrafficData_trafficArea_Description
     */
    public com.siemens.sitraffic.external.global.Description getDescr() {
        return descr;
    }


    /**
     * Sets the descr value for this TrafficAreaType.
     * 
     * @param descr   * objecttype: TrafficData_trafficArea_Description
     */
    public void setDescr(com.siemens.sitraffic.external.global.Description descr) {
        this.descr = descr;
    }


    /**
     * Gets the accumulatedValue value for this TrafficAreaType.
     * 
     * @return accumulatedValue   * objecttype: TrafficData_trafficArea__accumulatedValue
     */
    public com.siemens.sitraffic.external.trafficdata.AccumulatedValueType getAccumulatedValue() {
        return accumulatedValue;
    }


    /**
     * Sets the accumulatedValue value for this TrafficAreaType.
     * 
     * @param accumulatedValue   * objecttype: TrafficData_trafficArea__accumulatedValue
     */
    public void setAccumulatedValue(com.siemens.sitraffic.external.trafficdata.AccumulatedValueType accumulatedValue) {
        this.accumulatedValue = accumulatedValue;
    }


    /**
     * Gets the losValue value for this TrafficAreaType.
     * 
     * @return losValue   * objecttype: TrafficData_trafficArea_losValue
     */
    public com.siemens.sitraffic.external.trafficdata.LosValueType getLosValue() {
        return losValue;
    }


    /**
     * Sets the losValue value for this TrafficAreaType.
     * 
     * @param losValue   * objecttype: TrafficData_trafficArea_losValue
     */
    public void setLosValue(com.siemens.sitraffic.external.trafficdata.LosValueType losValue) {
        this.losValue = losValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficAreaType)) return false;
        TrafficAreaType other = (TrafficAreaType) obj;
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
            ((this.accumulatedValue==null && other.getAccumulatedValue()==null) || 
             (this.accumulatedValue!=null &&
              this.accumulatedValue.equals(other.getAccumulatedValue()))) &&
            ((this.losValue==null && other.getLosValue()==null) || 
             (this.losValue!=null &&
              this.losValue.equals(other.getLosValue())));
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
        if (getAccumulatedValue() != null) {
            _hashCode += getAccumulatedValue().hashCode();
        }
        if (getLosValue() != null) {
            _hashCode += getLosValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
