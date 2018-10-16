/**
 * SignControlEffectTypeTurnGreenTime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.action;

public class SignControlEffectTypeTurnGreenTime  implements java.io.Serializable {
    private float greenTime;

    private com.siemens.sitraffic.external.action.LinkLocationsType fromLink;

    private com.siemens.sitraffic.external.action.LinkLocationsType toLink;

    public SignControlEffectTypeTurnGreenTime() {
    }

    public SignControlEffectTypeTurnGreenTime(
           float greenTime,
           com.siemens.sitraffic.external.action.LinkLocationsType fromLink,
           com.siemens.sitraffic.external.action.LinkLocationsType toLink) {
           this.greenTime = greenTime;
           this.fromLink = fromLink;
           this.toLink = toLink;
    }


    /**
     * Gets the greenTime value for this SignControlEffectTypeTurnGreenTime.
     * 
     * @return greenTime
     */
    public float getGreenTime() {
        return greenTime;
    }


    /**
     * Sets the greenTime value for this SignControlEffectTypeTurnGreenTime.
     * 
     * @param greenTime
     */
    public void setGreenTime(float greenTime) {
        this.greenTime = greenTime;
    }


    /**
     * Gets the fromLink value for this SignControlEffectTypeTurnGreenTime.
     * 
     * @return fromLink
     */
    public com.siemens.sitraffic.external.action.LinkLocationsType getFromLink() {
        return fromLink;
    }


    /**
     * Sets the fromLink value for this SignControlEffectTypeTurnGreenTime.
     * 
     * @param fromLink
     */
    public void setFromLink(com.siemens.sitraffic.external.action.LinkLocationsType fromLink) {
        this.fromLink = fromLink;
    }


    /**
     * Gets the toLink value for this SignControlEffectTypeTurnGreenTime.
     * 
     * @return toLink
     */
    public com.siemens.sitraffic.external.action.LinkLocationsType getToLink() {
        return toLink;
    }


    /**
     * Sets the toLink value for this SignControlEffectTypeTurnGreenTime.
     * 
     * @param toLink
     */
    public void setToLink(com.siemens.sitraffic.external.action.LinkLocationsType toLink) {
        this.toLink = toLink;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignControlEffectTypeTurnGreenTime)) return false;
        SignControlEffectTypeTurnGreenTime other = (SignControlEffectTypeTurnGreenTime) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.greenTime == other.getGreenTime() &&
            ((this.fromLink==null && other.getFromLink()==null) || 
             (this.fromLink!=null &&
              this.fromLink.equals(other.getFromLink()))) &&
            ((this.toLink==null && other.getToLink()==null) || 
             (this.toLink!=null &&
              this.toLink.equals(other.getToLink())));
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
        _hashCode += new Float(getGreenTime()).hashCode();
        if (getFromLink() != null) {
            _hashCode += getFromLink().hashCode();
        }
        if (getToLink() != null) {
            _hashCode += getToLink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
