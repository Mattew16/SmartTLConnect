/**
 * ParkingData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.parking;

public class ParkingData  implements java.io.Serializable {
    private java.lang.String id;

    private com.siemens.sitraffic.external.global.Timeline timeline;

    /* includes occupancy and capacity for a particular parking type
     * (if predictionInterval>0 value is predicted */
    private com.siemens.sitraffic.external.parking.ParkingValue[] value;

    /* opening state */
    private com.siemens.sitraffic.external.parking.ParkingDataOpeningState openingState;

    /* global state of the object (o.k./n.o.k.) */
    private com.siemens.sitraffic.external.global.State state;

    /* detailed state list of the object */
    private com.siemens.sitraffic.external.parking.ParkingDataDetailedStates[] detailedStates;

    public ParkingData() {
    }

    public ParkingData(
           java.lang.String id,
           com.siemens.sitraffic.external.global.Timeline timeline,
           com.siemens.sitraffic.external.parking.ParkingValue[] value,
           com.siemens.sitraffic.external.parking.ParkingDataOpeningState openingState,
           com.siemens.sitraffic.external.global.State state,
           com.siemens.sitraffic.external.parking.ParkingDataDetailedStates[] detailedStates) {
           this.id = id;
           this.timeline = timeline;
           this.value = value;
           this.openingState = openingState;
           this.state = state;
           this.detailedStates = detailedStates;
    }


    /**
     * Gets the id value for this ParkingData.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ParkingData.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the timeline value for this ParkingData.
     * 
     * @return timeline
     */
    public com.siemens.sitraffic.external.global.Timeline getTimeline() {
        return timeline;
    }


    /**
     * Sets the timeline value for this ParkingData.
     * 
     * @param timeline
     */
    public void setTimeline(com.siemens.sitraffic.external.global.Timeline timeline) {
        this.timeline = timeline;
    }


    /**
     * Gets the value value for this ParkingData.
     * 
     * @return value   * includes occupancy and capacity for a particular parking type
     * (if predictionInterval>0 value is predicted
     */
    public com.siemens.sitraffic.external.parking.ParkingValue[] getValue() {
        return value;
    }


    /**
     * Sets the value value for this ParkingData.
     * 
     * @param value   * includes occupancy and capacity for a particular parking type
     * (if predictionInterval>0 value is predicted
     */
    public void setValue(com.siemens.sitraffic.external.parking.ParkingValue[] value) {
        this.value = value;
    }

    public com.siemens.sitraffic.external.parking.ParkingValue getValue(int i) {
        return this.value[i];
    }

    public void setValue(int i, com.siemens.sitraffic.external.parking.ParkingValue _value) {
        this.value[i] = _value;
    }


    /**
     * Gets the openingState value for this ParkingData.
     * 
     * @return openingState   * opening state
     */
    public com.siemens.sitraffic.external.parking.ParkingDataOpeningState getOpeningState() {
        return openingState;
    }


    /**
     * Sets the openingState value for this ParkingData.
     * 
     * @param openingState   * opening state
     */
    public void setOpeningState(com.siemens.sitraffic.external.parking.ParkingDataOpeningState openingState) {
        this.openingState = openingState;
    }


    /**
     * Gets the state value for this ParkingData.
     * 
     * @return state   * global state of the object (o.k./n.o.k.)
     */
    public com.siemens.sitraffic.external.global.State getState() {
        return state;
    }


    /**
     * Sets the state value for this ParkingData.
     * 
     * @param state   * global state of the object (o.k./n.o.k.)
     */
    public void setState(com.siemens.sitraffic.external.global.State state) {
        this.state = state;
    }


    /**
     * Gets the detailedStates value for this ParkingData.
     * 
     * @return detailedStates   * detailed state list of the object
     */
    public com.siemens.sitraffic.external.parking.ParkingDataDetailedStates[] getDetailedStates() {
        return detailedStates;
    }


    /**
     * Sets the detailedStates value for this ParkingData.
     * 
     * @param detailedStates   * detailed state list of the object
     */
    public void setDetailedStates(com.siemens.sitraffic.external.parking.ParkingDataDetailedStates[] detailedStates) {
        this.detailedStates = detailedStates;
    }

    public com.siemens.sitraffic.external.parking.ParkingDataDetailedStates getDetailedStates(int i) {
        return this.detailedStates[i];
    }

    public void setDetailedStates(int i, com.siemens.sitraffic.external.parking.ParkingDataDetailedStates _value) {
        this.detailedStates[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParkingData)) return false;
        ParkingData other = (ParkingData) obj;
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
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              java.util.Arrays.equals(this.value, other.getValue()))) &&
            ((this.openingState==null && other.getOpeningState()==null) || 
             (this.openingState!=null &&
              this.openingState.equals(other.getOpeningState()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.detailedStates==null && other.getDetailedStates()==null) || 
             (this.detailedStates!=null &&
              java.util.Arrays.equals(this.detailedStates, other.getDetailedStates())));
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
        if (getValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOpeningState() != null) {
            _hashCode += getOpeningState().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getDetailedStates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetailedStates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetailedStates(), i);
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
