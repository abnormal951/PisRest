package com.hitss.pis.rest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hitss.pis.rest.util.AnticiposConstantes;
import com.hitss.pis.rest.webservices.bean.DiaSinBancoBean;
import com.hitss.pis.rest.webservices.bean.PI_IT008Bean;
import com.hitss.pis.rest.webservices.bean.PI_IT2006Bean;
import com.hitss.pis.rest.webservices.bean.SIZTMHRPIF008Bean;
import com.hitss.pis.rest.webservices.bean.SIZTMHRPIF009Bean;
import com.hitss.pis.rest.webservices.bean.SIZTMHRPYF023v2Bean;
import com.hitss.pis.rest.webservices.bean.SI_ZTMHRPIF007Bean;
import com.hitss.pis.rest.webservices.bean.T_PA9990Bean;
import com.hitss.pis.rest.webservices.bean.ZHRATT010Bean;
import com.hitss.pis.rest.webservices.bo.datomaestro.PIDatoMaestroEntradaBO;
import com.hitss.pis.rest.webservices.bo.pa03pcrREAD.SIPA03PCRREADEntradaBO;
import com.hitss.pis.rest.webservices.bo.pa03pcrREAD.SIPA03PCRREADSalidaBO;
import com.hitss.pis.rest.webservices.bo.pic1prestamo.PIC1PrestamoEntradaBO;
import com.hitss.pis.rest.webservices.bo.zrfccapmasiva.ZHRAITE001SalidaBO;
import com.hitss.pis.rest.webservices.dto.PibapidetailedlistEntradaDTO;
import com.hitss.pis.rest.webservices.dto.Pic2prestamoEntradaDTO;
import com.hitss.pis.rest.webservices.dto.PidiassinbancoEntradaDTO;
import com.hitss.pis.rest.webservices.dto.Piit2006EntradaDTO;
import com.hitss.pis.rest.webservices.dto.Piit2008EntradaDTO;
import com.hitss.pis.rest.webservices.dto.Siztmhrpif007EntradaDTO;
import com.hitss.pis.rest.webservices.dto.Siztmhrpif009EntradaDTO;
import com.hitss.pis.rest.webservices.dto.Siztmhrpyf022EntradaDTO;
import com.hitss.pis.rest.webservices.dto.Siztmhrpyf023EntradaDTO;
import com.hitss.pis.rest.webservices.dto.Tpa9990EntradaDTO;
import com.hitss.pis.rest.webservices.dto.Zhratt010EntradaDTO;
import com.hitss.pis.rest.webservices.dto.ZrfccapmasivaEntradaDTO;
import com.hitss.pis.rest.webservices.exception.ExcepcionPersonalizada;
import com.hitss.pis.rest.webservices.service.PIBAPIDETAILEDLISTv2Service;
import com.hitss.pis.rest.webservices.service.PIC1PRESTAMOService;
import com.hitss.pis.rest.webservices.service.PIC2PRESTAMOService;
import com.hitss.pis.rest.webservices.service.PIDIASSINBANCOv2Service;
import com.hitss.pis.rest.webservices.service.PIDatoMaestroService;
import com.hitss.pis.rest.webservices.service.PIIT2006Service;
import com.hitss.pis.rest.webservices.service.PIIT2008v2Service;
import com.hitss.pis.rest.webservices.service.PisDatosMockService;
import com.hitss.pis.rest.webservices.service.SIPA03PCRREADService;
import com.hitss.pis.rest.webservices.service.SIZTMHRPIF007Service;
import com.hitss.pis.rest.webservices.service.SIZTMHRPIF008Service;
import com.hitss.pis.rest.webservices.service.SIZTMHRPIF009Service;
import com.hitss.pis.rest.webservices.service.SIZTMHRPYF022Service;
import com.hitss.pis.rest.webservices.service.SIZTMHRPYF023v2Service;
import com.hitss.pis.rest.webservices.service.SIZTMHRPYF028Service;
import com.hitss.pis.rest.webservices.service.TPA9990V2Service;
import com.hitss.pis.rest.webservices.service.ZHRATT010Service;
import com.hitss.pis.rest.webservices.service.ZRFCCAPMASIVAService;
import com.hitss.pis.rest.webservices.service.ZRFCCREADOCFIF47V2Service;
import com.hitss.pis.rest.webservices.stubs.SI_ZRFCCREADOCFIF47V2.DTZRFCCREADOCFIF47Request;
import com.hitss.pis.rest.webservices.stubs.SI_ZRFCCREADOCFIF47V2.DTZRFCCREADOCFIF47Response;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF028.DTZTMHRPYES032;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF028.DTZTMHRPYF028Response;

@Controller
//@RequestMapping("/PisRest")
public class PisController {
	
	private static final Logger logger = LogManager.getLogger(PisController.class);
	
	@Autowired
	private PIDatoMaestroService serviceDatoMaestro;
	
	@Autowired
	private PIBAPIDETAILEDLISTv2Service servicePIBAPIDETAILEDLIST;
	
	@Autowired
	private PIC1PRESTAMOService servicePIC1PRESTAMO;
	
	@Autowired
	private PIC2PRESTAMOService servicePIC2PRESTAMO;
	
	@Autowired
	private PIDIASSINBANCOv2Service servicePIDIASSINBANCO;
	
	@Autowired
	private PIIT2006Service servicePIIT2006;
	
	@Autowired
	private PIIT2008v2Service servicePIIT2008;
	
	@Autowired
	private SIPA03PCRREADService serviceSIPA03PCRREAD;
	
	@Autowired
	private SIZTMHRPIF007Service serviceSIZTMHRPIF007;
	
	@Autowired
	private SIZTMHRPIF008Service serviceSIZTMHRPIF008;
	
	@Autowired
	private SIZTMHRPIF009Service serviceSIZTMHRPIF009;
	
	@Autowired
	private SIZTMHRPYF022Service serviceSIZTMHRPYF022;
	
	@Autowired
	private SIZTMHRPYF023v2Service serviceSIZTMHRPYF023;
	
	@Autowired
	private SIZTMHRPYF028Service serviceSIZTMHRPYF028;
	
	@Autowired
	private TPA9990V2Service serviceTPA9990;
	
	@Autowired
	private ZHRATT010Service serviceZHRATT010;
	
	@Autowired
	private ZRFCCAPMASIVAService serviceZRFCCAPMASIVA;
	
	@Autowired
	private ZRFCCREADOCFIF47V2Service serviceZRFCCREADOCFIF47;
	
	@Autowired
	private PisDatosMockService pisDatosMockService;
	
	

	@GetMapping({ "", "/", "/index", "/home" })
	public ModelAndView index(ModelAndView model) {
		model.setViewName("index");
		return model;
	}
	
	/** Endpoint de prueba*/
	@GetMapping(value = "/lista")
	public @ResponseBody List<String> getAllEmployees() {		
		logger.debug("Entra metodo de listar!");
		List<String> emps = new ArrayList<>();		
		emps.add("Andres garcia");
		emps.add("Manuel vargas"); 
		emps.add("Oscar olmos");
		return emps;
	}
	
	/** ENDPOINTS PARA LLAMAR PIS DESARROLLO*/
	
	/** Dato maestro */
	@PostMapping(value = "/obtenerdatomaestro")
	public @ResponseBody Map<String, Object> getDatoMaestro(@RequestBody List<PIDatoMaestroEntradaBO> expedientes){
		logger.debug("Entra a getDatoMaestro");
		Map<String, Object> mapaResult = new HashMap<>();
		try {
			mapaResult = serviceDatoMaestro.obtenerPIDatoMaestroBean(expedientes);
			logger.debug("mapaResult: {}", mapaResult);
		} catch (ExcepcionPersonalizada e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return mapaResult;
	}
	
	/**  PIBAPIDETAILEDLIST */
	@PostMapping(value = "/obtenerPIBAPIDETAILEDLIST")
	public @ResponseBody Map<String, Object> getPIBAPIDETAILEDLIST(@RequestBody PibapidetailedlistEntradaDTO entrada){
		logger.debug("Entra a getPIBAPIDETAILEDLIST");
		Map<String, Object> mapaResult = new HashMap<>();
		try {
			mapaResult = this.servicePIBAPIDETAILEDLIST.obtenerPIBAPIDETAILEDLISTv2Bean(
					entrada.getEmployeeNumber(), entrada.getSubtype(), entrada.getTimeIntervallow(), entrada.getTimeIntervalhigh());
			logger.debug("mapaResult: {}", mapaResult);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return mapaResult;
	}
	
	/**  PIC1PRESTAMO */
	@PostMapping(value = "/obtenerPIC1PRESTAMO")
	public @ResponseBody Map<String, Object> getPIC1PRESTAMO(@RequestBody List<PIC1PrestamoEntradaBO> listEntradaBO){
		logger.debug("Entra a getPIC1PRESTAMO");
		Map<String, Object> mapaResult = new HashMap<>();
		try {
			mapaResult = this.servicePIC1PRESTAMO.obtenerSIZTMHRPYF021Bean(AnticiposConstantes.USUARIO_SISTEMA, "", listEntradaBO);
			logger.debug("mapaResult: {}", mapaResult);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return mapaResult;
	}
	
	/**  PIC2PRESTAMO */
	@PostMapping(value = "/obtenerPIC2PRESTAMO")
	public @ResponseBody Map<String, Object> getPIC2PRESTAMO(@RequestBody Pic2prestamoEntradaDTO entrada){
		logger.debug("Entra a getPIC2PRESTAMO");
		Map<String, Object> mapaResult = new HashMap<>();
		try {
			mapaResult = this.servicePIC2PRESTAMO.obtenerSIZTMHRPYF022Bean(
					entrada.getExpSolicita(), entrada.getFechaRef(), entrada.getIdMovimiento(), entrada.getListEntradaBO());
			logger.debug("mapaResult: {}", mapaResult);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return mapaResult;
	}
	
	/**  PIDIASSINBANCO */
	@PostMapping(value = "/obtenerPIDIASSINBANCO")
	public @ResponseBody List<DiaSinBancoBean> getPIDIASSINBANCO(@RequestBody PidiassinbancoEntradaDTO entrada){
		logger.debug("Entra a getPIDIASSINBANCO");
		List<DiaSinBancoBean> listResult = new ArrayList<>();
		try {
			listResult = this.servicePIDIASSINBANCO.obtenerDiaSinBancoBean(entrada.getAnioIni(), entrada.getAnioFin());
			logger.debug("listResult: {}", listResult);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return listResult;
	}
	
	/**  PIIT2006 */
	@PostMapping(value = "/obtenerPIIT2006")
	public @ResponseBody Map<String, List<PI_IT2006Bean>> getPIIT2006(@RequestBody Piit2006EntradaDTO entrada){
		logger.debug("Entra a getPIIT2006"); 
		Map<String, List<PI_IT2006Bean>> mapResult = new HashMap<>();
		try {
			mapResult = this.servicePIIT2006.obtenerPIIT2006Bean(entrada.getBegda(), entrada.getDeend(), entrada.getDesta(), 
					entrada.getEndda(), entrada.getExpSolicita(), entrada.getSubty(), entrada.getExpedientes());
			logger.debug("mapResult: {}", mapResult);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return mapResult;
	}
	
	/**  PIIT2008 */
	@PostMapping(value = "/obtenerPIIT2008")
	public @ResponseBody List<PI_IT008Bean> getPIIT2008(@RequestBody Piit2008EntradaDTO entrada){
		logger.debug("Entra a getPIIT2008"); 
		List<PI_IT008Bean> listResult = new ArrayList<>();
		try {
			listResult = this.servicePIIT2008.obtenerPIIT008Bean(entrada.getExpSolicita(), entrada.getFechaRef(),
					entrada.getSprps(), entrada.getPernr());
			logger.debug("listResult: {}", listResult);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return listResult;
	}
	
	/**  SIPA03PCRREAD */
	@PostMapping(value = "/obtenerSIPA03PCRREAD")
	public @ResponseBody SIPA03PCRREADSalidaBO getSIPA03PCRREAD(@RequestBody SIPA03PCRREADEntradaBO entrada){
		logger.debug("Entra a getSIPA03PCRREAD"); 
		SIPA03PCRREADSalidaBO boResult = new SIPA03PCRREADSalidaBO();
		try {
			boResult = this.serviceSIPA03PCRREAD.obtenerSIPA03PCRREADBean(entrada);
			logger.debug("boResult: {}", boResult);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return boResult;
	}
	
	/**  SIZTMHRPIF007 */
	@PostMapping(value = "/obtenerSIZTMHRPIF007")
	public @ResponseBody List<SI_ZTMHRPIF007Bean> getSIZTMHRPIF007(@RequestBody Siztmhrpif007EntradaDTO entrada){
		logger.debug("Entra a getSIZTMHRPIF007"); 
		List<SI_ZTMHRPIF007Bean> listResult = new ArrayList<>();
		try {
			listResult = this.serviceSIZTMHRPIF007.obtenerSI_ZTMHRPIF007Bean(entrada.getCiclo(),
					entrada.getExpSolicita(), entrada.getPernr());
			logger.debug("listResult: {}", listResult);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return listResult;
	}
	
	/**  SIZTMHRPIF008 */
	@PostMapping(value = "/obtenerSIZTMHRPIF008")
	public @ResponseBody List<SIZTMHRPIF008Bean> getSIZTMHRPIF008(@RequestBody String pernr){
		logger.debug("Entra a getSIZTMHRPIF008"); 
		List<SIZTMHRPIF008Bean> listResult = new ArrayList<>();
		try {
			listResult = this.serviceSIZTMHRPIF008.obtenerSIZTMHRPIF008Bean(AnticiposConstantes.USUARIO_SISTEMA, pernr);
			logger.debug("listResult: {}", listResult);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return listResult;
	}
	
	/**  SIZTMHRPIF009 */
	@PostMapping(value = "/obtenerSIZTMHRPIF009")
	public @ResponseBody List<SIZTMHRPIF009Bean> getSIZTMHRPIF009(@RequestBody Siztmhrpif009EntradaDTO entrada){
		logger.debug("Entra a getSIZTMHRPIF009"); 
		List<SIZTMHRPIF009Bean> listResult = new ArrayList<>();
		try {
			listResult = this.serviceSIZTMHRPIF009.obtenerSIZTMHRPIF009Bean(entrada.getExpSolicita(),
					entrada.getSprps(), entrada.getSubty(), entrada.getTprog(), entrada.getPernr());
			logger.debug("listResult: {}", listResult);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return listResult;
	}
	
	/**  SIZTMHRPYF022 */
	@PostMapping(value = "/obtenerSIZTMHRPYF022")
	public @ResponseBody Map<String, Object> getSIZTMHRPYF022(@RequestBody Siztmhrpyf022EntradaDTO entrada){
		logger.debug("Entra a getSIZTMHRPYF022"); 
		Map<String, Object> mapResult = new HashMap<>();
		try {
			mapResult = this.serviceSIZTMHRPYF022.obtenerSIZTMHRPYF022Bean(entrada.getExpSolicita(),
					entrada.getFechaRef(), entrada.getIdMovimiento(), entrada.getListEntradaBO());
			logger.debug("mapResult: {}", mapResult);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return mapResult;
	}
	
	/**  SIZTMHRPYF023 */
	@PostMapping(value = "/obtenerSIZTMHRPYF023")
	public @ResponseBody List<SIZTMHRPYF023v2Bean> getSIZTMHRPYF023(@RequestBody Siztmhrpyf023EntradaDTO entrada){
		logger.debug("Entra a getSIZTMHRPYF023"); 
		List<SIZTMHRPYF023v2Bean> listResult = new ArrayList<>();
		try {
			listResult = this.serviceSIZTMHRPYF023.obtenerSIZTMHRPYF023v2Bean(entrada.getExpSolicita(),
					entrada.getSprps(), entrada.getSubty(), entrada.getPernr(), entrada.getFechaRef());
			logger.debug("listResult: {}", listResult);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return listResult;
	}
	
	/**  SIZTMHRPYF028 */
	@PostMapping(value = "/obtenerSIZTMHRPYF028")
	public @ResponseBody DTZTMHRPYF028Response getSIZTMHRPYF028(@RequestBody List<DTZTMHRPYES032> entrada){
		logger.debug("Entra a getSIZTMHRPYF028"); 
		DTZTMHRPYF028Response objResult = new DTZTMHRPYF028Response();
		try {
			objResult = this.serviceSIZTMHRPYF028.obtenerSIZTMHRPYF028Bean(entrada);
			logger.debug("objResult: {}", objResult);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return objResult;
	}
	
	/**  TPA9990 */
	@PostMapping(value = "/obtenerTPA9990")
	public @ResponseBody List<T_PA9990Bean> getTPA9990(@RequestBody Tpa9990EntradaDTO entrada){
		logger.debug("Entra a getTPA9990"); 
		List<T_PA9990Bean> listResult = new ArrayList<>();
		try {
//			listResult = this.serviceTPA9990.obtenerTPA9990Bean(entrada.getSociedad(), entrada.getNumExpediente());
			listResult = this.pisDatosMockService.obtenerTPA9990Bean(entrada.getSociedad(), entrada.getNumExpediente());
			logger.debug("listResult: {}", listResult);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return listResult;
	}
	
	/**  ZHRATT010 */
	@PostMapping(value = "/obtenerZHRATT010")
	public @ResponseBody List<ZHRATT010Bean> getZHRATT010(@RequestBody Zhratt010EntradaDTO entrada){
		logger.debug("Entra a getZHRATT010"); 
		List<ZHRATT010Bean> listResult = new ArrayList<>();
		try {
			listResult = this.serviceZHRATT010.obtenerZHRATT010Bean(entrada.getExpsolicita(), entrada.getPernr());
			logger.debug("listResult: {}", listResult);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return listResult;
	}
	
	/**  ZRFCCAPMASIVA */
	@PostMapping(value = "/obtenerZRFCCAPMASIVA")
	public @ResponseBody ZHRAITE001SalidaBO getZRFCCAPMASIVA(@RequestBody ZrfccapmasivaEntradaDTO entrada){
		logger.debug("Entra a getZRFCCAPMASIVA"); 
		ZHRAITE001SalidaBO obResult = new ZHRAITE001SalidaBO();
		try {
			obResult = this.serviceZRFCCAPMASIVA.obtenerZRFCCAPMASIVABean(entrada.getIinfty(), entrada.getIctagen(),
					entrada.getIjefein(), entrada.getIcap(), entrada.getListCapMasBO());
			logger.debug("obResult: {}", obResult);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return obResult;
	}
	
	/**  ZRFCCREADOCFIF47 */
	@PostMapping(value = "/obtenerZRFCCREADOCFIF47")
	public @ResponseBody DTZRFCCREADOCFIF47Response getZRFCCREADOCFIF47(@RequestBody DTZRFCCREADOCFIF47Request entrada){
		logger.debug("Entra a getZRFCCREADOCFIF47"); 
		DTZRFCCREADOCFIF47Response obResult = new DTZRFCCREADOCFIF47Response();
		try {
			obResult = this.serviceZRFCCREADOCFIF47.obtenerZRFCCREADOCFIF47Bean(entrada);
			logger.debug("obResult: {}", obResult);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return obResult;
	}
	
}
