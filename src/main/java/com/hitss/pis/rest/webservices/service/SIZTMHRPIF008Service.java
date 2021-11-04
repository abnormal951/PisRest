package com.hitss.pis.rest.webservices.service;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.webservices.bean.SIZTMHRPIF008Bean;
import com.hitss.pis.rest.webservices.consume.ConsumeWebServiceSIZTMHRPIF008;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF008.DTZPA0019E;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF008.DTZTMHRPIE007;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF008.DTZTMHRPIF008Request.TENTRADA;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF008.DTZTMHRPIF008Response;

@Component
public class SIZTMHRPIF008Service {
	
	private static final Logger logger = LogManager.getLogger(SIZTMHRPIF008Service.class);
	
	@Autowired
	private ConsumeWebServiceSIZTMHRPIF008 consume;

	private static TENTRADA entrada = new TENTRADA();

	public List<SIZTMHRPIF008Bean> obtenerSIZTMHRPIF008Bean(String expSolicita, String pernr)
			throws MalformedURLException {
		logger.debug("SIZTMHRPIF008Service -> obtenerSIZTMHRPIF008Bean(...)");

		generaEntrada(pernr);
		DTZTMHRPIF008Response respuesta = consume.respuestaSIZTMHRPIF008(expSolicita, entrada);

		entrada = new TENTRADA();
		List<SIZTMHRPIF008Bean> listBean = new ArrayList<>();

		for (DTZPA0019E item : respuesta.getTSALIDA().getItem()) {
			SIZTMHRPIF008Bean bean = new SIZTMHRPIF008Bean();
			bean.setExpsolicita(item.getEXPSOLICITA());
			bean.setIdmovimiento(item.getIDMOVIMIENTO());
			bean.setMandt(item.getMANDT());
			bean.setPernr(item.getPERNR());
			bean.setSubty(item.getSUBTY());
			bean.setObjps(item.getOBJPS());
			bean.setSprps(item.getSPRPS());
			bean.setEndda(item.getENDDA());
			bean.setBegda(item.getBEGDA());
			bean.setSeqnr(item.getSEQNR());
			bean.setAedtm(item.getAEDTM());
			bean.setUname(item.getUNAME());
			bean.setHisto(item.getHISTO());
			bean.setItxex(item.getITXEX());
			bean.setRefex(item.getREFEX());
			bean.setOrdex(item.getORDEX());
			bean.setItbld(item.getITBLD());
			bean.setPreas(item.getPREAS());
			bean.setFlag1(item.getFLAG1());
			bean.setFlag2(item.getFLAG2());
			bean.setFlag3(item.getFLAG3());
			bean.setFlag4(item.getFLAG4());
			bean.setRese1(item.getRESE1());
			bean.setRese2(item.getRESE2());
			bean.setTmart(item.getTMART());
			bean.setTermn(item.getTERMN());
			bean.setMndat(item.getMNDAT());
			bean.setBvmrk(item.getBVMRK());
			bean.setTmjhr(item.getTMJHR());
			bean.setMnmon(item.getTMMON());
			bean.setTmtag(item.getTMTAG());
			bean.setMnjhr(item.getMNJHR());
			bean.setMnmon(item.getMNMON());
			bean.setMntag(item.getMNTAG());

			listBean.add(bean);
		}
		logger.debug("Lista de SIZTMHRPIF008Bean [ {} ] : {}", listBean.size(), listBean);

		return listBean;
	}

	public static void generaEntrada(String pernr) {
		DTZTMHRPIE007 item = new DTZTMHRPIE007();
		item.setPERNR(pernr);
		entrada.setItem(item);
	}

}