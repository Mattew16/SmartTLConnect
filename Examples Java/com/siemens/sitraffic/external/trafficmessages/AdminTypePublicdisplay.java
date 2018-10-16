/**
 * AdminTypePublicdisplay.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficmessages;

public class AdminTypePublicdisplay  implements java.io.Serializable {
    /* id of the defined text */
    private java.lang.String id;

    /* plain text */
    private java.lang.String text;

    /* language id */
    private java.lang.String language;

    private com.siemens.sitraffic.external.trafficmessages.AdminTypePublicdisplayKind kind;  // attribute

    public AdminTypePublicdisplay() {
    }

    public AdminTypePublicdisplay(
           java.lang.String id,
           java.lang.String text,
           java.lang.String language,
           com.siemens.sitraffic.external.trafficmessages.AdminTypePublicdisplayKind kind) {
           this.id = id;
           this.text = text;
           this.language = language;
           this.kind = kind;
    }


    /**
     * Gets the id value for this AdminTypePublicdisplay.
     * 
     * @return id   * id of the defined text
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this AdminTypePublicdisplay.
     * 
     * @param id   * id of the defined text
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the text value for this AdminTypePublicdisplay.
     * 
     * @return text   * plain text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this AdminTypePublicdisplay.
     * 
     * @param text   * plain text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the language value for this AdminTypePublicdisplay.
     * 
     * @return language   * language id
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this AdminTypePublicdisplay.
     * 
     * @param language   * language id
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the kind value for this AdminTypePublicdisplay.
     * 
     * @return kind
     */
    public com.siemens.sitraffic.external.trafficmessages.AdminTypePublicdisplayKind getKind() {
        return kind;
    }


    /**
     * Sets the kind value for this AdminTypePublicdisplay.
     * 
     * @param kind
     */
    public void setKind(com.siemens.sitraffic.external.trafficmessages.AdminTypePublicdisplayKind kind) {
        this.kind = kind;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdminTypePublicdisplay)) return false;
        AdminTypePublicdisplay other = (AdminTypePublicdisplay) obj;
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
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.kind==null && other.getKind()==null) || 
             (this.kind!=null &&
              this.kind.equals(other.getKind())));
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
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getKind() != null) {
            _hashCode += getKind().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
