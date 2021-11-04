package com.hitss.pis.rest.webservices.service;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.webservices.bo.pic2prestamo.PIC2PrestamoEntradaBO;
import com.hitss.pis.rest.webservices.bo.pic2prestamo.PIC2PrestamoSalidaItemBO;
import com.hitss.pis.rest.webservices.bo.pic2prestamo.PIC2PrestamoSalidaMensajesBO;
import com.hitss.pis.rest.webservices.consume.ConsumeWebServiceSI_ZTMHRPYF022;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF022.DTZMENSAJESPI2;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF022.DTZTMHRPYES023;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF022.DTZTMHRPYES027;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF022.DTZTMHRPYF022Request.TENTRADA;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF022.DTZTMHRPYF022Response;

@Component
public class SIZTMHRPYF022Service {

	private static final Logger logger = LogManager.getLogger(SIZTMHRPYF022Service.class);
	
	@Autowired
	private ConsumeWebServiceSI_ZTMHRPYF022 consume;

	private static TENTRADA entrada = new TENTRADA();

	public Map<String, Object> obtenerSIZTMHRPYF022Bean(String expSolicita, String fechaRef, String idMovimiento,
			List<PIC2PrestamoEntradaBO> listEntradaBO) throws MalformedURLException {
		logger.debug("SIZTMHRPYF022Service -> obtenerSIZTMHRPYF022Bean(...)");
		logger.info("expSolicita: {}", expSolicita);
		logger.info("fechaRef: {}", fechaRef);
		logger.info("idMovimiento: {}", idMovimiento);
		logger.info("listEntradaBO: {}", listEntradaBO);

		for (PIC2PrestamoEntradaBO entradaBO : listEntradaBO) {
			generaEntrada(entradaBO);
		}

		DTZTMHRPYF022Response respuesta = consume.respuestaSIZTMHRPYF022(expSolicita, fechaRef,	idMovimiento, entrada);

		entrada = new TENTRADA();
		Map<String, Object> mapResult = new HashMap<>();
		List<PIC2PrestamoSalidaMensajesBO> listMsj = new ArrayList<>();
		List<PIC2PrestamoSalidaItemBO> listSalida = new ArrayList<>();

		for (DTZMENSAJESPI2 item : respuesta.getTMENSAJES().getItem()) {
			PIC2PrestamoSalidaMensajesBO mensajesBO = new PIC2PrestamoSalidaMensajesBO();
//			BeanUtils.copyProperties(item, mensajesBO);
			mensajesBO.setPernr(item.getPERNR());
			mensajesBO.setStatus(item.getSTATUS());
			mensajesBO.setMsj(item.getMSJ());
			mensajesBO.setCvemsj(item.getCVEMSJ());

			listMsj.add(mensajesBO);
		}
		mapResult.put("listMsj", listMsj);

		for (DTZTMHRPYES023 item : respuesta.getTSALIDA().getItem()) {
			PIC2PrestamoSalidaItemBO itemBO = new PIC2PrestamoSalidaItemBO();
//			BeanUtils.copyProperties(item, itemBO);
			itemBO.setExpsolicita(item.getEXPSOLICITA());
			itemBO.setIdmovimiento(item.getIDMOVIMIENTO());
			itemBO.setMandt(item.getMANDT());
			itemBO.setPernr(item.getPERNR());
			itemBO.setSubty(item.getSUBTY());
			itemBO.setZrefer(item.getZREFER());
			itemBO.setFecproc(item.getFECPROC());
			itemBO.setImpant(item.getIMPANT());
			itemBO.setPerliq(item.getPERLIQ());

			listSalida.add(itemBO);
		}
		mapResult.put("listSalida", listSalida);
		logger.debug("Mapa de SIZTMHRPYF022Bean [ {} ] : {}", mapResult.size(), mapResult);

		return mapResult;
	}

	public static void generaEntrada(PIC2PrestamoEntradaBO entradaBO) {
		DTZTMHRPYES027 item = new DTZTMHRPYES027();
//		BeanUtils.copyProperties(entradaBO, item);
		item.setPERNR(entradaBO.getPernr());
		item.setSUBTY(entradaBO.getSubty());
		entrada.setItem(item);
		logger.debug("Entrada: {}", entrada.getItem());
	}

}
