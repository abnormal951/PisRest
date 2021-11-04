package com.hitss.pis.rest.webservices.service;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.webservices.bean.DiaSinBancoBean;
import com.hitss.pis.rest.webservices.consume.ConsumeWebServiceDiasSinBancoV2;
import com.hitss.pis.rest.webservices.stubs.PI_DIASSINBANCO_V2.DTZTMHRPIF003Response;
import com.hitss.pis.rest.webservices.stubs.PI_DIASSINBANCO_V2.DTZTMHRPYT122;

@Component
public class PIDIASSINBANCOv2Service {

	private static final Logger logger = LogManager.getLogger(PIDIASSINBANCOv2Service.class);
	
	@Autowired
	private ConsumeWebServiceDiasSinBancoV2 consume;
	

	public List<DiaSinBancoBean> obtenerDiaSinBancoBean(String anioIni, String anioFin) throws MalformedURLException {
		logger.debug("PIDIASSINBANCOv2Service -> obtenerDiaSinBancoBean(...)");

		DTZTMHRPIF003Response res1 = consume.respuestaBancos(anioIni, anioFin);
		List<DiaSinBancoBean> dsbList = new ArrayList<>();
		for (DTZTMHRPYT122 item : res1.getTIZTMHRPYT122().getItem()) {
			DiaSinBancoBean bean = new DiaSinBancoBean();
			bean.setMANDT(Integer.parseInt(item.getMANDT()));
			bean.setANIO(item.getANIO());
			bean.setMES(item.getMES());
			bean.setDIA(item.getDIA());
			dsbList.add(bean);
		}
		logger.debug("DiaSinBancoBean List: {}", dsbList);

		return dsbList;
	}

}