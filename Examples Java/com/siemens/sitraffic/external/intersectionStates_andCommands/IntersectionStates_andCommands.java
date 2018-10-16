/**
 * IntersectionStates_andCommands.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class IntersectionStates_andCommands  implements java.io.Serializable {
    /* objecttype: IntersectionStatus */
    private com.siemens.sitraffic.external.intersectionStates_andCommands.IntersectionStatus intersectionStatus;

    /* objecttype : IntersectionDescription */
    private com.siemens.sitraffic.external.global.Description intersectionDescription;

    /* objecttype:  IntersectionPredefined */
    private com.siemens.sitraffic.external.intersectionStates_andCommands.PredefCommand predefCommand;

    /* objecttype: IntersectionCommand */
    private com.siemens.sitraffic.external.intersectionStates_andCommands.IsCommandType intersectionCommand;

    /* objecttype: IntersectionFeature */
    private com.siemens.sitraffic.external.intersectionStates_andCommands.IsFeatureType intersectionFeature;

    /* object type: IntersectionControlParameter */
    private com.siemens.sitraffic.external.intersectionStates_andCommands.ControlMethodParameterType intersectionControlParameter;

    /* object type: IntersectionGroupDescription */
    private com.siemens.sitraffic.external.global.Description intersectionGroupDescription;

    public IntersectionStates_andCommands() {
    }

    public IntersectionStates_andCommands(
           com.siemens.sitraffic.external.intersectionStates_andCommands.IntersectionStatus intersectionStatus,
           com.siemens.sitraffic.external.global.Description intersectionDescription,
           com.siemens.sitraffic.external.intersectionStates_andCommands.PredefCommand predefCommand,
           com.siemens.sitraffic.external.intersectionStates_andCommands.IsCommandType intersectionCommand,
           com.siemens.sitraffic.external.intersectionStates_andCommands.IsFeatureType intersectionFeature,
           com.siemens.sitraffic.external.intersectionStates_andCommands.ControlMethodParameterType intersectionControlParameter,
           com.siemens.sitraffic.external.global.Description intersectionGroupDescription) {
           this.intersectionStatus = intersectionStatus;
           this.intersectionDescription = intersectionDescription;
           this.predefCommand = predefCommand;
           this.intersectionCommand = intersectionCommand;
           this.intersectionFeature = intersectionFeature;
           this.intersectionControlParameter = intersectionControlParameter;
           this.intersectionGroupDescription = intersectionGroupDescription;
    }


    /**
     * Gets the intersectionStatus value for this IntersectionStates_andCommands.
     * 
     * @return intersectionStatus   * objecttype: IntersectionStatus
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.IntersectionStatus getIntersectionStatus() {
        return intersectionStatus;
    }


    /**
     * Sets the intersectionStatus value for this IntersectionStates_andCommands.
     * 
     * @param intersectionStatus   * objecttype: IntersectionStatus
     */
    public void setIntersectionStatus(com.siemens.sitraffic.external.intersectionStates_andCommands.IntersectionStatus intersectionStatus) {
        this.intersectionStatus = intersectionStatus;
    }


    /**
     * Gets the intersectionDescription value for this IntersectionStates_andCommands.
     * 
     * @return intersectionDescription   * objecttype : IntersectionDescription
     */
    public com.siemens.sitraffic.external.global.Description getIntersectionDescription() {
        return intersectionDescription;
    }


    /**
     * Sets the intersectionDescription value for this IntersectionStates_andCommands.
     * 
     * @param intersectionDescription   * objecttype : IntersectionDescription
     */
    public void setIntersectionDescription(com.siemens.sitraffic.external.global.Description intersectionDescription) {
        this.intersectionDescription = intersectionDescription;
    }


    /**
     * Gets the predefCommand value for this IntersectionStates_andCommands.
     * 
     * @return predefCommand   * objecttype:  IntersectionPredefined
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.PredefCommand getPredefCommand() {
        return predefCommand;
    }


    /**
     * Sets the predefCommand value for this IntersectionStates_andCommands.
     * 
     * @param predefCommand   * objecttype:  IntersectionPredefined
     */
    public void setPredefCommand(com.siemens.sitraffic.external.intersectionStates_andCommands.PredefCommand predefCommand) {
        this.predefCommand = predefCommand;
    }


    /**
     * Gets the intersectionCommand value for this IntersectionStates_andCommands.
     * 
     * @return intersectionCommand   * objecttype: IntersectionCommand
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.IsCommandType getIntersectionCommand() {
        return intersectionCommand;
    }


    /**
     * Sets the intersectionCommand value for this IntersectionStates_andCommands.
     * 
     * @param intersectionCommand   * objecttype: IntersectionCommand
     */
    public void setIntersectionCommand(com.siemens.sitraffic.external.intersectionStates_andCommands.IsCommandType intersectionCommand) {
        this.intersectionCommand = intersectionCommand;
    }


    /**
     * Gets the intersectionFeature value for this IntersectionStates_andCommands.
     * 
     * @return intersectionFeature   * objecttype: IntersectionFeature
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.IsFeatureType getIntersectionFeature() {
        return intersectionFeature;
    }


    /**
     * Sets the intersectionFeature value for this IntersectionStates_andCommands.
     * 
     * @param intersectionFeature   * objecttype: IntersectionFeature
     */
    public void setIntersectionFeature(com.siemens.sitraffic.external.intersectionStates_andCommands.IsFeatureType intersectionFeature) {
        this.intersectionFeature = intersectionFeature;
    }


    /**
     * Gets the intersectionControlParameter value for this IntersectionStates_andCommands.
     * 
     * @return intersectionControlParameter   * object type: IntersectionControlParameter
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.ControlMethodParameterType getIntersectionControlParameter() {
        return intersectionControlParameter;
    }


    /**
     * Sets the intersectionControlParameter value for this IntersectionStates_andCommands.
     * 
     * @param intersectionControlParameter   * object type: IntersectionControlParameter
     */
    public void setIntersectionControlParameter(com.siemens.sitraffic.external.intersectionStates_andCommands.ControlMethodParameterType intersectionControlParameter) {
        this.intersectionControlParameter = intersectionControlParameter;
    }


    /**
     * Gets the intersectionGroupDescription value for this IntersectionStates_andCommands.
     * 
     * @return intersectionGroupDescription   * object type: IntersectionGroupDescription
     */
    public com.siemens.sitraffic.external.global.Description getIntersectionGroupDescription() {
        return intersectionGroupDescription;
    }


    /**
     * Sets the intersectionGroupDescription value for this IntersectionStates_andCommands.
     * 
     * @param intersectionGroupDescription   * object type: IntersectionGroupDescription
     */
    public void setIntersectionGroupDescription(com.siemens.sitraffic.external.global.Description intersectionGroupDescription) {
        this.intersectionGroupDescription = intersectionGroupDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntersectionStates_andCommands)) return false;
        IntersectionStates_andCommands other = (IntersectionStates_andCommands) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.intersectionStatus==null && other.getIntersectionStatus()==null) || 
             (this.intersectionStatus!=null &&
              this.intersectionStatus.equals(other.getIntersectionStatus()))) &&
            ((this.intersectionDescription==null && other.getIntersectionDescription()==null) || 
             (this.intersectionDescription!=null &&
              this.intersectionDescription.equals(other.getIntersectionDescription()))) &&
            ((this.predefCommand==null && other.getPredefCommand()==null) || 
             (this.predefCommand!=null &&
              this.predefCommand.equals(other.getPredefCommand()))) &&
            ((this.intersectionCommand==null && other.getIntersectionCommand()==null) || 
             (this.intersectionCommand!=null &&
              this.intersectionCommand.equals(other.getIntersectionCommand()))) &&
            ((this.intersectionFeature==null && other.getIntersectionFeature()==null) || 
             (this.intersectionFeature!=null &&
              this.intersectionFeature.equals(other.getIntersectionFeature()))) &&
            ((this.intersectionControlParameter==null && other.getIntersectionControlParameter()==null) || 
             (this.intersectionControlParameter!=null &&
              this.intersectionControlParameter.equals(other.getIntersectionControlParameter()))) &&
            ((this.intersectionGroupDescription==null && other.getIntersectionGroupDescription()==null) || 
             (this.intersectionGroupDescription!=null &&
              this.intersectionGroupDescription.equals(other.getIntersectionGroupDescription())));
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
        if (getIntersectionStatus() != null) {
            _hashCode += getIntersectionStatus().hashCode();
        }
        if (getIntersectionDescription() != null) {
            _hashCode += getIntersectionDescription().hashCode();
        }
        if (getPredefCommand() != null) {
            _hashCode += getPredefCommand().hashCode();
        }
        if (getIntersectionCommand() != null) {
            _hashCode += getIntersectionCommand().hashCode();
        }
        if (getIntersectionFeature() != null) {
            _hashCode += getIntersectionFeature().hashCode();
        }
        if (getIntersectionControlParameter() != null) {
            _hashCode += getIntersectionControlParameter().hashCode();
        }
        if (getIntersectionGroupDescription() != null) {
            _hashCode += getIntersectionGroupDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
