/**
 * TriggerAreaRelatedInfoInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.triggerarea;

public class TriggerAreaRelatedInfoInfo  implements java.io.Serializable {
    private com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfoDescription description;

    private com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfoBitmap bitmap;

    /* e.g. TrafficMessage */
    private com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfoObjectRef objectRef;

    /* with the priority a sequence could be defined */
    private java.lang.String priority;

    private com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfoValidity validity;

    public TriggerAreaRelatedInfoInfo() {
    }

    public TriggerAreaRelatedInfoInfo(
           com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfoDescription description,
           com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfoBitmap bitmap,
           com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfoObjectRef objectRef,
           java.lang.String priority,
           com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfoValidity validity) {
           this.description = description;
           this.bitmap = bitmap;
           this.objectRef = objectRef;
           this.priority = priority;
           this.validity = validity;
    }


    /**
     * Gets the description value for this TriggerAreaRelatedInfoInfo.
     * 
     * @return description
     */
    public com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfoDescription getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TriggerAreaRelatedInfoInfo.
     * 
     * @param description
     */
    public void setDescription(com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfoDescription description) {
        this.description = description;
    }


    /**
     * Gets the bitmap value for this TriggerAreaRelatedInfoInfo.
     * 
     * @return bitmap
     */
    public com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfoBitmap getBitmap() {
        return bitmap;
    }


    /**
     * Sets the bitmap value for this TriggerAreaRelatedInfoInfo.
     * 
     * @param bitmap
     */
    public void setBitmap(com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfoBitmap bitmap) {
        this.bitmap = bitmap;
    }


    /**
     * Gets the objectRef value for this TriggerAreaRelatedInfoInfo.
     * 
     * @return objectRef   * e.g. TrafficMessage
     */
    public com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfoObjectRef getObjectRef() {
        return objectRef;
    }


    /**
     * Sets the objectRef value for this TriggerAreaRelatedInfoInfo.
     * 
     * @param objectRef   * e.g. TrafficMessage
     */
    public void setObjectRef(com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfoObjectRef objectRef) {
        this.objectRef = objectRef;
    }


    /**
     * Gets the priority value for this TriggerAreaRelatedInfoInfo.
     * 
     * @return priority   * with the priority a sequence could be defined
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this TriggerAreaRelatedInfoInfo.
     * 
     * @param priority   * with the priority a sequence could be defined
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the validity value for this TriggerAreaRelatedInfoInfo.
     * 
     * @return validity
     */
    public com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfoValidity getValidity() {
        return validity;
    }


    /**
     * Sets the validity value for this TriggerAreaRelatedInfoInfo.
     * 
     * @param validity
     */
    public void setValidity(com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoInfoValidity validity) {
        this.validity = validity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TriggerAreaRelatedInfoInfo)) return false;
        TriggerAreaRelatedInfoInfo other = (TriggerAreaRelatedInfoInfo) obj;
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
              this.description.equals(other.getDescription()))) &&
            ((this.bitmap==null && other.getBitmap()==null) || 
             (this.bitmap!=null &&
              this.bitmap.equals(other.getBitmap()))) &&
            ((this.objectRef==null && other.getObjectRef()==null) || 
             (this.objectRef!=null &&
              this.objectRef.equals(other.getObjectRef()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.validity==null && other.getValidity()==null) || 
             (this.validity!=null &&
              this.validity.equals(other.getValidity())));
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
            _hashCode += getDescription().hashCode();
        }
        if (getBitmap() != null) {
            _hashCode += getBitmap().hashCode();
        }
        if (getObjectRef() != null) {
            _hashCode += getObjectRef().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getValidity() != null) {
            _hashCode += getValidity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
