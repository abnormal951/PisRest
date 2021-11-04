package com.hitss.pis.rest.webservices.bean;

public class MensajeSalidaBean {

	private String pernr;
	private int status;
	private String msj;
	private String cveMsj;

	public MensajeSalidaBean() {
	}

	public MensajeSalidaBean(String pernr, int status, String msj, String cveMsj) {
		this.pernr = pernr;
		this.status = status;
		this.msj = msj;
		this.cveMsj = cveMsj;
	}

	public String getPernr() {
		return pernr;
	}

	public void setPernr(String pernr) {
		this.pernr = pernr;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsj() {
		return msj;
	}

	public void setMsj(String msj) {
		this.msj = msj;
	}

	public String getCveMsj() {
		return cveMsj;
	}

	public void setCveMsj(String cveMsj) {
		this.cveMsj = cveMsj;
	}

	@Override
	public String toString() {
		return "MensajeSalidaBean [pernr=" + pernr + ", status=" + status + ", msj=" + msj + ", cveMsj=" + cveMsj + "]";
	}

}
