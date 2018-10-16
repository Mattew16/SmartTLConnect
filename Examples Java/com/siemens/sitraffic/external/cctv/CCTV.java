/**
 * CCTV.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.cctv;

public class CCTV  implements java.io.Serializable {
    /* ObjectType: Camera_Info */
    private com.siemens.sitraffic.external.cctv.Camera_InfoType camera_Info;

    /* ObjectType: Camera_Cmd */
    private com.siemens.sitraffic.external.cctv.Camera_CmdType[] camera_Cmd;

    /* ObjectType: Camera_Description */
    private com.siemens.sitraffic.external.global.Description camera_Description;

    /* ObjectType: VideoPort_Info */
    private com.siemens.sitraffic.external.cctv.VideoPort_InfoType videoPort_Info;

    /* ObjectType: VideoPort_Cmd */
    private com.siemens.sitraffic.external.cctv.VideoPort_CmdType[] videoPort_Cmd;

    /* ObjectType: CCTV_Image */
    private com.siemens.sitraffic.external.cctv.CCTV_ImageType CCTV_Image;

    public CCTV() {
    }

    public CCTV(
           com.siemens.sitraffic.external.cctv.Camera_InfoType camera_Info,
           com.siemens.sitraffic.external.cctv.Camera_CmdType[] camera_Cmd,
           com.siemens.sitraffic.external.global.Description camera_Description,
           com.siemens.sitraffic.external.cctv.VideoPort_InfoType videoPort_Info,
           com.siemens.sitraffic.external.cctv.VideoPort_CmdType[] videoPort_Cmd,
           com.siemens.sitraffic.external.cctv.CCTV_ImageType CCTV_Image) {
           this.camera_Info = camera_Info;
           this.camera_Cmd = camera_Cmd;
           this.camera_Description = camera_Description;
           this.videoPort_Info = videoPort_Info;
           this.videoPort_Cmd = videoPort_Cmd;
           this.CCTV_Image = CCTV_Image;
    }


    /**
     * Gets the camera_Info value for this CCTV.
     * 
     * @return camera_Info   * ObjectType: Camera_Info
     */
    public com.siemens.sitraffic.external.cctv.Camera_InfoType getCamera_Info() {
        return camera_Info;
    }


    /**
     * Sets the camera_Info value for this CCTV.
     * 
     * @param camera_Info   * ObjectType: Camera_Info
     */
    public void setCamera_Info(com.siemens.sitraffic.external.cctv.Camera_InfoType camera_Info) {
        this.camera_Info = camera_Info;
    }


    /**
     * Gets the camera_Cmd value for this CCTV.
     * 
     * @return camera_Cmd   * ObjectType: Camera_Cmd
     */
    public com.siemens.sitraffic.external.cctv.Camera_CmdType[] getCamera_Cmd() {
        return camera_Cmd;
    }


    /**
     * Sets the camera_Cmd value for this CCTV.
     * 
     * @param camera_Cmd   * ObjectType: Camera_Cmd
     */
    public void setCamera_Cmd(com.siemens.sitraffic.external.cctv.Camera_CmdType[] camera_Cmd) {
        this.camera_Cmd = camera_Cmd;
    }

    public com.siemens.sitraffic.external.cctv.Camera_CmdType getCamera_Cmd(int i) {
        return this.camera_Cmd[i];
    }

    public void setCamera_Cmd(int i, com.siemens.sitraffic.external.cctv.Camera_CmdType _value) {
        this.camera_Cmd[i] = _value;
    }


    /**
     * Gets the camera_Description value for this CCTV.
     * 
     * @return camera_Description   * ObjectType: Camera_Description
     */
    public com.siemens.sitraffic.external.global.Description getCamera_Description() {
        return camera_Description;
    }


    /**
     * Sets the camera_Description value for this CCTV.
     * 
     * @param camera_Description   * ObjectType: Camera_Description
     */
    public void setCamera_Description(com.siemens.sitraffic.external.global.Description camera_Description) {
        this.camera_Description = camera_Description;
    }


    /**
     * Gets the videoPort_Info value for this CCTV.
     * 
     * @return videoPort_Info   * ObjectType: VideoPort_Info
     */
    public com.siemens.sitraffic.external.cctv.VideoPort_InfoType getVideoPort_Info() {
        return videoPort_Info;
    }


    /**
     * Sets the videoPort_Info value for this CCTV.
     * 
     * @param videoPort_Info   * ObjectType: VideoPort_Info
     */
    public void setVideoPort_Info(com.siemens.sitraffic.external.cctv.VideoPort_InfoType videoPort_Info) {
        this.videoPort_Info = videoPort_Info;
    }


    /**
     * Gets the videoPort_Cmd value for this CCTV.
     * 
     * @return videoPort_Cmd   * ObjectType: VideoPort_Cmd
     */
    public com.siemens.sitraffic.external.cctv.VideoPort_CmdType[] getVideoPort_Cmd() {
        return videoPort_Cmd;
    }


    /**
     * Sets the videoPort_Cmd value for this CCTV.
     * 
     * @param videoPort_Cmd   * ObjectType: VideoPort_Cmd
     */
    public void setVideoPort_Cmd(com.siemens.sitraffic.external.cctv.VideoPort_CmdType[] videoPort_Cmd) {
        this.videoPort_Cmd = videoPort_Cmd;
    }

    public com.siemens.sitraffic.external.cctv.VideoPort_CmdType getVideoPort_Cmd(int i) {
        return this.videoPort_Cmd[i];
    }

    public void setVideoPort_Cmd(int i, com.siemens.sitraffic.external.cctv.VideoPort_CmdType _value) {
        this.videoPort_Cmd[i] = _value;
    }


    /**
     * Gets the CCTV_Image value for this CCTV.
     * 
     * @return CCTV_Image   * ObjectType: CCTV_Image
     */
    public com.siemens.sitraffic.external.cctv.CCTV_ImageType getCCTV_Image() {
        return CCTV_Image;
    }


    /**
     * Sets the CCTV_Image value for this CCTV.
     * 
     * @param CCTV_Image   * ObjectType: CCTV_Image
     */
    public void setCCTV_Image(com.siemens.sitraffic.external.cctv.CCTV_ImageType CCTV_Image) {
        this.CCTV_Image = CCTV_Image;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCTV)) return false;
        CCTV other = (CCTV) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.camera_Info==null && other.getCamera_Info()==null) || 
             (this.camera_Info!=null &&
              this.camera_Info.equals(other.getCamera_Info()))) &&
            ((this.camera_Cmd==null && other.getCamera_Cmd()==null) || 
             (this.camera_Cmd!=null &&
              java.util.Arrays.equals(this.camera_Cmd, other.getCamera_Cmd()))) &&
            ((this.camera_Description==null && other.getCamera_Description()==null) || 
             (this.camera_Description!=null &&
              this.camera_Description.equals(other.getCamera_Description()))) &&
            ((this.videoPort_Info==null && other.getVideoPort_Info()==null) || 
             (this.videoPort_Info!=null &&
              this.videoPort_Info.equals(other.getVideoPort_Info()))) &&
            ((this.videoPort_Cmd==null && other.getVideoPort_Cmd()==null) || 
             (this.videoPort_Cmd!=null &&
              java.util.Arrays.equals(this.videoPort_Cmd, other.getVideoPort_Cmd()))) &&
            ((this.CCTV_Image==null && other.getCCTV_Image()==null) || 
             (this.CCTV_Image!=null &&
              this.CCTV_Image.equals(other.getCCTV_Image())));
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
        if (getCamera_Info() != null) {
            _hashCode += getCamera_Info().hashCode();
        }
        if (getCamera_Cmd() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCamera_Cmd());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCamera_Cmd(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCamera_Description() != null) {
            _hashCode += getCamera_Description().hashCode();
        }
        if (getVideoPort_Info() != null) {
            _hashCode += getVideoPort_Info().hashCode();
        }
        if (getVideoPort_Cmd() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVideoPort_Cmd());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVideoPort_Cmd(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCCTV_Image() != null) {
            _hashCode += getCCTV_Image().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
