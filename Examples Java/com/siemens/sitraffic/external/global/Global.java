/**
 * Global.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.global;

public class Global  implements java.io.Serializable {
    private com.siemens.sitraffic.external.global.Description description;

    private com.siemens.sitraffic.external.global.Timeline timeline;

    private com.siemens.sitraffic.external.global.LocationType location;

    private com.siemens.sitraffic.external.global.State state;

    public Global() {
    }

    public Global(
           com.siemens.sitraffic.external.global.Description description,
           com.siemens.sitraffic.external.global.Timeline timeline,
           com.siemens.sitraffic.external.global.LocationType location,
           com.siemens.sitraffic.external.global.State state) {
           this.description = description;
           this.timeline = timeline;
           this.location = location;
           this.state = state;
    }


    /**
     * Gets the description value for this Global.
     * 
     * @return description
     */
    public com.siemens.sitraffic.external.global.Description getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Global.
     * 
     * @param description
     */
    public void setDescription(com.siemens.sitraffic.external.global.Description description) {
        this.description = description;
    }


    /**
     * Gets the timeline value for this Global.
     * 
     * @return timeline
     */
    public com.siemens.sitraffic.external.global.Timeline getTimeline() {
        return timeline;
    }


    /**
     * Sets the timeline value for this Global.
     * 
     * @param timeline
     */
    public void setTimeline(com.siemens.sitraffic.external.global.Timeline timeline) {
        this.timeline = timeline;
    }


    /**
     * Gets the location value for this Global.
     * 
     * @return location
     */
    public com.siemens.sitraffic.external.global.LocationType getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Global.
     * 
     * @param location
     */
    public void setLocation(com.siemens.sitraffic.external.global.LocationType location) {
        this.location = location;
    }


    /**
     * Gets the state value for this Global.
     * 
     * @return state
     */
    public com.siemens.sitraffic.external.global.State getState() {
        return state;
    }


    /**
     * Sets the state value for this Global.
     * 
     * @param state
     */
    public void setState(com.siemens.sitraffic.external.global.State state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Global)) return false;
        Global other = (Global) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.timeline==null && other.getTimeline()==null) || 
             (this.timeline!=null &&
              this.timeline.equals(other.getTimeline()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getTimeline() != null) {
            _hashCode += getTimeline().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
