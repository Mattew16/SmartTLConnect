/**
 * LocationTypeCo_descriptionCo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficmessages;

public class LocationTypeCo_descriptionCo  implements java.io.Serializable {
    private double x;

    private double y;

    public LocationTypeCo_descriptionCo() {
    }

    public LocationTypeCo_descriptionCo(
           double x,
           double y) {
           this.x = x;
           this.y = y;
    }


    /**
     * Gets the x value for this LocationTypeCo_descriptionCo.
     * 
     * @return x
     */
    public double getX() {
        return x;
    }


    /**
     * Sets the x value for this LocationTypeCo_descriptionCo.
     * 
     * @param x
     */
    public void setX(double x) {
        this.x = x;
    }


    /**
     * Gets the y value for this LocationTypeCo_descriptionCo.
     * 
     * @return y
     */
    public double getY() {
        return y;
    }


    /**
     * Sets the y value for this LocationTypeCo_descriptionCo.
     * 
     * @param y
     */
    public void setY(double y) {
        this.y = y;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationTypeCo_descriptionCo)) return false;
        LocationTypeCo_descriptionCo other = (LocationTypeCo_descriptionCo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.x == other.getX() &&
            this.y == other.getY();
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
        _hashCode += new Double(getX()).hashCode();
        _hashCode += new Double(getY()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
