package com.hitss.pis.rest.webservices.consume;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.util.PropertiesBean;
import com.hitss.pis.rest.webservices.stubs.SI_ZRFCCAPMASIVA.DTZRFCCAPMASIVARequest;
import com.hitss.pis.rest.webservices.stubs.SI_ZRFCCAPMASIVA.DTZRFCCAPMASIVARequest.TEXPENT;
import com.hitss.pis.rest.webservices.stubs.SI_ZRFCCAPMASIVA.DTZRFCCAPMASIVAResponse;
import com.hitss.pis.rest.webservices.stubs.SI_ZRFCCAPMASIVA.SIZRFCCAPMASIVA;
import com.hitss.pis.rest.webservices.stubs.SI_ZRFCCAPMASIVA.SIZRFCCAPMASIVAService;


@Component
public class ConsumeWebServiceZRFCCAPMASIVA {

	private static final Logger logger = LogManager.getLogger(ConsumeWebServiceZRFCCAPMASIVA.class);
	
	@Autowired
	private PropertiesBean propertiesBean;

	private static URL localizacion = null;

	/**
	 * @param args
	 * @throws MalformedURLException
	 */
	public DTZRFCCAPMASIVAResponse respuestaZRFCCAPMASIVA(String iinfty, String ictagen, String ijefein,
			String icap, TEXPENT entrada) throws MalformedURLException {
		logger.debug("ConsumeWebServiceZRFCCAPMASIVA -> respuestaZRFCCAPMASIVA(...)");
		logger.debug("iinfty: {}", iinfty);
		logger.debug("ictagen: {}", ictagen);
		logger.debug("ijefein: {}", ijefein);
		logger.debug("icap: {}", icap);
		logger.debug("entrada: {}", entrada);

		String localizacionWsdl = propertiesBean.getPathPi() + propertiesBean.getPathZRFCCAPMASIVA();
		logger.debug("Ruta del PI dato maestro: {}", localizacionWsdl);

		String servicioConsumo = propertiesBean.getUrlZRFCCAPMASIVA();
		logger.debug("URL DE SERVICIO DE CONSUMO: {}", servicioConsumo);
		String usuario = propertiesBean.getUsuario();
		String password = propertiesBean.getPassword();

		localizacion = new URL(localizacionWsdl);

		SIZRFCCAPMASIVAService servicio;
		servicio = new SIZRFCCAPMASIVAService(localizacion);

		SIZRFCCAPMASIVA conector;
		conector = servicio.getSIZRFCCAPMASIVAPort();

		BindingProvider bp = (BindingProvider) conector;

		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, usuario);
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servicioConsumo);

		DTZRFCCAPMASIVAResponse respuesta;
		respuesta = null;

		DTZRFCCAPMASIVARequest solicitud;
		solicitud = new DTZRFCCAPMASIVARequest();

		solicitud.setIINFTY(iinfty);
		solicitud.setICTAGEN(ictagen);
		solicitud.setIJEFEIN(ijefein);
		solicitud.setICAP(icap);
		solicitud.setTEXPENT(entrada);

		respuesta = conector.siZRFCCAPMASIVA(solicitud);
		logger.debug("respueta ---> {}", respuesta.getTERRSAL().getItem().get(0).getMSGERREXP());
		return respuesta;
	}

}
