/**
 * InfoPoint_DescrDescrDisplayDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;

public class InfoPoint_DescrDescrDisplayDescription  implements java.io.Serializable {
    private org.apache.axis.types.Id id;

    /* Caption of display unit for GUI representation */
    private java.lang.String caption;

    public InfoPoint_DescrDescrDisplayDescription() {
    }

    public InfoPoint_DescrDescrDisplayDescription(
           org.apache.axis.types.Id id,
           java.lang.String caption) {
           this.id = id;
           this.caption = caption;
    }


    /**
     * Gets the id value for this InfoPoint_DescrDescrDisplayDescription.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this InfoPoint_DescrDescrDisplayDescription.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the caption value for this InfoPoint_DescrDescrDisplayDescription.
     * 
     * @return caption   * Caption of display unit for GUI representation
     */
    public java.lang.String getCaption() {
        return caption;
    }


    /**
     * Sets the caption value for this InfoPoint_DescrDescrDisplayDescription.
     * 
     * @param caption   * Caption of display unit for GUI representation
     */
    public void setCaption(java.lang.String caption) {
        this.caption = caption;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoPoint_DescrDescrDisplayDescription)) return false;
        InfoPoint_DescrDescrDisplayDescription other = (InfoPoint_DescrDescrDisplayDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.caption==null && other.getCaption()==null) || 
             (this.caption!=null &&
              this.caption.equals(other.getCaption())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getCaption() != null) {
            _hashCode += getCaption().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
