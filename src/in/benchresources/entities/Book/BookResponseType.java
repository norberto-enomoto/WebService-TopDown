/**
 * BookResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package in.benchresources.entities.Book;

public class BookResponseType  implements java.io.Serializable {
    private java.lang.String bookISBN;

    private java.lang.String bookName;

    private java.lang.String author;

    private java.lang.String category;

    public BookResponseType() {
    }

    public BookResponseType(
           java.lang.String bookISBN,
           java.lang.String bookName,
           java.lang.String author,
           java.lang.String category) {
           this.bookISBN = bookISBN;
           this.bookName = bookName;
           this.author = author;
           this.category = category;
    }


    /**
     * Gets the bookISBN value for this BookResponseType.
     * 
     * @return bookISBN
     */
    public java.lang.String getBookISBN() {
        return bookISBN;
    }


    /**
     * Sets the bookISBN value for this BookResponseType.
     * 
     * @param bookISBN
     */
    public void setBookISBN(java.lang.String bookISBN) {
        this.bookISBN = bookISBN;
    }


    /**
     * Gets the bookName value for this BookResponseType.
     * 
     * @return bookName
     */
    public java.lang.String getBookName() {
        return bookName;
    }


    /**
     * Sets the bookName value for this BookResponseType.
     * 
     * @param bookName
     */
    public void setBookName(java.lang.String bookName) {
        this.bookName = bookName;
    }


    /**
     * Gets the author value for this BookResponseType.
     * 
     * @return author
     */
    public java.lang.String getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this BookResponseType.
     * 
     * @param author
     */
    public void setAuthor(java.lang.String author) {
        this.author = author;
    }


    /**
     * Gets the category value for this BookResponseType.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this BookResponseType.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookResponseType)) return false;
        BookResponseType other = (BookResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bookISBN==null && other.getBookISBN()==null) || 
             (this.bookISBN!=null &&
              this.bookISBN.equals(other.getBookISBN()))) &&
            ((this.bookName==null && other.getBookName()==null) || 
             (this.bookName!=null &&
              this.bookName.equals(other.getBookName()))) &&
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              this.author.equals(other.getAuthor()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBookISBN() != null) {
            _hashCode += getBookISBN().hashCode();
        }
        if (getBookName() != null) {
            _hashCode += getBookName().hashCode();
        }
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://benchresources.in/entities/Book", ">BookResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookISBN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://benchresources.in/entities/Book", "bookISBN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://benchresources.in/entities/Book", "bookName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("http://benchresources.in/entities/Book", "author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://benchresources.in/entities/Book", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
