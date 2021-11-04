
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF023_v2;

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
@WebServiceClient(name = "SI_ZTMHRPYF023Service", targetNamespace = "http://consultas.modernizacion.hr/ZTMHRPYF023", wsdlLocation = "file:/C:/Users/hitss/Documents/RepositoryHitss/WebApp/src/main/resources/wsdl/SI_ZTMHRPYF023_v2.wsdl")
public class SIZTMHRPYF023Service
    extends Service
{

    private final static URL SIZTMHRPYF023SERVICE_WSDL_LOCATION;
    private final static WebServiceException SIZTMHRPYF023SERVICE_EXCEPTION;
    private final static QName SIZTMHRPYF023SERVICE_QNAME = new QName("http://consultas.modernizacion.hr/ZTMHRPYF023", "SI_ZTMHRPYF023Service");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/hitss/Documents/RepositoryHitss/WebApp/src/main/resources/wsdl/SI_ZTMHRPYF023_v2.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SIZTMHRPYF023SERVICE_WSDL_LOCATION = url;
        SIZTMHRPYF023SERVICE_EXCEPTION = e;
    }

    public SIZTMHRPYF023Service() {
        super(__getWsdlLocation(), SIZTMHRPYF023SERVICE_QNAME);
    }

    public SIZTMHRPYF023Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SIZTMHRPYF023SERVICE_QNAME, features);
    }

    public SIZTMHRPYF023Service(URL wsdlLocation) {
        super(wsdlLocation, SIZTMHRPYF023SERVICE_QNAME);
    }

    public SIZTMHRPYF023Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SIZTMHRPYF023SERVICE_QNAME, features);
    }

    public SIZTMHRPYF023Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SIZTMHRPYF023Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SIZTMHRPYF023
     */
    @WebEndpoint(name = "SI_ZTMHRPYF023Port")
    public SIZTMHRPYF023 getSIZTMHRPYF023Port() {
        return super.getPort(new QName("http://consultas.modernizacion.hr/ZTMHRPYF023", "SI_ZTMHRPYF023Port"), SIZTMHRPYF023.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SIZTMHRPYF023
     */
    @WebEndpoint(name = "SI_ZTMHRPYF023Port")
    public SIZTMHRPYF023 getSIZTMHRPYF023Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://consultas.modernizacion.hr/ZTMHRPYF023", "SI_ZTMHRPYF023Port"), SIZTMHRPYF023.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SIZTMHRPYF023SERVICE_EXCEPTION!= null) {
            throw SIZTMHRPYF023SERVICE_EXCEPTION;
        }
        return SIZTMHRPYF023SERVICE_WSDL_LOCATION;
    }

}
