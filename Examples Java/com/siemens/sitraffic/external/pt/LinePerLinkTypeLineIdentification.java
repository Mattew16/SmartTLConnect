/**
 * LinePerLinkTypeLineIdentification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.pt;

public class LinePerLinkTypeLineIdentification  implements java.io.Serializable {
    private java.lang.String linkId;  // attribute

    private java.lang.String fromNodeId;  // attribute

    private int lineId;  // attribute

    private java.lang.String lineDirection;  // attribute

    public LinePerLinkTypeLineIdentification() {
    }

    public LinePerLinkTypeLineIdentification(
           java.lang.String linkId,
           java.lang.String fromNodeId,
           int lineId,
           java.lang.String lineDirection) {
           this.linkId = linkId;
           this.fromNodeId = fromNodeId;
           this.lineId = lineId;
           this.lineDirection = lineDirection;
    }


    /**
     * Gets the linkId value for this LinePerLinkTypeLineIdentification.
     * 
     * @return linkId
     */
    public java.lang.String getLinkId() {
        return linkId;
    }


    /**
     * Sets the linkId value for this LinePerLinkTypeLineIdentification.
     * 
     * @param linkId
     */
    public void setLinkId(java.lang.String linkId) {
        this.linkId = linkId;
    }


    /**
     * Gets the fromNodeId value for this LinePerLinkTypeLineIdentification.
     * 
     * @return fromNodeId
     */
    public java.lang.String getFromNodeId() {
        return fromNodeId;
    }


    /**
     * Sets the fromNodeId value for this LinePerLinkTypeLineIdentification.
     * 
     * @param fromNodeId
     */
    public void setFromNodeId(java.lang.String fromNodeId) {
        this.fromNodeId = fromNodeId;
    }


    /**
     * Gets the lineId value for this LinePerLinkTypeLineIdentification.
     * 
     * @return lineId
     */
    public int getLineId() {
        return lineId;
    }


    /**
     * Sets the lineId value for this LinePerLinkTypeLineIdentification.
     * 
     * @param lineId
     */
    public void setLineId(int lineId) {
        this.lineId = lineId;
    }


    /**
     * Gets the lineDirection value for this LinePerLinkTypeLineIdentification.
     * 
     * @return lineDirection
     */
    public java.lang.String getLineDirection() {
        return lineDirection;
    }


    /**
     * Sets the lineDirection value for this LinePerLinkTypeLineIdentification.
     * 
     * @param lineDirection
     */
    public void setLineDirection(java.lang.String lineDirection) {
        this.lineDirection = lineDirection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinePerLinkTypeLineIdentification)) return false;
        LinePerLinkTypeLineIdentification other = (LinePerLinkTypeLineIdentification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.linkId==null && other.getLinkId()==null) || 
             (this.linkId!=null &&
              this.linkId.equals(other.getLinkId()))) &&
            ((this.fromNodeId==null && other.getFromNodeId()==null) || 
             (this.fromNodeId!=null &&
              this.fromNodeId.equals(other.getFromNodeId()))) &&
            this.lineId == other.getLineId() &&
            ((this.lineDirection==null && other.getLineDirection()==null) || 
             (this.lineDirection!=null &&
              this.lineDirection.equals(other.getLineDirection())));
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
        if (getLinkId() != null) {
            _hashCode += getLinkId().hashCode();
        }
        if (getFromNodeId() != null) {
            _hashCode += getFromNodeId().hashCode();
        }
        _hashCode += getLineId();
        if (getLineDirection() != null) {
            _hashCode += getLineDirection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
