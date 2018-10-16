/**
 * ServiceExtensionDevice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.global;

public class ServiceExtensionDevice  implements java.io.Serializable {
    /* Device identification like type or name */
    private java.lang.String identification;

    /* Closer description of the device like model number or serial
     * number */
    private java.lang.String model_number;

    /* Description of the latest maintanence service, e.g. date */
    private java.lang.String previous_maintenance;

    /* descritpion of the maintenance interval like monthly or every
     * two week or some day/week/month */
    private java.lang.String maintenance_interval;

    /* The communication protocol the device uses for data exchange
     * with ist controlling instance, e.g. the central application */
    private java.lang.String comm_protocol;

    public ServiceExtensionDevice() {
    }

    public ServiceExtensionDevice(
           java.lang.String identification,
           java.lang.String model_number,
           java.lang.String previous_maintenance,
           java.lang.String maintenance_interval,
           java.lang.String comm_protocol) {
           this.identification = identification;
           this.model_number = model_number;
           this.previous_maintenance = previous_maintenance;
           this.maintenance_interval = maintenance_interval;
           this.comm_protocol = comm_protocol;
    }


    /**
     * Gets the identification value for this ServiceExtensionDevice.
     * 
     * @return identification   * Device identification like type or name
     */
    public java.lang.String getIdentification() {
        return identification;
    }


    /**
     * Sets the identification value for this ServiceExtensionDevice.
     * 
     * @param identification   * Device identification like type or name
     */
    public void setIdentification(java.lang.String identification) {
        this.identification = identification;
    }


    /**
     * Gets the model_number value for this ServiceExtensionDevice.
     * 
     * @return model_number   * Closer description of the device like model number or serial
     * number
     */
    public java.lang.String getModel_number() {
        return model_number;
    }


    /**
     * Sets the model_number value for this ServiceExtensionDevice.
     * 
     * @param model_number   * Closer description of the device like model number or serial
     * number
     */
    public void setModel_number(java.lang.String model_number) {
        this.model_number = model_number;
    }


    /**
     * Gets the previous_maintenance value for this ServiceExtensionDevice.
     * 
     * @return previous_maintenance   * Description of the latest maintanence service, e.g. date
     */
    public java.lang.String getPrevious_maintenance() {
        return previous_maintenance;
    }


    /**
     * Sets the previous_maintenance value for this ServiceExtensionDevice.
     * 
     * @param previous_maintenance   * Description of the latest maintanence service, e.g. date
     */
    public void setPrevious_maintenance(java.lang.String previous_maintenance) {
        this.previous_maintenance = previous_maintenance;
    }


    /**
     * Gets the maintenance_interval value for this ServiceExtensionDevice.
     * 
     * @return maintenance_interval   * descritpion of the maintenance interval like monthly or every
     * two week or some day/week/month
     */
    public java.lang.String getMaintenance_interval() {
        return maintenance_interval;
    }


    /**
     * Sets the maintenance_interval value for this ServiceExtensionDevice.
     * 
     * @param maintenance_interval   * descritpion of the maintenance interval like monthly or every
     * two week or some day/week/month
     */
    public void setMaintenance_interval(java.lang.String maintenance_interval) {
        this.maintenance_interval = maintenance_interval;
    }


    /**
     * Gets the comm_protocol value for this ServiceExtensionDevice.
     * 
     * @return comm_protocol   * The communication protocol the device uses for data exchange
     * with ist controlling instance, e.g. the central application
     */
    public java.lang.String getComm_protocol() {
        return comm_protocol;
    }


    /**
     * Sets the comm_protocol value for this ServiceExtensionDevice.
     * 
     * @param comm_protocol   * The communication protocol the device uses for data exchange
     * with ist controlling instance, e.g. the central application
     */
    public void setComm_protocol(java.lang.String comm_protocol) {
        this.comm_protocol = comm_protocol;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceExtensionDevice)) return false;
        ServiceExtensionDevice other = (ServiceExtensionDevice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identification==null && other.getIdentification()==null) || 
             (this.identification!=null &&
              this.identification.equals(other.getIdentification()))) &&
            ((this.model_number==null && other.getModel_number()==null) || 
             (this.model_number!=null &&
              this.model_number.equals(other.getModel_number()))) &&
            ((this.previous_maintenance==null && other.getPrevious_maintenance()==null) || 
             (this.previous_maintenance!=null &&
              this.previous_maintenance.equals(other.getPrevious_maintenance()))) &&
            ((this.maintenance_interval==null && other.getMaintenance_interval()==null) || 
             (this.maintenance_interval!=null &&
              this.maintenance_interval.equals(other.getMaintenance_interval()))) &&
            ((this.comm_protocol==null && other.getComm_protocol()==null) || 
             (this.comm_protocol!=null &&
              this.comm_protocol.equals(other.getComm_protocol())));
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
        if (getIdentification() != null) {
            _hashCode += getIdentification().hashCode();
        }
        if (getModel_number() != null) {
            _hashCode += getModel_number().hashCode();
        }
        if (getPrevious_maintenance() != null) {
            _hashCode += getPrevious_maintenance().hashCode();
        }
        if (getMaintenance_interval() != null) {
            _hashCode += getMaintenance_interval().hashCode();
        }
        if (getComm_protocol() != null) {
            _hashCode += getComm_protocol().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
