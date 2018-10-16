/**
 * LinkLocationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.action;

public class LinkLocationType  implements java.io.Serializable {
    private java.lang.String fromNode;  // attribute

    private java.lang.String id;  // attribute

    public LinkLocationType() {
    }

    public LinkLocationType(
           java.lang.String fromNode,
           java.lang.String id) {
           this.fromNode = fromNode;
           this.id = id;
    }


    /**
     * Gets the fromNode value for this LinkLocationType.
     * 
     * @return fromNode
     */
    public java.lang.String getFromNode() {
        return fromNode;
    }


    /**
     * Sets the fromNode value for this LinkLocationType.
     * 
     * @param fromNode
     */
    public void setFromNode(java.lang.String fromNode) {
        this.fromNode = fromNode;
    }


    /**
     * Gets the id value for this LinkLocationType.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this LinkLocationType.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinkLocationType)) return false;
        LinkLocationType other = (LinkLocationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
