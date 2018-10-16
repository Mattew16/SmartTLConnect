/**
 * CurrentLinkType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;

public class CurrentLinkType  extends com.siemens.sitraffic.external.trafficdata.CommonLinkType  implements java.io.Serializable {
    private com.siemens.sitraffic.external.trafficdata.CurrentLinkTypeCurrentLinkValue[] currentLinkValue;

    public CurrentLinkType() {
    }

    public CurrentLinkType(
           long linkId,
           long fromNodeId,
           com.siemens.sitraffic.external.trafficdata.TimelineType timeline,
           com.siemens.sitraffic.external.trafficdata.CurrentLinkTypeCurrentLinkValue[] currentLinkValue) {
        super(
            linkId,
            fromNodeId,
            timeline);
        this.currentLinkValue = currentLinkValue;
    }


    /**
     * Gets the currentLinkValue value for this CurrentLinkType.
     * 
     * @return currentLinkValue
     */
    public com.siemens.sitraffic.external.trafficdata.CurrentLinkTypeCurrentLinkValue[] getCurrentLinkValue() {
        return currentLinkValue;
    }


    /**
     * Sets the currentLinkValue value for this CurrentLinkType.
     * 
     * @param currentLinkValue
     */
    public void setCurrentLinkValue(com.siemens.sitraffic.external.trafficdata.CurrentLinkTypeCurrentLinkValue[] currentLinkValue) {
        this.currentLinkValue = currentLinkValue;
    }

    public com.siemens.sitraffic.external.trafficdata.CurrentLinkTypeCurrentLinkValue getCurrentLinkValue(int i) {
        return this.currentLinkValue[i];
    }

    public void setCurrentLinkValue(int i, com.siemens.sitraffic.external.trafficdata.CurrentLinkTypeCurrentLinkValue _value) {
        this.currentLinkValue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurrentLinkType)) return false;
        CurrentLinkType other = (CurrentLinkType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.currentLinkValue==null && other.getCurrentLinkValue()==null) || 
             (this.currentLinkValue!=null &&
              java.util.Arrays.equals(this.currentLinkValue, other.getCurrentLinkValue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCurrentLinkValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrentLinkValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrentLinkValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
