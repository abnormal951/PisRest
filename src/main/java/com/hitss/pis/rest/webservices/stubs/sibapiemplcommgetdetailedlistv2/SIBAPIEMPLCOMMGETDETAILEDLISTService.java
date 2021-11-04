
package com.hitss.pis.rest.webservices.stubs.sibapiemplcommgetdetailedlistv2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SI_BAPI_EMPLCOMM_GETDETAILEDLISTService", targetNamespace = "http://etelmex.jubilados.rh.telmex/PA0105", wsdlLocation = "file:/C:/SI_BAPI_EMPLCOMM_GETDETAILEDLIST_v2.wsdl")
public class SIBAPIEMPLCOMMGETDETAILEDLISTService
    extends Service
{

    private final static URL SIBAPIEMPLCOMMGETDETAILEDLISTSERVICE_WSDL_LOCATION;
    private final static WebServiceException SIBAPIEMPLCOMMGETDETAILEDLISTSERVICE_EXCEPTION;
    private final static javax.xml.namespace.QName SIBAPIEMPLCOMMGETDETAILEDLISTSERVICE_QNAME = new javax.xml.namespace.QName("http://etelmex.jubilados.rh.telmex/PA0105", "SI_BAPI_EMPLCOMM_GETDETAILEDLISTService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/SI_BAPI_EMPLCOMM_GETDETAILEDLIST_v2.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SIBAPIEMPLCOMMGETDETAILEDLISTSERVICE_WSDL_LOCATION = url;
        SIBAPIEMPLCOMMGETDETAILEDLISTSERVICE_EXCEPTION = e;
    }

    public SIBAPIEMPLCOMMGETDETAILEDLISTService() {
        super(__getWsdlLocation(), SIBAPIEMPLCOMMGETDETAILEDLISTSERVICE_QNAME);
    }

    public SIBAPIEMPLCOMMGETDETAILEDLISTService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SIBAPIEMPLCOMMGETDETAILEDLISTSERVICE_QNAME, features);
    }

    public SIBAPIEMPLCOMMGETDETAILEDLISTService(URL wsdlLocation) {
        super(wsdlLocation, SIBAPIEMPLCOMMGETDETAILEDLISTSERVICE_QNAME);
    }

    public SIBAPIEMPLCOMMGETDETAILEDLISTService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SIBAPIEMPLCOMMGETDETAILEDLISTSERVICE_QNAME, features);
    }

    public SIBAPIEMPLCOMMGETDETAILEDLISTService(URL wsdlLocation, javax.xml.namespace.QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SIBAPIEMPLCOMMGETDETAILEDLISTService(URL wsdlLocation, javax.xml.namespace.QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SIBAPIEMPLCOMMGETDETAILEDLIST
     */
    @WebEndpoint(name = "SI_BAPI_EMPLCOMM_GETDETAILEDLISTPort")
    public SIBAPIEMPLCOMMGETDETAILEDLIST getSIBAPIEMPLCOMMGETDETAILEDLISTPort() {
        return super.getPort(new javax.xml.namespace.QName("http://etelmex.jubilados.rh.telmex/PA0105", "SI_BAPI_EMPLCOMM_GETDETAILEDLISTPort"), SIBAPIEMPLCOMMGETDETAILEDLIST.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SIBAPIEMPLCOMMGETDETAILEDLIST
     */
    @WebEndpoint(name = "SI_BAPI_EMPLCOMM_GETDETAILEDLISTPort")
    public SIBAPIEMPLCOMMGETDETAILEDLIST getSIBAPIEMPLCOMMGETDETAILEDLISTPort(WebServiceFeature... features) {
        return super.getPort(new javax.xml.namespace.QName("http://etelmex.jubilados.rh.telmex/PA0105", "SI_BAPI_EMPLCOMM_GETDETAILEDLISTPort"), SIBAPIEMPLCOMMGETDETAILEDLIST.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SIBAPIEMPLCOMMGETDETAILEDLISTSERVICE_EXCEPTION!= null) {
            throw SIBAPIEMPLCOMMGETDETAILEDLISTSERVICE_EXCEPTION;
        }
        return SIBAPIEMPLCOMMGETDETAILEDLISTSERVICE_WSDL_LOCATION;
    }

}
