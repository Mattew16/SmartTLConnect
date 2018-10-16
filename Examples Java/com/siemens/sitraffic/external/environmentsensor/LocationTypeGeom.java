/**
 * LocationTypeGeom.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.environmentsensor;

public class LocationTypeGeom  implements java.io.Serializable {
    /* Coordinates fitting to one point, one line or an area */
    private com.siemens.sitraffic.external.environmentsensor.LocationTypeGeomCO[] CO;

    /* true in case of an area */
    private boolean type;

    /* Information about the used coordinate system */
    private com.siemens.sitraffic.external.environmentsensor.LocationTypeGeomSystem system;

    public LocationTypeGeom() {
    }

    public LocationTypeGeom(
           com.siemens.sitraffic.external.environmentsensor.LocationTypeGeomCO[] CO,
           boolean type,
           com.siemens.sitraffic.external.environmentsensor.LocationTypeGeomSystem system) {
           this.CO = CO;
           this.type = type;
           this.system = system;
    }


    /**
     * Gets the CO value for this LocationTypeGeom.
     * 
     * @return CO   * Coordinates fitting to one point, one line or an area
     */
    public com.siemens.sitraffic.external.environmentsensor.LocationTypeGeomCO[] getCO() {
        return CO;
    }


    /**
     * Sets the CO value for this LocationTypeGeom.
     * 
     * @param CO   * Coordinates fitting to one point, one line or an area
     */
    public void setCO(com.siemens.sitraffic.external.environmentsensor.LocationTypeGeomCO[] CO) {
        this.CO = CO;
    }

    public com.siemens.sitraffic.external.environmentsensor.LocationTypeGeomCO getCO(int i) {
        return this.CO[i];
    }

    public void setCO(int i, com.siemens.sitraffic.external.environmentsensor.LocationTypeGeomCO _value) {
        this.CO[i] = _value;
    }


    /**
     * Gets the type value for this LocationTypeGeom.
     * 
     * @return type   * true in case of an area
     */
    public boolean isType() {
        return type;
    }


    /**
     * Sets the type value for this LocationTypeGeom.
     * 
     * @param type   * true in case of an area
     */
    public void setType(boolean type) {
        this.type = type;
    }


    /**
     * Gets the system value for this LocationTypeGeom.
     * 
     * @return system   * Information about the used coordinate system
     */
    public com.siemens.sitraffic.external.environmentsensor.LocationTypeGeomSystem getSystem() {
        return system;
    }


    /**
     * Sets the system value for this LocationTypeGeom.
     * 
     * @param system   * Information about the used coordinate system
     */
    public void setSystem(com.siemens.sitraffic.external.environmentsensor.LocationTypeGeomSystem system) {
        this.system = system;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationTypeGeom)) return false;
        LocationTypeGeom other = (LocationTypeGeom) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CO==null && other.getCO()==null) || 
             (this.CO!=null &&
              java.util.Arrays.equals(this.CO, other.getCO()))) &&
            this.type == other.isType() &&
            ((this.system==null && other.getSystem()==null) || 
             (this.system!=null &&
              this.system.equals(other.getSystem())));
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
        if (getCO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isType() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSystem() != null) {
            _hashCode += getSystem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
