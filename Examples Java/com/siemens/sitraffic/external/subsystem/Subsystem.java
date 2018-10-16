/**
 * Subsystem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.subsystem;

public class Subsystem  implements java.io.Serializable {
    /* Objecttype: Subsystem_Descr */
    private com.siemens.sitraffic.external.global.Description[] descr;

    /* Objecttype: Subsystem_Data */
    private com.siemens.sitraffic.external.subsystem.SubsystemDataType[] data;

    public Subsystem() {
    }

    public Subsystem(
           com.siemens.sitraffic.external.global.Description[] descr,
           com.siemens.sitraffic.external.subsystem.SubsystemDataType[] data) {
           this.descr = descr;
           this.data = data;
    }


    /**
     * Gets the descr value for this Subsystem.
     * 
     * @return descr   * Objecttype: Subsystem_Descr
     */
    public com.siemens.sitraffic.external.global.Description[] getDescr() {
        return descr;
    }


    /**
     * Sets the descr value for this Subsystem.
     * 
     * @param descr   * Objecttype: Subsystem_Descr
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


    /**
     * Gets the data value for this Subsystem.
     * 
     * @return data   * Objecttype: Subsystem_Data
     */
    public com.siemens.sitraffic.external.subsystem.SubsystemDataType[] getData() {
        return data;
    }


    /**
     * Sets the data value for this Subsystem.
     * 
     * @param data   * Objecttype: Subsystem_Data
     */
    public void setData(com.siemens.sitraffic.external.subsystem.SubsystemDataType[] data) {
        this.data = data;
    }

    public com.siemens.sitraffic.external.subsystem.SubsystemDataType getData(int i) {
        return this.data[i];
    }

    public void setData(int i, com.siemens.sitraffic.external.subsystem.SubsystemDataType _value) {
        this.data[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Subsystem)) return false;
        Subsystem other = (Subsystem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descr==null && other.getDescr()==null) || 
             (this.descr!=null &&
              java.util.Arrays.equals(this.descr, other.getDescr()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              java.util.Arrays.equals(this.data, other.getData())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

}
