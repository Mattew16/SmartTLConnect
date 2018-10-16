/**
 * ServiceExtension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.global;

public class ServiceExtension  implements java.io.Serializable {
    /* district */
    private java.lang.String district;

    /* Node number (Intersections) */
    private java.lang.Long nodeNr;

    /* manufacturer, misspelled */
    private java.lang.String manufactor;

    /* Category, type or importance */
    private java.lang.String category;

    /* related police department */
    private java.lang.String related_police;

    /* alternative service rules */
    private java.lang.String service_control;

    /* common service informations as free text */
    private java.lang.String service_info;

    /* Service company */
    private java.lang.String service_company;

    /* Name and/or phone number of someone responsible */
    private java.lang.String contact_person;

    /* Additional unstructured informations */
    private java.lang.String additional_info;

    /* Information on the related device */
    private com.siemens.sitraffic.external.global.ServiceExtensionDevice device;

    public ServiceExtension() {
    }

    public ServiceExtension(
           java.lang.String district,
           java.lang.Long nodeNr,
           java.lang.String manufactor,
           java.lang.String category,
           java.lang.String related_police,
           java.lang.String service_control,
           java.lang.String service_info,
           java.lang.String service_company,
           java.lang.String contact_person,
           java.lang.String additional_info,
           com.siemens.sitraffic.external.global.ServiceExtensionDevice device) {
           this.district = district;
           this.nodeNr = nodeNr;
           this.manufactor = manufactor;
           this.category = category;
           this.related_police = related_police;
           this.service_control = service_control;
           this.service_info = service_info;
           this.service_company = service_company;
           this.contact_person = contact_person;
           this.additional_info = additional_info;
           this.device = device;
    }


    /**
     * Gets the district value for this ServiceExtension.
     * 
     * @return district   * district
     */
    public java.lang.String getDistrict() {
        return district;
    }


    /**
     * Sets the district value for this ServiceExtension.
     * 
     * @param district   * district
     */
    public void setDistrict(java.lang.String district) {
        this.district = district;
    }


    /**
     * Gets the nodeNr value for this ServiceExtension.
     * 
     * @return nodeNr   * Node number (Intersections)
     */
    public java.lang.Long getNodeNr() {
        return nodeNr;
    }


    /**
     * Sets the nodeNr value for this ServiceExtension.
     * 
     * @param nodeNr   * Node number (Intersections)
     */
    public void setNodeNr(java.lang.Long nodeNr) {
        this.nodeNr = nodeNr;
    }


    /**
     * Gets the manufactor value for this ServiceExtension.
     * 
     * @return manufactor   * manufacturer, misspelled
     */
    public java.lang.String getManufactor() {
        return manufactor;
    }


    /**
     * Sets the manufactor value for this ServiceExtension.
     * 
     * @param manufactor   * manufacturer, misspelled
     */
    public void setManufactor(java.lang.String manufactor) {
        this.manufactor = manufactor;
    }


    /**
     * Gets the category value for this ServiceExtension.
     * 
     * @return category   * Category, type or importance
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this ServiceExtension.
     * 
     * @param category   * Category, type or importance
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the related_police value for this ServiceExtension.
     * 
     * @return related_police   * related police department
     */
    public java.lang.String getRelated_police() {
        return related_police;
    }


    /**
     * Sets the related_police value for this ServiceExtension.
     * 
     * @param related_police   * related police department
     */
    public void setRelated_police(java.lang.String related_police) {
        this.related_police = related_police;
    }


    /**
     * Gets the service_control value for this ServiceExtension.
     * 
     * @return service_control   * alternative service rules
     */
    public java.lang.String getService_control() {
        return service_control;
    }


    /**
     * Sets the service_control value for this ServiceExtension.
     * 
     * @param service_control   * alternative service rules
     */
    public void setService_control(java.lang.String service_control) {
        this.service_control = service_control;
    }


    /**
     * Gets the service_info value for this ServiceExtension.
     * 
     * @return service_info   * common service informations as free text
     */
    public java.lang.String getService_info() {
        return service_info;
    }


    /**
     * Sets the service_info value for this ServiceExtension.
     * 
     * @param service_info   * common service informations as free text
     */
    public void setService_info(java.lang.String service_info) {
        this.service_info = service_info;
    }


    /**
     * Gets the service_company value for this ServiceExtension.
     * 
     * @return service_company   * Service company
     */
    public java.lang.String getService_company() {
        return service_company;
    }


    /**
     * Sets the service_company value for this ServiceExtension.
     * 
     * @param service_company   * Service company
     */
    public void setService_company(java.lang.String service_company) {
        this.service_company = service_company;
    }


    /**
     * Gets the contact_person value for this ServiceExtension.
     * 
     * @return contact_person   * Name and/or phone number of someone responsible
     */
    public java.lang.String getContact_person() {
        return contact_person;
    }


    /**
     * Sets the contact_person value for this ServiceExtension.
     * 
     * @param contact_person   * Name and/or phone number of someone responsible
     */
    public void setContact_person(java.lang.String contact_person) {
        this.contact_person = contact_person;
    }


    /**
     * Gets the additional_info value for this ServiceExtension.
     * 
     * @return additional_info   * Additional unstructured informations
     */
    public java.lang.String getAdditional_info() {
        return additional_info;
    }


    /**
     * Sets the additional_info value for this ServiceExtension.
     * 
     * @param additional_info   * Additional unstructured informations
     */
    public void setAdditional_info(java.lang.String additional_info) {
        this.additional_info = additional_info;
    }


    /**
     * Gets the device value for this ServiceExtension.
     * 
     * @return device   * Information on the related device
     */
    public com.siemens.sitraffic.external.global.ServiceExtensionDevice getDevice() {
        return device;
    }


    /**
     * Sets the device value for this ServiceExtension.
     * 
     * @param device   * Information on the related device
     */
    public void setDevice(com.siemens.sitraffic.external.global.ServiceExtensionDevice device) {
        this.device = device;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceExtension)) return false;
        ServiceExtension other = (ServiceExtension) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.district==null && other.getDistrict()==null) || 
             (this.district!=null &&
              this.district.equals(other.getDistrict()))) &&
            ((this.nodeNr==null && other.getNodeNr()==null) || 
             (this.nodeNr!=null &&
              this.nodeNr.equals(other.getNodeNr()))) &&
            ((this.manufactor==null && other.getManufactor()==null) || 
             (this.manufactor!=null &&
              this.manufactor.equals(other.getManufactor()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.related_police==null && other.getRelated_police()==null) || 
             (this.related_police!=null &&
              this.related_police.equals(other.getRelated_police()))) &&
            ((this.service_control==null && other.getService_control()==null) || 
             (this.service_control!=null &&
              this.service_control.equals(other.getService_control()))) &&
            ((this.service_info==null && other.getService_info()==null) || 
             (this.service_info!=null &&
              this.service_info.equals(other.getService_info()))) &&
            ((this.service_company==null && other.getService_company()==null) || 
             (this.service_company!=null &&
              this.service_company.equals(other.getService_company()))) &&
            ((this.contact_person==null && other.getContact_person()==null) || 
             (this.contact_person!=null &&
              this.contact_person.equals(other.getContact_person()))) &&
            ((this.additional_info==null && other.getAdditional_info()==null) || 
             (this.additional_info!=null &&
              this.additional_info.equals(other.getAdditional_info()))) &&
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              this.device.equals(other.getDevice())));
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
        if (getDistrict() != null) {
            _hashCode += getDistrict().hashCode();
        }
        if (getNodeNr() != null) {
            _hashCode += getNodeNr().hashCode();
        }
        if (getManufactor() != null) {
            _hashCode += getManufactor().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getRelated_police() != null) {
            _hashCode += getRelated_police().hashCode();
        }
        if (getService_control() != null) {
            _hashCode += getService_control().hashCode();
        }
        if (getService_info() != null) {
            _hashCode += getService_info().hashCode();
        }
        if (getService_company() != null) {
            _hashCode += getService_company().hashCode();
        }
        if (getContact_person() != null) {
            _hashCode += getContact_person().hashCode();
        }
        if (getAdditional_info() != null) {
            _hashCode += getAdditional_info().hashCode();
        }
        if (getDevice() != null) {
            _hashCode += getDevice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
