/**
 * PICTURETypeRENDERED.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;

public class PICTURETypeRENDERED  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private byte[] _value;

    private java.lang.String id;  // attribute

    private com.siemens.sitraffic.vmsinstation.infopoint.PICTURETypeRENDEREDImgtype imgtype;  // attribute

    public PICTURETypeRENDERED() {
    }

    // Simple Types must have a String constructor
    public PICTURETypeRENDERED(byte[] _value) {
        this._value = _value;
    }
    public PICTURETypeRENDERED(java.lang.String _value) {
        this._value = org.apache.axis.encoding.Base64.decode(_value);
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value == null ? null : org.apache.axis.encoding.Base64.encode(_value);
    }


    /**
     * Gets the _value value for this PICTURETypeRENDERED.
     * 
     * @return _value
     */
    public byte[] get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this PICTURETypeRENDERED.
     * 
     * @param _value
     */
    public void set_value(byte[] _value) {
        this._value = _value;
    }


    /**
     * Gets the id value for this PICTURETypeRENDERED.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this PICTURETypeRENDERED.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the imgtype value for this PICTURETypeRENDERED.
     * 
     * @return imgtype
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.PICTURETypeRENDEREDImgtype getImgtype() {
        return imgtype;
    }


    /**
     * Sets the imgtype value for this PICTURETypeRENDERED.
     * 
     * @param imgtype
     */
    public void setImgtype(com.siemens.sitraffic.vmsinstation.infopoint.PICTURETypeRENDEREDImgtype imgtype) {
        this.imgtype = imgtype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PICTURETypeRENDERED)) return false;
        PICTURETypeRENDERED other = (PICTURETypeRENDERED) obj;
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
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.imgtype==null && other.getImgtype()==null) || 
             (this.imgtype!=null &&
              this.imgtype.equals(other.getImgtype())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getImgtype() != null) {
            _hashCode += getImgtype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
