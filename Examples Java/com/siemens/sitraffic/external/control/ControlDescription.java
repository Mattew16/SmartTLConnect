/**
 * ControlDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.control;

public class ControlDescription  extends com.siemens.sitraffic.external.global.Description  implements java.io.Serializable {
    private com.siemens.sitraffic.external.control.SituationValueType[] definedSituationValue;

    public ControlDescription() {
    }

    public ControlDescription(
           java.lang.String id,
           java.lang.String name,
           java.lang.String descriptionText,
           java.lang.String[] rel_Ids,
           java.lang.String type,
           java.lang.String subtype,
           java.lang.String subsystem,
           com.siemens.sitraffic.external.global.LocationType location,
           java.lang.String addInfo,
           java.lang.String category,
           com.siemens.sitraffic.external.global.ServiceExtension[] serviceInfo,
           com.siemens.sitraffic.external.control.SituationValueType[] definedSituationValue) {
        super(
            id,
            name,
            descriptionText,
            rel_Ids,
            type,
            subtype,
            subsystem,
            location,
            addInfo,
            category,
            serviceInfo);
        this.definedSituationValue = definedSituationValue;
    }


    /**
     * Gets the definedSituationValue value for this ControlDescription.
     * 
     * @return definedSituationValue
     */
    public com.siemens.sitraffic.external.control.SituationValueType[] getDefinedSituationValue() {
        return definedSituationValue;
    }


    /**
     * Sets the definedSituationValue value for this ControlDescription.
     * 
     * @param definedSituationValue
     */
    public void setDefinedSituationValue(com.siemens.sitraffic.external.control.SituationValueType[] definedSituationValue) {
        this.definedSituationValue = definedSituationValue;
    }

    public com.siemens.sitraffic.external.control.SituationValueType getDefinedSituationValue(int i) {
        return this.definedSituationValue[i];
    }

    public void setDefinedSituationValue(int i, com.siemens.sitraffic.external.control.SituationValueType _value) {
        this.definedSituationValue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ControlDescription)) return false;
        ControlDescription other = (ControlDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.definedSituationValue==null && other.getDefinedSituationValue()==null) || 
             (this.definedSituationValue!=null &&
              java.util.Arrays.equals(this.definedSituationValue, other.getDefinedSituationValue())));
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
        if (getDefinedSituationValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefinedSituationValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefinedSituationValue(), i);
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
