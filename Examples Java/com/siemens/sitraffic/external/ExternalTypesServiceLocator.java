/**
 * ExternalTypesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external;

public class ExternalTypesServiceLocator extends org.apache.axis.client.Service implements com.siemens.sitraffic.external.ExternalTypesService {

    public ExternalTypesServiceLocator() {
    }


    public ExternalTypesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ExternalTypesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ExternalTypes
    private java.lang.String ExternalTypes_address = "http://localhost:8080/Dummy";

    public java.lang.String getExternalTypesAddress() {
        return ExternalTypes_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ExternalTypesWSDDServiceName = "ExternalTypes";

    public java.lang.String getExternalTypesWSDDServiceName() {
        return ExternalTypesWSDDServiceName;
    }

    public void setExternalTypesWSDDServiceName(java.lang.String name) {
        ExternalTypesWSDDServiceName = name;
    }

    public com.siemens.sitraffic.external.ExternalTypes getExternalTypes() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ExternalTypes_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getExternalTypes(endpoint);
    }

    public com.siemens.sitraffic.external.ExternalTypes getExternalTypes(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.siemens.sitraffic.external.ExternalTypesSoapBindingStub _stub = new com.siemens.sitraffic.external.ExternalTypesSoapBindingStub(portAddress, this);
            _stub.setPortName(getExternalTypesWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setExternalTypesEndpointAddress(java.lang.String address) {
        ExternalTypes_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.siemens.sitraffic.external.ExternalTypes.class.isAssignableFrom(serviceEndpointInterface)) {
                com.siemens.sitraffic.external.ExternalTypesSoapBindingStub _stub = new com.siemens.sitraffic.external.ExternalTypesSoapBindingStub(new java.net.URL(ExternalTypes_address), this);
                _stub.setPortName(getExternalTypesWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ExternalTypes".equals(inputPortName)) {
            return getExternalTypes();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://sitraffic.siemens.com/external", "ExternalTypesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://sitraffic.siemens.com/external", "ExternalTypes"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ExternalTypes".equals(portName)) {
            setExternalTypesEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
