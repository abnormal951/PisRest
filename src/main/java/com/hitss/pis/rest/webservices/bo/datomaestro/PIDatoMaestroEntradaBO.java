package com.hitss.pis.rest.webservices.bo.datomaestro;

public class PIDatoMaestroEntradaBO {

    private String bukrs;
    private String pernr;

	public PIDatoMaestroEntradaBO() {
	}

	public PIDatoMaestroEntradaBO(String bukrs, String pernr) {
		this.bukrs = bukrs;
		this.pernr = pernr;
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

	@Override
	public String toString() {
		return "PIDatoMaestroEntradaDTO [bukrs=" + bukrs + ", pernr=" + pernr + "]";
	}

}
