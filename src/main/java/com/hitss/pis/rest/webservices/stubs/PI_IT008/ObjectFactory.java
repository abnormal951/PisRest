
package com.hitss.pis.rest.webservices.stubs.PI_IT008;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webapp.webservices.PI_IT008 package. 
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

    private final static QName _MTZTMHRPIF004Request_QNAME = new QName("http://consultas.modernizacion.hr/ZTMHRPIF004", "MT_ZTMHRPIF004_request");
    private final static QName _MTZTMHRPIF004Response_QNAME = new QName("http://consultas.modernizacion.hr/ZTMHRPIF004", "MT_ZTMHRPIF004_response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webapp.webservices.PI_IT008
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTZTMHRPIF004Response }
     * 
     */
    public DTZTMHRPIF004Response createDTZTMHRPIF004Response() {
        return new DTZTMHRPIF004Response();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF004Request }
     * 
     */
    public DTZTMHRPIF004Request createDTZTMHRPIF004Request() {
        return new DTZTMHRPIF004Request();
    }

    /**
     * Create an instance of {@link DTZPA0008E }
     * 
     */
    public DTZPA0008E createDTZPA0008E() {
        return new DTZPA0008E();
    }

    /**
     * Create an instance of {@link DTZTMHRPIE004 }
     * 
     */
    public DTZTMHRPIE004 createDTZTMHRPIE004() {
        return new DTZTMHRPIE004();
    }

    /**
     * Create an instance of {@link DTZMENSAJESPI2 }
     * 
     */
    public DTZMENSAJESPI2 createDTZMENSAJESPI2() {
        return new DTZMENSAJESPI2();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF004Response.TMENSAJES }
     * 
     */
    public DTZTMHRPIF004Response.TMENSAJES createDTZTMHRPIF004ResponseTMENSAJES() {
        return new DTZTMHRPIF004Response.TMENSAJES();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF004Response.TSALIDA }
     * 
     */
    public DTZTMHRPIF004Response.TSALIDA createDTZTMHRPIF004ResponseTSALIDA() {
        return new DTZTMHRPIF004Response.TSALIDA();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF004Request.TENTRADA }
     * 
     */
    public DTZTMHRPIF004Request.TENTRADA createDTZTMHRPIF004RequestTENTRADA() {
        return new DTZTMHRPIF004Request.TENTRADA();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPIF004Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/ZTMHRPIF004", name = "MT_ZTMHRPIF004_request")
    public JAXBElement<DTZTMHRPIF004Request> createMTZTMHRPIF004Request(DTZTMHRPIF004Request value) {
        return new JAXBElement<DTZTMHRPIF004Request>(_MTZTMHRPIF004Request_QNAME, DTZTMHRPIF004Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPIF004Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/ZTMHRPIF004", name = "MT_ZTMHRPIF004_response")
    public JAXBElement<DTZTMHRPIF004Response> createMTZTMHRPIF004Response(DTZTMHRPIF004Response value) {
        return new JAXBElement<DTZTMHRPIF004Response>(_MTZTMHRPIF004Response_QNAME, DTZTMHRPIF004Response.class, null, value);
    }

}
