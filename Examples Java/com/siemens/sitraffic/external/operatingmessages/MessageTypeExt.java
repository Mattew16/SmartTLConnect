/**
 * MessageTypeExt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.operatingmessages;

public class MessageTypeExt  extends com.siemens.sitraffic.external.operatingmessages.MessageType  implements java.io.Serializable {
    /* for OCIT messages: Messages which belong to the same command
     * which is executed. The SysJobId allows to group Messages. */
    private org.apache.axis.types.NMToken sysJobId;

    /* Time when the message occured. The time is alway in UTC, Example:
     * 2002-12-24T17:00:00+00:00 for Christmas Eve, 18:00 MEZ. The +00:00
     * is mandatory. */
    private java.util.Calendar timestamp;

    /* Identify the affected object, e.g. short name or unit */
    private java.lang.String objectId;

    /* Identify the type of the affected object, e.g. sign or traffic
     * control object */
    private java.lang.String objektType;

    public MessageTypeExt() {
    }

    public MessageTypeExt(
           org.apache.axis.types.NMToken category,
           org.apache.axis.types.NMToken degree,
           org.apache.axis.types.NMToken msgDefId,
           java.lang.String user,
           com.siemens.sitraffic.external.operatingmessages.MessageTypeState state,
           com.siemens.sitraffic.external.operatingmessages.MessageTypeParam[] param,
           java.lang.String completeText,
           org.apache.axis.types.NMToken sysJobId,
           java.util.Calendar timestamp,
           java.lang.String objectId,
           java.lang.String objektType) {
        super(
            category,
            degree,
            msgDefId,
            user,
            state,
            param,
            completeText);
        this.sysJobId = sysJobId;
        this.timestamp = timestamp;
        this.objectId = objectId;
        this.objektType = objektType;
    }


    /**
     * Gets the sysJobId value for this MessageTypeExt.
     * 
     * @return sysJobId   * for OCIT messages: Messages which belong to the same command
     * which is executed. The SysJobId allows to group Messages.
     */
    public org.apache.axis.types.NMToken getSysJobId() {
        return sysJobId;
    }


    /**
     * Sets the sysJobId value for this MessageTypeExt.
     * 
     * @param sysJobId   * for OCIT messages: Messages which belong to the same command
     * which is executed. The SysJobId allows to group Messages.
     */
    public void setSysJobId(org.apache.axis.types.NMToken sysJobId) {
        this.sysJobId = sysJobId;
    }


    /**
     * Gets the timestamp value for this MessageTypeExt.
     * 
     * @return timestamp   * Time when the message occured. The time is alway in UTC, Example:
     * 2002-12-24T17:00:00+00:00 for Christmas Eve, 18:00 MEZ. The +00:00
     * is mandatory.
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this MessageTypeExt.
     * 
     * @param timestamp   * Time when the message occured. The time is alway in UTC, Example:
     * 2002-12-24T17:00:00+00:00 for Christmas Eve, 18:00 MEZ. The +00:00
     * is mandatory.
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the objectId value for this MessageTypeExt.
     * 
     * @return objectId   * Identify the affected object, e.g. short name or unit
     */
    public java.lang.String getObjectId() {
        return objectId;
    }


    /**
     * Sets the objectId value for this MessageTypeExt.
     * 
     * @param objectId   * Identify the affected object, e.g. short name or unit
     */
    public void setObjectId(java.lang.String objectId) {
        this.objectId = objectId;
    }


    /**
     * Gets the objektType value for this MessageTypeExt.
     * 
     * @return objektType   * Identify the type of the affected object, e.g. sign or traffic
     * control object
     */
    public java.lang.String getObjektType() {
        return objektType;
    }


    /**
     * Sets the objektType value for this MessageTypeExt.
     * 
     * @param objektType   * Identify the type of the affected object, e.g. sign or traffic
     * control object
     */
    public void setObjektType(java.lang.String objektType) {
        this.objektType = objektType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageTypeExt)) return false;
        MessageTypeExt other = (MessageTypeExt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sysJobId==null && other.getSysJobId()==null) || 
             (this.sysJobId!=null &&
              this.sysJobId.equals(other.getSysJobId()))) &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.objectId==null && other.getObjectId()==null) || 
             (this.objectId!=null &&
              this.objectId.equals(other.getObjectId()))) &&
            ((this.objektType==null && other.getObjektType()==null) || 
             (this.objektType!=null &&
              this.objektType.equals(other.getObjektType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getSysJobId() != null) {
            _hashCode += getSysJobId().hashCode();
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getObjectId() != null) {
            _hashCode += getObjectId().hashCode();
        }
        if (getObjektType() != null) {
            _hashCode += getObjektType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
