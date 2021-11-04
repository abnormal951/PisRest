package com.hitss.pis.rest.webservices.service;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.webservices.bean.SI_ZTMHRPIF007Bean;
import com.hitss.pis.rest.webservices.consume.ConsumeWebServiceSIZTMHRPIF007;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF007.DTZHRATT030E;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF007.DTZTMHRPIF007Request.TENTRADA;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF007.DTZTMHRPIF007Response;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF007.DTZTMHRPITT006;

@Component
public class SIZTMHRPIF007Service {
	
	private static final Logger logger = LogManager.getLogger(SIZTMHRPIF007Service.class);
	
	@Autowired
	private ConsumeWebServiceSIZTMHRPIF007 consume;

	private static TENTRADA entrada = new TENTRADA();

	public List<SI_ZTMHRPIF007Bean> obtenerSI_ZTMHRPIF007Bean(String ciclo, String expSolicita, String pernr)
			throws MalformedURLException {
		logger.debug("SIZTMHRPIF007Service -> obtenerSI_ZTMHRPIF007Bean(...)");

		generaEntrada(pernr);
		DTZTMHRPIF007Response respuesta = consume.respuestaSIZTMHRPIF007(ciclo, expSolicita, entrada);

		entrada = new TENTRADA();
		List<SI_ZTMHRPIF007Bean> listBean = new ArrayList<>();

		for (DTZHRATT030E item : respuesta.getTSALIDA().getItem()) {
			SI_ZTMHRPIF007Bean bean = new SI_ZTMHRPIF007Bean();
			bean.setExpSolicita(item.getEXPSOLICITA());
			bean.setIdMovimiento(item.getIDMOVIMIENTO());
			bean.setMandt(Integer.parseInt(item.getMANDT()));
			bean.setPernr(item.getPERNR());
			bean.setCiclo(Integer.parseInt(item.getCICLO()));
			bean.setPeriodo(Integer.parseInt(item.getPERIODO()));
			bean.setBegda(item.getBEGDA());
			bean.setEndda(item.getENDDA());
			bean.setIperi(item.getIPERI());
			bean.setFperi(item.getFPERI());
			bean.setSachz(item.getSACHZ());
			bean.setAedtm(item.getAEDTM());
			bean.setUname(item.getUNAME());

			listBean.add(bean);

		}
		logger.debug("Lista de SI_ZTMHRPIF007Bean [ {} ] : {}", listBean.size(), listBean);

		return listBean;
	}

	public static void generaEntrada(String pernr) {
		DTZTMHRPITT006 item = new DTZTMHRPITT006();
		item.setPERNR(pernr);
		entrada.setItem(item);
	}

}