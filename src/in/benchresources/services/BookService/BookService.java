/**
 * BookService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package in.benchresources.services.BookService;

public interface BookService extends javax.xml.rpc.Service {
    public java.lang.String getBookServicePortAddress();

    public in.benchresources.services.BookService.IBookService getBookServicePort() throws javax.xml.rpc.ServiceException;

    public in.benchresources.services.BookService.IBookService getBookServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
