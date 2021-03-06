/**
 * TriggerAreaRelatedInfoInfoBitmap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.triggerarea;

public class TriggerAreaRelatedInfoInfoBitmap  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private byte[] _value;

    private java.lang.String type;  // attribute

    private java.lang.String signId;  // attribute

    public TriggerAreaRelatedInfoInfoBitmap() {
    }

    // Simple Types must have a String constructor
    public TriggerAreaRelatedInfoInfoBitmap(byte[] _value) {
        this._value = _value;
    }
    public TriggerAreaRelatedInfoInfoBitmap(java.lang.String _value) {
        this._value = org.apache.axis.encoding.Base64.decode(_value);
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value == null ? null : org.apache.axis.encoding.Base64.encode(_value);
    }


    /**
     * Gets the _value value for this TriggerAreaRelatedInfoInfoBitmap.
     * 
     * @return _value
     */
    public byte[] get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this TriggerAreaRelatedInfoInfoBitmap.
     * 
     * @param _value
     */
    public void set_value(byte[] _value) {
        this._value = _value;
    }


    /**
     * Gets the type value for this TriggerAreaRelatedInfoInfoBitmap.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this TriggerAreaRelatedInfoInfoBitmap.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the signId value for this TriggerAreaRelatedInfoInfoBitmap.
     * 
     * @return signId
     */
    public java.lang.String getSignId() {
        return signId;
    }


    /**
     * Sets the signId value for this TriggerAreaRelatedInfoInfoBitmap.
     * 
     * @param signId
     */
    public void setSignId(java.lang.String signId) {
        this.signId = signId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TriggerAreaRelatedInfoInfoBitmap)) return false;
        TriggerAreaRelatedInfoInfoBitmap other = (TriggerAreaRelatedInfoInfoBitmap) obj;
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
              java.util.Arrays.equals(this._value, other.get_value()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.signId==null && other.getSignId()==null) || 
             (this.signId!=null &&
              this.signId.equals(other.getSignId())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_value());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_value(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getSignId() != null) {
            _hashCode += getSignId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
