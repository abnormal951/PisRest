
package com.hitss.pis.rest.webservices.stubs.sibapiemplcommgetdetailedlistv2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the telmex.rh.jubilados.etelmex.pa0105 package. 
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

    private final static QName _MTBAPIEMPLCOMMGETDETAILEDLISTResponse_QNAME = new QName("http://etelmex.jubilados.rh.telmex/PA0105", "MT_BAPI_EMPLCOMM_GETDETAILEDLIST_response");
    private final static QName _MTBAPIEMPLCOMMGETDETAILEDLISTRequest_QNAME = new QName("http://etelmex.jubilados.rh.telmex/PA0105", "MT_BAPI_EMPLCOMM_GETDETAILEDLIST_request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: telmex.rh.jubilados.etelmex.pa0105
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTBAPIEMPLCOMMGETDETAILEDLISTResponse }
     * 
     */
    public DTBAPIEMPLCOMMGETDETAILEDLISTResponse createDTBAPIEMPLCOMMGETDETAILEDLISTResponse() {
        return new DTBAPIEMPLCOMMGETDETAILEDLISTResponse();
    }

    /**
     * Create an instance of {@link DTBAPIEMPLCOMMGETDETAILEDLISTRequest }
     * 
     */
    public DTBAPIEMPLCOMMGETDETAILEDLISTRequest createDTBAPIEMPLCOMMGETDETAILEDLISTRequest() {
        return new DTBAPIEMPLCOMMGETDETAILEDLISTRequest();
    }

    /**
     * Create an instance of {@link DTBAPIP0105NL }
     * 
     */
    public DTBAPIP0105NL createDTBAPIP0105NL() {
        return new DTBAPIP0105NL();
    }

    /**
     * Create an instance of {@link DTBAPIRETURN1 }
     * 
     */
    public DTBAPIRETURN1 createDTBAPIRETURN1() {
        return new DTBAPIRETURN1();
    }

    /**
     * Create an instance of {@link DTBAPIEMPLCOMMGETDETAILEDLISTResponse.COMMUNICATION }
     * 
     */
    public DTBAPIEMPLCOMMGETDETAILEDLISTResponse.COMMUNICATION createDTBAPIEMPLCOMMGETDETAILEDLISTResponseCOMMUNICATION() {
        return new DTBAPIEMPLCOMMGETDETAILEDLISTResponse.COMMUNICATION();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTBAPIEMPLCOMMGETDETAILEDLISTResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://etelmex.jubilados.rh.telmex/PA0105", name = "MT_BAPI_EMPLCOMM_GETDETAILEDLIST_response")
    public JAXBElement<DTBAPIEMPLCOMMGETDETAILEDLISTResponse> createMTBAPIEMPLCOMMGETDETAILEDLISTResponse(DTBAPIEMPLCOMMGETDETAILEDLISTResponse value) {
        return new JAXBElement<DTBAPIEMPLCOMMGETDETAILEDLISTResponse>(_MTBAPIEMPLCOMMGETDETAILEDLISTResponse_QNAME, DTBAPIEMPLCOMMGETDETAILEDLISTResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTBAPIEMPLCOMMGETDETAILEDLISTRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://etelmex.jubilados.rh.telmex/PA0105", name = "MT_BAPI_EMPLCOMM_GETDETAILEDLIST_request")
    public JAXBElement<DTBAPIEMPLCOMMGETDETAILEDLISTRequest> createMTBAPIEMPLCOMMGETDETAILEDLISTRequest(DTBAPIEMPLCOMMGETDETAILEDLISTRequest value) {
        return new JAXBElement<DTBAPIEMPLCOMMGETDETAILEDLISTRequest>(_MTBAPIEMPLCOMMGETDETAILEDLISTRequest_QNAME, DTBAPIEMPLCOMMGETDETAILEDLISTRequest.class, null, value);
    }

}
