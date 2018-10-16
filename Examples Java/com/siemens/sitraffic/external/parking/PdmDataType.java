/**
 * PdmDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.parking;

public class PdmDataType  implements java.io.Serializable {
    private java.lang.String id;

    private com.siemens.sitraffic.external.global.Timeline timeline;

    private com.siemens.sitraffic.external.global.State state;

    private com.siemens.sitraffic.external.parking.DetailedStateType[] detailedState;

    public PdmDataType() {
    }

    public PdmDataType(
           java.lang.String id,
           com.siemens.sitraffic.external.global.Timeline timeline,
           com.siemens.sitraffic.external.global.State state,
           com.siemens.sitraffic.external.parking.DetailedStateType[] detailedState) {
           this.id = id;
           this.timeline = timeline;
           this.state = state;
           this.detailedState = detailedState;
    }


    /**
     * Gets the id value for this PdmDataType.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this PdmDataType.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the timeline value for this PdmDataType.
     * 
     * @return timeline
     */
    public com.siemens.sitraffic.external.global.Timeline getTimeline() {
        return timeline;
    }


    /**
     * Sets the timeline value for this PdmDataType.
     * 
     * @param timeline
     */
    public void setTimeline(com.siemens.sitraffic.external.global.Timeline timeline) {
        this.timeline = timeline;
    }


    /**
     * Gets the state value for this PdmDataType.
     * 
     * @return state
     */
    public com.siemens.sitraffic.external.global.State getState() {
        return state;
    }


    /**
     * Sets the state value for this PdmDataType.
     * 
     * @param state
     */
    public void setState(com.siemens.sitraffic.external.global.State state) {
        this.state = state;
    }


    /**
     * Gets the detailedState value for this PdmDataType.
     * 
     * @return detailedState
     */
    public com.siemens.sitraffic.external.parking.DetailedStateType[] getDetailedState() {
        return detailedState;
    }


    /**
     * Sets the detailedState value for this PdmDataType.
     * 
     * @param detailedState
     */
    public void setDetailedState(com.siemens.sitraffic.external.parking.DetailedStateType[] detailedState) {
        this.detailedState = detailedState;
    }

    public com.siemens.sitraffic.external.parking.DetailedStateType getDetailedState(int i) {
        return this.detailedState[i];
    }

    public void setDetailedState(int i, com.siemens.sitraffic.external.parking.DetailedStateType _value) {
        this.detailedState[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PdmDataType)) return false;
        PdmDataType other = (PdmDataType) obj;
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
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.detailedState==null && other.getDetailedState()==null) || 
             (this.detailedState!=null &&
              java.util.Arrays.equals(this.detailedState, other.getDetailedState())));
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getDetailedState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetailedState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetailedState(), i);
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
