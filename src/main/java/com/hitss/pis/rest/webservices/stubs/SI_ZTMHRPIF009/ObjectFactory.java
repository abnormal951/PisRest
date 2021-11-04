
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF009;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webapp.webservices.SI_ZTMHRPIF009 package. 
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

    private final static QName _MTZTMHRPIF009Request_QNAME = new QName("http://consultas.modernizacion.hr/ZTMHRPIF009", "MT_ZTMHRPIF009_request");
    private final static QName _MTZTMHRPIF009Response_QNAME = new QName("http://consultas.modernizacion.hr/ZTMHRPIF009", "MT_ZTMHRPIF009_response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webapp.webservices.SI_ZTMHRPIF009
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTZTMHRPIF009Response }
     * 
     */
    public DTZTMHRPIF009Response createDTZTMHRPIF009Response() {
        return new DTZTMHRPIF009Response();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF009Request }
     * 
     */
    public DTZTMHRPIF009Request createDTZTMHRPIF009Request() {
        return new DTZTMHRPIF009Request();
    }

    /**
     * Create an instance of {@link DTZPA2003E }
     * 
     */
    public DTZPA2003E createDTZPA2003E() {
        return new DTZPA2003E();
    }

    /**
     * Create an instance of {@link DTZMENSAJESPI2 }
     * 
     */
    public DTZMENSAJESPI2 createDTZMENSAJESPI2() {
        return new DTZMENSAJESPI2();
    }

    /**
     * Create an instance of {@link DTZTMHRPIE008 }
     * 
     */
    public DTZTMHRPIE008 createDTZTMHRPIE008() {
        return new DTZTMHRPIE008();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF009Response.TMENSAJES }
     * 
     */
    public DTZTMHRPIF009Response.TMENSAJES createDTZTMHRPIF009ResponseTMENSAJES() {
        return new DTZTMHRPIF009Response.TMENSAJES();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF009Response.TSALIDA }
     * 
     */
    public DTZTMHRPIF009Response.TSALIDA createDTZTMHRPIF009ResponseTSALIDA() {
        return new DTZTMHRPIF009Response.TSALIDA();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF009Request.TENTRADA }
     * 
     */
    public DTZTMHRPIF009Request.TENTRADA createDTZTMHRPIF009RequestTENTRADA() {
        return new DTZTMHRPIF009Request.TENTRADA();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPIF009Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/ZTMHRPIF009", name = "MT_ZTMHRPIF009_request")
    public JAXBElement<DTZTMHRPIF009Request> createMTZTMHRPIF009Request(DTZTMHRPIF009Request value) {
        return new JAXBElement<DTZTMHRPIF009Request>(_MTZTMHRPIF009Request_QNAME, DTZTMHRPIF009Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPIF009Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/ZTMHRPIF009", name = "MT_ZTMHRPIF009_response")
    public JAXBElement<DTZTMHRPIF009Response> createMTZTMHRPIF009Response(DTZTMHRPIF009Response value) {
        return new JAXBElement<DTZTMHRPIF009Response>(_MTZTMHRPIF009Response_QNAME, DTZTMHRPIF009Response.class, null, value);
    }

}
