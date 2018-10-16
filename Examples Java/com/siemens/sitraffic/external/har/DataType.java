/**
 * DataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.har;

public class DataType  implements java.io.Serializable {
    /* Shortname or ID of object */
    private java.lang.String id;

    /* Beacon flag */
    private boolean beacon;

    /* Active List */
    private com.siemens.sitraffic.external.har.DataTypeList list;

    /* 0 - o.k.
     * 1 - n.o.k.
     * 2 - p.o.k.
     * 3 - unknown */
    private java.lang.Integer state;

    public DataType() {
    }

    public DataType(
           java.lang.String id,
           boolean beacon,
           com.siemens.sitraffic.external.har.DataTypeList list,
           java.lang.Integer state) {
           this.id = id;
           this.beacon = beacon;
           this.list = list;
           this.state = state;
    }


    /**
     * Gets the id value for this DataType.
     * 
     * @return id   * Shortname or ID of object
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this DataType.
     * 
     * @param id   * Shortname or ID of object
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the beacon value for this DataType.
     * 
     * @return beacon   * Beacon flag
     */
    public boolean isBeacon() {
        return beacon;
    }


    /**
     * Sets the beacon value for this DataType.
     * 
     * @param beacon   * Beacon flag
     */
    public void setBeacon(boolean beacon) {
        this.beacon = beacon;
    }


    /**
     * Gets the list value for this DataType.
     * 
     * @return list   * Active List
     */
    public com.siemens.sitraffic.external.har.DataTypeList getList() {
        return list;
    }


    /**
     * Sets the list value for this DataType.
     * 
     * @param list   * Active List
     */
    public void setList(com.siemens.sitraffic.external.har.DataTypeList list) {
        this.list = list;
    }


    /**
     * Gets the state value for this DataType.
     * 
     * @return state   * 0 - o.k.
     * 1 - n.o.k.
     * 2 - p.o.k.
     * 3 - unknown
     */
    public java.lang.Integer getState() {
        return state;
    }


    /**
     * Sets the state value for this DataType.
     * 
     * @param state   * 0 - o.k.
     * 1 - n.o.k.
     * 2 - p.o.k.
     * 3 - unknown
     */
    public void setState(java.lang.Integer state) {
        this.state = state;
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
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.beacon == other.isBeacon() &&
            ((this.list==null && other.getList()==null) || 
             (this.list!=null &&
              this.list.equals(other.getList()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState())));
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
