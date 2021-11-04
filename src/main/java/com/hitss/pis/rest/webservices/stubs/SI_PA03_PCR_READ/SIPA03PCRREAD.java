
package com.hitss.pis.rest.webservices.stubs.SI_PA03_PCR_READ;

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
@WebService(name = "SI_PA03_PCR_READ", targetNamespace = "http://etelmex.prestamos.omsasi.rh.tmx/PA03_PCR_READ")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SIPA03PCRREAD {


    /**
     * 
     * @param mtPA03PCRREADRequest
     * @return
     *     returns com.webapp.webservices.SI_PA03_PCR_READ.DTPA03PCRREADResponse
     */
    @WebMethod(operationName = "SI_PA03_PCR_READ", action = "http://sap.com/xi/WebService/soap1.1")
    @WebResult(name = "MT_PA03_PCR_READ_response", targetNamespace = "http://etelmex.prestamos.omsasi.rh.tmx/PA03_PCR_READ", partName = "MT_PA03_PCR_READ_response")
    public DTPA03PCRREADResponse siPA03PCRREAD(
        @WebParam(name = "MT_PA03_PCR_READ_request", targetNamespace = "http://etelmex.prestamos.omsasi.rh.tmx/PA03_PCR_READ", partName = "MT_PA03_PCR_READ_request")
        DTPA03PCRREADRequest mtPA03PCRREADRequest);

}
