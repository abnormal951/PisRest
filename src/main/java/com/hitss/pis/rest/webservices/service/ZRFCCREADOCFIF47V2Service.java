package com.hitss.pis.rest.webservices.service;

import java.net.MalformedURLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.webservices.consume.ConsumeWebServiceZRFCCREADOCFIF47V2;
import com.hitss.pis.rest.webservices.stubs.SI_ZRFCCREADOCFIF47V2.DTZRFCCREADOCFIF47Request;
import com.hitss.pis.rest.webservices.stubs.SI_ZRFCCREADOCFIF47V2.DTZRFCCREADOCFIF47Response;


@Component
public class ZRFCCREADOCFIF47V2Service {

	private static final Logger logger = LogManager.getLogger(ZRFCCREADOCFIF47V2Service.class);
	
	@Autowired
	private ConsumeWebServiceZRFCCREADOCFIF47V2 consume;

	public DTZRFCCREADOCFIF47Response obtenerZRFCCREADOCFIF47Bean(DTZRFCCREADOCFIF47Request solicitud)
			throws MalformedURLException {
		logger.debug("ZRFCCREADOCFIF47V2Service -> obtenerZRFCCREADOCFIF47Bean(...)");
		logger.debug("solicitud. {}", solicitud.toString());

		DTZRFCCREADOCFIF47Response respuesta = new DTZRFCCREADOCFIF47Response();
		try {
			respuesta = consume.respuestaZRFCCREADOCFIF47(solicitud);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		logger.debug("respuesta: {}", respuesta);
		logger.debug("resultado: {}", respuesta.getRESULTADO());
		logger.debug("error: {}", respuesta.getEERROR());
		logger.debug("documento: {}", respuesta.getEDOCUMENTO());
		return respuesta;
	}

}
