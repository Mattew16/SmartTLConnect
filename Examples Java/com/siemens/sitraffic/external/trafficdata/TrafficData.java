/**
 * TrafficData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;

public class TrafficData  implements java.io.Serializable {
    /* single sensor values at a single lane (Detektoren) */
    private com.siemens.sitraffic.external.trafficdata.DetectorType detector;

    /* sensor values accomulates several lanes (Messquerschnitte) */
    private com.siemens.sitraffic.external.trafficdata.DetectorGroupType detectorGroup;

    private com.siemens.sitraffic.external.trafficdata.TrafficSectionType trafficSection;

    private com.siemens.sitraffic.external.trafficdata.TrafficSubSectionType trafficSubSection;

    private com.siemens.sitraffic.external.trafficdata.TrafficAreaType trafficArea;

    private com.siemens.sitraffic.external.trafficdata.TrafficAreaType trafficSubArea;

    private com.siemens.sitraffic.external.trafficdata.LinkType link;

    public TrafficData() {
    }

    public TrafficData(
           com.siemens.sitraffic.external.trafficdata.DetectorType detector,
           com.siemens.sitraffic.external.trafficdata.DetectorGroupType detectorGroup,
           com.siemens.sitraffic.external.trafficdata.TrafficSectionType trafficSection,
           com.siemens.sitraffic.external.trafficdata.TrafficSubSectionType trafficSubSection,
           com.siemens.sitraffic.external.trafficdata.TrafficAreaType trafficArea,
           com.siemens.sitraffic.external.trafficdata.TrafficAreaType trafficSubArea,
           com.siemens.sitraffic.external.trafficdata.LinkType link) {
           this.detector = detector;
           this.detectorGroup = detectorGroup;
           this.trafficSection = trafficSection;
           this.trafficSubSection = trafficSubSection;
           this.trafficArea = trafficArea;
           this.trafficSubArea = trafficSubArea;
           this.link = link;
    }


    /**
     * Gets the detector value for this TrafficData.
     * 
     * @return detector   * single sensor values at a single lane (Detektoren)
     */
    public com.siemens.sitraffic.external.trafficdata.DetectorType getDetector() {
        return detector;
    }


    /**
     * Sets the detector value for this TrafficData.
     * 
     * @param detector   * single sensor values at a single lane (Detektoren)
     */
    public void setDetector(com.siemens.sitraffic.external.trafficdata.DetectorType detector) {
        this.detector = detector;
    }


    /**
     * Gets the detectorGroup value for this TrafficData.
     * 
     * @return detectorGroup   * sensor values accomulates several lanes (Messquerschnitte)
     */
    public com.siemens.sitraffic.external.trafficdata.DetectorGroupType getDetectorGroup() {
        return detectorGroup;
    }


    /**
     * Sets the detectorGroup value for this TrafficData.
     * 
     * @param detectorGroup   * sensor values accomulates several lanes (Messquerschnitte)
     */
    public void setDetectorGroup(com.siemens.sitraffic.external.trafficdata.DetectorGroupType detectorGroup) {
        this.detectorGroup = detectorGroup;
    }


    /**
     * Gets the trafficSection value for this TrafficData.
     * 
     * @return trafficSection
     */
    public com.siemens.sitraffic.external.trafficdata.TrafficSectionType getTrafficSection() {
        return trafficSection;
    }


    /**
     * Sets the trafficSection value for this TrafficData.
     * 
     * @param trafficSection
     */
    public void setTrafficSection(com.siemens.sitraffic.external.trafficdata.TrafficSectionType trafficSection) {
        this.trafficSection = trafficSection;
    }


    /**
     * Gets the trafficSubSection value for this TrafficData.
     * 
     * @return trafficSubSection
     */
    public com.siemens.sitraffic.external.trafficdata.TrafficSubSectionType getTrafficSubSection() {
        return trafficSubSection;
    }


    /**
     * Sets the trafficSubSection value for this TrafficData.
     * 
     * @param trafficSubSection
     */
    public void setTrafficSubSection(com.siemens.sitraffic.external.trafficdata.TrafficSubSectionType trafficSubSection) {
        this.trafficSubSection = trafficSubSection;
    }


    /**
     * Gets the trafficArea value for this TrafficData.
     * 
     * @return trafficArea
     */
    public com.siemens.sitraffic.external.trafficdata.TrafficAreaType getTrafficArea() {
        return trafficArea;
    }


    /**
     * Sets the trafficArea value for this TrafficData.
     * 
     * @param trafficArea
     */
    public void setTrafficArea(com.siemens.sitraffic.external.trafficdata.TrafficAreaType trafficArea) {
        this.trafficArea = trafficArea;
    }


    /**
     * Gets the trafficSubArea value for this TrafficData.
     * 
     * @return trafficSubArea
     */
    public com.siemens.sitraffic.external.trafficdata.TrafficAreaType getTrafficSubArea() {
        return trafficSubArea;
    }


    /**
     * Sets the trafficSubArea value for this TrafficData.
     * 
     * @param trafficSubArea
     */
    public void setTrafficSubArea(com.siemens.sitraffic.external.trafficdata.TrafficAreaType trafficSubArea) {
        this.trafficSubArea = trafficSubArea;
    }


    /**
     * Gets the link value for this TrafficData.
     * 
     * @return link
     */
    public com.siemens.sitraffic.external.trafficdata.LinkType getLink() {
        return link;
    }


    /**
     * Sets the link value for this TrafficData.
     * 
     * @param link
     */
    public void setLink(com.siemens.sitraffic.external.trafficdata.LinkType link) {
        this.link = link;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficData)) return false;
        TrafficData other = (TrafficData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.detector==null && other.getDetector()==null) || 
             (this.detector!=null &&
              this.detector.equals(other.getDetector()))) &&
            ((this.detectorGroup==null && other.getDetectorGroup()==null) || 
             (this.detectorGroup!=null &&
              this.detectorGroup.equals(other.getDetectorGroup()))) &&
            ((this.trafficSection==null && other.getTrafficSection()==null) || 
             (this.trafficSection!=null &&
              this.trafficSection.equals(other.getTrafficSection()))) &&
            ((this.trafficSubSection==null && other.getTrafficSubSection()==null) || 
             (this.trafficSubSection!=null &&
              this.trafficSubSection.equals(other.getTrafficSubSection()))) &&
            ((this.trafficArea==null && other.getTrafficArea()==null) || 
             (this.trafficArea!=null &&
              this.trafficArea.equals(other.getTrafficArea()))) &&
            ((this.trafficSubArea==null && other.getTrafficSubArea()==null) || 
             (this.trafficSubArea!=null &&
              this.trafficSubArea.equals(other.getTrafficSubArea()))) &&
            ((this.link==null && other.getLink()==null) || 
             (this.link!=null &&
              this.link.equals(other.getLink())));
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
        if (getDetector() != null) {
            _hashCode += getDetector().hashCode();
        }
        if (getDetectorGroup() != null) {
            _hashCode += getDetectorGroup().hashCode();
        }
        if (getTrafficSection() != null) {
            _hashCode += getTrafficSection().hashCode();
        }
        if (getTrafficSubSection() != null) {
            _hashCode += getTrafficSubSection().hashCode();
        }
        if (getTrafficArea() != null) {
            _hashCode += getTrafficArea().hashCode();
        }
        if (getTrafficSubArea() != null) {
            _hashCode += getTrafficSubArea().hashCode();
        }
        if (getLink() != null) {
            _hashCode += getLink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
