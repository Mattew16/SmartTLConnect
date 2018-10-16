/**
 * HAR.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.har;

public class HAR  implements java.io.Serializable {
    /* Object type: HAR_Descr */
    private com.siemens.sitraffic.external.global.Description descr;

    /* Object type: HAR_Status */
    private com.siemens.sitraffic.external.har.HarStatus status;

    /* Object type: HAR_Cmd */
    private com.siemens.sitraffic.external.har.HarCmd cmd;

    public HAR() {
    }

    public HAR(
           com.siemens.sitraffic.external.global.Description descr,
           com.siemens.sitraffic.external.har.HarStatus status,
           com.siemens.sitraffic.external.har.HarCmd cmd) {
           this.descr = descr;
           this.status = status;
           this.cmd = cmd;
    }


    /**
     * Gets the descr value for this HAR.
     * 
     * @return descr   * Object type: HAR_Descr
     */
    public com.siemens.sitraffic.external.global.Description getDescr() {
        return descr;
    }


    /**
     * Sets the descr value for this HAR.
     * 
     * @param descr   * Object type: HAR_Descr
     */
    public void setDescr(com.siemens.sitraffic.external.global.Description descr) {
        this.descr = descr;
    }


    /**
     * Gets the status value for this HAR.
     * 
     * @return status   * Object type: HAR_Status
     */
    public com.siemens.sitraffic.external.har.HarStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this HAR.
     * 
     * @param status   * Object type: HAR_Status
     */
    public void setStatus(com.siemens.sitraffic.external.har.HarStatus status) {
        this.status = status;
    }


    /**
     * Gets the cmd value for this HAR.
     * 
     * @return cmd   * Object type: HAR_Cmd
     */
    public com.siemens.sitraffic.external.har.HarCmd getCmd() {
        return cmd;
    }


    /**
     * Sets the cmd value for this HAR.
     * 
     * @param cmd   * Object type: HAR_Cmd
     */
    public void setCmd(com.siemens.sitraffic.external.har.HarCmd cmd) {
        this.cmd = cmd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HAR)) return false;
        HAR other = (HAR) obj;
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
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.cmd==null && other.getCmd()==null) || 
             (this.cmd!=null &&
              this.cmd.equals(other.getCmd())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCmd() != null) {
            _hashCode += getCmd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
