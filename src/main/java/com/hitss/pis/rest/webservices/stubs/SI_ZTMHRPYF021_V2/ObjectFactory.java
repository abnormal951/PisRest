
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF021_V2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webapp.webservices.SI_ZTMHRPYF021_V2 package. 
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

    private final static QName _MTZTMHRPYF021Request_QNAME = new QName("http://consultas.modernizacion.hr/ZTMHRPYF021", "MT_ZTMHRPYF021_request");
    private final static QName _MTZTMHRPYF021Response_QNAME = new QName("http://consultas.modernizacion.hr/ZTMHRPYF021", "MT_ZTMHRPYF021_response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webapp.webservices.SI_ZTMHRPYF021_V2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTZTMHRPYF021Response }
     * 
     */
    public DTZTMHRPYF021Response createDTZTMHRPYF021Response() {
        return new DTZTMHRPYF021Response();
    }

    /**
     * Create an instance of {@link DTZTMHRPYF021Request }
     * 
     */
    public DTZTMHRPYF021Request createDTZTMHRPYF021Request() {
        return new DTZTMHRPYF021Request();
    }

    /**
     * Create an instance of {@link DTZTMHRPYES024 }
     * 
     */
    public DTZTMHRPYES024 createDTZTMHRPYES024() {
        return new DTZTMHRPYES024();
    }

    /**
     * Create an instance of {@link DTZMENSAJESPI }
     * 
     */
    public DTZMENSAJESPI createDTZMENSAJESPI() {
        return new DTZMENSAJESPI();
    }

    /**
     * Create an instance of {@link DTZTMHRPYES022 }
     * 
     */
    public DTZTMHRPYES022 createDTZTMHRPYES022() {
        return new DTZTMHRPYES022();
    }

    /**
     * Create an instance of {@link DTZTMHRPYF021Response.TMENSAJES }
     * 
     */
    public DTZTMHRPYF021Response.TMENSAJES createDTZTMHRPYF021ResponseTMENSAJES() {
        return new DTZTMHRPYF021Response.TMENSAJES();
    }

    /**
     * Create an instance of {@link DTZTMHRPYF021Response.TSALIDA }
     * 
     */
    public DTZTMHRPYF021Response.TSALIDA createDTZTMHRPYF021ResponseTSALIDA() {
        return new DTZTMHRPYF021Response.TSALIDA();
    }

    /**
     * Create an instance of {@link DTZTMHRPYF021Request.TENTRADA }
     * 
     */
    public DTZTMHRPYF021Request.TENTRADA createDTZTMHRPYF021RequestTENTRADA() {
        return new DTZTMHRPYF021Request.TENTRADA();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPYF021Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/ZTMHRPYF021", name = "MT_ZTMHRPYF021_request")
    public JAXBElement<DTZTMHRPYF021Request> createMTZTMHRPYF021Request(DTZTMHRPYF021Request value) {
        return new JAXBElement<DTZTMHRPYF021Request>(_MTZTMHRPYF021Request_QNAME, DTZTMHRPYF021Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPYF021Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/ZTMHRPYF021", name = "MT_ZTMHRPYF021_response")
    public JAXBElement<DTZTMHRPYF021Response> createMTZTMHRPYF021Response(DTZTMHRPYF021Response value) {
        return new JAXBElement<DTZTMHRPYF021Response>(_MTZTMHRPYF021Response_QNAME, DTZTMHRPYF021Response.class, null, value);
    }

}
