/**
 * Function_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.infopoint;

public class Function_type  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;

    private java.lang.String font;  // attribute

    private org.apache.axis.types.UnsignedByte size;  // attribute

    private com.siemens.sitraffic.external.infopoint.Font_style_enum style;  // attribute

    public Function_type() {
    }

    // Simple Types must have a String constructor
    public Function_type(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this Function_type.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this Function_type.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }


    /**
     * Gets the font value for this Function_type.
     * 
     * @return font
     */
    public java.lang.String getFont() {
        return font;
    }


    /**
     * Sets the font value for this Function_type.
     * 
     * @param font
     */
    public void setFont(java.lang.String font) {
        this.font = font;
    }


    /**
     * Gets the size value for this Function_type.
     * 
     * @return size
     */
    public org.apache.axis.types.UnsignedByte getSize() {
        return size;
    }


    /**
     * Sets the size value for this Function_type.
     * 
     * @param size
     */
    public void setSize(org.apache.axis.types.UnsignedByte size) {
        this.size = size;
    }


    /**
     * Gets the style value for this Function_type.
     * 
     * @return style
     */
    public com.siemens.sitraffic.external.infopoint.Font_style_enum getStyle() {
        return style;
    }


    /**
     * Sets the style value for this Function_type.
     * 
     * @param style
     */
    public void setStyle(com.siemens.sitraffic.external.infopoint.Font_style_enum style) {
        this.style = style;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Function_type)) return false;
        Function_type other = (Function_type) obj;
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
            ((this.font==null && other.getFont()==null) || 
             (this.font!=null &&
              this.font.equals(other.getFont()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.style==null && other.getStyle()==null) || 
             (this.style!=null &&
              this.style.equals(other.getStyle())));
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
        if (getFont() != null) {
            _hashCode += getFont().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getStyle() != null) {
            _hashCode += getStyle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
