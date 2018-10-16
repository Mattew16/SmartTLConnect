/**
 * LocationTypeNetNetAttributsaenderung.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.environmentsensor;

public class LocationTypeNetNetAttributsaenderung  implements java.io.Serializable {
    private com.siemens.sitraffic.external.environmentsensor.LocationTypeNetNetAttributsaenderungTyp typ;

    private org.apache.axis.types.UnsignedLong basiswert;

    private org.apache.axis.types.UnsignedLong neuerwert;

    public LocationTypeNetNetAttributsaenderung() {
    }

    public LocationTypeNetNetAttributsaenderung(
           com.siemens.sitraffic.external.environmentsensor.LocationTypeNetNetAttributsaenderungTyp typ,
           org.apache.axis.types.UnsignedLong basiswert,
           org.apache.axis.types.UnsignedLong neuerwert) {
           this.typ = typ;
           this.basiswert = basiswert;
           this.neuerwert = neuerwert;
    }


    /**
     * Gets the typ value for this LocationTypeNetNetAttributsaenderung.
     * 
     * @return typ
     */
    public com.siemens.sitraffic.external.environmentsensor.LocationTypeNetNetAttributsaenderungTyp getTyp() {
        return typ;
    }


    /**
     * Sets the typ value for this LocationTypeNetNetAttributsaenderung.
     * 
     * @param typ
     */
    public void setTyp(com.siemens.sitraffic.external.environmentsensor.LocationTypeNetNetAttributsaenderungTyp typ) {
        this.typ = typ;
    }


    /**
     * Gets the basiswert value for this LocationTypeNetNetAttributsaenderung.
     * 
     * @return basiswert
     */
    public org.apache.axis.types.UnsignedLong getBasiswert() {
        return basiswert;
    }


    /**
     * Sets the basiswert value for this LocationTypeNetNetAttributsaenderung.
     * 
     * @param basiswert
     */
    public void setBasiswert(org.apache.axis.types.UnsignedLong basiswert) {
        this.basiswert = basiswert;
    }


    /**
     * Gets the neuerwert value for this LocationTypeNetNetAttributsaenderung.
     * 
     * @return neuerwert
     */
    public org.apache.axis.types.UnsignedLong getNeuerwert() {
        return neuerwert;
    }


    /**
     * Sets the neuerwert value for this LocationTypeNetNetAttributsaenderung.
     * 
     * @param neuerwert
     */
    public void setNeuerwert(org.apache.axis.types.UnsignedLong neuerwert) {
        this.neuerwert = neuerwert;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationTypeNetNetAttributsaenderung)) return false;
        LocationTypeNetNetAttributsaenderung other = (LocationTypeNetNetAttributsaenderung) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.typ==null && other.getTyp()==null) || 
             (this.typ!=null &&
              this.typ.equals(other.getTyp()))) &&
            ((this.basiswert==null && other.getBasiswert()==null) || 
             (this.basiswert!=null &&
              this.basiswert.equals(other.getBasiswert()))) &&
            ((this.neuerwert==null && other.getNeuerwert()==null) || 
             (this.neuerwert!=null &&
              this.neuerwert.equals(other.getNeuerwert())));
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
        if (getTyp() != null) {
            _hashCode += getTyp().hashCode();
        }
        if (getBasiswert() != null) {
            _hashCode += getBasiswert().hashCode();
        }
        if (getNeuerwert() != null) {
            _hashCode += getNeuerwert().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
