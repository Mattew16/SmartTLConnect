/**
 * EposDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.parking;

public class EposDataType  extends com.siemens.sitraffic.external.parking.PdmDataType  implements java.io.Serializable {
    private com.siemens.sitraffic.external.parking.OutletType[] outlet;

    public EposDataType() {
    }

    public EposDataType(
           java.lang.String id,
           com.siemens.sitraffic.external.global.Timeline timeline,
           com.siemens.sitraffic.external.global.State state,
           com.siemens.sitraffic.external.parking.DetailedStateType[] detailedState,
           com.siemens.sitraffic.external.parking.OutletType[] outlet) {
        super(
            id,
            timeline,
            state,
            detailedState);
        this.outlet = outlet;
    }


    /**
     * Gets the outlet value for this EposDataType.
     * 
     * @return outlet
     */
    public com.siemens.sitraffic.external.parking.OutletType[] getOutlet() {
        return outlet;
    }


    /**
     * Sets the outlet value for this EposDataType.
     * 
     * @param outlet
     */
    public void setOutlet(com.siemens.sitraffic.external.parking.OutletType[] outlet) {
        this.outlet = outlet;
    }

    public com.siemens.sitraffic.external.parking.OutletType getOutlet(int i) {
        return this.outlet[i];
    }

    public void setOutlet(int i, com.siemens.sitraffic.external.parking.OutletType _value) {
        this.outlet[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EposDataType)) return false;
        EposDataType other = (EposDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.outlet==null && other.getOutlet()==null) || 
             (this.outlet!=null &&
              java.util.Arrays.equals(this.outlet, other.getOutlet())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getOutlet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutlet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutlet(), i);
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
