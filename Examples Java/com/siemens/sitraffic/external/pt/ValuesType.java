/**
 * ValuesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.pt;

public class ValuesType  implements java.io.Serializable {
    private int count;  // attribute

    private int speed;  // attribute

    private int accurancy;  // attribute

    private com.siemens.sitraffic.external.pt.ValuesTypePtType ptType;  // attribute

    public ValuesType() {
    }

    public ValuesType(
           int count,
           int speed,
           int accurancy,
           com.siemens.sitraffic.external.pt.ValuesTypePtType ptType) {
           this.count = count;
           this.speed = speed;
           this.accurancy = accurancy;
           this.ptType = ptType;
    }


    /**
     * Gets the count value for this ValuesType.
     * 
     * @return count
     */
    public int getCount() {
        return count;
    }


    /**
     * Sets the count value for this ValuesType.
     * 
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }


    /**
     * Gets the speed value for this ValuesType.
     * 
     * @return speed
     */
    public int getSpeed() {
        return speed;
    }


    /**
     * Sets the speed value for this ValuesType.
     * 
     * @param speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }


    /**
     * Gets the accurancy value for this ValuesType.
     * 
     * @return accurancy
     */
    public int getAccurancy() {
        return accurancy;
    }


    /**
     * Sets the accurancy value for this ValuesType.
     * 
     * @param accurancy
     */
    public void setAccurancy(int accurancy) {
        this.accurancy = accurancy;
    }


    /**
     * Gets the ptType value for this ValuesType.
     * 
     * @return ptType
     */
    public com.siemens.sitraffic.external.pt.ValuesTypePtType getPtType() {
        return ptType;
    }


    /**
     * Sets the ptType value for this ValuesType.
     * 
     * @param ptType
     */
    public void setPtType(com.siemens.sitraffic.external.pt.ValuesTypePtType ptType) {
        this.ptType = ptType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValuesType)) return false;
        ValuesType other = (ValuesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.count == other.getCount() &&
            this.speed == other.getSpeed() &&
            this.accurancy == other.getAccurancy() &&
            ((this.ptType==null && other.getPtType()==null) || 
             (this.ptType!=null &&
              this.ptType.equals(other.getPtType())));
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
        _hashCode += getCount();
        _hashCode += getSpeed();
        _hashCode += getAccurancy();
        if (getPtType() != null) {
            _hashCode += getPtType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
