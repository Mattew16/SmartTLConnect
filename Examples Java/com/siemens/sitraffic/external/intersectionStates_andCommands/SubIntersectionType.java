/**
 * SubIntersectionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class SubIntersectionType  implements java.io.Serializable {
    private com.siemens.sitraffic.external.intersectionStates_andCommands.IsOnOffEnum onOff;

    private int number;  // attribute

    public SubIntersectionType() {
    }

    public SubIntersectionType(
           com.siemens.sitraffic.external.intersectionStates_andCommands.IsOnOffEnum onOff,
           int number) {
           this.onOff = onOff;
           this.number = number;
    }


    /**
     * Gets the onOff value for this SubIntersectionType.
     * 
     * @return onOff
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.IsOnOffEnum getOnOff() {
        return onOff;
    }


    /**
     * Sets the onOff value for this SubIntersectionType.
     * 
     * @param onOff
     */
    public void setOnOff(com.siemens.sitraffic.external.intersectionStates_andCommands.IsOnOffEnum onOff) {
        this.onOff = onOff;
    }


    /**
     * Gets the number value for this SubIntersectionType.
     * 
     * @return number
     */
    public int getNumber() {
        return number;
    }


    /**
     * Sets the number value for this SubIntersectionType.
     * 
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubIntersectionType)) return false;
        SubIntersectionType other = (SubIntersectionType) obj;
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
              this.onOff.equals(other.getOnOff()))) &&
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
        if (getOnOff() != null) {
            _hashCode += getOnOff().hashCode();
        }
        _hashCode += getNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
