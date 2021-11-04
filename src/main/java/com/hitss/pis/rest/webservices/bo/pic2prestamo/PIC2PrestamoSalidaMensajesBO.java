package com.hitss.pis.rest.webservices.bo.pic2prestamo;

public class PIC2PrestamoSalidaMensajesBO {

	private String pernr;
	private String status;
	private String msj;
	private String cvemsj;

	public PIC2PrestamoSalidaMensajesBO() {
	}

	public PIC2PrestamoSalidaMensajesBO(String pernr, String status, String msj, String cvemsj) {
		this.pernr = pernr;
		this.status = status;
		this.msj = msj;
		this.cvemsj = cvemsj;
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
		return "PIC2PrestamoSalidaMensajesBO [pernr=" + pernr + ", status=" + status + ", msj=" + msj + ", cvemsj="
				+ cvemsj + "]";
	}

}
