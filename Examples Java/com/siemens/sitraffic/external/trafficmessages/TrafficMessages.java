/**
 * TrafficMessages.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficmessages;

public class TrafficMessages  implements java.io.Serializable {
    /* objecttype TrafficMessage_RoadWorks */
    private com.siemens.sitraffic.external.trafficmessages.TMTypeEx[] roadWorks;

    /* objecttype TrafficMessage_Events */
    private com.siemens.sitraffic.external.trafficmessages.TMTypeEx[] events;

    /* objecttype TrafficMessage_Incidents */
    private com.siemens.sitraffic.external.trafficmessages.TMTypeEx[] incidents;

    public TrafficMessages() {
    }

    public TrafficMessages(
           com.siemens.sitraffic.external.trafficmessages.TMTypeEx[] roadWorks,
           com.siemens.sitraffic.external.trafficmessages.TMTypeEx[] events,
           com.siemens.sitraffic.external.trafficmessages.TMTypeEx[] incidents) {
           this.roadWorks = roadWorks;
           this.events = events;
           this.incidents = incidents;
    }


    /**
     * Gets the roadWorks value for this TrafficMessages.
     * 
     * @return roadWorks   * objecttype TrafficMessage_RoadWorks
     */
    public com.siemens.sitraffic.external.trafficmessages.TMTypeEx[] getRoadWorks() {
        return roadWorks;
    }


    /**
     * Sets the roadWorks value for this TrafficMessages.
     * 
     * @param roadWorks   * objecttype TrafficMessage_RoadWorks
     */
    public void setRoadWorks(com.siemens.sitraffic.external.trafficmessages.TMTypeEx[] roadWorks) {
        this.roadWorks = roadWorks;
    }

    public com.siemens.sitraffic.external.trafficmessages.TMTypeEx getRoadWorks(int i) {
        return this.roadWorks[i];
    }

    public void setRoadWorks(int i, com.siemens.sitraffic.external.trafficmessages.TMTypeEx _value) {
        this.roadWorks[i] = _value;
    }


    /**
     * Gets the events value for this TrafficMessages.
     * 
     * @return events   * objecttype TrafficMessage_Events
     */
    public com.siemens.sitraffic.external.trafficmessages.TMTypeEx[] getEvents() {
        return events;
    }


    /**
     * Sets the events value for this TrafficMessages.
     * 
     * @param events   * objecttype TrafficMessage_Events
     */
    public void setEvents(com.siemens.sitraffic.external.trafficmessages.TMTypeEx[] events) {
        this.events = events;
    }

    public com.siemens.sitraffic.external.trafficmessages.TMTypeEx getEvents(int i) {
        return this.events[i];
    }

    public void setEvents(int i, com.siemens.sitraffic.external.trafficmessages.TMTypeEx _value) {
        this.events[i] = _value;
    }


    /**
     * Gets the incidents value for this TrafficMessages.
     * 
     * @return incidents   * objecttype TrafficMessage_Incidents
     */
    public com.siemens.sitraffic.external.trafficmessages.TMTypeEx[] getIncidents() {
        return incidents;
    }


    /**
     * Sets the incidents value for this TrafficMessages.
     * 
     * @param incidents   * objecttype TrafficMessage_Incidents
     */
    public void setIncidents(com.siemens.sitraffic.external.trafficmessages.TMTypeEx[] incidents) {
        this.incidents = incidents;
    }

    public com.siemens.sitraffic.external.trafficmessages.TMTypeEx getIncidents(int i) {
        return this.incidents[i];
    }

    public void setIncidents(int i, com.siemens.sitraffic.external.trafficmessages.TMTypeEx _value) {
        this.incidents[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficMessages)) return false;
        TrafficMessages other = (TrafficMessages) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.roadWorks==null && other.getRoadWorks()==null) || 
             (this.roadWorks!=null &&
              java.util.Arrays.equals(this.roadWorks, other.getRoadWorks()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              java.util.Arrays.equals(this.events, other.getEvents()))) &&
            ((this.incidents==null && other.getIncidents()==null) || 
             (this.incidents!=null &&
              java.util.Arrays.equals(this.incidents, other.getIncidents())));
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
        if (getRoadWorks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoadWorks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoadWorks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncidents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncidents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncidents(), i);
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
