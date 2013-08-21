/**
 * GSSeguridadWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.generalseguros.seguridad;

public class GSSeguridadWSLocator extends org.apache.axis.client.Service implements com.generalseguros.seguridad.GSSeguridadWS {

    public GSSeguridadWSLocator() {
    }


    public GSSeguridadWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GSSeguridadWSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GSSeguridadWSHttpSoap11Endpoint
    private java.lang.String GSSeguridadWSHttpSoap11Endpoint_address = "http://localhost:8080/GSWebServicesSSO/services/GSSeguridadWS.GSSeguridadWSHttpSoap11Endpoint/";

    public java.lang.String getGSSeguridadWSHttpSoap11EndpointAddress() {
        return GSSeguridadWSHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GSSeguridadWSHttpSoap11EndpointWSDDServiceName = "GSSeguridadWSHttpSoap11Endpoint";

    public java.lang.String getGSSeguridadWSHttpSoap11EndpointWSDDServiceName() {
        return GSSeguridadWSHttpSoap11EndpointWSDDServiceName;
    }

    public void setGSSeguridadWSHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        GSSeguridadWSHttpSoap11EndpointWSDDServiceName = name;
    }

    public com.generalseguros.seguridad.GSSeguridadWSPortType getGSSeguridadWSHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GSSeguridadWSHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGSSeguridadWSHttpSoap11Endpoint(endpoint);
    }

    public com.generalseguros.seguridad.GSSeguridadWSPortType getGSSeguridadWSHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.generalseguros.seguridad.GSSeguridadWSSoap11BindingStub _stub = new com.generalseguros.seguridad.GSSeguridadWSSoap11BindingStub(portAddress, this);
            _stub.setPortName(getGSSeguridadWSHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGSSeguridadWSHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        GSSeguridadWSHttpSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.generalseguros.seguridad.GSSeguridadWSPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.generalseguros.seguridad.GSSeguridadWSSoap11BindingStub _stub = new com.generalseguros.seguridad.GSSeguridadWSSoap11BindingStub(new java.net.URL(GSSeguridadWSHttpSoap11Endpoint_address), this);
                _stub.setPortName(getGSSeguridadWSHttpSoap11EndpointWSDDServiceName());
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
        if ("GSSeguridadWSHttpSoap11Endpoint".equals(inputPortName)) {
            return getGSSeguridadWSHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://seguridad.generalseguros.com", "GSSeguridadWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://seguridad.generalseguros.com", "GSSeguridadWSHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GSSeguridadWSHttpSoap11Endpoint".equals(portName)) {
            setGSSeguridadWSHttpSoap11EndpointEndpointAddress(address);
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
