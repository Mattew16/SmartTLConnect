/**
 * TriggerAreaRelatedInfoTypeInfoDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.triggerarea;

public class TriggerAreaRelatedInfoTypeInfoDescription  implements java.io.Serializable {
    private com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoDescriptionText[] text;

    public TriggerAreaRelatedInfoTypeInfoDescription() {
    }

    public TriggerAreaRelatedInfoTypeInfoDescription(
           com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoDescriptionText[] text) {
           this.text = text;
    }


    /**
     * Gets the text value for this TriggerAreaRelatedInfoTypeInfoDescription.
     * 
     * @return text
     */
    public com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoDescriptionText[] getText() {
        return text;
    }


    /**
     * Sets the text value for this TriggerAreaRelatedInfoTypeInfoDescription.
     * 
     * @param text
     */
    public void setText(com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoDescriptionText[] text) {
        this.text = text;
    }

    public com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoDescriptionText getText(int i) {
        return this.text[i];
    }

    public void setText(int i, com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoDescriptionText _value) {
        this.text[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TriggerAreaRelatedInfoTypeInfoDescription)) return false;
        TriggerAreaRelatedInfoTypeInfoDescription other = (TriggerAreaRelatedInfoTypeInfoDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              java.util.Arrays.equals(this.text, other.getText())));
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
        if (getText() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getText());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getText(), i);
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
