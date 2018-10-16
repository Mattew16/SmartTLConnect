/**
 * Evr.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.evr;

public class Evr  implements java.io.Serializable {
    /* perform command on given route (start/stop). Write only */
    private com.siemens.sitraffic.external.evr.CommandType route_Cmd;

    /* Create new routes. Write only */
    private com.siemens.sitraffic.external.evr.DescriptionType route_Request;

    /* Query state of routes. Read only */
    private com.siemens.sitraffic.external.evr.StatusType route_State;

    /* Write position data of vehicle . Write only */
    private com.siemens.sitraffic.external.evr.DataType vehicle_Data;

    public Evr() {
    }

    public Evr(
           com.siemens.sitraffic.external.evr.CommandType route_Cmd,
           com.siemens.sitraffic.external.evr.DescriptionType route_Request,
           com.siemens.sitraffic.external.evr.StatusType route_State,
           com.siemens.sitraffic.external.evr.DataType vehicle_Data) {
           this.route_Cmd = route_Cmd;
           this.route_Request = route_Request;
           this.route_State = route_State;
           this.vehicle_Data = vehicle_Data;
    }


    /**
     * Gets the route_Cmd value for this Evr.
     * 
     * @return route_Cmd   * perform command on given route (start/stop). Write only
     */
    public com.siemens.sitraffic.external.evr.CommandType getRoute_Cmd() {
        return route_Cmd;
    }


    /**
     * Sets the route_Cmd value for this Evr.
     * 
     * @param route_Cmd   * perform command on given route (start/stop). Write only
     */
    public void setRoute_Cmd(com.siemens.sitraffic.external.evr.CommandType route_Cmd) {
        this.route_Cmd = route_Cmd;
    }


    /**
     * Gets the route_Request value for this Evr.
     * 
     * @return route_Request   * Create new routes. Write only
     */
    public com.siemens.sitraffic.external.evr.DescriptionType getRoute_Request() {
        return route_Request;
    }


    /**
     * Sets the route_Request value for this Evr.
     * 
     * @param route_Request   * Create new routes. Write only
     */
    public void setRoute_Request(com.siemens.sitraffic.external.evr.DescriptionType route_Request) {
        this.route_Request = route_Request;
    }


    /**
     * Gets the route_State value for this Evr.
     * 
     * @return route_State   * Query state of routes. Read only
     */
    public com.siemens.sitraffic.external.evr.StatusType getRoute_State() {
        return route_State;
    }


    /**
     * Sets the route_State value for this Evr.
     * 
     * @param route_State   * Query state of routes. Read only
     */
    public void setRoute_State(com.siemens.sitraffic.external.evr.StatusType route_State) {
        this.route_State = route_State;
    }


    /**
     * Gets the vehicle_Data value for this Evr.
     * 
     * @return vehicle_Data   * Write position data of vehicle . Write only
     */
    public com.siemens.sitraffic.external.evr.DataType getVehicle_Data() {
        return vehicle_Data;
    }


    /**
     * Sets the vehicle_Data value for this Evr.
     * 
     * @param vehicle_Data   * Write position data of vehicle . Write only
     */
    public void setVehicle_Data(com.siemens.sitraffic.external.evr.DataType vehicle_Data) {
        this.vehicle_Data = vehicle_Data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Evr)) return false;
        Evr other = (Evr) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.route_Cmd==null && other.getRoute_Cmd()==null) || 
             (this.route_Cmd!=null &&
              this.route_Cmd.equals(other.getRoute_Cmd()))) &&
            ((this.route_Request==null && other.getRoute_Request()==null) || 
             (this.route_Request!=null &&
              this.route_Request.equals(other.getRoute_Request()))) &&
            ((this.route_State==null && other.getRoute_State()==null) || 
             (this.route_State!=null &&
              this.route_State.equals(other.getRoute_State()))) &&
            ((this.vehicle_Data==null && other.getVehicle_Data()==null) || 
             (this.vehicle_Data!=null &&
              this.vehicle_Data.equals(other.getVehicle_Data())));
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
        if (getRoute_Cmd() != null) {
            _hashCode += getRoute_Cmd().hashCode();
        }
        if (getRoute_Request() != null) {
            _hashCode += getRoute_Request().hashCode();
        }
        if (getRoute_State() != null) {
            _hashCode += getRoute_State().hashCode();
        }
        if (getVehicle_Data() != null) {
            _hashCode += getVehicle_Data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
