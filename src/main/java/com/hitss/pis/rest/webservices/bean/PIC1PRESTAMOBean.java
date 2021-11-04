package com.hitss.pis.rest.webservices.bean;

public class PIC1PRESTAMOBean {

	private String EXPSOLICITA;
	private String IDMOVIMIENTO;
	private String MANDT;
	private String PERNR;
	private String FECHA_CIERRE_NOM;
	private String FECHA_PRIMER_DESC;
	private double S_MENSUAL;
	private double S_DIARIO;
	private int ANZ02;
	private int ANZ03;
	private String V_PAGO;

	public PIC1PRESTAMOBean() {
	}

	public PIC1PRESTAMOBean(String eXPSOLICITA, String iDMOVIMIENTO, String mANDT, String pERNR,
			String fECHA_CIERRE_NOM, String fECHA_PRIMER_DESC, double s_MENSUAL, double s_DIARIO, int aNZ02, int aNZ03,
			String v_PAGO) {
		EXPSOLICITA = eXPSOLICITA;
		IDMOVIMIENTO = iDMOVIMIENTO;
		MANDT = mANDT;
		PERNR = pERNR;
		FECHA_CIERRE_NOM = fECHA_CIERRE_NOM;
		FECHA_PRIMER_DESC = fECHA_PRIMER_DESC;
		S_MENSUAL = s_MENSUAL;
		S_DIARIO = s_DIARIO;
		ANZ02 = aNZ02;
		ANZ03 = aNZ03;
		V_PAGO = v_PAGO;
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

	public String getMANDT() {
		return MANDT;
	}

	public void setMANDT(String mANDT) {
		MANDT = mANDT;
	}

	public String getPERNR() {
		return PERNR;
	}

	public void setPERNR(String pERNR) {
		PERNR = pERNR;
	}

	public String getFECHA_CIERRE_NOM() {
		return FECHA_CIERRE_NOM;
	}

	public void setFECHA_CIERRE_NOM(String fECHA_CIERRE_NOM) {
		FECHA_CIERRE_NOM = fECHA_CIERRE_NOM;
	}

	public String getFECHA_PRIMER_DESC() {
		return FECHA_PRIMER_DESC;
	}

	public void setFECHA_PRIMER_DESC(String fECHA_PRIMER_DESC) {
		FECHA_PRIMER_DESC = fECHA_PRIMER_DESC;
	}

	public double getS_MENSUAL() {
		return S_MENSUAL;
	}

	public void setS_MENSUAL(double s_MENSUAL) {
		S_MENSUAL = s_MENSUAL;
	}

	public double getS_DIARIO() {
		return S_DIARIO;
	}

	public void setS_DIARIO(double s_DIARIO) {
		S_DIARIO = s_DIARIO;
	}

	public int getANZ02() {
		return ANZ02;
	}

	public void setANZ02(int aNZ02) {
		ANZ02 = aNZ02;
	}

	public int getANZ03() {
		return ANZ03;
	}

	public void setANZ03(int aNZ03) {
		ANZ03 = aNZ03;
	}

	public String getV_PAGO() {
		return V_PAGO;
	}

	public void setV_PAGO(String v_PAGO) {
		V_PAGO = v_PAGO;
	}

	@Override
	public String toString() {
		return "PIC1PRESTAMOBean [EXPSOLICITA=" + EXPSOLICITA + ", IDMOVIMIENTO=" + IDMOVIMIENTO + ", MANDT=" + MANDT
				+ ", PERNR=" + PERNR + ", FECHA_CIERRE_NOM=" + FECHA_CIERRE_NOM + ", FECHA_PRIMER_DESC="
				+ FECHA_PRIMER_DESC + ", S_MENSUAL=" + S_MENSUAL + ", S_DIARIO=" + S_DIARIO + ", ANZ02=" + ANZ02
				+ ", ANZ03=" + ANZ03 + ", V_PAGO=" + V_PAGO + "]";
	}

}
