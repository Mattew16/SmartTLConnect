/**
 * InfoPoint_CmdSwitchCmd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;

public class InfoPoint_CmdSwitchCmd  implements java.io.Serializable {
    /* start date/time of the switch empty in case of immediate switch
     * execution) */
    private java.util.Calendar start;

    /* end date/time of the switch; emtpy in case of endless switch
     * execution */
    private java.util.Calendar end;

    /* includes the whole content definition the attribute AddTo means:
     * add the defined content here to the content of the mentioned Priority
     * level. */
    private com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_CmdSwitchCmdContentDefinition contentDefinition;

    /* Reason which has been resulted in switch/ switch priority */
    private java.lang.String switchReason;

    private java.lang.String addInfo;

    public InfoPoint_CmdSwitchCmd() {
    }

    public InfoPoint_CmdSwitchCmd(
           java.util.Calendar start,
           java.util.Calendar end,
           com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_CmdSwitchCmdContentDefinition contentDefinition,
           java.lang.String switchReason,
           java.lang.String addInfo) {
           this.start = start;
           this.end = end;
           this.contentDefinition = contentDefinition;
           this.switchReason = switchReason;
           this.addInfo = addInfo;
    }


    /**
     * Gets the start value for this InfoPoint_CmdSwitchCmd.
     * 
     * @return start   * start date/time of the switch empty in case of immediate switch
     * execution)
     */
    public java.util.Calendar getStart() {
        return start;
    }


    /**
     * Sets the start value for this InfoPoint_CmdSwitchCmd.
     * 
     * @param start   * start date/time of the switch empty in case of immediate switch
     * execution)
     */
    public void setStart(java.util.Calendar start) {
        this.start = start;
    }


    /**
     * Gets the end value for this InfoPoint_CmdSwitchCmd.
     * 
     * @return end   * end date/time of the switch; emtpy in case of endless switch
     * execution
     */
    public java.util.Calendar getEnd() {
        return end;
    }


    /**
     * Sets the end value for this InfoPoint_CmdSwitchCmd.
     * 
     * @param end   * end date/time of the switch; emtpy in case of endless switch
     * execution
     */
    public void setEnd(java.util.Calendar end) {
        this.end = end;
    }


    /**
     * Gets the contentDefinition value for this InfoPoint_CmdSwitchCmd.
     * 
     * @return contentDefinition   * includes the whole content definition the attribute AddTo means:
     * add the defined content here to the content of the mentioned Priority
     * level.
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_CmdSwitchCmdContentDefinition getContentDefinition() {
        return contentDefinition;
    }


    /**
     * Sets the contentDefinition value for this InfoPoint_CmdSwitchCmd.
     * 
     * @param contentDefinition   * includes the whole content definition the attribute AddTo means:
     * add the defined content here to the content of the mentioned Priority
     * level.
     */
    public void setContentDefinition(com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_CmdSwitchCmdContentDefinition contentDefinition) {
        this.contentDefinition = contentDefinition;
    }


    /**
     * Gets the switchReason value for this InfoPoint_CmdSwitchCmd.
     * 
     * @return switchReason   * Reason which has been resulted in switch/ switch priority
     */
    public java.lang.String getSwitchReason() {
        return switchReason;
    }


    /**
     * Sets the switchReason value for this InfoPoint_CmdSwitchCmd.
     * 
     * @param switchReason   * Reason which has been resulted in switch/ switch priority
     */
    public void setSwitchReason(java.lang.String switchReason) {
        this.switchReason = switchReason;
    }


    /**
     * Gets the addInfo value for this InfoPoint_CmdSwitchCmd.
     * 
     * @return addInfo
     */
    public java.lang.String getAddInfo() {
        return addInfo;
    }


    /**
     * Sets the addInfo value for this InfoPoint_CmdSwitchCmd.
     * 
     * @param addInfo
     */
    public void setAddInfo(java.lang.String addInfo) {
        this.addInfo = addInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoPoint_CmdSwitchCmd)) return false;
        InfoPoint_CmdSwitchCmd other = (InfoPoint_CmdSwitchCmd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.start==null && other.getStart()==null) || 
             (this.start!=null &&
              this.start.equals(other.getStart()))) &&
            ((this.end==null && other.getEnd()==null) || 
             (this.end!=null &&
              this.end.equals(other.getEnd()))) &&
            ((this.contentDefinition==null && other.getContentDefinition()==null) || 
             (this.contentDefinition!=null &&
              this.contentDefinition.equals(other.getContentDefinition()))) &&
            ((this.switchReason==null && other.getSwitchReason()==null) || 
             (this.switchReason!=null &&
              this.switchReason.equals(other.getSwitchReason()))) &&
            ((this.addInfo==null && other.getAddInfo()==null) || 
             (this.addInfo!=null &&
              this.addInfo.equals(other.getAddInfo())));
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
        if (getStart() != null) {
            _hashCode += getStart().hashCode();
        }
        if (getEnd() != null) {
            _hashCode += getEnd().hashCode();
        }
        if (getContentDefinition() != null) {
            _hashCode += getContentDefinition().hashCode();
        }
        if (getSwitchReason() != null) {
            _hashCode += getSwitchReason().hashCode();
        }
        if (getAddInfo() != null) {
            _hashCode += getAddInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
