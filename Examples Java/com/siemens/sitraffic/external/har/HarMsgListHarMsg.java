/**
 * HarMsgListHarMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.har;

public class HarMsgListHarMsg  implements java.io.Serializable {
    /* ID of message */
    private java.lang.String msgId;

    /* Message text */
    private java.lang.String content;

    /* Reference to the storage of the audio file as an UNC path.
     * If contains only file name, Concert updates it to absolute UNC path */
    private java.lang.String audioFilePath;

    public HarMsgListHarMsg() {
    }

    public HarMsgListHarMsg(
           java.lang.String msgId,
           java.lang.String content,
           java.lang.String audioFilePath) {
           this.msgId = msgId;
           this.content = content;
           this.audioFilePath = audioFilePath;
    }


    /**
     * Gets the msgId value for this HarMsgListHarMsg.
     * 
     * @return msgId   * ID of message
     */
    public java.lang.String getMsgId() {
        return msgId;
    }


    /**
     * Sets the msgId value for this HarMsgListHarMsg.
     * 
     * @param msgId   * ID of message
     */
    public void setMsgId(java.lang.String msgId) {
        this.msgId = msgId;
    }


    /**
     * Gets the content value for this HarMsgListHarMsg.
     * 
     * @return content   * Message text
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this HarMsgListHarMsg.
     * 
     * @param content   * Message text
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the audioFilePath value for this HarMsgListHarMsg.
     * 
     * @return audioFilePath   * Reference to the storage of the audio file as an UNC path.
     * If contains only file name, Concert updates it to absolute UNC path
     */
    public java.lang.String getAudioFilePath() {
        return audioFilePath;
    }


    /**
     * Sets the audioFilePath value for this HarMsgListHarMsg.
     * 
     * @param audioFilePath   * Reference to the storage of the audio file as an UNC path.
     * If contains only file name, Concert updates it to absolute UNC path
     */
    public void setAudioFilePath(java.lang.String audioFilePath) {
        this.audioFilePath = audioFilePath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HarMsgListHarMsg)) return false;
        HarMsgListHarMsg other = (HarMsgListHarMsg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msgId==null && other.getMsgId()==null) || 
             (this.msgId!=null &&
              this.msgId.equals(other.getMsgId()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.audioFilePath==null && other.getAudioFilePath()==null) || 
             (this.audioFilePath!=null &&
              this.audioFilePath.equals(other.getAudioFilePath())));
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
        if (getMsgId() != null) {
            _hashCode += getMsgId().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getAudioFilePath() != null) {
            _hashCode += getAudioFilePath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
