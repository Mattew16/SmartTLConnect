/**
 * DescriptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.evr;

public class DescriptionType  implements java.io.Serializable {
    private java.lang.String identifier;

    private java.lang.String vehicle_Identifier;

    private com.siemens.sitraffic.external.evr.DescriptionTypeRoute_Coordinates route_Coordinates;

    /* average speed in km/h */
    private float speed;

    private java.lang.Long priority;

    /* type of vehicle group to be used to calculate the duration
     * of the intersection intervention */
    private com.siemens.sitraffic.external.evr.DescriptionTypeVehicle_Group vehicle_Group;

    /* position of vehicle (position of first vehicle, if vehicle
     * group is of type platoon) */
    private com.siemens.sitraffic.external.evr.VehiclePositionType vehicle_Position;

    public DescriptionType() {
    }

    public DescriptionType(
           java.lang.String identifier,
           java.lang.String vehicle_Identifier,
           com.siemens.sitraffic.external.evr.DescriptionTypeRoute_Coordinates route_Coordinates,
           float speed,
           java.lang.Long priority,
           com.siemens.sitraffic.external.evr.DescriptionTypeVehicle_Group vehicle_Group,
           com.siemens.sitraffic.external.evr.VehiclePositionType vehicle_Position) {
           this.identifier = identifier;
           this.vehicle_Identifier = vehicle_Identifier;
           this.route_Coordinates = route_Coordinates;
           this.speed = speed;
           this.priority = priority;
           this.vehicle_Group = vehicle_Group;
           this.vehicle_Position = vehicle_Position;
    }


    /**
     * Gets the identifier value for this DescriptionType.
     * 
     * @return identifier
     */
    public java.lang.String getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this DescriptionType.
     * 
     * @param identifier
     */
    public void setIdentifier(java.lang.String identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the vehicle_Identifier value for this DescriptionType.
     * 
     * @return vehicle_Identifier
     */
    public java.lang.String getVehicle_Identifier() {
        return vehicle_Identifier;
    }


    /**
     * Sets the vehicle_Identifier value for this DescriptionType.
     * 
     * @param vehicle_Identifier
     */
    public void setVehicle_Identifier(java.lang.String vehicle_Identifier) {
        this.vehicle_Identifier = vehicle_Identifier;
    }


    /**
     * Gets the route_Coordinates value for this DescriptionType.
     * 
     * @return route_Coordinates
     */
    public com.siemens.sitraffic.external.evr.DescriptionTypeRoute_Coordinates getRoute_Coordinates() {
        return route_Coordinates;
    }


    /**
     * Sets the route_Coordinates value for this DescriptionType.
     * 
     * @param route_Coordinates
     */
    public void setRoute_Coordinates(com.siemens.sitraffic.external.evr.DescriptionTypeRoute_Coordinates route_Coordinates) {
        this.route_Coordinates = route_Coordinates;
    }


    /**
     * Gets the speed value for this DescriptionType.
     * 
     * @return speed   * average speed in km/h
     */
    public float getSpeed() {
        return speed;
    }


    /**
     * Sets the speed value for this DescriptionType.
     * 
     * @param speed   * average speed in km/h
     */
    public void setSpeed(float speed) {
        this.speed = speed;
    }


    /**
     * Gets the priority value for this DescriptionType.
     * 
     * @return priority
     */
    public java.lang.Long getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this DescriptionType.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Long priority) {
        this.priority = priority;
    }


    /**
     * Gets the vehicle_Group value for this DescriptionType.
     * 
     * @return vehicle_Group   * type of vehicle group to be used to calculate the duration
     * of the intersection intervention
     */
    public com.siemens.sitraffic.external.evr.DescriptionTypeVehicle_Group getVehicle_Group() {
        return vehicle_Group;
    }


    /**
     * Sets the vehicle_Group value for this DescriptionType.
     * 
     * @param vehicle_Group   * type of vehicle group to be used to calculate the duration
     * of the intersection intervention
     */
    public void setVehicle_Group(com.siemens.sitraffic.external.evr.DescriptionTypeVehicle_Group vehicle_Group) {
        this.vehicle_Group = vehicle_Group;
    }


    /**
     * Gets the vehicle_Position value for this DescriptionType.
     * 
     * @return vehicle_Position   * position of vehicle (position of first vehicle, if vehicle
     * group is of type platoon)
     */
    public com.siemens.sitraffic.external.evr.VehiclePositionType getVehicle_Position() {
        return vehicle_Position;
    }


    /**
     * Sets the vehicle_Position value for this DescriptionType.
     * 
     * @param vehicle_Position   * position of vehicle (position of first vehicle, if vehicle
     * group is of type platoon)
     */
    public void setVehicle_Position(com.siemens.sitraffic.external.evr.VehiclePositionType vehicle_Position) {
        this.vehicle_Position = vehicle_Position;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescriptionType)) return false;
        DescriptionType other = (DescriptionType) obj;
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
            ((this.vehicle_Identifier==null && other.getVehicle_Identifier()==null) || 
             (this.vehicle_Identifier!=null &&
              this.vehicle_Identifier.equals(other.getVehicle_Identifier()))) &&
            ((this.route_Coordinates==null && other.getRoute_Coordinates()==null) || 
             (this.route_Coordinates!=null &&
              this.route_Coordinates.equals(other.getRoute_Coordinates()))) &&
            this.speed == other.getSpeed() &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.vehicle_Group==null && other.getVehicle_Group()==null) || 
             (this.vehicle_Group!=null &&
              this.vehicle_Group.equals(other.getVehicle_Group()))) &&
            ((this.vehicle_Position==null && other.getVehicle_Position()==null) || 
             (this.vehicle_Position!=null &&
              this.vehicle_Position.equals(other.getVehicle_Position())));
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
        if (getVehicle_Identifier() != null) {
            _hashCode += getVehicle_Identifier().hashCode();
        }
        if (getRoute_Coordinates() != null) {
            _hashCode += getRoute_Coordinates().hashCode();
        }
        _hashCode += new Float(getSpeed()).hashCode();
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getVehicle_Group() != null) {
            _hashCode += getVehicle_Group().hashCode();
        }
        if (getVehicle_Position() != null) {
            _hashCode += getVehicle_Position().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
