/**
 * BookServiceSOAPBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package in.benchresources.services.BookService;

import in.benchresources.entities.Book.BookResponseType;

public class BookServiceSOAPBindingImpl implements in.benchresources.services.BookService.IBookService{
    public in.benchresources.entities.Book.BookResponseType getBookByISDNRequestNumber(in.benchresources.entities.Book.BookRequestType parameters) throws java.rmi.RemoteException {
    	BookResponseType bookResponseType = new BookResponseType();
    	bookResponseType.setBookISBN(parameters.getIsbnNumber());
    	bookResponseType.setBookName("Arquitetura de Microserviços");
    	bookResponseType.setAuthor("Norberto Enomoto");
    	bookResponseType.setCategory("Microserviços");
    	return bookResponseType;
    }

    public in.benchresources.entities.Book.BookResponseType getBookDetailsByBookName(in.benchresources.entities.Book.BookNameRequestType parameters) throws java.rmi.RemoteException {
    	BookResponseType bookResponseType = new BookResponseType();
		bookResponseType.setBookISBN("123456");
		bookResponseType.setBookName(parameters.getBookName());
		bookResponseType.setAuthor("Norberto Enomoto");
		bookResponseType.setCategory("Microserviços");
		return bookResponseType;
    }

}
