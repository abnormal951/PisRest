
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF009;

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
@WebServiceClient(name = "SI_ZTMHRPIF009Service", targetNamespace = "http://consultas.modernizacion.hr/ZTMHRPIF009", wsdlLocation = "file:/C:/Users/hitss/Documents/RepositoryHitss/WebApp/src/main/resources/wsdl/SI_ZTMHRPIF009.wsdl")
public class SIZTMHRPIF009Service
    extends Service
{

    private final static URL SIZTMHRPIF009SERVICE_WSDL_LOCATION;
    private final static WebServiceException SIZTMHRPIF009SERVICE_EXCEPTION;
    private final static QName SIZTMHRPIF009SERVICE_QNAME = new QName("http://consultas.modernizacion.hr/ZTMHRPIF009", "SI_ZTMHRPIF009Service");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/hitss/Documents/RepositoryHitss/WebApp/src/main/resources/wsdl/SI_ZTMHRPIF009.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SIZTMHRPIF009SERVICE_WSDL_LOCATION = url;
        SIZTMHRPIF009SERVICE_EXCEPTION = e;
    }

    public SIZTMHRPIF009Service() {
        super(__getWsdlLocation(), SIZTMHRPIF009SERVICE_QNAME);
    }

    public SIZTMHRPIF009Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SIZTMHRPIF009SERVICE_QNAME, features);
    }

    public SIZTMHRPIF009Service(URL wsdlLocation) {
        super(wsdlLocation, SIZTMHRPIF009SERVICE_QNAME);
    }

    public SIZTMHRPIF009Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SIZTMHRPIF009SERVICE_QNAME, features);
    }

    public SIZTMHRPIF009Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SIZTMHRPIF009Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SIZTMHRPIF009
     */
    @WebEndpoint(name = "SI_ZTMHRPIF009Port")
    public SIZTMHRPIF009 getSIZTMHRPIF009Port() {
        return super.getPort(new QName("http://consultas.modernizacion.hr/ZTMHRPIF009", "SI_ZTMHRPIF009Port"), SIZTMHRPIF009.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SIZTMHRPIF009
     */
    @WebEndpoint(name = "SI_ZTMHRPIF009Port")
    public SIZTMHRPIF009 getSIZTMHRPIF009Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://consultas.modernizacion.hr/ZTMHRPIF009", "SI_ZTMHRPIF009Port"), SIZTMHRPIF009.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SIZTMHRPIF009SERVICE_EXCEPTION!= null) {
            throw SIZTMHRPIF009SERVICE_EXCEPTION;
        }
        return SIZTMHRPIF009SERVICE_WSDL_LOCATION;
    }

}
