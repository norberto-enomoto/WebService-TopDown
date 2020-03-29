/**
 * BookServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package in.benchresources.services.BookService;

public class BookServiceLocator extends org.apache.axis.client.Service implements in.benchresources.services.BookService.BookService {

    public BookServiceLocator() {
    }


    public BookServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BookServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BookServicePort
    private java.lang.String BookServicePort_address = "http://localhost:8080/WebService-TopDown/services/BookService";

    public java.lang.String getBookServicePortAddress() {
        return BookServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BookServicePortWSDDServiceName = "BookServicePort";

    public java.lang.String getBookServicePortWSDDServiceName() {
        return BookServicePortWSDDServiceName;
    }

    public void setBookServicePortWSDDServiceName(java.lang.String name) {
        BookServicePortWSDDServiceName = name;
    }

    public in.benchresources.services.BookService.IBookService getBookServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BookServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBookServicePort(endpoint);
    }

    public in.benchresources.services.BookService.IBookService getBookServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            in.benchresources.services.BookService.BookServiceSOAPBindingStub _stub = new in.benchresources.services.BookService.BookServiceSOAPBindingStub(portAddress, this);
            _stub.setPortName(getBookServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBookServicePortEndpointAddress(java.lang.String address) {
        BookServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (in.benchresources.services.BookService.IBookService.class.isAssignableFrom(serviceEndpointInterface)) {
                in.benchresources.services.BookService.BookServiceSOAPBindingStub _stub = new in.benchresources.services.BookService.BookServiceSOAPBindingStub(new java.net.URL(BookServicePort_address), this);
                _stub.setPortName(getBookServicePortWSDDServiceName());
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
        if ("BookServicePort".equals(inputPortName)) {
            return getBookServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://benchresources.in/services/BookService/", "BookService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://benchresources.in/services/BookService/", "BookServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BookServicePort".equals(portName)) {
            setBookServicePortEndpointAddress(address);
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
