/**
 * AccumulatedValueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;

public class AccumulatedValueType  implements java.io.Serializable {
    private java.lang.String id;

    private com.siemens.sitraffic.external.trafficdata.TimelineType timeline;

    /* level of service as values 0 to 6 (0:free), see also annotation
     * of global type losType */
    private java.lang.Integer los;

    /* predicted level of service */
    private java.lang.Integer predictedLos;

    /* Travel time in seconds */
    private org.apache.axis.types.UnsignedLong travelTime;

    /* Travel time scaled by length of object; in s/km */
    private java.lang.Double normalizedTravelTime;

    /* Predicted travel time in s */
    private org.apache.axis.types.UnsignedLong predictedTravelTime;

    /* congestion length in m */
    private org.apache.axis.types.UnsignedLong congLength;

    public AccumulatedValueType() {
    }

    public AccumulatedValueType(
           java.lang.String id,
           com.siemens.sitraffic.external.trafficdata.TimelineType timeline,
           java.lang.Integer los,
           java.lang.Integer predictedLos,
           org.apache.axis.types.UnsignedLong travelTime,
           java.lang.Double normalizedTravelTime,
           org.apache.axis.types.UnsignedLong predictedTravelTime,
           org.apache.axis.types.UnsignedLong congLength) {
           this.id = id;
           this.timeline = timeline;
           this.los = los;
           this.predictedLos = predictedLos;
           this.travelTime = travelTime;
           this.normalizedTravelTime = normalizedTravelTime;
           this.predictedTravelTime = predictedTravelTime;
           this.congLength = congLength;
    }


    /**
     * Gets the id value for this AccumulatedValueType.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this AccumulatedValueType.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the timeline value for this AccumulatedValueType.
     * 
     * @return timeline
     */
    public com.siemens.sitraffic.external.trafficdata.TimelineType getTimeline() {
        return timeline;
    }


    /**
     * Sets the timeline value for this AccumulatedValueType.
     * 
     * @param timeline
     */
    public void setTimeline(com.siemens.sitraffic.external.trafficdata.TimelineType timeline) {
        this.timeline = timeline;
    }


    /**
     * Gets the los value for this AccumulatedValueType.
     * 
     * @return los   * level of service as values 0 to 6 (0:free), see also annotation
     * of global type losType
     */
    public java.lang.Integer getLos() {
        return los;
    }


    /**
     * Sets the los value for this AccumulatedValueType.
     * 
     * @param los   * level of service as values 0 to 6 (0:free), see also annotation
     * of global type losType
     */
    public void setLos(java.lang.Integer los) {
        this.los = los;
    }


    /**
     * Gets the predictedLos value for this AccumulatedValueType.
     * 
     * @return predictedLos   * predicted level of service
     */
    public java.lang.Integer getPredictedLos() {
        return predictedLos;
    }


    /**
     * Sets the predictedLos value for this AccumulatedValueType.
     * 
     * @param predictedLos   * predicted level of service
     */
    public void setPredictedLos(java.lang.Integer predictedLos) {
        this.predictedLos = predictedLos;
    }


    /**
     * Gets the travelTime value for this AccumulatedValueType.
     * 
     * @return travelTime   * Travel time in seconds
     */
    public org.apache.axis.types.UnsignedLong getTravelTime() {
        return travelTime;
    }


    /**
     * Sets the travelTime value for this AccumulatedValueType.
     * 
     * @param travelTime   * Travel time in seconds
     */
    public void setTravelTime(org.apache.axis.types.UnsignedLong travelTime) {
        this.travelTime = travelTime;
    }


    /**
     * Gets the normalizedTravelTime value for this AccumulatedValueType.
     * 
     * @return normalizedTravelTime   * Travel time scaled by length of object; in s/km
     */
    public java.lang.Double getNormalizedTravelTime() {
        return normalizedTravelTime;
    }


    /**
     * Sets the normalizedTravelTime value for this AccumulatedValueType.
     * 
     * @param normalizedTravelTime   * Travel time scaled by length of object; in s/km
     */
    public void setNormalizedTravelTime(java.lang.Double normalizedTravelTime) {
        this.normalizedTravelTime = normalizedTravelTime;
    }


    /**
     * Gets the predictedTravelTime value for this AccumulatedValueType.
     * 
     * @return predictedTravelTime   * Predicted travel time in s
     */
    public org.apache.axis.types.UnsignedLong getPredictedTravelTime() {
        return predictedTravelTime;
    }


    /**
     * Sets the predictedTravelTime value for this AccumulatedValueType.
     * 
     * @param predictedTravelTime   * Predicted travel time in s
     */
    public void setPredictedTravelTime(org.apache.axis.types.UnsignedLong predictedTravelTime) {
        this.predictedTravelTime = predictedTravelTime;
    }


    /**
     * Gets the congLength value for this AccumulatedValueType.
     * 
     * @return congLength   * congestion length in m
     */
    public org.apache.axis.types.UnsignedLong getCongLength() {
        return congLength;
    }


    /**
     * Sets the congLength value for this AccumulatedValueType.
     * 
     * @param congLength   * congestion length in m
     */
    public void setCongLength(org.apache.axis.types.UnsignedLong congLength) {
        this.congLength = congLength;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccumulatedValueType)) return false;
        AccumulatedValueType other = (AccumulatedValueType) obj;
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
            ((this.los==null && other.getLos()==null) || 
             (this.los!=null &&
              this.los.equals(other.getLos()))) &&
            ((this.predictedLos==null && other.getPredictedLos()==null) || 
             (this.predictedLos!=null &&
              this.predictedLos.equals(other.getPredictedLos()))) &&
            ((this.travelTime==null && other.getTravelTime()==null) || 
             (this.travelTime!=null &&
              this.travelTime.equals(other.getTravelTime()))) &&
            ((this.normalizedTravelTime==null && other.getNormalizedTravelTime()==null) || 
             (this.normalizedTravelTime!=null &&
              this.normalizedTravelTime.equals(other.getNormalizedTravelTime()))) &&
            ((this.predictedTravelTime==null && other.getPredictedTravelTime()==null) || 
             (this.predictedTravelTime!=null &&
              this.predictedTravelTime.equals(other.getPredictedTravelTime()))) &&
            ((this.congLength==null && other.getCongLength()==null) || 
             (this.congLength!=null &&
              this.congLength.equals(other.getCongLength())));
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
        if (getLos() != null) {
            _hashCode += getLos().hashCode();
        }
        if (getPredictedLos() != null) {
            _hashCode += getPredictedLos().hashCode();
        }
        if (getTravelTime() != null) {
            _hashCode += getTravelTime().hashCode();
        }
        if (getNormalizedTravelTime() != null) {
            _hashCode += getNormalizedTravelTime().hashCode();
        }
        if (getPredictedTravelTime() != null) {
            _hashCode += getPredictedTravelTime().hashCode();
        }
        if (getCongLength() != null) {
            _hashCode += getCongLength().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
