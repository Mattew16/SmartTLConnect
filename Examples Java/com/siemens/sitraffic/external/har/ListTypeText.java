/**
 * ListTypeText.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.har;

public class ListTypeText  implements java.io.Serializable {
    /* ID of Text Element */
    private java.lang.String ID;

    /* Text */
    private java.lang.String content;

    /* Referenz to the storage of the sound file as a UNC path. */
    private java.lang.String soundPath;

    public ListTypeText() {
    }

    public ListTypeText(
           java.lang.String ID,
           java.lang.String content,
           java.lang.String soundPath) {
           this.ID = ID;
           this.content = content;
           this.soundPath = soundPath;
    }


    /**
     * Gets the ID value for this ListTypeText.
     * 
     * @return ID   * ID of Text Element
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this ListTypeText.
     * 
     * @param ID   * ID of Text Element
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the content value for this ListTypeText.
     * 
     * @return content   * Text
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this ListTypeText.
     * 
     * @param content   * Text
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the soundPath value for this ListTypeText.
     * 
     * @return soundPath   * Referenz to the storage of the sound file as a UNC path.
     */
    public java.lang.String getSoundPath() {
        return soundPath;
    }


    /**
     * Sets the soundPath value for this ListTypeText.
     * 
     * @param soundPath   * Referenz to the storage of the sound file as a UNC path.
     */
    public void setSoundPath(java.lang.String soundPath) {
        this.soundPath = soundPath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListTypeText)) return false;
        ListTypeText other = (ListTypeText) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.soundPath==null && other.getSoundPath()==null) || 
             (this.soundPath!=null &&
              this.soundPath.equals(other.getSoundPath())));
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getSoundPath() != null) {
            _hashCode += getSoundPath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
