/**
 * HarStatusPlaylist.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.har;

public class HarStatusPlaylist  extends com.siemens.sitraffic.external.har.HarMsgList  implements java.io.Serializable {
    public HarStatusPlaylist() {
    }

    public HarStatusPlaylist(
           com.siemens.sitraffic.external.har.HarMsgListHarMsg[] harMsg) {
        super(
            harMsg);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HarStatusPlaylist)) return false;
        HarStatusPlaylist other = (HarStatusPlaylist) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

}
