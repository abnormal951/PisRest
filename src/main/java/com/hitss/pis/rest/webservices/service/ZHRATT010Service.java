package com.hitss.pis.rest.webservices.service;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.webservices.bean.ZHRATT010Bean;
import com.hitss.pis.rest.webservices.consume.ConsumeWebServiceSIZTMHRPIF005v2f1;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF005_v2_f1.DTZHRATT010E;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF005_v2_f1.DTZTMHRPIE003;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF005_v2_f1.DTZTMHRPIF005Request.TENTRADA;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF005_v2_f1.DTZTMHRPIF005Response;


@Component
public class ZHRATT010Service {

	private static final Logger logger = LogManager.getLogger(ZHRATT010Service.class);
	
	@Autowired
	private ConsumeWebServiceSIZTMHRPIF005v2f1 consume;

	private static TENTRADA entrada = new TENTRADA();

	public List<ZHRATT010Bean> obtenerZHRATT010Bean(String expsolicita, String pernr) throws MalformedURLException {
		logger.debug("ZHRATT010Service -> obtenerZHRATT010Bean(...)");

		generaEntrada(pernr);
		DTZTMHRPIF005Response respuesta = consume.respuestaSIZTMHRPIF005(expsolicita, pernr, entrada);

		entrada = new TENTRADA();
		List<ZHRATT010Bean> listBean = new ArrayList<>();

		for (DTZHRATT010E item : respuesta.getTSALIDA().getItem()) {
			ZHRATT010Bean bean = new ZHRATT010Bean();
			bean.setIDMOVIMIENTO(item.getIDMOVIMIENTO());
			bean.setEXPSOLICITA(item.getEXPSOLICITA());
			bean.setMANDT(item.getMANDT());
			bean.setEXPANT(item.getEXPANT());
			bean.setSOCIED(item.getSOCIED());
			bean.setNUMCONT(item.getNUMCONT());
			bean.setNUMCORP(item.getNUMCORP());
			bean.setTIPFORM(item.getTIPFORM());
			bean.setFECPROC(item.getFECPROC());
			bean.setFECCONT(item.getFECCONT());
			bean.setBANCO(item.getBANCO());
			bean.setCTACHE(item.getCTACHE());
			bean.setSIGLAS(item.getSIGLAS());
			bean.setTELEF(item.getTELEF());
			bean.setLOCAL(item.getLOCAL());
			bean.setASIGNA(item.getASIGNA());
			bean.setCTAPTE(item.getCTAPTE());
			bean.setCENBEN(item.getCENBEN());
			bean.setCICVAC(item.getCICVAC());
			bean.setPORIMPTO(Double.parseDouble(item.getPORIMPTO()));
			bean.setPORPRIM(Integer.parseInt(item.getPORPRIM()));
			bean.setFECINID(item.getFECINID());
			bean.setFECFIND(item.getFECFIND());
			bean.setIMPPRIM(Double.parseDouble(item.getIMPPRIM()));
			bean.setIMPUESTO(Double.parseDouble(item.getIMPUESTO()));
			bean.setIMPNETO(Double.parseDouble(item.getIMPNETO()));
			bean.setDIF_PRIMA(Double.parseDouble(item.getDIFPRIMA()));
			bean.setDIF_IMPTO(Double.parseDouble(item.getDIFIMPTO()));
			bean.setIMPAJUS(Double.parseDouble(item.getIMPAJUS()));
			bean.setSALDIA(Double.parseDouble(item.getSALDIA()));
			bean.setVIDCA(Integer.parseInt(item.getVIDCA()));
			bean.setDIASSOL(Integer.parseInt(item.getDIASSOL()));
			bean.setPERLIQ(item.getPERLIQ());
			bean.setIMPANT(Double.parseDouble(item.getIMPANT()));
			bean.setTIPPAG(item.getTIPPAG());
			bean.setCANDOC(item.getCANDOC());
			bean.setWAERS(item.getWAERS());
			bean.setCOMENT(item.getCOMENT());
			bean.setDIASPRIM(Integer.parseInt(item.getDIASPRIM()));
			bean.setSABPRIM(Integer.parseInt(item.getSABPRIM()));
			bean.setDOMPRIM(Integer.parseInt(item.getDOMPRIM()));
			bean.setORIGEN_REG(item.getORIGENREG());
			bean.setSTAREG(item.getSTAREG());
			bean.setUSNAM(item.getUSNAM());
			bean.setFECREA(item.getFECREA());
			bean.setCPUTM(item.getCPUTM());
			bean.setFECVAC(item.getFECVAC());
			bean.setMULTISOC(item.getMULTISOC());
			bean.setBUKRS50(item.getBUKRS50());
			bean.setCANDOCCON(item.getCANDOCCON());
			bean.setCANDOCMUL(item.getCANDOCMUL());
			bean.setFECHCAN(item.getFECHCAN());
			bean.setHORACAN(item.getHORACAN());
			bean.setUSUACAN(item.getUSUACAN());
			bean.setBANDSUST(item.getBANDSUST());
			bean.setIMPSUST(Double.parseDouble(item.getIMPUESTOSUST()));
			bean.setIMPNETOSUST(Double.parseDouble(item.getIMPNETOSUST()));
			bean.setAJUPRIMASUST(Double.parseDouble(item.getAJUPRIMASUST()));
			bean.setAJUIMPUESTOSUST(Double.parseDouble(item.getAJUIMPUESTOSUST()));
			bean.setAJUIMPNETOSUST(Double.parseDouble(item.getAJUIMPNETOSUST()));
			bean.setSALSUST(Double.parseDouble(item.getSALSUST()));
			bean.setBLOQUEONOM(item.getBLOQUEONOM());
			bean.setCLABEBANC(item.getCLABEBANC());
			bean.setINDCARGA(item.getINDCARGA());

			listBean.add(bean);
		}
		logger.debug("Lista de ZHRATT010Bean [ {} ] : {}", listBean.size(), listBean);

		return listBean;
	}

	public static void generaEntrada(String pernr) {
		DTZTMHRPIE003 item = new DTZTMHRPIE003();
		item.setPERNR(pernr);
		entrada.setItem(item);
	}

}
