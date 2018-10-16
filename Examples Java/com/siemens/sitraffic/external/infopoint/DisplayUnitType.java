/**
 * DisplayUnitType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.infopoint;

public class DisplayUnitType  implements java.io.Serializable {
    /* Identifik´cation of the display */
    private java.lang.String displayId;

    /* Type of the display unit */
    private com.siemens.sitraffic.external.infopoint.DisplayUnitTypeType type;

    private java.lang.Integer laneNr;

    /* One of the predefined content types: "TrafficInfo" - for the
     * programmable info-signs, "TrafficControlSignal" - for the traffic
     * control signs, "ParkInfo" - for the park-signs. */
    private java.lang.Object content;

    /* Indiceates changed sign content */
    private java.lang.Boolean contentChanged;

    /* State of the object */
    private com.siemens.sitraffic.external.infopoint.DisplayUnitTypeState state;

    /* Operating mode of the display unit */
    private com.siemens.sitraffic.external.infopoint.DisplayUnitTypeMode mode;

    /* Current state of the night lowering */
    private com.siemens.sitraffic.external.infopoint.DisplayUnitTypeStateLighting stateLighting;

    /* Operating mode of the night lowering */
    private com.siemens.sitraffic.external.infopoint.DisplayUnitTypeModeLighting modeLighting;

    /* 0-100% */
    private org.apache.axis.types.PositiveInteger intensityLighting;

    /* Reason which issued the switch on this sign */
    private java.lang.String switchreason;

    /* Importance of display unit for lane (major/minor) */
    private com.siemens.sitraffic.external.infopoint.DisplayUnitTypeLaneImportance laneImportance;

    public DisplayUnitType() {
    }

    public DisplayUnitType(
           java.lang.String displayId,
           com.siemens.sitraffic.external.infopoint.DisplayUnitTypeType type,
           java.lang.Integer laneNr,
           java.lang.Object content,
           java.lang.Boolean contentChanged,
           com.siemens.sitraffic.external.infopoint.DisplayUnitTypeState state,
           com.siemens.sitraffic.external.infopoint.DisplayUnitTypeMode mode,
           com.siemens.sitraffic.external.infopoint.DisplayUnitTypeStateLighting stateLighting,
           com.siemens.sitraffic.external.infopoint.DisplayUnitTypeModeLighting modeLighting,
           org.apache.axis.types.PositiveInteger intensityLighting,
           java.lang.String switchreason,
           com.siemens.sitraffic.external.infopoint.DisplayUnitTypeLaneImportance laneImportance) {
           this.displayId = displayId;
           this.type = type;
           this.laneNr = laneNr;
           this.content = content;
           this.contentChanged = contentChanged;
           this.state = state;
           this.mode = mode;
           this.stateLighting = stateLighting;
           this.modeLighting = modeLighting;
           this.intensityLighting = intensityLighting;
           this.switchreason = switchreason;
           this.laneImportance = laneImportance;
    }


    /**
     * Gets the displayId value for this DisplayUnitType.
     * 
     * @return displayId   * Identifik´cation of the display
     */
    public java.lang.String getDisplayId() {
        return displayId;
    }


    /**
     * Sets the displayId value for this DisplayUnitType.
     * 
     * @param displayId   * Identifik´cation of the display
     */
    public void setDisplayId(java.lang.String displayId) {
        this.displayId = displayId;
    }


    /**
     * Gets the type value for this DisplayUnitType.
     * 
     * @return type   * Type of the display unit
     */
    public com.siemens.sitraffic.external.infopoint.DisplayUnitTypeType getType() {
        return type;
    }


    /**
     * Sets the type value for this DisplayUnitType.
     * 
     * @param type   * Type of the display unit
     */
    public void setType(com.siemens.sitraffic.external.infopoint.DisplayUnitTypeType type) {
        this.type = type;
    }


    /**
     * Gets the laneNr value for this DisplayUnitType.
     * 
     * @return laneNr
     */
    public java.lang.Integer getLaneNr() {
        return laneNr;
    }


    /**
     * Sets the laneNr value for this DisplayUnitType.
     * 
     * @param laneNr
     */
    public void setLaneNr(java.lang.Integer laneNr) {
        this.laneNr = laneNr;
    }


    /**
     * Gets the content value for this DisplayUnitType.
     * 
     * @return content   * One of the predefined content types: "TrafficInfo" - for the
     * programmable info-signs, "TrafficControlSignal" - for the traffic
     * control signs, "ParkInfo" - for the park-signs.
     */
    public java.lang.Object getContent() {
        return content;
    }


    /**
     * Sets the content value for this DisplayUnitType.
     * 
     * @param content   * One of the predefined content types: "TrafficInfo" - for the
     * programmable info-signs, "TrafficControlSignal" - for the traffic
     * control signs, "ParkInfo" - for the park-signs.
     */
    public void setContent(java.lang.Object content) {
        this.content = content;
    }


    /**
     * Gets the contentChanged value for this DisplayUnitType.
     * 
     * @return contentChanged   * Indiceates changed sign content
     */
    public java.lang.Boolean getContentChanged() {
        return contentChanged;
    }


    /**
     * Sets the contentChanged value for this DisplayUnitType.
     * 
     * @param contentChanged   * Indiceates changed sign content
     */
    public void setContentChanged(java.lang.Boolean contentChanged) {
        this.contentChanged = contentChanged;
    }


    /**
     * Gets the state value for this DisplayUnitType.
     * 
     * @return state   * State of the object
     */
    public com.siemens.sitraffic.external.infopoint.DisplayUnitTypeState getState() {
        return state;
    }


    /**
     * Sets the state value for this DisplayUnitType.
     * 
     * @param state   * State of the object
     */
    public void setState(com.siemens.sitraffic.external.infopoint.DisplayUnitTypeState state) {
        this.state = state;
    }


    /**
     * Gets the mode value for this DisplayUnitType.
     * 
     * @return mode   * Operating mode of the display unit
     */
    public com.siemens.sitraffic.external.infopoint.DisplayUnitTypeMode getMode() {
        return mode;
    }


    /**
     * Sets the mode value for this DisplayUnitType.
     * 
     * @param mode   * Operating mode of the display unit
     */
    public void setMode(com.siemens.sitraffic.external.infopoint.DisplayUnitTypeMode mode) {
        this.mode = mode;
    }


    /**
     * Gets the stateLighting value for this DisplayUnitType.
     * 
     * @return stateLighting   * Current state of the night lowering
     */
    public com.siemens.sitraffic.external.infopoint.DisplayUnitTypeStateLighting getStateLighting() {
        return stateLighting;
    }


    /**
     * Sets the stateLighting value for this DisplayUnitType.
     * 
     * @param stateLighting   * Current state of the night lowering
     */
    public void setStateLighting(com.siemens.sitraffic.external.infopoint.DisplayUnitTypeStateLighting stateLighting) {
        this.stateLighting = stateLighting;
    }


    /**
     * Gets the modeLighting value for this DisplayUnitType.
     * 
     * @return modeLighting   * Operating mode of the night lowering
     */
    public com.siemens.sitraffic.external.infopoint.DisplayUnitTypeModeLighting getModeLighting() {
        return modeLighting;
    }


    /**
     * Sets the modeLighting value for this DisplayUnitType.
     * 
     * @param modeLighting   * Operating mode of the night lowering
     */
    public void setModeLighting(com.siemens.sitraffic.external.infopoint.DisplayUnitTypeModeLighting modeLighting) {
        this.modeLighting = modeLighting;
    }


    /**
     * Gets the intensityLighting value for this DisplayUnitType.
     * 
     * @return intensityLighting   * 0-100%
     */
    public org.apache.axis.types.PositiveInteger getIntensityLighting() {
        return intensityLighting;
    }


    /**
     * Sets the intensityLighting value for this DisplayUnitType.
     * 
     * @param intensityLighting   * 0-100%
     */
    public void setIntensityLighting(org.apache.axis.types.PositiveInteger intensityLighting) {
        this.intensityLighting = intensityLighting;
    }


    /**
     * Gets the switchreason value for this DisplayUnitType.
     * 
     * @return switchreason   * Reason which issued the switch on this sign
     */
    public java.lang.String getSwitchreason() {
        return switchreason;
    }


    /**
     * Sets the switchreason value for this DisplayUnitType.
     * 
     * @param switchreason   * Reason which issued the switch on this sign
     */
    public void setSwitchreason(java.lang.String switchreason) {
        this.switchreason = switchreason;
    }


    /**
     * Gets the laneImportance value for this DisplayUnitType.
     * 
     * @return laneImportance   * Importance of display unit for lane (major/minor)
     */
    public com.siemens.sitraffic.external.infopoint.DisplayUnitTypeLaneImportance getLaneImportance() {
        return laneImportance;
    }


    /**
     * Sets the laneImportance value for this DisplayUnitType.
     * 
     * @param laneImportance   * Importance of display unit for lane (major/minor)
     */
    public void setLaneImportance(com.siemens.sitraffic.external.infopoint.DisplayUnitTypeLaneImportance laneImportance) {
        this.laneImportance = laneImportance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DisplayUnitType)) return false;
        DisplayUnitType other = (DisplayUnitType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.displayId==null && other.getDisplayId()==null) || 
             (this.displayId!=null &&
              this.displayId.equals(other.getDisplayId()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.laneNr==null && other.getLaneNr()==null) || 
             (this.laneNr!=null &&
              this.laneNr.equals(other.getLaneNr()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.contentChanged==null && other.getContentChanged()==null) || 
             (this.contentChanged!=null &&
              this.contentChanged.equals(other.getContentChanged()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.mode==null && other.getMode()==null) || 
             (this.mode!=null &&
              this.mode.equals(other.getMode()))) &&
            ((this.stateLighting==null && other.getStateLighting()==null) || 
             (this.stateLighting!=null &&
              this.stateLighting.equals(other.getStateLighting()))) &&
            ((this.modeLighting==null && other.getModeLighting()==null) || 
             (this.modeLighting!=null &&
              this.modeLighting.equals(other.getModeLighting()))) &&
            ((this.intensityLighting==null && other.getIntensityLighting()==null) || 
             (this.intensityLighting!=null &&
              this.intensityLighting.equals(other.getIntensityLighting()))) &&
            ((this.switchreason==null && other.getSwitchreason()==null) || 
             (this.switchreason!=null &&
              this.switchreason.equals(other.getSwitchreason()))) &&
            ((this.laneImportance==null && other.getLaneImportance()==null) || 
             (this.laneImportance!=null &&
              this.laneImportance.equals(other.getLaneImportance())));
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
        if (getDisplayId() != null) {
            _hashCode += getDisplayId().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getLaneNr() != null) {
            _hashCode += getLaneNr().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getContentChanged() != null) {
            _hashCode += getContentChanged().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getMode() != null) {
            _hashCode += getMode().hashCode();
        }
        if (getStateLighting() != null) {
            _hashCode += getStateLighting().hashCode();
        }
        if (getModeLighting() != null) {
            _hashCode += getModeLighting().hashCode();
        }
        if (getIntensityLighting() != null) {
            _hashCode += getIntensityLighting().hashCode();
        }
        if (getSwitchreason() != null) {
            _hashCode += getSwitchreason().hashCode();
        }
        if (getLaneImportance() != null) {
            _hashCode += getLaneImportance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
