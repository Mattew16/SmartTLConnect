/**
 * CoordType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.evr;

public class CoordType  implements java.io.Serializable {
    private double coord_X;

    private double coord_Y;

    public CoordType() {
    }

    public CoordType(
           double coord_X,
           double coord_Y) {
           this.coord_X = coord_X;
           this.coord_Y = coord_Y;
    }


    /**
     * Gets the coord_X value for this CoordType.
     * 
     * @return coord_X
     */
    public double getCoord_X() {
        return coord_X;
    }


    /**
     * Sets the coord_X value for this CoordType.
     * 
     * @param coord_X
     */
    public void setCoord_X(double coord_X) {
        this.coord_X = coord_X;
    }


    /**
     * Gets the coord_Y value for this CoordType.
     * 
     * @return coord_Y
     */
    public double getCoord_Y() {
        return coord_Y;
    }


    /**
     * Sets the coord_Y value for this CoordType.
     * 
     * @param coord_Y
     */
    public void setCoord_Y(double coord_Y) {
        this.coord_Y = coord_Y;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CoordType)) return false;
        CoordType other = (CoordType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.coord_X == other.getCoord_X() &&
            this.coord_Y == other.getCoord_Y();
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
        _hashCode += new Double(getCoord_X()).hashCode();
        _hashCode += new Double(getCoord_Y()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
