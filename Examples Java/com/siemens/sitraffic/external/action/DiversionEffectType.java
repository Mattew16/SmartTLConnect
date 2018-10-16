/**
 * DiversionEffectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.action;

public class DiversionEffectType  implements java.io.Serializable {
    /* Befolgungsgrad */
    private float adherence;

    private com.siemens.sitraffic.external.action.LinkLocationsType discouragedLinks;

    private com.siemens.sitraffic.external.action.LinkLocationsType recommendedLinks;

    public DiversionEffectType() {
    }

    public DiversionEffectType(
           float adherence,
           com.siemens.sitraffic.external.action.LinkLocationsType discouragedLinks,
           com.siemens.sitraffic.external.action.LinkLocationsType recommendedLinks) {
           this.adherence = adherence;
           this.discouragedLinks = discouragedLinks;
           this.recommendedLinks = recommendedLinks;
    }


    /**
     * Gets the adherence value for this DiversionEffectType.
     * 
     * @return adherence   * Befolgungsgrad
     */
    public float getAdherence() {
        return adherence;
    }


    /**
     * Sets the adherence value for this DiversionEffectType.
     * 
     * @param adherence   * Befolgungsgrad
     */
    public void setAdherence(float adherence) {
        this.adherence = adherence;
    }


    /**
     * Gets the discouragedLinks value for this DiversionEffectType.
     * 
     * @return discouragedLinks
     */
    public com.siemens.sitraffic.external.action.LinkLocationsType getDiscouragedLinks() {
        return discouragedLinks;
    }


    /**
     * Sets the discouragedLinks value for this DiversionEffectType.
     * 
     * @param discouragedLinks
     */
    public void setDiscouragedLinks(com.siemens.sitraffic.external.action.LinkLocationsType discouragedLinks) {
        this.discouragedLinks = discouragedLinks;
    }


    /**
     * Gets the recommendedLinks value for this DiversionEffectType.
     * 
     * @return recommendedLinks
     */
    public com.siemens.sitraffic.external.action.LinkLocationsType getRecommendedLinks() {
        return recommendedLinks;
    }


    /**
     * Sets the recommendedLinks value for this DiversionEffectType.
     * 
     * @param recommendedLinks
     */
    public void setRecommendedLinks(com.siemens.sitraffic.external.action.LinkLocationsType recommendedLinks) {
        this.recommendedLinks = recommendedLinks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiversionEffectType)) return false;
        DiversionEffectType other = (DiversionEffectType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.adherence == other.getAdherence() &&
            ((this.discouragedLinks==null && other.getDiscouragedLinks()==null) || 
             (this.discouragedLinks!=null &&
              this.discouragedLinks.equals(other.getDiscouragedLinks()))) &&
            ((this.recommendedLinks==null && other.getRecommendedLinks()==null) || 
             (this.recommendedLinks!=null &&
              this.recommendedLinks.equals(other.getRecommendedLinks())));
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
        _hashCode += new Float(getAdherence()).hashCode();
        if (getDiscouragedLinks() != null) {
            _hashCode += getDiscouragedLinks().hashCode();
        }
        if (getRecommendedLinks() != null) {
            _hashCode += getRecommendedLinks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
