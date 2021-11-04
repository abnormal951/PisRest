package com.hitss.pis.rest.webservices.bo.pic1prestamo;

public class PIC1PrestamoSalidaItemBO {

	private String expsolicita;
	private String idmovimiento;
	private String mandt;
	private String pernr;
	private String fechacierrenom;
	private String fechaprimerdesc;
	private String smensual;
	private String sdiario;
	private String anz02;
	private String anz03;
	private String vpago;

	public PIC1PrestamoSalidaItemBO() {
	}

	public PIC1PrestamoSalidaItemBO(String expsolicita, String idmovimiento, String mandt, String pernr,
			String fechacierrenom, String fechaprimerdesc, String smensual, String sdiario, String anz02, String anz03,
			String vpago) {
		this.expsolicita = expsolicita;
		this.idmovimiento = idmovimiento;
		this.mandt = mandt;
		this.pernr = pernr;
		this.fechacierrenom = fechacierrenom;
		this.fechaprimerdesc = fechaprimerdesc;
		this.smensual = smensual;
		this.sdiario = sdiario;
		this.anz02 = anz02;
		this.anz03 = anz03;
		this.vpago = vpago;
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

	public String getFechacierrenom() {
		return fechacierrenom;
	}

	public void setFechacierrenom(String fechacierrenom) {
		this.fechacierrenom = fechacierrenom;
	}

	public String getFechaprimerdesc() {
		return fechaprimerdesc;
	}

	public void setFechaprimerdesc(String fechaprimerdesc) {
		this.fechaprimerdesc = fechaprimerdesc;
	}

	public String getSmensual() {
		return smensual;
	}

	public void setSmensual(String smensual) {
		this.smensual = smensual;
	}

	public String getSdiario() {
		return sdiario;
	}

	public void setSdiario(String sdiario) {
		this.sdiario = sdiario;
	}

	public String getAnz02() {
		return anz02;
	}

	public void setAnz02(String anz02) {
		this.anz02 = anz02;
	}

	public String getAnz03() {
		return anz03;
	}

	public void setAnz03(String anz03) {
		this.anz03 = anz03;
	}

	public String getVpago() {
		return vpago;
	}

	public void setVpago(String vpago) {
		this.vpago = vpago;
	}

	@Override
	public String toString() {
		return "PIC1PrestamoSalidaItemBO [expsolicita=" + expsolicita + ", idmovimiento=" + idmovimiento + ", mandt="
				+ mandt + ", pernr=" + pernr + ", fechacierrenom=" + fechacierrenom + ", fechaprimerdesc="
				+ fechaprimerdesc + ", smensual=" + smensual + ", sdiario=" + sdiario + ", anz02=" + anz02 + ", anz03="
				+ anz03 + ", vpago=" + vpago + "]";
	}

}
