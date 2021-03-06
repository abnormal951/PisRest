
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF028;

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
@WebServiceClient(name = "SI_ZTMHRPYF028Service", targetNamespace = "http://etelmex.jubilados.rh.telmex/consultaLFB1", wsdlLocation = "file:/C:/Users/hitss/Documents/GitProyectos/etelmex_prestamos_vacaciones_java/src/main/resources/wsdl/SI_ZTMHRPYF028.wsdl")
public class SIZTMHRPYF028Service
    extends Service
{

    private final static URL SIZTMHRPYF028SERVICE_WSDL_LOCATION;
    private final static WebServiceException SIZTMHRPYF028SERVICE_EXCEPTION;
    private final static QName SIZTMHRPYF028SERVICE_QNAME = new QName("http://etelmex.jubilados.rh.telmex/consultaLFB1", "SI_ZTMHRPYF028Service");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/hitss/Documents/GitProyectos/etelmex_prestamos_vacaciones_java/src/main/resources/wsdl/SI_ZTMHRPYF028.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SIZTMHRPYF028SERVICE_WSDL_LOCATION = url;
        SIZTMHRPYF028SERVICE_EXCEPTION = e;
    }

    public SIZTMHRPYF028Service() {
        super(__getWsdlLocation(), SIZTMHRPYF028SERVICE_QNAME);
    }

    public SIZTMHRPYF028Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SIZTMHRPYF028SERVICE_QNAME, features);
    }

    public SIZTMHRPYF028Service(URL wsdlLocation) {
        super(wsdlLocation, SIZTMHRPYF028SERVICE_QNAME);
    }

    public SIZTMHRPYF028Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SIZTMHRPYF028SERVICE_QNAME, features);
    }

    public SIZTMHRPYF028Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SIZTMHRPYF028Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SIZTMHRPYF028
     */
    @WebEndpoint(name = "SI_ZTMHRPYF028Port")
    public SIZTMHRPYF028 getSIZTMHRPYF028Port() {
        return super.getPort(new QName("http://etelmex.jubilados.rh.telmex/consultaLFB1", "SI_ZTMHRPYF028Port"), SIZTMHRPYF028.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SIZTMHRPYF028
     */
    @WebEndpoint(name = "SI_ZTMHRPYF028Port")
    public SIZTMHRPYF028 getSIZTMHRPYF028Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://etelmex.jubilados.rh.telmex/consultaLFB1", "SI_ZTMHRPYF028Port"), SIZTMHRPYF028.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SIZTMHRPYF028SERVICE_EXCEPTION!= null) {
            throw SIZTMHRPYF028SERVICE_EXCEPTION;
        }
        return SIZTMHRPYF028SERVICE_WSDL_LOCATION;
    }

}
