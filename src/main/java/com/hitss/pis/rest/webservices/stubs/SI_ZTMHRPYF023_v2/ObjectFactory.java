
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF023_v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webapp.webservices.SI_ZTMHRPYF023_v2 package. 
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

    private final static QName _MTZTMHRPYF023Request_QNAME = new QName("http://consultas.modernizacion.hr/ZTMHRPYF023", "MT_ZTMHRPYF023_request");
    private final static QName _MTZTMHRPYF023Response_QNAME = new QName("http://consultas.modernizacion.hr/ZTMHRPYF023", "MT_ZTMHRPYF023_response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webapp.webservices.SI_ZTMHRPYF023_v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTZTMHRPYF023Request }
     * 
     */
    public DTZTMHRPYF023Request createDTZTMHRPYF023Request() {
        return new DTZTMHRPYF023Request();
    }

    /**
     * Create an instance of {@link DTZTMHRPYF023Response }
     * 
     */
    public DTZTMHRPYF023Response createDTZTMHRPYF023Response() {
        return new DTZTMHRPYF023Response();
    }

    /**
     * Create an instance of {@link DTZTMHRPYES026 }
     * 
     */
    public DTZTMHRPYES026 createDTZTMHRPYES026() {
        return new DTZTMHRPYES026();
    }

    /**
     * Create an instance of {@link DTZTMHRPYES025 }
     * 
     */
    public DTZTMHRPYES025 createDTZTMHRPYES025() {
        return new DTZTMHRPYES025();
    }

    /**
     * Create an instance of {@link DTZMENSAJESPI2 }
     * 
     */
    public DTZMENSAJESPI2 createDTZMENSAJESPI2() {
        return new DTZMENSAJESPI2();
    }

    /**
     * Create an instance of {@link DTZTMHRPYF023Request.TENTRADA }
     * 
     */
    public DTZTMHRPYF023Request.TENTRADA createDTZTMHRPYF023RequestTENTRADA() {
        return new DTZTMHRPYF023Request.TENTRADA();
    }

    /**
     * Create an instance of {@link DTZTMHRPYF023Response.TMENSAJES }
     * 
     */
    public DTZTMHRPYF023Response.TMENSAJES createDTZTMHRPYF023ResponseTMENSAJES() {
        return new DTZTMHRPYF023Response.TMENSAJES();
    }

    /**
     * Create an instance of {@link DTZTMHRPYF023Response.TSALIDA }
     * 
     */
    public DTZTMHRPYF023Response.TSALIDA createDTZTMHRPYF023ResponseTSALIDA() {
        return new DTZTMHRPYF023Response.TSALIDA();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPYF023Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/ZTMHRPYF023", name = "MT_ZTMHRPYF023_request")
    public JAXBElement<DTZTMHRPYF023Request> createMTZTMHRPYF023Request(DTZTMHRPYF023Request value) {
        return new JAXBElement<DTZTMHRPYF023Request>(_MTZTMHRPYF023Request_QNAME, DTZTMHRPYF023Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPYF023Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/ZTMHRPYF023", name = "MT_ZTMHRPYF023_response")
    public JAXBElement<DTZTMHRPYF023Response> createMTZTMHRPYF023Response(DTZTMHRPYF023Response value) {
        return new JAXBElement<DTZTMHRPYF023Response>(_MTZTMHRPYF023Response_QNAME, DTZTMHRPYF023Response.class, null, value);
    }

}
