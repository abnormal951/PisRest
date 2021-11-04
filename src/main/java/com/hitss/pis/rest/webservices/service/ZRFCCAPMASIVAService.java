package com.hitss.pis.rest.webservices.service;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.util.Fechas;
import com.hitss.pis.rest.webservices.bo.zrfccapmasiva.ZHRAITE001SalidaBO;
import com.hitss.pis.rest.webservices.bo.zrfccapmasiva.ZTIMPCAPMASIVAEntradaBO;
import com.hitss.pis.rest.webservices.consume.ConsumeWebServiceZRFCCAPMASIVA;
import com.hitss.pis.rest.webservices.exception.PIDatoMaestroException;
import com.hitss.pis.rest.webservices.stubs.SI_ZRFCCAPMASIVA.DTZHRAITE001;
import com.hitss.pis.rest.webservices.stubs.SI_ZRFCCAPMASIVA.DTZRFCCAPMASIVARequest.TEXPENT;
import com.hitss.pis.rest.webservices.stubs.SI_ZRFCCAPMASIVA.DTZRFCCAPMASIVAResponse;
import com.hitss.pis.rest.webservices.stubs.SI_ZRFCCAPMASIVA.DTZTIMPCAPMASIVA;


@Component
public class ZRFCCAPMASIVAService {

	private static final Logger logger = LogManager.getLogger(ZRFCCAPMASIVAService.class);
	
	@Autowired
	private ConsumeWebServiceZRFCCAPMASIVA consume;

//	private static TEXPENT entrada = new TEXPENT();

	public ZHRAITE001SalidaBO obtenerZRFCCAPMASIVABean(String iinfty, String ictagen, String ijefein, String icap,
			List<ZTIMPCAPMASIVAEntradaBO> listCapMasBO) throws MalformedURLException, PIDatoMaestroException {
		logger.debug("ZRFCCAPMASIVAService -> obtenerZRFCCAPMASIVABean(...)");
		logger.debug("iinfty: {}", iinfty);
		logger.debug("ictagen: {}", ictagen);
		logger.debug("ijefein: {}", ijefein);
		logger.debug("icap: {}", icap);
		logger.debug("listCapMasBO: {}", listCapMasBO);

		ZHRAITE001SalidaBO beanSalida = new ZHRAITE001SalidaBO();

		try {
			TEXPENT entrada = new TEXPENT();
			List<DTZTIMPCAPMASIVA> listItem = new ArrayList<>();
			for (ZTIMPCAPMASIVAEntradaBO dmEntradaVO : listCapMasBO) {
				DTZTIMPCAPMASIVA item = new DTZTIMPCAPMASIVA();
				item = generaEntrada(dmEntradaVO);
				listItem.add(item);
			}
			entrada.setItem(listItem);
			logger.debug("Entrada: {}", entrada);
			DTZRFCCAPMASIVAResponse respuesta = consume.respuestaZRFCCAPMASIVA(iinfty, ictagen,
					ijefein, icap, entrada);
//			entrada = new TEXPENT();

			for (DTZHRAITE001 items : respuesta.getTERRSAL().getItem()) {
				beanSalida.setId2(items.getID2());
				beanSalida.setMsgerrexp(items.getMSGERREXP());
				beanSalida.setHoras(items.getHORAS());
				beanSalida.setDias(items.getDIAS());
			}
			logger.debug("bean carga masiva: {}", beanSalida);

		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return beanSalida;
	}

	private DTZTIMPCAPMASIVA generaEntrada(ZTIMPCAPMASIVAEntradaBO dmEntradaVO) {
		DTZTIMPCAPMASIVA item = new DTZTIMPCAPMASIVA();
//		 BeanUtils.copyProperties(dmEntradaVO, item);
		item.setID(dmEntradaVO.getId());
		item.setSUBTY(dmEntradaVO.getSubty());
		item.setBEGDA(dmEntradaVO.getBegda() != null ? Fechas.obtenerFechaXMLGregorianCalendar(dmEntradaVO.getBegda()) : null);
		item.setENDDA(dmEntradaVO.getEndda() != null ? Fechas.obtenerFechaXMLGregorianCalendar(dmEntradaVO.getEndda()) : null);
		item.setPEPNR(dmEntradaVO.getPepnr());
		item.setBEGUZ(dmEntradaVO.getBeguz() != null ? Fechas.obtenerFechaXMLGregorianCalendar(dmEntradaVO.getBeguz()) : null);
		item.setENDUZ(dmEntradaVO.getEnduz() != null ? Fechas.obtenerFechaXMLGregorianCalendar(dmEntradaVO.getEnduz()) : null);
		item.setCAMPO1(dmEntradaVO.getCampo1());
		item.setCAMPO2(dmEntradaVO.getCampo2());
		item.setCAMPO3(dmEntradaVO.getCampo3());
		item.setCAMPO4(dmEntradaVO.getCampo4());
		item.setCAMPO5(dmEntradaVO.getCampo5());
		item.setCAMPO6(dmEntradaVO.getCampo6());
		item.setCAMPO7(dmEntradaVO.getCampo7());
		item.setCAMPO8(dmEntradaVO.getCampo8());
		item.setCAMPO9(dmEntradaVO.getCampo9());
		return item;
	}

}
