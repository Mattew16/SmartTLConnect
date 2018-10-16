/**
 * MessageTypeState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.operatingmessages;

public class MessageTypeState  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private org.apache.axis.types.NMToken _value;

    private com.siemens.sitraffic.external.operatingmessages.MessageTypeStateMatchcode matchcode;  // attribute

    public MessageTypeState() {
    }

    // Simple Types must have a String constructor
    public MessageTypeState(org.apache.axis.types.NMToken _value) {
        this._value = _value;
    }
    public MessageTypeState(java.lang.String _value) {
        this._value = new org.apache.axis.types.NMToken(_value);
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value == null ? null : _value.toString();
    }


    /**
     * Gets the _value value for this MessageTypeState.
     * 
     * @return _value
     */
    public org.apache.axis.types.NMToken get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this MessageTypeState.
     * 
     * @param _value
     */
    public void set_value(org.apache.axis.types.NMToken _value) {
        this._value = _value;
    }


    /**
     * Gets the matchcode value for this MessageTypeState.
     * 
     * @return matchcode
     */
    public com.siemens.sitraffic.external.operatingmessages.MessageTypeStateMatchcode getMatchcode() {
        return matchcode;
    }


    /**
     * Sets the matchcode value for this MessageTypeState.
     * 
     * @param matchcode
     */
    public void setMatchcode(com.siemens.sitraffic.external.operatingmessages.MessageTypeStateMatchcode matchcode) {
        this.matchcode = matchcode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageTypeState)) return false;
        MessageTypeState other = (MessageTypeState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              this._value.equals(other.get_value()))) &&
            ((this.matchcode==null && other.getMatchcode()==null) || 
             (this.matchcode!=null &&
              this.matchcode.equals(other.getMatchcode())));
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
        if (get_value() != null) {
            _hashCode += get_value().hashCode();
        }
        if (getMatchcode() != null) {
            _hashCode += getMatchcode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
