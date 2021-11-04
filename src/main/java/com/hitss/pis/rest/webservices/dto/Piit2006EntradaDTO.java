package com.hitss.pis.rest.webservices.dto;

import java.util.List;

public class Piit2006EntradaDTO {

	private String begda;
	private String deend;
	private String desta;
	private String endda;
	private String expSolicita;
	private String subty;
	private List<String> expedientes;

	public String getBegda() {
		return begda;
	}

	public void setBegda(String begda) {
		this.begda = begda;
	}

	public String getDeend() {
		return deend;
	}

	public void setDeend(String deend) {
		this.deend = deend;
	}

	public String getDesta() {
		return desta;
	}

	public void setDesta(String desta) {
		this.desta = desta;
	}

	public String getEndda() {
		return endda;
	}

	public void setEndda(String endda) {
		this.endda = endda;
	}

	public String getExpSolicita() {
		return expSolicita;
	}

	public void setExpSolicita(String expSolicita) {
		this.expSolicita = expSolicita;
	}

	public String getSubty() {
		return subty;
	}

	public void setSubty(String subty) {
		this.subty = subty;
	}

	public List<String> getExpedientes() {
		return expedientes;
	}

	public void setExpedientes(List<String> expedientes) {
		this.expedientes = expedientes;
	}

	@Override
	public String toString() {
		return "Piit2006EntradaDTO [begda=" + begda + ", deend=" + deend + ", desta=" + desta + ", endda=" + endda
				+ ", expSolicita=" + expSolicita + ", subty=" + subty + ", expedientes=" + expedientes + "]";
	}

}
