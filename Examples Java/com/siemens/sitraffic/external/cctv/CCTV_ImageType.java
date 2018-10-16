/**
 * CCTV_ImageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.cctv;

public class CCTV_ImageType  implements java.io.Serializable {
    /* unique identifier of camera and possibly switch */
    private java.lang.String id;

    /* state of the camera */
    private java.lang.String state;

    /* Image timestamp */
    private java.util.Calendar TS;

    private byte[] img;

    public CCTV_ImageType() {
    }

    public CCTV_ImageType(
           java.lang.String id,
           java.lang.String state,
           java.util.Calendar TS,
           byte[] img) {
           this.id = id;
           this.state = state;
           this.TS = TS;
           this.img = img;
    }


    /**
     * Gets the id value for this CCTV_ImageType.
     * 
     * @return id   * unique identifier of camera and possibly switch
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this CCTV_ImageType.
     * 
     * @param id   * unique identifier of camera and possibly switch
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the state value for this CCTV_ImageType.
     * 
     * @return state   * state of the camera
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this CCTV_ImageType.
     * 
     * @param state   * state of the camera
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the TS value for this CCTV_ImageType.
     * 
     * @return TS   * Image timestamp
     */
    public java.util.Calendar getTS() {
        return TS;
    }


    /**
     * Sets the TS value for this CCTV_ImageType.
     * 
     * @param TS   * Image timestamp
     */
    public void setTS(java.util.Calendar TS) {
        this.TS = TS;
    }


    /**
     * Gets the img value for this CCTV_ImageType.
     * 
     * @return img
     */
    public byte[] getImg() {
        return img;
    }


    /**
     * Sets the img value for this CCTV_ImageType.
     * 
     * @param img
     */
    public void setImg(byte[] img) {
        this.img = img;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCTV_ImageType)) return false;
        CCTV_ImageType other = (CCTV_ImageType) obj;
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
            ((this.img==null && other.getImg()==null) || 
             (this.img!=null &&
              java.util.Arrays.equals(this.img, other.getImg())));
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
        if (getImg() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImg());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImg(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
