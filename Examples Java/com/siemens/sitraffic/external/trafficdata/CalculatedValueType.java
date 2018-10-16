/**
 * CalculatedValueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;

public class CalculatedValueType  implements java.io.Serializable {
    private java.lang.String id;

    private com.siemens.sitraffic.external.trafficdata.TimelineType timeline;

    /* level of service as values 0 to 6 (0:free), see also annotation
     * of global type losType */
    private int los;

    public CalculatedValueType() {
    }

    public CalculatedValueType(
           java.lang.String id,
           com.siemens.sitraffic.external.trafficdata.TimelineType timeline,
           int los) {
           this.id = id;
           this.timeline = timeline;
           this.los = los;
    }


    /**
     * Gets the id value for this CalculatedValueType.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this CalculatedValueType.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the timeline value for this CalculatedValueType.
     * 
     * @return timeline
     */
    public com.siemens.sitraffic.external.trafficdata.TimelineType getTimeline() {
        return timeline;
    }


    /**
     * Sets the timeline value for this CalculatedValueType.
     * 
     * @param timeline
     */
    public void setTimeline(com.siemens.sitraffic.external.trafficdata.TimelineType timeline) {
        this.timeline = timeline;
    }


    /**
     * Gets the los value for this CalculatedValueType.
     * 
     * @return los   * level of service as values 0 to 6 (0:free), see also annotation
     * of global type losType
     */
    public int getLos() {
        return los;
    }


    /**
     * Sets the los value for this CalculatedValueType.
     * 
     * @param los   * level of service as values 0 to 6 (0:free), see also annotation
     * of global type losType
     */
    public void setLos(int los) {
        this.los = los;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalculatedValueType)) return false;
        CalculatedValueType other = (CalculatedValueType) obj;
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
            this.los == other.getLos();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

}
