/**
 * SituationValueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.control;

public class SituationValueType  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedLong value;  // attribute

    private java.lang.String descr;  // attribute

    private byte[] bmp;  // attribute

    public SituationValueType() {
    }

    public SituationValueType(
           org.apache.axis.types.UnsignedLong value,
           java.lang.String descr,
           byte[] bmp) {
           this.value = value;
           this.descr = descr;
           this.bmp = bmp;
    }


    /**
     * Gets the value value for this SituationValueType.
     * 
     * @return value
     */
    public org.apache.axis.types.UnsignedLong getValue() {
        return value;
    }


    /**
     * Sets the value value for this SituationValueType.
     * 
     * @param value
     */
    public void setValue(org.apache.axis.types.UnsignedLong value) {
        this.value = value;
    }


    /**
     * Gets the descr value for this SituationValueType.
     * 
     * @return descr
     */
    public java.lang.String getDescr() {
        return descr;
    }


    /**
     * Sets the descr value for this SituationValueType.
     * 
     * @param descr
     */
    public void setDescr(java.lang.String descr) {
        this.descr = descr;
    }


    /**
     * Gets the bmp value for this SituationValueType.
     * 
     * @return bmp
     */
    public byte[] getBmp() {
        return bmp;
    }


    /**
     * Sets the bmp value for this SituationValueType.
     * 
     * @param bmp
     */
    public void setBmp(byte[] bmp) {
        this.bmp = bmp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SituationValueType)) return false;
        SituationValueType other = (SituationValueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.descr==null && other.getDescr()==null) || 
             (this.descr!=null &&
              this.descr.equals(other.getDescr()))) &&
            ((this.bmp==null && other.getBmp()==null) || 
             (this.bmp!=null &&
              java.util.Arrays.equals(this.bmp, other.getBmp())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getDescr() != null) {
            _hashCode += getDescr().hashCode();
        }
        if (getBmp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBmp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBmp(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
