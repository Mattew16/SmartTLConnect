/**
 * DiversionEffectType_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.action;

public class DiversionEffectType_Helper {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiversionEffectType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "diversionEffectType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adherence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "adherence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discouragedLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "discouragedLinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "linkLocationsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendedLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "recommendedLinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "linkLocationsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}