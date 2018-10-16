/**
 * LocationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;


/**
 * Location of an object
 */
public class LocationType  implements java.io.Serializable {
    /* Textual description like city district or further . */
    private java.lang.String locDescr;

    /* Reference by road name */
    private com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeRoads[] roads;

    /* Georeference by coordinates */
    private com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeGeom[] geom;

    /* GeoReference by links */
    private com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNet[] net;

    public LocationType() {
    }

    public LocationType(
           java.lang.String locDescr,
           com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeRoads[] roads,
           com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeGeom[] geom,
           com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNet[] net) {
           this.locDescr = locDescr;
           this.roads = roads;
           this.geom = geom;
           this.net = net;
    }


    /**
     * Gets the locDescr value for this LocationType.
     * 
     * @return locDescr   * Textual description like city district or further .
     */
    public java.lang.String getLocDescr() {
        return locDescr;
    }


    /**
     * Sets the locDescr value for this LocationType.
     * 
     * @param locDescr   * Textual description like city district or further .
     */
    public void setLocDescr(java.lang.String locDescr) {
        this.locDescr = locDescr;
    }


    /**
     * Gets the roads value for this LocationType.
     * 
     * @return roads   * Reference by road name
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeRoads[] getRoads() {
        return roads;
    }


    /**
     * Sets the roads value for this LocationType.
     * 
     * @param roads   * Reference by road name
     */
    public void setRoads(com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeRoads[] roads) {
        this.roads = roads;
    }

    public com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeRoads getRoads(int i) {
        return this.roads[i];
    }

    public void setRoads(int i, com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeRoads _value) {
        this.roads[i] = _value;
    }


    /**
     * Gets the geom value for this LocationType.
     * 
     * @return geom   * Georeference by coordinates
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeGeom[] getGeom() {
        return geom;
    }


    /**
     * Sets the geom value for this LocationType.
     * 
     * @param geom   * Georeference by coordinates
     */
    public void setGeom(com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeGeom[] geom) {
        this.geom = geom;
    }

    public com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeGeom getGeom(int i) {
        return this.geom[i];
    }

    public void setGeom(int i, com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeGeom _value) {
        this.geom[i] = _value;
    }


    /**
     * Gets the net value for this LocationType.
     * 
     * @return net   * GeoReference by links
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNet[] getNet() {
        return net;
    }


    /**
     * Sets the net value for this LocationType.
     * 
     * @param net   * GeoReference by links
     */
    public void setNet(com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNet[] net) {
        this.net = net;
    }

    public com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNet getNet(int i) {
        return this.net[i];
    }

    public void setNet(int i, com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNet _value) {
        this.net[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationType)) return false;
        LocationType other = (LocationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.locDescr==null && other.getLocDescr()==null) || 
             (this.locDescr!=null &&
              this.locDescr.equals(other.getLocDescr()))) &&
            ((this.roads==null && other.getRoads()==null) || 
             (this.roads!=null &&
              java.util.Arrays.equals(this.roads, other.getRoads()))) &&
            ((this.geom==null && other.getGeom()==null) || 
             (this.geom!=null &&
              java.util.Arrays.equals(this.geom, other.getGeom()))) &&
            ((this.net==null && other.getNet()==null) || 
             (this.net!=null &&
              java.util.Arrays.equals(this.net, other.getNet())));
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
        if (getLocDescr() != null) {
            _hashCode += getLocDescr().hashCode();
        }
        if (getRoads() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoads());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoads(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGeom() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGeom());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGeom(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNet(), i);
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
