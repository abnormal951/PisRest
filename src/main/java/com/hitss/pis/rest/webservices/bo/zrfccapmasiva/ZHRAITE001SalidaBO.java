package com.hitss.pis.rest.webservices.bo.zrfccapmasiva;

import java.math.BigDecimal;

public class ZHRAITE001SalidaBO {

	private String id2;
	private String msgerrexp;
	private BigDecimal horas;
	private BigDecimal dias;

	public ZHRAITE001SalidaBO() {
	}

	public ZHRAITE001SalidaBO(String id2, String msgerrexp, BigDecimal horas, BigDecimal dias) {
		this.id2 = id2;
		this.msgerrexp = msgerrexp;
		this.horas = horas;
		this.dias = dias;
	}

	public String getId2() {
		return id2;
	}

	public void setId2(String id2) {
		this.id2 = id2;
	}

	public String getMsgerrexp() {
		return msgerrexp;
	}

	public void setMsgerrexp(String msgerrexp) {
		this.msgerrexp = msgerrexp;
	}

	public BigDecimal getHoras() {
		return horas;
	}

	public void setHoras(BigDecimal horas) {
		this.horas = horas;
	}

	public BigDecimal getDias() {
		return dias;
	}

	public void setDias(BigDecimal dias) {
		this.dias = dias;
	}

	@Override
	public String toString() {
		return "ZHRAITE001SalidaBO [id2=" + id2 + ", msgerrexp=" + msgerrexp + ", horas=" + horas + ", dias=" + dias
				+ "]";
	}

}
