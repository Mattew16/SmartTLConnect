/**
 * SignalProgramType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class SignalProgramType  implements java.io.Serializable {
    /* 0 ... 255
     * 0 means none specified */
    private short spNr;

    public SignalProgramType() {
    }

    public SignalProgramType(
           short spNr) {
           this.spNr = spNr;
    }


    /**
     * Gets the spNr value for this SignalProgramType.
     * 
     * @return spNr   * 0 ... 255
     * 0 means none specified
     */
    public short getSpNr() {
        return spNr;
    }


    /**
     * Sets the spNr value for this SignalProgramType.
     * 
     * @param spNr   * 0 ... 255
     * 0 means none specified
     */
    public void setSpNr(short spNr) {
        this.spNr = spNr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignalProgramType)) return false;
        SignalProgramType other = (SignalProgramType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.spNr == other.getSpNr();
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
        _hashCode += getSpNr();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
