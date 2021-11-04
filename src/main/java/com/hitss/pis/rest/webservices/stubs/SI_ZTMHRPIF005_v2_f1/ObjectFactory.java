
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF005_v2_f1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webapp.webservices.SI_ZTMHRPIF005_v2_f1 package. 
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

    private final static QName _MTZTMHRPIF005Response_QNAME = new QName("http://consultas.modernizacion.hr/ZHRATT010", "MT_ZTMHRPIF005_response");
    private final static QName _MTZTMHRPIF005Request_QNAME = new QName("http://consultas.modernizacion.hr/ZHRATT010", "MT_ZTMHRPIF005_request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webapp.webservices.SI_ZTMHRPIF005_v2_f1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTZTMHRPIF005Request }
     * 
     */
    public DTZTMHRPIF005Request createDTZTMHRPIF005Request() {
        return new DTZTMHRPIF005Request();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF005Response }
     * 
     */
    public DTZTMHRPIF005Response createDTZTMHRPIF005Response() {
        return new DTZTMHRPIF005Response();
    }

    /**
     * Create an instance of {@link DTZTMHRPIE003 }
     * 
     */
    public DTZTMHRPIE003 createDTZTMHRPIE003() {
        return new DTZTMHRPIE003();
    }

    /**
     * Create an instance of {@link DTZHRATT010E }
     * 
     */
    public DTZHRATT010E createDTZHRATT010E() {
        return new DTZHRATT010E();
    }

    /**
     * Create an instance of {@link DTZMENSAJESPI2 }
     * 
     */
    public DTZMENSAJESPI2 createDTZMENSAJESPI2() {
        return new DTZMENSAJESPI2();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF005Request.TENTRADA }
     * 
     */
    public DTZTMHRPIF005Request.TENTRADA createDTZTMHRPIF005RequestTENTRADA() {
        return new DTZTMHRPIF005Request.TENTRADA();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF005Response.TMENSAJES }
     * 
     */
    public DTZTMHRPIF005Response.TMENSAJES createDTZTMHRPIF005ResponseTMENSAJES() {
        return new DTZTMHRPIF005Response.TMENSAJES();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF005Response.TSALIDA }
     * 
     */
    public DTZTMHRPIF005Response.TSALIDA createDTZTMHRPIF005ResponseTSALIDA() {
        return new DTZTMHRPIF005Response.TSALIDA();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPIF005Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/ZHRATT010", name = "MT_ZTMHRPIF005_response")
    public JAXBElement<DTZTMHRPIF005Response> createMTZTMHRPIF005Response(DTZTMHRPIF005Response value) {
        return new JAXBElement<DTZTMHRPIF005Response>(_MTZTMHRPIF005Response_QNAME, DTZTMHRPIF005Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPIF005Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/ZHRATT010", name = "MT_ZTMHRPIF005_request")
    public JAXBElement<DTZTMHRPIF005Request> createMTZTMHRPIF005Request(DTZTMHRPIF005Request value) {
        return new JAXBElement<DTZTMHRPIF005Request>(_MTZTMHRPIF005Request_QNAME, DTZTMHRPIF005Request.class, null, value);
    }

}
