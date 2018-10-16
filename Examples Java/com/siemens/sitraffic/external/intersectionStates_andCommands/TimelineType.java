/**
 * TimelineType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class TimelineType  implements java.io.Serializable {
    private java.util.Calendar start;

    private java.util.Calendar end;

    public TimelineType() {
    }

    public TimelineType(
           java.util.Calendar start,
           java.util.Calendar end) {
           this.start = start;
           this.end = end;
    }


    /**
     * Gets the start value for this TimelineType.
     * 
     * @return start
     */
    public java.util.Calendar getStart() {
        return start;
    }


    /**
     * Sets the start value for this TimelineType.
     * 
     * @param start
     */
    public void setStart(java.util.Calendar start) {
        this.start = start;
    }


    /**
     * Gets the end value for this TimelineType.
     * 
     * @return end
     */
    public java.util.Calendar getEnd() {
        return end;
    }


    /**
     * Sets the end value for this TimelineType.
     * 
     * @param end
     */
    public void setEnd(java.util.Calendar end) {
        this.end = end;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimelineType)) return false;
        TimelineType other = (TimelineType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.start==null && other.getStart()==null) || 
             (this.start!=null &&
              this.start.equals(other.getStart()))) &&
            ((this.end==null && other.getEnd()==null) || 
             (this.end!=null &&
              this.end.equals(other.getEnd())));
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
        if (getStart() != null) {
            _hashCode += getStart().hashCode();
        }
        if (getEnd() != null) {
            _hashCode += getEnd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
