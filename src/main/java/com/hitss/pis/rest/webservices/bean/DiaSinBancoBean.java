package com.hitss.pis.rest.webservices.bean;

public class DiaSinBancoBean {

	private int MANDT;
	private String ANIO;
	private String MES;
	private String DIA;

	public DiaSinBancoBean() {
	}

	public DiaSinBancoBean(int mANDT, String aNIO, String mES, String dIA) {
		MANDT = mANDT;
		ANIO = aNIO;
		MES = mES;
		DIA = dIA;
	}

	public int getMANDT() {
		return MANDT;
	}

	public void setMANDT(int mANDT) {
		MANDT = mANDT;
	}

	public String getANIO() {
		return ANIO;
	}

	public void setANIO(String aNIO) {
		ANIO = aNIO;
	}

	public String getMES() {
		return MES;
	}

	public void setMES(String mES) {
		MES = mES;
	}

	public String getDIA() {
		return DIA;
	}

	public void setDIA(String dIA) {
		DIA = dIA;
	}

	@Override
	public String toString() {
		return "DiaSinBancoBean [MANDT=" + MANDT + ", ANIO=" + ANIO + ", MES=" + MES + ", DIA=" + DIA + "]";
	}

}
