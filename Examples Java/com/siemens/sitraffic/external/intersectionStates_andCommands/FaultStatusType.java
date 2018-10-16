/**
 * FaultStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class FaultStatusType  implements java.io.Serializable {
    /* a uniqque number of the fault status */
    private short textNr;

    /* parameters of the faultStatus (e.g. lamp number or detector
     * number) */
    private java.lang.String[] params;

    /* the fault status text */
    private java.lang.String text;

    public FaultStatusType() {
    }

    public FaultStatusType(
           short textNr,
           java.lang.String[] params,
           java.lang.String text) {
           this.textNr = textNr;
           this.params = params;
           this.text = text;
    }


    /**
     * Gets the textNr value for this FaultStatusType.
     * 
     * @return textNr   * a uniqque number of the fault status
     */
    public short getTextNr() {
        return textNr;
    }


    /**
     * Sets the textNr value for this FaultStatusType.
     * 
     * @param textNr   * a uniqque number of the fault status
     */
    public void setTextNr(short textNr) {
        this.textNr = textNr;
    }


    /**
     * Gets the params value for this FaultStatusType.
     * 
     * @return params   * parameters of the faultStatus (e.g. lamp number or detector
     * number)
     */
    public java.lang.String[] getParams() {
        return params;
    }


    /**
     * Sets the params value for this FaultStatusType.
     * 
     * @param params   * parameters of the faultStatus (e.g. lamp number or detector
     * number)
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
     * Gets the text value for this FaultStatusType.
     * 
     * @return text   * the fault status text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this FaultStatusType.
     * 
     * @param text   * the fault status text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FaultStatusType)) return false;
        FaultStatusType other = (FaultStatusType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.textNr == other.getTextNr() &&
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
        _hashCode += getTextNr();
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
