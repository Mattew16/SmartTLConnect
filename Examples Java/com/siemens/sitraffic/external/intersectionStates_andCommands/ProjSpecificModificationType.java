/**
 * ProjSpecificModificationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class ProjSpecificModificationType  implements java.io.Serializable {
    private com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffEnum onOff;

    private com.siemens.sitraffic.external.intersectionStates_andCommands.ProjSpecificModificationTypeParameter[] parameter;

    private int number;  // attribute

    public ProjSpecificModificationType() {
    }

    public ProjSpecificModificationType(
           com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffEnum onOff,
           com.siemens.sitraffic.external.intersectionStates_andCommands.ProjSpecificModificationTypeParameter[] parameter,
           int number) {
           this.onOff = onOff;
           this.parameter = parameter;
           this.number = number;
    }


    /**
     * Gets the onOff value for this ProjSpecificModificationType.
     * 
     * @return onOff
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffEnum getOnOff() {
        return onOff;
    }


    /**
     * Sets the onOff value for this ProjSpecificModificationType.
     * 
     * @param onOff
     */
    public void setOnOff(com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffEnum onOff) {
        this.onOff = onOff;
    }


    /**
     * Gets the parameter value for this ProjSpecificModificationType.
     * 
     * @return parameter
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.ProjSpecificModificationTypeParameter[] getParameter() {
        return parameter;
    }


    /**
     * Sets the parameter value for this ProjSpecificModificationType.
     * 
     * @param parameter
     */
    public void setParameter(com.siemens.sitraffic.external.intersectionStates_andCommands.ProjSpecificModificationTypeParameter[] parameter) {
        this.parameter = parameter;
    }

    public com.siemens.sitraffic.external.intersectionStates_andCommands.ProjSpecificModificationTypeParameter getParameter(int i) {
        return this.parameter[i];
    }

    public void setParameter(int i, com.siemens.sitraffic.external.intersectionStates_andCommands.ProjSpecificModificationTypeParameter _value) {
        this.parameter[i] = _value;
    }


    /**
     * Gets the number value for this ProjSpecificModificationType.
     * 
     * @return number
     */
    public int getNumber() {
        return number;
    }


    /**
     * Sets the number value for this ProjSpecificModificationType.
     * 
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjSpecificModificationType)) return false;
        ProjSpecificModificationType other = (ProjSpecificModificationType) obj;
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
        if (getOnOff() != null) {
            _hashCode += getOnOff().hashCode();
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
