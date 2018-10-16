/**
 * ValuesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.link_cong_data;

public class ValuesType  implements java.io.Serializable {
    private int cong_length;  // attribute

    private int cong_length_max;  // attribute

    private int waittime;  // attribute

    private int occ;  // attribute

    private int count;  // attribute

    public ValuesType() {
    }

    public ValuesType(
           int cong_length,
           int cong_length_max,
           int waittime,
           int occ,
           int count) {
           this.cong_length = cong_length;
           this.cong_length_max = cong_length_max;
           this.waittime = waittime;
           this.occ = occ;
           this.count = count;
    }


    /**
     * Gets the cong_length value for this ValuesType.
     * 
     * @return cong_length
     */
    public int getCong_length() {
        return cong_length;
    }


    /**
     * Sets the cong_length value for this ValuesType.
     * 
     * @param cong_length
     */
    public void setCong_length(int cong_length) {
        this.cong_length = cong_length;
    }


    /**
     * Gets the cong_length_max value for this ValuesType.
     * 
     * @return cong_length_max
     */
    public int getCong_length_max() {
        return cong_length_max;
    }


    /**
     * Sets the cong_length_max value for this ValuesType.
     * 
     * @param cong_length_max
     */
    public void setCong_length_max(int cong_length_max) {
        this.cong_length_max = cong_length_max;
    }


    /**
     * Gets the waittime value for this ValuesType.
     * 
     * @return waittime
     */
    public int getWaittime() {
        return waittime;
    }


    /**
     * Sets the waittime value for this ValuesType.
     * 
     * @param waittime
     */
    public void setWaittime(int waittime) {
        this.waittime = waittime;
    }


    /**
     * Gets the occ value for this ValuesType.
     * 
     * @return occ
     */
    public int getOcc() {
        return occ;
    }


    /**
     * Sets the occ value for this ValuesType.
     * 
     * @param occ
     */
    public void setOcc(int occ) {
        this.occ = occ;
    }


    /**
     * Gets the count value for this ValuesType.
     * 
     * @return count
     */
    public int getCount() {
        return count;
    }


    /**
     * Sets the count value for this ValuesType.
     * 
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValuesType)) return false;
        ValuesType other = (ValuesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cong_length == other.getCong_length() &&
            this.cong_length_max == other.getCong_length_max() &&
            this.waittime == other.getWaittime() &&
            this.occ == other.getOcc() &&
            this.count == other.getCount();
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
        _hashCode += getCong_length();
        _hashCode += getCong_length_max();
        _hashCode += getWaittime();
        _hashCode += getOcc();
        _hashCode += getCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
