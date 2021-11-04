package com.hitss.pis.rest.webservices.bo.pic2prestamo;

public class PIC2PrestamoSalidaItemBO {

	private String expsolicita;
	private String idmovimiento;
	private String mandt;
	private String pernr;
	private String subty;
	private String zrefer;
	private String fecproc;
	private String impant;
	private String perliq;

	public PIC2PrestamoSalidaItemBO() {
	}

	public PIC2PrestamoSalidaItemBO(String expsolicita, String idmovimiento, String mandt, String pernr, String subty,
			String zrefer, String fecproc, String impant, String perliq) {
		this.expsolicita = expsolicita;
		this.idmovimiento = idmovimiento;
		this.mandt = mandt;
		this.pernr = pernr;
		this.subty = subty;
		this.zrefer = zrefer;
		this.fecproc = fecproc;
		this.impant = impant;
		this.perliq = perliq;
	}

	public String getExpsolicita() {
		return expsolicita;
	}

	public void setExpsolicita(String expsolicita) {
		this.expsolicita = expsolicita;
	}

	public String getIdmovimiento() {
		return idmovimiento;
	}

	public void setIdmovimiento(String idmovimiento) {
		this.idmovimiento = idmovimiento;
	}

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

	public String getSubty() {
		return subty;
	}

	public void setSubty(String subty) {
		this.subty = subty;
	}

	public String getZrefer() {
		return zrefer;
	}

	public void setZrefer(String zrefer) {
		this.zrefer = zrefer;
	}

	public String getFecproc() {
		return fecproc;
	}

	public void setFecproc(String fecproc) {
		this.fecproc = fecproc;
	}

	public String getImpant() {
		return impant;
	}

	public void setImpant(String impant) {
		this.impant = impant;
	}

	public String getPerliq() {
		return perliq;
	}

	public void setPerliq(String perliq) {
		this.perliq = perliq;
	}

	@Override
	public String toString() {
		return "PIC2PrestamoSalidaItemBO [expsolicita=" + expsolicita + ", idmovimiento=" + idmovimiento + ", mandt="
				+ mandt + ", pernr=" + pernr + ", subty=" + subty + ", zrefer=" + zrefer + ", fecproc=" + fecproc
				+ ", impant=" + impant + ", perliq=" + perliq + "]";
	}

}
