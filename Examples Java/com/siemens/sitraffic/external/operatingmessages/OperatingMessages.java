/**
 * OperatingMessages.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.operatingmessages;

public class OperatingMessages  implements java.io.Serializable {
    /* Objecttype: OperatingMessages_Operatingmessage */
    private com.siemens.sitraffic.external.operatingmessages.OperatingMessage[] operatingMessage;

    public OperatingMessages() {
    }

    public OperatingMessages(
           com.siemens.sitraffic.external.operatingmessages.OperatingMessage[] operatingMessage) {
           this.operatingMessage = operatingMessage;
    }


    /**
     * Gets the operatingMessage value for this OperatingMessages.
     * 
     * @return operatingMessage   * Objecttype: OperatingMessages_Operatingmessage
     */
    public com.siemens.sitraffic.external.operatingmessages.OperatingMessage[] getOperatingMessage() {
        return operatingMessage;
    }


    /**
     * Sets the operatingMessage value for this OperatingMessages.
     * 
     * @param operatingMessage   * Objecttype: OperatingMessages_Operatingmessage
     */
    public void setOperatingMessage(com.siemens.sitraffic.external.operatingmessages.OperatingMessage[] operatingMessage) {
        this.operatingMessage = operatingMessage;
    }

    public com.siemens.sitraffic.external.operatingmessages.OperatingMessage getOperatingMessage(int i) {
        return this.operatingMessage[i];
    }

    public void setOperatingMessage(int i, com.siemens.sitraffic.external.operatingmessages.OperatingMessage _value) {
        this.operatingMessage[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperatingMessages)) return false;
        OperatingMessages other = (OperatingMessages) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operatingMessage==null && other.getOperatingMessage()==null) || 
             (this.operatingMessage!=null &&
              java.util.Arrays.equals(this.operatingMessage, other.getOperatingMessage())));
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
        if (getOperatingMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperatingMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperatingMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
