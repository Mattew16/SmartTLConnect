/**
 * CmdTypeList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.har;

public class CmdTypeList  extends com.siemens.sitraffic.external.har.ListType  implements java.io.Serializable {
    private com.siemens.sitraffic.external.har.CmdTypeListLevel level;  // attribute

    public CmdTypeList() {
    }

    public CmdTypeList(
           com.siemens.sitraffic.external.har.ListTypeText[] text,
           com.siemens.sitraffic.external.har.CmdTypeListLevel level) {
        super(
            text);
        this.level = level;
    }


    /**
     * Gets the level value for this CmdTypeList.
     * 
     * @return level
     */
    public com.siemens.sitraffic.external.har.CmdTypeListLevel getLevel() {
        return level;
    }


    /**
     * Sets the level value for this CmdTypeList.
     * 
     * @param level
     */
    public void setLevel(com.siemens.sitraffic.external.har.CmdTypeListLevel level) {
        this.level = level;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmdTypeList)) return false;
        CmdTypeList other = (CmdTypeList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel())));
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
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
