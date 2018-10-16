/**
 * IsCommandType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class IsCommandType  implements java.io.Serializable {
    private java.lang.String identifier;

    /* 0: scheduler
     * 1: traffic actuation
     * 2: high prio scheduler
     * 3: manual
     * 4: high prio manual */
    private org.apache.axis.types.UnsignedInt priority;

    /* Job id acording to OCIT-O */
    private java.lang.Long jobId;

    /* Start and stop of the command. If no timeline is present the
     * command is immediately valid without end. */
    private com.siemens.sitraffic.external.intersectionStates_andCommands.TimelineType timeline;

    /* Signal program to perform. Nopte: If undefined the default
     * is set to 0, see element spNr */
    private com.siemens.sitraffic.external.intersectionStates_andCommands.SignalProgramType signalProgram;

    /* Switch intersection on or off. Note: If undefined the default
     * is set to "none", see element onOff */
    private com.siemens.sitraffic.external.intersectionStates_andCommands.IsOnOffType intersectionOnOff;

    /* Switch sub intersection on or off. Note: If undefined the default
     * is set to "none" for every existing sub intersection, see element
     * onOff. */
    private com.siemens.sitraffic.external.intersectionStates_andCommands.SubIntersectionType[] subIntersectionOnOff;

    /* Switch local traffic actuation on or off. Note: If undefined
     * the default is set to "none", see element onOff */
    private com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffType localTrafficActuation;

    /* Switch public transport optimisation on or off. Note: If undefined
     * the default is set to "none", see element onOff */
    private com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffType publicTransportOptimization;

    /* Switch individual transport optimisation on or off. Note: If
     * undefined the default is set to "none", see element onOff */
    private com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffType individualTransportOptimization;

    /* Switch project spezific motification on or off. Note: If undefined
     * the default is set to "none" for every existing project specific modification,
     * see element onOff */
    private com.siemens.sitraffic.external.intersectionStates_andCommands.ProjSpecificModificationType[] projSpecificModification;

    public IsCommandType() {
    }

    public IsCommandType(
           java.lang.String identifier,
           org.apache.axis.types.UnsignedInt priority,
           java.lang.Long jobId,
           com.siemens.sitraffic.external.intersectionStates_andCommands.TimelineType timeline,
           com.siemens.sitraffic.external.intersectionStates_andCommands.SignalProgramType signalProgram,
           com.siemens.sitraffic.external.intersectionStates_andCommands.IsOnOffType intersectionOnOff,
           com.siemens.sitraffic.external.intersectionStates_andCommands.SubIntersectionType[] subIntersectionOnOff,
           com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffType localTrafficActuation,
           com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffType publicTransportOptimization,
           com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffType individualTransportOptimization,
           com.siemens.sitraffic.external.intersectionStates_andCommands.ProjSpecificModificationType[] projSpecificModification) {
           this.identifier = identifier;
           this.priority = priority;
           this.jobId = jobId;
           this.timeline = timeline;
           this.signalProgram = signalProgram;
           this.intersectionOnOff = intersectionOnOff;
           this.subIntersectionOnOff = subIntersectionOnOff;
           this.localTrafficActuation = localTrafficActuation;
           this.publicTransportOptimization = publicTransportOptimization;
           this.individualTransportOptimization = individualTransportOptimization;
           this.projSpecificModification = projSpecificModification;
    }


    /**
     * Gets the identifier value for this IsCommandType.
     * 
     * @return identifier
     */
    public java.lang.String getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this IsCommandType.
     * 
     * @param identifier
     */
    public void setIdentifier(java.lang.String identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the priority value for this IsCommandType.
     * 
     * @return priority   * 0: scheduler
     * 1: traffic actuation
     * 2: high prio scheduler
     * 3: manual
     * 4: high prio manual
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this IsCommandType.
     * 
     * @param priority   * 0: scheduler
     * 1: traffic actuation
     * 2: high prio scheduler
     * 3: manual
     * 4: high prio manual
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the jobId value for this IsCommandType.
     * 
     * @return jobId   * Job id acording to OCIT-O
     */
    public java.lang.Long getJobId() {
        return jobId;
    }


    /**
     * Sets the jobId value for this IsCommandType.
     * 
     * @param jobId   * Job id acording to OCIT-O
     */
    public void setJobId(java.lang.Long jobId) {
        this.jobId = jobId;
    }


    /**
     * Gets the timeline value for this IsCommandType.
     * 
     * @return timeline   * Start and stop of the command. If no timeline is present the
     * command is immediately valid without end.
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.TimelineType getTimeline() {
        return timeline;
    }


    /**
     * Sets the timeline value for this IsCommandType.
     * 
     * @param timeline   * Start and stop of the command. If no timeline is present the
     * command is immediately valid without end.
     */
    public void setTimeline(com.siemens.sitraffic.external.intersectionStates_andCommands.TimelineType timeline) {
        this.timeline = timeline;
    }


    /**
     * Gets the signalProgram value for this IsCommandType.
     * 
     * @return signalProgram   * Signal program to perform. Nopte: If undefined the default
     * is set to 0, see element spNr
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.SignalProgramType getSignalProgram() {
        return signalProgram;
    }


    /**
     * Sets the signalProgram value for this IsCommandType.
     * 
     * @param signalProgram   * Signal program to perform. Nopte: If undefined the default
     * is set to 0, see element spNr
     */
    public void setSignalProgram(com.siemens.sitraffic.external.intersectionStates_andCommands.SignalProgramType signalProgram) {
        this.signalProgram = signalProgram;
    }


    /**
     * Gets the intersectionOnOff value for this IsCommandType.
     * 
     * @return intersectionOnOff   * Switch intersection on or off. Note: If undefined the default
     * is set to "none", see element onOff
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.IsOnOffType getIntersectionOnOff() {
        return intersectionOnOff;
    }


    /**
     * Sets the intersectionOnOff value for this IsCommandType.
     * 
     * @param intersectionOnOff   * Switch intersection on or off. Note: If undefined the default
     * is set to "none", see element onOff
     */
    public void setIntersectionOnOff(com.siemens.sitraffic.external.intersectionStates_andCommands.IsOnOffType intersectionOnOff) {
        this.intersectionOnOff = intersectionOnOff;
    }


    /**
     * Gets the subIntersectionOnOff value for this IsCommandType.
     * 
     * @return subIntersectionOnOff   * Switch sub intersection on or off. Note: If undefined the default
     * is set to "none" for every existing sub intersection, see element
     * onOff.
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.SubIntersectionType[] getSubIntersectionOnOff() {
        return subIntersectionOnOff;
    }


    /**
     * Sets the subIntersectionOnOff value for this IsCommandType.
     * 
     * @param subIntersectionOnOff   * Switch sub intersection on or off. Note: If undefined the default
     * is set to "none" for every existing sub intersection, see element
     * onOff.
     */
    public void setSubIntersectionOnOff(com.siemens.sitraffic.external.intersectionStates_andCommands.SubIntersectionType[] subIntersectionOnOff) {
        this.subIntersectionOnOff = subIntersectionOnOff;
    }

    public com.siemens.sitraffic.external.intersectionStates_andCommands.SubIntersectionType getSubIntersectionOnOff(int i) {
        return this.subIntersectionOnOff[i];
    }

    public void setSubIntersectionOnOff(int i, com.siemens.sitraffic.external.intersectionStates_andCommands.SubIntersectionType _value) {
        this.subIntersectionOnOff[i] = _value;
    }


    /**
     * Gets the localTrafficActuation value for this IsCommandType.
     * 
     * @return localTrafficActuation   * Switch local traffic actuation on or off. Note: If undefined
     * the default is set to "none", see element onOff
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffType getLocalTrafficActuation() {
        return localTrafficActuation;
    }


    /**
     * Sets the localTrafficActuation value for this IsCommandType.
     * 
     * @param localTrafficActuation   * Switch local traffic actuation on or off. Note: If undefined
     * the default is set to "none", see element onOff
     */
    public void setLocalTrafficActuation(com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffType localTrafficActuation) {
        this.localTrafficActuation = localTrafficActuation;
    }


    /**
     * Gets the publicTransportOptimization value for this IsCommandType.
     * 
     * @return publicTransportOptimization   * Switch public transport optimisation on or off. Note: If undefined
     * the default is set to "none", see element onOff
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffType getPublicTransportOptimization() {
        return publicTransportOptimization;
    }


    /**
     * Sets the publicTransportOptimization value for this IsCommandType.
     * 
     * @param publicTransportOptimization   * Switch public transport optimisation on or off. Note: If undefined
     * the default is set to "none", see element onOff
     */
    public void setPublicTransportOptimization(com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffType publicTransportOptimization) {
        this.publicTransportOptimization = publicTransportOptimization;
    }


    /**
     * Gets the individualTransportOptimization value for this IsCommandType.
     * 
     * @return individualTransportOptimization   * Switch individual transport optimisation on or off. Note: If
     * undefined the default is set to "none", see element onOff
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffType getIndividualTransportOptimization() {
        return individualTransportOptimization;
    }


    /**
     * Sets the individualTransportOptimization value for this IsCommandType.
     * 
     * @param individualTransportOptimization   * Switch individual transport optimisation on or off. Note: If
     * undefined the default is set to "none", see element onOff
     */
    public void setIndividualTransportOptimization(com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffType individualTransportOptimization) {
        this.individualTransportOptimization = individualTransportOptimization;
    }


    /**
     * Gets the projSpecificModification value for this IsCommandType.
     * 
     * @return projSpecificModification   * Switch project spezific motification on or off. Note: If undefined
     * the default is set to "none" for every existing project specific modification,
     * see element onOff
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.ProjSpecificModificationType[] getProjSpecificModification() {
        return projSpecificModification;
    }


    /**
     * Sets the projSpecificModification value for this IsCommandType.
     * 
     * @param projSpecificModification   * Switch project spezific motification on or off. Note: If undefined
     * the default is set to "none" for every existing project specific modification,
     * see element onOff
     */
    public void setProjSpecificModification(com.siemens.sitraffic.external.intersectionStates_andCommands.ProjSpecificModificationType[] projSpecificModification) {
        this.projSpecificModification = projSpecificModification;
    }

    public com.siemens.sitraffic.external.intersectionStates_andCommands.ProjSpecificModificationType getProjSpecificModification(int i) {
        return this.projSpecificModification[i];
    }

    public void setProjSpecificModification(int i, com.siemens.sitraffic.external.intersectionStates_andCommands.ProjSpecificModificationType _value) {
        this.projSpecificModification[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsCommandType)) return false;
        IsCommandType other = (IsCommandType) obj;
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
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.jobId==null && other.getJobId()==null) || 
             (this.jobId!=null &&
              this.jobId.equals(other.getJobId()))) &&
            ((this.timeline==null && other.getTimeline()==null) || 
             (this.timeline!=null &&
              this.timeline.equals(other.getTimeline()))) &&
            ((this.signalProgram==null && other.getSignalProgram()==null) || 
             (this.signalProgram!=null &&
              this.signalProgram.equals(other.getSignalProgram()))) &&
            ((this.intersectionOnOff==null && other.getIntersectionOnOff()==null) || 
             (this.intersectionOnOff!=null &&
              this.intersectionOnOff.equals(other.getIntersectionOnOff()))) &&
            ((this.subIntersectionOnOff==null && other.getSubIntersectionOnOff()==null) || 
             (this.subIntersectionOnOff!=null &&
              java.util.Arrays.equals(this.subIntersectionOnOff, other.getSubIntersectionOnOff()))) &&
            ((this.localTrafficActuation==null && other.getLocalTrafficActuation()==null) || 
             (this.localTrafficActuation!=null &&
              this.localTrafficActuation.equals(other.getLocalTrafficActuation()))) &&
            ((this.publicTransportOptimization==null && other.getPublicTransportOptimization()==null) || 
             (this.publicTransportOptimization!=null &&
              this.publicTransportOptimization.equals(other.getPublicTransportOptimization()))) &&
            ((this.individualTransportOptimization==null && other.getIndividualTransportOptimization()==null) || 
             (this.individualTransportOptimization!=null &&
              this.individualTransportOptimization.equals(other.getIndividualTransportOptimization()))) &&
            ((this.projSpecificModification==null && other.getProjSpecificModification()==null) || 
             (this.projSpecificModification!=null &&
              java.util.Arrays.equals(this.projSpecificModification, other.getProjSpecificModification())));
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
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getJobId() != null) {
            _hashCode += getJobId().hashCode();
        }
        if (getTimeline() != null) {
            _hashCode += getTimeline().hashCode();
        }
        if (getSignalProgram() != null) {
            _hashCode += getSignalProgram().hashCode();
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
        if (getLocalTrafficActuation() != null) {
            _hashCode += getLocalTrafficActuation().hashCode();
        }
        if (getPublicTransportOptimization() != null) {
            _hashCode += getPublicTransportOptimization().hashCode();
        }
        if (getIndividualTransportOptimization() != null) {
            _hashCode += getIndividualTransportOptimization().hashCode();
        }
        if (getProjSpecificModification() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjSpecificModification());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjSpecificModification(), i);
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
