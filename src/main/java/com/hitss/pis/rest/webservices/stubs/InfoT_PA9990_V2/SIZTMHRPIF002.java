
package com.hitss.pis.rest.webservices.stubs.InfoT_PA9990_V2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SI_ZTMHRPIF002", targetNamespace = "http://consultas.modernizacion.hr/InfoT_PA9990")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SIZTMHRPIF002 {


    /**
     * 
     * @param mtZTMHRPIF002Request
     * @return
     *     returns com.webapp.webservices.InfoT_PA9990_V2.DTZTMHRPIF002Response
     */
    @WebMethod(operationName = "SI_ZTMHRPIF002", action = "http://sap.com/xi/WebService/soap1.1")
    @WebResult(name = "MT_ZTMHRPIF002_response", targetNamespace = "http://consultas.modernizacion.hr/InfoT_PA9990", partName = "MT_ZTMHRPIF002_response")
    public DTZTMHRPIF002Response siZTMHRPIF002(
        @WebParam(name = "MT_ZTMHRPIF002_request", targetNamespace = "http://consultas.modernizacion.hr/InfoT_PA9990", partName = "MT_ZTMHRPIF002_request")
        DTZTMHRPIF002Request mtZTMHRPIF002Request);

}