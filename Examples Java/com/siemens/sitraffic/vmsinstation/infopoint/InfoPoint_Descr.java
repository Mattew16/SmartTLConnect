/**
 * InfoPoint_Descr.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;

public class InfoPoint_Descr  implements java.io.Serializable {
    private com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DescrDescr descr;

    public InfoPoint_Descr() {
    }

    public InfoPoint_Descr(
           com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DescrDescr descr) {
           this.descr = descr;
    }


    /**
     * Gets the descr value for this InfoPoint_Descr.
     * 
     * @return descr
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DescrDescr getDescr() {
        return descr;
    }


    /**
     * Sets the descr value for this InfoPoint_Descr.
     * 
     * @param descr
     */
    public void setDescr(com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DescrDescr descr) {
        this.descr = descr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoPoint_Descr)) return false;
        InfoPoint_Descr other = (InfoPoint_Descr) obj;
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
              this.descr.equals(other.getDescr())));
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
            _hashCode += getDescr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
