package com.hitss.pis.rest.webservices.service;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.webservices.bean.PI_IT008Bean;
import com.hitss.pis.rest.webservices.consume.ConsumeWebServicePIIT2008v2;
import com.hitss.pis.rest.webservices.stubs.PI_IT008.DTZPA0008E;
import com.hitss.pis.rest.webservices.stubs.PI_IT008.DTZTMHRPIE004;
import com.hitss.pis.rest.webservices.stubs.PI_IT008.DTZTMHRPIF004Request.TENTRADA;
import com.hitss.pis.rest.webservices.stubs.PI_IT008.DTZTMHRPIF004Response;

@Component
public class PIIT2008v2Service {
	
	private static final Logger logger = LogManager.getLogger(PIIT2008v2Service.class);
	
	@Autowired
	private ConsumeWebServicePIIT2008v2 consume;

	private static TENTRADA entrada = new TENTRADA();

	public List<PI_IT008Bean> obtenerPIIT008Bean(String expSolicita, String fechaRef, String sprps, String pernr)
			throws MalformedURLException {
		logger.debug("PIIT2008v2Service -> obtenerPIIT008Bean(...)");

		generaEntrada(pernr);
		DTZTMHRPIF004Response respuesta = consume.respuestaPIIT2008v2(expSolicita, fechaRef, sprps,	entrada);

		entrada = new TENTRADA();
		List<PI_IT008Bean> listBean = new ArrayList<>();

		for (DTZPA0008E item : respuesta.getTSALIDA().getItem()) {
			PI_IT008Bean bean = new PI_IT008Bean();

			bean.setExpSolicita(item.getEXPSOLICITA());
			bean.setIdMovimiento(item.getIDMOVIMIENTO());
			bean.setMandt(Integer.parseInt(item.getMANDT()));
			bean.setPernr(item.getPERNR());
			bean.setSubty(item.getSUBTY());
			bean.setObjps(item.getOBJPS());
			bean.setSprps(item.getSPRPS());
			bean.setEndda(item.getENDDA());
			bean.setBegda(item.getBEGDA());
			bean.setSeqnr(Integer.parseInt(item.getSEQNR()));
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
			bean.setTrfar(item.getTRFAR());
			bean.setTrfgb(item.getTRFGB());
			bean.setTrfgr(item.getTRFGR());
			bean.setTrfst(item.getTRFST());
			bean.setStvor(item.getSTVOR());
			bean.setOrzst(item.getORZST());
			bean.setPartn(item.getPARTN());
			bean.setWaers(item.getWAERS());
			bean.setVglta(item.getVGLTA());
			bean.setVglgb(item.getVGLGB());
			bean.setVglgr(item.getVGLGR());
			bean.setVglst(item.getVGLST());
			bean.setVglsv(item.getVGLSV());
			bean.setBsgrd(Double.parseDouble(item.getBSGRD()));
			bean.setDivgv(Double.parseDouble(item.getDIVGV()));
			bean.setAnsal(Double.parseDouble(item.getANSAL()));
			bean.setFalgk(item.getFALGK());
			bean.setFalgr(item.getFALGR());

			bean.setLga01(item.getLGA01());
			bean.setBet01(Double.parseDouble(item.getBET01()));
			bean.setAnz01(Double.parseDouble(item.getANZ01()));
			bean.setEin01(item.getEIN01());
			bean.setOpk01(item.getOPK01());

			bean.setLga02(item.getLGA02());
			bean.setBet02(Double.parseDouble(item.getBET02()));
			bean.setAnz02(Double.parseDouble(item.getANZ02()));
			bean.setEin02(item.getEIN02());
			bean.setOpk02(item.getOPK02());

			bean.setLga03(item.getLGA03());
			bean.setBet03(Double.parseDouble(item.getBET03()));
			bean.setAnz03(Double.parseDouble(item.getANZ03()));
			bean.setEin03(item.getEIN03());
			bean.setOpk03(item.getOPK03());

			bean.setLga04(item.getLGA04());
			bean.setBet04(Double.parseDouble(item.getBET04()));
			bean.setAnz04(Double.parseDouble(item.getANZ04()));
			bean.setEin04(item.getEIN04());
			bean.setOpk04(item.getOPK04());

			bean.setLga05(item.getLGA05());
			bean.setBet05(Double.parseDouble(item.getBET05()));
			bean.setAnz05(Double.parseDouble(item.getANZ05()));
			bean.setEin05(item.getEIN05());
			bean.setOpk05(item.getOPK05());

			bean.setLga06(item.getLGA06());
			bean.setBet06(Double.parseDouble(item.getBET06()));
			bean.setAnz06(Double.parseDouble(item.getANZ06()));
			bean.setEin06(item.getEIN06());
			bean.setOpk06(item.getOPK06());

			bean.setLga07(item.getLGA07());
			bean.setBet07(Double.parseDouble(item.getBET07()));
			bean.setAnz07(Double.parseDouble(item.getANZ07()));
			bean.setEin07(item.getEIN07());
			bean.setOpk07(item.getOPK07());

			bean.setLga08(item.getLGA08());
			bean.setBet08(Double.parseDouble(item.getBET08()));
			bean.setAnz08(Double.parseDouble(item.getANZ08()));
			bean.setEin08(item.getEIN08());
			bean.setOpk08(item.getOPK08());

			bean.setLga09(item.getLGA09());
			bean.setBet09(Double.parseDouble(item.getBET09()));
			bean.setAnz09(Double.parseDouble(item.getANZ09()));
			bean.setEin09(item.getEIN09());
			bean.setOpk09(item.getOPK09());

			bean.setLga10(item.getLGA10());
			bean.setBet10(Double.parseDouble(item.getBET10()));
			bean.setAnz10(Double.parseDouble(item.getANZ10()));
			bean.setEin10(item.getEIN10());
			bean.setOpk10(item.getOPK10());

			bean.setLga11(item.getLGA11());
			bean.setBet11(Double.parseDouble(item.getBET11()));
			bean.setAnz11(Double.parseDouble(item.getANZ11()));
			bean.setEin11(item.getEIN11());
			bean.setOpk11(item.getOPK11());

			bean.setLga12(item.getLGA12());
			bean.setBet12(Double.parseDouble(item.getBET12()));
			bean.setAnz12(Double.parseDouble(item.getANZ12()));
			bean.setEin12(item.getEIN12());
			bean.setOpk12(item.getOPK12());

			bean.setLga13(item.getLGA13());
			bean.setBet13(Double.parseDouble(item.getBET13()));
			bean.setAnz13(Double.parseDouble(item.getANZ13()));
			bean.setEin13(item.getEIN13());
			bean.setOpk13(item.getOPK13());

			bean.setLga14(item.getLGA14());
			bean.setBet14(Double.parseDouble(item.getBET14()));
			bean.setAnz14(Double.parseDouble(item.getANZ14()));
			bean.setEin14(item.getEIN14());
			bean.setOpk14(item.getOPK14());

			bean.setLga15(item.getLGA15());
			bean.setBet15(Double.parseDouble(item.getBET15()));
			bean.setAnz15(Double.parseDouble(item.getANZ15()));
			bean.setEin15(item.getEIN15());
			bean.setOpk15(item.getOPK15());

			bean.setLga16(item.getLGA16());
			bean.setBet16(Double.parseDouble(item.getBET16()));
			bean.setAnz16(Double.parseDouble(item.getANZ16()));
			bean.setEin16(item.getEIN16());
			bean.setOpk16(item.getOPK16());

			bean.setLga17(item.getLGA17());
			bean.setBet17(Double.parseDouble(item.getBET17()));
			bean.setAnz17(Double.parseDouble(item.getANZ17()));
			bean.setEin17(item.getEIN17());
			bean.setOpk17(item.getOPK17());

			bean.setLga18(item.getLGA18());
			bean.setBet18(Double.parseDouble(item.getBET18()));
			bean.setAnz18(Double.parseDouble(item.getANZ18()));
			bean.setEin18(item.getEIN18());
			bean.setOpk18(item.getOPK18());

			bean.setLga19(item.getLGA19());
			bean.setBet19(Double.parseDouble(item.getBET19()));
			bean.setAnz19(Double.parseDouble(item.getANZ19()));
			bean.setEin19(item.getEIN19());
			bean.setOpk19(item.getOPK19());

			bean.setLga20(item.getLGA20());
			bean.setBet20(Double.parseDouble(item.getBET20()));
			bean.setAnz20(Double.parseDouble(item.getANZ20()));
			bean.setEin20(item.getEIN20());
			bean.setOpk20(item.getOPK20());

			bean.setInd01(item.getIND01());
			bean.setInd02(item.getIND02());
			bean.setInd03(item.getIND03());
			bean.setInd04(item.getIND04());
			bean.setInd05(item.getIND05());
			bean.setInd06(item.getIND06());
			bean.setInd07(item.getIND07());
			bean.setInd08(item.getIND08());
			bean.setInd09(item.getIND09());
			bean.setInd010(item.getIND10());
			bean.setInd011(item.getIND11());
			bean.setInd012(item.getIND12());
			bean.setInd013(item.getIND13());
			bean.setInd014(item.getIND14());
			bean.setInd015(item.getIND15());
			bean.setInd016(item.getIND16());
			bean.setInd017(item.getIND17());
			bean.setInd018(item.getIND18());
			bean.setInd019(item.getIND19());
			bean.setInd020(item.getIND20());
			bean.setAncur(item.getANCUR());
			bean.setCpind(item.getCPIND());

			listBean.add(bean);
		}
		logger.debug("Lista de PI_IT008Bean [ {} ] : {}", listBean.size(), listBean);

		return listBean;
	}

	public static void generaEntrada(String pernr) {
		DTZTMHRPIE004 item = new DTZTMHRPIE004();
		item.setPERNR(pernr);
		entrada.setItem(item);
	}

}