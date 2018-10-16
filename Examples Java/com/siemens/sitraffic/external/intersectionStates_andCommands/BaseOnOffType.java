/**
 * BaseOnOffType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class BaseOnOffType  implements java.io.Serializable {
    private com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffEnum onOff;

    public BaseOnOffType() {
    }

    public BaseOnOffType(
           com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffEnum onOff) {
           this.onOff = onOff;
    }


    /**
     * Gets the onOff value for this BaseOnOffType.
     * 
     * @return onOff
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffEnum getOnOff() {
        return onOff;
    }


    /**
     * Sets the onOff value for this BaseOnOffType.
     * 
     * @param onOff
     */
    public void setOnOff(com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffEnum onOff) {
        this.onOff = onOff;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseOnOffType)) return false;
        BaseOnOffType other = (BaseOnOffType) obj;
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
