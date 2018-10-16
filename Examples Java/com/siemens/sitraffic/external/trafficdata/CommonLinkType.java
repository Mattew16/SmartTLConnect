/**
 * CommonLinkType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;

public class CommonLinkType  implements java.io.Serializable {
    /* link -> Identifikationsmerkma */
    private long linkId;

    /* Richtungsbezug -> Identifikationsmerkma */
    private long fromNodeId;

    /* Meß- oder Berechnungszeitpunkt der gelieferten Daten */
    private com.siemens.sitraffic.external.trafficdata.TimelineType timeline;

    public CommonLinkType() {
    }

    public CommonLinkType(
           long linkId,
           long fromNodeId,
           com.siemens.sitraffic.external.trafficdata.TimelineType timeline) {
           this.linkId = linkId;
           this.fromNodeId = fromNodeId;
           this.timeline = timeline;
    }


    /**
     * Gets the linkId value for this CommonLinkType.
     * 
     * @return linkId   * link -> Identifikationsmerkma
     */
    public long getLinkId() {
        return linkId;
    }


    /**
     * Sets the linkId value for this CommonLinkType.
     * 
     * @param linkId   * link -> Identifikationsmerkma
     */
    public void setLinkId(long linkId) {
        this.linkId = linkId;
    }


    /**
     * Gets the fromNodeId value for this CommonLinkType.
     * 
     * @return fromNodeId   * Richtungsbezug -> Identifikationsmerkma
     */
    public long getFromNodeId() {
        return fromNodeId;
    }


    /**
     * Sets the fromNodeId value for this CommonLinkType.
     * 
     * @param fromNodeId   * Richtungsbezug -> Identifikationsmerkma
     */
    public void setFromNodeId(long fromNodeId) {
        this.fromNodeId = fromNodeId;
    }


    /**
     * Gets the timeline value for this CommonLinkType.
     * 
     * @return timeline   * Meß- oder Berechnungszeitpunkt der gelieferten Daten
     */
    public com.siemens.sitraffic.external.trafficdata.TimelineType getTimeline() {
        return timeline;
    }


    /**
     * Sets the timeline value for this CommonLinkType.
     * 
     * @param timeline   * Meß- oder Berechnungszeitpunkt der gelieferten Daten
     */
    public void setTimeline(com.siemens.sitraffic.external.trafficdata.TimelineType timeline) {
        this.timeline = timeline;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommonLinkType)) return false;
        CommonLinkType other = (CommonLinkType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.linkId == other.getLinkId() &&
            this.fromNodeId == other.getFromNodeId() &&
            ((this.timeline==null && other.getTimeline()==null) || 
             (this.timeline!=null &&
              this.timeline.equals(other.getTimeline())));
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
        _hashCode += new Long(getLinkId()).hashCode();
        _hashCode += new Long(getFromNodeId()).hashCode();
        if (getTimeline() != null) {
            _hashCode += getTimeline().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
