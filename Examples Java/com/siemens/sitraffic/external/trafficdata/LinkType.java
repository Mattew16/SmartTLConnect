/**
 * LinkType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;

public class LinkType  implements java.io.Serializable {
    private com.siemens.sitraffic.external.trafficdata.CurrentLinkType currentLink;

    private com.siemens.sitraffic.external.trafficdata.PredictionLinkType predictionLink;

    public LinkType() {
    }

    public LinkType(
           com.siemens.sitraffic.external.trafficdata.CurrentLinkType currentLink,
           com.siemens.sitraffic.external.trafficdata.PredictionLinkType predictionLink) {
           this.currentLink = currentLink;
           this.predictionLink = predictionLink;
    }


    /**
     * Gets the currentLink value for this LinkType.
     * 
     * @return currentLink
     */
    public com.siemens.sitraffic.external.trafficdata.CurrentLinkType getCurrentLink() {
        return currentLink;
    }


    /**
     * Sets the currentLink value for this LinkType.
     * 
     * @param currentLink
     */
    public void setCurrentLink(com.siemens.sitraffic.external.trafficdata.CurrentLinkType currentLink) {
        this.currentLink = currentLink;
    }


    /**
     * Gets the predictionLink value for this LinkType.
     * 
     * @return predictionLink
     */
    public com.siemens.sitraffic.external.trafficdata.PredictionLinkType getPredictionLink() {
        return predictionLink;
    }


    /**
     * Sets the predictionLink value for this LinkType.
     * 
     * @param predictionLink
     */
    public void setPredictionLink(com.siemens.sitraffic.external.trafficdata.PredictionLinkType predictionLink) {
        this.predictionLink = predictionLink;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinkType)) return false;
        LinkType other = (LinkType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currentLink==null && other.getCurrentLink()==null) || 
             (this.currentLink!=null &&
              this.currentLink.equals(other.getCurrentLink()))) &&
            ((this.predictionLink==null && other.getPredictionLink()==null) || 
             (this.predictionLink!=null &&
              this.predictionLink.equals(other.getPredictionLink())));
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
        if (getCurrentLink() != null) {
            _hashCode += getCurrentLink().hashCode();
        }
        if (getPredictionLink() != null) {
            _hashCode += getPredictionLink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
