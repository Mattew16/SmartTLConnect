/**
 * LocationTypeNetNet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;

public class LocationTypeNetNet  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedLong knotennr;

    /* Attributaenderung ab diesem Knoten. Wenn keine Angabe Attribut
     * des Vorgaengers. Wenn in keinem Knoten verfügbar, dann gilt der Defaultwert. */
    private com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNetNetAttributsaenderung[] attributsaenderung;

    public LocationTypeNetNet() {
    }

    public LocationTypeNetNet(
           org.apache.axis.types.UnsignedLong knotennr,
           com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNetNetAttributsaenderung[] attributsaenderung) {
           this.knotennr = knotennr;
           this.attributsaenderung = attributsaenderung;
    }


    /**
     * Gets the knotennr value for this LocationTypeNetNet.
     * 
     * @return knotennr
     */
    public org.apache.axis.types.UnsignedLong getKnotennr() {
        return knotennr;
    }


    /**
     * Sets the knotennr value for this LocationTypeNetNet.
     * 
     * @param knotennr
     */
    public void setKnotennr(org.apache.axis.types.UnsignedLong knotennr) {
        this.knotennr = knotennr;
    }


    /**
     * Gets the attributsaenderung value for this LocationTypeNetNet.
     * 
     * @return attributsaenderung   * Attributaenderung ab diesem Knoten. Wenn keine Angabe Attribut
     * des Vorgaengers. Wenn in keinem Knoten verfügbar, dann gilt der Defaultwert.
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNetNetAttributsaenderung[] getAttributsaenderung() {
        return attributsaenderung;
    }


    /**
     * Sets the attributsaenderung value for this LocationTypeNetNet.
     * 
     * @param attributsaenderung   * Attributaenderung ab diesem Knoten. Wenn keine Angabe Attribut
     * des Vorgaengers. Wenn in keinem Knoten verfügbar, dann gilt der Defaultwert.
     */
    public void setAttributsaenderung(com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNetNetAttributsaenderung[] attributsaenderung) {
        this.attributsaenderung = attributsaenderung;
    }

    public com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNetNetAttributsaenderung getAttributsaenderung(int i) {
        return this.attributsaenderung[i];
    }

    public void setAttributsaenderung(int i, com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNetNetAttributsaenderung _value) {
        this.attributsaenderung[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationTypeNetNet)) return false;
        LocationTypeNetNet other = (LocationTypeNetNet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.knotennr==null && other.getKnotennr()==null) || 
             (this.knotennr!=null &&
              this.knotennr.equals(other.getKnotennr()))) &&
            ((this.attributsaenderung==null && other.getAttributsaenderung()==null) || 
             (this.attributsaenderung!=null &&
              java.util.Arrays.equals(this.attributsaenderung, other.getAttributsaenderung())));
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
        if (getKnotennr() != null) {
            _hashCode += getKnotennr().hashCode();
        }
        if (getAttributsaenderung() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributsaenderung());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributsaenderung(), i);
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
