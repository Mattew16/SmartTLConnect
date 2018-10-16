/**
 * SubsystemDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.subsystem;

public class SubsystemDataType  implements java.io.Serializable {
    private java.lang.String id;

    private com.siemens.sitraffic.external.global.Timeline timeline;

    private com.siemens.sitraffic.external.subsystem.ValueType value;

    private com.siemens.sitraffic.external.subsystem.FaultStatusType[] faultStatus;

    public SubsystemDataType() {
    }

    public SubsystemDataType(
           java.lang.String id,
           com.siemens.sitraffic.external.global.Timeline timeline,
           com.siemens.sitraffic.external.subsystem.ValueType value,
           com.siemens.sitraffic.external.subsystem.FaultStatusType[] faultStatus) {
           this.id = id;
           this.timeline = timeline;
           this.value = value;
           this.faultStatus = faultStatus;
    }


    /**
     * Gets the id value for this SubsystemDataType.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this SubsystemDataType.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the timeline value for this SubsystemDataType.
     * 
     * @return timeline
     */
    public com.siemens.sitraffic.external.global.Timeline getTimeline() {
        return timeline;
    }


    /**
     * Sets the timeline value for this SubsystemDataType.
     * 
     * @param timeline
     */
    public void setTimeline(com.siemens.sitraffic.external.global.Timeline timeline) {
        this.timeline = timeline;
    }


    /**
     * Gets the value value for this SubsystemDataType.
     * 
     * @return value
     */
    public com.siemens.sitraffic.external.subsystem.ValueType getValue() {
        return value;
    }


    /**
     * Sets the value value for this SubsystemDataType.
     * 
     * @param value
     */
    public void setValue(com.siemens.sitraffic.external.subsystem.ValueType value) {
        this.value = value;
    }


    /**
     * Gets the faultStatus value for this SubsystemDataType.
     * 
     * @return faultStatus
     */
    public com.siemens.sitraffic.external.subsystem.FaultStatusType[] getFaultStatus() {
        return faultStatus;
    }


    /**
     * Sets the faultStatus value for this SubsystemDataType.
     * 
     * @param faultStatus
     */
    public void setFaultStatus(com.siemens.sitraffic.external.subsystem.FaultStatusType[] faultStatus) {
        this.faultStatus = faultStatus;
    }

    public com.siemens.sitraffic.external.subsystem.FaultStatusType getFaultStatus(int i) {
        return this.faultStatus[i];
    }

    public void setFaultStatus(int i, com.siemens.sitraffic.external.subsystem.FaultStatusType _value) {
        this.faultStatus[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubsystemDataType)) return false;
        SubsystemDataType other = (SubsystemDataType) obj;
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
              this.value.equals(other.getValue()))) &&
            ((this.faultStatus==null && other.getFaultStatus()==null) || 
             (this.faultStatus!=null &&
              java.util.Arrays.equals(this.faultStatus, other.getFaultStatus())));
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
            _hashCode += getValue().hashCode();
        }
        if (getFaultStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFaultStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFaultStatus(), i);
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
