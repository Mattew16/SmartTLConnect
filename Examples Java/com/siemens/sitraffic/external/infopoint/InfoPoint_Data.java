/**
 * InfoPoint_Data.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.infopoint;

public class InfoPoint_Data  implements java.io.Serializable {
    private java.lang.String id;

    private com.siemens.sitraffic.external.global.Timeline timeline;

    /* Current data of each display, included id represents the described
     * sign */
    private com.siemens.sitraffic.external.infopoint.DisplayUnitType[] displayUnit;

    /* Reason which has been resulted in switch/ switch priority */
    private java.lang.String switchReason;

    /* State of the object */
    private com.siemens.sitraffic.external.global.State state;

    /* Additional unstructured information (may be itself in XML) */
    private java.lang.String addInfo;

    private com.siemens.sitraffic.external.infopoint.InfoPoint_DataDetailedStates[] detailedStates;

    public InfoPoint_Data() {
    }

    public InfoPoint_Data(
           java.lang.String id,
           com.siemens.sitraffic.external.global.Timeline timeline,
           com.siemens.sitraffic.external.infopoint.DisplayUnitType[] displayUnit,
           java.lang.String switchReason,
           com.siemens.sitraffic.external.global.State state,
           java.lang.String addInfo,
           com.siemens.sitraffic.external.infopoint.InfoPoint_DataDetailedStates[] detailedStates) {
           this.id = id;
           this.timeline = timeline;
           this.displayUnit = displayUnit;
           this.switchReason = switchReason;
           this.state = state;
           this.addInfo = addInfo;
           this.detailedStates = detailedStates;
    }


    /**
     * Gets the id value for this InfoPoint_Data.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this InfoPoint_Data.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the timeline value for this InfoPoint_Data.
     * 
     * @return timeline
     */
    public com.siemens.sitraffic.external.global.Timeline getTimeline() {
        return timeline;
    }


    /**
     * Sets the timeline value for this InfoPoint_Data.
     * 
     * @param timeline
     */
    public void setTimeline(com.siemens.sitraffic.external.global.Timeline timeline) {
        this.timeline = timeline;
    }


    /**
     * Gets the displayUnit value for this InfoPoint_Data.
     * 
     * @return displayUnit   * Current data of each display, included id represents the described
     * sign
     */
    public com.siemens.sitraffic.external.infopoint.DisplayUnitType[] getDisplayUnit() {
        return displayUnit;
    }


    /**
     * Sets the displayUnit value for this InfoPoint_Data.
     * 
     * @param displayUnit   * Current data of each display, included id represents the described
     * sign
     */
    public void setDisplayUnit(com.siemens.sitraffic.external.infopoint.DisplayUnitType[] displayUnit) {
        this.displayUnit = displayUnit;
    }

    public com.siemens.sitraffic.external.infopoint.DisplayUnitType getDisplayUnit(int i) {
        return this.displayUnit[i];
    }

    public void setDisplayUnit(int i, com.siemens.sitraffic.external.infopoint.DisplayUnitType _value) {
        this.displayUnit[i] = _value;
    }


    /**
     * Gets the switchReason value for this InfoPoint_Data.
     * 
     * @return switchReason   * Reason which has been resulted in switch/ switch priority
     */
    public java.lang.String getSwitchReason() {
        return switchReason;
    }


    /**
     * Sets the switchReason value for this InfoPoint_Data.
     * 
     * @param switchReason   * Reason which has been resulted in switch/ switch priority
     */
    public void setSwitchReason(java.lang.String switchReason) {
        this.switchReason = switchReason;
    }


    /**
     * Gets the state value for this InfoPoint_Data.
     * 
     * @return state   * State of the object
     */
    public com.siemens.sitraffic.external.global.State getState() {
        return state;
    }


    /**
     * Sets the state value for this InfoPoint_Data.
     * 
     * @param state   * State of the object
     */
    public void setState(com.siemens.sitraffic.external.global.State state) {
        this.state = state;
    }


    /**
     * Gets the addInfo value for this InfoPoint_Data.
     * 
     * @return addInfo   * Additional unstructured information (may be itself in XML)
     */
    public java.lang.String getAddInfo() {
        return addInfo;
    }


    /**
     * Sets the addInfo value for this InfoPoint_Data.
     * 
     * @param addInfo   * Additional unstructured information (may be itself in XML)
     */
    public void setAddInfo(java.lang.String addInfo) {
        this.addInfo = addInfo;
    }


    /**
     * Gets the detailedStates value for this InfoPoint_Data.
     * 
     * @return detailedStates
     */
    public com.siemens.sitraffic.external.infopoint.InfoPoint_DataDetailedStates[] getDetailedStates() {
        return detailedStates;
    }


    /**
     * Sets the detailedStates value for this InfoPoint_Data.
     * 
     * @param detailedStates
     */
    public void setDetailedStates(com.siemens.sitraffic.external.infopoint.InfoPoint_DataDetailedStates[] detailedStates) {
        this.detailedStates = detailedStates;
    }

    public com.siemens.sitraffic.external.infopoint.InfoPoint_DataDetailedStates getDetailedStates(int i) {
        return this.detailedStates[i];
    }

    public void setDetailedStates(int i, com.siemens.sitraffic.external.infopoint.InfoPoint_DataDetailedStates _value) {
        this.detailedStates[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoPoint_Data)) return false;
        InfoPoint_Data other = (InfoPoint_Data) obj;
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
            ((this.displayUnit==null && other.getDisplayUnit()==null) || 
             (this.displayUnit!=null &&
              java.util.Arrays.equals(this.displayUnit, other.getDisplayUnit()))) &&
            ((this.switchReason==null && other.getSwitchReason()==null) || 
             (this.switchReason!=null &&
              this.switchReason.equals(other.getSwitchReason()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.addInfo==null && other.getAddInfo()==null) || 
             (this.addInfo!=null &&
              this.addInfo.equals(other.getAddInfo()))) &&
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
        if (getDisplayUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisplayUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisplayUnit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSwitchReason() != null) {
            _hashCode += getSwitchReason().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getAddInfo() != null) {
            _hashCode += getAddInfo().hashCode();
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
