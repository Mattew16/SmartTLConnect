/**
 * SGTimesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersection_sg_data;

public class SGTimesType  implements java.io.Serializable {
    private java.lang.String id;

    /* Original Timestamp of the described values (end of measurement-nearly
     * the entry time in case of no transmission delay). No local time zone
     * will be added to the date and time format, so pure UTC is used at
     * the interfaces. */
    private com.siemens.sitraffic.external.intersection_sg_data.TimelineType timeline;

    private com.siemens.sitraffic.external.intersection_sg_data.SGTimesTypeSg_values[] sg_values;

    private int tx;

    public SGTimesType() {
    }

    public SGTimesType(
           java.lang.String id,
           com.siemens.sitraffic.external.intersection_sg_data.TimelineType timeline,
           com.siemens.sitraffic.external.intersection_sg_data.SGTimesTypeSg_values[] sg_values,
           int tx) {
           this.id = id;
           this.timeline = timeline;
           this.sg_values = sg_values;
           this.tx = tx;
    }


    /**
     * Gets the id value for this SGTimesType.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this SGTimesType.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the timeline value for this SGTimesType.
     * 
     * @return timeline   * Original Timestamp of the described values (end of measurement-nearly
     * the entry time in case of no transmission delay). No local time zone
     * will be added to the date and time format, so pure UTC is used at
     * the interfaces.
     */
    public com.siemens.sitraffic.external.intersection_sg_data.TimelineType getTimeline() {
        return timeline;
    }


    /**
     * Sets the timeline value for this SGTimesType.
     * 
     * @param timeline   * Original Timestamp of the described values (end of measurement-nearly
     * the entry time in case of no transmission delay). No local time zone
     * will be added to the date and time format, so pure UTC is used at
     * the interfaces.
     */
    public void setTimeline(com.siemens.sitraffic.external.intersection_sg_data.TimelineType timeline) {
        this.timeline = timeline;
    }


    /**
     * Gets the sg_values value for this SGTimesType.
     * 
     * @return sg_values
     */
    public com.siemens.sitraffic.external.intersection_sg_data.SGTimesTypeSg_values[] getSg_values() {
        return sg_values;
    }


    /**
     * Sets the sg_values value for this SGTimesType.
     * 
     * @param sg_values
     */
    public void setSg_values(com.siemens.sitraffic.external.intersection_sg_data.SGTimesTypeSg_values[] sg_values) {
        this.sg_values = sg_values;
    }

    public com.siemens.sitraffic.external.intersection_sg_data.SGTimesTypeSg_values getSg_values(int i) {
        return this.sg_values[i];
    }

    public void setSg_values(int i, com.siemens.sitraffic.external.intersection_sg_data.SGTimesTypeSg_values _value) {
        this.sg_values[i] = _value;
    }


    /**
     * Gets the tx value for this SGTimesType.
     * 
     * @return tx
     */
    public int getTx() {
        return tx;
    }


    /**
     * Sets the tx value for this SGTimesType.
     * 
     * @param tx
     */
    public void setTx(int tx) {
        this.tx = tx;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SGTimesType)) return false;
        SGTimesType other = (SGTimesType) obj;
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
            ((this.sg_values==null && other.getSg_values()==null) || 
             (this.sg_values!=null &&
              java.util.Arrays.equals(this.sg_values, other.getSg_values()))) &&
            this.tx == other.getTx();
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
        if (getSg_values() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSg_values());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSg_values(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getTx();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
