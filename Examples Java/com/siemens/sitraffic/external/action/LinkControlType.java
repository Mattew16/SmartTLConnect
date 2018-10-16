/**
 * LinkControlType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.action;

public class LinkControlType  implements java.io.Serializable {
    private com.siemens.sitraffic.external.action.LinkControlEffectType effect;

    public LinkControlType() {
    }

    public LinkControlType(
           com.siemens.sitraffic.external.action.LinkControlEffectType effect) {
           this.effect = effect;
    }


    /**
     * Gets the effect value for this LinkControlType.
     * 
     * @return effect
     */
    public com.siemens.sitraffic.external.action.LinkControlEffectType getEffect() {
        return effect;
    }


    /**
     * Sets the effect value for this LinkControlType.
     * 
     * @param effect
     */
    public void setEffect(com.siemens.sitraffic.external.action.LinkControlEffectType effect) {
        this.effect = effect;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinkControlType)) return false;
        LinkControlType other = (LinkControlType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        if (getEffect() != null) {
            _hashCode += getEffect().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
