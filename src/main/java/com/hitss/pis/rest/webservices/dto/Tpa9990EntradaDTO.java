package com.hitss.pis.rest.webservices.dto;

public class Tpa9990EntradaDTO {

	private String sociedad;
	private String numExpediente;

	public String getSociedad() {
		return sociedad;
	}

	public void setSociedad(String sociedad) {
		this.sociedad = sociedad;
	}

	public String getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(String numExpediente) {
		this.numExpediente = numExpediente;
	}

	@Override
	public String toString() {
		return "Tpa9990EntradaDTO [sociedad=" + sociedad + ", numExpediente=" + numExpediente + "]";
	}

}
