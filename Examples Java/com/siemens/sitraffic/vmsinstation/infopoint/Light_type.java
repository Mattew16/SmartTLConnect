/**
 * Light_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;

public class Light_type  implements java.io.Serializable {
    /* true = on, false = off */
    private com.siemens.sitraffic.vmsinstation.infopoint.Light_typeSWITCH SWITCH;

    /* opt. 0 .. 99 */
    private org.apache.axis.types.UnsignedByte BRIGHTNESS;

    private java.lang.Boolean inverse;  // attribute

    public Light_type() {
    }

    public Light_type(
           com.siemens.sitraffic.vmsinstation.infopoint.Light_typeSWITCH SWITCH,
           org.apache.axis.types.UnsignedByte BRIGHTNESS,
           java.lang.Boolean inverse) {
           this.SWITCH = SWITCH;
           this.BRIGHTNESS = BRIGHTNESS;
           this.inverse = inverse;
    }


    /**
     * Gets the SWITCH value for this Light_type.
     * 
     * @return SWITCH   * true = on, false = off
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.Light_typeSWITCH getSWITCH() {
        return SWITCH;
    }


    /**
     * Sets the SWITCH value for this Light_type.
     * 
     * @param SWITCH   * true = on, false = off
     */
    public void setSWITCH(com.siemens.sitraffic.vmsinstation.infopoint.Light_typeSWITCH SWITCH) {
        this.SWITCH = SWITCH;
    }


    /**
     * Gets the BRIGHTNESS value for this Light_type.
     * 
     * @return BRIGHTNESS   * opt. 0 .. 99
     */
    public org.apache.axis.types.UnsignedByte getBRIGHTNESS() {
        return BRIGHTNESS;
    }


    /**
     * Sets the BRIGHTNESS value for this Light_type.
     * 
     * @param BRIGHTNESS   * opt. 0 .. 99
     */
    public void setBRIGHTNESS(org.apache.axis.types.UnsignedByte BRIGHTNESS) {
        this.BRIGHTNESS = BRIGHTNESS;
    }


    /**
     * Gets the inverse value for this Light_type.
     * 
     * @return inverse
     */
    public java.lang.Boolean getInverse() {
        return inverse;
    }


    /**
     * Sets the inverse value for this Light_type.
     * 
     * @param inverse
     */
    public void setInverse(java.lang.Boolean inverse) {
        this.inverse = inverse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Light_type)) return false;
        Light_type other = (Light_type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SWITCH==null && other.getSWITCH()==null) || 
             (this.SWITCH!=null &&
              this.SWITCH.equals(other.getSWITCH()))) &&
            ((this.BRIGHTNESS==null && other.getBRIGHTNESS()==null) || 
             (this.BRIGHTNESS!=null &&
              this.BRIGHTNESS.equals(other.getBRIGHTNESS()))) &&
            ((this.inverse==null && other.getInverse()==null) || 
             (this.inverse!=null &&
              this.inverse.equals(other.getInverse())));
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
        if (getSWITCH() != null) {
            _hashCode += getSWITCH().hashCode();
        }
        if (getBRIGHTNESS() != null) {
            _hashCode += getBRIGHTNESS().hashCode();
        }
        if (getInverse() != null) {
            _hashCode += getInverse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
