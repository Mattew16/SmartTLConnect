/**
 * EposDataType_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.parking;

public class EposDataType_Helper {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EposDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/parking", "EposDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outlet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/parking", "Outlet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/parking", "OutletType"));
        elemField.setMinOccurs(0);
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
