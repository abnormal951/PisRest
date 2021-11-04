package com.hitss.pis.rest.webservices.service;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.webservices.bean.SIZTMHRPYF023v2Bean;
import com.hitss.pis.rest.webservices.consume.ConsumeWebServiceSIZTMHRPYF023v2;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF023_v2.DTZTMHRPYES025;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF023_v2.DTZTMHRPYES026;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF023_v2.DTZTMHRPYF023Request.TENTRADA;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF023_v2.DTZTMHRPYF023Response;

@Component
public class SIZTMHRPYF023v2Service {
	
	private static final Logger logger = LogManager.getLogger(SIZTMHRPYF023v2Service.class);
	
	@Autowired
	private ConsumeWebServiceSIZTMHRPYF023v2 consume;

	private static TENTRADA entrada = new TENTRADA();

	public List<SIZTMHRPYF023v2Bean> obtenerSIZTMHRPYF023v2Bean(String expSolicita, String sprps, String subty,
			String pernr, String fechaRef) throws MalformedURLException {
		logger.debug("SIZTMHRPYF023v2Service -> obtenerSIZTMHRPYF023v2Bean(...)");

		generaEntrada(pernr, fechaRef);
		DTZTMHRPYF023Response respuesta = consume.respuestaSIZTMHRPYF023v2(expSolicita, sprps, subty, entrada);

		entrada = new TENTRADA();
		List<SIZTMHRPYF023v2Bean> listBean = new ArrayList<>();

		for (DTZTMHRPYES026 item : respuesta.getTSALIDA().getItem()) {
			SIZTMHRPYF023v2Bean bean = new SIZTMHRPYF023v2Bean();
			bean.setExpsolicita(item.getEXPSOLICITA());
			bean.setIdmovimiento(item.getIDMOVIMIENTO());
			bean.setMandt(item.getMANDT());
			bean.setPernr(item.getPERNR());
			bean.setSubty(item.getSUBTY());
			bean.setDderecho(item.getDDERECHO());
			bean.setDdisfrutados(item.getDDISFRUTADOS());
			bean.setDvencidos(item.getDVENCIDOS());
			bean.setDesta(item.getDESTA());
			bean.setDeend(item.getDEEND());

			listBean.add(bean);
		}
		logger.debug("Lista de SIZTMHRPYF023v2Bean [ {} ] : {}", listBean.size(), listBean);

		return listBean;
	}

	public static void generaEntrada(String pernr, String fechaRef) {
		DTZTMHRPYES025 item = new DTZTMHRPYES025();
		item.setPERNR(pernr);
		item.setFECHAREF(fechaRef);
		entrada.setItem(item);
	}

}