/**
 * RestrictionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.global;

public class RestrictionType  implements java.io.Serializable {
    /* height limit in cm */
    private org.apache.axis.types.UnsignedInt inHeight;

    /* weight limit in kg */
    private org.apache.axis.types.UnsignedShort inWeight;

    /* speed limit in km/h */
    private org.apache.axis.types.UnsignedShort inSpeed;

    /* restrictions in lanes */
    private com.siemens.sitraffic.external.global.RestrictionTypeInLanes inLanes;

    /* other textual input */
    private java.lang.String other;

    /* capacity reduction in % */
    private com.siemens.sitraffic.external.global.RestrictionTypeCapacity_reduction capacity_reduction;

    public RestrictionType() {
    }

    public RestrictionType(
           org.apache.axis.types.UnsignedInt inHeight,
           org.apache.axis.types.UnsignedShort inWeight,
           org.apache.axis.types.UnsignedShort inSpeed,
           com.siemens.sitraffic.external.global.RestrictionTypeInLanes inLanes,
           java.lang.String other,
           com.siemens.sitraffic.external.global.RestrictionTypeCapacity_reduction capacity_reduction) {
           this.inHeight = inHeight;
           this.inWeight = inWeight;
           this.inSpeed = inSpeed;
           this.inLanes = inLanes;
           this.other = other;
           this.capacity_reduction = capacity_reduction;
    }


    /**
     * Gets the inHeight value for this RestrictionType.
     * 
     * @return inHeight   * height limit in cm
     */
    public org.apache.axis.types.UnsignedInt getInHeight() {
        return inHeight;
    }


    /**
     * Sets the inHeight value for this RestrictionType.
     * 
     * @param inHeight   * height limit in cm
     */
    public void setInHeight(org.apache.axis.types.UnsignedInt inHeight) {
        this.inHeight = inHeight;
    }


    /**
     * Gets the inWeight value for this RestrictionType.
     * 
     * @return inWeight   * weight limit in kg
     */
    public org.apache.axis.types.UnsignedShort getInWeight() {
        return inWeight;
    }


    /**
     * Sets the inWeight value for this RestrictionType.
     * 
     * @param inWeight   * weight limit in kg
     */
    public void setInWeight(org.apache.axis.types.UnsignedShort inWeight) {
        this.inWeight = inWeight;
    }


    /**
     * Gets the inSpeed value for this RestrictionType.
     * 
     * @return inSpeed   * speed limit in km/h
     */
    public org.apache.axis.types.UnsignedShort getInSpeed() {
        return inSpeed;
    }


    /**
     * Sets the inSpeed value for this RestrictionType.
     * 
     * @param inSpeed   * speed limit in km/h
     */
    public void setInSpeed(org.apache.axis.types.UnsignedShort inSpeed) {
        this.inSpeed = inSpeed;
    }


    /**
     * Gets the inLanes value for this RestrictionType.
     * 
     * @return inLanes   * restrictions in lanes
     */
    public com.siemens.sitraffic.external.global.RestrictionTypeInLanes getInLanes() {
        return inLanes;
    }


    /**
     * Sets the inLanes value for this RestrictionType.
     * 
     * @param inLanes   * restrictions in lanes
     */
    public void setInLanes(com.siemens.sitraffic.external.global.RestrictionTypeInLanes inLanes) {
        this.inLanes = inLanes;
    }


    /**
     * Gets the other value for this RestrictionType.
     * 
     * @return other   * other textual input
     */
    public java.lang.String getOther() {
        return other;
    }


    /**
     * Sets the other value for this RestrictionType.
     * 
     * @param other   * other textual input
     */
    public void setOther(java.lang.String other) {
        this.other = other;
    }


    /**
     * Gets the capacity_reduction value for this RestrictionType.
     * 
     * @return capacity_reduction   * capacity reduction in %
     */
    public com.siemens.sitraffic.external.global.RestrictionTypeCapacity_reduction getCapacity_reduction() {
        return capacity_reduction;
    }


    /**
     * Sets the capacity_reduction value for this RestrictionType.
     * 
     * @param capacity_reduction   * capacity reduction in %
     */
    public void setCapacity_reduction(com.siemens.sitraffic.external.global.RestrictionTypeCapacity_reduction capacity_reduction) {
        this.capacity_reduction = capacity_reduction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RestrictionType)) return false;
        RestrictionType other = (RestrictionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inHeight==null && other.getInHeight()==null) || 
             (this.inHeight!=null &&
              this.inHeight.equals(other.getInHeight()))) &&
            ((this.inWeight==null && other.getInWeight()==null) || 
             (this.inWeight!=null &&
              this.inWeight.equals(other.getInWeight()))) &&
            ((this.inSpeed==null && other.getInSpeed()==null) || 
             (this.inSpeed!=null &&
              this.inSpeed.equals(other.getInSpeed()))) &&
            ((this.inLanes==null && other.getInLanes()==null) || 
             (this.inLanes!=null &&
              this.inLanes.equals(other.getInLanes()))) &&
            ((this.other==null && other.getOther()==null) || 
             (this.other!=null &&
              this.other.equals(other.getOther()))) &&
            ((this.capacity_reduction==null && other.getCapacity_reduction()==null) || 
             (this.capacity_reduction!=null &&
              this.capacity_reduction.equals(other.getCapacity_reduction())));
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
        if (getInHeight() != null) {
            _hashCode += getInHeight().hashCode();
        }
        if (getInWeight() != null) {
            _hashCode += getInWeight().hashCode();
        }
        if (getInSpeed() != null) {
            _hashCode += getInSpeed().hashCode();
        }
        if (getInLanes() != null) {
            _hashCode += getInLanes().hashCode();
        }
        if (getOther() != null) {
            _hashCode += getOther().hashCode();
        }
        if (getCapacity_reduction() != null) {
            _hashCode += getCapacity_reduction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
