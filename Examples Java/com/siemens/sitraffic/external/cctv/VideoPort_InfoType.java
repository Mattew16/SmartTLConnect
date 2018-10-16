/**
 * VideoPort_InfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.cctv;

public class VideoPort_InfoType  implements java.io.Serializable {
    /* unique identifier of port */
    private java.lang.String id;

    /* state of the port 
     * 0 :: offline
     * 1 :: OK
     * 2 :: Not OK
     * 3 :: partially OK */
    private com.siemens.sitraffic.external.cctv.VideoPort_InfoTypeState state;

    /* assigned camera to this port */
    private java.lang.String camera_ID;

    /* Last switch date */
    private java.util.Calendar TS;

    public VideoPort_InfoType() {
    }

    public VideoPort_InfoType(
           java.lang.String id,
           com.siemens.sitraffic.external.cctv.VideoPort_InfoTypeState state,
           java.lang.String camera_ID,
           java.util.Calendar TS) {
           this.id = id;
           this.state = state;
           this.camera_ID = camera_ID;
           this.TS = TS;
    }


    /**
     * Gets the id value for this VideoPort_InfoType.
     * 
     * @return id   * unique identifier of port
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this VideoPort_InfoType.
     * 
     * @param id   * unique identifier of port
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the state value for this VideoPort_InfoType.
     * 
     * @return state   * state of the port 
     * 0 :: offline
     * 1 :: OK
     * 2 :: Not OK
     * 3 :: partially OK
     */
    public com.siemens.sitraffic.external.cctv.VideoPort_InfoTypeState getState() {
        return state;
    }


    /**
     * Sets the state value for this VideoPort_InfoType.
     * 
     * @param state   * state of the port 
     * 0 :: offline
     * 1 :: OK
     * 2 :: Not OK
     * 3 :: partially OK
     */
    public void setState(com.siemens.sitraffic.external.cctv.VideoPort_InfoTypeState state) {
        this.state = state;
    }


    /**
     * Gets the camera_ID value for this VideoPort_InfoType.
     * 
     * @return camera_ID   * assigned camera to this port
     */
    public java.lang.String getCamera_ID() {
        return camera_ID;
    }


    /**
     * Sets the camera_ID value for this VideoPort_InfoType.
     * 
     * @param camera_ID   * assigned camera to this port
     */
    public void setCamera_ID(java.lang.String camera_ID) {
        this.camera_ID = camera_ID;
    }


    /**
     * Gets the TS value for this VideoPort_InfoType.
     * 
     * @return TS   * Last switch date
     */
    public java.util.Calendar getTS() {
        return TS;
    }


    /**
     * Sets the TS value for this VideoPort_InfoType.
     * 
     * @param TS   * Last switch date
     */
    public void setTS(java.util.Calendar TS) {
        this.TS = TS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoPort_InfoType)) return false;
        VideoPort_InfoType other = (VideoPort_InfoType) obj;
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
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.camera_ID==null && other.getCamera_ID()==null) || 
             (this.camera_ID!=null &&
              this.camera_ID.equals(other.getCamera_ID()))) &&
            ((this.TS==null && other.getTS()==null) || 
             (this.TS!=null &&
              this.TS.equals(other.getTS())));
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCamera_ID() != null) {
            _hashCode += getCamera_ID().hashCode();
        }
        if (getTS() != null) {
            _hashCode += getTS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
