/**
 * TrafficControlSignal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;


/**
 * Content type for the traffic control signs.
 */
public class TrafficControlSignal  implements java.io.Serializable {
    /* Code of the shown picture. */
    private com.siemens.sitraffic.vmsinstation.infopoint.TrafficControlSignalCode code;

    private com.siemens.sitraffic.vmsinstation.infopoint.TrafficControlSignalContentType contentType;  // attribute

    private java.lang.String addInfo;  // attribute

    private com.siemens.sitraffic.vmsinstation.infopoint.TrafficControlSignalDisplayMode displayMode;  // attribute

    public TrafficControlSignal() {
    }

    public TrafficControlSignal(
           com.siemens.sitraffic.vmsinstation.infopoint.TrafficControlSignalCode code,
           com.siemens.sitraffic.vmsinstation.infopoint.TrafficControlSignalContentType contentType,
           java.lang.String addInfo,
           com.siemens.sitraffic.vmsinstation.infopoint.TrafficControlSignalDisplayMode displayMode) {
           this.code = code;
           this.contentType = contentType;
           this.addInfo = addInfo;
           this.displayMode = displayMode;
    }


    /**
     * Gets the code value for this TrafficControlSignal.
     * 
     * @return code   * Code of the shown picture.
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.TrafficControlSignalCode getCode() {
        return code;
    }


    /**
     * Sets the code value for this TrafficControlSignal.
     * 
     * @param code   * Code of the shown picture.
     */
    public void setCode(com.siemens.sitraffic.vmsinstation.infopoint.TrafficControlSignalCode code) {
        this.code = code;
    }


    /**
     * Gets the contentType value for this TrafficControlSignal.
     * 
     * @return contentType
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.TrafficControlSignalContentType getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this TrafficControlSignal.
     * 
     * @param contentType
     */
    public void setContentType(com.siemens.sitraffic.vmsinstation.infopoint.TrafficControlSignalContentType contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the addInfo value for this TrafficControlSignal.
     * 
     * @return addInfo
     */
    public java.lang.String getAddInfo() {
        return addInfo;
    }


    /**
     * Sets the addInfo value for this TrafficControlSignal.
     * 
     * @param addInfo
     */
    public void setAddInfo(java.lang.String addInfo) {
        this.addInfo = addInfo;
    }


    /**
     * Gets the displayMode value for this TrafficControlSignal.
     * 
     * @return displayMode
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.TrafficControlSignalDisplayMode getDisplayMode() {
        return displayMode;
    }


    /**
     * Sets the displayMode value for this TrafficControlSignal.
     * 
     * @param displayMode
     */
    public void setDisplayMode(com.siemens.sitraffic.vmsinstation.infopoint.TrafficControlSignalDisplayMode displayMode) {
        this.displayMode = displayMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficControlSignal)) return false;
        TrafficControlSignal other = (TrafficControlSignal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.addInfo==null && other.getAddInfo()==null) || 
             (this.addInfo!=null &&
              this.addInfo.equals(other.getAddInfo()))) &&
            ((this.displayMode==null && other.getDisplayMode()==null) || 
             (this.displayMode!=null &&
              this.displayMode.equals(other.getDisplayMode())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getAddInfo() != null) {
            _hashCode += getAddInfo().hashCode();
        }
        if (getDisplayMode() != null) {
            _hashCode += getDisplayMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
