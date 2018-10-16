/**
 * SpType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class SpType  implements java.io.Serializable {
    /* 0 ... 255
     * 0 means none specified */
    private short spNr;

    private java.lang.Long jobId;

    public SpType() {
    }

    public SpType(
           short spNr,
           java.lang.Long jobId) {
           this.spNr = spNr;
           this.jobId = jobId;
    }


    /**
     * Gets the spNr value for this SpType.
     * 
     * @return spNr   * 0 ... 255
     * 0 means none specified
     */
    public short getSpNr() {
        return spNr;
    }


    /**
     * Sets the spNr value for this SpType.
     * 
     * @param spNr   * 0 ... 255
     * 0 means none specified
     */
    public void setSpNr(short spNr) {
        this.spNr = spNr;
    }


    /**
     * Gets the jobId value for this SpType.
     * 
     * @return jobId
     */
    public java.lang.Long getJobId() {
        return jobId;
    }


    /**
     * Sets the jobId value for this SpType.
     * 
     * @param jobId
     */
    public void setJobId(java.lang.Long jobId) {
        this.jobId = jobId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpType)) return false;
        SpType other = (SpType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.spNr == other.getSpNr() &&
            ((this.jobId==null && other.getJobId()==null) || 
             (this.jobId!=null &&
              this.jobId.equals(other.getJobId())));
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
        _hashCode += getSpNr();
        if (getJobId() != null) {
            _hashCode += getJobId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
