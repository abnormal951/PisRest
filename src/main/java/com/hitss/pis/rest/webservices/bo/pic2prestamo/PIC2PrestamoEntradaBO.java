package com.hitss.pis.rest.webservices.bo.pic2prestamo;

public class PIC2PrestamoEntradaBO {

	private String pernr;
	private String subty;

	public PIC2PrestamoEntradaBO() {
	}

	public PIC2PrestamoEntradaBO(String pernr, String subty) {
		this.pernr = pernr;
		this.subty = subty;
	}

	public String getPernr() {
		return pernr;
	}

	public void setPernr(String pernr) {
		this.pernr = pernr;
	}

	public String getSubty() {
		return subty;
	}

	public void setSubty(String subty) {
		this.subty = subty;
	}

	@Override
	public String toString() {
		return "PIC2PrestamoEntradaBO [pernr=" + pernr + ", subty=" + subty + "]";
	}

}
