/**
 * Camera_InfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.cctv;

public class Camera_InfoType  implements java.io.Serializable {
    /* unique identifier of camera and possibly switch */
    private java.lang.String id;

    /* state of the camera 
     * 0 :: offline
     * 1 :: OK
     * 2 :: Not OK
     * 3 :: partially OK
     * 4 :: No video
     * 5 :: No PTZ
     * 6 :: No video and no PTZ */
    private com.siemens.sitraffic.external.cctv.Camera_InfoTypeState state;

    /* Last switch date */
    private java.util.Calendar TS;

    /* Absolute Zoom */
    private java.lang.String zoom;

    /* Absolute horizontal position */
    private java.lang.String pan;

    /* Absolute vertical position */
    private java.lang.String tilt;

    /* Name of preset (contains predefined values for zoom, pan and
     * tilt) */
    private java.lang.String preset;

    public Camera_InfoType() {
    }

    public Camera_InfoType(
           java.lang.String id,
           com.siemens.sitraffic.external.cctv.Camera_InfoTypeState state,
           java.util.Calendar TS,
           java.lang.String zoom,
           java.lang.String pan,
           java.lang.String tilt,
           java.lang.String preset) {
           this.id = id;
           this.state = state;
           this.TS = TS;
           this.zoom = zoom;
           this.pan = pan;
           this.tilt = tilt;
           this.preset = preset;
    }


    /**
     * Gets the id value for this Camera_InfoType.
     * 
     * @return id   * unique identifier of camera and possibly switch
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Camera_InfoType.
     * 
     * @param id   * unique identifier of camera and possibly switch
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the state value for this Camera_InfoType.
     * 
     * @return state   * state of the camera 
     * 0 :: offline
     * 1 :: OK
     * 2 :: Not OK
     * 3 :: partially OK
     * 4 :: No video
     * 5 :: No PTZ
     * 6 :: No video and no PTZ
     */
    public com.siemens.sitraffic.external.cctv.Camera_InfoTypeState getState() {
        return state;
    }


    /**
     * Sets the state value for this Camera_InfoType.
     * 
     * @param state   * state of the camera 
     * 0 :: offline
     * 1 :: OK
     * 2 :: Not OK
     * 3 :: partially OK
     * 4 :: No video
     * 5 :: No PTZ
     * 6 :: No video and no PTZ
     */
    public void setState(com.siemens.sitraffic.external.cctv.Camera_InfoTypeState state) {
        this.state = state;
    }


    /**
     * Gets the TS value for this Camera_InfoType.
     * 
     * @return TS   * Last switch date
     */
    public java.util.Calendar getTS() {
        return TS;
    }


    /**
     * Sets the TS value for this Camera_InfoType.
     * 
     * @param TS   * Last switch date
     */
    public void setTS(java.util.Calendar TS) {
        this.TS = TS;
    }


    /**
     * Gets the zoom value for this Camera_InfoType.
     * 
     * @return zoom   * Absolute Zoom
     */
    public java.lang.String getZoom() {
        return zoom;
    }


    /**
     * Sets the zoom value for this Camera_InfoType.
     * 
     * @param zoom   * Absolute Zoom
     */
    public void setZoom(java.lang.String zoom) {
        this.zoom = zoom;
    }


    /**
     * Gets the pan value for this Camera_InfoType.
     * 
     * @return pan   * Absolute horizontal position
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this Camera_InfoType.
     * 
     * @param pan   * Absolute horizontal position
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the tilt value for this Camera_InfoType.
     * 
     * @return tilt   * Absolute vertical position
     */
    public java.lang.String getTilt() {
        return tilt;
    }


    /**
     * Sets the tilt value for this Camera_InfoType.
     * 
     * @param tilt   * Absolute vertical position
     */
    public void setTilt(java.lang.String tilt) {
        this.tilt = tilt;
    }


    /**
     * Gets the preset value for this Camera_InfoType.
     * 
     * @return preset   * Name of preset (contains predefined values for zoom, pan and
     * tilt)
     */
    public java.lang.String getPreset() {
        return preset;
    }


    /**
     * Sets the preset value for this Camera_InfoType.
     * 
     * @param preset   * Name of preset (contains predefined values for zoom, pan and
     * tilt)
     */
    public void setPreset(java.lang.String preset) {
        this.preset = preset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Camera_InfoType)) return false;
        Camera_InfoType other = (Camera_InfoType) obj;
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
            ((this.TS==null && other.getTS()==null) || 
             (this.TS!=null &&
              this.TS.equals(other.getTS()))) &&
            ((this.zoom==null && other.getZoom()==null) || 
             (this.zoom!=null &&
              this.zoom.equals(other.getZoom()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.tilt==null && other.getTilt()==null) || 
             (this.tilt!=null &&
              this.tilt.equals(other.getTilt()))) &&
            ((this.preset==null && other.getPreset()==null) || 
             (this.preset!=null &&
              this.preset.equals(other.getPreset())));
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
        if (getTS() != null) {
            _hashCode += getTS().hashCode();
        }
        if (getZoom() != null) {
            _hashCode += getZoom().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        if (getTilt() != null) {
            _hashCode += getTilt().hashCode();
        }
        if (getPreset() != null) {
            _hashCode += getPreset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
