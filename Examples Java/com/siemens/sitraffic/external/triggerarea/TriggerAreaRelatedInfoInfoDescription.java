/**
 * TriggerAreaRelatedInfoInfoDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.triggerarea;

public class TriggerAreaRelatedInfoInfoDescription  implements java.io.Serializable {
    private com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfoDescriptionText text;

    public TriggerAreaRelatedInfoInfoDescription() {
    }

    public TriggerAreaRelatedInfoInfoDescription(
           com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfoDescriptionText text) {
           this.text = text;
    }


    /**
     * Gets the text value for this TriggerAreaRelatedInfoInfoDescription.
     * 
     * @return text
     */
    public com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfoDescriptionText getText() {
        return text;
    }


    /**
     * Sets the text value for this TriggerAreaRelatedInfoInfoDescription.
     * 
     * @param text
     */
    public void setText(com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfoDescriptionText text) {
        this.text = text;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TriggerAreaRelatedInfoInfoDescription)) return false;
        TriggerAreaRelatedInfoInfoDescription other = (TriggerAreaRelatedInfoInfoDescription) obj;
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
              this.text.equals(other.getText())));
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
            _hashCode += getText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
