
package com.hitss.pis.rest.webservices.stubs.SI_DATO_MAESTRO_v4;

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
@WebService(name = "SI_DATO_MAESTRO", targetNamespace = "http://consultas.modernizacion.hr/DatoMaestro")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SIDATOMAESTRO {


    /**
     * 
     * @param mtELEMENTORequest
     * @return
     *     returns com.webapp.webservices.SI_DATO_MAESTRO_v4.DTELEMENTOResponse
     */
    @WebMethod(operationName = "SI_DATO_MAESTRO", action = "http://sap.com/xi/WebService/soap1.1")
    @WebResult(name = "MT_ELEMENTO_response", targetNamespace = "http://consultas.modernizacion.hr/DatoMaestro", partName = "MT_ELEMENTO_response")
    public DTELEMENTOResponse siDATOMAESTRO(
        @WebParam(name = "MT_ELEMENTO_request", targetNamespace = "http://consultas.modernizacion.hr/DatoMaestro", partName = "MT_ELEMENTO_request")
        DTELEMENTO mtELEMENTORequest);

}
