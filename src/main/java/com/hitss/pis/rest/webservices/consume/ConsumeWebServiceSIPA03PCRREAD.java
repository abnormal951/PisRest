package com.hitss.pis.rest.webservices.consume;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.util.PropertiesBean;
import com.hitss.pis.rest.webservices.bo.pa03pcrREAD.SIPA03PCRREADEntradaBO;
import com.hitss.pis.rest.webservices.stubs.SI_PA03_PCR_READ.DTPA03PCRREADRequest;
import com.hitss.pis.rest.webservices.stubs.SI_PA03_PCR_READ.DTPA03PCRREADResponse;
import com.hitss.pis.rest.webservices.stubs.SI_PA03_PCR_READ.SIPA03PCRREAD;
import com.hitss.pis.rest.webservices.stubs.SI_PA03_PCR_READ.SIPA03PCRREADService;

@Component
public class ConsumeWebServiceSIPA03PCRREAD {

	private static final Logger logger = LogManager.getLogger(ConsumeWebServiceSIPA03PCRREAD.class);
	
	@Autowired
	private PropertiesBean propertiesBean;

	private static URL localizacion = null;

	/**
	 * @param args
	 * @throws MalformedURLException
	 */
	public DTPA03PCRREADResponse respuestaSIPA03PCRREAD(SIPA03PCRREADEntradaBO pa03BO) throws MalformedURLException {
		logger.debug("ConsumeWebServiceSIPA03PCRREAD -> respuestaSIPA03PCRREAD(...)");


		String localizacionWsdl = propertiesBean.getPathPi() + propertiesBean.getPathSIPA03PCRREAD();
		logger.debug("Ruta del PI SIPA03PCRREAD: {}", localizacionWsdl);

		String servicioConsumo = propertiesBean.getUrlSIPA03PCRREAD();
		logger.debug("URL DE SERVICIO DE CONSUMO: {}", servicioConsumo);
		String usuario = propertiesBean.getUsuario();
		String password = propertiesBean.getPassword();

		localizacion = new URL(localizacionWsdl);

		SIPA03PCRREADService servicio;
		servicio = new SIPA03PCRREADService(localizacion);

		SIPA03PCRREAD conector;
		conector = servicio.getSIPA03PCRREADPort();

		BindingProvider bp = (BindingProvider) conector;

		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, usuario);
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servicioConsumo);

		DTPA03PCRREADResponse respuesta;
		respuesta = null;

		DTPA03PCRREADRequest solicitud;
		solicitud = new DTPA03PCRREADRequest();

		solicitud.setFABKRS(pa03BO.getFabkrs());
		solicitud.setERRORNOACCOUNTING(pa03BO.getErrornoaccounting());

		respuesta = conector.siPA03PCRREAD(solicitud);
		logger.debug("respueta ---> {}", respuesta.getFSTATETEXT());
		return respuesta;
	}

}
