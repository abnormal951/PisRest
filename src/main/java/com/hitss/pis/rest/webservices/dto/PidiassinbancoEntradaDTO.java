package com.hitss.pis.rest.webservices.dto;

public class PidiassinbancoEntradaDTO {

	private String anioIni;
	private String anioFin;

	public String getAnioIni() {
		return anioIni;
	}

	public void setAnioIni(String anioIni) {
		this.anioIni = anioIni;
	}

	public String getAnioFin() {
		return anioFin;
	}

	public void setAnioFin(String anioFin) {
		this.anioFin = anioFin;
	}

	@Override
	public String toString() {
		return "PidiassinbancoEntradaDTO [anioIni=" + anioIni + ", anioFin=" + anioFin + "]";
	}

}
