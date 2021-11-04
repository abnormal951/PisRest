package com.hitss.pis.rest.webservices.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.soap.SOAPException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.util.ConversionCadenas;
import com.hitss.pis.rest.webservices.bean.MensajeSalidaBean;
import com.hitss.pis.rest.webservices.bo.datomaestro.PIDatoMaestroEntradaBO;
import com.hitss.pis.rest.webservices.bo.datomaestro.PIDatoMaestroSalidaBO;
import com.hitss.pis.rest.webservices.consume.ConsumeWebServiceDatoMaestro;
import com.hitss.pis.rest.webservices.exception.ExcepcionPersonalizada;
import com.hitss.pis.rest.webservices.stubs.SI_DATO_MAESTRO_v4.DTELEMENTO.TENTRADA;
import com.hitss.pis.rest.webservices.stubs.SI_DATO_MAESTRO_v4.DTELEMENTO.TENTRADA.Item;
import com.hitss.pis.rest.webservices.stubs.SI_DATO_MAESTRO_v4.DTELEMENTOResponse;

@Component
public class PIDatoMaestroService {

	private static final Logger logger = LogManager.getLogger(PIDatoMaestroService.class);
	
	@Autowired
	private ConsumeWebServiceDatoMaestro consume;

	public Map<String, Object> obtenerPIDatoMaestroBean(List<PIDatoMaestroEntradaBO> expedientes) throws ExcepcionPersonalizada {
		logger.debug("PIDatoMaestroService -> obtenerPIDatoMaestroBean(...)");
		logger.debug("expedientes: {}", expedientes);

		Map<String, Object> mapa = new HashMap<>();

			DTELEMENTOResponse respuesta;
			try {

				expedientes = filtradoExpedientes(expedientes);

				TENTRADA entrada = new TENTRADA();
				List<Item> listItem = new ArrayList<>();
				for (PIDatoMaestroEntradaBO dmEntradaVO : expedientes) {
					Item item = new Item();
					item = generaEntrada(dmEntradaVO);
					listItem.add(item);
				}
				entrada.setItem(listItem);
				respuesta = consume.respuestaDatoMaestro(entrada);
			} catch (ExcepcionPersonalizada | SOAPException e) {
				logger.error(e.getMessage());
				throw new ExcepcionPersonalizada(e.getMessage());
			}

			Map<String, Object> mapSalida = new HashMap<>();
			Map<String, Object> mapDM = new HashMap<>();
			for (com.hitss.pis.rest.webservices.stubs.SI_DATO_MAESTRO_v4.DTELEMENTOResponse.TMENSAJES.Item items : respuesta.getTMENSAJES()
					.getItem()) {
				MensajeSalidaBean beanSalida = new MensajeSalidaBean();
				beanSalida.setPernr(ConversionCadenas.rellenarNumeroExpediente(items.getPERNR()));
				beanSalida.setStatus(Integer.parseInt(items.getSTATUS()));
				beanSalida.setMsj(items.getMSJ());
				beanSalida.setCveMsj(items.getCVEMSJ());
				mapSalida.put(beanSalida.getPernr(), beanSalida);
			}
			logger.debug("bean Mensaje de Salida: {}", mapSalida);

			if(respuesta.getTSALIDA().getItem().isEmpty()) {
				logger.error("No existen datos en PI_DatoMaestro de los expedientes enviados.");
				throw new ExcepcionPersonalizada("No existen datos en PI_DatoMaestro de los expedientes enviados: "
						+ respuesta.getTSALIDA().getItem().toString());
			}
			for (com.hitss.pis.rest.webservices.stubs.SI_DATO_MAESTRO_v4.DTELEMENTOResponse.TSALIDA.Item itemSalida : respuesta.getTSALIDA()
					.getItem()) {
				PIDatoMaestroSalidaBO beanDM = new PIDatoMaestroSalidaBO();
				beanDM.setEXPSOLICITA(ConversionCadenas.rellenarNumeroExpediente(itemSalida.getEXPSOLICITA()));
				beanDM.setIDMOVIMIENTO(itemSalida.getIDMOVIMIENTO());
				beanDM.setMANDT(Integer.parseInt(itemSalida.getMANDT()));
				beanDM.setPERNR(ConversionCadenas.rellenarNumeroExpediente(itemSalida.getPERNR()));
				beanDM.setNACHN(itemSalida.getNACHN());
				beanDM.setNACH2(itemSalida.getNACH2());
				beanDM.setVORNA(itemSalida.getVORNA());
				beanDM.setPERSG(itemSalida.getPERSG());
				beanDM.setDE_PERSG(itemSalida.getDEPERSG());
				beanDM.setPERSK(itemSalida.getPERSK());
				beanDM.setDE_PERSK(itemSalida.getDEPERSK());
				beanDM.setSTAT2(itemSalida.getSTAT2());
				beanDM.setDE_STAT2(itemSalida.getDESTAT2());
				beanDM.setSTAT1(itemSalida.getSTAT1());
				beanDM.setDE_STAT1(itemSalida.getDESTAT1());
				beanDM.setTP_EMPLEADO(itemSalida.getTPEMPLEADO());
				beanDM.setBUKRS(itemSalida.getBUKRS());
				beanDM.setDE_BUKRS(itemSalida.getDEBUKRS());
				beanDM.setGSBER(itemSalida.getGSBER());
				beanDM.setWERKS(itemSalida.getWERKS());
				beanDM.setDE_WERKS(itemSalida.getDEWERKS());
				beanDM.setKOSTL(itemSalida.getKOSTL());
				beanDM.setVDSK1(itemSalida.getVDSK1());
				beanDM.setORGEH(itemSalida.getORGEH());
				beanDM.setORGTX(itemSalida.getORGTX());
				beanDM.setSHORT(itemSalida.getSHORT());
				beanDM.setSTEXT(itemSalida.getSTEXT());
				beanDM.setCVEL1(Integer.parseInt(itemSalida.getCVEL1()));
				beanDM.setDESLO(itemSalida.getDESLO());
				beanDM.setRPHT(itemSalida.getRPHT());
				beanDM.setSTELL(Integer.parseInt(itemSalida.getSTELL()));
				beanDM.setDE_STELL(itemSalida.getDESTELL());
				beanDM.setPLANS(Integer.parseInt(itemSalida.getPLANS()));
				beanDM.setMASSN(itemSalida.getMASSN());
				beanDM.setDE_MASSN(itemSalida.getDEMASSN());
				beanDM.setMASSG(itemSalida.getMASSG());
				beanDM.setDE_MASSG(itemSalida.getDEMASSG());
				beanDM.setZSM(itemSalida.getZSM());
				beanDM.setLGA01(itemSalida.getLGA01());
				beanDM.setVIDCA(Integer.parseInt(itemSalida.getVIDCA()));
				beanDM.setBANKL(itemSalida.getBANKL());
				beanDM.setBANKN(itemSalida.getBANKN());
				beanDM.setGBORT(itemSalida.getGBORT());
				beanDM.setICNUM(itemSalida.getICNUM());
				beanDM.setNIMSS(itemSalida.getNIMSS());
				beanDM.setPERID(itemSalida.getPERID());
				beanDM.setREGPA(itemSalida.getREGPA());
				beanDM.setBRFGN(itemSalida.getBRFGN());
				beanDM.setCUOTA_E((int) itemSalida.getCUOTAE());
				beanDM.setGESCH(itemSalida.getGESCH());
				beanDM.setDE_GESCH(itemSalida.getDEGESCH());
				beanDM.setFAMST(itemSalida.getFAMST());
				beanDM.setDE_FAMST(itemSalida.getDEFAMST());
				beanDM.setANSVH(itemSalida.getANSVH());
				beanDM.setDE_ANSVH(itemSalida.getDEANSVH());
				beanDM.setABKRS(itemSalida.getABKRS());
				beanDM.setMSTBR(itemSalida.getMSTBR());
				beanDM.setSACHA(itemSalida.getSACHA());
				beanDM.setSACHZ(itemSalida.getSACHZ());
				beanDM.setSACHP(itemSalida.getSACHP());
				beanDM.setZCLAV(itemSalida.getZCLAV());
				beanDM.setEDIFICIO(itemSalida.getEDIFICIO());
				beanDM.setCVE_PISO(itemSalida.getCVEPISO());
				beanDM.setCVE_ALA(itemSalida.getCVEALA());
				beanDM.setOFICINA(itemSalida.getOFICINA());
				beanDM.setUSRID1(itemSalida.getUSRID1());
				beanDM.setUSRID2(itemSalida.getUSRID2());
				beanDM.setUSRID3(itemSalida.getUSRID3());
				beanDM.setNUM01(itemSalida.getNUM01());
				beanDM.setEMAIL(itemSalida.getEMAIL());
				beanDM.setP_EMAIL(itemSalida.getPEMAIL());
				beanDM.setTELNR(itemSalida.getTELNR());
				beanDM.setNUM02(itemSalida.getNUM02());
				beanDM.setTEL_CUOTA(itemSalida.getTELCUOTA());
				beanDM.setCARRIER(itemSalida.getCARRIER());
				beanDM.setCELULAR(itemSalida.getCELULAR());
				beanDM.setSTRAS_H(itemSalida.getSTRASH());
				beanDM.setORT02(itemSalida.getORT02());
				beanDM.setPSTLZ(itemSalida.getPSTLZ());
				beanDM.setORT01(itemSalida.getORT01());
				beanDM.setDIREC(itemSalida.getDIREC());
				beanDM.setID_DIREC(Integer.parseInt(itemSalida.getIDDIREC()));
				beanDM.setSUBDIR(itemSalida.getSUBDIR());
				beanDM.setID_SUBDIR(Integer.parseInt(itemSalida.getIDSUBDIR()));
				beanDM.setGEREN(itemSalida.getGEREN());
				beanDM.setE_DIRE(Integer.parseInt(itemSalida.getEDIRE()));
				beanDM.setE_SUBD(Integer.parseInt(itemSalida.getESUBD()));
				beanDM.setE_GERE(Integer.parseInt(itemSalida.getEGERE()));
				beanDM.setE_JEFE(Integer.parseInt(itemSalida.getEJEFE()));
				beanDM.setN_JEFE(itemSalida.getNJEFE());
				beanDM.setNIVEL4(itemSalida.getNIVEL4());
				beanDM.setNIVEL5(itemSalida.getNIVEL5());
				beanDM.setNIVEL6(itemSalida.getNIVEL6());
				beanDM.setE_NIV4(Integer.parseInt(itemSalida.getENIV4()));
				beanDM.setE_NIV5(Integer.parseInt(itemSalida.getENIV5()));
				beanDM.setE_NIV6(Integer.parseInt(itemSalida.getENIV6()));
				beanDM.setBTRTL(itemSalida.getBTRTL());
				beanDM.setBTEXT(itemSalida.getBTEXT());
				beanDM.setPENSALI(itemSalida.getPENSALI());
				beanDM.setDEMAEMP(itemSalida.getDEMAEMP());
				beanDM.setCREDINFO(itemSalida.getCREDINFO());
				beanDM.setCREDFONA(itemSalida.getCREDFONA());
				beanDM.setUNIDAD(itemSalida.getUNIDAD());
				beanDM.setAREA(itemSalida.getAREA());
				beanDM.setPOBLACION(itemSalida.getPOBLACION());
				beanDM.setDESTIPCT(itemSalida.getDESTIPCT());
				beanDM.setDIVNUM(Integer.parseInt(itemSalida.getDIVNUM()));
				beanDM.setNATIO(itemSalida.getNATIO());
				beanDM.setDE_NATIO(itemSalida.getDENATIO());
				beanDM.setBET01(itemSalida.getBET01().doubleValue());
				beanDM.setSDIMX(itemSalida.getSDIMX().doubleValue());
				beanDM.setC160(itemSalida.getC160().doubleValue());
				beanDM.setFEALTEC(itemSalida.getFEALTEC());
				beanDM.setGBDAT(itemSalida.getGBDAT());
				beanDM.setFEANCOB(itemSalida.getFEANCOB());
				beanDM.setFEDEBA(itemSalida.getFEDEBA());
				beanDM.setFECASU(itemSalida.getFECASU());
				beanDM.setFECAPU(itemSalida.getFECAPU());
				beanDM.setFEANEFJ(itemSalida.getFEANEFJ());
				beanDM.setFEREANT(itemSalida.getFEREANT());
				beanDM.setFESUPE(itemSalida.getFESUPE());
				beanDM.setFEREVAC(itemSalida.getFEREVAC());
				beanDM.setFECTEMP(itemSalida.getFECTEMP());
				beanDM.setFECDEF(itemSalida.getFECDEF());
				beanDM.setFECJUB(itemSalida.getFECJUB());
				beanDM.setFSIST(itemSalida.getFSIST());
				mapDM.put(beanDM.getPERNR(), beanDM);
			}
			logger.debug("bean Dato Maestro: {}", mapDM);

			for (Entry<String, Object> entry : mapSalida.entrySet()) {
				String key = entry.getKey();
				MensajeSalidaBean beanSalida = (MensajeSalidaBean) entry.getValue();
				if(beanSalida.getStatus() == 1) {
					String exp = beanSalida.getPernr();
					mapa.put(exp, mapDM.get(exp));
				}else {
					logger.error("El expediente {}  no es usuario activo (STAT2 <> 3).", beanSalida.getPernr());
					throw new ExcepcionPersonalizada("El expediente "+ beanSalida.getPernr() +" no es usuario activo (STAT2 <> 3).");
				}
			}
			logger.debug("bean Dato Maestro: {}", mapa);
//		} catch (Exception e) {
//			logger.error("Error al consumir PI_DATO_MAESTRO: " + e.getMessage());
//			e.printStackTrace();
////			throw new PIDatoMaestroException("Error al consumir PI_DATO_MAESTRO: " + e.getMessage());
//		}

		return mapa;
	}

	private Item generaEntrada(PIDatoMaestroEntradaBO dmEntradaVO) {
		Item item = new Item();
		item.setBUKRS("");
		item.setPERNR(dmEntradaVO.getPernr());
		return item;
//		entrada.setItem(item);
	}

	private List<PIDatoMaestroEntradaBO> filtradoExpedientes(List<PIDatoMaestroEntradaBO> listOrigen){
		List<PIDatoMaestroEntradaBO> listReturn = new ArrayList<>();

		List<String> listExp = new ArrayList<>();
		for (PIDatoMaestroEntradaBO dto : listOrigen) {
			String expediente = dto.getPernr();
			expediente = ConversionCadenas.rellenarNumeroExpediente(expediente);
			if(expediente != null && !listExp.contains(expediente) && !expediente.isEmpty() && expediente.length()<=8){
				listExp.add(expediente);
			}
		}
		for (String exp : listExp) {
			PIDatoMaestroEntradaBO dtoDM = new PIDatoMaestroEntradaBO("", exp);
			listReturn.add(dtoDM);
		}
		return listReturn;
	}

}