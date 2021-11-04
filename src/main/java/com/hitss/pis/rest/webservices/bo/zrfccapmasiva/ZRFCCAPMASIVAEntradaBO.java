package com.hitss.pis.rest.webservices.bo.zrfccapmasiva;

import java.util.List;

public class ZRFCCAPMASIVAEntradaBO {

	private String iinfty;
	private String ictagen;
	private String ijefein;
	private String icap;
	private List<ZTIMPCAPMASIVAEntradaBO> item;

	public ZRFCCAPMASIVAEntradaBO() {
	}

	public ZRFCCAPMASIVAEntradaBO(String iinfty, String ictagen, String ijefein, String icap,
			List<ZTIMPCAPMASIVAEntradaBO> item) {
		this.iinfty = iinfty;
		this.ictagen = ictagen;
		this.ijefein = ijefein;
		this.icap = icap;
		this.item = item;
	}

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

	public List<ZTIMPCAPMASIVAEntradaBO> getItem() {
		return item;
	}

	public void setItem(List<ZTIMPCAPMASIVAEntradaBO> item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ZRFCCAPMASIVAEntradaBO [iinfty=" + iinfty + ", ictagen=" + ictagen + ", ijefein=" + ijefein + ", icap="
				+ icap + ", item=" + item + "]";
	}

}
