/**
 * LogServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.uniriotec.logapp.service;

public class LogServiceServiceLocator extends org.apache.axis.client.Service implements br.uniriotec.logapp.service.LogServiceService {

    public LogServiceServiceLocator() {
    }


    public LogServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LogServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LogService
    private java.lang.String LogService_address = "http://localhost:8080/LogApp/services/LogService";

    public java.lang.String getLogServiceAddress() {
        return LogService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LogServiceWSDDServiceName = "LogService";

    public java.lang.String getLogServiceWSDDServiceName() {
        return LogServiceWSDDServiceName;
    }

    public void setLogServiceWSDDServiceName(java.lang.String name) {
        LogServiceWSDDServiceName = name;
    }

    public br.uniriotec.logapp.service.LogService getLogService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LogService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLogService(endpoint);
    }

    public br.uniriotec.logapp.service.LogService getLogService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.uniriotec.logapp.service.LogServiceSoapBindingStub _stub = new br.uniriotec.logapp.service.LogServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getLogServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLogServiceEndpointAddress(java.lang.String address) {
        LogService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.uniriotec.logapp.service.LogService.class.isAssignableFrom(serviceEndpointInterface)) {
                br.uniriotec.logapp.service.LogServiceSoapBindingStub _stub = new br.uniriotec.logapp.service.LogServiceSoapBindingStub(new java.net.URL(LogService_address), this);
                _stub.setPortName(getLogServiceWSDDServiceName());
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
        if ("LogService".equals(inputPortName)) {
            return getLogService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.logapp.uniriotec.br", "LogServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.logapp.uniriotec.br", "LogService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LogService".equals(portName)) {
            setLogServiceEndpointAddress(address);
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
