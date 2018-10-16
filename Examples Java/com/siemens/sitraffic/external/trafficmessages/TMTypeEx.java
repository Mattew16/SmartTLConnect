/**
 * TMTypeEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficmessages;


/**
 * Extented message with may contains unstructured additional data
 */
public class TMTypeEx  extends com.siemens.sitraffic.external.trafficmessages.TMType  implements java.io.Serializable {
    /* Additional unstructured informations. The kind of information
     * should be set using the "infoType" attribute. Please see the annotation
     * of the attribute for using this element. */
    private com.siemens.sitraffic.external.trafficmessages.TMTypeExAddInfo[] addInfo;

    public TMTypeEx() {
    }

    public TMTypeEx(
           com.siemens.sitraffic.external.trafficmessages.TMTypeAdmin admin,
           com.siemens.sitraffic.external.trafficmessages.ValidityType[] validity,
           com.siemens.sitraffic.external.trafficmessages.LocationType[] location,
           java.lang.String[] description,
           java.lang.String diversion,
           com.siemens.sitraffic.external.trafficmessages.Depending_messagesType[] dependingmessages,
           com.siemens.sitraffic.external.trafficmessages.TMTypeComment comment,
           com.siemens.sitraffic.external.trafficmessages.TMTypeState state,
           com.siemens.sitraffic.external.trafficmessages.TMTypeExAddInfo[] addInfo) {
        super(
            admin,
            validity,
            location,
            description,
            diversion,
            dependingmessages,
            comment,
            state);
        this.addInfo = addInfo;
    }


    /**
     * Gets the addInfo value for this TMTypeEx.
     * 
     * @return addInfo   * Additional unstructured informations. The kind of information
     * should be set using the "infoType" attribute. Please see the annotation
     * of the attribute for using this element.
     */
    public com.siemens.sitraffic.external.trafficmessages.TMTypeExAddInfo[] getAddInfo() {
        return addInfo;
    }


    /**
     * Sets the addInfo value for this TMTypeEx.
     * 
     * @param addInfo   * Additional unstructured informations. The kind of information
     * should be set using the "infoType" attribute. Please see the annotation
     * of the attribute for using this element.
     */
    public void setAddInfo(com.siemens.sitraffic.external.trafficmessages.TMTypeExAddInfo[] addInfo) {
        this.addInfo = addInfo;
    }

    public com.siemens.sitraffic.external.trafficmessages.TMTypeExAddInfo getAddInfo(int i) {
        return this.addInfo[i];
    }

    public void setAddInfo(int i, com.siemens.sitraffic.external.trafficmessages.TMTypeExAddInfo _value) {
        this.addInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TMTypeEx)) return false;
        TMTypeEx other = (TMTypeEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.addInfo==null && other.getAddInfo()==null) || 
             (this.addInfo!=null &&
              java.util.Arrays.equals(this.addInfo, other.getAddInfo())));
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
        if (getAddInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddInfo(), i);
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
