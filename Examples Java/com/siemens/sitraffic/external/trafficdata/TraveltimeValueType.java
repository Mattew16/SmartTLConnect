/**
 * TraveltimeValueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;

public class TraveltimeValueType  implements java.io.Serializable {
    private java.lang.String id;

    private com.siemens.sitraffic.external.trafficdata.TimelineType timeline;

    /* Travel time in seconds */
    private java.lang.Double travelTime;

    /* Travelspeed in km/h */
    private java.lang.Double travelSpeed;

    /* Predicted travel time in s */
    private java.lang.Double predictedTravelTime;

    /* Predicted travel speed in km/h */
    private java.lang.Double predictedTravelSpeed;

    /* timestamp of predicted traveltime / travelspeed in UTC (end) */
    private java.util.Calendar predictionTimestamp;

    /* congestion length in m */
    private java.lang.Double congLength;

    /* qualityfactor in % */
    private java.lang.Integer quality;

    /* Number of used measurements scaled to 1h (unit=[1/h]) */
    private java.lang.Double measurementCount;

    public TraveltimeValueType() {
    }

    public TraveltimeValueType(
           java.lang.String id,
           com.siemens.sitraffic.external.trafficdata.TimelineType timeline,
           java.lang.Double travelTime,
           java.lang.Double travelSpeed,
           java.lang.Double predictedTravelTime,
           java.lang.Double predictedTravelSpeed,
           java.util.Calendar predictionTimestamp,
           java.lang.Double congLength,
           java.lang.Integer quality,
           java.lang.Double measurementCount) {
           this.id = id;
           this.timeline = timeline;
           this.travelTime = travelTime;
           this.travelSpeed = travelSpeed;
           this.predictedTravelTime = predictedTravelTime;
           this.predictedTravelSpeed = predictedTravelSpeed;
           this.predictionTimestamp = predictionTimestamp;
           this.congLength = congLength;
           this.quality = quality;
           this.measurementCount = measurementCount;
    }


    /**
     * Gets the id value for this TraveltimeValueType.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this TraveltimeValueType.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the timeline value for this TraveltimeValueType.
     * 
     * @return timeline
     */
    public com.siemens.sitraffic.external.trafficdata.TimelineType getTimeline() {
        return timeline;
    }


    /**
     * Sets the timeline value for this TraveltimeValueType.
     * 
     * @param timeline
     */
    public void setTimeline(com.siemens.sitraffic.external.trafficdata.TimelineType timeline) {
        this.timeline = timeline;
    }


    /**
     * Gets the travelTime value for this TraveltimeValueType.
     * 
     * @return travelTime   * Travel time in seconds
     */
    public java.lang.Double getTravelTime() {
        return travelTime;
    }


    /**
     * Sets the travelTime value for this TraveltimeValueType.
     * 
     * @param travelTime   * Travel time in seconds
     */
    public void setTravelTime(java.lang.Double travelTime) {
        this.travelTime = travelTime;
    }


    /**
     * Gets the travelSpeed value for this TraveltimeValueType.
     * 
     * @return travelSpeed   * Travelspeed in km/h
     */
    public java.lang.Double getTravelSpeed() {
        return travelSpeed;
    }


    /**
     * Sets the travelSpeed value for this TraveltimeValueType.
     * 
     * @param travelSpeed   * Travelspeed in km/h
     */
    public void setTravelSpeed(java.lang.Double travelSpeed) {
        this.travelSpeed = travelSpeed;
    }


    /**
     * Gets the predictedTravelTime value for this TraveltimeValueType.
     * 
     * @return predictedTravelTime   * Predicted travel time in s
     */
    public java.lang.Double getPredictedTravelTime() {
        return predictedTravelTime;
    }


    /**
     * Sets the predictedTravelTime value for this TraveltimeValueType.
     * 
     * @param predictedTravelTime   * Predicted travel time in s
     */
    public void setPredictedTravelTime(java.lang.Double predictedTravelTime) {
        this.predictedTravelTime = predictedTravelTime;
    }


    /**
     * Gets the predictedTravelSpeed value for this TraveltimeValueType.
     * 
     * @return predictedTravelSpeed   * Predicted travel speed in km/h
     */
    public java.lang.Double getPredictedTravelSpeed() {
        return predictedTravelSpeed;
    }


    /**
     * Sets the predictedTravelSpeed value for this TraveltimeValueType.
     * 
     * @param predictedTravelSpeed   * Predicted travel speed in km/h
     */
    public void setPredictedTravelSpeed(java.lang.Double predictedTravelSpeed) {
        this.predictedTravelSpeed = predictedTravelSpeed;
    }


    /**
     * Gets the predictionTimestamp value for this TraveltimeValueType.
     * 
     * @return predictionTimestamp   * timestamp of predicted traveltime / travelspeed in UTC (end)
     */
    public java.util.Calendar getPredictionTimestamp() {
        return predictionTimestamp;
    }


    /**
     * Sets the predictionTimestamp value for this TraveltimeValueType.
     * 
     * @param predictionTimestamp   * timestamp of predicted traveltime / travelspeed in UTC (end)
     */
    public void setPredictionTimestamp(java.util.Calendar predictionTimestamp) {
        this.predictionTimestamp = predictionTimestamp;
    }


    /**
     * Gets the congLength value for this TraveltimeValueType.
     * 
     * @return congLength   * congestion length in m
     */
    public java.lang.Double getCongLength() {
        return congLength;
    }


    /**
     * Sets the congLength value for this TraveltimeValueType.
     * 
     * @param congLength   * congestion length in m
     */
    public void setCongLength(java.lang.Double congLength) {
        this.congLength = congLength;
    }


    /**
     * Gets the quality value for this TraveltimeValueType.
     * 
     * @return quality   * qualityfactor in %
     */
    public java.lang.Integer getQuality() {
        return quality;
    }


    /**
     * Sets the quality value for this TraveltimeValueType.
     * 
     * @param quality   * qualityfactor in %
     */
    public void setQuality(java.lang.Integer quality) {
        this.quality = quality;
    }


    /**
     * Gets the measurementCount value for this TraveltimeValueType.
     * 
     * @return measurementCount   * Number of used measurements scaled to 1h (unit=[1/h])
     */
    public java.lang.Double getMeasurementCount() {
        return measurementCount;
    }


    /**
     * Sets the measurementCount value for this TraveltimeValueType.
     * 
     * @param measurementCount   * Number of used measurements scaled to 1h (unit=[1/h])
     */
    public void setMeasurementCount(java.lang.Double measurementCount) {
        this.measurementCount = measurementCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TraveltimeValueType)) return false;
        TraveltimeValueType other = (TraveltimeValueType) obj;
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
            ((this.travelTime==null && other.getTravelTime()==null) || 
             (this.travelTime!=null &&
              this.travelTime.equals(other.getTravelTime()))) &&
            ((this.travelSpeed==null && other.getTravelSpeed()==null) || 
             (this.travelSpeed!=null &&
              this.travelSpeed.equals(other.getTravelSpeed()))) &&
            ((this.predictedTravelTime==null && other.getPredictedTravelTime()==null) || 
             (this.predictedTravelTime!=null &&
              this.predictedTravelTime.equals(other.getPredictedTravelTime()))) &&
            ((this.predictedTravelSpeed==null && other.getPredictedTravelSpeed()==null) || 
             (this.predictedTravelSpeed!=null &&
              this.predictedTravelSpeed.equals(other.getPredictedTravelSpeed()))) &&
            ((this.predictionTimestamp==null && other.getPredictionTimestamp()==null) || 
             (this.predictionTimestamp!=null &&
              this.predictionTimestamp.equals(other.getPredictionTimestamp()))) &&
            ((this.congLength==null && other.getCongLength()==null) || 
             (this.congLength!=null &&
              this.congLength.equals(other.getCongLength()))) &&
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
        if (getTravelTime() != null) {
            _hashCode += getTravelTime().hashCode();
        }
        if (getTravelSpeed() != null) {
            _hashCode += getTravelSpeed().hashCode();
        }
        if (getPredictedTravelTime() != null) {
            _hashCode += getPredictedTravelTime().hashCode();
        }
        if (getPredictedTravelSpeed() != null) {
            _hashCode += getPredictedTravelSpeed().hashCode();
        }
        if (getPredictionTimestamp() != null) {
            _hashCode += getPredictionTimestamp().hashCode();
        }
        if (getCongLength() != null) {
            _hashCode += getCongLength().hashCode();
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
