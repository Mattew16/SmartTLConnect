/**
 * TrafficInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.infopoint;


/**
 * Content type for the programmable info signs.
 */
public class TrafficInfo  implements java.io.Serializable {
    private com.siemens.sitraffic.external.infopoint.PROGRAM PROGRAM;

    public TrafficInfo() {
    }

    public TrafficInfo(
           com.siemens.sitraffic.external.infopoint.PROGRAM PROGRAM) {
           this.PROGRAM = PROGRAM;
    }


    /**
     * Gets the PROGRAM value for this TrafficInfo.
     * 
     * @return PROGRAM
     */
    public com.siemens.sitraffic.external.infopoint.PROGRAM getPROGRAM() {
        return PROGRAM;
    }


    /**
     * Sets the PROGRAM value for this TrafficInfo.
     * 
     * @param PROGRAM
     */
    public void setPROGRAM(com.siemens.sitraffic.external.infopoint.PROGRAM PROGRAM) {
        this.PROGRAM = PROGRAM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficInfo)) return false;
        TrafficInfo other = (TrafficInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PROGRAM==null && other.getPROGRAM()==null) || 
             (this.PROGRAM!=null &&
              this.PROGRAM.equals(other.getPROGRAM())));
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
        if (getPROGRAM() != null) {
            _hashCode += getPROGRAM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
