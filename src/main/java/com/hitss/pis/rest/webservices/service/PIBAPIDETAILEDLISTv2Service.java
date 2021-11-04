package com.hitss.pis.rest.webservices.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.webservices.bean.BAPIP0105NLBean;
import com.hitss.pis.rest.webservices.consume.ConsumeWebServiceSIBAPIDETAILEDLISTv2;
import com.hitss.pis.rest.webservices.stubs.sibapiemplcommgetdetailedlistv2.DTBAPIEMPLCOMMGETDETAILEDLISTResponse;
import com.hitss.pis.rest.webservices.stubs.sibapiemplcommgetdetailedlistv2.DTBAPIP0105NL;

@Component
public class PIBAPIDETAILEDLISTv2Service {
	
	private final Logger log = LogManager.getLogger(PIBAPIDETAILEDLISTv2Service.class);
	
	@Autowired
	private ConsumeWebServiceSIBAPIDETAILEDLISTv2 consume;
	
	public Map<String, Object> obtenerPIBAPIDETAILEDLISTv2Bean(String employeeNumber, String subtype, String timeIntervallow, String timeIntervalhigh){
	
		Map<String, Object> mapBapiDetalle = new HashMap<>();
	
		try {
			DTBAPIEMPLCOMMGETDETAILEDLISTResponse respuesta = consume.respuestaDTBAPIEMPLCOMMGETDETAILEDLIST(employeeNumber, subtype, timeIntervallow, timeIntervalhigh);
			
			if(null != respuesta.getRETURN() && !respuesta.getRETURN().getID().isEmpty()) {
				log.debug("DTBAPIEMPLCOMMGETDETAILEDLISTResponse -> MESSAGE: {}, MESSAGEV1: {}, MESSAGEV2: {}, MESSAGEV3. {}"
						,respuesta.getRETURN().getMESSAGE(), respuesta.getRETURN().getMESSAGEV1(),
						respuesta.getRETURN().getMESSAGEV2(), respuesta.getRETURN().getMESSAGEV3());
			}else {
				
				//Se extraen los datos de la respuesta
				for(DTBAPIP0105NL item: respuesta.getCOMMUNICATION().getItem()) {
					BAPIP0105NLBean itemSalida = new BAPIP0105NLBean();
					itemSalida.setEmployeeno(item.getEMPLOYEENO());
					itemSalida.setSubtype(item.getSUBTYPE());
					itemSalida.setObjectid(item.getOBJECTID());
					itemSalida.setLockindic(item.getLOCKINDIC());
					itemSalida.setValidend(item.getVALIDEND());
					itemSalida.setValidbegin(item.getVALIDBEGIN());
					itemSalida.setRecordnr(item.getRECORDNR());
					itemSalida.setCommtype(item.getCOMMTYPE());
					itemSalida.setNameofcommtype(item.getNAMEOFCOMMTYPE());
					itemSalida.setId(item.getID());
					itemSalida.setDelimitdate(item.getDELIMITDATE());
					mapBapiDetalle.put(itemSalida.getEmployeeno(), itemSalida);
				}
			}
			log.info("bean mapBapiDetalle: {}", mapBapiDetalle);
			
		}catch(Exception e) {
			log.error(e.getMessage());
		}
		
		return mapBapiDetalle;
	}
}
