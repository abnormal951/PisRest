package com.hitss.pis.rest.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertiesBean {

	@Value("${path.pi}")
	private String pathPi;
	@Value("${path.img}")
	private String pathImg;
	@Value("${path.pi.DatoMaestroV4}")
	private String pathDatoMaestroV4;
	@Value("${path.pi.InfoTPA9990V2}")
	private String pathInfoTPA9990V2;
	@Value("${path.pi.DiasSinBancoV2}")
	private String pathDiasSinBancoV2;
	@Value("${path.pi.InfoTPA0008V2}")
	private String pathInfoTPA0008V2;
	@Value("${path.pi.ZHRATT010V2}")
	private String pathZHRATT010V2;
	@Value("${path.pi.C1PrestamoV1}")
	private String pathC1PrestamoV1;
	@Value("${path.pi.C2PrestamoV1}")
	private String pathC2PrestamoV1;
	@Value("${path.pi.ZTMHRPIF006}")
	private String pathZTMHRPIF006;
	@Value("${path.pi.ZTMHRPIF004V2}")
	private String pathZTMHRPIF004V2;
	@Value("${path.pi.ZTMHRPIF007}")
	private String pathZTMHRPIF007;
	@Value("${path.pi.ZTMHRPIF008}")
	private String pathZTMHRPIF008;
	@Value("${path.pi.ZTMHRPIF009}")
	private String pathZTMHRPIF009;
	@Value("${path.pi.ZTMHRPYF023V2}")
	private String pathZTMHRPYF023V2;
	@Value("${path.pi.ZTMHRPYF028}")
	private String pathZTMHRPYF028;
	@Value("${path.pi.ZRFCCREADOCFIF47V2}")
	private String pathZRFCCREADOCFIF47V2;
	@Value("${path.pi.ZRFCCAPMASIVA}")
	private String pathZRFCCAPMASIVA;
	@Value("${path.pi.SIPA03PCRREAD}")
	private String pathSIPA03PCRREAD;
	@Value("${path.pi.SIBAPIEMPLCOMMGETDETAILEDLIST_V3}")
	private String pathSIBAPIEMPLCOMMGETDETAILEDLIST_V3;

	// URL para consumo de servicios PI.
	@Value("${url.servicio.consumo.DatoMaestro}")
	private String urlDatoMaestro;
	@Value("${url.servicio.consumo.InfoTPA9990V2}")
	private String urlInfoTPA9990V2;
	@Value("${url.servicio.consumo.DiasSinBancoV2}")
	private String urlDiasSinBancoV2;
	@Value("${url.servicio.consumo.InfoTPA0008V2}")
	private String urlInfoTPA0008V2;
	@Value("${url.servicio.consumo.ZHRATT010V2}")
	private String urlZHRATT010V2;
	@Value("${url.servicio.consumo.C1PrestamoV1}")
	private String urlC1PrestamoV1;
	@Value("${url.servicio.consumo.C2PrestamoV1}")
	private String urlC2PrestamoV1;
	@Value("${url.servicio.consumo.ZTMHRPIF006}")
	private String urlZTMHRPIF006;
	@Value("${url.servicio.consumo.ZTMHRPIF004V2}")
	private String urlZTMHRPIF004V2;
	@Value("${url.servicio.consumo.ZTMHRPIF007}")
	private String urlZTMHRPIF007;
	@Value("${url.servicio.consumo.ZTMHRPIF008}")
	private String urlZTMHRPIF008;
	@Value("${url.servicio.consumo.ZTMHRPIF009}")
	private String urlZTMHRPIF009;
	@Value("${url.servicio.consumo.ZTMHRPYF023V2}")
	private String urlZTMHRPYF023V2;
	@Value("${url.servicio.consumo.ZTMHRPYF028}")
	private String urlZTMHRPYF028;
	@Value("${url.servicio.consumo.ZRFCCREADOCFIF47V2}")
	private String urlZRFCCREADOCFIF47V2;
	@Value("${url.servicio.consumo.ZRFCCAPMASIVA}")
	private String urlZRFCCAPMASIVA;
	@Value("${url.servicio.consumo.SIPA03PCRREAD}")
	private String urlSIPA03PCRREAD;
	@Value("${url.servicio.consumo.SIBAPIEMPLCOMMGETDETAILEDLIST_V3}")
	private String urlSIBAPIEMPLCOMMGETDETAILEDLISTV3;

	// Credenciales para el consumo de PI.
	@Value("${pi.usuario}")
	private String usuario;
	@Value("${pi.password}")
	private String password;

	public String getPathPi() {
		return pathPi;
	}

	public void setPathPi(String pathPi) {
		this.pathPi = pathPi;
	}

	public String getPathImg() {
		return pathImg;
	}

	public void setPathImg(String pathImg) {
		this.pathImg = pathImg;
	}

	public String getPathDatoMaestroV4() {
		return pathDatoMaestroV4;
	}

	public void setPathDatoMaestroV4(String pathDatoMaestroV4) {
		this.pathDatoMaestroV4 = pathDatoMaestroV4;
	}

	public String getPathInfoTPA9990V2() {
		return pathInfoTPA9990V2;
	}

	public void setPathInfoTPA9990V2(String pathInfoTPA9990V2) {
		this.pathInfoTPA9990V2 = pathInfoTPA9990V2;
	}

	public String getPathDiasSinBancoV2() {
		return pathDiasSinBancoV2;
	}

	public void setPathDiasSinBancoV2(String pathDiasSinBancoV2) {
		this.pathDiasSinBancoV2 = pathDiasSinBancoV2;
	}

	public String getPathInfoTPA0008V2() {
		return pathInfoTPA0008V2;
	}

	public void setPathInfoTPA0008V2(String pathInfoTPA0008V2) {
		this.pathInfoTPA0008V2 = pathInfoTPA0008V2;
	}

	public String getPathZHRATT010V2() {
		return pathZHRATT010V2;
	}

	public void setPathZHRATT010V2(String pathZHRATT010V2) {
		this.pathZHRATT010V2 = pathZHRATT010V2;
	}

	public String getPathC1PrestamoV1() {
		return pathC1PrestamoV1;
	}

	public void setPathC1PrestamoV1(String pathC1PrestamoV1) {
		this.pathC1PrestamoV1 = pathC1PrestamoV1;
	}

	public String getPathC2PrestamoV1() {
		return pathC2PrestamoV1;
	}

	public void setPathC2PrestamoV1(String pathC2PrestamoV1) {
		this.pathC2PrestamoV1 = pathC2PrestamoV1;
	}

	public String getPathZTMHRPIF006() {
		return pathZTMHRPIF006;
	}

	public void setPathZTMHRPIF006(String pathZTMHRPIF006) {
		this.pathZTMHRPIF006 = pathZTMHRPIF006;
	}

	public String getPathZTMHRPIF004V2() {
		return pathZTMHRPIF004V2;
	}

	public void setPathZTMHRPIF004V2(String pathZTMHRPIF004V2) {
		this.pathZTMHRPIF004V2 = pathZTMHRPIF004V2;
	}

	public String getPathZTMHRPIF007() {
		return pathZTMHRPIF007;
	}

	public void setPathZTMHRPIF007(String pathZTMHRPIF007) {
		this.pathZTMHRPIF007 = pathZTMHRPIF007;
	}

	public String getPathZTMHRPIF008() {
		return pathZTMHRPIF008;
	}

	public void setPathZTMHRPIF008(String pathZTMHRPIF008) {
		this.pathZTMHRPIF008 = pathZTMHRPIF008;
	}

	public String getPathZTMHRPIF009() {
		return pathZTMHRPIF009;
	}

	public void setPathZTMHRPIF009(String pathZTMHRPIF009) {
		this.pathZTMHRPIF009 = pathZTMHRPIF009;
	}

	public String getPathZTMHRPYF023V2() {
		return pathZTMHRPYF023V2;
	}

	public void setPathZTMHRPYF023V2(String pathZTMHRPYF023V2) {
		this.pathZTMHRPYF023V2 = pathZTMHRPYF023V2;
	}

	public String getPathZTMHRPYF028() {
		return pathZTMHRPYF028;
	}

	public void setPathZTMHRPYF028(String pathZTMHRPYF028) {
		this.pathZTMHRPYF028 = pathZTMHRPYF028;
	}

	public String getPathZRFCCREADOCFIF47V2() {
		return pathZRFCCREADOCFIF47V2;
	}

	public void setPathZRFCCREADOCFIF47V2(String pathZRFCCREADOCFIF47V2) {
		this.pathZRFCCREADOCFIF47V2 = pathZRFCCREADOCFIF47V2;
	}

	public String getPathZRFCCAPMASIVA() {
		return pathZRFCCAPMASIVA;
	}

	public void setPathZRFCCAPMASIVA(String pathZRFCCAPMASIVA) {
		this.pathZRFCCAPMASIVA = pathZRFCCAPMASIVA;
	}

	public String getPathSIPA03PCRREAD() {
		return pathSIPA03PCRREAD;
	}

	public void setPathSIPA03PCRREAD(String pathSIPA03PCRREAD) {
		this.pathSIPA03PCRREAD = pathSIPA03PCRREAD;
	}

	public String getPathSIBAPIEMPLCOMMGETDETAILEDLIST_V3() {
		return pathSIBAPIEMPLCOMMGETDETAILEDLIST_V3;
	}

	public void setPathSIBAPIEMPLCOMMGETDETAILEDLIST_V3(String pathSIBAPIEMPLCOMMGETDETAILEDLIST_V3) {
		this.pathSIBAPIEMPLCOMMGETDETAILEDLIST_V3 = pathSIBAPIEMPLCOMMGETDETAILEDLIST_V3;
	}

	public String getUrlDatoMaestro() {
		return urlDatoMaestro;
	}

	public void setUrlDatoMaestro(String urlDatoMaestro) {
		this.urlDatoMaestro = urlDatoMaestro;
	}

	public String getUrlInfoTPA9990V2() {
		return urlInfoTPA9990V2;
	}

	public void setUrlInfoTPA9990V2(String urlInfoTPA9990V2) {
		this.urlInfoTPA9990V2 = urlInfoTPA9990V2;
	}

	public String getUrlDiasSinBancoV2() {
		return urlDiasSinBancoV2;
	}

	public void setUrlDiasSinBancoV2(String urlDiasSinBancoV2) {
		this.urlDiasSinBancoV2 = urlDiasSinBancoV2;
	}

	public String getUrlInfoTPA0008V2() {
		return urlInfoTPA0008V2;
	}

	public void setUrlInfoTPA0008V2(String urlInfoTPA0008V2) {
		this.urlInfoTPA0008V2 = urlInfoTPA0008V2;
	}

	public String getUrlZHRATT010V2() {
		return urlZHRATT010V2;
	}

	public void setUrlZHRATT010V2(String urlZHRATT010V2) {
		this.urlZHRATT010V2 = urlZHRATT010V2;
	}

	public String getUrlC1PrestamoV1() {
		return urlC1PrestamoV1;
	}

	public void setUrlC1PrestamoV1(String urlC1PrestamoV1) {
		this.urlC1PrestamoV1 = urlC1PrestamoV1;
	}

	public String getUrlC2PrestamoV1() {
		return urlC2PrestamoV1;
	}

	public void setUrlC2PrestamoV1(String urlC2PrestamoV1) {
		this.urlC2PrestamoV1 = urlC2PrestamoV1;
	}

	public String getUrlZTMHRPIF006() {
		return urlZTMHRPIF006;
	}

	public void setUrlZTMHRPIF006(String urlZTMHRPIF006) {
		this.urlZTMHRPIF006 = urlZTMHRPIF006;
	}

	public String getUrlZTMHRPIF004V2() {
		return urlZTMHRPIF004V2;
	}

	public void setUrlZTMHRPIF004V2(String urlZTMHRPIF004V2) {
		this.urlZTMHRPIF004V2 = urlZTMHRPIF004V2;
	}

	public String getUrlZTMHRPIF007() {
		return urlZTMHRPIF007;
	}

	public void setUrlZTMHRPIF007(String urlZTMHRPIF007) {
		this.urlZTMHRPIF007 = urlZTMHRPIF007;
	}

	public String getUrlZTMHRPIF008() {
		return urlZTMHRPIF008;
	}

	public void setUrlZTMHRPIF008(String urlZTMHRPIF008) {
		this.urlZTMHRPIF008 = urlZTMHRPIF008;
	}

	public String getUrlZTMHRPIF009() {
		return urlZTMHRPIF009;
	}

	public void setUrlZTMHRPIF009(String urlZTMHRPIF009) {
		this.urlZTMHRPIF009 = urlZTMHRPIF009;
	}

	public String getUrlZTMHRPYF023V2() {
		return urlZTMHRPYF023V2;
	}

	public void setUrlZTMHRPYF023V2(String urlZTMHRPYF023V2) {
		this.urlZTMHRPYF023V2 = urlZTMHRPYF023V2;
	}

	public String getUrlZTMHRPYF028() {
		return urlZTMHRPYF028;
	}

	public void setUrlZTMHRPYF028(String urlZTMHRPYF028) {
		this.urlZTMHRPYF028 = urlZTMHRPYF028;
	}

	public String getUrlZRFCCREADOCFIF47V2() {
		return urlZRFCCREADOCFIF47V2;
	}

	public void setUrlZRFCCREADOCFIF47V2(String urlZRFCCREADOCFIF47V2) {
		this.urlZRFCCREADOCFIF47V2 = urlZRFCCREADOCFIF47V2;
	}

	public String getUrlZRFCCAPMASIVA() {
		return urlZRFCCAPMASIVA;
	}

	public void setUrlZRFCCAPMASIVA(String urlZRFCCAPMASIVA) {
		this.urlZRFCCAPMASIVA = urlZRFCCAPMASIVA;
	}

	public String getUrlSIPA03PCRREAD() {
		return urlSIPA03PCRREAD;
	}

	public void setUrlSIPA03PCRREAD(String urlSIPA03PCRREAD) {
		this.urlSIPA03PCRREAD = urlSIPA03PCRREAD;
	}

	public String getUrlSIBAPIEMPLCOMMGETDETAILEDLISTV3() {
		return urlSIBAPIEMPLCOMMGETDETAILEDLISTV3;
	}

	public void setUrlSIBAPIEMPLCOMMGETDETAILEDLISTV3(String urlSIBAPIEMPLCOMMGETDETAILEDLISTV3) {
		this.urlSIBAPIEMPLCOMMGETDETAILEDLISTV3 = urlSIBAPIEMPLCOMMGETDETAILEDLISTV3;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
