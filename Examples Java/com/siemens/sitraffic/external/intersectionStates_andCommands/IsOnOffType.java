/**
 * IsOnOffType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class IsOnOffType  implements java.io.Serializable {
    private com.siemens.sitraffic.external.intersectionStates_andCommands.IsOnOffEnum onOff;

    public IsOnOffType() {
    }

    public IsOnOffType(
           com.siemens.sitraffic.external.intersectionStates_andCommands.IsOnOffEnum onOff) {
           this.onOff = onOff;
    }


    /**
     * Gets the onOff value for this IsOnOffType.
     * 
     * @return onOff
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.IsOnOffEnum getOnOff() {
        return onOff;
    }


    /**
     * Sets the onOff value for this IsOnOffType.
     * 
     * @param onOff
     */
    public void setOnOff(com.siemens.sitraffic.external.intersectionStates_andCommands.IsOnOffEnum onOff) {
        this.onOff = onOff;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsOnOffType)) return false;
        IsOnOffType other = (IsOnOffType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.onOff==null && other.getOnOff()==null) || 
             (this.onOff!=null &&
              this.onOff.equals(other.getOnOff())));
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
        if (getOnOff() != null) {
            _hashCode += getOnOff().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
