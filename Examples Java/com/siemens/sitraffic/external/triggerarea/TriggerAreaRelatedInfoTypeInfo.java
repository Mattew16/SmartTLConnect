/**
 * TriggerAreaRelatedInfoTypeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.triggerarea;

public class TriggerAreaRelatedInfoTypeInfo  implements java.io.Serializable {
    private com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoDescription description;

    private com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoBitmap[] bitmap;

    /* e.g. TrafficMessage */
    private com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoObjectRef objectRef;

    /* with the priority a sequence could be defined */
    private java.lang.String priority;

    private com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoValidity validity;

    public TriggerAreaRelatedInfoTypeInfo() {
    }

    public TriggerAreaRelatedInfoTypeInfo(
           com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoDescription description,
           com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoBitmap[] bitmap,
           com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoObjectRef objectRef,
           java.lang.String priority,
           com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoValidity validity) {
           this.description = description;
           this.bitmap = bitmap;
           this.objectRef = objectRef;
           this.priority = priority;
           this.validity = validity;
    }


    /**
     * Gets the description value for this TriggerAreaRelatedInfoTypeInfo.
     * 
     * @return description
     */
    public com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoDescription getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TriggerAreaRelatedInfoTypeInfo.
     * 
     * @param description
     */
    public void setDescription(com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoDescription description) {
        this.description = description;
    }


    /**
     * Gets the bitmap value for this TriggerAreaRelatedInfoTypeInfo.
     * 
     * @return bitmap
     */
    public com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoBitmap[] getBitmap() {
        return bitmap;
    }


    /**
     * Sets the bitmap value for this TriggerAreaRelatedInfoTypeInfo.
     * 
     * @param bitmap
     */
    public void setBitmap(com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoBitmap[] bitmap) {
        this.bitmap = bitmap;
    }

    public com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoBitmap getBitmap(int i) {
        return this.bitmap[i];
    }

    public void setBitmap(int i, com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoBitmap _value) {
        this.bitmap[i] = _value;
    }


    /**
     * Gets the objectRef value for this TriggerAreaRelatedInfoTypeInfo.
     * 
     * @return objectRef   * e.g. TrafficMessage
     */
    public com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoObjectRef getObjectRef() {
        return objectRef;
    }


    /**
     * Sets the objectRef value for this TriggerAreaRelatedInfoTypeInfo.
     * 
     * @param objectRef   * e.g. TrafficMessage
     */
    public void setObjectRef(com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoObjectRef objectRef) {
        this.objectRef = objectRef;
    }


    /**
     * Gets the priority value for this TriggerAreaRelatedInfoTypeInfo.
     * 
     * @return priority   * with the priority a sequence could be defined
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this TriggerAreaRelatedInfoTypeInfo.
     * 
     * @param priority   * with the priority a sequence could be defined
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the validity value for this TriggerAreaRelatedInfoTypeInfo.
     * 
     * @return validity
     */
    public com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoValidity getValidity() {
        return validity;
    }


    /**
     * Sets the validity value for this TriggerAreaRelatedInfoTypeInfo.
     * 
     * @param validity
     */
    public void setValidity(com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoValidity validity) {
        this.validity = validity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TriggerAreaRelatedInfoTypeInfo)) return false;
        TriggerAreaRelatedInfoTypeInfo other = (TriggerAreaRelatedInfoTypeInfo) obj;
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
              java.util.Arrays.equals(this.bitmap, other.getBitmap()))) &&
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBitmap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBitmap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
