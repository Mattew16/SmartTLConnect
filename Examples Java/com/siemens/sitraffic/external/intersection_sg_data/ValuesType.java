/**
 * ValuesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersection_sg_data;

public class ValuesType  implements java.io.Serializable {
    private int redtime1;  // attribute

    private int redtime2;  // attribute

    private int greentime1;  // attribute

    private int greentime2;  // attribute

    private java.lang.String sg_id;  // attribute

    private java.util.Calendar timestamp;  // attribute

    public ValuesType() {
    }

    public ValuesType(
           int redtime1,
           int redtime2,
           int greentime1,
           int greentime2,
           java.lang.String sg_id,
           java.util.Calendar timestamp) {
           this.redtime1 = redtime1;
           this.redtime2 = redtime2;
           this.greentime1 = greentime1;
           this.greentime2 = greentime2;
           this.sg_id = sg_id;
           this.timestamp = timestamp;
    }


    /**
     * Gets the redtime1 value for this ValuesType.
     * 
     * @return redtime1
     */
    public int getRedtime1() {
        return redtime1;
    }


    /**
     * Sets the redtime1 value for this ValuesType.
     * 
     * @param redtime1
     */
    public void setRedtime1(int redtime1) {
        this.redtime1 = redtime1;
    }


    /**
     * Gets the redtime2 value for this ValuesType.
     * 
     * @return redtime2
     */
    public int getRedtime2() {
        return redtime2;
    }


    /**
     * Sets the redtime2 value for this ValuesType.
     * 
     * @param redtime2
     */
    public void setRedtime2(int redtime2) {
        this.redtime2 = redtime2;
    }


    /**
     * Gets the greentime1 value for this ValuesType.
     * 
     * @return greentime1
     */
    public int getGreentime1() {
        return greentime1;
    }


    /**
     * Sets the greentime1 value for this ValuesType.
     * 
     * @param greentime1
     */
    public void setGreentime1(int greentime1) {
        this.greentime1 = greentime1;
    }


    /**
     * Gets the greentime2 value for this ValuesType.
     * 
     * @return greentime2
     */
    public int getGreentime2() {
        return greentime2;
    }


    /**
     * Sets the greentime2 value for this ValuesType.
     * 
     * @param greentime2
     */
    public void setGreentime2(int greentime2) {
        this.greentime2 = greentime2;
    }


    /**
     * Gets the sg_id value for this ValuesType.
     * 
     * @return sg_id
     */
    public java.lang.String getSg_id() {
        return sg_id;
    }


    /**
     * Sets the sg_id value for this ValuesType.
     * 
     * @param sg_id
     */
    public void setSg_id(java.lang.String sg_id) {
        this.sg_id = sg_id;
    }


    /**
     * Gets the timestamp value for this ValuesType.
     * 
     * @return timestamp
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this ValuesType.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
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
            this.redtime1 == other.getRedtime1() &&
            this.redtime2 == other.getRedtime2() &&
            this.greentime1 == other.getGreentime1() &&
            this.greentime2 == other.getGreentime2() &&
            ((this.sg_id==null && other.getSg_id()==null) || 
             (this.sg_id!=null &&
              this.sg_id.equals(other.getSg_id()))) &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp())));
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
        _hashCode += getRedtime1();
        _hashCode += getRedtime2();
        _hashCode += getGreentime1();
        _hashCode += getGreentime2();
        if (getSg_id() != null) {
            _hashCode += getSg_id().hashCode();
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
