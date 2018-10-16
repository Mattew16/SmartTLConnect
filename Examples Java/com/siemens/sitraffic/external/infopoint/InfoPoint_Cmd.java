/**
 * InfoPoint_Cmd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.infopoint;

public class InfoPoint_Cmd  implements java.io.Serializable {
    private com.siemens.sitraffic.external.infopoint.InfoPoint_CmdSwitchCmd switchCmd;

    public InfoPoint_Cmd() {
    }

    public InfoPoint_Cmd(
           com.siemens.sitraffic.external.infopoint.InfoPoint_CmdSwitchCmd switchCmd) {
           this.switchCmd = switchCmd;
    }


    /**
     * Gets the switchCmd value for this InfoPoint_Cmd.
     * 
     * @return switchCmd
     */
    public com.siemens.sitraffic.external.infopoint.InfoPoint_CmdSwitchCmd getSwitchCmd() {
        return switchCmd;
    }


    /**
     * Sets the switchCmd value for this InfoPoint_Cmd.
     * 
     * @param switchCmd
     */
    public void setSwitchCmd(com.siemens.sitraffic.external.infopoint.InfoPoint_CmdSwitchCmd switchCmd) {
        this.switchCmd = switchCmd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoPoint_Cmd)) return false;
        InfoPoint_Cmd other = (InfoPoint_Cmd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.switchCmd==null && other.getSwitchCmd()==null) || 
             (this.switchCmd!=null &&
              this.switchCmd.equals(other.getSwitchCmd())));
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
        if (getSwitchCmd() != null) {
            _hashCode += getSwitchCmd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
