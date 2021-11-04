package com.hitss.pis.rest.webservices.dto;

import java.util.List;

import com.hitss.pis.rest.webservices.bo.zrfccapmasiva.ZTIMPCAPMASIVAEntradaBO;

public class ZrfccapmasivaEntradaDTO {

	private String iinfty;
	private String ictagen;
	private String ijefein;
	private String icap;
	private List<ZTIMPCAPMASIVAEntradaBO> listCapMasBO;

	public String getIinfty() {
		return iinfty;
	}

	public void setIinfty(String iinfty) {
		this.iinfty = iinfty;
	}

	public String getIctagen() {
		return ictagen;
	}

	public void setIctagen(String ictagen) {
		this.ictagen = ictagen;
	}

	public String getIjefein() {
		return ijefein;
	}

	public void setIjefein(String ijefein) {
		this.ijefein = ijefein;
	}

	public String getIcap() {
		return icap;
	}

	public void setIcap(String icap) {
		this.icap = icap;
	}

	public List<ZTIMPCAPMASIVAEntradaBO> getListCapMasBO() {
		return listCapMasBO;
	}

	public void setListCapMasBO(List<ZTIMPCAPMASIVAEntradaBO> listCapMasBO) {
		this.listCapMasBO = listCapMasBO;
	}

	@Override
	public String toString() {
		return "ZrfccapmasivaEntradaDTO [iinfty=" + iinfty + ", ictagen=" + ictagen + ", ijefein=" + ijefein + ", icap="
				+ icap + ", listCapMasBO=" + listCapMasBO + "]";
	}

}
