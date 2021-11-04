package com.hitss.pis.rest.webservices.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PausaDTO {

	@JsonProperty("pabeg")
	private String pabeg;

	@JsonProperty("paend")
	private String paend;

	@JsonProperty("pdbez")
	private Double pdbez;

	public String getPabeg() {
		return pabeg;
	}

	public void setPabeg(String pabeg) {
		this.pabeg = pabeg;
	}

	public String getPaend() {
		return paend;
	}

	public void setPaend(String paend) {
		this.paend = paend;
	}

	public Double getPdbez() {
		return pdbez;
	}

	public void setPdbez(Double pdbez) {
		this.pdbez = pdbez;
	}

	@Override
	public String toString() {
		return "PausaDTO [pabeg=" + pabeg + ", paend=" + paend + ", pdbez=" + pdbez + "]";
	}

}
