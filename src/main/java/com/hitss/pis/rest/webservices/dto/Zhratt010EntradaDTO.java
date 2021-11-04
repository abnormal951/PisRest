package com.hitss.pis.rest.webservices.dto;

public class Zhratt010EntradaDTO {

	private String expsolicita;
	private String pernr;

	public String getExpsolicita() {
		return expsolicita;
	}

	public void setExpsolicita(String expsolicita) {
		this.expsolicita = expsolicita;
	}

	public String getPernr() {
		return pernr;
	}

	public void setPernr(String pernr) {
		this.pernr = pernr;
	}

	@Override
	public String toString() {
		return "Zhratt010EntradaDTO [expsolicita=" + expsolicita + ", pernr=" + pernr + "]";
	}

}
