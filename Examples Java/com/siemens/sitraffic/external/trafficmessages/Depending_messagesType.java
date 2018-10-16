/**
 * Depending_messagesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficmessages;


/**
 * includes messagetype (e.g. roadwork) id and subsystem of the message
 * to identify and detectiontype to indicate whether it is a manual or
 * automaticly detected dependancy
 */
public class Depending_messagesType  implements java.io.Serializable {
    private java.lang.String id;  // attribute

    private java.lang.String subsystem;  // attribute

    private com.siemens.sitraffic.external.trafficmessages.Depending_messagesTypeMessagetype messagetype;  // attribute

    private com.siemens.sitraffic.external.trafficmessages.Depending_messagesTypeDetectiontype detectiontype;  // attribute

    public Depending_messagesType() {
    }

    public Depending_messagesType(
           java.lang.String id,
           java.lang.String subsystem,
           com.siemens.sitraffic.external.trafficmessages.Depending_messagesTypeMessagetype messagetype,
           com.siemens.sitraffic.external.trafficmessages.Depending_messagesTypeDetectiontype detectiontype) {
           this.id = id;
           this.subsystem = subsystem;
           this.messagetype = messagetype;
           this.detectiontype = detectiontype;
    }


    /**
     * Gets the id value for this Depending_messagesType.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Depending_messagesType.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the subsystem value for this Depending_messagesType.
     * 
     * @return subsystem
     */
    public java.lang.String getSubsystem() {
        return subsystem;
    }


    /**
     * Sets the subsystem value for this Depending_messagesType.
     * 
     * @param subsystem
     */
    public void setSubsystem(java.lang.String subsystem) {
        this.subsystem = subsystem;
    }


    /**
     * Gets the messagetype value for this Depending_messagesType.
     * 
     * @return messagetype
     */
    public com.siemens.sitraffic.external.trafficmessages.Depending_messagesTypeMessagetype getMessagetype() {
        return messagetype;
    }


    /**
     * Sets the messagetype value for this Depending_messagesType.
     * 
     * @param messagetype
     */
    public void setMessagetype(com.siemens.sitraffic.external.trafficmessages.Depending_messagesTypeMessagetype messagetype) {
        this.messagetype = messagetype;
    }


    /**
     * Gets the detectiontype value for this Depending_messagesType.
     * 
     * @return detectiontype
     */
    public com.siemens.sitraffic.external.trafficmessages.Depending_messagesTypeDetectiontype getDetectiontype() {
        return detectiontype;
    }


    /**
     * Sets the detectiontype value for this Depending_messagesType.
     * 
     * @param detectiontype
     */
    public void setDetectiontype(com.siemens.sitraffic.external.trafficmessages.Depending_messagesTypeDetectiontype detectiontype) {
        this.detectiontype = detectiontype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Depending_messagesType)) return false;
        Depending_messagesType other = (Depending_messagesType) obj;
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
            ((this.subsystem==null && other.getSubsystem()==null) || 
             (this.subsystem!=null &&
              this.subsystem.equals(other.getSubsystem()))) &&
            ((this.messagetype==null && other.getMessagetype()==null) || 
             (this.messagetype!=null &&
              this.messagetype.equals(other.getMessagetype()))) &&
            ((this.detectiontype==null && other.getDetectiontype()==null) || 
             (this.detectiontype!=null &&
              this.detectiontype.equals(other.getDetectiontype())));
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
        if (getSubsystem() != null) {
            _hashCode += getSubsystem().hashCode();
        }
        if (getMessagetype() != null) {
            _hashCode += getMessagetype().hashCode();
        }
        if (getDetectiontype() != null) {
            _hashCode += getDetectiontype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
