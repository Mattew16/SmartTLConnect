/**
 * InfoPoint_Data.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;

public class InfoPoint_Data  implements java.io.Serializable {
    /* Object type:InfoPoint_Data */
    private com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataData data;

    public InfoPoint_Data() {
    }

    public InfoPoint_Data(
           com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataData data) {
           this.data = data;
    }


    /**
     * Gets the data value for this InfoPoint_Data.
     * 
     * @return data   * Object type:InfoPoint_Data
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataData getData() {
        return data;
    }


    /**
     * Sets the data value for this InfoPoint_Data.
     * 
     * @param data   * Object type:InfoPoint_Data
     */
    public void setData(com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataData data) {
        this.data = data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoPoint_Data)) return false;
        InfoPoint_Data other = (InfoPoint_Data) obj;
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
              this.data.equals(other.getData())));
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
            _hashCode += getData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
