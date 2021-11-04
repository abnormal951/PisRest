
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF022;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webapp.webservices.SI_ZTMHRPYF022 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MTZTMHRPYF022Request_QNAME = new QName("http://consultas.modernizacion.hr/ZTMHRPYF022", "MT_ZTMHRPYF022_request");
    private final static QName _MTZTMHRPYF022Response_QNAME = new QName("http://consultas.modernizacion.hr/ZTMHRPYF022", "MT_ZTMHRPYF022_response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webapp.webservices.SI_ZTMHRPYF022
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTZTMHRPYF022Response }
     * 
     */
    public DTZTMHRPYF022Response createDTZTMHRPYF022Response() {
        return new DTZTMHRPYF022Response();
    }

    /**
     * Create an instance of {@link DTZTMHRPYF022Request }
     * 
     */
    public DTZTMHRPYF022Request createDTZTMHRPYF022Request() {
        return new DTZTMHRPYF022Request();
    }

    /**
     * Create an instance of {@link DTZTMHRPYES027 }
     * 
     */
    public DTZTMHRPYES027 createDTZTMHRPYES027() {
        return new DTZTMHRPYES027();
    }

    /**
     * Create an instance of {@link DTZTMHRPYES023 }
     * 
     */
    public DTZTMHRPYES023 createDTZTMHRPYES023() {
        return new DTZTMHRPYES023();
    }

    /**
     * Create an instance of {@link DTZMENSAJESPI2 }
     * 
     */
    public DTZMENSAJESPI2 createDTZMENSAJESPI2() {
        return new DTZMENSAJESPI2();
    }

    /**
     * Create an instance of {@link DTZTMHRPYF022Response.TMENSAJES }
     * 
     */
    public DTZTMHRPYF022Response.TMENSAJES createDTZTMHRPYF022ResponseTMENSAJES() {
        return new DTZTMHRPYF022Response.TMENSAJES();
    }

    /**
     * Create an instance of {@link DTZTMHRPYF022Response.TSALIDA }
     * 
     */
    public DTZTMHRPYF022Response.TSALIDA createDTZTMHRPYF022ResponseTSALIDA() {
        return new DTZTMHRPYF022Response.TSALIDA();
    }

    /**
     * Create an instance of {@link DTZTMHRPYF022Request.TENTRADA }
     * 
     */
    public DTZTMHRPYF022Request.TENTRADA createDTZTMHRPYF022RequestTENTRADA() {
        return new DTZTMHRPYF022Request.TENTRADA();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPYF022Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/ZTMHRPYF022", name = "MT_ZTMHRPYF022_request")
    public JAXBElement<DTZTMHRPYF022Request> createMTZTMHRPYF022Request(DTZTMHRPYF022Request value) {
        return new JAXBElement<DTZTMHRPYF022Request>(_MTZTMHRPYF022Request_QNAME, DTZTMHRPYF022Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPYF022Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/ZTMHRPYF022", name = "MT_ZTMHRPYF022_response")
    public JAXBElement<DTZTMHRPYF022Response> createMTZTMHRPYF022Response(DTZTMHRPYF022Response value) {
        return new JAXBElement<DTZTMHRPYF022Response>(_MTZTMHRPYF022Response_QNAME, DTZTMHRPYF022Response.class, null, value);
    }

}
