/**
 * TrafficSubSectionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;


/**
 * objecttype: TrafficData_SubSection_calcsum_value
 */
public class TrafficSubSectionType  implements java.io.Serializable {
    /* objecttype: TrafficData_trafficSubSection_Description */
    private com.siemens.sitraffic.external.global.Description descr;

    /* objecttype: TrafficData_trafficSubSection__accumulatedValue */
    private com.siemens.sitraffic.external.trafficdata.AccumulatedValueType accumulatedValue;

    /* objecttype: TrafficData_trafficSubSection_losValue */
    private com.siemens.sitraffic.external.trafficdata.LosValueType losValue;

    /* objecttype: TrafficData_trafficSubSection_traveltimeValue */
    private com.siemens.sitraffic.external.trafficdata.TraveltimeValueType traveltimeValue;

    public TrafficSubSectionType() {
    }

    public TrafficSubSectionType(
           com.siemens.sitraffic.external.global.Description descr,
           com.siemens.sitraffic.external.trafficdata.AccumulatedValueType accumulatedValue,
           com.siemens.sitraffic.external.trafficdata.LosValueType losValue,
           com.siemens.sitraffic.external.trafficdata.TraveltimeValueType traveltimeValue) {
           this.descr = descr;
           this.accumulatedValue = accumulatedValue;
           this.losValue = losValue;
           this.traveltimeValue = traveltimeValue;
    }


    /**
     * Gets the descr value for this TrafficSubSectionType.
     * 
     * @return descr   * objecttype: TrafficData_trafficSubSection_Description
     */
    public com.siemens.sitraffic.external.global.Description getDescr() {
        return descr;
    }


    /**
     * Sets the descr value for this TrafficSubSectionType.
     * 
     * @param descr   * objecttype: TrafficData_trafficSubSection_Description
     */
    public void setDescr(com.siemens.sitraffic.external.global.Description descr) {
        this.descr = descr;
    }


    /**
     * Gets the accumulatedValue value for this TrafficSubSectionType.
     * 
     * @return accumulatedValue   * objecttype: TrafficData_trafficSubSection__accumulatedValue
     */
    public com.siemens.sitraffic.external.trafficdata.AccumulatedValueType getAccumulatedValue() {
        return accumulatedValue;
    }


    /**
     * Sets the accumulatedValue value for this TrafficSubSectionType.
     * 
     * @param accumulatedValue   * objecttype: TrafficData_trafficSubSection__accumulatedValue
     */
    public void setAccumulatedValue(com.siemens.sitraffic.external.trafficdata.AccumulatedValueType accumulatedValue) {
        this.accumulatedValue = accumulatedValue;
    }


    /**
     * Gets the losValue value for this TrafficSubSectionType.
     * 
     * @return losValue   * objecttype: TrafficData_trafficSubSection_losValue
     */
    public com.siemens.sitraffic.external.trafficdata.LosValueType getLosValue() {
        return losValue;
    }


    /**
     * Sets the losValue value for this TrafficSubSectionType.
     * 
     * @param losValue   * objecttype: TrafficData_trafficSubSection_losValue
     */
    public void setLosValue(com.siemens.sitraffic.external.trafficdata.LosValueType losValue) {
        this.losValue = losValue;
    }


    /**
     * Gets the traveltimeValue value for this TrafficSubSectionType.
     * 
     * @return traveltimeValue   * objecttype: TrafficData_trafficSubSection_traveltimeValue
     */
    public com.siemens.sitraffic.external.trafficdata.TraveltimeValueType getTraveltimeValue() {
        return traveltimeValue;
    }


    /**
     * Sets the traveltimeValue value for this TrafficSubSectionType.
     * 
     * @param traveltimeValue   * objecttype: TrafficData_trafficSubSection_traveltimeValue
     */
    public void setTraveltimeValue(com.siemens.sitraffic.external.trafficdata.TraveltimeValueType traveltimeValue) {
        this.traveltimeValue = traveltimeValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficSubSectionType)) return false;
        TrafficSubSectionType other = (TrafficSubSectionType) obj;
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
              this.losValue.equals(other.getLosValue()))) &&
            ((this.traveltimeValue==null && other.getTraveltimeValue()==null) || 
             (this.traveltimeValue!=null &&
              this.traveltimeValue.equals(other.getTraveltimeValue())));
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
        if (getTraveltimeValue() != null) {
            _hashCode += getTraveltimeValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
