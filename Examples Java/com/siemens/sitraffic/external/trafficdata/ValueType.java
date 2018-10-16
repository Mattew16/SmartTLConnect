/**
 * ValueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;

public class ValueType  implements java.io.Serializable {
    private com.siemens.sitraffic.external.trafficdata.VehicleType vehicle;  // attribute

    private int count;  // attribute

    private java.lang.Integer occ;  // attribute

    private java.lang.Integer speed;  // attribute

    public ValueType() {
    }

    public ValueType(
           com.siemens.sitraffic.external.trafficdata.VehicleType vehicle,
           int count,
           java.lang.Integer occ,
           java.lang.Integer speed) {
           this.vehicle = vehicle;
           this.count = count;
           this.occ = occ;
           this.speed = speed;
    }


    /**
     * Gets the vehicle value for this ValueType.
     * 
     * @return vehicle
     */
    public com.siemens.sitraffic.external.trafficdata.VehicleType getVehicle() {
        return vehicle;
    }


    /**
     * Sets the vehicle value for this ValueType.
     * 
     * @param vehicle
     */
    public void setVehicle(com.siemens.sitraffic.external.trafficdata.VehicleType vehicle) {
        this.vehicle = vehicle;
    }


    /**
     * Gets the count value for this ValueType.
     * 
     * @return count
     */
    public int getCount() {
        return count;
    }


    /**
     * Sets the count value for this ValueType.
     * 
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }


    /**
     * Gets the occ value for this ValueType.
     * 
     * @return occ
     */
    public java.lang.Integer getOcc() {
        return occ;
    }


    /**
     * Sets the occ value for this ValueType.
     * 
     * @param occ
     */
    public void setOcc(java.lang.Integer occ) {
        this.occ = occ;
    }


    /**
     * Gets the speed value for this ValueType.
     * 
     * @return speed
     */
    public java.lang.Integer getSpeed() {
        return speed;
    }


    /**
     * Sets the speed value for this ValueType.
     * 
     * @param speed
     */
    public void setSpeed(java.lang.Integer speed) {
        this.speed = speed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValueType)) return false;
        ValueType other = (ValueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vehicle==null && other.getVehicle()==null) || 
             (this.vehicle!=null &&
              this.vehicle.equals(other.getVehicle()))) &&
            this.count == other.getCount() &&
            ((this.occ==null && other.getOcc()==null) || 
             (this.occ!=null &&
              this.occ.equals(other.getOcc()))) &&
            ((this.speed==null && other.getSpeed()==null) || 
             (this.speed!=null &&
              this.speed.equals(other.getSpeed())));
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
        if (getVehicle() != null) {
            _hashCode += getVehicle().hashCode();
        }
        _hashCode += getCount();
        if (getOcc() != null) {
            _hashCode += getOcc().hashCode();
        }
        if (getSpeed() != null) {
            _hashCode += getSpeed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
