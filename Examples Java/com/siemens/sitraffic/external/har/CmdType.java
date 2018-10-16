/**
 * CmdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.har;

public class CmdType  implements java.io.Serializable {
    /* Shortname or ID of object */
    private java.lang.String id;

    /* Beacon flag */
    private boolean beacon;

    /* Active List */
    private com.siemens.sitraffic.external.har.CmdTypeList list;

    public CmdType() {
    }

    public CmdType(
           java.lang.String id,
           boolean beacon,
           com.siemens.sitraffic.external.har.CmdTypeList list) {
           this.id = id;
           this.beacon = beacon;
           this.list = list;
    }


    /**
     * Gets the id value for this CmdType.
     * 
     * @return id   * Shortname or ID of object
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this CmdType.
     * 
     * @param id   * Shortname or ID of object
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the beacon value for this CmdType.
     * 
     * @return beacon   * Beacon flag
     */
    public boolean isBeacon() {
        return beacon;
    }


    /**
     * Sets the beacon value for this CmdType.
     * 
     * @param beacon   * Beacon flag
     */
    public void setBeacon(boolean beacon) {
        this.beacon = beacon;
    }


    /**
     * Gets the list value for this CmdType.
     * 
     * @return list   * Active List
     */
    public com.siemens.sitraffic.external.har.CmdTypeList getList() {
        return list;
    }


    /**
     * Sets the list value for this CmdType.
     * 
     * @param list   * Active List
     */
    public void setList(com.siemens.sitraffic.external.har.CmdTypeList list) {
        this.list = list;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmdType)) return false;
        CmdType other = (CmdType) obj;
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
            this.beacon == other.isBeacon() &&
            ((this.list==null && other.getList()==null) || 
             (this.list!=null &&
              this.list.equals(other.getList())));
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
        _hashCode += (isBeacon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getList() != null) {
            _hashCode += getList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
