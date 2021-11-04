package com.hitss.pis.rest.webservices.consume;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.util.PropertiesBean;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF028.DTZTMHRPYF028Request;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF028.DTZTMHRPYF028Request.TCONSULTA;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF028.DTZTMHRPYF028Response;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF028.SIZTMHRPYF028;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF028.SIZTMHRPYF028Service;

@Component
public class ConsumeWebServiceSIZTMHRPYF028 {

	private static final Logger logger = LogManager.getLogger(ConsumeWebServiceSIZTMHRPYF028.class);
	
	@Autowired
	private PropertiesBean propertiesBean;

	private static URL localizacion = null;

	private static TCONSULTA entrada = new TCONSULTA();

	/**
	 * @param args
	 * @throws MalformedURLException
	 */
	public DTZTMHRPYF028Response respuestaSIZTMHRPYF028(TCONSULTA entrada) throws MalformedURLException {
		logger.debug("ConsumeWebServiceSIZTMHRPYF028 -> respuestaSIZTMHRPYF028(...)");

		String localizacionWsdl = propertiesBean.getPathPi() + propertiesBean.getPathZTMHRPYF028();
		logger.debug("Ruta del PI SI_ZTMHRPYF028: {}", localizacionWsdl);

		String servicioConsumo = propertiesBean.getUrlZTMHRPYF028();
		logger.debug("URL DE SERVICIO DE CONSUMO: {}", servicioConsumo);
		String usuario = propertiesBean.getUsuario();
		String password = propertiesBean.getPassword();

		localizacion = new URL(localizacionWsdl);

		SIZTMHRPYF028Service servicio;
		servicio = new SIZTMHRPYF028Service(localizacion);

		SIZTMHRPYF028 conector;
		conector = servicio.getSIZTMHRPYF028Port();

		BindingProvider bp = (BindingProvider) conector;

		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, usuario);
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servicioConsumo);

		DTZTMHRPYF028Response respuesta;
		respuesta = null;

		DTZTMHRPYF028Request solicitud;
		solicitud = new DTZTMHRPYF028Request();

		solicitud.setEXPSOLICITA("");
		solicitud.setIDMOVIMIENTO("");
		solicitud.setTCONSULTA(entrada);

		respuesta = conector.siZTMHRPYF028(solicitud);
		return respuesta;
	}

}