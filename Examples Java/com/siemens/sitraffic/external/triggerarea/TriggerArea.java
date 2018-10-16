/**
 * TriggerArea.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.triggerarea;

public class TriggerArea  implements java.io.Serializable {
    private com.siemens.sitraffic.external.triggerarea.TriggerAreaDescriptionType triggerAreaDescription;

    private com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoType triggerAreaRelatedInfo;

    public TriggerArea() {
    }

    public TriggerArea(
           com.siemens.sitraffic.external.triggerarea.TriggerAreaDescriptionType triggerAreaDescription,
           com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoType triggerAreaRelatedInfo) {
           this.triggerAreaDescription = triggerAreaDescription;
           this.triggerAreaRelatedInfo = triggerAreaRelatedInfo;
    }


    /**
     * Gets the triggerAreaDescription value for this TriggerArea.
     * 
     * @return triggerAreaDescription
     */
    public com.siemens.sitraffic.external.triggerarea.TriggerAreaDescriptionType getTriggerAreaDescription() {
        return triggerAreaDescription;
    }


    /**
     * Sets the triggerAreaDescription value for this TriggerArea.
     * 
     * @param triggerAreaDescription
     */
    public void setTriggerAreaDescription(com.siemens.sitraffic.external.triggerarea.TriggerAreaDescriptionType triggerAreaDescription) {
        this.triggerAreaDescription = triggerAreaDescription;
    }


    /**
     * Gets the triggerAreaRelatedInfo value for this TriggerArea.
     * 
     * @return triggerAreaRelatedInfo
     */
    public com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoType getTriggerAreaRelatedInfo() {
        return triggerAreaRelatedInfo;
    }


    /**
     * Sets the triggerAreaRelatedInfo value for this TriggerArea.
     * 
     * @param triggerAreaRelatedInfo
     */
    public void setTriggerAreaRelatedInfo(com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoType triggerAreaRelatedInfo) {
        this.triggerAreaRelatedInfo = triggerAreaRelatedInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TriggerArea)) return false;
        TriggerArea other = (TriggerArea) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.triggerAreaDescription==null && other.getTriggerAreaDescription()==null) || 
             (this.triggerAreaDescription!=null &&
              this.triggerAreaDescription.equals(other.getTriggerAreaDescription()))) &&
            ((this.triggerAreaRelatedInfo==null && other.getTriggerAreaRelatedInfo()==null) || 
             (this.triggerAreaRelatedInfo!=null &&
              this.triggerAreaRelatedInfo.equals(other.getTriggerAreaRelatedInfo())));
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
        if (getTriggerAreaDescription() != null) {
            _hashCode += getTriggerAreaDescription().hashCode();
        }
        if (getTriggerAreaRelatedInfo() != null) {
            _hashCode += getTriggerAreaRelatedInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
