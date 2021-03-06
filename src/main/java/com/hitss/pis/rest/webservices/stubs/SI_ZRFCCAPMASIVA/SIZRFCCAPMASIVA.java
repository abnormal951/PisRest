
package com.hitss.pis.rest.webservices.stubs.SI_ZRFCCAPMASIVA;

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
@WebService(name = "SI_Z_RFC_CAPMASIVA", targetNamespace = "http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CAPMASIVA")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SIZRFCCAPMASIVA {


    /**
     * 
     * @param mtZRFCCAPMASIVARequest
     * @return
     *     returns com.webapp.webservices.SI_ZRFCCAPMASIVA.DTZRFCCAPMASIVAResponse
     */
    @WebMethod(operationName = "SI_Z_RFC_CAPMASIVA", action = "http://sap.com/xi/WebService/soap1.1")
    @WebResult(name = "MT_Z_RFC_CAPMASIVA_response", targetNamespace = "http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CAPMASIVA", partName = "MT_Z_RFC_CAPMASIVA_response")
    public DTZRFCCAPMASIVAResponse siZRFCCAPMASIVA(
        @WebParam(name = "MT_Z_RFC_CAPMASIVA_request", targetNamespace = "http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CAPMASIVA", partName = "MT_Z_RFC_CAPMASIVA_request")
        DTZRFCCAPMASIVARequest mtZRFCCAPMASIVARequest);

}
