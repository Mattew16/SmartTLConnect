/**
 * FeaturesTypeProjSpecificMod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class FeaturesTypeProjSpecificMod  implements java.io.Serializable {
    private int number;  // attribute

    private java.lang.String name;  // attribute

    private boolean isState;  // attribute

    public FeaturesTypeProjSpecificMod() {
    }

    public FeaturesTypeProjSpecificMod(
           int number,
           java.lang.String name,
           boolean isState) {
           this.number = number;
           this.name = name;
           this.isState = isState;
    }


    /**
     * Gets the number value for this FeaturesTypeProjSpecificMod.
     * 
     * @return number
     */
    public int getNumber() {
        return number;
    }


    /**
     * Sets the number value for this FeaturesTypeProjSpecificMod.
     * 
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }


    /**
     * Gets the name value for this FeaturesTypeProjSpecificMod.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this FeaturesTypeProjSpecificMod.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the isState value for this FeaturesTypeProjSpecificMod.
     * 
     * @return isState
     */
    public boolean isIsState() {
        return isState;
    }


    /**
     * Sets the isState value for this FeaturesTypeProjSpecificMod.
     * 
     * @param isState
     */
    public void setIsState(boolean isState) {
        this.isState = isState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeaturesTypeProjSpecificMod)) return false;
        FeaturesTypeProjSpecificMod other = (FeaturesTypeProjSpecificMod) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.number == other.getNumber() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.isState == other.isIsState();
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
        _hashCode += getNumber();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += (isIsState() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
