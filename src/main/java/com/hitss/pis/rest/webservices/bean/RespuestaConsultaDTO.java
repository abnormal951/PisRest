package com.hitss.pis.rest.webservices.bean;

import java.util.List;

public class RespuestaConsultaDTO {
	private String estatus, descEstatus;
	private List<OutTurnoDTO> outTurnos;

	public RespuestaConsultaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RespuestaConsultaDTO(String estatus, String descEstatus, List<OutTurnoDTO> outTurnos) {
		super();
		this.estatus = estatus;
		this.descEstatus = descEstatus;
		this.outTurnos = outTurnos;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getDescEstatus() {
		return descEstatus;
	}

	public void setDescEstatus(String descEstatus) {
		this.descEstatus = descEstatus;
	}

	public List<OutTurnoDTO> getOutTurnos() {
		return outTurnos;
	}

	public void setOutTurnos(List<OutTurnoDTO> outTurnos) {
		this.outTurnos = outTurnos;
	}

	@Override
	public String toString() {
		return "RespuestaConsultaDTO [estatus=" + estatus + ", descEstatus=" + descEstatus + ", outTurnos=" + outTurnos
				+ "]";
	}

}
