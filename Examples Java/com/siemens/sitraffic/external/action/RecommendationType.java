/**
 * RecommendationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.action;

public class RecommendationType  implements java.io.Serializable {
    private java.lang.String text;

    /* mandatory if kind is of type sign */
    private com.siemens.sitraffic.external.action.LinkLocationType startLink;

    private com.siemens.sitraffic.external.action.LinkLocationsType destinationLinks;

    private com.siemens.sitraffic.external.action.DiversionEffectType effect;

    private com.siemens.sitraffic.external.action.RecommendationTypeKind kind;  // attribute

    public RecommendationType() {
    }

    public RecommendationType(
           java.lang.String text,
           com.siemens.sitraffic.external.action.LinkLocationType startLink,
           com.siemens.sitraffic.external.action.LinkLocationsType destinationLinks,
           com.siemens.sitraffic.external.action.DiversionEffectType effect,
           com.siemens.sitraffic.external.action.RecommendationTypeKind kind) {
           this.text = text;
           this.startLink = startLink;
           this.destinationLinks = destinationLinks;
           this.effect = effect;
           this.kind = kind;
    }


    /**
     * Gets the text value for this RecommendationType.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this RecommendationType.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the startLink value for this RecommendationType.
     * 
     * @return startLink   * mandatory if kind is of type sign
     */
    public com.siemens.sitraffic.external.action.LinkLocationType getStartLink() {
        return startLink;
    }


    /**
     * Sets the startLink value for this RecommendationType.
     * 
     * @param startLink   * mandatory if kind is of type sign
     */
    public void setStartLink(com.siemens.sitraffic.external.action.LinkLocationType startLink) {
        this.startLink = startLink;
    }


    /**
     * Gets the destinationLinks value for this RecommendationType.
     * 
     * @return destinationLinks
     */
    public com.siemens.sitraffic.external.action.LinkLocationsType getDestinationLinks() {
        return destinationLinks;
    }


    /**
     * Sets the destinationLinks value for this RecommendationType.
     * 
     * @param destinationLinks
     */
    public void setDestinationLinks(com.siemens.sitraffic.external.action.LinkLocationsType destinationLinks) {
        this.destinationLinks = destinationLinks;
    }


    /**
     * Gets the effect value for this RecommendationType.
     * 
     * @return effect
     */
    public com.siemens.sitraffic.external.action.DiversionEffectType getEffect() {
        return effect;
    }


    /**
     * Sets the effect value for this RecommendationType.
     * 
     * @param effect
     */
    public void setEffect(com.siemens.sitraffic.external.action.DiversionEffectType effect) {
        this.effect = effect;
    }


    /**
     * Gets the kind value for this RecommendationType.
     * 
     * @return kind
     */
    public com.siemens.sitraffic.external.action.RecommendationTypeKind getKind() {
        return kind;
    }


    /**
     * Sets the kind value for this RecommendationType.
     * 
     * @param kind
     */
    public void setKind(com.siemens.sitraffic.external.action.RecommendationTypeKind kind) {
        this.kind = kind;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecommendationType)) return false;
        RecommendationType other = (RecommendationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.startLink==null && other.getStartLink()==null) || 
             (this.startLink!=null &&
              this.startLink.equals(other.getStartLink()))) &&
            ((this.destinationLinks==null && other.getDestinationLinks()==null) || 
             (this.destinationLinks!=null &&
              this.destinationLinks.equals(other.getDestinationLinks()))) &&
            ((this.effect==null && other.getEffect()==null) || 
             (this.effect!=null &&
              this.effect.equals(other.getEffect()))) &&
            ((this.kind==null && other.getKind()==null) || 
             (this.kind!=null &&
              this.kind.equals(other.getKind())));
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
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getStartLink() != null) {
            _hashCode += getStartLink().hashCode();
        }
        if (getDestinationLinks() != null) {
            _hashCode += getDestinationLinks().hashCode();
        }
        if (getEffect() != null) {
            _hashCode += getEffect().hashCode();
        }
        if (getKind() != null) {
            _hashCode += getKind().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
