/**
 * LinkLocationsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.action;

public class LinkLocationsType  implements java.io.Serializable {
    private com.siemens.sitraffic.external.action.LinkLocationType[] link;

    public LinkLocationsType() {
    }

    public LinkLocationsType(
           com.siemens.sitraffic.external.action.LinkLocationType[] link) {
           this.link = link;
    }


    /**
     * Gets the link value for this LinkLocationsType.
     * 
     * @return link
     */
    public com.siemens.sitraffic.external.action.LinkLocationType[] getLink() {
        return link;
    }


    /**
     * Sets the link value for this LinkLocationsType.
     * 
     * @param link
     */
    public void setLink(com.siemens.sitraffic.external.action.LinkLocationType[] link) {
        this.link = link;
    }

    public com.siemens.sitraffic.external.action.LinkLocationType getLink(int i) {
        return this.link[i];
    }

    public void setLink(int i, com.siemens.sitraffic.external.action.LinkLocationType _value) {
        this.link[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinkLocationsType)) return false;
        LinkLocationsType other = (LinkLocationsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.link==null && other.getLink()==null) || 
             (this.link!=null &&
              java.util.Arrays.equals(this.link, other.getLink())));
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
        if (getLink() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLink());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLink(), i);
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
