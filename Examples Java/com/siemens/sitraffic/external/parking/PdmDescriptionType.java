/**
 * PdmDescriptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.parking;

public class PdmDescriptionType  extends com.siemens.sitraffic.external.global.Description  implements java.io.Serializable {
    private int globalAreaCode;

    private long processorId;

    public PdmDescriptionType() {
    }

    public PdmDescriptionType(
           java.lang.String id,
           java.lang.String name,
           java.lang.String descriptionText,
           java.lang.String[] rel_Ids,
           java.lang.String type,
           java.lang.String subtype,
           java.lang.String subsystem,
           com.siemens.sitraffic.external.global.LocationType location,
           java.lang.String addInfo,
           java.lang.String category,
           com.siemens.sitraffic.external.global.ServiceExtension[] serviceInfo,
           int globalAreaCode,
           long processorId) {
        super(
            id,
            name,
            descriptionText,
            rel_Ids,
            type,
            subtype,
            subsystem,
            location,
            addInfo,
            category,
            serviceInfo);
        this.globalAreaCode = globalAreaCode;
        this.processorId = processorId;
    }


    /**
     * Gets the globalAreaCode value for this PdmDescriptionType.
     * 
     * @return globalAreaCode
     */
    public int getGlobalAreaCode() {
        return globalAreaCode;
    }


    /**
     * Sets the globalAreaCode value for this PdmDescriptionType.
     * 
     * @param globalAreaCode
     */
    public void setGlobalAreaCode(int globalAreaCode) {
        this.globalAreaCode = globalAreaCode;
    }


    /**
     * Gets the processorId value for this PdmDescriptionType.
     * 
     * @return processorId
     */
    public long getProcessorId() {
        return processorId;
    }


    /**
     * Sets the processorId value for this PdmDescriptionType.
     * 
     * @param processorId
     */
    public void setProcessorId(long processorId) {
        this.processorId = processorId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PdmDescriptionType)) return false;
        PdmDescriptionType other = (PdmDescriptionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.globalAreaCode == other.getGlobalAreaCode() &&
            this.processorId == other.getProcessorId();
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
        _hashCode += getGlobalAreaCode();
        _hashCode += new Long(getProcessorId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
