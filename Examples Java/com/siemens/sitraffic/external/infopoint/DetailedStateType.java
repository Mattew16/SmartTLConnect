/**
 * DetailedStateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.infopoint;

public class DetailedStateType  implements java.io.Serializable {
    private java.lang.Object stateId;

    private java.lang.Object stateText;

    public DetailedStateType() {
    }

    public DetailedStateType(
           java.lang.Object stateId,
           java.lang.Object stateText) {
           this.stateId = stateId;
           this.stateText = stateText;
    }


    /**
     * Gets the stateId value for this DetailedStateType.
     * 
     * @return stateId
     */
    public java.lang.Object getStateId() {
        return stateId;
    }


    /**
     * Sets the stateId value for this DetailedStateType.
     * 
     * @param stateId
     */
    public void setStateId(java.lang.Object stateId) {
        this.stateId = stateId;
    }


    /**
     * Gets the stateText value for this DetailedStateType.
     * 
     * @return stateText
     */
    public java.lang.Object getStateText() {
        return stateText;
    }


    /**
     * Sets the stateText value for this DetailedStateType.
     * 
     * @param stateText
     */
    public void setStateText(java.lang.Object stateText) {
        this.stateText = stateText;
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
            ((this.stateId==null && other.getStateId()==null) || 
             (this.stateId!=null &&
              this.stateId.equals(other.getStateId()))) &&
            ((this.stateText==null && other.getStateText()==null) || 
             (this.stateText!=null &&
              this.stateText.equals(other.getStateText())));
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
        if (getStateId() != null) {
            _hashCode += getStateId().hashCode();
        }
        if (getStateText() != null) {
            _hashCode += getStateText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
