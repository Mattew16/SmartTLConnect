/**
 * StateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;


/**
 * describes the state of the object:
 * 0 - o.k.
 * 1 - n.o.k.
 * 2 - p.o.k.
 * 3 - unknown
 */
public class StateType  implements java.io.Serializable {
    private java.lang.Integer stateId;  // attribute

    public StateType() {
    }

    public StateType(
           java.lang.Integer stateId) {
           this.stateId = stateId;
    }


    /**
     * Gets the stateId value for this StateType.
     * 
     * @return stateId
     */
    public java.lang.Integer getStateId() {
        return stateId;
    }


    /**
     * Sets the stateId value for this StateType.
     * 
     * @param stateId
     */
    public void setStateId(java.lang.Integer stateId) {
        this.stateId = stateId;
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
            ((this.stateId==null && other.getStateId()==null) || 
             (this.stateId!=null &&
              this.stateId.equals(other.getStateId())));
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
        if (getStateId() != null) {
            _hashCode += getStateId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
