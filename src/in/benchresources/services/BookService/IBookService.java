/**
 * IBookService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package in.benchresources.services.BookService;

public interface IBookService extends java.rmi.Remote {
    public in.benchresources.entities.Book.BookResponseType getBookByISDNRequestNumber(in.benchresources.entities.Book.BookRequestType parameters) throws java.rmi.RemoteException;
    public in.benchresources.entities.Book.BookResponseType getBookDetailsByBookName(in.benchresources.entities.Book.BookNameRequestType parameters) throws java.rmi.RemoteException;
}
