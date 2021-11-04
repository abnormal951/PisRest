
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF007;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webapp.webservices.SI_ZTMHRPIF007 package. 
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

    private final static QName _MTZTMHRPIF007Response_QNAME = new QName("http://consultas.modernizacion.hr/Programa_Anual_Vacaciones", "MT_ZTMHRPIF007_response");
    private final static QName _MTZTMHRPIF007Request_QNAME = new QName("http://consultas.modernizacion.hr/Programa_Anual_Vacaciones", "MT_ZTMHRPIF007_request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webapp.webservices.SI_ZTMHRPIF007
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTZTMHRPIF007Response }
     * 
     */
    public DTZTMHRPIF007Response createDTZTMHRPIF007Response() {
        return new DTZTMHRPIF007Response();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF007Request }
     * 
     */
    public DTZTMHRPIF007Request createDTZTMHRPIF007Request() {
        return new DTZTMHRPIF007Request();
    }

    /**
     * Create an instance of {@link DTZTMHRPITT006 }
     * 
     */
    public DTZTMHRPITT006 createDTZTMHRPITT006() {
        return new DTZTMHRPITT006();
    }

    /**
     * Create an instance of {@link DTZMENSAJESPI2 }
     * 
     */
    public DTZMENSAJESPI2 createDTZMENSAJESPI2() {
        return new DTZMENSAJESPI2();
    }

    /**
     * Create an instance of {@link DTZHRATT030E }
     * 
     */
    public DTZHRATT030E createDTZHRATT030E() {
        return new DTZHRATT030E();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF007Response.TMENSAJES }
     * 
     */
    public DTZTMHRPIF007Response.TMENSAJES createDTZTMHRPIF007ResponseTMENSAJES() {
        return new DTZTMHRPIF007Response.TMENSAJES();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF007Response.TSALIDA }
     * 
     */
    public DTZTMHRPIF007Response.TSALIDA createDTZTMHRPIF007ResponseTSALIDA() {
        return new DTZTMHRPIF007Response.TSALIDA();
    }

    /**
     * Create an instance of {@link DTZTMHRPIF007Request.TENTRADA }
     * 
     */
    public DTZTMHRPIF007Request.TENTRADA createDTZTMHRPIF007RequestTENTRADA() {
        return new DTZTMHRPIF007Request.TENTRADA();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPIF007Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/Programa_Anual_Vacaciones", name = "MT_ZTMHRPIF007_response")
    public JAXBElement<DTZTMHRPIF007Response> createMTZTMHRPIF007Response(DTZTMHRPIF007Response value) {
        return new JAXBElement<DTZTMHRPIF007Response>(_MTZTMHRPIF007Response_QNAME, DTZTMHRPIF007Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZTMHRPIF007Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/Programa_Anual_Vacaciones", name = "MT_ZTMHRPIF007_request")
    public JAXBElement<DTZTMHRPIF007Request> createMTZTMHRPIF007Request(DTZTMHRPIF007Request value) {
        return new JAXBElement<DTZTMHRPIF007Request>(_MTZTMHRPIF007Request_QNAME, DTZTMHRPIF007Request.class, null, value);
    }

}
