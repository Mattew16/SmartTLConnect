/**
 * LinkType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.pt;

public class LinkType  implements java.io.Serializable {
    /* Original Timestamp of the described values (end of measurement-nearly
     * the entry time in case of no transmission delay). No local time zone
     * will be added to the date and time format, so pure UTC is used at
     * the interfaces. */
    private com.siemens.sitraffic.external.pt.TimelineType timeline;

    /* General state */
    private com.siemens.sitraffic.external.pt.StateType state;

    /* Visumlink -> Identifikationsmerkma */
    private java.lang.String linkId;

    /* Richtungsbezug des Visumlinks -> Identifikationsmerkma */
    private java.lang.String fromnodeId;

    /* includes count in veh. per hour speed in km/h and accurancy
     * in s */
    private com.siemens.sitraffic.external.pt.ValuesType[] values;

    public LinkType() {
    }

    public LinkType(
           com.siemens.sitraffic.external.pt.TimelineType timeline,
           com.siemens.sitraffic.external.pt.StateType state,
           java.lang.String linkId,
           java.lang.String fromnodeId,
           com.siemens.sitraffic.external.pt.ValuesType[] values) {
           this.timeline = timeline;
           this.state = state;
           this.linkId = linkId;
           this.fromnodeId = fromnodeId;
           this.values = values;
    }


    /**
     * Gets the timeline value for this LinkType.
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
     * Sets the timeline value for this LinkType.
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
     * Gets the state value for this LinkType.
     * 
     * @return state   * General state
     */
    public com.siemens.sitraffic.external.pt.StateType getState() {
        return state;
    }


    /**
     * Sets the state value for this LinkType.
     * 
     * @param state   * General state
     */
    public void setState(com.siemens.sitraffic.external.pt.StateType state) {
        this.state = state;
    }


    /**
     * Gets the linkId value for this LinkType.
     * 
     * @return linkId   * Visumlink -> Identifikationsmerkma
     */
    public java.lang.String getLinkId() {
        return linkId;
    }


    /**
     * Sets the linkId value for this LinkType.
     * 
     * @param linkId   * Visumlink -> Identifikationsmerkma
     */
    public void setLinkId(java.lang.String linkId) {
        this.linkId = linkId;
    }


    /**
     * Gets the fromnodeId value for this LinkType.
     * 
     * @return fromnodeId   * Richtungsbezug des Visumlinks -> Identifikationsmerkma
     */
    public java.lang.String getFromnodeId() {
        return fromnodeId;
    }


    /**
     * Sets the fromnodeId value for this LinkType.
     * 
     * @param fromnodeId   * Richtungsbezug des Visumlinks -> Identifikationsmerkma
     */
    public void setFromnodeId(java.lang.String fromnodeId) {
        this.fromnodeId = fromnodeId;
    }


    /**
     * Gets the values value for this LinkType.
     * 
     * @return values   * includes count in veh. per hour speed in km/h and accurancy
     * in s
     */
    public com.siemens.sitraffic.external.pt.ValuesType[] getValues() {
        return values;
    }


    /**
     * Sets the values value for this LinkType.
     * 
     * @param values   * includes count in veh. per hour speed in km/h and accurancy
     * in s
     */
    public void setValues(com.siemens.sitraffic.external.pt.ValuesType[] values) {
        this.values = values;
    }

    public com.siemens.sitraffic.external.pt.ValuesType getValues(int i) {
        return this.values[i];
    }

    public void setValues(int i, com.siemens.sitraffic.external.pt.ValuesType _value) {
        this.values[i] = _value;
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
            ((this.timeline==null && other.getTimeline()==null) || 
             (this.timeline!=null &&
              this.timeline.equals(other.getTimeline()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.linkId==null && other.getLinkId()==null) || 
             (this.linkId!=null &&
              this.linkId.equals(other.getLinkId()))) &&
            ((this.fromnodeId==null && other.getFromnodeId()==null) || 
             (this.fromnodeId!=null &&
              this.fromnodeId.equals(other.getFromnodeId()))) &&
            ((this.values==null && other.getValues()==null) || 
             (this.values!=null &&
              java.util.Arrays.equals(this.values, other.getValues())));
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
        if (getLinkId() != null) {
            _hashCode += getLinkId().hashCode();
        }
        if (getFromnodeId() != null) {
            _hashCode += getFromnodeId().hashCode();
        }
        if (getValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
