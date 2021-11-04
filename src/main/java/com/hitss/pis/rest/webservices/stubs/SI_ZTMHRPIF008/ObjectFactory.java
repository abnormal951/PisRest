
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF008;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webapp.webservices.SI_ZTMHRPIF008 package. 
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

    private final static QName _MTZTMHRPIF008Response_QNAME = new QName("http://consultas.modernizacion.hr/FechaPPV", "MT_ZTMHRPIF008_response");
    private final static QName _MTZTMHRPIF008Request_QNAME = new QName("http://consultas.modernizacion.hr/FechaPPV", "MT_ZTMHRPIF008_request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webapp.webservices.SI_ZTMHRPIF008
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTZTMHRPIF008Request }
     * 
     */
    public DTZTMHRPIF008Request createDTZTMHRPIF008Request() {
        return new DTZTMHRPIF008Request();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF008Response }
     * 
     */
    public DTZTMHRPIF008Response createDTZTMHRPIF008Response() {
        return new DTZTMHRPIF008Response();
    }

    /**
     * Create an instance of {@link DTZPA0019E }
     * 
     */
    public DTZPA0019E createDTZPA0019E() {
        return new DTZPA0019E();
    }

    /**
     * Create an instance of {@link DTZMENSAJESPI2 }
     * 
     */
    public DTZMENSAJESPI2 createDTZMENSAJESPI2() {
        return new DTZMENSAJESPI2();
    }

    /**
     * Create an instance of {@link DTZTMHRPIE007 }
     * 
     */
    public DTZTMHRPIE007 createDTZTMHRPIE007() {
        return new DTZTMHRPIE007();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF008Request.TENTRADA }
     * 
     */
    public DTZTMHRPIF008Request.TENTRADA createDTZTMHRPIF008RequestTENTRADA() {
        return new DTZTMHRPIF008Request.TENTRADA();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF008Response.TMENSAJES }
     * 
     */
    public DTZTMHRPIF008Response.TMENSAJES createDTZTMHRPIF008ResponseTMENSAJES() {
        return new DTZTMHRPIF008Response.TMENSAJES();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF008Response.TSALIDA }
     * 
     */
    public DTZTMHRPIF008Response.TSALIDA createDTZTMHRPIF008ResponseTSALIDA() {
        return new DTZTMHRPIF008Response.TSALIDA();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPIF008Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/FechaPPV", name = "MT_ZTMHRPIF008_response")
    public JAXBElement<DTZTMHRPIF008Response> createMTZTMHRPIF008Response(DTZTMHRPIF008Response value) {
        return new JAXBElement<DTZTMHRPIF008Response>(_MTZTMHRPIF008Response_QNAME, DTZTMHRPIF008Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPIF008Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/FechaPPV", name = "MT_ZTMHRPIF008_request")
    public JAXBElement<DTZTMHRPIF008Request> createMTZTMHRPIF008Request(DTZTMHRPIF008Request value) {
        return new JAXBElement<DTZTMHRPIF008Request>(_MTZTMHRPIF008Request_QNAME, DTZTMHRPIF008Request.class, null, value);
    }

}
