/**
 * DetailedStateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.parking;

public class DetailedStateType  implements java.io.Serializable {
    /* Unique number of the fault */
    private int faultId;

    /* Optional list of parameters */
    private java.lang.String[] params;

    /* Optional text description of the fault (mainly for the service
     * staff) */
    private java.lang.String text;

    public DetailedStateType() {
    }

    public DetailedStateType(
           int faultId,
           java.lang.String[] params,
           java.lang.String text) {
           this.faultId = faultId;
           this.params = params;
           this.text = text;
    }


    /**
     * Gets the faultId value for this DetailedStateType.
     * 
     * @return faultId   * Unique number of the fault
     */
    public int getFaultId() {
        return faultId;
    }


    /**
     * Sets the faultId value for this DetailedStateType.
     * 
     * @param faultId   * Unique number of the fault
     */
    public void setFaultId(int faultId) {
        this.faultId = faultId;
    }


    /**
     * Gets the params value for this DetailedStateType.
     * 
     * @return params   * Optional list of parameters
     */
    public java.lang.String[] getParams() {
        return params;
    }


    /**
     * Sets the params value for this DetailedStateType.
     * 
     * @param params   * Optional list of parameters
     */
    public void setParams(java.lang.String[] params) {
        this.params = params;
    }

    public java.lang.String getParams(int i) {
        return this.params[i];
    }

    public void setParams(int i, java.lang.String _value) {
        this.params[i] = _value;
    }


    /**
     * Gets the text value for this DetailedStateType.
     * 
     * @return text   * Optional text description of the fault (mainly for the service
     * staff)
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this DetailedStateType.
     * 
     * @param text   * Optional text description of the fault (mainly for the service
     * staff)
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DetailedStateType)) return false;
        DetailedStateType other = (DetailedStateType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.faultId == other.getFaultId() &&
            ((this.params==null && other.getParams()==null) || 
             (this.params!=null &&
              java.util.Arrays.equals(this.params, other.getParams()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText())));
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
        _hashCode += getFaultId();
        if (getParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParams(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
