package com.hitss.pis.rest.webservices.dto;

public class Siztmhrpif007EntradaDTO {

	private String ciclo;
	private String expSolicita;
	private String pernr;

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public String getExpSolicita() {
		return expSolicita;
	}

	public void setExpSolicita(String expSolicita) {
		this.expSolicita = expSolicita;
	}

	public String getPernr() {
		return pernr;
	}

	public void setPernr(String pernr) {
		this.pernr = pernr;
	}

	@Override
	public String toString() {
		return "Siztmhrpif007EntradaDTO [ciclo=" + ciclo + ", expSolicita=" + expSolicita + ", pernr=" + pernr + "]";
	}

}
