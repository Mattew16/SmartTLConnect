/**
 * PredictionLinkTypePredictionLinkValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;

public class PredictionLinkTypePredictionLinkValue  implements java.io.Serializable {
    /* Prognosehorizont (Beginn des ersten Prognoseintervals) */
    private int predictionTime;

    /* Länge des Intervals zwischen den einzelnen predictionLinkValues
     * (in s) */
    private int predictionInterval;

    private com.siemens.sitraffic.external.trafficdata.LinkValueType[] values;

    private com.siemens.sitraffic.external.trafficdata.PredictionVehicleType vehicleClass;

    public PredictionLinkTypePredictionLinkValue() {
    }

    public PredictionLinkTypePredictionLinkValue(
           int predictionTime,
           int predictionInterval,
           com.siemens.sitraffic.external.trafficdata.LinkValueType[] values,
           com.siemens.sitraffic.external.trafficdata.PredictionVehicleType vehicleClass) {
           this.predictionTime = predictionTime;
           this.predictionInterval = predictionInterval;
           this.values = values;
           this.vehicleClass = vehicleClass;
    }


    /**
     * Gets the predictionTime value for this PredictionLinkTypePredictionLinkValue.
     * 
     * @return predictionTime   * Prognosehorizont (Beginn des ersten Prognoseintervals)
     */
    public int getPredictionTime() {
        return predictionTime;
    }


    /**
     * Sets the predictionTime value for this PredictionLinkTypePredictionLinkValue.
     * 
     * @param predictionTime   * Prognosehorizont (Beginn des ersten Prognoseintervals)
     */
    public void setPredictionTime(int predictionTime) {
        this.predictionTime = predictionTime;
    }


    /**
     * Gets the predictionInterval value for this PredictionLinkTypePredictionLinkValue.
     * 
     * @return predictionInterval   * Länge des Intervals zwischen den einzelnen predictionLinkValues
     * (in s)
     */
    public int getPredictionInterval() {
        return predictionInterval;
    }


    /**
     * Sets the predictionInterval value for this PredictionLinkTypePredictionLinkValue.
     * 
     * @param predictionInterval   * Länge des Intervals zwischen den einzelnen predictionLinkValues
     * (in s)
     */
    public void setPredictionInterval(int predictionInterval) {
        this.predictionInterval = predictionInterval;
    }


    /**
     * Gets the values value for this PredictionLinkTypePredictionLinkValue.
     * 
     * @return values
     */
    public com.siemens.sitraffic.external.trafficdata.LinkValueType[] getValues() {
        return values;
    }


    /**
     * Sets the values value for this PredictionLinkTypePredictionLinkValue.
     * 
     * @param values
     */
    public void setValues(com.siemens.sitraffic.external.trafficdata.LinkValueType[] values) {
        this.values = values;
    }

    public com.siemens.sitraffic.external.trafficdata.LinkValueType getValues(int i) {
        return this.values[i];
    }

    public void setValues(int i, com.siemens.sitraffic.external.trafficdata.LinkValueType _value) {
        this.values[i] = _value;
    }


    /**
     * Gets the vehicleClass value for this PredictionLinkTypePredictionLinkValue.
     * 
     * @return vehicleClass
     */
    public com.siemens.sitraffic.external.trafficdata.PredictionVehicleType getVehicleClass() {
        return vehicleClass;
    }


    /**
     * Sets the vehicleClass value for this PredictionLinkTypePredictionLinkValue.
     * 
     * @param vehicleClass
     */
    public void setVehicleClass(com.siemens.sitraffic.external.trafficdata.PredictionVehicleType vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PredictionLinkTypePredictionLinkValue)) return false;
        PredictionLinkTypePredictionLinkValue other = (PredictionLinkTypePredictionLinkValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.predictionTime == other.getPredictionTime() &&
            this.predictionInterval == other.getPredictionInterval() &&
            ((this.values==null && other.getValues()==null) || 
             (this.values!=null &&
              java.util.Arrays.equals(this.values, other.getValues()))) &&
            ((this.vehicleClass==null && other.getVehicleClass()==null) || 
             (this.vehicleClass!=null &&
              this.vehicleClass.equals(other.getVehicleClass())));
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
        _hashCode += getPredictionTime();
        _hashCode += getPredictionInterval();
        if (getValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVehicleClass() != null) {
            _hashCode += getVehicleClass().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
