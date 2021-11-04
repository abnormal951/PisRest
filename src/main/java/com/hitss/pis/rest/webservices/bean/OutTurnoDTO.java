package com.hitss.pis.rest.webservices.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OutTurnoDTO {

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("itanz")
	private Integer itanz;

	@JsonProperty("klass")
	private Integer klass;

	@JsonProperty("kurzt")
	private String kurzt;

	@JsonProperty("mofid")
	private String mofid;

	@JsonProperty("motpr")
	private String motpr;

	@JsonProperty("sobeg")
	private String sobeg;

	@JsonProperty("soend")
	private String soend;

	@JsonProperty("stdaz")
	private Integer stdaz;

	@JsonProperty("tagty")
	private String tagty;

	@JsonProperty("tprog")
	private String tprog;

	@JsonProperty("varia")
	private String varia;

	@JsonProperty("vtart")
	private String vtart;

	@JsonProperty("zmodn")
	private String zmodn;

	@JsonProperty("pamod")
	private String pamod;

	@JsonProperty("datum")
	private String datum;

	@JsonProperty("pausa")
	private List<PausaDTO> pausa;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getItanz() {
		return itanz;
	}

	public void setItanz(Integer itanz) {
		this.itanz = itanz;
	}

	public Integer getKlass() {
		return klass;
	}

	public void setKlass(Integer klass) {
		this.klass = klass;
	}

	public String getKurzt() {
		return kurzt;
	}

	public void setKurzt(String kurzt) {
		this.kurzt = kurzt;
	}

	public String getMofid() {
		return mofid;
	}

	public void setMofid(String mofid) {
		this.mofid = mofid;
	}

	public String getMotpr() {
		return motpr;
	}

	public void setMotpr(String motpr) {
		this.motpr = motpr;
	}

	public String getSobeg() {
		return sobeg;
	}

	public void setSobeg(String sobeg) {
		this.sobeg = sobeg;
	}

	public String getSoend() {
		return soend;
	}

	public void setSoend(String soend) {
		this.soend = soend;
	}

	public Integer getStdaz() {
		return stdaz;
	}

	public void setStdaz(Integer stdaz) {
		this.stdaz = stdaz;
	}

	public String getTagty() {
		return tagty;
	}

	public void setTagty(String tagty) {
		this.tagty = tagty;
	}

	public String getTprog() {
		return tprog;
	}

	public void setTprog(String tprog) {
		this.tprog = tprog;
	}

	public String getVaria() {
		return varia;
	}

	public void setVaria(String varia) {
		this.varia = varia;
	}

	public String getVtart() {
		return vtart;
	}

	public void setVtart(String vtart) {
		this.vtart = vtart;
	}

	public String getZmodn() {
		return zmodn;
	}

	public void setZmodn(String zmodn) {
		this.zmodn = zmodn;
	}

	public String getPamod() {
		return pamod;
	}

	public void setPamod(String pamod) {
		this.pamod = pamod;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public List<PausaDTO> getPausa() {
		return pausa;
	}

	public void setPausa(List<PausaDTO> pausa) {
		this.pausa = pausa;
	}

	@Override
	public String toString() {
		return "OutTurnoDTO [id=" + id + ", itanz=" + itanz + ", klass=" + klass + ", kurzt=" + kurzt + ", mofid="
				+ mofid + ", motpr=" + motpr + ", sobeg=" + sobeg + ", soend=" + soend + ", stdaz=" + stdaz + ", tagty="
				+ tagty + ", tprog=" + tprog + ", varia=" + varia + ", vtart=" + vtart + ", zmodn=" + zmodn + ", pamod="
				+ pamod + ", datum=" + datum + ", pausa=" + pausa + "]";
	}

}
