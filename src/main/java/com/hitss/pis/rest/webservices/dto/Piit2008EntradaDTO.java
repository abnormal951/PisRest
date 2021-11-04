package com.hitss.pis.rest.webservices.dto;

public class Piit2008EntradaDTO {

	private String expSolicita;
	private String fechaRef;
	private String sprps;
	private String pernr;

	public String getExpSolicita() {
		return expSolicita;
	}

	public void setExpSolicita(String expSolicita) {
		this.expSolicita = expSolicita;
	}

	public String getFechaRef() {
		return fechaRef;
	}

	public void setFechaRef(String fechaRef) {
		this.fechaRef = fechaRef;
	}

	public String getSprps() {
		return sprps;
	}

	public void setSprps(String sprps) {
		this.sprps = sprps;
	}

	public String getPernr() {
		return pernr;
	}

	public void setPernr(String pernr) {
		this.pernr = pernr;
	}

	@Override
	public String toString() {
		return "Piit2008EntradaDTO [expSolicita=" + expSolicita + ", fechaRef=" + fechaRef + ", sprps=" + sprps
				+ ", pernr=" + pernr + "]";
	}

}
