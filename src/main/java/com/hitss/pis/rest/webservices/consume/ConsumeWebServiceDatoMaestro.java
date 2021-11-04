package com.hitss.pis.rest.webservices.consume;

import java.net.URL;

import javax.xml.soap.SOAPException;
import javax.xml.ws.BindingProvider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.util.PropertiesBean;
import com.hitss.pis.rest.webservices.exception.ExcepcionPersonalizada;
import com.hitss.pis.rest.webservices.stubs.SI_DATO_MAESTRO_v4.DTELEMENTO;
import com.hitss.pis.rest.webservices.stubs.SI_DATO_MAESTRO_v4.DTELEMENTO.TENTRADA;
import com.hitss.pis.rest.webservices.stubs.SI_DATO_MAESTRO_v4.DTELEMENTOResponse;
import com.hitss.pis.rest.webservices.stubs.SI_DATO_MAESTRO_v4.SIDATOMAESTRO;
import com.hitss.pis.rest.webservices.stubs.SI_DATO_MAESTRO_v4.SIDATOMAESTROService;

@Component
public class ConsumeWebServiceDatoMaestro {

	private static final Logger logger = LogManager.getLogger(ConsumeWebServiceDatoMaestro.class);
	
	@Autowired
	private PropertiesBean propertiesBean;

	private static URL localizacion = null;

	/**
	 * @param args
	 * @throws ExcepcionPersonalizada
	 */
	public DTELEMENTOResponse respuestaDatoMaestro(TENTRADA entrada) throws ExcepcionPersonalizada, SOAPException {
		logger.debug("ConsumeWebServiceDatoMaestro -> respuestaDatoMaestro(...)");
		logger.debug("entrada: {}", entrada);

		String localizacionWsdl = propertiesBean.getPathPi() + propertiesBean.getPathDatoMaestroV4();
		logger.debug("Ruta del PI dato maestro: {}", localizacionWsdl);
		
		String servicioConsumo = propertiesBean.getUrlDatoMaestro();
		logger.debug("URL DE SERVICIO DE CONSUMO: {}", servicioConsumo);
		String usuario = propertiesBean.getUsuario();
		String password = propertiesBean.getPassword();

		try {

			localizacion = new URL(localizacionWsdl);

			SIDATOMAESTROService servicio;
			servicio = new SIDATOMAESTROService(localizacion);

			SIDATOMAESTRO conector;
			conector = servicio.getSIDATOMAESTROPort();

			BindingProvider bp = (BindingProvider) conector;

			bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, usuario);
			bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
			bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servicioConsumo);

			DTELEMENTOResponse respuesta;
			respuesta = null;

			DTELEMENTO solicitud;
			solicitud = new DTELEMENTO();

			solicitud.setTENTRADA(entrada);

			solicitud.setEXPSOLICITA("");
			solicitud.setIDMOVIMIENTO("");

			respuesta = conector.siDATOMAESTRO(solicitud);

			logger.debug("solicitud de entrada dato maestro: {}", solicitud);
			logger.debug("respuesta de salida dato maestro: {}", respuesta);
			return respuesta;

		} catch (Exception e) {
			logger.error(e);
			throw new ExcepcionPersonalizada(e.getMessage());
		}

	}

}
