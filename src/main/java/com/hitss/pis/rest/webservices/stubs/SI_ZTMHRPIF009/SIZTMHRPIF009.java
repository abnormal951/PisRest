
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF009;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SI_ZTMHRPIF009", targetNamespace = "http://consultas.modernizacion.hr/ZTMHRPIF009")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SIZTMHRPIF009 {


    /**
     * 
     * @param mtZTMHRPIF009Request
     * @return
     *     returns com.webapp.webservices.SI_ZTMHRPIF009.DTZTMHRPIF009Response
     */
    @WebMethod(operationName = "SI_ZTMHRPIF009", action = "http://sap.com/xi/WebService/soap1.1")
    @WebResult(name = "MT_ZTMHRPIF009_response", targetNamespace = "http://consultas.modernizacion.hr/ZTMHRPIF009", partName = "MT_ZTMHRPIF009_response")
    public DTZTMHRPIF009Response siZTMHRPIF009(
        @WebParam(name = "MT_ZTMHRPIF009_request", targetNamespace = "http://consultas.modernizacion.hr/ZTMHRPIF009", partName = "MT_ZTMHRPIF009_request")
        DTZTMHRPIF009Request mtZTMHRPIF009Request);

}
