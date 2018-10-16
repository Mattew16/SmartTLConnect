/**
 * TriggerAreaRelatedInfoInfoObjectRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.triggerarea;

public class TriggerAreaRelatedInfoInfoObjectRef  implements java.io.Serializable {
    private java.lang.String objectType;

    private java.lang.String source;

    private java.lang.String objectId;

    public TriggerAreaRelatedInfoInfoObjectRef() {
    }

    public TriggerAreaRelatedInfoInfoObjectRef(
           java.lang.String objectType,
           java.lang.String source,
           java.lang.String objectId) {
           this.objectType = objectType;
           this.source = source;
           this.objectId = objectId;
    }


    /**
     * Gets the objectType value for this TriggerAreaRelatedInfoInfoObjectRef.
     * 
     * @return objectType
     */
    public java.lang.String getObjectType() {
        return objectType;
    }


    /**
     * Sets the objectType value for this TriggerAreaRelatedInfoInfoObjectRef.
     * 
     * @param objectType
     */
    public void setObjectType(java.lang.String objectType) {
        this.objectType = objectType;
    }


    /**
     * Gets the source value for this TriggerAreaRelatedInfoInfoObjectRef.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this TriggerAreaRelatedInfoInfoObjectRef.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the objectId value for this TriggerAreaRelatedInfoInfoObjectRef.
     * 
     * @return objectId
     */
    public java.lang.String getObjectId() {
        return objectId;
    }


    /**
     * Sets the objectId value for this TriggerAreaRelatedInfoInfoObjectRef.
     * 
     * @param objectId
     */
    public void setObjectId(java.lang.String objectId) {
        this.objectId = objectId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TriggerAreaRelatedInfoInfoObjectRef)) return false;
        TriggerAreaRelatedInfoInfoObjectRef other = (TriggerAreaRelatedInfoInfoObjectRef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objectType==null && other.getObjectType()==null) || 
             (this.objectType!=null &&
              this.objectType.equals(other.getObjectType()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.objectId==null && other.getObjectId()==null) || 
             (this.objectId!=null &&
              this.objectId.equals(other.getObjectId())));
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
        if (getObjectType() != null) {
            _hashCode += getObjectType().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getObjectId() != null) {
            _hashCode += getObjectId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
