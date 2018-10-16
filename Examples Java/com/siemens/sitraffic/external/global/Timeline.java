/**
 * Timeline.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.global;

public class Timeline  implements java.io.Serializable {
    /* Original Timestamp of the described values (end of measurement-nearly
     * the entry time in case of no transmission delay). No local time zone
     * will be added to the date and time format, so pure UTC is used at
     * the interfaces. */
    private java.util.Calendar timestamp;

    /* Measurement cycle time in seconds (the measurement value may
     * be related to another time base). The next values are expected in
     * cycle seconds, beginning from the time TS. */
    private org.apache.axis.types.UnsignedLong cycle;

    public Timeline() {
    }

    public Timeline(
           java.util.Calendar timestamp,
           org.apache.axis.types.UnsignedLong cycle) {
           this.timestamp = timestamp;
           this.cycle = cycle;
    }


    /**
     * Gets the timestamp value for this Timeline.
     * 
     * @return timestamp   * Original Timestamp of the described values (end of measurement-nearly
     * the entry time in case of no transmission delay). No local time zone
     * will be added to the date and time format, so pure UTC is used at
     * the interfaces.
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this Timeline.
     * 
     * @param timestamp   * Original Timestamp of the described values (end of measurement-nearly
     * the entry time in case of no transmission delay). No local time zone
     * will be added to the date and time format, so pure UTC is used at
     * the interfaces.
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the cycle value for this Timeline.
     * 
     * @return cycle   * Measurement cycle time in seconds (the measurement value may
     * be related to another time base). The next values are expected in
     * cycle seconds, beginning from the time TS.
     */
    public org.apache.axis.types.UnsignedLong getCycle() {
        return cycle;
    }


    /**
     * Sets the cycle value for this Timeline.
     * 
     * @param cycle   * Measurement cycle time in seconds (the measurement value may
     * be related to another time base). The next values are expected in
     * cycle seconds, beginning from the time TS.
     */
    public void setCycle(org.apache.axis.types.UnsignedLong cycle) {
        this.cycle = cycle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Timeline)) return false;
        Timeline other = (Timeline) obj;
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
