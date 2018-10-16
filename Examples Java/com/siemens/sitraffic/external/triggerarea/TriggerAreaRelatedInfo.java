/**
 * TriggerAreaRelatedInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.triggerarea;

public class TriggerAreaRelatedInfo  implements java.io.Serializable {
    /* relation to trigger area description */
    private java.lang.String triggerAreaId;

    private com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfo[] info;

    public TriggerAreaRelatedInfo() {
    }

    public TriggerAreaRelatedInfo(
           java.lang.String triggerAreaId,
           com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfo[] info) {
           this.triggerAreaId = triggerAreaId;
           this.info = info;
    }


    /**
     * Gets the triggerAreaId value for this TriggerAreaRelatedInfo.
     * 
     * @return triggerAreaId   * relation to trigger area description
     */
    public java.lang.String getTriggerAreaId() {
        return triggerAreaId;
    }


    /**
     * Sets the triggerAreaId value for this TriggerAreaRelatedInfo.
     * 
     * @param triggerAreaId   * relation to trigger area description
     */
    public void setTriggerAreaId(java.lang.String triggerAreaId) {
        this.triggerAreaId = triggerAreaId;
    }


    /**
     * Gets the info value for this TriggerAreaRelatedInfo.
     * 
     * @return info
     */
    public com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfo[] getInfo() {
        return info;
    }


    /**
     * Sets the info value for this TriggerAreaRelatedInfo.
     * 
     * @param info
     */
    public void setInfo(com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfo[] info) {
        this.info = info;
    }

    public com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfo getInfo(int i) {
        return this.info[i];
    }

    public void setInfo(int i, com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfo _value) {
        this.info[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TriggerAreaRelatedInfo)) return false;
        TriggerAreaRelatedInfo other = (TriggerAreaRelatedInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.triggerAreaId==null && other.getTriggerAreaId()==null) || 
             (this.triggerAreaId!=null &&
              this.triggerAreaId.equals(other.getTriggerAreaId()))) &&
            ((this.info==null && other.getInfo()==null) || 
             (this.info!=null &&
              java.util.Arrays.equals(this.info, other.getInfo())));
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
        if (getTriggerAreaId() != null) {
            _hashCode += getTriggerAreaId().hashCode();
        }
        if (getInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInfo(), i);
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
