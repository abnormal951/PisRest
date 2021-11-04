/* ***********************************************************************************************
 *                      GLOBAL HITSS SA DE CV
 *
 *                    This code is copyright (c)
 * 
 * Nombre: 			DT_ZTMHRPYES022Bean
 * Descripcion:    	Bean de deposito del resultado de la consulta del WS SI_ZTMHRPYF021 
 * Fecha creacion:  11022019
 * Autor:           JOSEVIGD
 * Ultimo cambio:   
 * 		----------------------------------------------------------------------------- 
 * Historial:
 * 
 ********************************************************************************************** */
package com.hitss.pis.rest.webservices.bean;

public class SIZTMHRPYF021Bean 
{
	private String EXPSOLICITA;
    private String IDMOVIMIENTO;
    private String MANDT;
    private String PERNR;
    private String FECHA_CIERRE_NOM;
    private String FECHA_PRIMER_DESC;
    private String s_MENSUAL;
    private String s_DIARIO;
    private String ANZ02;
    private String ANZ03;
    private String v_PAGO;

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

	public String getS_MENSUAL() {
		return s_MENSUAL;
	}

	public void setS_MENSUAL(String s_MENSUAL) {
		this.s_MENSUAL = s_MENSUAL;
	}

	public String getS_DIARIO() {
		return s_DIARIO;
	}

	public void setS_DIARIO(String s_DIARIO) {
		this.s_DIARIO = s_DIARIO;
	}

	public String getANZ02() {
		return ANZ02;
	}

	public void setANZ02(String aNZ02) {
		ANZ02 = aNZ02;
	}

	public String getANZ03() {
		return ANZ03;
	}

	public void setANZ03(String aNZ03) {
		ANZ03 = aNZ03;
	}

	public String getV_PAGO() {
		return v_PAGO;
	}

	public void setV_PAGO(String v_PAGO) {
		this.v_PAGO = v_PAGO;
	}

	public SIZTMHRPYF021Bean() {
    }	
}//End Class