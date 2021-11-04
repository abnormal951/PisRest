package com.hitss.pis.rest.webservices.consume;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.util.PropertiesBean;
import com.hitss.pis.rest.webservices.stubs.sibapiemplcommgetdetailedlistv2.DTBAPIEMPLCOMMGETDETAILEDLISTRequest;
import com.hitss.pis.rest.webservices.stubs.sibapiemplcommgetdetailedlistv2.DTBAPIEMPLCOMMGETDETAILEDLISTResponse;
import com.hitss.pis.rest.webservices.stubs.sibapiemplcommgetdetailedlistv2.SIBAPIEMPLCOMMGETDETAILEDLIST;
import com.hitss.pis.rest.webservices.stubs.sibapiemplcommgetdetailedlistv2.SIBAPIEMPLCOMMGETDETAILEDLISTService;


/**
 * Realiza la llamada al SI_BAPI_EMPLCOMM_GETDETAILEDLIST_v2
 * @author sanchezd
 *
 */
@Component
public class ConsumeWebServiceSIBAPIDETAILEDLISTv2 {
	
	private static final Logger log = LogManager.getLogger(ConsumeWebServiceSIBAPIDETAILEDLISTv2.class);
	
	@Autowired
	private PropertiesBean propertiesBean;
	
	private static URL localizacion = null;

	/**
	 *
	 * @param employeeNumber
	 * @param subtype
	 * @param timeIntervallow
	 * @param timeIntervalhigh
	 * @return
	 * @throws MalformedURLException
	 */
	public DTBAPIEMPLCOMMGETDETAILEDLISTResponse respuestaDTBAPIEMPLCOMMGETDETAILEDLIST(String employeeNumber,
			String subtype, String timeIntervallow, String timeIntervalhigh) throws MalformedURLException {
		log.info("ConsumeWebServiceSIBAPIDETAILEDLISTv2 -> respuestaDTBAPIEMPLCOMMGETDETAILEDLIST");

		String localizacionWsdl = propertiesBean.getPathPi() + propertiesBean.getPathSIBAPIEMPLCOMMGETDETAILEDLIST_V3();
		log.info("Ruta del PI dato maestro: {}", localizacionWsdl);

		String servicioConsumo = propertiesBean.getUrlSIBAPIEMPLCOMMGETDETAILEDLISTV3();
		log.info("URL DE SERVICIO DE CONSUMO: {}", servicioConsumo);
		String usuario = propertiesBean.getUsuario();
		String password = propertiesBean.getPassword();

		localizacion = new URL(localizacionWsdl);

		SIBAPIEMPLCOMMGETDETAILEDLISTService servicio;
		servicio = new SIBAPIEMPLCOMMGETDETAILEDLISTService(localizacion);

		SIBAPIEMPLCOMMGETDETAILEDLIST conector;
		conector = servicio.getSIBAPIEMPLCOMMGETDETAILEDLISTPort();

		//proporciona acceso al enlace de protocolo y objetos de contexto asociados para el procesamiento de mensajes de solicitud y respuesta
		BindingProvider bp = (BindingProvider) conector;
		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, usuario);
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servicioConsumo);

		DTBAPIEMPLCOMMGETDETAILEDLISTResponse respuesta = null;

		DTBAPIEMPLCOMMGETDETAILEDLISTRequest solicitud = new DTBAPIEMPLCOMMGETDETAILEDLISTRequest();

		solicitud.setEMPLOYEENUMBER(employeeNumber);
		solicitud.setSUBTYPE(subtype);
		solicitud.setTIMEINTERVALLOW(timeIntervallow);
		solicitud.setTIMEINTERVALHIGH(timeIntervalhigh);

		respuesta = conector.siBAPIEMPLCOMMGETDETAILEDLIST(solicitud);

		return respuesta;
	}

}
