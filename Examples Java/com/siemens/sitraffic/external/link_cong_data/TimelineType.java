/**
 * TimelineType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.link_cong_data;

public class TimelineType  implements java.io.Serializable {
    /* current timestamp in UTC (end) */
    private java.util.Calendar timestamp;

    /* interval length */
    private java.lang.Integer cycle;

    public TimelineType() {
    }

    public TimelineType(
           java.util.Calendar timestamp,
           java.lang.Integer cycle) {
           this.timestamp = timestamp;
           this.cycle = cycle;
    }


    /**
     * Gets the timestamp value for this TimelineType.
     * 
     * @return timestamp   * current timestamp in UTC (end)
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this TimelineType.
     * 
     * @param timestamp   * current timestamp in UTC (end)
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the cycle value for this TimelineType.
     * 
     * @return cycle   * interval length
     */
    public java.lang.Integer getCycle() {
        return cycle;
    }


    /**
     * Sets the cycle value for this TimelineType.
     * 
     * @param cycle   * interval length
     */
    public void setCycle(java.lang.Integer cycle) {
        this.cycle = cycle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimelineType)) return false;
        TimelineType other = (TimelineType) obj;
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
            ((this.cycle==null && other.getCycle()==null) || 
             (this.cycle!=null &&
              this.cycle.equals(other.getCycle())));
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
        if (getCycle() != null) {
            _hashCode += getCycle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
