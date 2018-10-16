/**
 * DescrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;


/**
 * Description of an object
 */
public class DescrType  implements java.io.Serializable {
    private org.apache.axis.types.Id id;

    /* Name of the object */
    private java.lang.String name;

    /* Description of the data origin */
    private java.lang.String subsystem;

    /* Subtyping of the object */
    private java.lang.Object subtyp;

    private com.siemens.sitraffic.vmsinstation.infopoint.LocationType location;

    /* Related objects, The unique id of these objects will be added
     * here */
    private org.apache.axis.types.Id[] rel_Ids;

    /* Additional unstructured information (may be itself in XML) */
    private java.lang.String addInfo;

    public DescrType() {
    }

    public DescrType(
           org.apache.axis.types.Id id,
           java.lang.String name,
           java.lang.String subsystem,
           java.lang.Object subtyp,
           com.siemens.sitraffic.vmsinstation.infopoint.LocationType location,
           org.apache.axis.types.Id[] rel_Ids,
           java.lang.String addInfo) {
           this.id = id;
           this.name = name;
           this.subsystem = subsystem;
           this.subtyp = subtyp;
           this.location = location;
           this.rel_Ids = rel_Ids;
           this.addInfo = addInfo;
    }


    /**
     * Gets the id value for this DescrType.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this DescrType.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the name value for this DescrType.
     * 
     * @return name   * Name of the object
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DescrType.
     * 
     * @param name   * Name of the object
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the subsystem value for this DescrType.
     * 
     * @return subsystem   * Description of the data origin
     */
    public java.lang.String getSubsystem() {
        return subsystem;
    }


    /**
     * Sets the subsystem value for this DescrType.
     * 
     * @param subsystem   * Description of the data origin
     */
    public void setSubsystem(java.lang.String subsystem) {
        this.subsystem = subsystem;
    }


    /**
     * Gets the subtyp value for this DescrType.
     * 
     * @return subtyp   * Subtyping of the object
     */
    public java.lang.Object getSubtyp() {
        return subtyp;
    }


    /**
     * Sets the subtyp value for this DescrType.
     * 
     * @param subtyp   * Subtyping of the object
     */
    public void setSubtyp(java.lang.Object subtyp) {
        this.subtyp = subtyp;
    }


    /**
     * Gets the location value for this DescrType.
     * 
     * @return location
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.LocationType getLocation() {
        return location;
    }


    /**
     * Sets the location value for this DescrType.
     * 
     * @param location
     */
    public void setLocation(com.siemens.sitraffic.vmsinstation.infopoint.LocationType location) {
        this.location = location;
    }


    /**
     * Gets the rel_Ids value for this DescrType.
     * 
     * @return rel_Ids   * Related objects, The unique id of these objects will be added
     * here
     */
    public org.apache.axis.types.Id[] getRel_Ids() {
        return rel_Ids;
    }


    /**
     * Sets the rel_Ids value for this DescrType.
     * 
     * @param rel_Ids   * Related objects, The unique id of these objects will be added
     * here
     */
    public void setRel_Ids(org.apache.axis.types.Id[] rel_Ids) {
        this.rel_Ids = rel_Ids;
    }

    public org.apache.axis.types.Id getRel_Ids(int i) {
        return this.rel_Ids[i];
    }

    public void setRel_Ids(int i, org.apache.axis.types.Id _value) {
        this.rel_Ids[i] = _value;
    }


    /**
     * Gets the addInfo value for this DescrType.
     * 
     * @return addInfo   * Additional unstructured information (may be itself in XML)
     */
    public java.lang.String getAddInfo() {
        return addInfo;
    }


    /**
     * Sets the addInfo value for this DescrType.
     * 
     * @param addInfo   * Additional unstructured information (may be itself in XML)
     */
    public void setAddInfo(java.lang.String addInfo) {
        this.addInfo = addInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescrType)) return false;
        DescrType other = (DescrType) obj;
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
            ((this.subsystem==null && other.getSubsystem()==null) || 
             (this.subsystem!=null &&
              this.subsystem.equals(other.getSubsystem()))) &&
            ((this.subtyp==null && other.getSubtyp()==null) || 
             (this.subtyp!=null &&
              this.subtyp.equals(other.getSubtyp()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.rel_Ids==null && other.getRel_Ids()==null) || 
             (this.rel_Ids!=null &&
              java.util.Arrays.equals(this.rel_Ids, other.getRel_Ids()))) &&
            ((this.addInfo==null && other.getAddInfo()==null) || 
             (this.addInfo!=null &&
              this.addInfo.equals(other.getAddInfo())));
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
        if (getSubsystem() != null) {
            _hashCode += getSubsystem().hashCode();
        }
        if (getSubtyp() != null) {
            _hashCode += getSubtyp().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
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
        if (getAddInfo() != null) {
            _hashCode += getAddInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
