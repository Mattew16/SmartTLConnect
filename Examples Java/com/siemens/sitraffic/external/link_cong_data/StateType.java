/**
 * StateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.link_cong_data;


/**
 * describes the state of the object:
 * 0 - o.k.
 * 1 - n.o.k.
 * 2 - p.o.k.
 * 3 - unknown
 */
public class StateType  implements java.io.Serializable {
    private int statedId;  // attribute

    public StateType() {
    }

    public StateType(
           int statedId) {
           this.statedId = statedId;
    }


    /**
     * Gets the statedId value for this StateType.
     * 
     * @return statedId
     */
    public int getStatedId() {
        return statedId;
    }


    /**
     * Sets the statedId value for this StateType.
     * 
     * @param statedId
     */
    public void setStatedId(int statedId) {
        this.statedId = statedId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StateType)) return false;
        StateType other = (StateType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.statedId == other.getStatedId();
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
        _hashCode += getStatedId();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
