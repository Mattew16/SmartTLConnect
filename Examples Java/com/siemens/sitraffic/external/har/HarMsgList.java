/**
 * HarMsgList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.har;

public class HarMsgList  implements java.io.Serializable {
    /* Message item in List */
    private com.siemens.sitraffic.external.har.HarMsgListHarMsg[] harMsg;

    public HarMsgList() {
    }

    public HarMsgList(
           com.siemens.sitraffic.external.har.HarMsgListHarMsg[] harMsg) {
           this.harMsg = harMsg;
    }


    /**
     * Gets the harMsg value for this HarMsgList.
     * 
     * @return harMsg   * Message item in List
     */
    public com.siemens.sitraffic.external.har.HarMsgListHarMsg[] getHarMsg() {
        return harMsg;
    }


    /**
     * Sets the harMsg value for this HarMsgList.
     * 
     * @param harMsg   * Message item in List
     */
    public void setHarMsg(com.siemens.sitraffic.external.har.HarMsgListHarMsg[] harMsg) {
        this.harMsg = harMsg;
    }

    public com.siemens.sitraffic.external.har.HarMsgListHarMsg getHarMsg(int i) {
        return this.harMsg[i];
    }

    public void setHarMsg(int i, com.siemens.sitraffic.external.har.HarMsgListHarMsg _value) {
        this.harMsg[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HarMsgList)) return false;
        HarMsgList other = (HarMsgList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.harMsg==null && other.getHarMsg()==null) || 
             (this.harMsg!=null &&
              java.util.Arrays.equals(this.harMsg, other.getHarMsg())));
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
        if (getHarMsg() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHarMsg());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHarMsg(), i);
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
