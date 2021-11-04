
package com.hitss.pis.rest.webservices.stubs.InfoT_PA9990_V2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webapp.webservices.InfoT_PA9990_V2 package. 
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

    private final static QName _MTZTMHRPIF002Request_QNAME = new QName("http://consultas.modernizacion.hr/InfoT_PA9990", "MT_ZTMHRPIF002_request");
    private final static QName _MTZTMHRPIF002Response_QNAME = new QName("http://consultas.modernizacion.hr/InfoT_PA9990", "MT_ZTMHRPIF002_response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webapp.webservices.InfoT_PA9990_V2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTTMENSAJES }
     * 
     */
    public DTTMENSAJES createDTTMENSAJES() {
        return new DTTMENSAJES();
    }

    /**
     * Create an instance of {@link DTTENTRADA }
     * 
     */
    public DTTENTRADA createDTTENTRADA() {
        return new DTTENTRADA();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF002Response }
     * 
     */
    public DTZTMHRPIF002Response createDTZTMHRPIF002Response() {
        return new DTZTMHRPIF002Response();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF002Response.TSALIDA }
     * 
     */
    public DTZTMHRPIF002Response.TSALIDA createDTZTMHRPIF002ResponseTSALIDA() {
        return new DTZTMHRPIF002Response.TSALIDA();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF002Request }
     * 
     */
    public DTZTMHRPIF002Request createDTZTMHRPIF002Request() {
        return new DTZTMHRPIF002Request();
    }

    /**
     * Create an instance of {@link DTTMENSAJES.Item }
     * 
     */
    public DTTMENSAJES.Item createDTTMENSAJESItem() {
        return new DTTMENSAJES.Item();
    }

    /**
     * Create an instance of {@link DTTENTRADA.Item }
     * 
     */
    public DTTENTRADA.Item createDTTENTRADAItem() {
        return new DTTENTRADA.Item();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF002Response.TSALIDA.Item }
     * 
     */
    public DTZTMHRPIF002Response.TSALIDA.Item createDTZTMHRPIF002ResponseTSALIDAItem() {
        return new DTZTMHRPIF002Response.TSALIDA.Item();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPIF002Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/InfoT_PA9990", name = "MT_ZTMHRPIF002_request")
    public JAXBElement<DTZTMHRPIF002Request> createMTZTMHRPIF002Request(DTZTMHRPIF002Request value) {
        return new JAXBElement<DTZTMHRPIF002Request>(_MTZTMHRPIF002Request_QNAME, DTZTMHRPIF002Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPIF002Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/InfoT_PA9990", name = "MT_ZTMHRPIF002_response")
    public JAXBElement<DTZTMHRPIF002Response> createMTZTMHRPIF002Response(DTZTMHRPIF002Response value) {
        return new JAXBElement<DTZTMHRPIF002Response>(_MTZTMHRPIF002Response_QNAME, DTZTMHRPIF002Response.class, null, value);
    }

}
