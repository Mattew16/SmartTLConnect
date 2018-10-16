/**
 * Time.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;

public class Time  implements java.io.Serializable {
    /* Original Timestamp of the described values (end of measurement-nearly
     * the entry time in case of no transmission delay). No local time zone
     * will be added to the date and time format, so pure UTC is used at
     * the interfaces. */
    private java.util.Calendar TS;

    /* Measurement cycle time in seconds (the measurement value may
     * be related to another time base). The next values are expected in
     * cycle seconds, beginning from the time TS. */
    private org.apache.axis.types.UnsignedLong cycle;

    public Time() {
    }

    public Time(
           java.util.Calendar TS,
           org.apache.axis.types.UnsignedLong cycle) {
           this.TS = TS;
           this.cycle = cycle;
    }


    /**
     * Gets the TS value for this Time.
     * 
     * @return TS   * Original Timestamp of the described values (end of measurement-nearly
     * the entry time in case of no transmission delay). No local time zone
     * will be added to the date and time format, so pure UTC is used at
     * the interfaces.
     */
    public java.util.Calendar getTS() {
        return TS;
    }


    /**
     * Sets the TS value for this Time.
     * 
     * @param TS   * Original Timestamp of the described values (end of measurement-nearly
     * the entry time in case of no transmission delay). No local time zone
     * will be added to the date and time format, so pure UTC is used at
     * the interfaces.
     */
    public void setTS(java.util.Calendar TS) {
        this.TS = TS;
    }


    /**
     * Gets the cycle value for this Time.
     * 
     * @return cycle   * Measurement cycle time in seconds (the measurement value may
     * be related to another time base). The next values are expected in
     * cycle seconds, beginning from the time TS.
     */
    public org.apache.axis.types.UnsignedLong getCycle() {
        return cycle;
    }


    /**
     * Sets the cycle value for this Time.
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
        if (!(obj instanceof Time)) return false;
        Time other = (Time) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TS==null && other.getTS()==null) || 
             (this.TS!=null &&
              this.TS.equals(other.getTS()))) &&
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
        if (getTS() != null) {
            _hashCode += getTS().hashCode();
        }
        if (getCycle() != null) {
            _hashCode += getCycle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
