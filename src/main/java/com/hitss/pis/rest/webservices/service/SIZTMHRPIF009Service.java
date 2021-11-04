package com.hitss.pis.rest.webservices.service;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.webservices.bean.SIZTMHRPIF009Bean;
import com.hitss.pis.rest.webservices.consume.ConsumeWebServiceSIZTMHRPIF009;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF009.DTZPA2003E;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF009.DTZTMHRPIE008;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF009.DTZTMHRPIF009Request.TENTRADA;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF009.DTZTMHRPIF009Response;

@Component
public class SIZTMHRPIF009Service {
	
	private static final Logger logger = LogManager.getLogger(SIZTMHRPIF009Service.class);
	
	@Autowired
	private ConsumeWebServiceSIZTMHRPIF009 consume;

	private static TENTRADA entrada = new TENTRADA();

	public List<SIZTMHRPIF009Bean> obtenerSIZTMHRPIF009Bean(String expSolicita, String sprps, String subty,
			String tprog, String pernr) throws MalformedURLException {
		logger.debug("SIZTMHRPIF009Service -> obtenerSIZTMHRPIF009Bean(...)");

		generaEntrada(pernr);
		DTZTMHRPIF009Response respuesta = consume.respuestaSIZTMHRPIF008(expSolicita, sprps, subty, tprog, entrada);

		entrada = new TENTRADA();
		List<SIZTMHRPIF009Bean> listBean = new ArrayList<>();

		for (DTZPA2003E item : respuesta.getTSALIDA().getItem()) {
			SIZTMHRPIF009Bean bean = new SIZTMHRPIF009Bean();
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
			bean.setBeguz(item.getBEGUZ());
			bean.setEnduz(item.getENDUZ());
			bean.setVtken(item.getVTKEN());
			bean.setVtart(item.getVTART());
			bean.setStdaz(item.getSTDAZ());
			bean.setPamod(item.getPAMOD());
			bean.setPbeg1(item.getPBEG1());
			bean.setPend1(item.getPEND1());
			bean.setPbez1(item.getPBEZ1());
			bean.setPunb1(item.getPUNB1());
			bean.setPbeg2(item.getPBEG2());
			bean.setPend2(item.getPEND2());
			bean.setPbez2(item.getPBEZ2());
			bean.setPunb2(item.getPUNB2());
			bean.setZeity(item.getZEITY());
			bean.setMofid(item.getMOFID());
			bean.setMosid(item.getMOSID());
			bean.setSchkz(item.getSCHKZ());
			bean.setMotpr(item.getMOTPR());
			bean.setTprog(item.getTPROG());
			bean.setVaria(item.getVARIA());
			bean.setTagty(item.getTAGTY());
			bean.setTpkla(item.getTPKLA());
			bean.setVpern(item.getVPERN());
			bean.setAufkz(item.getAUFKZ());
			bean.setBwgrl(item.getBWGRL());
			bean.setTrfgr(item.getTRFGR());
			bean.setTrfst(item.getTRFST());
			bean.setPrakn(item.getPRAKN());
			bean.setPrakz(item.getPRAKZ());
			bean.setOtype(item.getOTYPE());
			bean.setPlans(item.getPLANS());
			bean.setExbel(item.getEXBEL());
			bean.setWaers(item.getWAERS());
			bean.setVtart(item.getWTART());
			bean.setTdlangu(item.getTDLANGU());
			bean.setTdsubla(item.getTDSUBLA());
			bean.setTdtype(item.getTDTYPE());
			bean.setLogsys(item.getLOGSYS());
			bean.setAwtyp(item.getAWTYP());
			bean.setAwref(item.getAWREF());
			bean.setAworg(item.getAWORG());

			listBean.add(bean);
		}
		logger.debug("Lista de SIZTMHRPIF009Bean [ {} ] : {}", listBean.size(), listBean);

		return listBean;
	}

	public static void generaEntrada(String pernr) {
		DTZTMHRPIE008 item = new DTZTMHRPIE008();
		item.setPERNR(pernr);
		entrada.setItem(item);
	}

}