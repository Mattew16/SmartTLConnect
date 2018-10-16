/**
 * OperatingMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.operatingmessages;

public class OperatingMessage  implements java.io.Serializable {
    /* To identify the System (e.g. VSR, PLC2000, Concert, VLT, OCIT-Outstation
     * or others) */
    private org.apache.axis.types.NMToken systemTypeId;

    private org.apache.axis.types.NMToken hostname;

    /* The main message */
    private com.siemens.sitraffic.external.operatingmessages.MessageTypeExt message;

    public OperatingMessage() {
    }

    public OperatingMessage(
           org.apache.axis.types.NMToken systemTypeId,
           org.apache.axis.types.NMToken hostname,
           com.siemens.sitraffic.external.operatingmessages.MessageTypeExt message) {
           this.systemTypeId = systemTypeId;
           this.hostname = hostname;
           this.message = message;
    }


    /**
     * Gets the systemTypeId value for this OperatingMessage.
     * 
     * @return systemTypeId   * To identify the System (e.g. VSR, PLC2000, Concert, VLT, OCIT-Outstation
     * or others)
     */
    public org.apache.axis.types.NMToken getSystemTypeId() {
        return systemTypeId;
    }


    /**
     * Sets the systemTypeId value for this OperatingMessage.
     * 
     * @param systemTypeId   * To identify the System (e.g. VSR, PLC2000, Concert, VLT, OCIT-Outstation
     * or others)
     */
    public void setSystemTypeId(org.apache.axis.types.NMToken systemTypeId) {
        this.systemTypeId = systemTypeId;
    }


    /**
     * Gets the hostname value for this OperatingMessage.
     * 
     * @return hostname
     */
    public org.apache.axis.types.NMToken getHostname() {
        return hostname;
    }


    /**
     * Sets the hostname value for this OperatingMessage.
     * 
     * @param hostname
     */
    public void setHostname(org.apache.axis.types.NMToken hostname) {
        this.hostname = hostname;
    }


    /**
     * Gets the message value for this OperatingMessage.
     * 
     * @return message   * The main message
     */
    public com.siemens.sitraffic.external.operatingmessages.MessageTypeExt getMessage() {
        return message;
    }


    /**
     * Sets the message value for this OperatingMessage.
     * 
     * @param message   * The main message
     */
    public void setMessage(com.siemens.sitraffic.external.operatingmessages.MessageTypeExt message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperatingMessage)) return false;
        OperatingMessage other = (OperatingMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.systemTypeId==null && other.getSystemTypeId()==null) || 
             (this.systemTypeId!=null &&
              this.systemTypeId.equals(other.getSystemTypeId()))) &&
            ((this.hostname==null && other.getHostname()==null) || 
             (this.hostname!=null &&
              this.hostname.equals(other.getHostname()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getSystemTypeId() != null) {
            _hashCode += getSystemTypeId().hashCode();
        }
        if (getHostname() != null) {
            _hashCode += getHostname().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
