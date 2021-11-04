
package com.hitss.pis.rest.webservices.stubs.SI_DATO_MAESTRO_v4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webapp.webservices.SI_DATO_MAESTRO_v4 package. 
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

    private final static QName _MTELEMENTOResponse_QNAME = new QName("http://consultas.modernizacion.hr/DatoMaestro", "MT_ELEMENTO_response");
    private final static QName _MTELEMENTORequest_QNAME = new QName("http://consultas.modernizacion.hr/DatoMaestro", "MT_ELEMENTO_request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webapp.webservices.SI_DATO_MAESTRO_v4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTELEMENTOResponse }
     * 
     */
    public DTELEMENTOResponse createDTELEMENTOResponse() {
        return new DTELEMENTOResponse();
    }

    /**
     * Create an instance of {@link DTELEMENTOResponse.TSALIDA }
     * 
     */
    public DTELEMENTOResponse.TSALIDA createDTELEMENTOResponseTSALIDA() {
        return new DTELEMENTOResponse.TSALIDA();
    }

    /**
     * Create an instance of {@link DTELEMENTOResponse.TMENSAJES }
     * 
     */
    public DTELEMENTOResponse.TMENSAJES createDTELEMENTOResponseTMENSAJES() {
        return new DTELEMENTOResponse.TMENSAJES();
    }

    /**
     * Create an instance of {@link DTELEMENTO }
     * 
     */
    public DTELEMENTO createDTELEMENTO() {
        return new DTELEMENTO();
    }

    /**
     * Create an instance of {@link DTELEMENTO.TENTRADA }
     * 
     */
    public DTELEMENTO.TENTRADA createDTELEMENTOTENTRADA() {
        return new DTELEMENTO.TENTRADA();
    }

    /**
     * Create an instance of {@link DTELEMENTOResponse.TSALIDA.Item }
     * 
     */
    public DTELEMENTOResponse.TSALIDA.Item createDTELEMENTOResponseTSALIDAItem() {
        return new DTELEMENTOResponse.TSALIDA.Item();
    }

    /**
     * Create an instance of {@link DTELEMENTOResponse.TMENSAJES.Item }
     * 
     */
    public DTELEMENTOResponse.TMENSAJES.Item createDTELEMENTOResponseTMENSAJESItem() {
        return new DTELEMENTOResponse.TMENSAJES.Item();
    }

    /**
     * Create an instance of {@link DTELEMENTO.TENTRADA.Item }
     * 
     */
    public DTELEMENTO.TENTRADA.Item createDTELEMENTOTENTRADAItem() {
        return new DTELEMENTO.TENTRADA.Item();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTELEMENTOResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/DatoMaestro", name = "MT_ELEMENTO_response")
    public JAXBElement<DTELEMENTOResponse> createMTELEMENTOResponse(DTELEMENTOResponse value) {
        return new JAXBElement<DTELEMENTOResponse>(_MTELEMENTOResponse_QNAME, DTELEMENTOResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTELEMENTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultas.modernizacion.hr/DatoMaestro", name = "MT_ELEMENTO_request")
    public JAXBElement<DTELEMENTO> createMTELEMENTORequest(DTELEMENTO value) {
        return new JAXBElement<DTELEMENTO>(_MTELEMENTORequest_QNAME, DTELEMENTO.class, null, value);
    }

}
