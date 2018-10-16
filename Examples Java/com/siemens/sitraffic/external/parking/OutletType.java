/**
 * OutletType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.parking;

public class OutletType  implements java.io.Serializable {
    private int number;

    private com.siemens.sitraffic.external.parking.OutletTypeSocket[] socket;

    private boolean tiltSensor;  // attribute

    private boolean occupationSensor;  // attribute

    public OutletType() {
    }

    public OutletType(
           int number,
           com.siemens.sitraffic.external.parking.OutletTypeSocket[] socket,
           boolean tiltSensor,
           boolean occupationSensor) {
           this.number = number;
           this.socket = socket;
           this.tiltSensor = tiltSensor;
           this.occupationSensor = occupationSensor;
    }


    /**
     * Gets the number value for this OutletType.
     * 
     * @return number
     */
    public int getNumber() {
        return number;
    }


    /**
     * Sets the number value for this OutletType.
     * 
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }


    /**
     * Gets the socket value for this OutletType.
     * 
     * @return socket
     */
    public com.siemens.sitraffic.external.parking.OutletTypeSocket[] getSocket() {
        return socket;
    }


    /**
     * Sets the socket value for this OutletType.
     * 
     * @param socket
     */
    public void setSocket(com.siemens.sitraffic.external.parking.OutletTypeSocket[] socket) {
        this.socket = socket;
    }

    public com.siemens.sitraffic.external.parking.OutletTypeSocket getSocket(int i) {
        return this.socket[i];
    }

    public void setSocket(int i, com.siemens.sitraffic.external.parking.OutletTypeSocket _value) {
        this.socket[i] = _value;
    }


    /**
     * Gets the tiltSensor value for this OutletType.
     * 
     * @return tiltSensor
     */
    public boolean isTiltSensor() {
        return tiltSensor;
    }


    /**
     * Sets the tiltSensor value for this OutletType.
     * 
     * @param tiltSensor
     */
    public void setTiltSensor(boolean tiltSensor) {
        this.tiltSensor = tiltSensor;
    }


    /**
     * Gets the occupationSensor value for this OutletType.
     * 
     * @return occupationSensor
     */
    public boolean isOccupationSensor() {
        return occupationSensor;
    }


    /**
     * Sets the occupationSensor value for this OutletType.
     * 
     * @param occupationSensor
     */
    public void setOccupationSensor(boolean occupationSensor) {
        this.occupationSensor = occupationSensor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OutletType)) return false;
        OutletType other = (OutletType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.number == other.getNumber() &&
            ((this.socket==null && other.getSocket()==null) || 
             (this.socket!=null &&
              java.util.Arrays.equals(this.socket, other.getSocket()))) &&
            this.tiltSensor == other.isTiltSensor() &&
            this.occupationSensor == other.isOccupationSensor();
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
        if (getSocket() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSocket());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSocket(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isTiltSensor() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOccupationSensor() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
