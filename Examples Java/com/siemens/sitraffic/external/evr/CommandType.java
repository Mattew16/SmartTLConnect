/**
 * CommandType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.evr;

public class CommandType  implements java.io.Serializable {
    private java.lang.String identifier;

    private java.lang.String vehicle_Identifier;

    private com.siemens.sitraffic.external.evr.CommandTypeCommand command;

    public CommandType() {
    }

    public CommandType(
           java.lang.String identifier,
           java.lang.String vehicle_Identifier,
           com.siemens.sitraffic.external.evr.CommandTypeCommand command) {
           this.identifier = identifier;
           this.vehicle_Identifier = vehicle_Identifier;
           this.command = command;
    }


    /**
     * Gets the identifier value for this CommandType.
     * 
     * @return identifier
     */
    public java.lang.String getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this CommandType.
     * 
     * @param identifier
     */
    public void setIdentifier(java.lang.String identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the vehicle_Identifier value for this CommandType.
     * 
     * @return vehicle_Identifier
     */
    public java.lang.String getVehicle_Identifier() {
        return vehicle_Identifier;
    }


    /**
     * Sets the vehicle_Identifier value for this CommandType.
     * 
     * @param vehicle_Identifier
     */
    public void setVehicle_Identifier(java.lang.String vehicle_Identifier) {
        this.vehicle_Identifier = vehicle_Identifier;
    }


    /**
     * Gets the command value for this CommandType.
     * 
     * @return command
     */
    public com.siemens.sitraffic.external.evr.CommandTypeCommand getCommand() {
        return command;
    }


    /**
     * Sets the command value for this CommandType.
     * 
     * @param command
     */
    public void setCommand(com.siemens.sitraffic.external.evr.CommandTypeCommand command) {
        this.command = command;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommandType)) return false;
        CommandType other = (CommandType) obj;
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
            ((this.command==null && other.getCommand()==null) || 
             (this.command!=null &&
              this.command.equals(other.getCommand())));
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
        if (getCommand() != null) {
            _hashCode += getCommand().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
