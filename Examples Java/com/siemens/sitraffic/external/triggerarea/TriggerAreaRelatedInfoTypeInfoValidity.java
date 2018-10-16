/**
 * TriggerAreaRelatedInfoTypeInfoValidity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.triggerarea;

public class TriggerAreaRelatedInfoTypeInfoValidity  implements java.io.Serializable {
    private java.util.Calendar from;

    private java.util.Calendar to;

    public TriggerAreaRelatedInfoTypeInfoValidity() {
    }

    public TriggerAreaRelatedInfoTypeInfoValidity(
           java.util.Calendar from,
           java.util.Calendar to) {
           this.from = from;
           this.to = to;
    }


    /**
     * Gets the from value for this TriggerAreaRelatedInfoTypeInfoValidity.
     * 
     * @return from
     */
    public java.util.Calendar getFrom() {
        return from;
    }


    /**
     * Sets the from value for this TriggerAreaRelatedInfoTypeInfoValidity.
     * 
     * @param from
     */
    public void setFrom(java.util.Calendar from) {
        this.from = from;
    }


    /**
     * Gets the to value for this TriggerAreaRelatedInfoTypeInfoValidity.
     * 
     * @return to
     */
    public java.util.Calendar getTo() {
        return to;
    }


    /**
     * Sets the to value for this TriggerAreaRelatedInfoTypeInfoValidity.
     * 
     * @param to
     */
    public void setTo(java.util.Calendar to) {
        this.to = to;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TriggerAreaRelatedInfoTypeInfoValidity)) return false;
        TriggerAreaRelatedInfoTypeInfoValidity other = (TriggerAreaRelatedInfoTypeInfoValidity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo())));
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
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
