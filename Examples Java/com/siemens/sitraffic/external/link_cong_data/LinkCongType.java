/**
 * LinkCongType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.link_cong_data;

public class LinkCongType  implements java.io.Serializable {
    private java.lang.String id;

    /* Original Timestamp of the described values (end of measurement-nearly
     * the entry time in case of no transmission delay). No local time zone
     * will be added to the date and time format, so pure UTC is used at
     * the interfaces. */
    private com.siemens.sitraffic.external.link_cong_data.TimelineType timeline;

    private com.siemens.sitraffic.external.link_cong_data.ValuesType cong_values;

    public LinkCongType() {
    }

    public LinkCongType(
           java.lang.String id,
           com.siemens.sitraffic.external.link_cong_data.TimelineType timeline,
           com.siemens.sitraffic.external.link_cong_data.ValuesType cong_values) {
           this.id = id;
           this.timeline = timeline;
           this.cong_values = cong_values;
    }


    /**
     * Gets the id value for this LinkCongType.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this LinkCongType.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the timeline value for this LinkCongType.
     * 
     * @return timeline   * Original Timestamp of the described values (end of measurement-nearly
     * the entry time in case of no transmission delay). No local time zone
     * will be added to the date and time format, so pure UTC is used at
     * the interfaces.
     */
    public com.siemens.sitraffic.external.link_cong_data.TimelineType getTimeline() {
        return timeline;
    }


    /**
     * Sets the timeline value for this LinkCongType.
     * 
     * @param timeline   * Original Timestamp of the described values (end of measurement-nearly
     * the entry time in case of no transmission delay). No local time zone
     * will be added to the date and time format, so pure UTC is used at
     * the interfaces.
     */
    public void setTimeline(com.siemens.sitraffic.external.link_cong_data.TimelineType timeline) {
        this.timeline = timeline;
    }


    /**
     * Gets the cong_values value for this LinkCongType.
     * 
     * @return cong_values
     */
    public com.siemens.sitraffic.external.link_cong_data.ValuesType getCong_values() {
        return cong_values;
    }


    /**
     * Sets the cong_values value for this LinkCongType.
     * 
     * @param cong_values
     */
    public void setCong_values(com.siemens.sitraffic.external.link_cong_data.ValuesType cong_values) {
        this.cong_values = cong_values;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinkCongType)) return false;
        LinkCongType other = (LinkCongType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.timeline==null && other.getTimeline()==null) || 
             (this.timeline!=null &&
              this.timeline.equals(other.getTimeline()))) &&
            ((this.cong_values==null && other.getCong_values()==null) || 
             (this.cong_values!=null &&
              this.cong_values.equals(other.getCong_values())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getTimeline() != null) {
            _hashCode += getTimeline().hashCode();
        }
        if (getCong_values() != null) {
            _hashCode += getCong_values().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
