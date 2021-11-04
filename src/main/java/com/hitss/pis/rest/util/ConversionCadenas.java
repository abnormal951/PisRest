/*
 * @Project eTelmex
 * @Date 10/04/2019
 * @author mezaed
 * ConversionCadenas
 */
package com.hitss.pis.rest.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.hitss.pis.rest.webservices.bo.datomaestro.PIDatoMaestroSalidaBO;

import criptoaes256.CriptoAES;


/**
 * The Class ConversionCadenas.
 */
public class ConversionCadenas {

	/** The Constant logger. */
	private static final Logger logger = LogManager.getLogger(ConversionCadenas.class);

	/**
	 * Removes the char for chain.
	 *
	 * @param cadena
	 *            the cadena
	 * @param cFind
	 *            the c find
	 * @param cReject
	 *            the c reject
	 * @return the string
	 */
	public static String removeCharForChain(String cadena, String cFind, String cReject) {
		String nuevaCadena = !cadena.equals("") ? cadena.replaceAll(cFind, cReject) : null;
		logger.debug("nuevaCadena: {}", nuevaCadena);
		return nuevaCadena;
	}

	/**
	 * Rellenar numero expediente.
	 *
	 * @param expediente
	 *            the expediente
	 * @return the string
	 */
	public static String rellenarNumeroExpediente(String expediente) {
		if (expediente != null) {
			expediente = expediente.isEmpty() ? expediente : expediente.trim();
			if (expediente.length() < 8 && !expediente.isEmpty()) {
				expediente = String.format("%8s", expediente).replace(' ', '0');
			}
			logger.debug("Expediente formateado[ {} ]", expediente);
			return expediente;
		} else {
			return expediente;
		}
	}

	/**
	 * Format string moneda.
	 *
	 * @param input
	 *            the input
	 * @return the string
	 */
	public static String formatStringMoneda(String input) {
		DecimalFormat formato = new DecimalFormat("#,###.##");
		String valorFormateado = formato.format(input);
		logger.debug("Cadena de moneda formateada[ {} ]", valorFormateado);
		return valorFormateado;
	}

	/**
	 * Round.
	 *
	 * @param number
	 *            the number
	 * @param decimalPlace
	 *            the decimal place
	 * @return the double
	 */
	public static double round(double number, int decimalPlace) {
		BigDecimal bd = new BigDecimal(number);
		bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
		return bd.doubleValue();
	}

	/**
	 * Formatear decimales.
	 *
	 * @param numero
	 *            the numero
	 * @param numeroDecimales
	 *            the numero decimales
	 * @return the double
	 */
	public static Double formatearDecimales(Double numero, Integer numeroDecimales) {
		return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
	}

	/**
	 * Gets the nombre completo DM.
	 *
	 * @param beanDM
	 *            the bean DM
	 * @return the nombre completo DM
	 */
	public static String getNombreCompletoDM(PIDatoMaestroSalidaBO beanDM) {
		String apat = beanDM.getNACHN() != null ? beanDM.getNACHN() : "";
		String amat = beanDM.getNACH2() != null ? beanDM.getNACH2() : "";
		String nombre = beanDM.getVORNA() != null ? beanDM.getVORNA() : "";
		return apat + " " + amat + " " + nombre;
	}

	/**
	 * Gets the nombre completo coma DM.
	 *
	 * @param beanDM
	 *            the bean DM
	 * @return the nombre completo coma DM
	 */
	public static String getNombreCompletoComaDM(PIDatoMaestroSalidaBO beanDM) {
		String apat = beanDM.getNACHN() != null ? beanDM.getNACHN() : "";
		String amat = beanDM.getNACH2() != null ? beanDM.getNACH2() : "";
		String nombre = beanDM.getVORNA() != null ? beanDM.getVORNA() : "";
		return apat + " " + amat + ", " + nombre;
	}

	public static String getSO() {
		String stOS = System.getProperty("os.name");
		if (stOS.toLowerCase().contains("windows")) {
			return "windows";
		} else {
			return "unix";
		}
	}

	public static List<String> getSubordinados(List<String> subordinados) {
		List<String> listSub = new ArrayList<>();
		for (String subordinado : subordinados) {
			String[] array = subordinado.split("_");
			listSub.add(rellenarNumeroExpediente(array[0]));
		}
		logger.debug("Lista de subordinados. {}", listSub.toString());
		return listSub;
	}

	public static Map<String, String> getParametrosIntranet(String pstCifrado) {
		logger.debug("pstCifrado: {}", pstCifrado);
		Map<String, String> mapaDescifrado = new HashMap<>();
		mapaDescifrado.put("BV_SessionID", "");
		mapaDescifrado.put("BV_EngineID", "");
		mapaDescifrado.put("mod", "");
		mapaDescifrado.put("emp", "");
		mapaDescifrado.put("nexp", "");
		mapaDescifrado.put("oid", "");

		try {
			String uncripto = CriptoAES.decrypt(pstCifrado);
			// /*Cadena de prueba*/
			// uncripto =
			// "BV_SessionID=@@@@1296398333.1591618793@@@@&BV_EngineID=ccccadhkjekhedfcefecenidgindflf.0&mod=dmFjYWNpb25lcw==&emp=1&nexp=1325399&oid=-51661";
			logger.debug("Descifrada: {}", uncripto);

			String[] params = uncripto.split("&");
			mapaDescifrado.put("BV_SessionID", params[0].replace("BV_SessionID=", ""));
			mapaDescifrado.put("BV_EngineID", params[1].replace("BV_EngineID=", ""));
			mapaDescifrado.put("mod", params[2].replace("mod=", ""));
			mapaDescifrado.put("emp", params[3].replace("emp=", ""));
			mapaDescifrado.put("nexp", params[4].replace("nexp=", ""));
			mapaDescifrado.put("oid", params[5].replace("oid=", ""));
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		logger.debug("mapaDescifrado. {}", mapaDescifrado);
		return mapaDescifrado;
	}

}
