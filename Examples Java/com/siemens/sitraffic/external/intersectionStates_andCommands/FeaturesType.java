/**
 * FeaturesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class FeaturesType  implements java.io.Serializable {
    private com.siemens.sitraffic.external.intersectionStates_andCommands.FeaturesTypeProjSpecificMod[] projSpecificMod;

    /* optional onOff states of the controller (used for main intersection
     * and subintersections). If not specified it is assumed that the controller
     * can switch to all states defined within stateIsOnOffEnum. */
    private com.siemens.sitraffic.external.intersectionStates_andCommands.StateIsOnOffEnum[] availableIntersectionOnOff;

    private int numberOfSubIntersections;  // attribute

    private boolean hasLocalTrafficActuation;  // attribute

    private boolean hasPublicTransportPriorization;  // attribute

    private boolean hasIndividualTransportPriorization;  // attribute

    public FeaturesType() {
    }

    public FeaturesType(
           com.siemens.sitraffic.external.intersectionStates_andCommands.FeaturesTypeProjSpecificMod[] projSpecificMod,
           com.siemens.sitraffic.external.intersectionStates_andCommands.StateIsOnOffEnum[] availableIntersectionOnOff,
           int numberOfSubIntersections,
           boolean hasLocalTrafficActuation,
           boolean hasPublicTransportPriorization,
           boolean hasIndividualTransportPriorization) {
           this.projSpecificMod = projSpecificMod;
           this.availableIntersectionOnOff = availableIntersectionOnOff;
           this.numberOfSubIntersections = numberOfSubIntersections;
           this.hasLocalTrafficActuation = hasLocalTrafficActuation;
           this.hasPublicTransportPriorization = hasPublicTransportPriorization;
           this.hasIndividualTransportPriorization = hasIndividualTransportPriorization;
    }


    /**
     * Gets the projSpecificMod value for this FeaturesType.
     * 
     * @return projSpecificMod
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.FeaturesTypeProjSpecificMod[] getProjSpecificMod() {
        return projSpecificMod;
    }


    /**
     * Sets the projSpecificMod value for this FeaturesType.
     * 
     * @param projSpecificMod
     */
    public void setProjSpecificMod(com.siemens.sitraffic.external.intersectionStates_andCommands.FeaturesTypeProjSpecificMod[] projSpecificMod) {
        this.projSpecificMod = projSpecificMod;
    }

    public com.siemens.sitraffic.external.intersectionStates_andCommands.FeaturesTypeProjSpecificMod getProjSpecificMod(int i) {
        return this.projSpecificMod[i];
    }

    public void setProjSpecificMod(int i, com.siemens.sitraffic.external.intersectionStates_andCommands.FeaturesTypeProjSpecificMod _value) {
        this.projSpecificMod[i] = _value;
    }


    /**
     * Gets the availableIntersectionOnOff value for this FeaturesType.
     * 
     * @return availableIntersectionOnOff   * optional onOff states of the controller (used for main intersection
     * and subintersections). If not specified it is assumed that the controller
     * can switch to all states defined within stateIsOnOffEnum.
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.StateIsOnOffEnum[] getAvailableIntersectionOnOff() {
        return availableIntersectionOnOff;
    }


    /**
     * Sets the availableIntersectionOnOff value for this FeaturesType.
     * 
     * @param availableIntersectionOnOff   * optional onOff states of the controller (used for main intersection
     * and subintersections). If not specified it is assumed that the controller
     * can switch to all states defined within stateIsOnOffEnum.
     */
    public void setAvailableIntersectionOnOff(com.siemens.sitraffic.external.intersectionStates_andCommands.StateIsOnOffEnum[] availableIntersectionOnOff) {
        this.availableIntersectionOnOff = availableIntersectionOnOff;
    }

    public com.siemens.sitraffic.external.intersectionStates_andCommands.StateIsOnOffEnum getAvailableIntersectionOnOff(int i) {
        return this.availableIntersectionOnOff[i];
    }

    public void setAvailableIntersectionOnOff(int i, com.siemens.sitraffic.external.intersectionStates_andCommands.StateIsOnOffEnum _value) {
        this.availableIntersectionOnOff[i] = _value;
    }


    /**
     * Gets the numberOfSubIntersections value for this FeaturesType.
     * 
     * @return numberOfSubIntersections
     */
    public int getNumberOfSubIntersections() {
        return numberOfSubIntersections;
    }


    /**
     * Sets the numberOfSubIntersections value for this FeaturesType.
     * 
     * @param numberOfSubIntersections
     */
    public void setNumberOfSubIntersections(int numberOfSubIntersections) {
        this.numberOfSubIntersections = numberOfSubIntersections;
    }


    /**
     * Gets the hasLocalTrafficActuation value for this FeaturesType.
     * 
     * @return hasLocalTrafficActuation
     */
    public boolean isHasLocalTrafficActuation() {
        return hasLocalTrafficActuation;
    }


    /**
     * Sets the hasLocalTrafficActuation value for this FeaturesType.
     * 
     * @param hasLocalTrafficActuation
     */
    public void setHasLocalTrafficActuation(boolean hasLocalTrafficActuation) {
        this.hasLocalTrafficActuation = hasLocalTrafficActuation;
    }


    /**
     * Gets the hasPublicTransportPriorization value for this FeaturesType.
     * 
     * @return hasPublicTransportPriorization
     */
    public boolean isHasPublicTransportPriorization() {
        return hasPublicTransportPriorization;
    }


    /**
     * Sets the hasPublicTransportPriorization value for this FeaturesType.
     * 
     * @param hasPublicTransportPriorization
     */
    public void setHasPublicTransportPriorization(boolean hasPublicTransportPriorization) {
        this.hasPublicTransportPriorization = hasPublicTransportPriorization;
    }


    /**
     * Gets the hasIndividualTransportPriorization value for this FeaturesType.
     * 
     * @return hasIndividualTransportPriorization
     */
    public boolean isHasIndividualTransportPriorization() {
        return hasIndividualTransportPriorization;
    }


    /**
     * Sets the hasIndividualTransportPriorization value for this FeaturesType.
     * 
     * @param hasIndividualTransportPriorization
     */
    public void setHasIndividualTransportPriorization(boolean hasIndividualTransportPriorization) {
        this.hasIndividualTransportPriorization = hasIndividualTransportPriorization;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeaturesType)) return false;
        FeaturesType other = (FeaturesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.projSpecificMod==null && other.getProjSpecificMod()==null) || 
             (this.projSpecificMod!=null &&
              java.util.Arrays.equals(this.projSpecificMod, other.getProjSpecificMod()))) &&
            ((this.availableIntersectionOnOff==null && other.getAvailableIntersectionOnOff()==null) || 
             (this.availableIntersectionOnOff!=null &&
              java.util.Arrays.equals(this.availableIntersectionOnOff, other.getAvailableIntersectionOnOff()))) &&
            this.numberOfSubIntersections == other.getNumberOfSubIntersections() &&
            this.hasLocalTrafficActuation == other.isHasLocalTrafficActuation() &&
            this.hasPublicTransportPriorization == other.isHasPublicTransportPriorization() &&
            this.hasIndividualTransportPriorization == other.isHasIndividualTransportPriorization();
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
        if (getProjSpecificMod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjSpecificMod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjSpecificMod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvailableIntersectionOnOff() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableIntersectionOnOff());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableIntersectionOnOff(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getNumberOfSubIntersections();
        _hashCode += (isHasLocalTrafficActuation() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHasPublicTransportPriorization() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHasIndividualTransportPriorization() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
