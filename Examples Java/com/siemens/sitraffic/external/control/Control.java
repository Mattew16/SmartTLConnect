/**
 * Control.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.control;

public class Control  implements java.io.Serializable {
    /* Objecttype: Control_Description */
    private com.siemens.sitraffic.external.control.ControlDescription[] description;

    /* Objecttype: Control_Values */
    private com.siemens.sitraffic.external.control.ControlValue[] value;

    public Control() {
    }

    public Control(
           com.siemens.sitraffic.external.control.ControlDescription[] description,
           com.siemens.sitraffic.external.control.ControlValue[] value) {
           this.description = description;
           this.value = value;
    }


    /**
     * Gets the description value for this Control.
     * 
     * @return description   * Objecttype: Control_Description
     */
    public com.siemens.sitraffic.external.control.ControlDescription[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Control.
     * 
     * @param description   * Objecttype: Control_Description
     */
    public void setDescription(com.siemens.sitraffic.external.control.ControlDescription[] description) {
        this.description = description;
    }

    public com.siemens.sitraffic.external.control.ControlDescription getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, com.siemens.sitraffic.external.control.ControlDescription _value) {
        this.description[i] = _value;
    }


    /**
     * Gets the value value for this Control.
     * 
     * @return value   * Objecttype: Control_Values
     */
    public com.siemens.sitraffic.external.control.ControlValue[] getValue() {
        return value;
    }


    /**
     * Sets the value value for this Control.
     * 
     * @param value   * Objecttype: Control_Values
     */
    public void setValue(com.siemens.sitraffic.external.control.ControlValue[] value) {
        this.value = value;
    }

    public com.siemens.sitraffic.external.control.ControlValue getValue(int i) {
        return this.value[i];
    }

    public void setValue(int i, com.siemens.sitraffic.external.control.ControlValue _value) {
        this.value[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Control)) return false;
        Control other = (Control) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              java.util.Arrays.equals(this.value, other.getValue())));
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
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValue(), i);
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
