package com.hitss.pis.rest.webservices.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExpedienteDTO {
	@JsonProperty("mandt")
	private String mandt;

	@JsonProperty("pernr")
	private String pernr;

	@JsonProperty("out_turno")
	private List<OutTurnoDTO> outTurno;

	public String getMandt() {
		return mandt;
	}

	public void setMandt(String mandt) {
		this.mandt = mandt;
	}

	public String getPernr() {
		return pernr;
	}

	public void setPernr(String pernr) {
		this.pernr = pernr;
	}

	public List<OutTurnoDTO> getOutTurno() {
		return outTurno;
	}

	public void setOutTurno(List<OutTurnoDTO> outTurno) {
		this.outTurno = outTurno;
	}

	@Override
	public String toString() {
		return "ExpedienteDTO [mandt=" + mandt + ", pernr=" + pernr + ", outTurno=" + outTurno + "]";
	}

}
