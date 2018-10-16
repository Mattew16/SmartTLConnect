/**
 * MATRIXType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.infopoint;

public class MATRIXType  implements java.io.Serializable {
    /* definition of rectangular area with with text or image content */
    private com.siemens.sitraffic.external.infopoint.AREAType[] AREA;

    /* definition of light status (on/off, brightness in a range of
     * 0 - 99) */
    private com.siemens.sitraffic.external.infopoint.Light_type LIGHT;

    private java.lang.String id;  // attribute

    private org.apache.axis.types.NonNegativeInteger color;  // attribute

    private org.apache.axis.types.NonNegativeInteger bg_color;  // attribute

    public MATRIXType() {
    }

    public MATRIXType(
           com.siemens.sitraffic.external.infopoint.AREAType[] AREA,
           com.siemens.sitraffic.external.infopoint.Light_type LIGHT,
           java.lang.String id,
           org.apache.axis.types.NonNegativeInteger color,
           org.apache.axis.types.NonNegativeInteger bg_color) {
           this.AREA = AREA;
           this.LIGHT = LIGHT;
           this.id = id;
           this.color = color;
           this.bg_color = bg_color;
    }


    /**
     * Gets the AREA value for this MATRIXType.
     * 
     * @return AREA   * definition of rectangular area with with text or image content
     */
    public com.siemens.sitraffic.external.infopoint.AREAType[] getAREA() {
        return AREA;
    }


    /**
     * Sets the AREA value for this MATRIXType.
     * 
     * @param AREA   * definition of rectangular area with with text or image content
     */
    public void setAREA(com.siemens.sitraffic.external.infopoint.AREAType[] AREA) {
        this.AREA = AREA;
    }

    public com.siemens.sitraffic.external.infopoint.AREAType getAREA(int i) {
        return this.AREA[i];
    }

    public void setAREA(int i, com.siemens.sitraffic.external.infopoint.AREAType _value) {
        this.AREA[i] = _value;
    }


    /**
     * Gets the LIGHT value for this MATRIXType.
     * 
     * @return LIGHT   * definition of light status (on/off, brightness in a range of
     * 0 - 99)
     */
    public com.siemens.sitraffic.external.infopoint.Light_type getLIGHT() {
        return LIGHT;
    }


    /**
     * Sets the LIGHT value for this MATRIXType.
     * 
     * @param LIGHT   * definition of light status (on/off, brightness in a range of
     * 0 - 99)
     */
    public void setLIGHT(com.siemens.sitraffic.external.infopoint.Light_type LIGHT) {
        this.LIGHT = LIGHT;
    }


    /**
     * Gets the id value for this MATRIXType.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this MATRIXType.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the color value for this MATRIXType.
     * 
     * @return color
     */
    public org.apache.axis.types.NonNegativeInteger getColor() {
        return color;
    }


    /**
     * Sets the color value for this MATRIXType.
     * 
     * @param color
     */
    public void setColor(org.apache.axis.types.NonNegativeInteger color) {
        this.color = color;
    }


    /**
     * Gets the bg_color value for this MATRIXType.
     * 
     * @return bg_color
     */
    public org.apache.axis.types.NonNegativeInteger getBg_color() {
        return bg_color;
    }


    /**
     * Sets the bg_color value for this MATRIXType.
     * 
     * @param bg_color
     */
    public void setBg_color(org.apache.axis.types.NonNegativeInteger bg_color) {
        this.bg_color = bg_color;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MATRIXType)) return false;
        MATRIXType other = (MATRIXType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AREA==null && other.getAREA()==null) || 
             (this.AREA!=null &&
              java.util.Arrays.equals(this.AREA, other.getAREA()))) &&
            ((this.LIGHT==null && other.getLIGHT()==null) || 
             (this.LIGHT!=null &&
              this.LIGHT.equals(other.getLIGHT()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
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
        if (getAREA() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAREA());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAREA(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLIGHT() != null) {
            _hashCode += getLIGHT().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
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
