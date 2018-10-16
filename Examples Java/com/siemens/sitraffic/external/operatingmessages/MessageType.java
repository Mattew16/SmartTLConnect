/**
 * MessageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.operatingmessages;

public class MessageType  implements java.io.Serializable {
    /* Type to distinguish between different kinds of messages. */
    private org.apache.axis.types.NMToken category;

    private org.apache.axis.types.NMToken degree;

    /* The Identifier of the message type to identify in the database.
     * The MsgDefId is unique within the system (SystemTypeId). The MsgDefId
     * is preconfigured in the database. */
    private org.apache.axis.types.NMToken msgDefId;

    /* if available the user who entered the Bema or who issued the
     * related action. It will be entered as plain text (e.g. Heiko Schmitz). */
    private java.lang.String user;

    /* Describes the state of the message, first of all used to describe
     * appearing/disappearing messages. */
    private com.siemens.sitraffic.external.operatingmessages.MessageTypeState state;

    private com.siemens.sitraffic.external.operatingmessages.MessageTypeParam[] param;

    /* Full text with already replaced parameters. */
    private java.lang.String completeText;

    public MessageType() {
    }

    public MessageType(
           org.apache.axis.types.NMToken category,
           org.apache.axis.types.NMToken degree,
           org.apache.axis.types.NMToken msgDefId,
           java.lang.String user,
           com.siemens.sitraffic.external.operatingmessages.MessageTypeState state,
           com.siemens.sitraffic.external.operatingmessages.MessageTypeParam[] param,
           java.lang.String completeText) {
           this.category = category;
           this.degree = degree;
           this.msgDefId = msgDefId;
           this.user = user;
           this.state = state;
           this.param = param;
           this.completeText = completeText;
    }


    /**
     * Gets the category value for this MessageType.
     * 
     * @return category   * Type to distinguish between different kinds of messages.
     */
    public org.apache.axis.types.NMToken getCategory() {
        return category;
    }


    /**
     * Sets the category value for this MessageType.
     * 
     * @param category   * Type to distinguish between different kinds of messages.
     */
    public void setCategory(org.apache.axis.types.NMToken category) {
        this.category = category;
    }


    /**
     * Gets the degree value for this MessageType.
     * 
     * @return degree
     */
    public org.apache.axis.types.NMToken getDegree() {
        return degree;
    }


    /**
     * Sets the degree value for this MessageType.
     * 
     * @param degree
     */
    public void setDegree(org.apache.axis.types.NMToken degree) {
        this.degree = degree;
    }


    /**
     * Gets the msgDefId value for this MessageType.
     * 
     * @return msgDefId   * The Identifier of the message type to identify in the database.
     * The MsgDefId is unique within the system (SystemTypeId). The MsgDefId
     * is preconfigured in the database.
     */
    public org.apache.axis.types.NMToken getMsgDefId() {
        return msgDefId;
    }


    /**
     * Sets the msgDefId value for this MessageType.
     * 
     * @param msgDefId   * The Identifier of the message type to identify in the database.
     * The MsgDefId is unique within the system (SystemTypeId). The MsgDefId
     * is preconfigured in the database.
     */
    public void setMsgDefId(org.apache.axis.types.NMToken msgDefId) {
        this.msgDefId = msgDefId;
    }


    /**
     * Gets the user value for this MessageType.
     * 
     * @return user   * if available the user who entered the Bema or who issued the
     * related action. It will be entered as plain text (e.g. Heiko Schmitz).
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this MessageType.
     * 
     * @param user   * if available the user who entered the Bema or who issued the
     * related action. It will be entered as plain text (e.g. Heiko Schmitz).
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the state value for this MessageType.
     * 
     * @return state   * Describes the state of the message, first of all used to describe
     * appearing/disappearing messages.
     */
    public com.siemens.sitraffic.external.operatingmessages.MessageTypeState getState() {
        return state;
    }


    /**
     * Sets the state value for this MessageType.
     * 
     * @param state   * Describes the state of the message, first of all used to describe
     * appearing/disappearing messages.
     */
    public void setState(com.siemens.sitraffic.external.operatingmessages.MessageTypeState state) {
        this.state = state;
    }


    /**
     * Gets the param value for this MessageType.
     * 
     * @return param
     */
    public com.siemens.sitraffic.external.operatingmessages.MessageTypeParam[] getParam() {
        return param;
    }


    /**
     * Sets the param value for this MessageType.
     * 
     * @param param
     */
    public void setParam(com.siemens.sitraffic.external.operatingmessages.MessageTypeParam[] param) {
        this.param = param;
    }

    public com.siemens.sitraffic.external.operatingmessages.MessageTypeParam getParam(int i) {
        return this.param[i];
    }

    public void setParam(int i, com.siemens.sitraffic.external.operatingmessages.MessageTypeParam _value) {
        this.param[i] = _value;
    }


    /**
     * Gets the completeText value for this MessageType.
     * 
     * @return completeText   * Full text with already replaced parameters.
     */
    public java.lang.String getCompleteText() {
        return completeText;
    }


    /**
     * Sets the completeText value for this MessageType.
     * 
     * @param completeText   * Full text with already replaced parameters.
     */
    public void setCompleteText(java.lang.String completeText) {
        this.completeText = completeText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageType)) return false;
        MessageType other = (MessageType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.degree==null && other.getDegree()==null) || 
             (this.degree!=null &&
              this.degree.equals(other.getDegree()))) &&
            ((this.msgDefId==null && other.getMsgDefId()==null) || 
             (this.msgDefId!=null &&
              this.msgDefId.equals(other.getMsgDefId()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.param==null && other.getParam()==null) || 
             (this.param!=null &&
              java.util.Arrays.equals(this.param, other.getParam()))) &&
            ((this.completeText==null && other.getCompleteText()==null) || 
             (this.completeText!=null &&
              this.completeText.equals(other.getCompleteText())));
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
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getDegree() != null) {
            _hashCode += getDegree().hashCode();
        }
        if (getMsgDefId() != null) {
            _hashCode += getMsgDefId().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getParam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParam(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompleteText() != null) {
            _hashCode += getCompleteText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
