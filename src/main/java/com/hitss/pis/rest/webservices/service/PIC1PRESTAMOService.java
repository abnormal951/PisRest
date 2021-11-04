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

import com.hitss.pis.rest.webservices.bo.pic1prestamo.PIC1PrestamoEntradaBO;
import com.hitss.pis.rest.webservices.bo.pic1prestamo.PIC1PrestamoSalidaItemBO;
import com.hitss.pis.rest.webservices.bo.pic1prestamo.PIC1PrestamoSalidaMensajesBO;
import com.hitss.pis.rest.webservices.consume.ConsumeWebServiceSIZTMHRPYF021;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF021_V2.DTZMENSAJESPI;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF021_V2.DTZTMHRPYES022;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF021_V2.DTZTMHRPYES024;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF021_V2.DTZTMHRPYF021Request.TENTRADA;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF021_V2.DTZTMHRPYF021Response;


@Component
public class PIC1PRESTAMOService {
	
	private static final Logger logger = LogManager.getLogger(PIC1PRESTAMOService.class);
	
	@Autowired
	private ConsumeWebServiceSIZTMHRPYF021 consume;

	private static TENTRADA entrada = new TENTRADA();

	public Map<String, Object> obtenerSIZTMHRPYF021Bean(String expSolicita, String idMovimiento,
			List<PIC1PrestamoEntradaBO> listEntradaBO) throws MalformedURLException {
		logger.debug("PIC1PRESTAMOService -> obtenerSIZTMHRPYF021Bean(...)");
		logger.info("expSolicita: {}", expSolicita);
		logger.info("idMovimiento: {}", idMovimiento);
		logger.info("listEntradaBO: {}", listEntradaBO);

		for (PIC1PrestamoEntradaBO entradaBO : listEntradaBO) {
			generaEntrada(entradaBO);
		}

		DTZTMHRPYF021Response respuesta = consume.respuestaSIZTMHRPYF021(expSolicita, "", entrada);

		entrada = new TENTRADA();
		Map<String, Object> mapResult = new HashMap<>();
		List<PIC1PrestamoSalidaMensajesBO> listMsj = new ArrayList<>();
		List<PIC1PrestamoSalidaItemBO> listSalida = new ArrayList<>();

		for (DTZMENSAJESPI item : respuesta.getTMENSAJES().getItem()) {
			PIC1PrestamoSalidaMensajesBO mensajesBO = new PIC1PrestamoSalidaMensajesBO();
//			BeanUtils.copyProperties(item, mensajesBO);
			mensajesBO.setBukrs(item.getBUKRS());
			mensajesBO.setPernr(item.getPERNR());
			mensajesBO.setStatus(item.getSTATUS());
			mensajesBO.setMsj(item.getMSJ());
			mensajesBO.setCvemsj(item.getCVEMSJ());
			listMsj.add(mensajesBO);
		}
		mapResult.put("listMsj", listMsj);

		for (DTZTMHRPYES022 item : respuesta.getTSALIDA().getItem()) {
			PIC1PrestamoSalidaItemBO itemBO = new PIC1PrestamoSalidaItemBO();
//			BeanUtils.copyProperties(item, itemBO);
			itemBO.setExpsolicita(item.getEXPSOLICITA());
			itemBO.setIdmovimiento(item.getIDMOVIMIENTO());
			itemBO.setMandt(item.getMANDT());
			itemBO.setPernr(item.getPERNR());
			itemBO.setFechacierrenom(item.getFECHACIERRENOM());
			itemBO.setFechaprimerdesc(item.getFECHAPRIMERDESC());
			itemBO.setSmensual(item.getSMENSUAL());
			itemBO.setSdiario(item.getSDIARIO());
			itemBO.setAnz02(item.getANZ02());
			itemBO.setAnz03(item.getANZ03());
			itemBO.setVpago(item.getVPAGO());
			listSalida.add(itemBO);
		}
		logger.info("listSalida {}", listSalida);
		mapResult.put("listSalida", listSalida);
		logger.debug("Mapa de SIZTMHRPYF021Bean [{}] : {}", mapResult.size(), mapResult);

		return mapResult;
	}

	public static void generaEntrada(PIC1PrestamoEntradaBO entradaBO) {
		DTZTMHRPYES024 item = new DTZTMHRPYES024();
		item.setPERNR(entradaBO.getPernr());
		item.setFECHAREF(entradaBO.getFecharef());
		entrada.setItem(item);
		logger.debug("Entrada: {}", entrada.getItem().get(0));
	}

}