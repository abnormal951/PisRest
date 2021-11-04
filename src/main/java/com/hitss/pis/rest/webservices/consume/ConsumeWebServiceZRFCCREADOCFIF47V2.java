package com.hitss.pis.rest.webservices.consume;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.util.PropertiesBean;
import com.hitss.pis.rest.webservices.stubs.SI_ZRFCCREADOCFIF47V2.DTZRFCCREADOCFIF47Request;
import com.hitss.pis.rest.webservices.stubs.SI_ZRFCCREADOCFIF47V2.DTZRFCCREADOCFIF47Response;
import com.hitss.pis.rest.webservices.stubs.SI_ZRFCCREADOCFIF47V2.SIZRFCCREADOCFIF47;
import com.hitss.pis.rest.webservices.stubs.SI_ZRFCCREADOCFIF47V2.SIZRFCCREADOCFIF47Service;


@Component
public class ConsumeWebServiceZRFCCREADOCFIF47V2 {

	private static final Logger logger = LogManager.getLogger(ConsumeWebServiceZRFCCREADOCFIF47V2.class);
	
	@Autowired
	private PropertiesBean propertiesBean;

	private static URL localizacion = null;

	/**
	 * @param args
	 * @throws MalformedURLException
	 */
	public DTZRFCCREADOCFIF47Response respuestaZRFCCREADOCFIF47(DTZRFCCREADOCFIF47Request solicitud)
			throws MalformedURLException {
		logger.debug("ConsumeWebServiceZRFCCREADOCFIF47V2 -> respuestaZRFCCREADOCFIF47(...)");

		String localizacionWsdl = propertiesBean.getPathPi() + propertiesBean.getPathZRFCCREADOCFIF47V2();
		logger.debug("Ruta del PI dato maestro: {}", localizacionWsdl);

		String servicioConsumo = propertiesBean.getUrlZRFCCREADOCFIF47V2();
		logger.debug("URL DE SERVICIO DE CONSUMO: {}", servicioConsumo);
		String usuario = propertiesBean.getUsuario();
		String password = propertiesBean.getPassword();

		localizacion = new URL(localizacionWsdl);

		SIZRFCCREADOCFIF47Service servicio;
		servicio = new SIZRFCCREADOCFIF47Service(localizacion);

		SIZRFCCREADOCFIF47 conector;
		conector = servicio.getSIZRFCCREADOCFIF47Port();

		BindingProvider bp = (BindingProvider) conector;

		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, usuario);
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servicioConsumo);

		DTZRFCCREADOCFIF47Response respuesta;
		respuesta = null;

		respuesta = conector.siZRFCCREADOCFIF47(solicitud);
		return respuesta;
	}

}
