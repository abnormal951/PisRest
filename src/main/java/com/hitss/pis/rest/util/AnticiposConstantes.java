/*
 * @Project WebApp
 * @Date 27/12/2018
 * @author mezaed
 * AnticiposConstantes
 */
package com.hitss.pis.rest.util;

/**
 * The Class AnticiposConstantes.
 */
public class AnticiposConstantes {

	/** The Constant DIAS_PRESTAMO_MIN. */
	public static final int DIAS_PRESTAMO_MIN = 7;

	/** The Constant DIAS_PRESTAMO_MAX. */
	public static final int DIAS_PRESTAMO_MAX = 20;

	/** The Constant DIAS_EXISTE_ANTICIPOS_SIN_PROCESAR. */
	public static final int DIAS_EXISTE_ANTICIPOS_SIN_PROCESAR = 30;

	/** The Constant HORA_DEPOSITO. */
	public static final int HORA_DEPOSITO = 13;

	/** The Constant PERIODO_DESCONTAR_7. */
	public static final String PERIODO_DESCONTAR_7 = "7";

	/** The Constant PERIODO_DESCONTAR_20. */
	public static final String PERIODO_DESCONTAR_20 = "20";

	/** The Constant PERIODO_DESCONTAR_7_7. */
	public static final String PERIODO_DESCONTAR_7_7 = "7-7";

	/** The Constant PERIODO_DESCONTAR_7_20. */
	public static final String PERIODO_DESCONTAR_7_20 = "7-20";

	/** The Constant PERIODO_DESCONTAR_7_SEM. */
	public static final String PERIODO_DESCONTAR_7_SEM = "4 semanas";

	/** The Constant PERIODO_DESCONTAR_20_SEM. */
	public static final String PERIODO_DESCONTAR_20_SEM = "9 semanas";

	/** The Constant PERIODO_DESCONTAR_7_QUINC. */
	public static final String PERIODO_DESCONTAR_7_QUINC = "2 quincenas";

	/** The Constant PERIODO_DESCONTAR_20_QUINC. */
	public static final String PERIODO_DESCONTAR_20_QUINC = "4 quincenas";

	/** The Constant TIPO_EMPLEADO_01. */
	public static final String TIPO_EMPLEADO_01 = "01";

	/** The Constant TIPO_EMPLEADO_03. */
	public static final String TIPO_EMPLEADO_03 = "03";

	/** The Constant TIPO_EMPLEADO_21. */
	public static final String TIPO_EMPLEADO_21 = "21";

	/** The Constant PI_IT9990_SUBTY. */
	public static final String PI_IT9990_SUBTY = "9891";

	/** The Constant DIA_DESCANSO_SABADO. */
	public static final String DIA_DESCANSO_SABADO = "7";

	/** The Constant DIA_DESCANSO_DOMINGO. */
	public static final String DIA_DESCANSO_DOMINGO = "1";

	/** The Constant ANTICIPO_SUELDO_TIPO_FORMA_PAGO. */
	public static final String ANTICIPO_SUELDO_TIPO_FORMA_PAGO = "F-25"; // ANTICIPO DE SUELDO ('F-280'=PAGO DE PRIMA VACACIONAL)

	/** The Constant ANTICIPO_SUELDO_BLOQUEONOM. */
	public static final String ANTICIPO_SUELDO_BLOQUEONOM = "X"; // REGISTRO CREADO CON BLOQUEO DE NOMINA (''=SIN BLOQUEO NOMINA)

	/** The Constant ANTICIPO_SUELDO_SIN_CARGA. */
	public static final String ANTICIPO_SUELDO_SIN_CARGA = ""; // SIN CARGAR A IT9990 ('X'=CARGADO)

	/** The Constant ANTICIPO_SUELDO_CANDOC. */
	public static final String ANTICIPO_SUELDO_CANDOC = ""; // SIN CANCELAR ('C'= CANCELADO)

	/** The Constant ENDDA. */
	public static final String ENDDA = "99991231";


	/** The Constant OPTIONS_VIA_PAGO. */
	public static final String[] OPTIONS_VIA_PAGO = { "0", "D" };

	/** Constantes para Telmex de PI CAPMASIVA **/
	public static final String ANTICIPO_TELMEX_CAMPASIVA_INFTY = "9965";
	public static final String ANTICIPO_TELMEX_CAMPASIVA_CTAGEN = "RISWGENE";
	public static final String ANTICIPO_TELMEX_CAMPASIVA_SUBTY = "D";
	public static final String ANTICIPO_TELMEX_CAMPASIVA_BEGUZ = "00:00:00";
	public static final String ANTICIPO_TELMEX_CAMPASIVA_ENDUZ = "00:00:00";
	public static final String ANTICIPO_TELMEX_CAMPASIVA_CTAPTE = "21401905";
	public static final String ANTICIPO_TELMEX_CAMPASIVA_TXTCAB = "PRESTAMO_ETMX";
	public static final String ANTICIPO_TELMEX_CAMPASIVA_DIVISION = "90";
	public static final String ANTICIPO_TELMEX_CAMPASIVA_CTOBENEF = "900008";
	public static final String ANTICIPO_TELMEX_CAMPASIVA_SOCIEDAD = "CORP";
	public static final String ANTICIPO_TELMEX_CAMPASIVA_FOLIO_CAMPO1 = "LIB";

	/** Constantes para empresas filiales (comertel,omsasi,inttelmex) de PI F47 **/
	public static final String ANTICIPO_FILIALES_F47_BLART 	= "KA";
	public static final String ANTICIPO_FILIALES_F47_WAERS 	= "MXN";
	public static final String ANTICIPO_FILIALES_F47_BKTXT 	= "PRESTAMO EMPLEADO";
	public static final String ANTICIPO_FILIALES_F47_ZUMSK 	= "3";
	public static final String ANTICIPO_FILIALES_F47_SGTXT 	= "PRESTAMO EMPLEADO";
	public static final String ANTICIPO_FILIALES_F47_IMODO 	= "N";

	public static final String ANTICIPO_OMSASI_F47_BUKRS 	= "MX10";
	public static final String ANTICIPO_OMSASI_F47_GSBER 	= "MX10";
	public static final String ANTICIPO_OMSASI_F47_ZLSCH 	= "B";

	public static final String ANTICIPO_COMERTEL_F47_BUKRS 	= "COAR";
	public static final String ANTICIPO_COMERTEL_F47_GSBER 	= "CA10";
	public static final String ANTICIPO_COMERTEL_F47_ZLSCH 	= "D";

	public static final String ANTICIPO_INTTELMEX_F47_BUKRS = "ITTM";
	public static final String ANTICIPO_INTTELMEX_F47_GSBER = "IT10";
	public static final String ANTICIPO_INTTELMEX_F47_ZLSCH = "D";
	
	public static final String USUARIO_SISTEMA = "99999999";

}
