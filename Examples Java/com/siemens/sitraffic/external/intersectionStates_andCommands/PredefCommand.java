/**
 * PredefCommand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class PredefCommand  implements java.io.Serializable {
    /* Object id (lsa shortname) */
    private java.lang.String id;

    /* command id (id within predefinedops.xml ) */
    private java.lang.String command_id;

    /* description of the command */
    private java.lang.String command;

    public PredefCommand() {
    }

    public PredefCommand(
           java.lang.String id,
           java.lang.String command_id,
           java.lang.String command) {
           this.id = id;
           this.command_id = command_id;
           this.command = command;
    }


    /**
     * Gets the id value for this PredefCommand.
     * 
     * @return id   * Object id (lsa shortname)
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this PredefCommand.
     * 
     * @param id   * Object id (lsa shortname)
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the command_id value for this PredefCommand.
     * 
     * @return command_id   * command id (id within predefinedops.xml )
     */
    public java.lang.String getCommand_id() {
        return command_id;
    }


    /**
     * Sets the command_id value for this PredefCommand.
     * 
     * @param command_id   * command id (id within predefinedops.xml )
     */
    public void setCommand_id(java.lang.String command_id) {
        this.command_id = command_id;
    }


    /**
     * Gets the command value for this PredefCommand.
     * 
     * @return command   * description of the command
     */
    public java.lang.String getCommand() {
        return command;
    }


    /**
     * Sets the command value for this PredefCommand.
     * 
     * @param command   * description of the command
     */
    public void setCommand(java.lang.String command) {
        this.command = command;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PredefCommand)) return false;
        PredefCommand other = (PredefCommand) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.command_id==null && other.getCommand_id()==null) || 
             (this.command_id!=null &&
              this.command_id.equals(other.getCommand_id()))) &&
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getCommand_id() != null) {
            _hashCode += getCommand_id().hashCode();
        }
        if (getCommand() != null) {
            _hashCode += getCommand().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
