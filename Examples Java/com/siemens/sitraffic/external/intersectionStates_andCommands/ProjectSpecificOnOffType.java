/**
 * ProjectSpecificOnOffType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class ProjectSpecificOnOffType  implements java.io.Serializable {
    private com.siemens.sitraffic.external.intersectionStates_andCommands.BaseIsOnOffEnum isOnOff;

    private java.lang.Long jobId;

    private com.siemens.sitraffic.external.intersectionStates_andCommands.ProjectSpecificOnOffTypeParameter[] parameter;

    private int number;  // attribute

    public ProjectSpecificOnOffType() {
    }

    public ProjectSpecificOnOffType(
           com.siemens.sitraffic.external.intersectionStates_andCommands.BaseIsOnOffEnum isOnOff,
           java.lang.Long jobId,
           com.siemens.sitraffic.external.intersectionStates_andCommands.ProjectSpecificOnOffTypeParameter[] parameter,
           int number) {
           this.isOnOff = isOnOff;
           this.jobId = jobId;
           this.parameter = parameter;
           this.number = number;
    }


    /**
     * Gets the isOnOff value for this ProjectSpecificOnOffType.
     * 
     * @return isOnOff
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.BaseIsOnOffEnum getIsOnOff() {
        return isOnOff;
    }


    /**
     * Sets the isOnOff value for this ProjectSpecificOnOffType.
     * 
     * @param isOnOff
     */
    public void setIsOnOff(com.siemens.sitraffic.external.intersectionStates_andCommands.BaseIsOnOffEnum isOnOff) {
        this.isOnOff = isOnOff;
    }


    /**
     * Gets the jobId value for this ProjectSpecificOnOffType.
     * 
     * @return jobId
     */
    public java.lang.Long getJobId() {
        return jobId;
    }


    /**
     * Sets the jobId value for this ProjectSpecificOnOffType.
     * 
     * @param jobId
     */
    public void setJobId(java.lang.Long jobId) {
        this.jobId = jobId;
    }


    /**
     * Gets the parameter value for this ProjectSpecificOnOffType.
     * 
     * @return parameter
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.ProjectSpecificOnOffTypeParameter[] getParameter() {
        return parameter;
    }


    /**
     * Sets the parameter value for this ProjectSpecificOnOffType.
     * 
     * @param parameter
     */
    public void setParameter(com.siemens.sitraffic.external.intersectionStates_andCommands.ProjectSpecificOnOffTypeParameter[] parameter) {
        this.parameter = parameter;
    }

    public com.siemens.sitraffic.external.intersectionStates_andCommands.ProjectSpecificOnOffTypeParameter getParameter(int i) {
        return this.parameter[i];
    }

    public void setParameter(int i, com.siemens.sitraffic.external.intersectionStates_andCommands.ProjectSpecificOnOffTypeParameter _value) {
        this.parameter[i] = _value;
    }


    /**
     * Gets the number value for this ProjectSpecificOnOffType.
     * 
     * @return number
     */
    public int getNumber() {
        return number;
    }


    /**
     * Sets the number value for this ProjectSpecificOnOffType.
     * 
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectSpecificOnOffType)) return false;
        ProjectSpecificOnOffType other = (ProjectSpecificOnOffType) obj;
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
              this.jobId.equals(other.getJobId()))) &&
            ((this.parameter==null && other.getParameter()==null) || 
             (this.parameter!=null &&
              java.util.Arrays.equals(this.parameter, other.getParameter()))) &&
            this.number == other.getNumber();
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
        if (getParameter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameter(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
