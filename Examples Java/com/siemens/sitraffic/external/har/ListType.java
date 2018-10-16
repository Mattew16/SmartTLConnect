/**
 * ListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.har;

public class ListType  implements java.io.Serializable {
    /* Text Item in List */
    private com.siemens.sitraffic.external.har.ListTypeText[] text;

    public ListType() {
    }

    public ListType(
           com.siemens.sitraffic.external.har.ListTypeText[] text) {
           this.text = text;
    }


    /**
     * Gets the text value for this ListType.
     * 
     * @return text   * Text Item in List
     */
    public com.siemens.sitraffic.external.har.ListTypeText[] getText() {
        return text;
    }


    /**
     * Sets the text value for this ListType.
     * 
     * @param text   * Text Item in List
     */
    public void setText(com.siemens.sitraffic.external.har.ListTypeText[] text) {
        this.text = text;
    }

    public com.siemens.sitraffic.external.har.ListTypeText getText(int i) {
        return this.text[i];
    }

    public void setText(int i, com.siemens.sitraffic.external.har.ListTypeText _value) {
        this.text[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListType)) return false;
        ListType other = (ListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              java.util.Arrays.equals(this.text, other.getText())));
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
        if (getText() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getText());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getText(), i);
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
