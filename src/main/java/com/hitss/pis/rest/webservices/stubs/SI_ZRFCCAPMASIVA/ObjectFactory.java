
package com.hitss.pis.rest.webservices.stubs.SI_ZRFCCAPMASIVA;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webapp.webservices.SI_ZRFCCAPMASIVA package. 
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

    private final static QName _MTZRFCCAPMASIVAResponse_QNAME = new QName("http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CAPMASIVA", "MT_Z_RFC_CAPMASIVA_response");
    private final static QName _MTZRFCCAPMASIVARequest_QNAME = new QName("http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CAPMASIVA", "MT_Z_RFC_CAPMASIVA_request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webapp.webservices.SI_ZRFCCAPMASIVA
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTZRFCCAPMASIVAResponse }
     * 
     */
    public DTZRFCCAPMASIVAResponse createDTZRFCCAPMASIVAResponse() {
        return new DTZRFCCAPMASIVAResponse();
    }

    /**
     * Create an instance of {@link DTZRFCCAPMASIVARequest }
     * 
     */
    public DTZRFCCAPMASIVARequest createDTZRFCCAPMASIVARequest() {
        return new DTZRFCCAPMASIVARequest();
    }

    /**
     * Create an instance of {@link DTZTIMPCAPMASIVA }
     * 
     */
    public DTZTIMPCAPMASIVA createDTZTIMPCAPMASIVA() {
        return new DTZTIMPCAPMASIVA();
    }

    /**
     * Create an instance of {@link DTZHRAITE001 }
     * 
     */
    public DTZHRAITE001 createDTZHRAITE001() {
        return new DTZHRAITE001();
    }

    /**
     * Create an instance of {@link DTZRFCCAPMASIVAResponse.TERRSAL }
     * 
     */
    public DTZRFCCAPMASIVAResponse.TERRSAL createDTZRFCCAPMASIVAResponseTERRSAL() {
        return new DTZRFCCAPMASIVAResponse.TERRSAL();
    }

    /**
     * Create an instance of {@link DTZRFCCAPMASIVARequest.TEXPENT }
     * 
     */
    public DTZRFCCAPMASIVARequest.TEXPENT createDTZRFCCAPMASIVARequestTEXPENT() {
        return new DTZRFCCAPMASIVARequest.TEXPENT();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZRFCCAPMASIVAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CAPMASIVA", name = "MT_Z_RFC_CAPMASIVA_response")
    public JAXBElement<DTZRFCCAPMASIVAResponse> createMTZRFCCAPMASIVAResponse(DTZRFCCAPMASIVAResponse value) {
        return new JAXBElement<DTZRFCCAPMASIVAResponse>(_MTZRFCCAPMASIVAResponse_QNAME, DTZRFCCAPMASIVAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZRFCCAPMASIVARequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CAPMASIVA", name = "MT_Z_RFC_CAPMASIVA_request")
    public JAXBElement<DTZRFCCAPMASIVARequest> createMTZRFCCAPMASIVARequest(DTZRFCCAPMASIVARequest value) {
        return new JAXBElement<DTZRFCCAPMASIVARequest>(_MTZRFCCAPMASIVARequest_QNAME, DTZRFCCAPMASIVARequest.class, null, value);
    }

}
