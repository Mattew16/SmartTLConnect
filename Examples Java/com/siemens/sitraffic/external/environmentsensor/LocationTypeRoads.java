/**
 * LocationTypeRoads.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.environmentsensor;

public class LocationTypeRoads  implements java.io.Serializable {
    private java.lang.String road;

    /* Crossing Road Start */
    private java.lang.String CRoadFr;

    /* Additional Distance information */
    private java.lang.Short distFr;

    /* Crossing Road End */
    private java.lang.String CRoadTo;

    /* Additional Distance information */
    private java.lang.Short distTo;

    private com.siemens.sitraffic.external.environmentsensor.LocationTypeRoadsCtrl ctrl;  // attribute

    public LocationTypeRoads() {
    }

    public LocationTypeRoads(
           java.lang.String road,
           java.lang.String CRoadFr,
           java.lang.Short distFr,
           java.lang.String CRoadTo,
           java.lang.Short distTo,
           com.siemens.sitraffic.external.environmentsensor.LocationTypeRoadsCtrl ctrl) {
           this.road = road;
           this.CRoadFr = CRoadFr;
           this.distFr = distFr;
           this.CRoadTo = CRoadTo;
           this.distTo = distTo;
           this.ctrl = ctrl;
    }


    /**
     * Gets the road value for this LocationTypeRoads.
     * 
     * @return road
     */
    public java.lang.String getRoad() {
        return road;
    }


    /**
     * Sets the road value for this LocationTypeRoads.
     * 
     * @param road
     */
    public void setRoad(java.lang.String road) {
        this.road = road;
    }


    /**
     * Gets the CRoadFr value for this LocationTypeRoads.
     * 
     * @return CRoadFr   * Crossing Road Start
     */
    public java.lang.String getCRoadFr() {
        return CRoadFr;
    }


    /**
     * Sets the CRoadFr value for this LocationTypeRoads.
     * 
     * @param CRoadFr   * Crossing Road Start
     */
    public void setCRoadFr(java.lang.String CRoadFr) {
        this.CRoadFr = CRoadFr;
    }


    /**
     * Gets the distFr value for this LocationTypeRoads.
     * 
     * @return distFr   * Additional Distance information
     */
    public java.lang.Short getDistFr() {
        return distFr;
    }


    /**
     * Sets the distFr value for this LocationTypeRoads.
     * 
     * @param distFr   * Additional Distance information
     */
    public void setDistFr(java.lang.Short distFr) {
        this.distFr = distFr;
    }


    /**
     * Gets the CRoadTo value for this LocationTypeRoads.
     * 
     * @return CRoadTo   * Crossing Road End
     */
    public java.lang.String getCRoadTo() {
        return CRoadTo;
    }


    /**
     * Sets the CRoadTo value for this LocationTypeRoads.
     * 
     * @param CRoadTo   * Crossing Road End
     */
    public void setCRoadTo(java.lang.String CRoadTo) {
        this.CRoadTo = CRoadTo;
    }


    /**
     * Gets the distTo value for this LocationTypeRoads.
     * 
     * @return distTo   * Additional Distance information
     */
    public java.lang.Short getDistTo() {
        return distTo;
    }


    /**
     * Sets the distTo value for this LocationTypeRoads.
     * 
     * @param distTo   * Additional Distance information
     */
    public void setDistTo(java.lang.Short distTo) {
        this.distTo = distTo;
    }


    /**
     * Gets the ctrl value for this LocationTypeRoads.
     * 
     * @return ctrl
     */
    public com.siemens.sitraffic.external.environmentsensor.LocationTypeRoadsCtrl getCtrl() {
        return ctrl;
    }


    /**
     * Sets the ctrl value for this LocationTypeRoads.
     * 
     * @param ctrl
     */
    public void setCtrl(com.siemens.sitraffic.external.environmentsensor.LocationTypeRoadsCtrl ctrl) {
        this.ctrl = ctrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationTypeRoads)) return false;
        LocationTypeRoads other = (LocationTypeRoads) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.road==null && other.getRoad()==null) || 
             (this.road!=null &&
              this.road.equals(other.getRoad()))) &&
            ((this.CRoadFr==null && other.getCRoadFr()==null) || 
             (this.CRoadFr!=null &&
              this.CRoadFr.equals(other.getCRoadFr()))) &&
            ((this.distFr==null && other.getDistFr()==null) || 
             (this.distFr!=null &&
              this.distFr.equals(other.getDistFr()))) &&
            ((this.CRoadTo==null && other.getCRoadTo()==null) || 
             (this.CRoadTo!=null &&
              this.CRoadTo.equals(other.getCRoadTo()))) &&
            ((this.distTo==null && other.getDistTo()==null) || 
             (this.distTo!=null &&
              this.distTo.equals(other.getDistTo()))) &&
            ((this.ctrl==null && other.getCtrl()==null) || 
             (this.ctrl!=null &&
              this.ctrl.equals(other.getCtrl())));
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
        if (getRoad() != null) {
            _hashCode += getRoad().hashCode();
        }
        if (getCRoadFr() != null) {
            _hashCode += getCRoadFr().hashCode();
        }
        if (getDistFr() != null) {
            _hashCode += getDistFr().hashCode();
        }
        if (getCRoadTo() != null) {
            _hashCode += getCRoadTo().hashCode();
        }
        if (getDistTo() != null) {
            _hashCode += getDistTo().hashCode();
        }
        if (getCtrl() != null) {
            _hashCode += getCtrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
