/**
 * ItOnOffType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class ItOnOffType  implements java.io.Serializable {
    private com.siemens.sitraffic.external.intersectionStates_andCommands.BaseIsOnOffEnum isOnOff;

    private java.lang.Long jobId;

    public ItOnOffType() {
    }

    public ItOnOffType(
           com.siemens.sitraffic.external.intersectionStates_andCommands.BaseIsOnOffEnum isOnOff,
           java.lang.Long jobId) {
           this.isOnOff = isOnOff;
           this.jobId = jobId;
    }


    /**
     * Gets the isOnOff value for this ItOnOffType.
     * 
     * @return isOnOff
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.BaseIsOnOffEnum getIsOnOff() {
        return isOnOff;
    }


    /**
     * Sets the isOnOff value for this ItOnOffType.
     * 
     * @param isOnOff
     */
    public void setIsOnOff(com.siemens.sitraffic.external.intersectionStates_andCommands.BaseIsOnOffEnum isOnOff) {
        this.isOnOff = isOnOff;
    }


    /**
     * Gets the jobId value for this ItOnOffType.
     * 
     * @return jobId
     */
    public java.lang.Long getJobId() {
        return jobId;
    }


    /**
     * Sets the jobId value for this ItOnOffType.
     * 
     * @param jobId
     */
    public void setJobId(java.lang.Long jobId) {
        this.jobId = jobId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItOnOffType)) return false;
        ItOnOffType other = (ItOnOffType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isOnOff==null && other.getIsOnOff()==null) || 
             (this.isOnOff!=null &&
              this.isOnOff.equals(other.getIsOnOff()))) &&
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
        if (getIsOnOff() != null) {
            _hashCode += getIsOnOff().hashCode();
        }
        if (getJobId() != null) {
            _hashCode += getJobId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
