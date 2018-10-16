/**
 * PredictionLinkType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;

public class PredictionLinkType  extends com.siemens.sitraffic.external.trafficdata.CommonLinkType  implements java.io.Serializable {
    private com.siemens.sitraffic.external.trafficdata.PredictionLinkTypePredictionLinkValue[] predictionLinkValue;

    public PredictionLinkType() {
    }

    public PredictionLinkType(
           long linkId,
           long fromNodeId,
           com.siemens.sitraffic.external.trafficdata.TimelineType timeline,
           com.siemens.sitraffic.external.trafficdata.PredictionLinkTypePredictionLinkValue[] predictionLinkValue) {
        super(
            linkId,
            fromNodeId,
            timeline);
        this.predictionLinkValue = predictionLinkValue;
    }


    /**
     * Gets the predictionLinkValue value for this PredictionLinkType.
     * 
     * @return predictionLinkValue
     */
    public com.siemens.sitraffic.external.trafficdata.PredictionLinkTypePredictionLinkValue[] getPredictionLinkValue() {
        return predictionLinkValue;
    }


    /**
     * Sets the predictionLinkValue value for this PredictionLinkType.
     * 
     * @param predictionLinkValue
     */
    public void setPredictionLinkValue(com.siemens.sitraffic.external.trafficdata.PredictionLinkTypePredictionLinkValue[] predictionLinkValue) {
        this.predictionLinkValue = predictionLinkValue;
    }

    public com.siemens.sitraffic.external.trafficdata.PredictionLinkTypePredictionLinkValue getPredictionLinkValue(int i) {
        return this.predictionLinkValue[i];
    }

    public void setPredictionLinkValue(int i, com.siemens.sitraffic.external.trafficdata.PredictionLinkTypePredictionLinkValue _value) {
        this.predictionLinkValue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PredictionLinkType)) return false;
        PredictionLinkType other = (PredictionLinkType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.predictionLinkValue==null && other.getPredictionLinkValue()==null) || 
             (this.predictionLinkValue!=null &&
              java.util.Arrays.equals(this.predictionLinkValue, other.getPredictionLinkValue())));
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
        if (getPredictionLinkValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPredictionLinkValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPredictionLinkValue(), i);
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
