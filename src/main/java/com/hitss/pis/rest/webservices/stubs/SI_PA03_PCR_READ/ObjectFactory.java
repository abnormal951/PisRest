
package com.hitss.pis.rest.webservices.stubs.SI_PA03_PCR_READ;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webapp.webservices.SI_PA03_PCR_READ package. 
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

    private final static QName _MTPA03PCRREADResponse_QNAME = new QName("http://etelmex.prestamos.omsasi.rh.tmx/PA03_PCR_READ", "MT_PA03_PCR_READ_response");
    private final static QName _MTPA03PCRREADRequest_QNAME = new QName("http://etelmex.prestamos.omsasi.rh.tmx/PA03_PCR_READ", "MT_PA03_PCR_READ_request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webapp.webservices.SI_PA03_PCR_READ
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTPA03PCRREADResponse }
     * 
     */
    public DTPA03PCRREADResponse createDTPA03PCRREADResponse() {
        return new DTPA03PCRREADResponse();
    }

    /**
     * Create an instance of {@link DTPA03PCRREADRequest }
     * 
     */
    public DTPA03PCRREADRequest createDTPA03PCRREADRequest() {
        return new DTPA03PCRREADRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTPA03PCRREADResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://etelmex.prestamos.omsasi.rh.tmx/PA03_PCR_READ", name = "MT_PA03_PCR_READ_response")
    public JAXBElement<DTPA03PCRREADResponse> createMTPA03PCRREADResponse(DTPA03PCRREADResponse value) {
        return new JAXBElement<DTPA03PCRREADResponse>(_MTPA03PCRREADResponse_QNAME, DTPA03PCRREADResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTPA03PCRREADRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://etelmex.prestamos.omsasi.rh.tmx/PA03_PCR_READ", name = "MT_PA03_PCR_READ_request")
    public JAXBElement<DTPA03PCRREADRequest> createMTPA03PCRREADRequest(DTPA03PCRREADRequest value) {
        return new JAXBElement<DTPA03PCRREADRequest>(_MTPA03PCRREADRequest_QNAME, DTPA03PCRREADRequest.class, null, value);
    }

}
