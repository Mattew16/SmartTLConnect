/**
 * Description.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.global;

public class Description  implements java.io.Serializable {
    /* identifier of object */
    private java.lang.String id;

    /* name of object */
    private java.lang.String name;

    /* textual description */
    private java.lang.String descriptionText;

    /* list of related object IDs */
    private java.lang.String[] rel_Ids;

    /* in case of parking data:  PH, PF, PG or PQ */
    private java.lang.String type;

    /* subtype of object - depending on object type */
    private java.lang.String subtype;

    /* subsystem id */
    private java.lang.String subsystem;

    /* location information - can be road info, coordinate list or
     * reference code */
    private com.siemens.sitraffic.external.global.LocationType location;

    /* additional unstructured information (XML format allowed) */
    private java.lang.String addInfo;

    /* category of object - depending on object type */
    private java.lang.String category;

    /* service information - will be used only with selected objecttypes,
     * for example traffic signals */
    private com.siemens.sitraffic.external.global.ServiceExtension[] serviceInfo;

    public Description() {
    }

    public Description(
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
           com.siemens.sitraffic.external.global.ServiceExtension[] serviceInfo) {
           this.id = id;
           this.name = name;
           this.descriptionText = descriptionText;
           this.rel_Ids = rel_Ids;
           this.type = type;
           this.subtype = subtype;
           this.subsystem = subsystem;
           this.location = location;
           this.addInfo = addInfo;
           this.category = category;
           this.serviceInfo = serviceInfo;
    }


    /**
     * Gets the id value for this Description.
     * 
     * @return id   * identifier of object
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Description.
     * 
     * @param id   * identifier of object
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Description.
     * 
     * @return name   * name of object
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Description.
     * 
     * @param name   * name of object
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the descriptionText value for this Description.
     * 
     * @return descriptionText   * textual description
     */
    public java.lang.String getDescriptionText() {
        return descriptionText;
    }


    /**
     * Sets the descriptionText value for this Description.
     * 
     * @param descriptionText   * textual description
     */
    public void setDescriptionText(java.lang.String descriptionText) {
        this.descriptionText = descriptionText;
    }


    /**
     * Gets the rel_Ids value for this Description.
     * 
     * @return rel_Ids   * list of related object IDs
     */
    public java.lang.String[] getRel_Ids() {
        return rel_Ids;
    }


    /**
     * Sets the rel_Ids value for this Description.
     * 
     * @param rel_Ids   * list of related object IDs
     */
    public void setRel_Ids(java.lang.String[] rel_Ids) {
        this.rel_Ids = rel_Ids;
    }

    public java.lang.String getRel_Ids(int i) {
        return this.rel_Ids[i];
    }

    public void setRel_Ids(int i, java.lang.String _value) {
        this.rel_Ids[i] = _value;
    }


    /**
     * Gets the type value for this Description.
     * 
     * @return type   * in case of parking data:  PH, PF, PG or PQ
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Description.
     * 
     * @param type   * in case of parking data:  PH, PF, PG or PQ
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the subtype value for this Description.
     * 
     * @return subtype   * subtype of object - depending on object type
     */
    public java.lang.String getSubtype() {
        return subtype;
    }


    /**
     * Sets the subtype value for this Description.
     * 
     * @param subtype   * subtype of object - depending on object type
     */
    public void setSubtype(java.lang.String subtype) {
        this.subtype = subtype;
    }


    /**
     * Gets the subsystem value for this Description.
     * 
     * @return subsystem   * subsystem id
     */
    public java.lang.String getSubsystem() {
        return subsystem;
    }


    /**
     * Sets the subsystem value for this Description.
     * 
     * @param subsystem   * subsystem id
     */
    public void setSubsystem(java.lang.String subsystem) {
        this.subsystem = subsystem;
    }


    /**
     * Gets the location value for this Description.
     * 
     * @return location   * location information - can be road info, coordinate list or
     * reference code
     */
    public com.siemens.sitraffic.external.global.LocationType getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Description.
     * 
     * @param location   * location information - can be road info, coordinate list or
     * reference code
     */
    public void setLocation(com.siemens.sitraffic.external.global.LocationType location) {
        this.location = location;
    }


    /**
     * Gets the addInfo value for this Description.
     * 
     * @return addInfo   * additional unstructured information (XML format allowed)
     */
    public java.lang.String getAddInfo() {
        return addInfo;
    }


    /**
     * Sets the addInfo value for this Description.
     * 
     * @param addInfo   * additional unstructured information (XML format allowed)
     */
    public void setAddInfo(java.lang.String addInfo) {
        this.addInfo = addInfo;
    }


    /**
     * Gets the category value for this Description.
     * 
     * @return category   * category of object - depending on object type
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this Description.
     * 
     * @param category   * category of object - depending on object type
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the serviceInfo value for this Description.
     * 
     * @return serviceInfo   * service information - will be used only with selected objecttypes,
     * for example traffic signals
     */
    public com.siemens.sitraffic.external.global.ServiceExtension[] getServiceInfo() {
        return serviceInfo;
    }


    /**
     * Sets the serviceInfo value for this Description.
     * 
     * @param serviceInfo   * service information - will be used only with selected objecttypes,
     * for example traffic signals
     */
    public void setServiceInfo(com.siemens.sitraffic.external.global.ServiceExtension[] serviceInfo) {
        this.serviceInfo = serviceInfo;
    }

    public com.siemens.sitraffic.external.global.ServiceExtension getServiceInfo(int i) {
        return this.serviceInfo[i];
    }

    public void setServiceInfo(int i, com.siemens.sitraffic.external.global.ServiceExtension _value) {
        this.serviceInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Description)) return false;
        Description other = (Description) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.descriptionText==null && other.getDescriptionText()==null) || 
             (this.descriptionText!=null &&
              this.descriptionText.equals(other.getDescriptionText()))) &&
            ((this.rel_Ids==null && other.getRel_Ids()==null) || 
             (this.rel_Ids!=null &&
              java.util.Arrays.equals(this.rel_Ids, other.getRel_Ids()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.subtype==null && other.getSubtype()==null) || 
             (this.subtype!=null &&
              this.subtype.equals(other.getSubtype()))) &&
            ((this.subsystem==null && other.getSubsystem()==null) || 
             (this.subsystem!=null &&
              this.subsystem.equals(other.getSubsystem()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.addInfo==null && other.getAddInfo()==null) || 
             (this.addInfo!=null &&
              this.addInfo.equals(other.getAddInfo()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.serviceInfo==null && other.getServiceInfo()==null) || 
             (this.serviceInfo!=null &&
              java.util.Arrays.equals(this.serviceInfo, other.getServiceInfo())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescriptionText() != null) {
            _hashCode += getDescriptionText().hashCode();
        }
        if (getRel_Ids() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRel_Ids());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRel_Ids(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getSubtype() != null) {
            _hashCode += getSubtype().hashCode();
        }
        if (getSubsystem() != null) {
            _hashCode += getSubsystem().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getAddInfo() != null) {
            _hashCode += getAddInfo().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getServiceInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceInfo(), i);
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
