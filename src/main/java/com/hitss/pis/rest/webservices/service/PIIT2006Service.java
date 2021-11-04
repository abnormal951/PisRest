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

import com.hitss.pis.rest.util.ConversionCadenas;
import com.hitss.pis.rest.webservices.bean.PI_IT2006Bean;
import com.hitss.pis.rest.webservices.consume.ConsumeWebServicePIIT2006;
import com.hitss.pis.rest.webservices.stubs.PI_IT2006.DTZPA2006E;
import com.hitss.pis.rest.webservices.stubs.PI_IT2006.DTZTMHRPIE002;
import com.hitss.pis.rest.webservices.stubs.PI_IT2006.DTZTMHRPIF006Request.TENTRADA;
import com.hitss.pis.rest.webservices.stubs.PI_IT2006.DTZTMHRPIF006Response;


@Component
public class PIIT2006Service {
	
	private static final Logger logger = LogManager.getLogger(PIIT2006Service.class);
	
	@Autowired
	private ConsumeWebServicePIIT2006 consume;

	private static TENTRADA entrada = new TENTRADA();

	public Map<String, List<PI_IT2006Bean>> obtenerPIIT2006Bean(String begda, String deend, String desta, String endda,
			String expSolicita, String subty, List<String> expedientes) throws MalformedURLException {
		logger.debug("PIIT2006Service -> obtenerPIIT2006Bean(...)");
		logger.debug("expedientes: {}", expedientes);

		for (String expediente : expedientes)
			generaEntrada(expediente);

		DTZTMHRPIF006Response respuesta = consume.respuestaPIIT2006(begda, deend, desta, endda,
				expSolicita, subty, entrada);
		entrada = new TENTRADA();
		Map<String, List<PI_IT2006Bean>> mapa = new HashMap<>();
		Map<String, Object> mapSalida = new HashMap<>();
		Map<String, Object> map2006 = new HashMap<>();

		for (DTZPA2006E item : respuesta.getTSALIDA().getItem()) {
			PI_IT2006Bean bean = new PI_IT2006Bean();
			bean.setExpSolicita(item.getEXPSOLICITA());
			bean.setIdMovimiento(item.getIDMOVIMIENTO());
			bean.setMandt(Integer.parseInt(item.getMANDT()));
			bean.setPernr(ConversionCadenas.rellenarNumeroExpediente(item.getPERNR()));
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
			bean.setKtart(item.getKTART());
			bean.setAnzhl(Double.parseDouble(item.getANZHL()));
			bean.setKverb(Double.parseDouble(item.getKVERB()));
			bean.setQuonr(item.getQUONR());
			bean.setDesta(item.getDESTA());
			bean.setDeend(item.getDEEND());
			bean.setQuosy(item.getQUOSY());
			bean.setTdlangu(item.getTDLANGU());
			bean.setTdsubla(item.getTDSUBLA());
			bean.setTdtype(item.getTDTYPE());

			if(mapa.containsKey(bean.getPernr())) {
				List<PI_IT2006Bean> list2006 = mapa.get(bean.getPernr());
				list2006.add(bean);
				mapa.put(bean.getPernr(), list2006);
			}else {
				List<PI_IT2006Bean> list2006 = new ArrayList<>();
				list2006.add(bean);
				mapa.put(bean.getPernr(), list2006);
			}
		}
		logger.debug("Lista de PI_IT2006Bean [{}] : {}", mapa.size(), mapa);

		logger.debug("bean Dato Maestro: {}", mapa);
		return mapa;
	}

	public static void generaEntrada(String pernr) {
		DTZTMHRPIE002 item = new DTZTMHRPIE002();
		item.setPERNR(pernr);
		entrada.setItem(item);
	}

}