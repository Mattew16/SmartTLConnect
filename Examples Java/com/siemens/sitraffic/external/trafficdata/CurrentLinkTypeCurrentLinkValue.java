/**
 * CurrentLinkTypeCurrentLinkValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;

public class CurrentLinkTypeCurrentLinkValue  implements java.io.Serializable {
    private com.siemens.sitraffic.external.trafficdata.LinkValueType values;

    private com.siemens.sitraffic.external.trafficdata.PredictionVehicleType vehicleClass;

    public CurrentLinkTypeCurrentLinkValue() {
    }

    public CurrentLinkTypeCurrentLinkValue(
           com.siemens.sitraffic.external.trafficdata.LinkValueType values,
           com.siemens.sitraffic.external.trafficdata.PredictionVehicleType vehicleClass) {
           this.values = values;
           this.vehicleClass = vehicleClass;
    }


    /**
     * Gets the values value for this CurrentLinkTypeCurrentLinkValue.
     * 
     * @return values
     */
    public com.siemens.sitraffic.external.trafficdata.LinkValueType getValues() {
        return values;
    }


    /**
     * Sets the values value for this CurrentLinkTypeCurrentLinkValue.
     * 
     * @param values
     */
    public void setValues(com.siemens.sitraffic.external.trafficdata.LinkValueType values) {
        this.values = values;
    }


    /**
     * Gets the vehicleClass value for this CurrentLinkTypeCurrentLinkValue.
     * 
     * @return vehicleClass
     */
    public com.siemens.sitraffic.external.trafficdata.PredictionVehicleType getVehicleClass() {
        return vehicleClass;
    }


    /**
     * Sets the vehicleClass value for this CurrentLinkTypeCurrentLinkValue.
     * 
     * @param vehicleClass
     */
    public void setVehicleClass(com.siemens.sitraffic.external.trafficdata.PredictionVehicleType vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurrentLinkTypeCurrentLinkValue)) return false;
        CurrentLinkTypeCurrentLinkValue other = (CurrentLinkTypeCurrentLinkValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.values==null && other.getValues()==null) || 
             (this.values!=null &&
              this.values.equals(other.getValues()))) &&
            ((this.vehicleClass==null && other.getVehicleClass()==null) || 
             (this.vehicleClass!=null &&
              this.vehicleClass.equals(other.getVehicleClass())));
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
        if (getValues() != null) {
            _hashCode += getValues().hashCode();
        }
        if (getVehicleClass() != null) {
            _hashCode += getVehicleClass().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
