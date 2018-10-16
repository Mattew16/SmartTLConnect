/**
 * ProjectSpecificOnOffTypeParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class ProjectSpecificOnOffTypeParameter  implements java.io.Serializable {
    private int index;  // attribute

    private java.lang.String value;  // attribute

    public ProjectSpecificOnOffTypeParameter() {
    }

    public ProjectSpecificOnOffTypeParameter(
           int index,
           java.lang.String value) {
           this.index = index;
           this.value = value;
    }


    /**
     * Gets the index value for this ProjectSpecificOnOffTypeParameter.
     * 
     * @return index
     */
    public int getIndex() {
        return index;
    }


    /**
     * Sets the index value for this ProjectSpecificOnOffTypeParameter.
     * 
     * @param index
     */
    public void setIndex(int index) {
        this.index = index;
    }


    /**
     * Gets the value value for this ProjectSpecificOnOffTypeParameter.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ProjectSpecificOnOffTypeParameter.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectSpecificOnOffTypeParameter)) return false;
        ProjectSpecificOnOffTypeParameter other = (ProjectSpecificOnOffTypeParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.index == other.getIndex() &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        _hashCode += getIndex();
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
