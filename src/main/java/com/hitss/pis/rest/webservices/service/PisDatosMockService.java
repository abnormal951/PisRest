package com.hitss.pis.rest.webservices.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.webservices.bean.T_PA9990Bean;


@Component
public class PisDatosMockService {
	
	private static final Logger logger = LogManager.getLogger(PisDatosMockService.class);
	
	public List<T_PA9990Bean> obtenerTPA9990Bean(String sociedad, String numExpediente){
		logger.debug("PisDatosMockService -> obtenerTPA9990Bean(...)");
		
		List<T_PA9990Bean> listBean = new ArrayList<>();
		T_PA9990Bean bean = new T_PA9990Bean();
		bean.setMANDT(250);
		bean.setPERNR("numExpediente");
		bean.setSUBTY("9960");
		bean.setOBJPS(null);
		bean.setSPRPS(null);
		bean.setENDDA("9999-12-31");
		bean.setBEGDA("2010-04-15");
		bean.setSEQNR(000);
		bean.setAEDTM("2010-03-25");
		bean.setUNAME("S30COROCMX");
		bean.setHISTO(null);
		bean.setITXEX(null);
		bean.setREFEX(null);
		bean.setORDEX(null);
		bean.setITBLD(null);
		bean.setPREAS(null);
		bean.setFLAG1(null);
		bean.setFLAG2(null);
		bean.setFLAG3(null);
		bean.setFLAG4(null);
		bean.setRESE1(null);
		bean.setRESE2(null);
		bean.setGJAHR(2010);
		bean.setZFOLINT(1020936);
		bean.setZCNPTO("9960");
		bean.setZFOLIO(00000000);
		bean.setZDATE("0000-00-00");
		bean.setZLOTE(0000);
		bean.setZMOVIM(null);
		bean.setZREGIS(00);
		bean.setZREFER("22082568");
		bean.setZFUENT(null);
		bean.setZCVEMT(null);
		bean.setZNOMBR(null);
		bean.setZCTACTB(0);
		bean.setZUNDNEG(0);
		bean.setZUNDGEO(0);
		bean.setZNVLAFE(0);
		bean.setZLUGPAG(0);
		bean.setZSWAUS(null);
		bean.setZRELLEN(null);
		bean.setZUORD(null);
		bean.setZFECHA_INT("2020-08-31");
		bean.setZCLAVE_INT("02690180");
		bean.setZFAUT("0000-00-00");
		bean.setZOBS(null);
		bean.setVERSN(0);
		bean.setCERRADO(null);
		bean.setZZIDCR(null);
		bean.setFCIERRE("0000-00-00");
		listBean.add(bean);
		
		logger.debug("Lista de TPA9990V2 [ {} ] : {}", listBean.size(), listBean);
		
		return listBean;
		
	}
	
	
	

}
