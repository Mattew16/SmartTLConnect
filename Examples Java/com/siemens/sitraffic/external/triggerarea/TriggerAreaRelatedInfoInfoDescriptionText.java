/**
 * TriggerAreaRelatedInfoInfoDescriptionText.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.triggerarea;

public class TriggerAreaRelatedInfoInfoDescriptionText  implements java.io.Serializable {
    private java.lang.String languageId;  // attribute

    public TriggerAreaRelatedInfoInfoDescriptionText() {
    }

    public TriggerAreaRelatedInfoInfoDescriptionText(
           java.lang.String languageId) {
           this.languageId = languageId;
    }


    /**
     * Gets the languageId value for this TriggerAreaRelatedInfoInfoDescriptionText.
     * 
     * @return languageId
     */
    public java.lang.String getLanguageId() {
        return languageId;
    }


    /**
     * Sets the languageId value for this TriggerAreaRelatedInfoInfoDescriptionText.
     * 
     * @param languageId
     */
    public void setLanguageId(java.lang.String languageId) {
        this.languageId = languageId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TriggerAreaRelatedInfoInfoDescriptionText)) return false;
        TriggerAreaRelatedInfoInfoDescriptionText other = (TriggerAreaRelatedInfoInfoDescriptionText) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.languageId==null && other.getLanguageId()==null) || 
             (this.languageId!=null &&
              this.languageId.equals(other.getLanguageId())));
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
        if (getLanguageId() != null) {
            _hashCode += getLanguageId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
