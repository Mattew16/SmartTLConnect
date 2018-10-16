/**
 * CurrentValueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;

public class CurrentValueType  implements java.io.Serializable {
    private java.lang.String id;

    private com.siemens.sitraffic.external.trafficdata.TimelineType timeline;

    /* contains occupancy speed and volume (count scaled to 1h (unit=[veh/h]))
     * for defined vehicle type(s) */
    private com.siemens.sitraffic.external.trafficdata.ValueType[] value;

    /* List of currently active alarms. If the whole list is missing
     * all alarms are reset. */
    private com.siemens.sitraffic.external.trafficdata.CurrentValueTypeAlarm[] alarm;

    /* qualityfactor in % */
    private java.lang.Integer quality;

    /* state of the sensor */
    private int detectorState;

    public CurrentValueType() {
    }

    public CurrentValueType(
           java.lang.String id,
           com.siemens.sitraffic.external.trafficdata.TimelineType timeline,
           com.siemens.sitraffic.external.trafficdata.ValueType[] value,
           com.siemens.sitraffic.external.trafficdata.CurrentValueTypeAlarm[] alarm,
           java.lang.Integer quality,
           int detectorState) {
           this.id = id;
           this.timeline = timeline;
           this.value = value;
           this.alarm = alarm;
           this.quality = quality;
           this.detectorState = detectorState;
    }


    /**
     * Gets the id value for this CurrentValueType.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this CurrentValueType.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the timeline value for this CurrentValueType.
     * 
     * @return timeline
     */
    public com.siemens.sitraffic.external.trafficdata.TimelineType getTimeline() {
        return timeline;
    }


    /**
     * Sets the timeline value for this CurrentValueType.
     * 
     * @param timeline
     */
    public void setTimeline(com.siemens.sitraffic.external.trafficdata.TimelineType timeline) {
        this.timeline = timeline;
    }


    /**
     * Gets the value value for this CurrentValueType.
     * 
     * @return value   * contains occupancy speed and volume (count scaled to 1h (unit=[veh/h]))
     * for defined vehicle type(s)
     */
    public com.siemens.sitraffic.external.trafficdata.ValueType[] getValue() {
        return value;
    }


    /**
     * Sets the value value for this CurrentValueType.
     * 
     * @param value   * contains occupancy speed and volume (count scaled to 1h (unit=[veh/h]))
     * for defined vehicle type(s)
     */
    public void setValue(com.siemens.sitraffic.external.trafficdata.ValueType[] value) {
        this.value = value;
    }

    public com.siemens.sitraffic.external.trafficdata.ValueType getValue(int i) {
        return this.value[i];
    }

    public void setValue(int i, com.siemens.sitraffic.external.trafficdata.ValueType _value) {
        this.value[i] = _value;
    }


    /**
     * Gets the alarm value for this CurrentValueType.
     * 
     * @return alarm   * List of currently active alarms. If the whole list is missing
     * all alarms are reset.
     */
    public com.siemens.sitraffic.external.trafficdata.CurrentValueTypeAlarm[] getAlarm() {
        return alarm;
    }


    /**
     * Sets the alarm value for this CurrentValueType.
     * 
     * @param alarm   * List of currently active alarms. If the whole list is missing
     * all alarms are reset.
     */
    public void setAlarm(com.siemens.sitraffic.external.trafficdata.CurrentValueTypeAlarm[] alarm) {
        this.alarm = alarm;
    }

    public com.siemens.sitraffic.external.trafficdata.CurrentValueTypeAlarm getAlarm(int i) {
        return this.alarm[i];
    }

    public void setAlarm(int i, com.siemens.sitraffic.external.trafficdata.CurrentValueTypeAlarm _value) {
        this.alarm[i] = _value;
    }


    /**
     * Gets the quality value for this CurrentValueType.
     * 
     * @return quality   * qualityfactor in %
     */
    public java.lang.Integer getQuality() {
        return quality;
    }


    /**
     * Sets the quality value for this CurrentValueType.
     * 
     * @param quality   * qualityfactor in %
     */
    public void setQuality(java.lang.Integer quality) {
        this.quality = quality;
    }


    /**
     * Gets the detectorState value for this CurrentValueType.
     * 
     * @return detectorState   * state of the sensor
     */
    public int getDetectorState() {
        return detectorState;
    }


    /**
     * Sets the detectorState value for this CurrentValueType.
     * 
     * @param detectorState   * state of the sensor
     */
    public void setDetectorState(int detectorState) {
        this.detectorState = detectorState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurrentValueType)) return false;
        CurrentValueType other = (CurrentValueType) obj;
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
            ((this.alarm==null && other.getAlarm()==null) || 
             (this.alarm!=null &&
              java.util.Arrays.equals(this.alarm, other.getAlarm()))) &&
            ((this.quality==null && other.getQuality()==null) || 
             (this.quality!=null &&
              this.quality.equals(other.getQuality()))) &&
            this.detectorState == other.getDetectorState();
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
        if (getAlarm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlarm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlarm(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuality() != null) {
            _hashCode += getQuality().hashCode();
        }
        _hashCode += getDetectorState();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
