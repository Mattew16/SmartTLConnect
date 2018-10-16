/**
 * DataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.evr;

public class DataType  implements java.io.Serializable {
    private java.lang.String vehicle_Identifier;

    private com.siemens.sitraffic.external.evr.VehiclePositionType[] vehicle_Position;

    public DataType() {
    }

    public DataType(
           java.lang.String vehicle_Identifier,
           com.siemens.sitraffic.external.evr.VehiclePositionType[] vehicle_Position) {
           this.vehicle_Identifier = vehicle_Identifier;
           this.vehicle_Position = vehicle_Position;
    }


    /**
     * Gets the vehicle_Identifier value for this DataType.
     * 
     * @return vehicle_Identifier
     */
    public java.lang.String getVehicle_Identifier() {
        return vehicle_Identifier;
    }


    /**
     * Sets the vehicle_Identifier value for this DataType.
     * 
     * @param vehicle_Identifier
     */
    public void setVehicle_Identifier(java.lang.String vehicle_Identifier) {
        this.vehicle_Identifier = vehicle_Identifier;
    }


    /**
     * Gets the vehicle_Position value for this DataType.
     * 
     * @return vehicle_Position
     */
    public com.siemens.sitraffic.external.evr.VehiclePositionType[] getVehicle_Position() {
        return vehicle_Position;
    }


    /**
     * Sets the vehicle_Position value for this DataType.
     * 
     * @param vehicle_Position
     */
    public void setVehicle_Position(com.siemens.sitraffic.external.evr.VehiclePositionType[] vehicle_Position) {
        this.vehicle_Position = vehicle_Position;
    }

    public com.siemens.sitraffic.external.evr.VehiclePositionType getVehicle_Position(int i) {
        return this.vehicle_Position[i];
    }

    public void setVehicle_Position(int i, com.siemens.sitraffic.external.evr.VehiclePositionType _value) {
        this.vehicle_Position[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataType)) return false;
        DataType other = (DataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vehicle_Identifier==null && other.getVehicle_Identifier()==null) || 
             (this.vehicle_Identifier!=null &&
              this.vehicle_Identifier.equals(other.getVehicle_Identifier()))) &&
            ((this.vehicle_Position==null && other.getVehicle_Position()==null) || 
             (this.vehicle_Position!=null &&
              java.util.Arrays.equals(this.vehicle_Position, other.getVehicle_Position())));
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
        if (getVehicle_Identifier() != null) {
            _hashCode += getVehicle_Identifier().hashCode();
        }
        if (getVehicle_Position() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVehicle_Position());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVehicle_Position(), i);
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
