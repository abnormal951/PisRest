
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF005_v2_f1;

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
@WebService(name = "SI_ZTMHRPIF005", targetNamespace = "http://consultas.modernizacion.hr/ZHRATT010")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SIZTMHRPIF005 {


    /**
     * 
     * @param mtZTMHRPIF005Request
     * @return
     *     returns com.webapp.webservices.SI_ZTMHRPIF005_v2_f1.DTZTMHRPIF005Response
     */
    @WebMethod(operationName = "SI_ZTMHRPIF005", action = "http://sap.com/xi/WebService/soap1.1")
    @WebResult(name = "MT_ZTMHRPIF005_response", targetNamespace = "http://consultas.modernizacion.hr/ZHRATT010", partName = "MT_ZTMHRPIF005_response")
    public DTZTMHRPIF005Response siZTMHRPIF005(
        @WebParam(name = "MT_ZTMHRPIF005_request", targetNamespace = "http://consultas.modernizacion.hr/ZHRATT010", partName = "MT_ZTMHRPIF005_request")
        DTZTMHRPIF005Request mtZTMHRPIF005Request);

}