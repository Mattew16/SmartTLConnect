/**
 * TriggerAreaDescriptionTypeFilterSpeedRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.triggerarea;

public class TriggerAreaDescriptionTypeFilterSpeedRange  implements java.io.Serializable {
    private float min;

    private float max;

    public TriggerAreaDescriptionTypeFilterSpeedRange() {
    }

    public TriggerAreaDescriptionTypeFilterSpeedRange(
           float min,
           float max) {
           this.min = min;
           this.max = max;
    }


    /**
     * Gets the min value for this TriggerAreaDescriptionTypeFilterSpeedRange.
     * 
     * @return min
     */
    public float getMin() {
        return min;
    }


    /**
     * Sets the min value for this TriggerAreaDescriptionTypeFilterSpeedRange.
     * 
     * @param min
     */
    public void setMin(float min) {
        this.min = min;
    }


    /**
     * Gets the max value for this TriggerAreaDescriptionTypeFilterSpeedRange.
     * 
     * @return max
     */
    public float getMax() {
        return max;
    }


    /**
     * Sets the max value for this TriggerAreaDescriptionTypeFilterSpeedRange.
     * 
     * @param max
     */
    public void setMax(float max) {
        this.max = max;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TriggerAreaDescriptionTypeFilterSpeedRange)) return false;
        TriggerAreaDescriptionTypeFilterSpeedRange other = (TriggerAreaDescriptionTypeFilterSpeedRange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.min == other.getMin() &&
            this.max == other.getMax();
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
        _hashCode += new Float(getMin()).hashCode();
        _hashCode += new Float(getMax()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
