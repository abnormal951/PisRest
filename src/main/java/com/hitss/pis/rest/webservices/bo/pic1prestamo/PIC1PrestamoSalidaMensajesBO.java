package com.hitss.pis.rest.webservices.bo.pic1prestamo;

public class PIC1PrestamoSalidaMensajesBO {

	private String bukrs;
	private String pernr;
	private String status;
	private String msj;
	private String cvemsj;

	public PIC1PrestamoSalidaMensajesBO() {
	}

	public PIC1PrestamoSalidaMensajesBO(String bukrs, String pernr, String status, String msj, String cvemsj) {
		this.bukrs = bukrs;
		this.pernr = pernr;
		this.status = status;
		this.msj = msj;
		this.cvemsj = cvemsj;
	}

	public String getBukrs() {
		return bukrs;
	}

	public void setBukrs(String bukrs) {
		this.bukrs = bukrs;
	}

	public String getPernr() {
		return pernr;
	}

	public void setPernr(String pernr) {
		this.pernr = pernr;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMsj() {
		return msj;
	}

	public void setMsj(String msj) {
		this.msj = msj;
	}

	public String getCvemsj() {
		return cvemsj;
	}

	public void setCvemsj(String cvemsj) {
		this.cvemsj = cvemsj;
	}

	@Override
	public String toString() {
		return "PIC1PrestamoSalidaMensajesBO [bukrs=" + bukrs + ", pernr=" + pernr + ", status=" + status + ", msj="
				+ msj + ", cvemsj=" + cvemsj + "]";
	}

}
