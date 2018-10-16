/**
 * IsFeatureType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class IsFeatureType  implements java.io.Serializable {
    private java.lang.String identifier;

    private com.siemens.sitraffic.external.intersectionStates_andCommands.SignalPlansType[] signalPlans;

    private com.siemens.sitraffic.external.intersectionStates_andCommands.FeaturesType features;

    public IsFeatureType() {
    }

    public IsFeatureType(
           java.lang.String identifier,
           com.siemens.sitraffic.external.intersectionStates_andCommands.SignalPlansType[] signalPlans,
           com.siemens.sitraffic.external.intersectionStates_andCommands.FeaturesType features) {
           this.identifier = identifier;
           this.signalPlans = signalPlans;
           this.features = features;
    }


    /**
     * Gets the identifier value for this IsFeatureType.
     * 
     * @return identifier
     */
    public java.lang.String getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this IsFeatureType.
     * 
     * @param identifier
     */
    public void setIdentifier(java.lang.String identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the signalPlans value for this IsFeatureType.
     * 
     * @return signalPlans
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.SignalPlansType[] getSignalPlans() {
        return signalPlans;
    }


    /**
     * Sets the signalPlans value for this IsFeatureType.
     * 
     * @param signalPlans
     */
    public void setSignalPlans(com.siemens.sitraffic.external.intersectionStates_andCommands.SignalPlansType[] signalPlans) {
        this.signalPlans = signalPlans;
    }

    public com.siemens.sitraffic.external.intersectionStates_andCommands.SignalPlansType getSignalPlans(int i) {
        return this.signalPlans[i];
    }

    public void setSignalPlans(int i, com.siemens.sitraffic.external.intersectionStates_andCommands.SignalPlansType _value) {
        this.signalPlans[i] = _value;
    }


    /**
     * Gets the features value for this IsFeatureType.
     * 
     * @return features
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.FeaturesType getFeatures() {
        return features;
    }


    /**
     * Sets the features value for this IsFeatureType.
     * 
     * @param features
     */
    public void setFeatures(com.siemens.sitraffic.external.intersectionStates_andCommands.FeaturesType features) {
        this.features = features;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsFeatureType)) return false;
        IsFeatureType other = (IsFeatureType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.signalPlans==null && other.getSignalPlans()==null) || 
             (this.signalPlans!=null &&
              java.util.Arrays.equals(this.signalPlans, other.getSignalPlans()))) &&
            ((this.features==null && other.getFeatures()==null) || 
             (this.features!=null &&
              this.features.equals(other.getFeatures())));
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
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getSignalPlans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSignalPlans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSignalPlans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeatures() != null) {
            _hashCode += getFeatures().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
