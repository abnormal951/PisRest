package com.hitss.pis.rest.webservices.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IncidenciaResponseDTO {


	@JsonProperty("ExpSolicita")
	private String ExpSolicita;

	@JsonProperty("IdMovimiento")
	private String IdMovimiento;

	@JsonProperty("DatosEnvio")
	private DatosEnvioDTO DatosEnvio;

	@JsonProperty("Estatus")
	private Integer Estatus;

	@JsonProperty("DescEstatus")
	private String DescEstatus;

	public String getIdMovimiento() {
		return IdMovimiento;
	}
	public void setIdMovimiento(String idMovimiento) {
		IdMovimiento = idMovimiento;
	}
	public Integer getEstatus() {
		return Estatus;
	}
	public void setEstatus(Integer estatus) {
		Estatus = estatus;
	}
	public String getDescEstatus() {
		return DescEstatus;
	}
	public void setDescEstatus(String descEstatus) {
		DescEstatus = descEstatus;
	}
	public String getExpSolicita() {
		return ExpSolicita;
	}
	public void setExpSolicita(String expSolicita) {
		ExpSolicita = expSolicita;
	}
	public DatosEnvioDTO getDatosEnvio() {
		return DatosEnvio;
	}
	public void setDatosEnvio(DatosEnvioDTO datosEnvio) {
		DatosEnvio = datosEnvio;
	}

	@Override
	public String toString() {
		return "IncidenciaResponseDTO [ExpSolicita=" + ExpSolicita + ", IdMovimiento=" + IdMovimiento + ", DatosEnvio="
				+ DatosEnvio + ", Estatus=" + Estatus + ", DescEstatus=" + DescEstatus + "]";
	}
}
