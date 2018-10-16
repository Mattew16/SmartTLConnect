/**
 * SGTimesTypeSg_values.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersection_sg_data;

public class SGTimesTypeSg_values  extends com.siemens.sitraffic.external.intersection_sg_data.ValuesType  implements java.io.Serializable {
    public SGTimesTypeSg_values() {
    }

    public SGTimesTypeSg_values(
           int redtime1,
           int redtime2,
           int greentime1,
           int greentime2,
           java.lang.String sg_id,
           java.util.Calendar timestamp) {
        super(
            redtime1,
            redtime2,
            greentime1,
            greentime2,
            sg_id,
            timestamp);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SGTimesTypeSg_values)) return false;
        SGTimesTypeSg_values other = (SGTimesTypeSg_values) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

}
