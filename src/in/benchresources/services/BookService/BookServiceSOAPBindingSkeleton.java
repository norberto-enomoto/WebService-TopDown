/**
 * BookServiceSOAPBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package in.benchresources.services.BookService;

public class BookServiceSOAPBindingSkeleton implements in.benchresources.services.BookService.IBookService, org.apache.axis.wsdl.Skeleton {
    private in.benchresources.services.BookService.IBookService impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://benchresources.in/entities/Book", "BookRequestType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://benchresources.in/entities/Book", ">BookRequestType"), in.benchresources.entities.Book.BookRequestType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getBookByISDNRequestNumber", _params, new javax.xml.namespace.QName("http://benchresources.in/entities/Book", "BookResponseType"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://benchresources.in/entities/Book", ">BookResponseType"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "getBookByISDNRequestNumber"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getBookByISDNRequestNumber") == null) {
            _myOperations.put("getBookByISDNRequestNumber", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getBookByISDNRequestNumber")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://benchresources.in/entities/Book", "BookNameRequestType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://benchresources.in/entities/Book", ">BookNameRequestType"), in.benchresources.entities.Book.BookNameRequestType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getBookDetailsByBookName", _params, new javax.xml.namespace.QName("http://benchresources.in/entities/Book", "BookResponseType"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://benchresources.in/entities/Book", ">BookResponseType"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "getBookDetailsByBookName"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getBookDetailsByBookName") == null) {
            _myOperations.put("getBookDetailsByBookName", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getBookDetailsByBookName")).add(_oper);
    }

    public BookServiceSOAPBindingSkeleton() {
        this.impl = new in.benchresources.services.BookService.BookServiceSOAPBindingImpl();
    }

    public BookServiceSOAPBindingSkeleton(in.benchresources.services.BookService.IBookService impl) {
        this.impl = impl;
    }
    public in.benchresources.entities.Book.BookResponseType getBookByISDNRequestNumber(in.benchresources.entities.Book.BookRequestType parameters) throws java.rmi.RemoteException
    {
        in.benchresources.entities.Book.BookResponseType ret = impl.getBookByISDNRequestNumber(parameters);
        return ret;
    }

    public in.benchresources.entities.Book.BookResponseType getBookDetailsByBookName(in.benchresources.entities.Book.BookNameRequestType parameters) throws java.rmi.RemoteException
    {
        in.benchresources.entities.Book.BookResponseType ret = impl.getBookDetailsByBookName(parameters);
        return ret;
    }

}
