/**
 * LosValueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;

public class LosValueType  implements java.io.Serializable {
    private java.lang.String id;

    private com.siemens.sitraffic.external.trafficdata.TimelineType timeline;

    /* level of service as values 0 to 6 (0:free), see also annotation
     * of global type losType */
    private int los;

    /* predicted level of service */
    private java.lang.Integer predictedLos;

    /* timestamp of predicted LOS in UTC (end) */
    private java.util.Calendar predictionTimestamp;

    /* qualityfactor in % */
    private java.lang.Integer quality;

    /* Number of used measurements scaled to 1h (unit=[1/h]) */
    private java.lang.Double measurementCount;

    public LosValueType() {
    }

    public LosValueType(
           java.lang.String id,
           com.siemens.sitraffic.external.trafficdata.TimelineType timeline,
           int los,
           java.lang.Integer predictedLos,
           java.util.Calendar predictionTimestamp,
           java.lang.Integer quality,
           java.lang.Double measurementCount) {
           this.id = id;
           this.timeline = timeline;
           this.los = los;
           this.predictedLos = predictedLos;
           this.predictionTimestamp = predictionTimestamp;
           this.quality = quality;
           this.measurementCount = measurementCount;
    }


    /**
     * Gets the id value for this LosValueType.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this LosValueType.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the timeline value for this LosValueType.
     * 
     * @return timeline
     */
    public com.siemens.sitraffic.external.trafficdata.TimelineType getTimeline() {
        return timeline;
    }


    /**
     * Sets the timeline value for this LosValueType.
     * 
     * @param timeline
     */
    public void setTimeline(com.siemens.sitraffic.external.trafficdata.TimelineType timeline) {
        this.timeline = timeline;
    }


    /**
     * Gets the los value for this LosValueType.
     * 
     * @return los   * level of service as values 0 to 6 (0:free), see also annotation
     * of global type losType
     */
    public int getLos() {
        return los;
    }


    /**
     * Sets the los value for this LosValueType.
     * 
     * @param los   * level of service as values 0 to 6 (0:free), see also annotation
     * of global type losType
     */
    public void setLos(int los) {
        this.los = los;
    }


    /**
     * Gets the predictedLos value for this LosValueType.
     * 
     * @return predictedLos   * predicted level of service
     */
    public java.lang.Integer getPredictedLos() {
        return predictedLos;
    }


    /**
     * Sets the predictedLos value for this LosValueType.
     * 
     * @param predictedLos   * predicted level of service
     */
    public void setPredictedLos(java.lang.Integer predictedLos) {
        this.predictedLos = predictedLos;
    }


    /**
     * Gets the predictionTimestamp value for this LosValueType.
     * 
     * @return predictionTimestamp   * timestamp of predicted LOS in UTC (end)
     */
    public java.util.Calendar getPredictionTimestamp() {
        return predictionTimestamp;
    }


    /**
     * Sets the predictionTimestamp value for this LosValueType.
     * 
     * @param predictionTimestamp   * timestamp of predicted LOS in UTC (end)
     */
    public void setPredictionTimestamp(java.util.Calendar predictionTimestamp) {
        this.predictionTimestamp = predictionTimestamp;
    }


    /**
     * Gets the quality value for this LosValueType.
     * 
     * @return quality   * qualityfactor in %
     */
    public java.lang.Integer getQuality() {
        return quality;
    }


    /**
     * Sets the quality value for this LosValueType.
     * 
     * @param quality   * qualityfactor in %
     */
    public void setQuality(java.lang.Integer quality) {
        this.quality = quality;
    }


    /**
     * Gets the measurementCount value for this LosValueType.
     * 
     * @return measurementCount   * Number of used measurements scaled to 1h (unit=[1/h])
     */
    public java.lang.Double getMeasurementCount() {
        return measurementCount;
    }


    /**
     * Sets the measurementCount value for this LosValueType.
     * 
     * @param measurementCount   * Number of used measurements scaled to 1h (unit=[1/h])
     */
    public void setMeasurementCount(java.lang.Double measurementCount) {
        this.measurementCount = measurementCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LosValueType)) return false;
        LosValueType other = (LosValueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.timeline==null && other.getTimeline()==null) || 
             (this.timeline!=null &&
              this.timeline.equals(other.getTimeline()))) &&
            this.los == other.getLos() &&
            ((this.predictedLos==null && other.getPredictedLos()==null) || 
             (this.predictedLos!=null &&
              this.predictedLos.equals(other.getPredictedLos()))) &&
            ((this.predictionTimestamp==null && other.getPredictionTimestamp()==null) || 
             (this.predictionTimestamp!=null &&
              this.predictionTimestamp.equals(other.getPredictionTimestamp()))) &&
            ((this.quality==null && other.getQuality()==null) || 
             (this.quality!=null &&
              this.quality.equals(other.getQuality()))) &&
            ((this.measurementCount==null && other.getMeasurementCount()==null) || 
             (this.measurementCount!=null &&
              this.measurementCount.equals(other.getMeasurementCount())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getTimeline() != null) {
            _hashCode += getTimeline().hashCode();
        }
        _hashCode += getLos();
        if (getPredictedLos() != null) {
            _hashCode += getPredictedLos().hashCode();
        }
        if (getPredictionTimestamp() != null) {
            _hashCode += getPredictionTimestamp().hashCode();
        }
        if (getQuality() != null) {
            _hashCode += getQuality().hashCode();
        }
        if (getMeasurementCount() != null) {
            _hashCode += getMeasurementCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
