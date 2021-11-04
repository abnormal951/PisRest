package com.hitss.pis.rest.webservices.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IncidenciaDTO {
	@JsonProperty("infotipo")
	private Integer infotipo;

	@JsonProperty("subty")
	private String subty;

	@JsonProperty("beguz")
	private String beguz;

	@JsonProperty("enduz")
	private String enduz;

	@JsonProperty("anzhl")
	private String anzhl;

	@JsonProperty("betrg")
	private String betrg;

	public Integer getInfotipo() {
		return infotipo;
	}
	public void setInfotipo(Integer infotipo) {
		this.infotipo = infotipo;
	}
	public String getSubty() {
		return subty;
	}
	public void setSubty(String subty) {
		this.subty = subty;
	}
	public String getBeguz() {
		return beguz;
	}
	public void setBeguz(String beguz) {
		this.beguz = beguz;
	}
	public String getEnduz() {
		return enduz;
	}
	public void setEnduz(String enduz) {
		this.enduz = enduz;
	}
	public String getAnzhl() {
		return anzhl;
	}
	public void setAnzhl(String anzhl) {
		this.anzhl = anzhl;
	}
	public String getBetrg() {
		return betrg;
	}
	public void setBetrg(String betrg) {
		this.betrg = betrg;
	}

	@Override
	public String toString() {
		return "IncidenciaDTO [infotipo=" + infotipo + ", subty=" + subty + ", beguz=" + beguz + ", enduz=" + enduz
				+ ", anzhl=" + anzhl + ", betrg=" + betrg + "]";
	}
}
