
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF028;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webapp.webservices.SI_ZTMHRPYF028 package. 
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

    private final static QName _MTZTMHRPYF028Response_QNAME = new QName("http://etelmex.jubilados.rh.telmex/consultaLFB1", "MT_ZTMHRPYF028_response");
    private final static QName _MTZTMHRPYF028Request_QNAME = new QName("http://etelmex.jubilados.rh.telmex/consultaLFB1", "MT_ZTMHRPYF028_request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webapp.webservices.SI_ZTMHRPYF028
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTZTMHRPYF028Request }
     * 
     */
    public DTZTMHRPYF028Request createDTZTMHRPYF028Request() {
        return new DTZTMHRPYF028Request();
    }

    /**
     * Create an instance of {@link DTZTMHRPYF028Response }
     * 
     */
    public DTZTMHRPYF028Response createDTZTMHRPYF028Response() {
        return new DTZTMHRPYF028Response();
    }

    /**
     * Create an instance of {@link DTZTMHRPYES032 }
     * 
     */
    public DTZTMHRPYES032 createDTZTMHRPYES032() {
        return new DTZTMHRPYES032();
    }

    /**
     * Create an instance of {@link DTZTMHRPYES031 }
     * 
     */
    public DTZTMHRPYES031 createDTZTMHRPYES031() {
        return new DTZTMHRPYES031();
    }

    /**
     * Create an instance of {@link DTZTMHRPYES030 }
     * 
     */
    public DTZTMHRPYES030 createDTZTMHRPYES030() {
        return new DTZTMHRPYES030();
    }

    /**
     * Create an instance of {@link DTZTMHRPYF028Request.TCONSULTA }
     * 
     */
    public DTZTMHRPYF028Request.TCONSULTA createDTZTMHRPYF028RequestTCONSULTA() {
        return new DTZTMHRPYF028Request.TCONSULTA();
    }

    /**
     * Create an instance of {@link DTZTMHRPYF028Response.TLFB1 }
     * 
     */
    public DTZTMHRPYF028Response.TLFB1 createDTZTMHRPYF028ResponseTLFB1() {
        return new DTZTMHRPYF028Response.TLFB1();
    }

    /**
     * Create an instance of {@link DTZTMHRPYF028Response.TMENSAJES }
     * 
     */
    public DTZTMHRPYF028Response.TMENSAJES createDTZTMHRPYF028ResponseTMENSAJES() {
        return new DTZTMHRPYF028Response.TMENSAJES();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPYF028Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://etelmex.jubilados.rh.telmex/consultaLFB1", name = "MT_ZTMHRPYF028_response")
    public JAXBElement<DTZTMHRPYF028Response> createMTZTMHRPYF028Response(DTZTMHRPYF028Response value) {
        return new JAXBElement<DTZTMHRPYF028Response>(_MTZTMHRPYF028Response_QNAME, DTZTMHRPYF028Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPYF028Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://etelmex.jubilados.rh.telmex/consultaLFB1", name = "MT_ZTMHRPYF028_request")
    public JAXBElement<DTZTMHRPYF028Request> createMTZTMHRPYF028Request(DTZTMHRPYF028Request value) {
        return new JAXBElement<DTZTMHRPYF028Request>(_MTZTMHRPYF028Request_QNAME, DTZTMHRPYF028Request.class, null, value);
    }

}
