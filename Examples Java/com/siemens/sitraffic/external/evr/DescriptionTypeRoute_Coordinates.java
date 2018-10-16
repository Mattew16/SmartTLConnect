/**
 * DescriptionTypeRoute_Coordinates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.evr;

public class DescriptionTypeRoute_Coordinates  implements java.io.Serializable {
    private com.siemens.sitraffic.external.global.CoType[] co;

    public DescriptionTypeRoute_Coordinates() {
    }

    public DescriptionTypeRoute_Coordinates(
           com.siemens.sitraffic.external.global.CoType[] co) {
           this.co = co;
    }


    /**
     * Gets the co value for this DescriptionTypeRoute_Coordinates.
     * 
     * @return co
     */
    public com.siemens.sitraffic.external.global.CoType[] getCo() {
        return co;
    }


    /**
     * Sets the co value for this DescriptionTypeRoute_Coordinates.
     * 
     * @param co
     */
    public void setCo(com.siemens.sitraffic.external.global.CoType[] co) {
        this.co = co;
    }

    public com.siemens.sitraffic.external.global.CoType getCo(int i) {
        return this.co[i];
    }

    public void setCo(int i, com.siemens.sitraffic.external.global.CoType _value) {
        this.co[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescriptionTypeRoute_Coordinates)) return false;
        DescriptionTypeRoute_Coordinates other = (DescriptionTypeRoute_Coordinates) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.co==null && other.getCo()==null) || 
             (this.co!=null &&
              java.util.Arrays.equals(this.co, other.getCo())));
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
        if (getCo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCo(), i);
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
