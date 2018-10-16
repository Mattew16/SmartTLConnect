/**
 * ValidityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficmessages;

public class ValidityType  implements java.io.Serializable {
    private java.util.Calendar from;

    /* not set in case of undefined end */
    private java.util.Calendar until;

    private com.siemens.sitraffic.external.trafficmessages.ValidityTypeKind kind;  // attribute

    public ValidityType() {
    }

    public ValidityType(
           java.util.Calendar from,
           java.util.Calendar until,
           com.siemens.sitraffic.external.trafficmessages.ValidityTypeKind kind) {
           this.from = from;
           this.until = until;
           this.kind = kind;
    }


    /**
     * Gets the from value for this ValidityType.
     * 
     * @return from
     */
    public java.util.Calendar getFrom() {
        return from;
    }


    /**
     * Sets the from value for this ValidityType.
     * 
     * @param from
     */
    public void setFrom(java.util.Calendar from) {
        this.from = from;
    }


    /**
     * Gets the until value for this ValidityType.
     * 
     * @return until   * not set in case of undefined end
     */
    public java.util.Calendar getUntil() {
        return until;
    }


    /**
     * Sets the until value for this ValidityType.
     * 
     * @param until   * not set in case of undefined end
     */
    public void setUntil(java.util.Calendar until) {
        this.until = until;
    }


    /**
     * Gets the kind value for this ValidityType.
     * 
     * @return kind
     */
    public com.siemens.sitraffic.external.trafficmessages.ValidityTypeKind getKind() {
        return kind;
    }


    /**
     * Sets the kind value for this ValidityType.
     * 
     * @param kind
     */
    public void setKind(com.siemens.sitraffic.external.trafficmessages.ValidityTypeKind kind) {
        this.kind = kind;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidityType)) return false;
        ValidityType other = (ValidityType) obj;
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
            ((this.until==null && other.getUntil()==null) || 
             (this.until!=null &&
              this.until.equals(other.getUntil()))) &&
            ((this.kind==null && other.getKind()==null) || 
             (this.kind!=null &&
              this.kind.equals(other.getKind())));
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
        if (getUntil() != null) {
            _hashCode += getUntil().hashCode();
        }
        if (getKind() != null) {
            _hashCode += getKind().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
