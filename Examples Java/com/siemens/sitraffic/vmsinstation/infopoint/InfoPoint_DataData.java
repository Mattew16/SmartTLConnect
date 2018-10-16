/**
 * InfoPoint_DataData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;

public class InfoPoint_DataData  implements java.io.Serializable {
    private org.apache.axis.types.Id id;

    private com.siemens.sitraffic.vmsinstation.infopoint.Time time;

    /* Current data of each display, included id represents the described
     * sign */
    private com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataDataDisplayUnit[] displayUnit;

    /* Reason which has been resulted in switch/ switch priority */
    private java.lang.String switchReason;

    /* General state */
    private com.siemens.sitraffic.vmsinstation.infopoint.State state;

    private java.lang.String addInfo;

    private com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataDataDetailedStates[] detailedStates;

    public InfoPoint_DataData() {
    }

    public InfoPoint_DataData(
           org.apache.axis.types.Id id,
           com.siemens.sitraffic.vmsinstation.infopoint.Time time,
           com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataDataDisplayUnit[] displayUnit,
           java.lang.String switchReason,
           com.siemens.sitraffic.vmsinstation.infopoint.State state,
           java.lang.String addInfo,
           com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataDataDetailedStates[] detailedStates) {
           this.id = id;
           this.time = time;
           this.displayUnit = displayUnit;
           this.switchReason = switchReason;
           this.state = state;
           this.addInfo = addInfo;
           this.detailedStates = detailedStates;
    }


    /**
     * Gets the id value for this InfoPoint_DataData.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this InfoPoint_DataData.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the time value for this InfoPoint_DataData.
     * 
     * @return time
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.Time getTime() {
        return time;
    }


    /**
     * Sets the time value for this InfoPoint_DataData.
     * 
     * @param time
     */
    public void setTime(com.siemens.sitraffic.vmsinstation.infopoint.Time time) {
        this.time = time;
    }


    /**
     * Gets the displayUnit value for this InfoPoint_DataData.
     * 
     * @return displayUnit   * Current data of each display, included id represents the described
     * sign
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataDataDisplayUnit[] getDisplayUnit() {
        return displayUnit;
    }


    /**
     * Sets the displayUnit value for this InfoPoint_DataData.
     * 
     * @param displayUnit   * Current data of each display, included id represents the described
     * sign
     */
    public void setDisplayUnit(com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataDataDisplayUnit[] displayUnit) {
        this.displayUnit = displayUnit;
    }

    public com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataDataDisplayUnit getDisplayUnit(int i) {
        return this.displayUnit[i];
    }

    public void setDisplayUnit(int i, com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataDataDisplayUnit _value) {
        this.displayUnit[i] = _value;
    }


    /**
     * Gets the switchReason value for this InfoPoint_DataData.
     * 
     * @return switchReason   * Reason which has been resulted in switch/ switch priority
     */
    public java.lang.String getSwitchReason() {
        return switchReason;
    }


    /**
     * Sets the switchReason value for this InfoPoint_DataData.
     * 
     * @param switchReason   * Reason which has been resulted in switch/ switch priority
     */
    public void setSwitchReason(java.lang.String switchReason) {
        this.switchReason = switchReason;
    }


    /**
     * Gets the state value for this InfoPoint_DataData.
     * 
     * @return state   * General state
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.State getState() {
        return state;
    }


    /**
     * Sets the state value for this InfoPoint_DataData.
     * 
     * @param state   * General state
     */
    public void setState(com.siemens.sitraffic.vmsinstation.infopoint.State state) {
        this.state = state;
    }


    /**
     * Gets the addInfo value for this InfoPoint_DataData.
     * 
     * @return addInfo
     */
    public java.lang.String getAddInfo() {
        return addInfo;
    }


    /**
     * Sets the addInfo value for this InfoPoint_DataData.
     * 
     * @param addInfo
     */
    public void setAddInfo(java.lang.String addInfo) {
        this.addInfo = addInfo;
    }


    /**
     * Gets the detailedStates value for this InfoPoint_DataData.
     * 
     * @return detailedStates
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataDataDetailedStates[] getDetailedStates() {
        return detailedStates;
    }


    /**
     * Sets the detailedStates value for this InfoPoint_DataData.
     * 
     * @param detailedStates
     */
    public void setDetailedStates(com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataDataDetailedStates[] detailedStates) {
        this.detailedStates = detailedStates;
    }

    public com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataDataDetailedStates getDetailedStates(int i) {
        return this.detailedStates[i];
    }

    public void setDetailedStates(int i, com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataDataDetailedStates _value) {
        this.detailedStates[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoPoint_DataData)) return false;
        InfoPoint_DataData other = (InfoPoint_DataData) obj;
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
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
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
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
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
