/**
 * LocationTypeCo_description.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.global;

public class LocationTypeCo_description  implements java.io.Serializable {
    /* x/y coordinates, may result in closed area in case start=end */
    private com.siemens.sitraffic.external.global.CoType[] co;

    private java.lang.Object test;

    private java.lang.String projectionCategory;  // attribute

    private java.lang.String projectionType;  // attribute

    public LocationTypeCo_description() {
    }

    public LocationTypeCo_description(
           com.siemens.sitraffic.external.global.CoType[] co,
           java.lang.Object test,
           java.lang.String projectionCategory,
           java.lang.String projectionType) {
           this.co = co;
           this.test = test;
           this.projectionCategory = projectionCategory;
           this.projectionType = projectionType;
    }


    /**
     * Gets the co value for this LocationTypeCo_description.
     * 
     * @return co   * x/y coordinates, may result in closed area in case start=end
     */
    public com.siemens.sitraffic.external.global.CoType[] getCo() {
        return co;
    }


    /**
     * Sets the co value for this LocationTypeCo_description.
     * 
     * @param co   * x/y coordinates, may result in closed area in case start=end
     */
    public void setCo(com.siemens.sitraffic.external.global.CoType[] co) {
        this.co = co;
    }

    public com.siemens.sitraffic.external.global.CoType getCo(int i) {
        return this.co[i];
    }

    public void setCo(int i, com.siemens.sitraffic.external.global.CoType _value) {
        this.co[i] = _value;
    }


    /**
     * Gets the test value for this LocationTypeCo_description.
     * 
     * @return test
     */
    public java.lang.Object getTest() {
        return test;
    }


    /**
     * Sets the test value for this LocationTypeCo_description.
     * 
     * @param test
     */
    public void setTest(java.lang.Object test) {
        this.test = test;
    }


    /**
     * Gets the projectionCategory value for this LocationTypeCo_description.
     * 
     * @return projectionCategory
     */
    public java.lang.String getProjectionCategory() {
        return projectionCategory;
    }


    /**
     * Sets the projectionCategory value for this LocationTypeCo_description.
     * 
     * @param projectionCategory
     */
    public void setProjectionCategory(java.lang.String projectionCategory) {
        this.projectionCategory = projectionCategory;
    }


    /**
     * Gets the projectionType value for this LocationTypeCo_description.
     * 
     * @return projectionType
     */
    public java.lang.String getProjectionType() {
        return projectionType;
    }


    /**
     * Sets the projectionType value for this LocationTypeCo_description.
     * 
     * @param projectionType
     */
    public void setProjectionType(java.lang.String projectionType) {
        this.projectionType = projectionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationTypeCo_description)) return false;
        LocationTypeCo_description other = (LocationTypeCo_description) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.co==null && other.getCo()==null) || 
             (this.co!=null &&
              java.util.Arrays.equals(this.co, other.getCo()))) &&
            ((this.test==null && other.getTest()==null) || 
             (this.test!=null &&
              this.test.equals(other.getTest()))) &&
            ((this.projectionCategory==null && other.getProjectionCategory()==null) || 
             (this.projectionCategory!=null &&
              this.projectionCategory.equals(other.getProjectionCategory()))) &&
            ((this.projectionType==null && other.getProjectionType()==null) || 
             (this.projectionType!=null &&
              this.projectionType.equals(other.getProjectionType())));
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
        if (getCo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTest() != null) {
            _hashCode += getTest().hashCode();
        }
        if (getProjectionCategory() != null) {
            _hashCode += getProjectionCategory().hashCode();
        }
        if (getProjectionType() != null) {
            _hashCode += getProjectionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
