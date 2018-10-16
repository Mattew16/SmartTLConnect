/**
 * InfoPoint_DataDetailedStates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.infopoint;

public class InfoPoint_DataDetailedStates  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedShort stateId;  // attribute

    private java.lang.String stateText;  // attribute

    public InfoPoint_DataDetailedStates() {
    }

    public InfoPoint_DataDetailedStates(
           org.apache.axis.types.UnsignedShort stateId,
           java.lang.String stateText) {
           this.stateId = stateId;
           this.stateText = stateText;
    }


    /**
     * Gets the stateId value for this InfoPoint_DataDetailedStates.
     * 
     * @return stateId
     */
    public org.apache.axis.types.UnsignedShort getStateId() {
        return stateId;
    }


    /**
     * Sets the stateId value for this InfoPoint_DataDetailedStates.
     * 
     * @param stateId
     */
    public void setStateId(org.apache.axis.types.UnsignedShort stateId) {
        this.stateId = stateId;
    }


    /**
     * Gets the stateText value for this InfoPoint_DataDetailedStates.
     * 
     * @return stateText
     */
    public java.lang.String getStateText() {
        return stateText;
    }


    /**
     * Sets the stateText value for this InfoPoint_DataDetailedStates.
     * 
     * @param stateText
     */
    public void setStateText(java.lang.String stateText) {
        this.stateText = stateText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoPoint_DataDetailedStates)) return false;
        InfoPoint_DataDetailedStates other = (InfoPoint_DataDetailedStates) obj;
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
