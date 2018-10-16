/**
 * MessageTypeParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.operatingmessages;

public class MessageTypeParam  implements java.io.Serializable {
    /* Identifier of the parameter to enter in the database. The ParamId
     * is preconfigured in the database and is unique within the MsgType. */
    private com.siemens.sitraffic.external.operatingmessages.MessageTypeParamParamId paramId;

    /* Contents/Value of the parameter */
    private java.lang.String paramValue;

    public MessageTypeParam() {
    }

    public MessageTypeParam(
           com.siemens.sitraffic.external.operatingmessages.MessageTypeParamParamId paramId,
           java.lang.String paramValue) {
           this.paramId = paramId;
           this.paramValue = paramValue;
    }


    /**
     * Gets the paramId value for this MessageTypeParam.
     * 
     * @return paramId   * Identifier of the parameter to enter in the database. The ParamId
     * is preconfigured in the database and is unique within the MsgType.
     */
    public com.siemens.sitraffic.external.operatingmessages.MessageTypeParamParamId getParamId() {
        return paramId;
    }


    /**
     * Sets the paramId value for this MessageTypeParam.
     * 
     * @param paramId   * Identifier of the parameter to enter in the database. The ParamId
     * is preconfigured in the database and is unique within the MsgType.
     */
    public void setParamId(com.siemens.sitraffic.external.operatingmessages.MessageTypeParamParamId paramId) {
        this.paramId = paramId;
    }


    /**
     * Gets the paramValue value for this MessageTypeParam.
     * 
     * @return paramValue   * Contents/Value of the parameter
     */
    public java.lang.String getParamValue() {
        return paramValue;
    }


    /**
     * Sets the paramValue value for this MessageTypeParam.
     * 
     * @param paramValue   * Contents/Value of the parameter
     */
    public void setParamValue(java.lang.String paramValue) {
        this.paramValue = paramValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageTypeParam)) return false;
        MessageTypeParam other = (MessageTypeParam) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paramId==null && other.getParamId()==null) || 
             (this.paramId!=null &&
              this.paramId.equals(other.getParamId()))) &&
            ((this.paramValue==null && other.getParamValue()==null) || 
             (this.paramValue!=null &&
              this.paramValue.equals(other.getParamValue())));
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
        if (getParamId() != null) {
            _hashCode += getParamId().hashCode();
        }
        if (getParamValue() != null) {
            _hashCode += getParamValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
