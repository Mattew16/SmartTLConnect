/**
 * ControlModeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class ControlModeType  implements java.io.Serializable {
    private com.siemens.sitraffic.external.intersectionStates_andCommands.ControlModeEnum cm;

    private java.lang.Long jobId;

    public ControlModeType() {
    }

    public ControlModeType(
           com.siemens.sitraffic.external.intersectionStates_andCommands.ControlModeEnum cm,
           java.lang.Long jobId) {
           this.cm = cm;
           this.jobId = jobId;
    }


    /**
     * Gets the cm value for this ControlModeType.
     * 
     * @return cm
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.ControlModeEnum getCm() {
        return cm;
    }


    /**
     * Sets the cm value for this ControlModeType.
     * 
     * @param cm
     */
    public void setCm(com.siemens.sitraffic.external.intersectionStates_andCommands.ControlModeEnum cm) {
        this.cm = cm;
    }


    /**
     * Gets the jobId value for this ControlModeType.
     * 
     * @return jobId
     */
    public java.lang.Long getJobId() {
        return jobId;
    }


    /**
     * Sets the jobId value for this ControlModeType.
     * 
     * @param jobId
     */
    public void setJobId(java.lang.Long jobId) {
        this.jobId = jobId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ControlModeType)) return false;
        ControlModeType other = (ControlModeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cm==null && other.getCm()==null) || 
             (this.cm!=null &&
              this.cm.equals(other.getCm()))) &&
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
        if (getCm() != null) {
            _hashCode += getCm().hashCode();
        }
        if (getJobId() != null) {
            _hashCode += getJobId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
