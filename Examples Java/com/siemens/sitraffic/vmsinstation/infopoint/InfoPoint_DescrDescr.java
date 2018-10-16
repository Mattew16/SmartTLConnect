/**
 * InfoPoint_DescrDescr.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;

public class InfoPoint_DescrDescr  extends com.siemens.sitraffic.vmsinstation.infopoint.DescrType  implements java.io.Serializable {
    private com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DescrDescrDisplayDescription[] displayDescription;

    public InfoPoint_DescrDescr() {
    }

    public InfoPoint_DescrDescr(
           org.apache.axis.types.Id id,
           java.lang.String name,
           java.lang.String subsystem,
           java.lang.Object subtyp,
           com.siemens.sitraffic.vmsinstation.infopoint.LocationType location,
           org.apache.axis.types.Id[] rel_Ids,
           java.lang.String addInfo,
           com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DescrDescrDisplayDescription[] displayDescription) {
        super(
            id,
            name,
            subsystem,
            subtyp,
            location,
            rel_Ids,
            addInfo);
        this.displayDescription = displayDescription;
    }


    /**
     * Gets the displayDescription value for this InfoPoint_DescrDescr.
     * 
     * @return displayDescription
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DescrDescrDisplayDescription[] getDisplayDescription() {
        return displayDescription;
    }


    /**
     * Sets the displayDescription value for this InfoPoint_DescrDescr.
     * 
     * @param displayDescription
     */
    public void setDisplayDescription(com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DescrDescrDisplayDescription[] displayDescription) {
        this.displayDescription = displayDescription;
    }

    public com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DescrDescrDisplayDescription getDisplayDescription(int i) {
        return this.displayDescription[i];
    }

    public void setDisplayDescription(int i, com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DescrDescrDisplayDescription _value) {
        this.displayDescription[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoPoint_DescrDescr)) return false;
        InfoPoint_DescrDescr other = (InfoPoint_DescrDescr) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.displayDescription==null && other.getDisplayDescription()==null) || 
             (this.displayDescription!=null &&
              java.util.Arrays.equals(this.displayDescription, other.getDisplayDescription())));
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
        if (getDisplayDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisplayDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisplayDescription(), i);
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
