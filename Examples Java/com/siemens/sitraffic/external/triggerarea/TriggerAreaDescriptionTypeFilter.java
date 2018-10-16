/**
 * TriggerAreaDescriptionTypeFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.triggerarea;

public class TriggerAreaDescriptionTypeFilter  implements java.io.Serializable {
    private com.siemens.sitraffic.external.triggerarea.TriggerAreaDescriptionTypeFilterSpeedRange speedRange;

    private java.lang.String vehicleType;

    public TriggerAreaDescriptionTypeFilter() {
    }

    public TriggerAreaDescriptionTypeFilter(
           com.siemens.sitraffic.external.triggerarea.TriggerAreaDescriptionTypeFilterSpeedRange speedRange,
           java.lang.String vehicleType) {
           this.speedRange = speedRange;
           this.vehicleType = vehicleType;
    }


    /**
     * Gets the speedRange value for this TriggerAreaDescriptionTypeFilter.
     * 
     * @return speedRange
     */
    public com.siemens.sitraffic.external.triggerarea.TriggerAreaDescriptionTypeFilterSpeedRange getSpeedRange() {
        return speedRange;
    }


    /**
     * Sets the speedRange value for this TriggerAreaDescriptionTypeFilter.
     * 
     * @param speedRange
     */
    public void setSpeedRange(com.siemens.sitraffic.external.triggerarea.TriggerAreaDescriptionTypeFilterSpeedRange speedRange) {
        this.speedRange = speedRange;
    }


    /**
     * Gets the vehicleType value for this TriggerAreaDescriptionTypeFilter.
     * 
     * @return vehicleType
     */
    public java.lang.String getVehicleType() {
        return vehicleType;
    }


    /**
     * Sets the vehicleType value for this TriggerAreaDescriptionTypeFilter.
     * 
     * @param vehicleType
     */
    public void setVehicleType(java.lang.String vehicleType) {
        this.vehicleType = vehicleType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TriggerAreaDescriptionTypeFilter)) return false;
        TriggerAreaDescriptionTypeFilter other = (TriggerAreaDescriptionTypeFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.speedRange==null && other.getSpeedRange()==null) || 
             (this.speedRange!=null &&
              this.speedRange.equals(other.getSpeedRange()))) &&
            ((this.vehicleType==null && other.getVehicleType()==null) || 
             (this.vehicleType!=null &&
              this.vehicleType.equals(other.getVehicleType())));
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
        if (getSpeedRange() != null) {
            _hashCode += getSpeedRange().hashCode();
        }
        if (getVehicleType() != null) {
            _hashCode += getVehicleType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
