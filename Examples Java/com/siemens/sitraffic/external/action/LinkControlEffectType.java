/**
 * LinkControlEffectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.action;

public class LinkControlEffectType  implements java.io.Serializable {
    private int restrictionValue;

    private com.siemens.sitraffic.external.action.LinkLocationsType affectedLinks;

    private com.siemens.sitraffic.external.action.LinkControlEffectTypeRestrictiontype restrictiontype;  // attribute

    public LinkControlEffectType() {
    }

    public LinkControlEffectType(
           int restrictionValue,
           com.siemens.sitraffic.external.action.LinkLocationsType affectedLinks,
           com.siemens.sitraffic.external.action.LinkControlEffectTypeRestrictiontype restrictiontype) {
           this.restrictionValue = restrictionValue;
           this.affectedLinks = affectedLinks;
           this.restrictiontype = restrictiontype;
    }


    /**
     * Gets the restrictionValue value for this LinkControlEffectType.
     * 
     * @return restrictionValue
     */
    public int getRestrictionValue() {
        return restrictionValue;
    }


    /**
     * Sets the restrictionValue value for this LinkControlEffectType.
     * 
     * @param restrictionValue
     */
    public void setRestrictionValue(int restrictionValue) {
        this.restrictionValue = restrictionValue;
    }


    /**
     * Gets the affectedLinks value for this LinkControlEffectType.
     * 
     * @return affectedLinks
     */
    public com.siemens.sitraffic.external.action.LinkLocationsType getAffectedLinks() {
        return affectedLinks;
    }


    /**
     * Sets the affectedLinks value for this LinkControlEffectType.
     * 
     * @param affectedLinks
     */
    public void setAffectedLinks(com.siemens.sitraffic.external.action.LinkLocationsType affectedLinks) {
        this.affectedLinks = affectedLinks;
    }


    /**
     * Gets the restrictiontype value for this LinkControlEffectType.
     * 
     * @return restrictiontype
     */
    public com.siemens.sitraffic.external.action.LinkControlEffectTypeRestrictiontype getRestrictiontype() {
        return restrictiontype;
    }


    /**
     * Sets the restrictiontype value for this LinkControlEffectType.
     * 
     * @param restrictiontype
     */
    public void setRestrictiontype(com.siemens.sitraffic.external.action.LinkControlEffectTypeRestrictiontype restrictiontype) {
        this.restrictiontype = restrictiontype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinkControlEffectType)) return false;
        LinkControlEffectType other = (LinkControlEffectType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.restrictionValue == other.getRestrictionValue() &&
            ((this.affectedLinks==null && other.getAffectedLinks()==null) || 
             (this.affectedLinks!=null &&
              this.affectedLinks.equals(other.getAffectedLinks()))) &&
            ((this.restrictiontype==null && other.getRestrictiontype()==null) || 
             (this.restrictiontype!=null &&
              this.restrictiontype.equals(other.getRestrictiontype())));
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
        _hashCode += getRestrictionValue();
        if (getAffectedLinks() != null) {
            _hashCode += getAffectedLinks().hashCode();
        }
        if (getRestrictiontype() != null) {
            _hashCode += getRestrictiontype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
