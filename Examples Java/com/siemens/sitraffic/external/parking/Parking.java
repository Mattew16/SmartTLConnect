/**
 * Parking.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.parking;

public class Parking  implements java.io.Serializable {
    /* Objecttype: ParkingFacility_Description, ParkingDistrict_Description,
     * ParkingArea_Description */
    private com.siemens.sitraffic.external.global.Description[] description;

    /* Objecttype: ParkingFacility_Values, ParkingDistrict_Values,
     * ParkingArea_Values */
    private com.siemens.sitraffic.external.parking.ParkingData[] data;

    /* Object type: ParkingDisplayMachine_Description, EPOS_Description */
    private com.siemens.sitraffic.external.parking.PdmDescriptionType pdmDescription;

    /* Object type: ParkingDisplayMachine_Values */
    private com.siemens.sitraffic.external.parking.PdmDataType pdmData;

    /* Object type: EPOS_Values */
    private com.siemens.sitraffic.external.parking.EposDataType eposData;

    public Parking() {
    }

    public Parking(
           com.siemens.sitraffic.external.global.Description[] description,
           com.siemens.sitraffic.external.parking.ParkingData[] data,
           com.siemens.sitraffic.external.parking.PdmDescriptionType pdmDescription,
           com.siemens.sitraffic.external.parking.PdmDataType pdmData,
           com.siemens.sitraffic.external.parking.EposDataType eposData) {
           this.description = description;
           this.data = data;
           this.pdmDescription = pdmDescription;
           this.pdmData = pdmData;
           this.eposData = eposData;
    }


    /**
     * Gets the description value for this Parking.
     * 
     * @return description   * Objecttype: ParkingFacility_Description, ParkingDistrict_Description,
     * ParkingArea_Description
     */
    public com.siemens.sitraffic.external.global.Description[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Parking.
     * 
     * @param description   * Objecttype: ParkingFacility_Description, ParkingDistrict_Description,
     * ParkingArea_Description
     */
    public void setDescription(com.siemens.sitraffic.external.global.Description[] description) {
        this.description = description;
    }

    public com.siemens.sitraffic.external.global.Description getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, com.siemens.sitraffic.external.global.Description _value) {
        this.description[i] = _value;
    }


    /**
     * Gets the data value for this Parking.
     * 
     * @return data   * Objecttype: ParkingFacility_Values, ParkingDistrict_Values,
     * ParkingArea_Values
     */
    public com.siemens.sitraffic.external.parking.ParkingData[] getData() {
        return data;
    }


    /**
     * Sets the data value for this Parking.
     * 
     * @param data   * Objecttype: ParkingFacility_Values, ParkingDistrict_Values,
     * ParkingArea_Values
     */
    public void setData(com.siemens.sitraffic.external.parking.ParkingData[] data) {
        this.data = data;
    }

    public com.siemens.sitraffic.external.parking.ParkingData getData(int i) {
        return this.data[i];
    }

    public void setData(int i, com.siemens.sitraffic.external.parking.ParkingData _value) {
        this.data[i] = _value;
    }


    /**
     * Gets the pdmDescription value for this Parking.
     * 
     * @return pdmDescription   * Object type: ParkingDisplayMachine_Description, EPOS_Description
     */
    public com.siemens.sitraffic.external.parking.PdmDescriptionType getPdmDescription() {
        return pdmDescription;
    }


    /**
     * Sets the pdmDescription value for this Parking.
     * 
     * @param pdmDescription   * Object type: ParkingDisplayMachine_Description, EPOS_Description
     */
    public void setPdmDescription(com.siemens.sitraffic.external.parking.PdmDescriptionType pdmDescription) {
        this.pdmDescription = pdmDescription;
    }


    /**
     * Gets the pdmData value for this Parking.
     * 
     * @return pdmData   * Object type: ParkingDisplayMachine_Values
     */
    public com.siemens.sitraffic.external.parking.PdmDataType getPdmData() {
        return pdmData;
    }


    /**
     * Sets the pdmData value for this Parking.
     * 
     * @param pdmData   * Object type: ParkingDisplayMachine_Values
     */
    public void setPdmData(com.siemens.sitraffic.external.parking.PdmDataType pdmData) {
        this.pdmData = pdmData;
    }


    /**
     * Gets the eposData value for this Parking.
     * 
     * @return eposData   * Object type: EPOS_Values
     */
    public com.siemens.sitraffic.external.parking.EposDataType getEposData() {
        return eposData;
    }


    /**
     * Sets the eposData value for this Parking.
     * 
     * @param eposData   * Object type: EPOS_Values
     */
    public void setEposData(com.siemens.sitraffic.external.parking.EposDataType eposData) {
        this.eposData = eposData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Parking)) return false;
        Parking other = (Parking) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              java.util.Arrays.equals(this.data, other.getData()))) &&
            ((this.pdmDescription==null && other.getPdmDescription()==null) || 
             (this.pdmDescription!=null &&
              this.pdmDescription.equals(other.getPdmDescription()))) &&
            ((this.pdmData==null && other.getPdmData()==null) || 
             (this.pdmData!=null &&
              this.pdmData.equals(other.getPdmData()))) &&
            ((this.eposData==null && other.getEposData()==null) || 
             (this.eposData!=null &&
              this.eposData.equals(other.getEposData())));
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
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPdmDescription() != null) {
            _hashCode += getPdmDescription().hashCode();
        }
        if (getPdmData() != null) {
            _hashCode += getPdmData().hashCode();
        }
        if (getEposData() != null) {
            _hashCode += getEposData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
