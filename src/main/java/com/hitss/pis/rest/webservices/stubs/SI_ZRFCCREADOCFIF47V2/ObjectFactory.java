
package com.hitss.pis.rest.webservices.stubs.SI_ZRFCCREADOCFIF47V2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webapp.webservices.SI_ZRFCCREADOCFIF47V2 package. 
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

    private final static QName _MTZRFCCREADOCFIF47Request_QNAME = new QName("http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CREA_DOC_FI_F47", "MT_Z_RFC_CREA_DOC_FI_F47_request");
    private final static QName _MTZRFCCREADOCFIF47Response_QNAME = new QName("http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CREA_DOC_FI_F47", "MT_Z_RFC_CREA_DOC_FI_F47_response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webapp.webservices.SI_ZRFCCREADOCFIF47V2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTZRFCCREADOCFIF47Request }
     * 
     */
    public DTZRFCCREADOCFIF47Request createDTZRFCCREADOCFIF47Request() {
        return new DTZRFCCREADOCFIF47Request();
    }

    /**
     * Create an instance of {@link DTZRFCCREADOCFIF47Response }
     * 
     */
    public DTZRFCCREADOCFIF47Response createDTZRFCCREADOCFIF47Response() {
        return new DTZRFCCREADOCFIF47Response();
    }

    /**
     * Create an instance of {@link DTMAESTRO }
     * 
     */
    public DTMAESTRO createDTMAESTRO() {
        return new DTMAESTRO();
    }

    /**
     * Create an instance of {@link DTPARTIDA }
     * 
     */
    public DTPARTIDA createDTPARTIDA() {
        return new DTPARTIDA();
    }

    /**
     * Create an instance of {@link DTZRFCCREADOCFIF47Request.MAESTRO }
     * 
     */
    public DTZRFCCREADOCFIF47Request.MAESTRO createDTZRFCCREADOCFIF47RequestMAESTRO() {
        return new DTZRFCCREADOCFIF47Request.MAESTRO();
    }

    /**
     * Create an instance of {@link DTZRFCCREADOCFIF47Request.PARTIDA }
     * 
     */
    public DTZRFCCREADOCFIF47Request.PARTIDA createDTZRFCCREADOCFIF47RequestPARTIDA() {
        return new DTZRFCCREADOCFIF47Request.PARTIDA();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZRFCCREADOCFIF47Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CREA_DOC_FI_F47", name = "MT_Z_RFC_CREA_DOC_FI_F47_request")
    public JAXBElement<DTZRFCCREADOCFIF47Request> createMTZRFCCREADOCFIF47Request(DTZRFCCREADOCFIF47Request value) {
        return new JAXBElement<DTZRFCCREADOCFIF47Request>(_MTZRFCCREADOCFIF47Request_QNAME, DTZRFCCREADOCFIF47Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZRFCCREADOCFIF47Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CREA_DOC_FI_F47", name = "MT_Z_RFC_CREA_DOC_FI_F47_response")
    public JAXBElement<DTZRFCCREADOCFIF47Response> createMTZRFCCREADOCFIF47Response(DTZRFCCREADOCFIF47Response value) {
        return new JAXBElement<DTZRFCCREADOCFIF47Response>(_MTZRFCCREADOCFIF47Response_QNAME, DTZRFCCREADOCFIF47Response.class, null, value);
    }

}
