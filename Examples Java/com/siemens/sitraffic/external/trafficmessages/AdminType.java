/**
 * AdminType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficmessages;

public class AdminType  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String subsystem;

    private java.lang.String name;

    private java.lang.String subtype;

    private java.lang.String severity;

    private java.lang.String category;

    private com.siemens.sitraffic.external.trafficmessages.AdminTypePublicdisplay[] publicdisplay;

    public AdminType() {
    }

    public AdminType(
           java.lang.String id,
           java.lang.String subsystem,
           java.lang.String name,
           java.lang.String subtype,
           java.lang.String severity,
           java.lang.String category,
           com.siemens.sitraffic.external.trafficmessages.AdminTypePublicdisplay[] publicdisplay) {
           this.id = id;
           this.subsystem = subsystem;
           this.name = name;
           this.subtype = subtype;
           this.severity = severity;
           this.category = category;
           this.publicdisplay = publicdisplay;
    }


    /**
     * Gets the id value for this AdminType.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this AdminType.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the subsystem value for this AdminType.
     * 
     * @return subsystem
     */
    public java.lang.String getSubsystem() {
        return subsystem;
    }


    /**
     * Sets the subsystem value for this AdminType.
     * 
     * @param subsystem
     */
    public void setSubsystem(java.lang.String subsystem) {
        this.subsystem = subsystem;
    }


    /**
     * Gets the name value for this AdminType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AdminType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the subtype value for this AdminType.
     * 
     * @return subtype
     */
    public java.lang.String getSubtype() {
        return subtype;
    }


    /**
     * Sets the subtype value for this AdminType.
     * 
     * @param subtype
     */
    public void setSubtype(java.lang.String subtype) {
        this.subtype = subtype;
    }


    /**
     * Gets the severity value for this AdminType.
     * 
     * @return severity
     */
    public java.lang.String getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this AdminType.
     * 
     * @param severity
     */
    public void setSeverity(java.lang.String severity) {
        this.severity = severity;
    }


    /**
     * Gets the category value for this AdminType.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this AdminType.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the publicdisplay value for this AdminType.
     * 
     * @return publicdisplay
     */
    public com.siemens.sitraffic.external.trafficmessages.AdminTypePublicdisplay[] getPublicdisplay() {
        return publicdisplay;
    }


    /**
     * Sets the publicdisplay value for this AdminType.
     * 
     * @param publicdisplay
     */
    public void setPublicdisplay(com.siemens.sitraffic.external.trafficmessages.AdminTypePublicdisplay[] publicdisplay) {
        this.publicdisplay = publicdisplay;
    }

    public com.siemens.sitraffic.external.trafficmessages.AdminTypePublicdisplay getPublicdisplay(int i) {
        return this.publicdisplay[i];
    }

    public void setPublicdisplay(int i, com.siemens.sitraffic.external.trafficmessages.AdminTypePublicdisplay _value) {
        this.publicdisplay[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdminType)) return false;
        AdminType other = (AdminType) obj;
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
            ((this.subsystem==null && other.getSubsystem()==null) || 
             (this.subsystem!=null &&
              this.subsystem.equals(other.getSubsystem()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.subtype==null && other.getSubtype()==null) || 
             (this.subtype!=null &&
              this.subtype.equals(other.getSubtype()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.publicdisplay==null && other.getPublicdisplay()==null) || 
             (this.publicdisplay!=null &&
              java.util.Arrays.equals(this.publicdisplay, other.getPublicdisplay())));
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
        if (getSubsystem() != null) {
            _hashCode += getSubsystem().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSubtype() != null) {
            _hashCode += getSubtype().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getPublicdisplay() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPublicdisplay());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPublicdisplay(), i);
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
