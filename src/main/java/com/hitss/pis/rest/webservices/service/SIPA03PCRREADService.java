package com.hitss.pis.rest.webservices.service;

import java.net.MalformedURLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.webservices.bo.pa03pcrREAD.SIPA03PCRREADEntradaBO;
import com.hitss.pis.rest.webservices.bo.pa03pcrREAD.SIPA03PCRREADSalidaBO;
import com.hitss.pis.rest.webservices.consume.ConsumeWebServiceSIPA03PCRREAD;
import com.hitss.pis.rest.webservices.exception.PIDatoMaestroException;
import com.hitss.pis.rest.webservices.stubs.SI_PA03_PCR_READ.DTPA03PCRREADResponse;

@Component
public class SIPA03PCRREADService {

	private static final Logger logger = LogManager.getLogger(SIPA03PCRREADService.class);
	
	@Autowired
	private ConsumeWebServiceSIPA03PCRREAD consume;
	

	public SIPA03PCRREADSalidaBO obtenerSIPA03PCRREADBean(SIPA03PCRREADEntradaBO pa03BO)
			throws MalformedURLException, PIDatoMaestroException {
		logger.debug("SIPA03PCRREADService -> obtenerSIPA03PCRREADBean(...)");
		logger.debug("pa03BO: {}", pa03BO);

		SIPA03PCRREADSalidaBO beanSalida = new SIPA03PCRREADSalidaBO();

		try {
			DTPA03PCRREADResponse respuesta = consume.respuestaSIPA03PCRREAD(pa03BO);

			beanSalida.setFstate(respuesta.getFSTATE());
			beanSalida.setFcurrentperiod(respuesta.getFCURRENTPERIOD());
			beanSalida.setFcurrentyear(respuesta.getFCURRENTYEAR());
			beanSalida.setFpermo(respuesta.getFPERMO());
			beanSalida.setFdatmo(respuesta.getFDATMO());
			beanSalida.setFcurrentbegda(respuesta.getFCURRENTBEGDA() + "");
			beanSalida.setFcurrentendda(respuesta.getFCURRENTENDDA() + "");
			beanSalida.setFfollowingperiod(respuesta.getFFOLLOWINGPERIOD());
			beanSalida.setFfollowingyear(respuesta.getFFOLLOWINGYEAR());
			beanSalida.setFfollowingbegda(respuesta.getFFOLLOWINGBEGDA() + "");
			beanSalida.setFfollowingendda(respuesta.getFFOLLOWINGENDDA() + "");
			beanSalida.setFtwmdate(respuesta.getFTWMDATE() + "");
			beanSalida.setFabkrstext(respuesta.getFABKRSTEXT());
			beanSalida.setFstatetext(respuesta.getFSTATETEXT());
			logger.debug("bean PA03Read: {}", beanSalida);

		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return beanSalida;
	}

}
