/**
 * RestrictionTypeInLanes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficmessages;

public class RestrictionTypeInLanes  implements java.io.Serializable {
    /* count of lanes */
    private org.apache.axis.types.UnsignedByte total;

    /* lanes closed */
    private org.apache.axis.types.UnsignedByte closed;

    /* lanes redirected (not counted as closed lanes) */
    private org.apache.axis.types.UnsignedByte redirected;

    public RestrictionTypeInLanes() {
    }

    public RestrictionTypeInLanes(
           org.apache.axis.types.UnsignedByte total,
           org.apache.axis.types.UnsignedByte closed,
           org.apache.axis.types.UnsignedByte redirected) {
           this.total = total;
           this.closed = closed;
           this.redirected = redirected;
    }


    /**
     * Gets the total value for this RestrictionTypeInLanes.
     * 
     * @return total   * count of lanes
     */
    public org.apache.axis.types.UnsignedByte getTotal() {
        return total;
    }


    /**
     * Sets the total value for this RestrictionTypeInLanes.
     * 
     * @param total   * count of lanes
     */
    public void setTotal(org.apache.axis.types.UnsignedByte total) {
        this.total = total;
    }


    /**
     * Gets the closed value for this RestrictionTypeInLanes.
     * 
     * @return closed   * lanes closed
     */
    public org.apache.axis.types.UnsignedByte getClosed() {
        return closed;
    }


    /**
     * Sets the closed value for this RestrictionTypeInLanes.
     * 
     * @param closed   * lanes closed
     */
    public void setClosed(org.apache.axis.types.UnsignedByte closed) {
        this.closed = closed;
    }


    /**
     * Gets the redirected value for this RestrictionTypeInLanes.
     * 
     * @return redirected   * lanes redirected (not counted as closed lanes)
     */
    public org.apache.axis.types.UnsignedByte getRedirected() {
        return redirected;
    }


    /**
     * Sets the redirected value for this RestrictionTypeInLanes.
     * 
     * @param redirected   * lanes redirected (not counted as closed lanes)
     */
    public void setRedirected(org.apache.axis.types.UnsignedByte redirected) {
        this.redirected = redirected;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RestrictionTypeInLanes)) return false;
        RestrictionTypeInLanes other = (RestrictionTypeInLanes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.closed==null && other.getClosed()==null) || 
             (this.closed!=null &&
              this.closed.equals(other.getClosed()))) &&
            ((this.redirected==null && other.getRedirected()==null) || 
             (this.redirected!=null &&
              this.redirected.equals(other.getRedirected())));
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
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getClosed() != null) {
            _hashCode += getClosed().hashCode();
        }
        if (getRedirected() != null) {
            _hashCode += getRedirected().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
