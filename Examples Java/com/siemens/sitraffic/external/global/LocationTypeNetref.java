/**
 * LocationTypeNetref.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.global;

public class LocationTypeNetref  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;

    private java.lang.String fromNode;  // attribute

    private java.lang.String id;  // attribute

    public LocationTypeNetref() {
    }

    // Simple Types must have a String constructor
    public LocationTypeNetref(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this LocationTypeNetref.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this LocationTypeNetref.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }


    /**
     * Gets the fromNode value for this LocationTypeNetref.
     * 
     * @return fromNode
     */
    public java.lang.String getFromNode() {
        return fromNode;
    }


    /**
     * Sets the fromNode value for this LocationTypeNetref.
     * 
     * @param fromNode
     */
    public void setFromNode(java.lang.String fromNode) {
        this.fromNode = fromNode;
    }


    /**
     * Gets the id value for this LocationTypeNetref.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this LocationTypeNetref.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationTypeNetref)) return false;
        LocationTypeNetref other = (LocationTypeNetref) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              this._value.equals(other.get_value()))) &&
            ((this.fromNode==null && other.getFromNode()==null) || 
             (this.fromNode!=null &&
              this.fromNode.equals(other.getFromNode()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (get_value() != null) {
            _hashCode += get_value().hashCode();
        }
        if (getFromNode() != null) {
            _hashCode += getFromNode().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
