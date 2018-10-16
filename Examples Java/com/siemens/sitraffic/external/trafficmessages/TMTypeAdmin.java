/**
 * TMTypeAdmin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficmessages;

public class TMTypeAdmin  extends com.siemens.sitraffic.external.trafficmessages.AdminType  implements java.io.Serializable {
    private java.lang.Boolean SMS;  // attribute

    private java.lang.Boolean WEB;  // attribute

    public TMTypeAdmin() {
    }

    public TMTypeAdmin(
           java.lang.String id,
           java.lang.String subsystem,
           java.lang.String name,
           java.lang.String subtype,
           java.lang.String severity,
           java.lang.String category,
           com.siemens.sitraffic.external.trafficmessages.AdminTypePublicdisplay[] publicdisplay,
           java.lang.Boolean SMS,
           java.lang.Boolean WEB) {
        super(
            id,
            subsystem,
            name,
            subtype,
            severity,
            category,
            publicdisplay);
        this.SMS = SMS;
        this.WEB = WEB;
    }


    /**
     * Gets the SMS value for this TMTypeAdmin.
     * 
     * @return SMS
     */
    public java.lang.Boolean getSMS() {
        return SMS;
    }


    /**
     * Sets the SMS value for this TMTypeAdmin.
     * 
     * @param SMS
     */
    public void setSMS(java.lang.Boolean SMS) {
        this.SMS = SMS;
    }


    /**
     * Gets the WEB value for this TMTypeAdmin.
     * 
     * @return WEB
     */
    public java.lang.Boolean getWEB() {
        return WEB;
    }


    /**
     * Sets the WEB value for this TMTypeAdmin.
     * 
     * @param WEB
     */
    public void setWEB(java.lang.Boolean WEB) {
        this.WEB = WEB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TMTypeAdmin)) return false;
        TMTypeAdmin other = (TMTypeAdmin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.SMS==null && other.getSMS()==null) || 
             (this.SMS!=null &&
              this.SMS.equals(other.getSMS()))) &&
            ((this.WEB==null && other.getWEB()==null) || 
             (this.WEB!=null &&
              this.WEB.equals(other.getWEB())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getSMS() != null) {
            _hashCode += getSMS().hashCode();
        }
        if (getWEB() != null) {
            _hashCode += getWEB().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
