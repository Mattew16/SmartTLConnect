/**
 * LinePerLinkType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.pt;

public class LinePerLinkType  implements java.io.Serializable {
    /* Original Timestamp of the described values (end of measurement-nearly
     * the entry time in case of no transmission delay). No local time zone
     * will be added to the date and time format, so pure UTC is used at
     * the interfaces. */
    private com.siemens.sitraffic.external.pt.TimelineType timeline;

    /* General state */
    private com.siemens.sitraffic.external.pt.StateType state;

    private com.siemens.sitraffic.external.pt.ValuesType values;

    /* fromNodeId, linkId, lineId and linedirection */
    private com.siemens.sitraffic.external.pt.LinePerLinkTypeLineIdentification lineIdentification;

    public LinePerLinkType() {
    }

    public LinePerLinkType(
           com.siemens.sitraffic.external.pt.TimelineType timeline,
           com.siemens.sitraffic.external.pt.StateType state,
           com.siemens.sitraffic.external.pt.ValuesType values,
           com.siemens.sitraffic.external.pt.LinePerLinkTypeLineIdentification lineIdentification) {
           this.timeline = timeline;
           this.state = state;
           this.values = values;
           this.lineIdentification = lineIdentification;
    }


    /**
     * Gets the timeline value for this LinePerLinkType.
     * 
     * @return timeline   * Original Timestamp of the described values (end of measurement-nearly
     * the entry time in case of no transmission delay). No local time zone
     * will be added to the date and time format, so pure UTC is used at
     * the interfaces.
     */
    public com.siemens.sitraffic.external.pt.TimelineType getTimeline() {
        return timeline;
    }


    /**
     * Sets the timeline value for this LinePerLinkType.
     * 
     * @param timeline   * Original Timestamp of the described values (end of measurement-nearly
     * the entry time in case of no transmission delay). No local time zone
     * will be added to the date and time format, so pure UTC is used at
     * the interfaces.
     */
    public void setTimeline(com.siemens.sitraffic.external.pt.TimelineType timeline) {
        this.timeline = timeline;
    }


    /**
     * Gets the state value for this LinePerLinkType.
     * 
     * @return state   * General state
     */
    public com.siemens.sitraffic.external.pt.StateType getState() {
        return state;
    }


    /**
     * Sets the state value for this LinePerLinkType.
     * 
     * @param state   * General state
     */
    public void setState(com.siemens.sitraffic.external.pt.StateType state) {
        this.state = state;
    }


    /**
     * Gets the values value for this LinePerLinkType.
     * 
     * @return values
     */
    public com.siemens.sitraffic.external.pt.ValuesType getValues() {
        return values;
    }


    /**
     * Sets the values value for this LinePerLinkType.
     * 
     * @param values
     */
    public void setValues(com.siemens.sitraffic.external.pt.ValuesType values) {
        this.values = values;
    }


    /**
     * Gets the lineIdentification value for this LinePerLinkType.
     * 
     * @return lineIdentification   * fromNodeId, linkId, lineId and linedirection
     */
    public com.siemens.sitraffic.external.pt.LinePerLinkTypeLineIdentification getLineIdentification() {
        return lineIdentification;
    }


    /**
     * Sets the lineIdentification value for this LinePerLinkType.
     * 
     * @param lineIdentification   * fromNodeId, linkId, lineId and linedirection
     */
    public void setLineIdentification(com.siemens.sitraffic.external.pt.LinePerLinkTypeLineIdentification lineIdentification) {
        this.lineIdentification = lineIdentification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinePerLinkType)) return false;
        LinePerLinkType other = (LinePerLinkType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timeline==null && other.getTimeline()==null) || 
             (this.timeline!=null &&
              this.timeline.equals(other.getTimeline()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.values==null && other.getValues()==null) || 
             (this.values!=null &&
              this.values.equals(other.getValues()))) &&
            ((this.lineIdentification==null && other.getLineIdentification()==null) || 
             (this.lineIdentification!=null &&
              this.lineIdentification.equals(other.getLineIdentification())));
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
        if (getTimeline() != null) {
            _hashCode += getTimeline().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getValues() != null) {
            _hashCode += getValues().hashCode();
        }
        if (getLineIdentification() != null) {
            _hashCode += getLineIdentification().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
