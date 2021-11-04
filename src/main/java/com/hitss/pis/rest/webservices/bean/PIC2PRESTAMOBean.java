package com.hitss.pis.rest.webservices.bean;

public class PIC2PRESTAMOBean {

	private String EXPSOLICITA;
	private String IDMOVIMIENTO;
	private int MANDT;
	private String PERNR;
	private String SUBTY;
	private String ZREFER;
	private String FECPROC;
	private double IMPANT;
	private String PERLIQ;

	public PIC2PRESTAMOBean() {
	}

	public PIC2PRESTAMOBean(String eXPSOLICITA, String iDMOVIMIENTO, int mANDT, String pERNR, String sUBTY,
			String zREFER, String fECPROC, double iMPANT, String pERLIQ) {
		EXPSOLICITA = eXPSOLICITA;
		IDMOVIMIENTO = iDMOVIMIENTO;
		MANDT = mANDT;
		PERNR = pERNR;
		SUBTY = sUBTY;
		ZREFER = zREFER;
		FECPROC = fECPROC;
		IMPANT = iMPANT;
		PERLIQ = pERLIQ;
	}

	public String getEXPSOLICITA() {
		return EXPSOLICITA;
	}

	public void setEXPSOLICITA(String eXPSOLICITA) {
		EXPSOLICITA = eXPSOLICITA;
	}

	public String getIDMOVIMIENTO() {
		return IDMOVIMIENTO;
	}

	public void setIDMOVIMIENTO(String iDMOVIMIENTO) {
		IDMOVIMIENTO = iDMOVIMIENTO;
	}

	public int getMANDT() {
		return MANDT;
	}

	public void setMANDT(int mANDT) {
		MANDT = mANDT;
	}

	public String getPERNR() {
		return PERNR;
	}

	public void setPERNR(String pERNR) {
		PERNR = pERNR;
	}

	public String getSUBTY() {
		return SUBTY;
	}

	public void setSUBTY(String sUBTY) {
		SUBTY = sUBTY;
	}

	public String getZREFER() {
		return ZREFER;
	}

	public void setZREFER(String zREFER) {
		ZREFER = zREFER;
	}

	public String getFECPROC() {
		return FECPROC;
	}

	public void setFECPROC(String fECPROC) {
		FECPROC = fECPROC;
	}

	public double getIMPANT() {
		return IMPANT;
	}

	public void setIMPANT(double iMPANT) {
		IMPANT = iMPANT;
	}

	public String getPERLIQ() {
		return PERLIQ;
	}

	public void setPERLIQ(String pERLIQ) {
		PERLIQ = pERLIQ;
	}

	@Override
	public String toString() {
		return "PIC2PRESTAMOBean [EXPSOLICITA=" + EXPSOLICITA + ", IDMOVIMIENTO=" + IDMOVIMIENTO + ", MANDT=" + MANDT
				+ ", PERNR=" + PERNR + ", SUBTY=" + SUBTY + ", ZREFER=" + ZREFER + ", FECPROC=" + FECPROC + ", IMPANT="
				+ IMPANT + ", PERLIQ=" + PERLIQ + "]";
	}

}
