package com.hitss.pis.rest.webservices.bean;
/**
 * @objetivo Clase utilizada para la persistencia de los datos BAPIP0105NLBean, BAPIRETURN1Bean
 *  al consultar el PI BAPIEMPLCOMMGETDETAILEDLISTBean
 * @author sanchezd
 * @fecha 06/06/2019
 * @historial
 * - 06/06/2019 sanchezd creaci�n de la clase
 * - 
 * -
 * -
 */
public class BAPIEMPLCOMMGETDETAILEDLISTBean {
	
	private BAPIP0105NLBean bapip0105nlBean;
	private BAPIRETURN1Bean bapireturn1Bean;
	
	public BAPIP0105NLBean getBapip0105nlBean() {
		return bapip0105nlBean;
	}
	public void setBapip0105nlBean(BAPIP0105NLBean bapip0105nlBean) {
		this.bapip0105nlBean = bapip0105nlBean;
	}
	public BAPIRETURN1Bean getBapireturn1Bean() {
		return bapireturn1Bean;
	}
	public void setBapireturn1Bean(BAPIRETURN1Bean bapireturn1Bean) {
		this.bapireturn1Bean = bapireturn1Bean;
	}
	
	
}
