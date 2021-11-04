package com.hitss.pis.rest.webservices.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DatosEnvioDTO {
	@JsonProperty("expediente")
	private List<ExpedienteDTO> expediente;

	public List<ExpedienteDTO> getExpediente() {
		return expediente;
	}
	public void setExpediente(List<ExpedienteDTO> expediente) {
		this.expediente = expediente;
	}

	@Override
	public String toString() {
		return "DatosEnvioDTO [expediente=" + expediente + "]";
	}
}