package com.hitss.pis.rest.webservices.service;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.webservices.bean.T_PA9990Bean;
import com.hitss.pis.rest.webservices.consume.ConsumeWebServiceAnticipos9990V2;
import com.hitss.pis.rest.webservices.stubs.InfoT_PA9990_V2.DTTENTRADA;
import com.hitss.pis.rest.webservices.stubs.InfoT_PA9990_V2.DTTENTRADA.Item;
import com.hitss.pis.rest.webservices.stubs.InfoT_PA9990_V2.DTZTMHRPIF002Response;


@Component
public class TPA9990V2Service {

	private static final Logger logger = LogManager.getLogger(TPA9990V2Service.class);
	
	@Autowired
	private ConsumeWebServiceAnticipos9990V2 consume;

	private static DTTENTRADA entrada = new DTTENTRADA();

	public List<T_PA9990Bean> obtenerTPA9990Bean(String sociedad, String numExpediente) throws MalformedURLException {
		logger.debug("TPA9990V2Service -> obtenerTPA9990Bean(...)");

		generaEntrada(numExpediente);
		DTZTMHRPIF002Response respuesta = consume.respuestaAnticipos(sociedad, numExpediente, entrada);

		entrada = new DTTENTRADA();
		List<T_PA9990Bean> listBean = new ArrayList<>();

		for (com.hitss.pis.rest.webservices.stubs.InfoT_PA9990_V2.DTZTMHRPIF002Response.TSALIDA.Item item : respuesta.getTSALIDA()
				.getItem()) {
			T_PA9990Bean bean = new T_PA9990Bean();
			bean.setMANDT(Integer.parseInt(item.getMANDT()));
			bean.setPERNR(item.getPERNR());
			bean.setSUBTY(item.getSUBTY());
			bean.setOBJPS(item.getOBJPS());
			bean.setSPRPS(item.getSPRPS());
			bean.setENDDA(item.getENDDA());
			bean.setBEGDA(item.getBEGDA());
			bean.setSEQNR(Integer.parseInt(item.getSEQNR()));
			bean.setAEDTM(item.getAEDTM());
			bean.setUNAME(item.getUNAME());
			bean.setHISTO(item.getHISTO());
			bean.setITXEX(item.getITXEX());
			bean.setREFEX(item.getREFEX());
			bean.setORDEX(item.getORDEX());
			bean.setITBLD(item.getITBLD());
			bean.setPREAS(item.getPREAS());
			bean.setFLAG1(item.getFLAG1());
			bean.setFLAG2(item.getFLAG2());
			bean.setFLAG3(item.getFLAG3());
			bean.setFLAG4(item.getFLAG4());
			bean.setRESE1(item.getRESE1());
			bean.setRESE2(item.getRESE2());
			bean.setGJAHR(Integer.parseInt(item.getGJAHR()));
			bean.setZFOLINT(Integer.parseInt(item.getZFOLINT()));
			bean.setZCNPTO(item.getZCNPTO());
			bean.setZFOLIO(Integer.parseInt(item.getZFOLINT()));
			bean.setZDATE(item.getZDATE());
			bean.setZLOTE(Integer.parseInt(item.getZLOTE()));
			bean.setZMOVIM(item.getZMOVIM());
			bean.setZREGIS(Integer.parseInt(item.getZREGIS()));
			bean.setZREFER(item.getZREFER());
			bean.setZFUENT(item.getZFUENT());
			bean.setZCVEMT(item.getZCVEMT());
			bean.setZNOMBR(item.getZNOMBR());
			bean.setZCTACTB(Integer.parseInt(item.getZCTACTB()));
			bean.setZUNDNEG(Integer.parseInt(item.getZUNDNEG()));
			bean.setZUNDGEO(Integer.parseInt(item.getZUNDGEO()));
			bean.setZNVLAFE(Integer.parseInt(item.getZNVLAFE()));
			bean.setZLUGPAG(Integer.parseInt(item.getZLUGPAG()));
			bean.setZSWAUS(item.getZSWAUS());
			bean.setZRELLEN(item.getZRELLEN());
			bean.setZUORD(item.getZUORD());
			bean.setZFECHA_INT(item.getZFECHAINT());
			bean.setZCLAVE_INT(item.getZCLAVEINT());
			bean.setZFAUT(item.getZFAUT());
			bean.setZOBS(item.getZOBS());
			bean.setVERSN(Integer.parseInt(item.getVERSN()));
			bean.setCERRADO(item.getCERRADO());
			bean.setZZIDCR(item.getZZIDCR());
			bean.setFCIERRE(item.getFCIERRE());
			listBean.add(bean);
		}
		logger.debug("Lista de TPA9990V2 [ {} ] : {}", listBean.size(), listBean);

		return listBean;
	}

	public static void generaEntrada(String pernr) {
		Item item = new Item();
		item.setPERNR(pernr);
		entrada.setItem(item);
	}

}
