package com.hitss.pis.rest.webservices.service;

import java.net.MalformedURLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.webservices.consume.ConsumeWebServiceSIZTMHRPYF028;
import com.hitss.pis.rest.webservices.exception.PIDatoMaestroException;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF028.DTZTMHRPYES032;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF028.DTZTMHRPYF028Request.TCONSULTA;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF028.DTZTMHRPYF028Response;


@Component
public class SIZTMHRPYF028Service {

	private static final Logger logger = LogManager.getLogger(SIZTMHRPYF028Service.class);
	
	@Autowired
	private ConsumeWebServiceSIZTMHRPYF028 consume;

	private static TCONSULTA entrada = new TCONSULTA();

	public DTZTMHRPYF028Response obtenerSIZTMHRPYF028Bean(List<DTZTMHRPYES032> listObj32)
			throws MalformedURLException, PIDatoMaestroException {
		logger.debug("SIZTMHRPYF028Service -> obtenerSIZTMHRPYF028Bean(...)");
		logger.debug("listObj32: {}", listObj32);

		DTZTMHRPYF028Response respuesta = new DTZTMHRPYF028Response();
		try {
			entrada.setItem(listObj32);
			respuesta = consume.respuestaSIZTMHRPYF028(entrada);
			entrada = new TCONSULTA();
			logger.debug("respuesta. {}", respuesta);
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new PIDatoMaestroException("Error al consumir SIZTMHRPYF028: " + e.getMessage());
		}
		logger.debug("respuesta: {}", respuesta);
		return respuesta;
	}

}
