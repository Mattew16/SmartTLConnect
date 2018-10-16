/**
 * ControlValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.control;

public class ControlValue  implements java.io.Serializable {
    /* identifier of object / situation - id */
    private java.lang.String id;

    private com.siemens.sitraffic.external.global.Timeline timeline;

    /* parameter or state / situation value */
    private org.apache.axis.types.UnsignedLong paramValue;

    /* description of the parameter value */
    private java.lang.String paramTxt;

    /* additional information */
    private java.lang.String addInfo;

    public ControlValue() {
    }

    public ControlValue(
           java.lang.String id,
           com.siemens.sitraffic.external.global.Timeline timeline,
           org.apache.axis.types.UnsignedLong paramValue,
           java.lang.String paramTxt,
           java.lang.String addInfo) {
           this.id = id;
           this.timeline = timeline;
           this.paramValue = paramValue;
           this.paramTxt = paramTxt;
           this.addInfo = addInfo;
    }


    /**
     * Gets the id value for this ControlValue.
     * 
     * @return id   * identifier of object / situation - id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ControlValue.
     * 
     * @param id   * identifier of object / situation - id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the timeline value for this ControlValue.
     * 
     * @return timeline
     */
    public com.siemens.sitraffic.external.global.Timeline getTimeline() {
        return timeline;
    }


    /**
     * Sets the timeline value for this ControlValue.
     * 
     * @param timeline
     */
    public void setTimeline(com.siemens.sitraffic.external.global.Timeline timeline) {
        this.timeline = timeline;
    }


    /**
     * Gets the paramValue value for this ControlValue.
     * 
     * @return paramValue   * parameter or state / situation value
     */
    public org.apache.axis.types.UnsignedLong getParamValue() {
        return paramValue;
    }


    /**
     * Sets the paramValue value for this ControlValue.
     * 
     * @param paramValue   * parameter or state / situation value
     */
    public void setParamValue(org.apache.axis.types.UnsignedLong paramValue) {
        this.paramValue = paramValue;
    }


    /**
     * Gets the paramTxt value for this ControlValue.
     * 
     * @return paramTxt   * description of the parameter value
     */
    public java.lang.String getParamTxt() {
        return paramTxt;
    }


    /**
     * Sets the paramTxt value for this ControlValue.
     * 
     * @param paramTxt   * description of the parameter value
     */
    public void setParamTxt(java.lang.String paramTxt) {
        this.paramTxt = paramTxt;
    }


    /**
     * Gets the addInfo value for this ControlValue.
     * 
     * @return addInfo   * additional information
     */
    public java.lang.String getAddInfo() {
        return addInfo;
    }


    /**
     * Sets the addInfo value for this ControlValue.
     * 
     * @param addInfo   * additional information
     */
    public void setAddInfo(java.lang.String addInfo) {
        this.addInfo = addInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ControlValue)) return false;
        ControlValue other = (ControlValue) obj;
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
            ((this.timeline==null && other.getTimeline()==null) || 
             (this.timeline!=null &&
              this.timeline.equals(other.getTimeline()))) &&
            ((this.paramValue==null && other.getParamValue()==null) || 
             (this.paramValue!=null &&
              this.paramValue.equals(other.getParamValue()))) &&
            ((this.paramTxt==null && other.getParamTxt()==null) || 
             (this.paramTxt!=null &&
              this.paramTxt.equals(other.getParamTxt()))) &&
            ((this.addInfo==null && other.getAddInfo()==null) || 
             (this.addInfo!=null &&
              this.addInfo.equals(other.getAddInfo())));
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
        if (getTimeline() != null) {
            _hashCode += getTimeline().hashCode();
        }
        if (getParamValue() != null) {
            _hashCode += getParamValue().hashCode();
        }
        if (getParamTxt() != null) {
            _hashCode += getParamTxt().hashCode();
        }
        if (getAddInfo() != null) {
            _hashCode += getAddInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
