/**
 * VideoPort_CmdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.cctv;

public class VideoPort_CmdType  implements java.io.Serializable {
    /* unique identifier of port */
    private java.lang.String id;

    /* assigned camera to this port */
    private java.lang.String camera_ID;

    public VideoPort_CmdType() {
    }

    public VideoPort_CmdType(
           java.lang.String id,
           java.lang.String camera_ID) {
           this.id = id;
           this.camera_ID = camera_ID;
    }


    /**
     * Gets the id value for this VideoPort_CmdType.
     * 
     * @return id   * unique identifier of port
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this VideoPort_CmdType.
     * 
     * @param id   * unique identifier of port
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the camera_ID value for this VideoPort_CmdType.
     * 
     * @return camera_ID   * assigned camera to this port
     */
    public java.lang.String getCamera_ID() {
        return camera_ID;
    }


    /**
     * Sets the camera_ID value for this VideoPort_CmdType.
     * 
     * @param camera_ID   * assigned camera to this port
     */
    public void setCamera_ID(java.lang.String camera_ID) {
        this.camera_ID = camera_ID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoPort_CmdType)) return false;
        VideoPort_CmdType other = (VideoPort_CmdType) obj;
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
            ((this.camera_ID==null && other.getCamera_ID()==null) || 
             (this.camera_ID!=null &&
              this.camera_ID.equals(other.getCamera_ID())));
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
        if (getCamera_ID() != null) {
            _hashCode += getCamera_ID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
