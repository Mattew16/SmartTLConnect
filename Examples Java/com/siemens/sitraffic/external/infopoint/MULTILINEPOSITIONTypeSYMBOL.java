/**
 * MULTILINEPOSITIONTypeSYMBOL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.infopoint;

public class MULTILINEPOSITIONTypeSYMBOL  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;

    private org.apache.axis.types.NonNegativeInteger color;  // attribute

    private org.apache.axis.types.NonNegativeInteger bg_color;  // attribute

    public MULTILINEPOSITIONTypeSYMBOL() {
    }

    // Simple Types must have a String constructor
    public MULTILINEPOSITIONTypeSYMBOL(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this MULTILINEPOSITIONTypeSYMBOL.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this MULTILINEPOSITIONTypeSYMBOL.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }


    /**
     * Gets the color value for this MULTILINEPOSITIONTypeSYMBOL.
     * 
     * @return color
     */
    public org.apache.axis.types.NonNegativeInteger getColor() {
        return color;
    }


    /**
     * Sets the color value for this MULTILINEPOSITIONTypeSYMBOL.
     * 
     * @param color
     */
    public void setColor(org.apache.axis.types.NonNegativeInteger color) {
        this.color = color;
    }


    /**
     * Gets the bg_color value for this MULTILINEPOSITIONTypeSYMBOL.
     * 
     * @return bg_color
     */
    public org.apache.axis.types.NonNegativeInteger getBg_color() {
        return bg_color;
    }


    /**
     * Sets the bg_color value for this MULTILINEPOSITIONTypeSYMBOL.
     * 
     * @param bg_color
     */
    public void setBg_color(org.apache.axis.types.NonNegativeInteger bg_color) {
        this.bg_color = bg_color;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MULTILINEPOSITIONTypeSYMBOL)) return false;
        MULTILINEPOSITIONTypeSYMBOL other = (MULTILINEPOSITIONTypeSYMBOL) obj;
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
            ((this.color==null && other.getColor()==null) || 
             (this.color!=null &&
              this.color.equals(other.getColor()))) &&
            ((this.bg_color==null && other.getBg_color()==null) || 
             (this.bg_color!=null &&
              this.bg_color.equals(other.getBg_color())));
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
        if (getColor() != null) {
            _hashCode += getColor().hashCode();
        }
        if (getBg_color() != null) {
            _hashCode += getBg_color().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
