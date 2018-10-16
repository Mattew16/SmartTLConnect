/**
 * PT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.pt;

public class PT  implements java.io.Serializable {
    /* objecttype: PT_Link */
    private com.siemens.sitraffic.external.pt.LinkType link;

    /* objecttype: PT_LinePerLink */
    private com.siemens.sitraffic.external.pt.LinePerLinkType linePerLink;

    public PT() {
    }

    public PT(
           com.siemens.sitraffic.external.pt.LinkType link,
           com.siemens.sitraffic.external.pt.LinePerLinkType linePerLink) {
           this.link = link;
           this.linePerLink = linePerLink;
    }


    /**
     * Gets the link value for this PT.
     * 
     * @return link   * objecttype: PT_Link
     */
    public com.siemens.sitraffic.external.pt.LinkType getLink() {
        return link;
    }


    /**
     * Sets the link value for this PT.
     * 
     * @param link   * objecttype: PT_Link
     */
    public void setLink(com.siemens.sitraffic.external.pt.LinkType link) {
        this.link = link;
    }


    /**
     * Gets the linePerLink value for this PT.
     * 
     * @return linePerLink   * objecttype: PT_LinePerLink
     */
    public com.siemens.sitraffic.external.pt.LinePerLinkType getLinePerLink() {
        return linePerLink;
    }


    /**
     * Sets the linePerLink value for this PT.
     * 
     * @param linePerLink   * objecttype: PT_LinePerLink
     */
    public void setLinePerLink(com.siemens.sitraffic.external.pt.LinePerLinkType linePerLink) {
        this.linePerLink = linePerLink;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PT)) return false;
        PT other = (PT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.link==null && other.getLink()==null) || 
             (this.link!=null &&
              this.link.equals(other.getLink()))) &&
            ((this.linePerLink==null && other.getLinePerLink()==null) || 
             (this.linePerLink!=null &&
              this.linePerLink.equals(other.getLinePerLink())));
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
        if (getLink() != null) {
            _hashCode += getLink().hashCode();
        }
        if (getLinePerLink() != null) {
            _hashCode += getLinePerLink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
