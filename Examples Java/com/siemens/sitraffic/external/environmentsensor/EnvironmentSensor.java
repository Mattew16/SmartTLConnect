/**
 * EnvironmentSensor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.environmentsensor;

public class EnvironmentSensor  implements java.io.Serializable {
    /* Objekttype: EnvironmentSensor_Data */
    private com.siemens.sitraffic.external.environmentsensor.DataType[] data;

    /* Objekttype: EnvironmentSensor_Descr */
    private com.siemens.sitraffic.external.global.Description[] descr;

    public EnvironmentSensor() {
    }

    public EnvironmentSensor(
           com.siemens.sitraffic.external.environmentsensor.DataType[] data,
           com.siemens.sitraffic.external.global.Description[] descr) {
           this.data = data;
           this.descr = descr;
    }


    /**
     * Gets the data value for this EnvironmentSensor.
     * 
     * @return data   * Objekttype: EnvironmentSensor_Data
     */
    public com.siemens.sitraffic.external.environmentsensor.DataType[] getData() {
        return data;
    }


    /**
     * Sets the data value for this EnvironmentSensor.
     * 
     * @param data   * Objekttype: EnvironmentSensor_Data
     */
    public void setData(com.siemens.sitraffic.external.environmentsensor.DataType[] data) {
        this.data = data;
    }

    public com.siemens.sitraffic.external.environmentsensor.DataType getData(int i) {
        return this.data[i];
    }

    public void setData(int i, com.siemens.sitraffic.external.environmentsensor.DataType _value) {
        this.data[i] = _value;
    }


    /**
     * Gets the descr value for this EnvironmentSensor.
     * 
     * @return descr   * Objekttype: EnvironmentSensor_Descr
     */
    public com.siemens.sitraffic.external.global.Description[] getDescr() {
        return descr;
    }


    /**
     * Sets the descr value for this EnvironmentSensor.
     * 
     * @param descr   * Objekttype: EnvironmentSensor_Descr
     */
    public void setDescr(com.siemens.sitraffic.external.global.Description[] descr) {
        this.descr = descr;
    }

    public com.siemens.sitraffic.external.global.Description getDescr(int i) {
        return this.descr[i];
    }

    public void setDescr(int i, com.siemens.sitraffic.external.global.Description _value) {
        this.descr[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnvironmentSensor)) return false;
        EnvironmentSensor other = (EnvironmentSensor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              java.util.Arrays.equals(this.data, other.getData()))) &&
            ((this.descr==null && other.getDescr()==null) || 
             (this.descr!=null &&
              java.util.Arrays.equals(this.descr, other.getDescr())));
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
        if (getData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescr(), i);
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
