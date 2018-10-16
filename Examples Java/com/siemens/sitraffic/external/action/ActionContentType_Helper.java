/**
 * ActionContentType_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.action;

public class ActionContentType_Helper {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActionContentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "actionContentType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("actiontype");
        attrField.setXmlName(new javax.xml.namespace.QName("", "actiontype"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", ">actionContentType>actiontype"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "recommendation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "recommendationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signControl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "signControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "signControlType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkControl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "linkControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "linkControlType"));
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
