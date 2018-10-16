/**
 * MessageTypeParamParamId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.operatingmessages;

public class MessageTypeParamParamId  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private org.apache.axis.types.NMToken _value;

    private org.apache.axis.types.NMToken classify;  // attribute

    public MessageTypeParamParamId() {
    }

    // Simple Types must have a String constructor
    public MessageTypeParamParamId(org.apache.axis.types.NMToken _value) {
        this._value = _value;
    }
    public MessageTypeParamParamId(java.lang.String _value) {
        this._value = new org.apache.axis.types.NMToken(_value);
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value == null ? null : _value.toString();
    }


    /**
     * Gets the _value value for this MessageTypeParamParamId.
     * 
     * @return _value
     */
    public org.apache.axis.types.NMToken get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this MessageTypeParamParamId.
     * 
     * @param _value
     */
    public void set_value(org.apache.axis.types.NMToken _value) {
        this._value = _value;
    }


    /**
     * Gets the classify value for this MessageTypeParamParamId.
     * 
     * @return classify
     */
    public org.apache.axis.types.NMToken getClassify() {
        return classify;
    }


    /**
     * Sets the classify value for this MessageTypeParamParamId.
     * 
     * @param classify
     */
    public void setClassify(org.apache.axis.types.NMToken classify) {
        this.classify = classify;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageTypeParamParamId)) return false;
        MessageTypeParamParamId other = (MessageTypeParamParamId) obj;
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
            ((this.classify==null && other.getClassify()==null) || 
             (this.classify!=null &&
              this.classify.equals(other.getClassify())));
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
        if (getClassify() != null) {
            _hashCode += getClassify().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
