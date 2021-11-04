
package com.hitss.pis.rest.webservices.stubs.PI_IT2006;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webapp.webservices.PI_IT2006 package. 
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

    private final static QName _MTZTMHRPIF006Request_QNAME = new QName("http://consultas.modernizacion.hr/ZTMHRPIF006", "MT_ZTMHRPIF006_request");
    private final static QName _MTZTMHRPIF006Response_QNAME = new QName("http://consultas.modernizacion.hr/ZTMHRPIF006", "MT_ZTMHRPIF006_response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webapp.webservices.PI_IT2006
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTZTMHRPIF006Response }
     * 
     */
    public DTZTMHRPIF006Response createDTZTMHRPIF006Response() {
        return new DTZTMHRPIF006Response();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF006Request }
     * 
     */
    public DTZTMHRPIF006Request createDTZTMHRPIF006Request() {
        return new DTZTMHRPIF006Request();
    }

    /**
     * Create an instance of {@link DTZTMHRPIE002 }
     * 
     */
    public DTZTMHRPIE002 createDTZTMHRPIE002() {
        return new DTZTMHRPIE002();
    }

    /**
     * Create an instance of {@link DTZPA2006E }
     * 
     */
    public DTZPA2006E createDTZPA2006E() {
        return new DTZPA2006E();
    }

    /**
     * Create an instance of {@link DTZMENSAJESPI2 }
     * 
     */
    public DTZMENSAJESPI2 createDTZMENSAJESPI2() {
        return new DTZMENSAJESPI2();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF006Response.TMENSAJES }
     * 
     */
    public DTZTMHRPIF006Response.TMENSAJES createDTZTMHRPIF006ResponseTMENSAJES() {
        return new DTZTMHRPIF006Response.TMENSAJES();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF006Response.TSALIDA }
     * 
     */
    public DTZTMHRPIF006Response.TSALIDA createDTZTMHRPIF006ResponseTSALIDA() {
        return new DTZTMHRPIF006Response.TSALIDA();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF006Request.TENTRADA }
     * 
     */
    public DTZTMHRPIF006Request.TENTRADA createDTZTMHRPIF006RequestTENTRADA() {
        return new DTZTMHRPIF006Request.TENTRADA();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPIF006Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/ZTMHRPIF006", name = "MT_ZTMHRPIF006_request")
    public JAXBElement<DTZTMHRPIF006Request> createMTZTMHRPIF006Request(DTZTMHRPIF006Request value) {
        return new JAXBElement<DTZTMHRPIF006Request>(_MTZTMHRPIF006Request_QNAME, DTZTMHRPIF006Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPIF006Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/ZTMHRPIF006", name = "MT_ZTMHRPIF006_response")
    public JAXBElement<DTZTMHRPIF006Response> createMTZTMHRPIF006Response(DTZTMHRPIF006Response value) {
        return new JAXBElement<DTZTMHRPIF006Response>(_MTZTMHRPIF006Response_QNAME, DTZTMHRPIF006Response.class, null, value);
    }

}
