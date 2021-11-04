package com.hitss.pis.rest.webservices.bo.pic1prestamo;

public class PIC1PrestamoEntradaBO {

	private String pernr;
	private String fecharef;

	public PIC1PrestamoEntradaBO() {
	}

	public PIC1PrestamoEntradaBO(String pernr, String fecharef) {
		this.pernr = pernr;
		this.fecharef = fecharef;
	}

	public String getPernr() {
		return pernr;
	}

	public void setPernr(String pernr) {
		this.pernr = pernr;
	}

	public String getFecharef() {
		return fecharef;
	}

	public void setFecharef(String fecharef) {
		this.fecharef = fecharef;
	}

	@Override
	public String toString() {
		return "PIC1PrestamoEntradaBO [pernr=" + pernr + ", fecharef=" + fecharef + "]";
	}

}
