/**
 * DataType_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.evr;

public class DataType_Helper {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/evr", "DataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicle_Identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/evr", "Vehicle_Identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicle_Position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/evr", "Vehicle_Position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/evr", "vehiclePositionType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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