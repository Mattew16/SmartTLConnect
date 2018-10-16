/**
 * VmsInstationTypesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation;

public class VmsInstationTypesServiceLocator extends org.apache.axis.client.Service implements com.siemens.sitraffic.vmsinstation.VmsInstationTypesService {

    public VmsInstationTypesServiceLocator() {
    }


    public VmsInstationTypesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public VmsInstationTypesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for VmsInstationTypes
    private java.lang.String VmsInstationTypes_address = "http://localhost:8080/Dummy";

    public java.lang.String getVmsInstationTypesAddress() {
        return VmsInstationTypes_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String VmsInstationTypesWSDDServiceName = "VmsInstationTypes";

    public java.lang.String getVmsInstationTypesWSDDServiceName() {
        return VmsInstationTypesWSDDServiceName;
    }

    public void setVmsInstationTypesWSDDServiceName(java.lang.String name) {
        VmsInstationTypesWSDDServiceName = name;
    }

    public com.siemens.sitraffic.vmsinstation.VmsInstationTypes getVmsInstationTypes() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(VmsInstationTypes_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getVmsInstationTypes(endpoint);
    }

    public com.siemens.sitraffic.vmsinstation.VmsInstationTypes getVmsInstationTypes(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.siemens.sitraffic.vmsinstation.VmsInstationTypesSoapBindingStub _stub = new com.siemens.sitraffic.vmsinstation.VmsInstationTypesSoapBindingStub(portAddress, this);
            _stub.setPortName(getVmsInstationTypesWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setVmsInstationTypesEndpointAddress(java.lang.String address) {
        VmsInstationTypes_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.siemens.sitraffic.vmsinstation.VmsInstationTypes.class.isAssignableFrom(serviceEndpointInterface)) {
                com.siemens.sitraffic.vmsinstation.VmsInstationTypesSoapBindingStub _stub = new com.siemens.sitraffic.vmsinstation.VmsInstationTypesSoapBindingStub(new java.net.URL(VmsInstationTypes_address), this);
                _stub.setPortName(getVmsInstationTypesWSDDServiceName());
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
        if ("VmsInstationTypes".equals(inputPortName)) {
            return getVmsInstationTypes();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://sitraffic.siemens.com/vmsinstation", "VmsInstationTypesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://sitraffic.siemens.com/vmsinstation", "VmsInstationTypes"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("VmsInstationTypes".equals(portName)) {
            setVmsInstationTypesEndpointAddress(address);
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
