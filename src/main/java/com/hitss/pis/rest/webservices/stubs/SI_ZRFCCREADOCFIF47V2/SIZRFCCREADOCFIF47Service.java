
package com.hitss.pis.rest.webservices.stubs.SI_ZRFCCREADOCFIF47V2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SI_Z_RFC_CREA_DOC_FI_F47Service", targetNamespace = "http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CREA_DOC_FI_F47", wsdlLocation = "file:/C:/Users/hitss/Documents/GitProyectos/etelmex_prestamos_vacaciones_java/src/main/resources/wsdl/SI_Z_RFC_CREA_DOC_FI_F47_V2.wsdl")
public class SIZRFCCREADOCFIF47Service
    extends Service
{

    private final static URL SIZRFCCREADOCFIF47SERVICE_WSDL_LOCATION;
    private final static WebServiceException SIZRFCCREADOCFIF47SERVICE_EXCEPTION;
    private final static QName SIZRFCCREADOCFIF47SERVICE_QNAME = new QName("http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CREA_DOC_FI_F47", "SI_Z_RFC_CREA_DOC_FI_F47Service");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/hitss/Documents/GitProyectos/etelmex_prestamos_vacaciones_java/src/main/resources/wsdl/SI_Z_RFC_CREA_DOC_FI_F47_V2.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SIZRFCCREADOCFIF47SERVICE_WSDL_LOCATION = url;
        SIZRFCCREADOCFIF47SERVICE_EXCEPTION = e;
    }

    public SIZRFCCREADOCFIF47Service() {
        super(__getWsdlLocation(), SIZRFCCREADOCFIF47SERVICE_QNAME);
    }

    public SIZRFCCREADOCFIF47Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SIZRFCCREADOCFIF47SERVICE_QNAME, features);
    }

    public SIZRFCCREADOCFIF47Service(URL wsdlLocation) {
        super(wsdlLocation, SIZRFCCREADOCFIF47SERVICE_QNAME);
    }

    public SIZRFCCREADOCFIF47Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SIZRFCCREADOCFIF47SERVICE_QNAME, features);
    }

    public SIZRFCCREADOCFIF47Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SIZRFCCREADOCFIF47Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SIZRFCCREADOCFIF47
     */
    @WebEndpoint(name = "SI_Z_RFC_CREA_DOC_FI_F47Port")
    public SIZRFCCREADOCFIF47 getSIZRFCCREADOCFIF47Port() {
        return super.getPort(new QName("http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CREA_DOC_FI_F47", "SI_Z_RFC_CREA_DOC_FI_F47Port"), SIZRFCCREADOCFIF47.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SIZRFCCREADOCFIF47
     */
    @WebEndpoint(name = "SI_Z_RFC_CREA_DOC_FI_F47Port")
    public SIZRFCCREADOCFIF47 getSIZRFCCREADOCFIF47Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CREA_DOC_FI_F47", "SI_Z_RFC_CREA_DOC_FI_F47Port"), SIZRFCCREADOCFIF47.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SIZRFCCREADOCFIF47SERVICE_EXCEPTION!= null) {
            throw SIZRFCCREADOCFIF47SERVICE_EXCEPTION;
        }
        return SIZRFCCREADOCFIF47SERVICE_WSDL_LOCATION;
    }

}
