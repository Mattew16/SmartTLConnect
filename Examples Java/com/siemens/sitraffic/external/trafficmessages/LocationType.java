/**
 * LocationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficmessages;

public class LocationType  implements java.io.Serializable {
    /* city */
    private java.lang.String city;

    /* district */
    private java.lang.String district;

    /* road decription */
    private com.siemens.sitraffic.external.trafficmessages.LocationTypeRoaddescription roaddescription;

    /* coordinates */
    private com.siemens.sitraffic.external.trafficmessages.LocationTypeCo_description[] co_description;

    private com.siemens.sitraffic.external.trafficmessages.RestrictionType[] restriction;

    /* predefined location code, e.g. RDS- TMC location code or  other
     * fixed predefined location ids */
    private com.siemens.sitraffic.external.trafficmessages.LocationTypeReference[] reference;

    /* location code according to a detection net or original street
     * map with link ids and startnodes */
    private com.siemens.sitraffic.external.trafficmessages.LocationTypeNetref[] netref;

    public LocationType() {
    }

    public LocationType(
           java.lang.String city,
           java.lang.String district,
           com.siemens.sitraffic.external.trafficmessages.LocationTypeRoaddescription roaddescription,
           com.siemens.sitraffic.external.trafficmessages.LocationTypeCo_description[] co_description,
           com.siemens.sitraffic.external.trafficmessages.RestrictionType[] restriction,
           com.siemens.sitraffic.external.trafficmessages.LocationTypeReference[] reference,
           com.siemens.sitraffic.external.trafficmessages.LocationTypeNetref[] netref) {
           this.city = city;
           this.district = district;
           this.roaddescription = roaddescription;
           this.co_description = co_description;
           this.restriction = restriction;
           this.reference = reference;
           this.netref = netref;
    }


    /**
     * Gets the city value for this LocationType.
     * 
     * @return city   * city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this LocationType.
     * 
     * @param city   * city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the district value for this LocationType.
     * 
     * @return district   * district
     */
    public java.lang.String getDistrict() {
        return district;
    }


    /**
     * Sets the district value for this LocationType.
     * 
     * @param district   * district
     */
    public void setDistrict(java.lang.String district) {
        this.district = district;
    }


    /**
     * Gets the roaddescription value for this LocationType.
     * 
     * @return roaddescription   * road decription
     */
    public com.siemens.sitraffic.external.trafficmessages.LocationTypeRoaddescription getRoaddescription() {
        return roaddescription;
    }


    /**
     * Sets the roaddescription value for this LocationType.
     * 
     * @param roaddescription   * road decription
     */
    public void setRoaddescription(com.siemens.sitraffic.external.trafficmessages.LocationTypeRoaddescription roaddescription) {
        this.roaddescription = roaddescription;
    }


    /**
     * Gets the co_description value for this LocationType.
     * 
     * @return co_description   * coordinates
     */
    public com.siemens.sitraffic.external.trafficmessages.LocationTypeCo_description[] getCo_description() {
        return co_description;
    }


    /**
     * Sets the co_description value for this LocationType.
     * 
     * @param co_description   * coordinates
     */
    public void setCo_description(com.siemens.sitraffic.external.trafficmessages.LocationTypeCo_description[] co_description) {
        this.co_description = co_description;
    }

    public com.siemens.sitraffic.external.trafficmessages.LocationTypeCo_description getCo_description(int i) {
        return this.co_description[i];
    }

    public void setCo_description(int i, com.siemens.sitraffic.external.trafficmessages.LocationTypeCo_description _value) {
        this.co_description[i] = _value;
    }


    /**
     * Gets the restriction value for this LocationType.
     * 
     * @return restriction
     */
    public com.siemens.sitraffic.external.trafficmessages.RestrictionType[] getRestriction() {
        return restriction;
    }


    /**
     * Sets the restriction value for this LocationType.
     * 
     * @param restriction
     */
    public void setRestriction(com.siemens.sitraffic.external.trafficmessages.RestrictionType[] restriction) {
        this.restriction = restriction;
    }

    public com.siemens.sitraffic.external.trafficmessages.RestrictionType getRestriction(int i) {
        return this.restriction[i];
    }

    public void setRestriction(int i, com.siemens.sitraffic.external.trafficmessages.RestrictionType _value) {
        this.restriction[i] = _value;
    }


    /**
     * Gets the reference value for this LocationType.
     * 
     * @return reference   * predefined location code, e.g. RDS- TMC location code or  other
     * fixed predefined location ids
     */
    public com.siemens.sitraffic.external.trafficmessages.LocationTypeReference[] getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this LocationType.
     * 
     * @param reference   * predefined location code, e.g. RDS- TMC location code or  other
     * fixed predefined location ids
     */
    public void setReference(com.siemens.sitraffic.external.trafficmessages.LocationTypeReference[] reference) {
        this.reference = reference;
    }

    public com.siemens.sitraffic.external.trafficmessages.LocationTypeReference getReference(int i) {
        return this.reference[i];
    }

    public void setReference(int i, com.siemens.sitraffic.external.trafficmessages.LocationTypeReference _value) {
        this.reference[i] = _value;
    }


    /**
     * Gets the netref value for this LocationType.
     * 
     * @return netref   * location code according to a detection net or original street
     * map with link ids and startnodes
     */
    public com.siemens.sitraffic.external.trafficmessages.LocationTypeNetref[] getNetref() {
        return netref;
    }


    /**
     * Sets the netref value for this LocationType.
     * 
     * @param netref   * location code according to a detection net or original street
     * map with link ids and startnodes
     */
    public void setNetref(com.siemens.sitraffic.external.trafficmessages.LocationTypeNetref[] netref) {
        this.netref = netref;
    }

    public com.siemens.sitraffic.external.trafficmessages.LocationTypeNetref getNetref(int i) {
        return this.netref[i];
    }

    public void setNetref(int i, com.siemens.sitraffic.external.trafficmessages.LocationTypeNetref _value) {
        this.netref[i] = _value;
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
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.district==null && other.getDistrict()==null) || 
             (this.district!=null &&
              this.district.equals(other.getDistrict()))) &&
            ((this.roaddescription==null && other.getRoaddescription()==null) || 
             (this.roaddescription!=null &&
              this.roaddescription.equals(other.getRoaddescription()))) &&
            ((this.co_description==null && other.getCo_description()==null) || 
             (this.co_description!=null &&
              java.util.Arrays.equals(this.co_description, other.getCo_description()))) &&
            ((this.restriction==null && other.getRestriction()==null) || 
             (this.restriction!=null &&
              java.util.Arrays.equals(this.restriction, other.getRestriction()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              java.util.Arrays.equals(this.reference, other.getReference()))) &&
            ((this.netref==null && other.getNetref()==null) || 
             (this.netref!=null &&
              java.util.Arrays.equals(this.netref, other.getNetref())));
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
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getDistrict() != null) {
            _hashCode += getDistrict().hashCode();
        }
        if (getRoaddescription() != null) {
            _hashCode += getRoaddescription().hashCode();
        }
        if (getCo_description() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCo_description());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCo_description(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRestriction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRestriction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRestriction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetref(), i);
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
