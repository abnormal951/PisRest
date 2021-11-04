
package com.hitss.pis.rest.webservices.stubs.PI_DIASSINBANCO_V2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webapp.webservices.PI_DIASSINBANCO_V2 package. 
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

    private final static QName _MTZTMHRPIF003Request_QNAME = new QName("http://consultas.modernizacion.hr/ZTMHRPIF003", "MT_ZTMHRPIF003_request");
    private final static QName _MTZTMHRPIF003Response_QNAME = new QName("http://consultas.modernizacion.hr/ZTMHRPIF003", "MT_ZTMHRPIF003_response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webapp.webservices.PI_DIASSINBANCO_V2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTZTMHRPIF003Response }
     * 
     */
    public DTZTMHRPIF003Response createDTZTMHRPIF003Response() {
        return new DTZTMHRPIF003Response();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF003Request }
     * 
     */
    public DTZTMHRPIF003Request createDTZTMHRPIF003Request() {
        return new DTZTMHRPIF003Request();
    }

    /**
     * Create an instance of {@link DTZTMHRPYT122 }
     * 
     */
    public DTZTMHRPYT122 createDTZTMHRPYT122() {
        return new DTZTMHRPYT122();
    }

    /**
     * Create an instance of {@link DTZMENSAJESPI3 }
     * 
     */
    public DTZMENSAJESPI3 createDTZMENSAJESPI3() {
        return new DTZMENSAJESPI3();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF003Response.TIZTMHRPYT122 }
     * 
     */
    public DTZTMHRPIF003Response.TIZTMHRPYT122 createDTZTMHRPIF003ResponseTIZTMHRPYT122() {
        return new DTZTMHRPIF003Response.TIZTMHRPYT122();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF003Response.TMENSAJES }
     * 
     */
    public DTZTMHRPIF003Response.TMENSAJES createDTZTMHRPIF003ResponseTMENSAJES() {
        return new DTZTMHRPIF003Response.TMENSAJES();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPIF003Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/ZTMHRPIF003", name = "MT_ZTMHRPIF003_request")
    public JAXBElement<DTZTMHRPIF003Request> createMTZTMHRPIF003Request(DTZTMHRPIF003Request value) {
        return new JAXBElement<DTZTMHRPIF003Request>(_MTZTMHRPIF003Request_QNAME, DTZTMHRPIF003Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPIF003Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/ZTMHRPIF003", name = "MT_ZTMHRPIF003_response")
    public JAXBElement<DTZTMHRPIF003Response> createMTZTMHRPIF003Response(DTZTMHRPIF003Response value) {
        return new JAXBElement<DTZTMHRPIF003Response>(_MTZTMHRPIF003Response_QNAME, DTZTMHRPIF003Response.class, null, value);
    }

}
