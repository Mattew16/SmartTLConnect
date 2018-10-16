/**
 * TMType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficmessages;

public class TMType  implements java.io.Serializable {
    private com.siemens.sitraffic.external.trafficmessages.TMTypeAdmin admin;

    private com.siemens.sitraffic.external.trafficmessages.ValidityType[] validity;

    private com.siemens.sitraffic.external.trafficmessages.LocationType[] location;

    private java.lang.String[] description;

    private java.lang.String diversion;

    /* all equal or similar messages are referenced here */
    private com.siemens.sitraffic.external.trafficmessages.Depending_messagesType[] dependingmessages;

    /* comment with public flag */
    private com.siemens.sitraffic.external.trafficmessages.TMTypeComment comment;

    private com.siemens.sitraffic.external.trafficmessages.TMTypeState state;

    public TMType() {
    }

    public TMType(
           com.siemens.sitraffic.external.trafficmessages.TMTypeAdmin admin,
           com.siemens.sitraffic.external.trafficmessages.ValidityType[] validity,
           com.siemens.sitraffic.external.trafficmessages.LocationType[] location,
           java.lang.String[] description,
           java.lang.String diversion,
           com.siemens.sitraffic.external.trafficmessages.Depending_messagesType[] dependingmessages,
           com.siemens.sitraffic.external.trafficmessages.TMTypeComment comment,
           com.siemens.sitraffic.external.trafficmessages.TMTypeState state) {
           this.admin = admin;
           this.validity = validity;
           this.location = location;
           this.description = description;
           this.diversion = diversion;
           this.dependingmessages = dependingmessages;
           this.comment = comment;
           this.state = state;
    }


    /**
     * Gets the admin value for this TMType.
     * 
     * @return admin
     */
    public com.siemens.sitraffic.external.trafficmessages.TMTypeAdmin getAdmin() {
        return admin;
    }


    /**
     * Sets the admin value for this TMType.
     * 
     * @param admin
     */
    public void setAdmin(com.siemens.sitraffic.external.trafficmessages.TMTypeAdmin admin) {
        this.admin = admin;
    }


    /**
     * Gets the validity value for this TMType.
     * 
     * @return validity
     */
    public com.siemens.sitraffic.external.trafficmessages.ValidityType[] getValidity() {
        return validity;
    }


    /**
     * Sets the validity value for this TMType.
     * 
     * @param validity
     */
    public void setValidity(com.siemens.sitraffic.external.trafficmessages.ValidityType[] validity) {
        this.validity = validity;
    }

    public com.siemens.sitraffic.external.trafficmessages.ValidityType getValidity(int i) {
        return this.validity[i];
    }

    public void setValidity(int i, com.siemens.sitraffic.external.trafficmessages.ValidityType _value) {
        this.validity[i] = _value;
    }


    /**
     * Gets the location value for this TMType.
     * 
     * @return location
     */
    public com.siemens.sitraffic.external.trafficmessages.LocationType[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this TMType.
     * 
     * @param location
     */
    public void setLocation(com.siemens.sitraffic.external.trafficmessages.LocationType[] location) {
        this.location = location;
    }

    public com.siemens.sitraffic.external.trafficmessages.LocationType getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, com.siemens.sitraffic.external.trafficmessages.LocationType _value) {
        this.location[i] = _value;
    }


    /**
     * Gets the description value for this TMType.
     * 
     * @return description
     */
    public java.lang.String[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TMType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String[] description) {
        this.description = description;
    }

    public java.lang.String getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, java.lang.String _value) {
        this.description[i] = _value;
    }


    /**
     * Gets the diversion value for this TMType.
     * 
     * @return diversion
     */
    public java.lang.String getDiversion() {
        return diversion;
    }


    /**
     * Sets the diversion value for this TMType.
     * 
     * @param diversion
     */
    public void setDiversion(java.lang.String diversion) {
        this.diversion = diversion;
    }


    /**
     * Gets the dependingmessages value for this TMType.
     * 
     * @return dependingmessages   * all equal or similar messages are referenced here
     */
    public com.siemens.sitraffic.external.trafficmessages.Depending_messagesType[] getDependingmessages() {
        return dependingmessages;
    }


    /**
     * Sets the dependingmessages value for this TMType.
     * 
     * @param dependingmessages   * all equal or similar messages are referenced here
     */
    public void setDependingmessages(com.siemens.sitraffic.external.trafficmessages.Depending_messagesType[] dependingmessages) {
        this.dependingmessages = dependingmessages;
    }

    public com.siemens.sitraffic.external.trafficmessages.Depending_messagesType getDependingmessages(int i) {
        return this.dependingmessages[i];
    }

    public void setDependingmessages(int i, com.siemens.sitraffic.external.trafficmessages.Depending_messagesType _value) {
        this.dependingmessages[i] = _value;
    }


    /**
     * Gets the comment value for this TMType.
     * 
     * @return comment   * comment with public flag
     */
    public com.siemens.sitraffic.external.trafficmessages.TMTypeComment getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this TMType.
     * 
     * @param comment   * comment with public flag
     */
    public void setComment(com.siemens.sitraffic.external.trafficmessages.TMTypeComment comment) {
        this.comment = comment;
    }


    /**
     * Gets the state value for this TMType.
     * 
     * @return state
     */
    public com.siemens.sitraffic.external.trafficmessages.TMTypeState getState() {
        return state;
    }


    /**
     * Sets the state value for this TMType.
     * 
     * @param state
     */
    public void setState(com.siemens.sitraffic.external.trafficmessages.TMTypeState state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TMType)) return false;
        TMType other = (TMType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.admin==null && other.getAdmin()==null) || 
             (this.admin!=null &&
              this.admin.equals(other.getAdmin()))) &&
            ((this.validity==null && other.getValidity()==null) || 
             (this.validity!=null &&
              java.util.Arrays.equals(this.validity, other.getValidity()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.diversion==null && other.getDiversion()==null) || 
             (this.diversion!=null &&
              this.diversion.equals(other.getDiversion()))) &&
            ((this.dependingmessages==null && other.getDependingmessages()==null) || 
             (this.dependingmessages!=null &&
              java.util.Arrays.equals(this.dependingmessages, other.getDependingmessages()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState())));
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
        if (getAdmin() != null) {
            _hashCode += getAdmin().hashCode();
        }
        if (getValidity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValidity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValidity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        if (getDiversion() != null) {
            _hashCode += getDiversion().hashCode();
        }
        if (getDependingmessages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDependingmessages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDependingmessages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
