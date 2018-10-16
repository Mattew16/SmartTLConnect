/**
 * SignControlType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.action;

public class SignControlType  implements java.io.Serializable {
    private int signalPlanId;

    private java.lang.String objectId;

    private com.siemens.sitraffic.external.action.SignControlEffectType effect;

    public SignControlType() {
    }

    public SignControlType(
           int signalPlanId,
           java.lang.String objectId,
           com.siemens.sitraffic.external.action.SignControlEffectType effect) {
           this.signalPlanId = signalPlanId;
           this.objectId = objectId;
           this.effect = effect;
    }


    /**
     * Gets the signalPlanId value for this SignControlType.
     * 
     * @return signalPlanId
     */
    public int getSignalPlanId() {
        return signalPlanId;
    }


    /**
     * Sets the signalPlanId value for this SignControlType.
     * 
     * @param signalPlanId
     */
    public void setSignalPlanId(int signalPlanId) {
        this.signalPlanId = signalPlanId;
    }


    /**
     * Gets the objectId value for this SignControlType.
     * 
     * @return objectId
     */
    public java.lang.String getObjectId() {
        return objectId;
    }


    /**
     * Sets the objectId value for this SignControlType.
     * 
     * @param objectId
     */
    public void setObjectId(java.lang.String objectId) {
        this.objectId = objectId;
    }


    /**
     * Gets the effect value for this SignControlType.
     * 
     * @return effect
     */
    public com.siemens.sitraffic.external.action.SignControlEffectType getEffect() {
        return effect;
    }


    /**
     * Sets the effect value for this SignControlType.
     * 
     * @param effect
     */
    public void setEffect(com.siemens.sitraffic.external.action.SignControlEffectType effect) {
        this.effect = effect;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignControlType)) return false;
        SignControlType other = (SignControlType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.signalPlanId == other.getSignalPlanId() &&
            ((this.objectId==null && other.getObjectId()==null) || 
             (this.objectId!=null &&
              this.objectId.equals(other.getObjectId()))) &&
            ((this.effect==null && other.getEffect()==null) || 
             (this.effect!=null &&
              this.effect.equals(other.getEffect())));
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
        _hashCode += getSignalPlanId();
        if (getObjectId() != null) {
            _hashCode += getObjectId().hashCode();
        }
        if (getEffect() != null) {
            _hashCode += getEffect().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
