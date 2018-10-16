/**
 * TrafficSubAreaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;

public class TrafficSubAreaType  implements java.io.Serializable {
    /* objecttype: TrafficData_trafficArea_Description */
    private java.lang.Object descr;

    /* objecttype: TrafficData_trafficArea__accumulatedValue */
    private com.siemens.sitraffic.external.trafficdata.AccumulatedValueType accumulatedValue;

    public TrafficSubAreaType() {
    }

    public TrafficSubAreaType(
           java.lang.Object descr,
           com.siemens.sitraffic.external.trafficdata.AccumulatedValueType accumulatedValue) {
           this.descr = descr;
           this.accumulatedValue = accumulatedValue;
    }


    /**
     * Gets the descr value for this TrafficSubAreaType.
     * 
     * @return descr   * objecttype: TrafficData_trafficArea_Description
     */
    public java.lang.Object getDescr() {
        return descr;
    }


    /**
     * Sets the descr value for this TrafficSubAreaType.
     * 
     * @param descr   * objecttype: TrafficData_trafficArea_Description
     */
    public void setDescr(java.lang.Object descr) {
        this.descr = descr;
    }


    /**
     * Gets the accumulatedValue value for this TrafficSubAreaType.
     * 
     * @return accumulatedValue   * objecttype: TrafficData_trafficArea__accumulatedValue
     */
    public com.siemens.sitraffic.external.trafficdata.AccumulatedValueType getAccumulatedValue() {
        return accumulatedValue;
    }


    /**
     * Sets the accumulatedValue value for this TrafficSubAreaType.
     * 
     * @param accumulatedValue   * objecttype: TrafficData_trafficArea__accumulatedValue
     */
    public void setAccumulatedValue(com.siemens.sitraffic.external.trafficdata.AccumulatedValueType accumulatedValue) {
        this.accumulatedValue = accumulatedValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficSubAreaType)) return false;
        TrafficSubAreaType other = (TrafficSubAreaType) obj;
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
              this.accumulatedValue.equals(other.getAccumulatedValue())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

}
