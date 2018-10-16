/**
 * InfoPoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.infopoint;

public class InfoPoint  implements java.io.Serializable {
    /* Objecttype: InfoPoint_Descr */
    private com.siemens.sitraffic.external.global.Description[] descr;

    /* Objecttype: InfoPoint_Data */
    private com.siemens.sitraffic.external.infopoint.InfoPoint_Data[] data;

    /* Objecttype: InfoPoint_Cmd */
    private com.siemens.sitraffic.external.infopoint.InfoPoint_Cmd[] cmd;

    public InfoPoint() {
    }

    public InfoPoint(
           com.siemens.sitraffic.external.global.Description[] descr,
           com.siemens.sitraffic.external.infopoint.InfoPoint_Data[] data,
           com.siemens.sitraffic.external.infopoint.InfoPoint_Cmd[] cmd) {
           this.descr = descr;
           this.data = data;
           this.cmd = cmd;
    }


    /**
     * Gets the descr value for this InfoPoint.
     * 
     * @return descr   * Objecttype: InfoPoint_Descr
     */
    public com.siemens.sitraffic.external.global.Description[] getDescr() {
        return descr;
    }


    /**
     * Sets the descr value for this InfoPoint.
     * 
     * @param descr   * Objecttype: InfoPoint_Descr
     */
    public void setDescr(com.siemens.sitraffic.external.global.Description[] descr) {
        this.descr = descr;
    }

    public com.siemens.sitraffic.external.global.Description getDescr(int i) {
        return this.descr[i];
    }

    public void setDescr(int i, com.siemens.sitraffic.external.global.Description _value) {
        this.descr[i] = _value;
    }


    /**
     * Gets the data value for this InfoPoint.
     * 
     * @return data   * Objecttype: InfoPoint_Data
     */
    public com.siemens.sitraffic.external.infopoint.InfoPoint_Data[] getData() {
        return data;
    }


    /**
     * Sets the data value for this InfoPoint.
     * 
     * @param data   * Objecttype: InfoPoint_Data
     */
    public void setData(com.siemens.sitraffic.external.infopoint.InfoPoint_Data[] data) {
        this.data = data;
    }

    public com.siemens.sitraffic.external.infopoint.InfoPoint_Data getData(int i) {
        return this.data[i];
    }

    public void setData(int i, com.siemens.sitraffic.external.infopoint.InfoPoint_Data _value) {
        this.data[i] = _value;
    }


    /**
     * Gets the cmd value for this InfoPoint.
     * 
     * @return cmd   * Objecttype: InfoPoint_Cmd
     */
    public com.siemens.sitraffic.external.infopoint.InfoPoint_Cmd[] getCmd() {
        return cmd;
    }


    /**
     * Sets the cmd value for this InfoPoint.
     * 
     * @param cmd   * Objecttype: InfoPoint_Cmd
     */
    public void setCmd(com.siemens.sitraffic.external.infopoint.InfoPoint_Cmd[] cmd) {
        this.cmd = cmd;
    }

    public com.siemens.sitraffic.external.infopoint.InfoPoint_Cmd getCmd(int i) {
        return this.cmd[i];
    }

    public void setCmd(int i, com.siemens.sitraffic.external.infopoint.InfoPoint_Cmd _value) {
        this.cmd[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoPoint)) return false;
        InfoPoint other = (InfoPoint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descr==null && other.getDescr()==null) || 
             (this.descr!=null &&
              java.util.Arrays.equals(this.descr, other.getDescr()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              java.util.Arrays.equals(this.data, other.getData()))) &&
            ((this.cmd==null && other.getCmd()==null) || 
             (this.cmd!=null &&
              java.util.Arrays.equals(this.cmd, other.getCmd())));
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
        if (getDescr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmd() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmd());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmd(), i);
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
