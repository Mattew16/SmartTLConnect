/**
 * TriggerAreaDescriptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.triggerarea;


/**
 * description of a trigger area
 */
public class TriggerAreaDescriptionType  implements java.io.Serializable {
    /* unique id of TriggerArea */
    private java.lang.String id;

    private java.lang.String name;

    /* e.g. line, cycle, polygonal line ... */
    private java.lang.String type;

    /* normaly only co_description wil be used. */
    private com.siemens.sitraffic.external.global.LocationType position;

    /* direction starting with North as 0.0, East as 90.0, South as
     * 180.0 and West as 270.0 */
    private java.lang.Float direction;

    /* e.g. lenght of the trigger area or radius in case of a cycle */
    private java.lang.Float size;

    private com.siemens.sitraffic.external.triggerarea.TriggerAreaDescriptionTypeFilter[] filter;

    public TriggerAreaDescriptionType() {
    }

    public TriggerAreaDescriptionType(
           java.lang.String id,
           java.lang.String name,
           java.lang.String type,
           com.siemens.sitraffic.external.global.LocationType position,
           java.lang.Float direction,
           java.lang.Float size,
           com.siemens.sitraffic.external.triggerarea.TriggerAreaDescriptionTypeFilter[] filter) {
           this.id = id;
           this.name = name;
           this.type = type;
           this.position = position;
           this.direction = direction;
           this.size = size;
           this.filter = filter;
    }


    /**
     * Gets the id value for this TriggerAreaDescriptionType.
     * 
     * @return id   * unique id of TriggerArea
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this TriggerAreaDescriptionType.
     * 
     * @param id   * unique id of TriggerArea
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the name value for this TriggerAreaDescriptionType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TriggerAreaDescriptionType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this TriggerAreaDescriptionType.
     * 
     * @return type   * e.g. line, cycle, polygonal line ...
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this TriggerAreaDescriptionType.
     * 
     * @param type   * e.g. line, cycle, polygonal line ...
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the position value for this TriggerAreaDescriptionType.
     * 
     * @return position   * normaly only co_description wil be used.
     */
    public com.siemens.sitraffic.external.global.LocationType getPosition() {
        return position;
    }


    /**
     * Sets the position value for this TriggerAreaDescriptionType.
     * 
     * @param position   * normaly only co_description wil be used.
     */
    public void setPosition(com.siemens.sitraffic.external.global.LocationType position) {
        this.position = position;
    }


    /**
     * Gets the direction value for this TriggerAreaDescriptionType.
     * 
     * @return direction   * direction starting with North as 0.0, East as 90.0, South as
     * 180.0 and West as 270.0
     */
    public java.lang.Float getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this TriggerAreaDescriptionType.
     * 
     * @param direction   * direction starting with North as 0.0, East as 90.0, South as
     * 180.0 and West as 270.0
     */
    public void setDirection(java.lang.Float direction) {
        this.direction = direction;
    }


    /**
     * Gets the size value for this TriggerAreaDescriptionType.
     * 
     * @return size   * e.g. lenght of the trigger area or radius in case of a cycle
     */
    public java.lang.Float getSize() {
        return size;
    }


    /**
     * Sets the size value for this TriggerAreaDescriptionType.
     * 
     * @param size   * e.g. lenght of the trigger area or radius in case of a cycle
     */
    public void setSize(java.lang.Float size) {
        this.size = size;
    }


    /**
     * Gets the filter value for this TriggerAreaDescriptionType.
     * 
     * @return filter
     */
    public com.siemens.sitraffic.external.triggerarea.TriggerAreaDescriptionTypeFilter[] getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this TriggerAreaDescriptionType.
     * 
     * @param filter
     */
    public void setFilter(com.siemens.sitraffic.external.triggerarea.TriggerAreaDescriptionTypeFilter[] filter) {
        this.filter = filter;
    }

    public com.siemens.sitraffic.external.triggerarea.TriggerAreaDescriptionTypeFilter getFilter(int i) {
        return this.filter[i];
    }

    public void setFilter(int i, com.siemens.sitraffic.external.triggerarea.TriggerAreaDescriptionTypeFilter _value) {
        this.filter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TriggerAreaDescriptionType)) return false;
        TriggerAreaDescriptionType other = (TriggerAreaDescriptionType) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              java.util.Arrays.equals(this.filter, other.getFilter())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getFilter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilter(), i);
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
