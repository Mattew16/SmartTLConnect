/**
 * IntersectionStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class IntersectionStatus  implements java.io.Serializable {
    private java.lang.String identifier;

    /* the time when this status has last changed may be received
     * from the field device or inserted by the subsystem when it has received
     * the status. */
    private java.util.Calendar receiveTime;

    private com.siemens.sitraffic.external.intersectionStates_andCommands.FaultStatusType[] faultStatus;

    /* From the fault states calculated device state of the intersection */
    private java.lang.Short deviceState;

    /* priority level should be set in case jobNr is not set
     * 0: scheduler
     * 1: traffic actuation
     * 2: high prio scheduler
     * 3: manual
     * 4: high prio manual
     * 5: error locked
     * 6: unknown */
    private org.apache.axis.types.UnsignedInt priority;

    /* central/local mode */
    private com.siemens.sitraffic.external.intersectionStates_andCommands.ControlModeType controlMode;

    private com.siemens.sitraffic.external.intersectionStates_andCommands.IntersectionOnOffType intersectionOnOff;

    private com.siemens.sitraffic.external.intersectionStates_andCommands.SubIntersectionOnOffType[] subIntersectionOnOff;

    private com.siemens.sitraffic.external.intersectionStates_andCommands.SpType signalProgram;

    /* traffic actuation on/off */
    private com.siemens.sitraffic.external.intersectionStates_andCommands.TaOnOffType taOnOff;

    /* public transport priorisation on/off */
    private com.siemens.sitraffic.external.intersectionStates_andCommands.PtOnOffType ptOnOff;

    /* individual transport priosrisation on/off */
    private com.siemens.sitraffic.external.intersectionStates_andCommands.ItOnOffType itOnOff;

    private com.siemens.sitraffic.external.intersectionStates_andCommands.ProjectSpecificOnOffType[] projectSpecificModification;

    /* 0: o.k.
     * 1: p.o.k. */
    private com.siemens.sitraffic.external.intersectionStates_andCommands.StateType state;

    public IntersectionStatus() {
    }

    public IntersectionStatus(
           java.lang.String identifier,
           java.util.Calendar receiveTime,
           com.siemens.sitraffic.external.intersectionStates_andCommands.FaultStatusType[] faultStatus,
           java.lang.Short deviceState,
           org.apache.axis.types.UnsignedInt priority,
           com.siemens.sitraffic.external.intersectionStates_andCommands.ControlModeType controlMode,
           com.siemens.sitraffic.external.intersectionStates_andCommands.IntersectionOnOffType intersectionOnOff,
           com.siemens.sitraffic.external.intersectionStates_andCommands.SubIntersectionOnOffType[] subIntersectionOnOff,
           com.siemens.sitraffic.external.intersectionStates_andCommands.SpType signalProgram,
           com.siemens.sitraffic.external.intersectionStates_andCommands.TaOnOffType taOnOff,
           com.siemens.sitraffic.external.intersectionStates_andCommands.PtOnOffType ptOnOff,
           com.siemens.sitraffic.external.intersectionStates_andCommands.ItOnOffType itOnOff,
           com.siemens.sitraffic.external.intersectionStates_andCommands.ProjectSpecificOnOffType[] projectSpecificModification,
           com.siemens.sitraffic.external.intersectionStates_andCommands.StateType state) {
           this.identifier = identifier;
           this.receiveTime = receiveTime;
           this.faultStatus = faultStatus;
           this.deviceState = deviceState;
           this.priority = priority;
           this.controlMode = controlMode;
           this.intersectionOnOff = intersectionOnOff;
           this.subIntersectionOnOff = subIntersectionOnOff;
           this.signalProgram = signalProgram;
           this.taOnOff = taOnOff;
           this.ptOnOff = ptOnOff;
           this.itOnOff = itOnOff;
           this.projectSpecificModification = projectSpecificModification;
           this.state = state;
    }


    /**
     * Gets the identifier value for this IntersectionStatus.
     * 
     * @return identifier
     */
    public java.lang.String getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this IntersectionStatus.
     * 
     * @param identifier
     */
    public void setIdentifier(java.lang.String identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the receiveTime value for this IntersectionStatus.
     * 
     * @return receiveTime   * the time when this status has last changed may be received
     * from the field device or inserted by the subsystem when it has received
     * the status.
     */
    public java.util.Calendar getReceiveTime() {
        return receiveTime;
    }


    /**
     * Sets the receiveTime value for this IntersectionStatus.
     * 
     * @param receiveTime   * the time when this status has last changed may be received
     * from the field device or inserted by the subsystem when it has received
     * the status.
     */
    public void setReceiveTime(java.util.Calendar receiveTime) {
        this.receiveTime = receiveTime;
    }


    /**
     * Gets the faultStatus value for this IntersectionStatus.
     * 
     * @return faultStatus
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.FaultStatusType[] getFaultStatus() {
        return faultStatus;
    }


    /**
     * Sets the faultStatus value for this IntersectionStatus.
     * 
     * @param faultStatus
     */
    public void setFaultStatus(com.siemens.sitraffic.external.intersectionStates_andCommands.FaultStatusType[] faultStatus) {
        this.faultStatus = faultStatus;
    }

    public com.siemens.sitraffic.external.intersectionStates_andCommands.FaultStatusType getFaultStatus(int i) {
        return this.faultStatus[i];
    }

    public void setFaultStatus(int i, com.siemens.sitraffic.external.intersectionStates_andCommands.FaultStatusType _value) {
        this.faultStatus[i] = _value;
    }


    /**
     * Gets the deviceState value for this IntersectionStatus.
     * 
     * @return deviceState   * From the fault states calculated device state of the intersection
     */
    public java.lang.Short getDeviceState() {
        return deviceState;
    }


    /**
     * Sets the deviceState value for this IntersectionStatus.
     * 
     * @param deviceState   * From the fault states calculated device state of the intersection
     */
    public void setDeviceState(java.lang.Short deviceState) {
        this.deviceState = deviceState;
    }


    /**
     * Gets the priority value for this IntersectionStatus.
     * 
     * @return priority   * priority level should be set in case jobNr is not set
     * 0: scheduler
     * 1: traffic actuation
     * 2: high prio scheduler
     * 3: manual
     * 4: high prio manual
     * 5: error locked
     * 6: unknown
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this IntersectionStatus.
     * 
     * @param priority   * priority level should be set in case jobNr is not set
     * 0: scheduler
     * 1: traffic actuation
     * 2: high prio scheduler
     * 3: manual
     * 4: high prio manual
     * 5: error locked
     * 6: unknown
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the controlMode value for this IntersectionStatus.
     * 
     * @return controlMode   * central/local mode
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.ControlModeType getControlMode() {
        return controlMode;
    }


    /**
     * Sets the controlMode value for this IntersectionStatus.
     * 
     * @param controlMode   * central/local mode
     */
    public void setControlMode(com.siemens.sitraffic.external.intersectionStates_andCommands.ControlModeType controlMode) {
        this.controlMode = controlMode;
    }


    /**
     * Gets the intersectionOnOff value for this IntersectionStatus.
     * 
     * @return intersectionOnOff
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.IntersectionOnOffType getIntersectionOnOff() {
        return intersectionOnOff;
    }


    /**
     * Sets the intersectionOnOff value for this IntersectionStatus.
     * 
     * @param intersectionOnOff
     */
    public void setIntersectionOnOff(com.siemens.sitraffic.external.intersectionStates_andCommands.IntersectionOnOffType intersectionOnOff) {
        this.intersectionOnOff = intersectionOnOff;
    }


    /**
     * Gets the subIntersectionOnOff value for this IntersectionStatus.
     * 
     * @return subIntersectionOnOff
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.SubIntersectionOnOffType[] getSubIntersectionOnOff() {
        return subIntersectionOnOff;
    }


    /**
     * Sets the subIntersectionOnOff value for this IntersectionStatus.
     * 
     * @param subIntersectionOnOff
     */
    public void setSubIntersectionOnOff(com.siemens.sitraffic.external.intersectionStates_andCommands.SubIntersectionOnOffType[] subIntersectionOnOff) {
        this.subIntersectionOnOff = subIntersectionOnOff;
    }

    public com.siemens.sitraffic.external.intersectionStates_andCommands.SubIntersectionOnOffType getSubIntersectionOnOff(int i) {
        return this.subIntersectionOnOff[i];
    }

    public void setSubIntersectionOnOff(int i, com.siemens.sitraffic.external.intersectionStates_andCommands.SubIntersectionOnOffType _value) {
        this.subIntersectionOnOff[i] = _value;
    }


    /**
     * Gets the signalProgram value for this IntersectionStatus.
     * 
     * @return signalProgram
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.SpType getSignalProgram() {
        return signalProgram;
    }


    /**
     * Sets the signalProgram value for this IntersectionStatus.
     * 
     * @param signalProgram
     */
    public void setSignalProgram(com.siemens.sitraffic.external.intersectionStates_andCommands.SpType signalProgram) {
        this.signalProgram = signalProgram;
    }


    /**
     * Gets the taOnOff value for this IntersectionStatus.
     * 
     * @return taOnOff   * traffic actuation on/off
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.TaOnOffType getTaOnOff() {
        return taOnOff;
    }


    /**
     * Sets the taOnOff value for this IntersectionStatus.
     * 
     * @param taOnOff   * traffic actuation on/off
     */
    public void setTaOnOff(com.siemens.sitraffic.external.intersectionStates_andCommands.TaOnOffType taOnOff) {
        this.taOnOff = taOnOff;
    }


    /**
     * Gets the ptOnOff value for this IntersectionStatus.
     * 
     * @return ptOnOff   * public transport priorisation on/off
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.PtOnOffType getPtOnOff() {
        return ptOnOff;
    }


    /**
     * Sets the ptOnOff value for this IntersectionStatus.
     * 
     * @param ptOnOff   * public transport priorisation on/off
     */
    public void setPtOnOff(com.siemens.sitraffic.external.intersectionStates_andCommands.PtOnOffType ptOnOff) {
        this.ptOnOff = ptOnOff;
    }


    /**
     * Gets the itOnOff value for this IntersectionStatus.
     * 
     * @return itOnOff   * individual transport priosrisation on/off
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.ItOnOffType getItOnOff() {
        return itOnOff;
    }


    /**
     * Sets the itOnOff value for this IntersectionStatus.
     * 
     * @param itOnOff   * individual transport priosrisation on/off
     */
    public void setItOnOff(com.siemens.sitraffic.external.intersectionStates_andCommands.ItOnOffType itOnOff) {
        this.itOnOff = itOnOff;
    }


    /**
     * Gets the projectSpecificModification value for this IntersectionStatus.
     * 
     * @return projectSpecificModification
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.ProjectSpecificOnOffType[] getProjectSpecificModification() {
        return projectSpecificModification;
    }


    /**
     * Sets the projectSpecificModification value for this IntersectionStatus.
     * 
     * @param projectSpecificModification
     */
    public void setProjectSpecificModification(com.siemens.sitraffic.external.intersectionStates_andCommands.ProjectSpecificOnOffType[] projectSpecificModification) {
        this.projectSpecificModification = projectSpecificModification;
    }

    public com.siemens.sitraffic.external.intersectionStates_andCommands.ProjectSpecificOnOffType getProjectSpecificModification(int i) {
        return this.projectSpecificModification[i];
    }

    public void setProjectSpecificModification(int i, com.siemens.sitraffic.external.intersectionStates_andCommands.ProjectSpecificOnOffType _value) {
        this.projectSpecificModification[i] = _value;
    }


    /**
     * Gets the state value for this IntersectionStatus.
     * 
     * @return state   * 0: o.k.
     * 1: p.o.k.
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.StateType getState() {
        return state;
    }


    /**
     * Sets the state value for this IntersectionStatus.
     * 
     * @param state   * 0: o.k.
     * 1: p.o.k.
     */
    public void setState(com.siemens.sitraffic.external.intersectionStates_andCommands.StateType state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntersectionStatus)) return false;
        IntersectionStatus other = (IntersectionStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.receiveTime==null && other.getReceiveTime()==null) || 
             (this.receiveTime!=null &&
              this.receiveTime.equals(other.getReceiveTime()))) &&
            ((this.faultStatus==null && other.getFaultStatus()==null) || 
             (this.faultStatus!=null &&
              java.util.Arrays.equals(this.faultStatus, other.getFaultStatus()))) &&
            ((this.deviceState==null && other.getDeviceState()==null) || 
             (this.deviceState!=null &&
              this.deviceState.equals(other.getDeviceState()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.controlMode==null && other.getControlMode()==null) || 
             (this.controlMode!=null &&
              this.controlMode.equals(other.getControlMode()))) &&
            ((this.intersectionOnOff==null && other.getIntersectionOnOff()==null) || 
             (this.intersectionOnOff!=null &&
              this.intersectionOnOff.equals(other.getIntersectionOnOff()))) &&
            ((this.subIntersectionOnOff==null && other.getSubIntersectionOnOff()==null) || 
             (this.subIntersectionOnOff!=null &&
              java.util.Arrays.equals(this.subIntersectionOnOff, other.getSubIntersectionOnOff()))) &&
            ((this.signalProgram==null && other.getSignalProgram()==null) || 
             (this.signalProgram!=null &&
              this.signalProgram.equals(other.getSignalProgram()))) &&
            ((this.taOnOff==null && other.getTaOnOff()==null) || 
             (this.taOnOff!=null &&
              this.taOnOff.equals(other.getTaOnOff()))) &&
            ((this.ptOnOff==null && other.getPtOnOff()==null) || 
             (this.ptOnOff!=null &&
              this.ptOnOff.equals(other.getPtOnOff()))) &&
            ((this.itOnOff==null && other.getItOnOff()==null) || 
             (this.itOnOff!=null &&
              this.itOnOff.equals(other.getItOnOff()))) &&
            ((this.projectSpecificModification==null && other.getProjectSpecificModification()==null) || 
             (this.projectSpecificModification!=null &&
              java.util.Arrays.equals(this.projectSpecificModification, other.getProjectSpecificModification()))) &&
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
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getReceiveTime() != null) {
            _hashCode += getReceiveTime().hashCode();
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
        if (getDeviceState() != null) {
            _hashCode += getDeviceState().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getControlMode() != null) {
            _hashCode += getControlMode().hashCode();
        }
        if (getIntersectionOnOff() != null) {
            _hashCode += getIntersectionOnOff().hashCode();
        }
        if (getSubIntersectionOnOff() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubIntersectionOnOff());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubIntersectionOnOff(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSignalProgram() != null) {
            _hashCode += getSignalProgram().hashCode();
        }
        if (getTaOnOff() != null) {
            _hashCode += getTaOnOff().hashCode();
        }
        if (getPtOnOff() != null) {
            _hashCode += getPtOnOff().hashCode();
        }
        if (getItOnOff() != null) {
            _hashCode += getItOnOff().hashCode();
        }
        if (getProjectSpecificModification() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjectSpecificModification());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjectSpecificModification(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
