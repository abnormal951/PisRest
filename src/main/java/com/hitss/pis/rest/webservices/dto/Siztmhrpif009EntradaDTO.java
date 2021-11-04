package com.hitss.pis.rest.webservices.dto;

public class Siztmhrpif009EntradaDTO {

	private String expSolicita;
	private String sprps;
	private String subty;
	private String tprog;
	private String pernr;

	public String getExpSolicita() {
		return expSolicita;
	}

	public void setExpSolicita(String expSolicita) {
		this.expSolicita = expSolicita;
	}

	public String getSprps() {
		return sprps;
	}

	public void setSprps(String sprps) {
		this.sprps = sprps;
	}

	public String getSubty() {
		return subty;
	}

	public void setSubty(String subty) {
		this.subty = subty;
	}

	public String getTprog() {
		return tprog;
	}

	public void setTprog(String tprog) {
		this.tprog = tprog;
	}

	public String getPernr() {
		return pernr;
	}

	public void setPernr(String pernr) {
		this.pernr = pernr;
	}

	@Override
	public String toString() {
		return "Siztmhrpif009EntradaDTO [expSolicita=" + expSolicita + ", sprps=" + sprps + ", subty=" + subty
				+ ", tprog=" + tprog + ", pernr=" + pernr + "]";
	}

}
