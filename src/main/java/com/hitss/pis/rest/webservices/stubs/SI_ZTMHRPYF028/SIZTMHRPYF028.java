
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF028;

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
@WebService(name = "SI_ZTMHRPYF028", targetNamespace = "http://etelmex.jubilados.rh.telmex/consultaLFB1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SIZTMHRPYF028 {


    /**
     * 
     * @param mtZTMHRPYF028Request
     * @return
     *     returns com.webapp.webservices.SI_ZTMHRPYF028.DTZTMHRPYF028Response
     */
    @WebMethod(operationName = "SI_ZTMHRPYF028", action = "http://sap.com/xi/WebService/soap1.1")
    @WebResult(name = "MT_ZTMHRPYF028_response", targetNamespace = "http://etelmex.jubilados.rh.telmex/consultaLFB1", partName = "MT_ZTMHRPYF028_response")
    public DTZTMHRPYF028Response siZTMHRPYF028(
        @WebParam(name = "MT_ZTMHRPYF028_request", targetNamespace = "http://etelmex.jubilados.rh.telmex/consultaLFB1", partName = "MT_ZTMHRPYF028_request")
        DTZTMHRPYF028Request mtZTMHRPYF028Request);

}
