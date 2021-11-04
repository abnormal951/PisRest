/*
 * @Project WebApp
 * @Date 16/01/2019
 * @author mezaed
 * Fechas
 */
package com.hitss.pis.rest.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;


/**
 * The Class Fechas.
 */
@Component
public class Fechas {

	/** The Constant logger. */
	private static final Logger logger = LogManager.getLogger(Fechas.class);

	/** The Constant LOCALE_MX. */
	public static final Locale LOCALE_MX = new Locale("es", "MX");

	/**
	 * Date format string to string.
	 *
	 * @param fecha
	 *            the fecha
	 * @param formatoFecha
	 *            the formato fecha
	 * @return the string
	 */
	public static String dateFormatStringToString(String fecha, String formatoFecha) {
		SimpleDateFormat format = new SimpleDateFormat(formatoFecha);
		try {
			Date fechaFormat = format.parse(fecha);
//			logger.debug("fechaFormat: " + fechaFormat);
			fecha = format.format(fechaFormat);
//			logger.debug("fechaFormateada: " + fecha);
			return fecha;
		} catch (ParseException e) {
			logger.error(e.getMessage());
		}
		return fecha;
	}

	/**
	 * Fecha formateada stringto string.
	 *
	 * @param fechaInput
	 *            the fecha input
	 * @param formatoEntrada
	 *            the formato entrada
	 * @param formatoSalida
	 *            the formato salida
	 * @return the string
	 */
	public static String fechaFormateadaStringtoString(String fechaInput, String formatoEntrada, String formatoSalida) {
		SimpleDateFormat formatStart = new SimpleDateFormat(formatoEntrada);
		SimpleDateFormat formatEnd = new SimpleDateFormat(formatoSalida, LOCALE_MX);

		String [] mesLetra = {"Ene","Feb","Mar","Abr","May","Jun","Jul","Ago","Sep","Oct","Nov","Dic"};
		String fechaFormateada = null;
//		logger.debug("fechaInicial: " + fechaInput);

		try {
			Date fechaFormat = formatStart.parse(fechaInput);
			Calendar cal = Calendar.getInstance();
			cal.setTime(fechaFormat);
			cal.add(Calendar.DAY_OF_YEAR, 0);
			Date fecha = cal.getTime();
			fechaFormateada = formatEnd.format(fecha);
//			logger.debug("fechaFormateada: " + fechaFormateada);

			return fechaFormateada;
		} catch (ParseException e) {
//			logger.error(
//					"Ha sucedido una Excepcion en Codificacion --> fechaFormateadaStringtoString(): " + e.getMessage()
//					+" fechaInput:"+fechaInput+ " formatoEntrada: "+formatoEntrada+" formatoSalida"+formatoSalida);
			String [] fecha = fechaInput.split("/");

			if(fecha.length > 1) {
//				logger.debug(" ==>> fecha " + fecha.toString());
				int cont = 0;
//				logger.debug(" ==>> mesLetra.length " + mesLetra.length);
				for (int i = 0; i < mesLetra.length; i++) {
					if (fecha[1].equals(mesLetra[i])) {
						cont = i + 1;
						break;
					}
				}
				String mes = cont + "";
				mes = mes.length() < 2 ? "0" + mes : mes;
				if (mes.equals("00"))
					fechaFormateada = fechaInput;
				else
					fechaFormateada = fecha[0] + "/" + mes + "/" + fecha[2];
			}else {
				fechaFormateada = fechaInput;
			}
			logger.debug("fechaFormateada: " + fechaFormateada);
		}
		return fechaFormateada;
	}

	public static String obtenerStringMesFormatoddMMMyyyy(String fechaInput, String caracter) {

		String[] mesLetra = { "Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic" };
		String fechaFormateada = null;
//		logger.debug("fechaInicial: " + fechaInput);

		String[] fecha = fechaInput.split(caracter);
		Integer numMes = null;
		for (int i = 0; i < mesLetra.length; i++) {
			if (fecha[1].equals(mesLetra[i])) {
				numMes = i;
				break;
			}
		}
		numMes+=1;
		String mes = numMes + "";
		mes = mes.length() < 2 ? "0" + mes : mes;
//		logger.debug("mes: " + mes);
		return mes;
	}

	public static String fechaFormateadaStringtoStringManual(String fechaInput) {

		String[] mesLetra = { "Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic" };
		String fechaFormateada = null;
//		logger.debug("fechaInicial: " + fechaInput);

		String[] fecha = fechaInput.split("/");
//		logger.debug(" ==>> fecha " + fecha);
		int cont = 0;
//		logger.debug(" ==>> mesLetra.length " + mesLetra.length);
		for (int i = 0; i < mesLetra.length; i++) {
			if (fecha[1].equals(mesLetra[i])) {
				cont = i + 1;
				break;
			}
		}
		String mes = cont + "";
		mes = mes.length() < 2 ? "0" + mes : mes;
		if (mes.equals("00"))
			fechaFormateada = fechaInput;
		else
			fechaFormateada = fecha[0] + "/" + mes + "/" + fecha[2];
//		logger.debug("fechaFormateada: " + fechaFormateada);
		return fechaFormateada;
	}

	/**
	 * Suma dias fecha stringto string.
	 *
	 * @param fechaInput
	 *            the fecha input
	 * @param formatofecha
	 *            the formatofecha
	 * @param dias
	 *            the dias
	 * @return the string
	 */
	public static String sumaDiasFechaStringtoString(String fechaInput, String formatofecha, int dias) {
//		logger.debug("sumaDiasFechaStringtoString");
//		logger.debug("fechaInput: " + fechaInput);
//		logger.debug("formatofecha: " + formatofecha);
//		logger.debug("dias: " + dias);
		SimpleDateFormat formatStart = new SimpleDateFormat(formatofecha);

		try {
//			logger.debug("fechaInicial: " + fechaInput);
			Date fechaFormat = formatStart.parse(fechaInput);

			Calendar calendar = Calendar.getInstance();
			calendar.setTime(fechaFormat); // Configuramos la fecha que se recibe
			calendar.add(Calendar.DAY_OF_YEAR, dias); // numero de d�as a a�adir, o restar en caso de d�as<0
			Date fecha = calendar.getTime(); // Devuelve el objeto Date con los nuevos d�as a�adidos
			String fechaFormateada = formatStart.format(fecha);
//			logger.debug("fechaFormateada: " + fechaFormateada);

			return fechaFormateada;
		} catch (ParseException e) {
			logger.error(
					"Ha sucedido una Excepcion en Codificacion --> sumaDiasFechaStringtoString(): " + e.getMessage());
		}
		return fechaInput;
	}

	public static String sumaMesesFechaStringtoString(String fechaInput, String formatofecha, int meses) {
		SimpleDateFormat formatStart = new SimpleDateFormat(formatofecha);

		try {
//			logger.debug("fechaInicial: " + fechaInput);
			Date fechaFormat = formatStart.parse(fechaInput);

			Calendar calendar = Calendar.getInstance();
			calendar.setTime(fechaFormat); // Configuramos la fecha que se recibe
			calendar.add(Calendar.MONTH, meses); // numero de d�as a a�adir, o restar en caso de d�as<0
			Date fecha = calendar.getTime(); // Devuelve el objeto Date con los nuevos d�as a�adidos
			String fechaFormateada = formatStart.format(fecha);
//			logger.debug("fechaFormateada: " + fechaFormateada);

			return fechaFormateada;
		} catch (ParseException e) {
			logger.error(
					"Ha sucedido una Excepcion en Codificacion --> sumaMesesFechaStringtoString(): " + e.getMessage());
		}
		return fechaInput;
	}

	/**
	 * Obtener dia semana stringto string.
	 *
	 * @param fechaInput
	 *            the fecha input
	 * @return the string
	 */
	public static String obtenerDiaSemanaStringtoString(String fechaInput) {
//		logger.debug("Fecha: " + fechaInput);

		String[] diaSemana = { "dia", "Jueves", "Viernes", "Sabado", "Domingo", "Lunes", "Martes", "Miercoles" };

		String[] arrayFecha = fechaInput.split("-");
		int year = Integer.parseInt(arrayFecha[0]);
		int month = Integer.parseInt(arrayFecha[1]);// yyyy/mm/dd
		int dayOfMonth = Integer.parseInt(arrayFecha[2]);
//		logger.debug("fecha obtenida: " + dayOfMonth + "-" + month + "-" + year);

		Calendar calendar = new GregorianCalendar(year, month, dayOfMonth);

		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
		dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

//		logger.debug("Dia de la semana: " + diaSemana[dayOfWeek] + "[" + (dayOfWeek) + "] - " + fechaInput);
		return String.valueOf(dayOfWeek);
		// return String.valueOf(diaSemana[dayOfWeek]);
	}

	/**
	 * Obtener nomb dia sem stringto string.
	 *
	 * @param fechaInput
	 *            the fecha input
	 * @return the string
	 */
	public static String obtenerNombDiaSemStringtoString(String fechaInput) {
//		logger.debug("Fecha: " + fechaInput);

		String[] diaSemana = { "dia", "Jueves", "Viernes", "S�bado", "Domingo", "Lunes", "Martes", "Mi�rcoles" };

		String[] arrayFecha = fechaInput.split("-");
		int year = Integer.parseInt(arrayFecha[0]);
		int month = Integer.parseInt(arrayFecha[1]);// yyyy/mm/dd
		int dayOfMonth = Integer.parseInt(arrayFecha[2]);
//		logger.debug("fecha obtenida: " + dayOfMonth + "-" + month + "-" + year);

		Calendar calendar = new GregorianCalendar(year, month, dayOfMonth);

		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
		dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

//		logger.debug("Dia de la semana: " + diaSemana[dayOfWeek] + "[" + (dayOfWeek) + "] - " + fechaInput);
		// return String.valueOf(dayOfWeek);
		return String.valueOf(diaSemana[dayOfWeek]);
	}

	/**
	 * Obtener fecha actul formateada.
	 *
	 * @param formato
	 *            the formato
	 * @return the string
	 */
	public static String obtenerFechaActulFormateada(String formato) {
		SimpleDateFormat formatoFecha = new SimpleDateFormat(formato);
		Date fecha = new Date();
		String fechaFormateadaActual = formatoFecha.format(fecha);
//		logger.debug("Fecha actual: " + fechaFormateadaActual);

		return fechaFormateadaActual;
	}

	/**
	 * Gets the date in mili seconds.
	 *
	 * @param fechaInput
	 *            the fecha input
	 * @param formatoEntrada
	 *            the formato entrada
	 * @return the date in mili seconds
	 */
	public static long getDateInMiliSeconds(String fechaInput, String formatoEntrada) {
//		logger.debug("fechaInicial: " + fechaInput);

		long lnMilisegundos = 0;
		SimpleDateFormat formatStart = new SimpleDateFormat(formatoEntrada);
		Date fechaFormat;
		try {
			fechaFormat = formatStart.parse(fechaInput);
			lnMilisegundos = fechaFormat.getTime();
//			logger.debug("Fecha milisegundos:" + lnMilisegundos);
		} catch (ParseException e) {
//			logger.error("Ha sucedido una Excepcion en Codificacion --> getDateInMiliSeconds(): " + e.getMessage());
		}
		return lnMilisegundos;
	}

	/**
	 * Gets the fecha formato.
	 *
	 * @param fechUnixTimeStamp
	 *            the fech unix time stamp
	 * @param formatoCorto
	 *            the formato corto
	 * @return the fecha formato
	 */
	public static String getFechaFormato(Long fechUnixTimeStamp, boolean formatoCorto) {
//		logger.debug("fechUnixTimeStamp: " + fechUnixTimeStamp);

		String lstFechaRegreso = "";

		if (fechUnixTimeStamp >= 0) {

			String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
					"Octubre", "Noviembre", "Diciembre" };

			String fecha = Fechas.getDateByMilisecondsToString(fechUnixTimeStamp);
			String[] arrayFecha = fecha.split("-");
			int year = Integer.parseInt(arrayFecha[0]);
			int month = Integer.parseInt(arrayFecha[1]);
			int dayOfMonth = Integer.parseInt(arrayFecha[2]);
//			logger.debug("fecha obtenida: " + dayOfMonth + "-" + month + "-" + year);

			String mes = meses[month - 1];

			if (formatoCorto)
				mes = mes.substring(0, 3);
			else
				mes = meses[month];

			lstFechaRegreso = dayOfMonth + "/" + mes + "/" + year;
		}
//		logger.debug("lstFechaRegreso: " + lstFechaRegreso);

		return lstFechaRegreso;
	}

	/**
	 * Gets the date by miliseconds to string.
	 *
	 * @param fechaInput
	 *            the fecha input
	 * @return the date by miliseconds to string
	 */
	public static String getDateByMilisecondsToString(long fechaInput) {
//		logger.debug("Fecha input: " + fechaInput);

		String formatoFecha = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatoFecha);

		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(fechaInput);
		String fechaFormat = simpleDateFormat.format(calendar.getTime());
//		logger.debug("fechaFormateada: " + fechaFormat);

		return fechaFormat;
	}

	/**
	 * Gets the anio actual.
	 *
	 * @param fechaInput
	 *            the fecha input
	 * @return the anio actual
	 */
	public static Integer getAnioActual(String fechaInput) {
//		logger.debug("Fecha: " + fechaInput);

		String[] arrayFecha = fechaInput.split("-");
		int year = Integer.parseInt(arrayFecha[0]);
		int month = Integer.parseInt(arrayFecha[1]);// yyyy/mm/dd
		int dayOfMonth = Integer.parseInt(arrayFecha[2]);
//		logger.debug("fecha obtenida: " + dayOfMonth + "-" + month + "-" + year);

		Calendar calendar = new GregorianCalendar(year, month, dayOfMonth);

		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
		dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

		return year;
	}

	public static Integer getMaximoDiasMes(String fechaInput) {
//		logger.debug("Fecha: " + fechaInput);

		String[] arrayFecha = fechaInput.split("-");
		int year = Integer.parseInt(arrayFecha[0]);
		int month = Integer.parseInt(arrayFecha[1]);// yyyy/mm/dd
		int dayOfMonth = Integer.parseInt(arrayFecha[2]);
//		logger.debug("fecha obtenida: " + dayOfMonth + "-" + month + "-" + year);

		Calendar calendar = new GregorianCalendar(year, month-1, dayOfMonth);

		int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // 28
//		logger.debug("Dias maximo del mes: " + days);
		return days;
	}

	/**
	 * Gets the month of date to int.
	 *
	 * @param fechaInput
	 *            the fecha input
	 * @return the month of date to int
	 */
	public static int getMonthOfDateToInt(String fechaInput) {
//		logger.debug("Fecha Input: " + fechaInput);

		String[] arrayFecha = fechaInput.split("-");
		int year = Integer.parseInt(arrayFecha[0]);
		int month = Integer.parseInt(arrayFecha[1]);
		int dayOfMonth = Integer.parseInt(arrayFecha[2]);
//		logger.debug("fecha obtenida: " + dayOfMonth + "-" + month + "-" + year);

		Calendar calendar = new GregorianCalendar(year, month, dayOfMonth);
//		month = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
//		logger.debug("Mes obtenido: " + month);

		return month;
	}

	/**
	 * Gets the month of date to string.
	 *
	 * @param numMes
	 *            the num mes
	 * @return the month of date to string
	 */
	public static String getMonthOfDateToString(Integer numMes) {
//		logger.debug("numMes: " + numMes);

		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		String mes = meses[numMes - 1];
//		logger.debug("mes: " + mes);

		return mes;
	}

	/**
	 * Gets the month of string to integer.
	 *
	 * @param stmes
	 *            the stmes
	 * @return the month of string to integer
	 */
	public static Integer getMonthOfStringToInteger(String stmes) {
//		logger.debug("stmes: " + stmes);

		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		int cont = 0;
		for (cont = 0; cont < meses.length; cont++) {
			if (meses[cont].equals(stmes)) {
				break;
			}
		}

		Integer nuMes = cont;
//		logger.debug("nuMes: " + nuMes);

		return nuMes;
	}

	/**
	 * Gets the day of week of date to array.
	 *
	 * @param fechaInput
	 *            the fecha input
	 * @return the day of week of date to array
	 */
	public static String[] getDayOfWeekOfDateToArray(String fechaInput) {
//		logger.debug("Fecha Input: " + fechaInput);

		String[] arrayFecha = fechaInput.split("-");
		int year = Integer.parseInt(arrayFecha[0]);
		int month = Integer.parseInt(arrayFecha[1]);
		int dayOfMonth = Integer.parseInt(arrayFecha[2]);
//		logger.debug("fecha obtenida: " + dayOfMonth + "-" + month + "-" + year);

		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, dayOfMonth); // vairables int
//		 int dia =  c.get(Calendar.DAY_OF_WEEK);

//		Calendar calendar = new GregorianCalendar(year, month, dayOfMonth);
//		logger.debug("calendar: "+calendar);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

		String[] arrDias = { "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" };
		String[] arrResult = new String[2];
		arrResult[0] = String.valueOf(dayOfWeek);
		arrResult[1] = arrDias[dayOfWeek - 1];

//		logger.debug("Dia: " + arrResult[0] + " - " + arrResult[1]);

		return arrResult;
	}

	/**
	 * Gets the dias entre fechas.
	 *
	 * @param fechaInicio
	 *            the fecha inicio
	 * @param fechaFinal
	 *            the fecha final
	 * @return the dias entre fechas
	 */
	public static int getDiasEntreFechas(long fechaInicio, long fechaFinal) {
//		logger.debug("fechaInicio: " + fechaInicio);
//		logger.debug("fechaFinal: " + fechaFinal);

		long miliDia = 86400000;

		int numDias = Math.abs((int) ((fechaInicio - fechaFinal) / miliDia));
//		logger.debug("numDias: " + numDias);

		return numDias + 1;
	}

	public static int getDiaFestivosEntreFechas(long fechaInicio, long fechaFinal, List<String> listDiasFestivos) {
//		logger.debug("fechaInicio: " + fechaInicio);
//		logger.debug("fechaFinal: " + fechaFinal);
//		logger.debug("listDiasFestivos {}: \n" + listDiasFestivos);

		int contDiasFest = 0;
		for (String diaFestivo : listDiasFestivos) {
			long numFecha = Fechas.getDateInMiliSeconds(diaFestivo, "dd-MM-yyyy");
			if (numFecha >= fechaInicio && numFecha <= fechaFinal)
				contDiasFest++;
		}

		return contDiasFest;
	}

	public static int getDiasEntreFechasSinDiasDescanso(String fechaInicio, String fechaFinal,
			List<Integer> listDiasDescanso) {
//		logger.debug("getDiasEntreFechasSinDiasDescanso");
//		logger.debug("fechaInicio: " + fechaInicio);
//		logger.debug("fechaFinal: " + fechaFinal);
//		logger.debug("listDiasDescanso: " + listDiasDescanso);

		Collections.sort(listDiasDescanso);
		String stDiasDesc = "";
		for (Integer integer : listDiasDescanso) {
			stDiasDesc += integer;
		}
//		logger.info("stDiasDesc: " + stDiasDesc);

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		List<String> dates = new ArrayList<String>();
		Calendar cini = Calendar.getInstance();
		int diffDays = 0;
		try {
			cini.setTime(formatter.parse(fechaInicio));

			Calendar cfin = Calendar.getInstance();
			cfin.setTime(formatter.parse(fechaFinal));
			while (cfin.after(cini) || cfin.equals(cini)) {
//				logger.debug("cini. " + cini.get(Calendar.DAY_OF_WEEK));
//				logger.debug("cfin. " + cfin.get(Calendar.DAY_OF_WEEK));
				switch (stDiasDesc) {
				case "06":
					if (cini.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY
							&& cini.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
						dates.add(formatter.format(cini.getTime()));
						diffDays++;
					}
					break;
				case "0":
					if (cini.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
						dates.add(formatter.format(cini.getTime()));
						diffDays++;
					}
					break;
				case "01":
					if (cini.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY
							&& cini.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
						dates.add(formatter.format(cini.getTime()));
						diffDays++;
					}
					break;
				case "12":
					if (cini.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY
							&& cini.get(Calendar.DAY_OF_WEEK) != Calendar.TUESDAY) {
						dates.add(formatter.format(cini.getTime()));
						diffDays++;
					}
					break;
				case "23":
					if (cini.get(Calendar.DAY_OF_WEEK) != Calendar.TUESDAY
							&& cini.get(Calendar.DAY_OF_WEEK) != Calendar.WEDNESDAY) {
						dates.add(formatter.format(cini.getTime()));
						diffDays++;
					}
					break;
				case "34":
					if (cini.get(Calendar.DAY_OF_WEEK) != Calendar.WEDNESDAY
							&& cini.get(Calendar.DAY_OF_WEEK) != Calendar.THURSDAY) {
						dates.add(formatter.format(cini.getTime()));
						diffDays++;
					}
					break;
				case "45":
					if (cini.get(Calendar.DAY_OF_WEEK) != Calendar.THURSDAY
							&& cini.get(Calendar.DAY_OF_WEEK) != Calendar.FRIDAY) {
						dates.add(formatter.format(cini.getTime()));
						diffDays++;
					}
					break;
				case "56":
					if (cini.get(Calendar.DAY_OF_WEEK) != Calendar.FRIDAY
							&& cini.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
						dates.add(formatter.format(cini.getTime()));
						diffDays++;
					}
				default:
					if (cini.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY
							&& cini.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
						dates.add(formatter.format(cini.getTime()));
						diffDays++;
					}
					break;
				}
				cini.add(Calendar.DATE, 1);
			}
		} catch (ParseException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
//		logger.info("diffDays: " + diffDays);
		return diffDays;

	}

	public static Long getMilisegundosSistema() {
		Long miliseconds = System.currentTimeMillis();
//		logger.debug("miliseconds: " + miliseconds);
		return miliseconds;
	}

	public static Long getDifSeconds(Long oper1, Long oper2) {
//		logger.debug("oper1: " + oper1);
//		logger.debug("oper2: " + oper2);
		Long seconds = (oper2-oper1)/1000;
//		logger.debug("segundos transcurridos: " + seconds + "seg.");
		return seconds;
	}

	public static Integer getAniosAntiguedadActual(String fechaInput) {
//		logger.debug("Fecha: " + fechaInput);

		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
		Date fecha = new Date();
		String fechaFormateadaActual = formatoFecha.format(fecha);
//		logger.debug("Fecha actual: " + fechaFormateadaActual);

		String[] arrayFechaActual = fechaFormateadaActual.split("-");
		int yearActual = Integer.parseInt(arrayFechaActual[0]);
		int monthActual = Integer.parseInt(arrayFechaActual[1]);// yyyy/mm/dd
		int dayOfMonthActual = Integer.parseInt(arrayFechaActual[2]);
//		logger.debug("fecha obtenida actual: " + dayOfMonthActual + "-" + monthActual + "-" + yearActual);

		String[] arrayFechaInput = fechaInput.split("-");
		int yearInput = Integer.parseInt(arrayFechaInput[0]);
		int monthInput = Integer.parseInt(arrayFechaInput[1]);// yyyy/mm/dd
		String[] arrDia = arrayFechaInput[2].split(" ");
		int dayOfMonthInput = Integer.parseInt(arrDia[0]);
//		logger.debug("fecha obtenida input: " + dayOfMonthInput + "-" + monthInput + "-" + yearInput);

		Integer antiguedad = yearActual - yearInput;
		if(monthInput > monthActual) {
			antiguedad--;
		}else if(monthInput == monthActual) {
			if(dayOfMonthInput > dayOfMonthActual)
				antiguedad--;
		}

//		logger.debug("antiguedad: " + antiguedad);
		return antiguedad;
	}

	/**
	 *
	 * @param fechaInput
	 * la fecha de entrada debe estar en formato yyyy-MM-dd
	 * @return
	 */
	public static XMLGregorianCalendar obtenerFechaXMLGregorianCalendar(String fechaInput) {
		logger.debug("fechaInput: " + fechaInput);
		System.out.println("fechaInput: " + fechaInput);


		/*
		DateFormat format = new SimpleDateFormat("yyyyMMdd");
		XMLGregorianCalendar xmlGregCal = null;
		Date date;

		try {
//			date = format.parse("20140424");
			date = format.parse(fechaInput);
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(date);
			xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			logger.debug("xmlGregCal: " + xmlGregCal);
			System.out.println("xmlGregCal: " + xmlGregCal);
		} catch (ParseException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return xmlGregCal;
		*/



		XMLGregorianCalendar result = null;
		try {
			result = DatatypeFactory.newInstance()
				    .newXMLGregorianCalendar(fechaInput);
			logger.debug("Fecha salida: " + result);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return result;

	}

	public static String obtenerDiaMaximoDeMes(String fechaInput, String formatoEntrada, String formatoSalida) {
		SimpleDateFormat formatStart = new SimpleDateFormat(formatoEntrada);
		SimpleDateFormat formatEnd = new SimpleDateFormat(formatoSalida, LOCALE_MX);
//		logger.debug("******************************************************************");

		try {
//			logger.debug("fechaInput:" + fechaInput);
			Date fechaFormat = formatStart.parse(fechaInput);
			Calendar cal = Calendar.getInstance();
			cal.setTime(fechaFormat);
			cal.add(Calendar.DAY_OF_YEAR, 0);
			String diaMax = String.valueOf(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
//			logger.debug("dia max: " + diaMax);

			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH); // Jan = 0, dec = 11
			int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
//			logger.debug("year: " + year);
//			logger.debug("month: " + month);
//			logger.debug("dayOfMonth: " + dayOfMonth);

			cal.set(year, month, Integer.parseInt(diaMax));
			Date fecha = cal.getTime();
			String fechaFormateada = formatEnd.format(fecha);
//			logger.debug("fechaFormateada: " + fechaFormateada);

//			logger.debug("******************************************************************");

			return fechaFormateada;
		} catch (ParseException e) {
			logger.error(
					"Ha sucedido una Excepcion en Fechas --> obtenerDiaMaximoDeMes(): " + e.getMessage());
		}
		return null;
	}

	public static Integer obtenerDiaMaximoDeMesInteger(String fechaInput, String formatoEntrada) {
		SimpleDateFormat formatStart = new SimpleDateFormat(formatoEntrada);

		try {
//			logger.debug("fechaInput:" + fechaInput);
			Date fechaFormat = formatStart.parse(fechaInput);
			Calendar cal = Calendar.getInstance();
			cal.setTime(fechaFormat);
			cal.add(Calendar.DAY_OF_YEAR, 0);
			Integer diaMax = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
//			logger.debug("dia max: " + diaMax);
			return diaMax;
		} catch (ParseException e) {
			logger.error(
					"Ha sucedido una Excepcion en Fechas --> obtenerDiaMaximoDeMes(): " + e.getMessage());
		}
		return null;
	}

	/**
	 *
	 * @param fechaInicio, fecha a validar si es dia habil
	 * @param formatoFecha, formato de fecha de fechaInicio
	 * @param listDiasDescanso, lista de los dias de descanso de la semana
	 * 0-Domingo
	 * 1-Lunes
	 * 2-Martes
	 * 3-Miercoles
	 * 4-Jueves
	 * 5-Viernes
	 * 6-Sabado
	 * @return
	 */
	public static int esDiaHabil(String fechaInicio, String formatoFecha, List<Integer> listDiasDescanso) {
//		logger.debug("esDiaHabil");
//		logger.debug("fechaInicio: " + fechaInicio);
//		logger.debug("formatoFecha: " + formatoFecha);
//		logger.debug("listDiasDescanso: " + listDiasDescanso);

		Collections.sort(listDiasDescanso);
		String stDiasDesc = "";
		for (Integer integer : listDiasDescanso) {
			stDiasDesc += integer;
		}
//		logger.debug("stDiasDesc: " + stDiasDesc);

		SimpleDateFormat formatter = new SimpleDateFormat(formatoFecha);
		Calendar cini = Calendar.getInstance();
		int diffDays = 0;
		try {
			cini.setTime(formatter.parse(fechaInicio));

//			logger.debug("cini. " + cini.get(Calendar.DAY_OF_WEEK));
			switch (stDiasDesc) {
			case "06":
				if (cini.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY
						&& cini.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
					diffDays++;
				}
				break;
			case "0":
				if (cini.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
					diffDays++;
				}
				break;
			case "01":
				if (cini.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY
						&& cini.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
					diffDays++;
				}
				break;
			case "12":
				if (cini.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY
						&& cini.get(Calendar.DAY_OF_WEEK) != Calendar.TUESDAY) {
					diffDays++;
				}
				break;
			case "23":
				if (cini.get(Calendar.DAY_OF_WEEK) != Calendar.TUESDAY
						&& cini.get(Calendar.DAY_OF_WEEK) != Calendar.WEDNESDAY) {
					diffDays++;
				}
				break;
			case "34":
				if (cini.get(Calendar.DAY_OF_WEEK) != Calendar.WEDNESDAY
						&& cini.get(Calendar.DAY_OF_WEEK) != Calendar.THURSDAY) {
					diffDays++;
				}
				break;
			case "45":
				if (cini.get(Calendar.DAY_OF_WEEK) != Calendar.THURSDAY
						&& cini.get(Calendar.DAY_OF_WEEK) != Calendar.FRIDAY) {
					diffDays++;
				}
				break;
			case "56":
				if (cini.get(Calendar.DAY_OF_WEEK) != Calendar.FRIDAY
						&& cini.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
					diffDays++;
				}
			default:
				if (cini.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY
						&& cini.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
					diffDays++;
				}
				break;
			}
		} catch (ParseException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
//		logger.debug("diffDays: " + diffDays);
		return diffDays;
	}

	public static Boolean esDiaSinBanco(String fechaInicio, String formatoFecha, List<String> listDiasSinBanco) {
//		logger.debug("Fechas -> esDiaSinBanco()");
//		logger.debug("fechaInicio: " + fechaInicio);
//		logger.debug("formatoFecha: " + formatoFecha);
//		logger.debug("listDiasSinBanco: " + listDiasSinBanco);

		if(!listDiasSinBanco.isEmpty()) {

			for (String diaSinBanco : listDiasSinBanco) {
				diaSinBanco = fechaFormateadaStringtoString(diaSinBanco, "yyyy-MM-dd", formatoFecha);
//				logger.debug("diaSinBanco: " + diaSinBanco);
				if(diaSinBanco.equals(fechaInicio))
					return true;
			}

		}
		return false;
	}

	public String obtenerPrimerDiaHabilconDiaSinBanco(String fechaInicio, String formatoFecha,
			List<Integer> listDiasDescanso, List<String> listDiasSinBanco, int horaDeposito) {
		logger.debug("Fechas -> obtenerPrimerDiaHabilconDiaSinBanco()");
		logger.debug("fechaInicio: " + fechaInicio);
		logger.debug("formatoFecha: " + formatoFecha);
		logger.debug("listDiasDescanso: " + listDiasDescanso);
		logger.debug("listDiasSinBanco: " + listDiasSinBanco);
		logger.debug("horaDeposito: " + horaDeposito);

		String fechaMaxMes = obtenerDiaMaximoDeMes(fechaInicio, formatoFecha, formatoFecha);
		String[] arrFechaMax = fechaMaxMes.split("-");
		int diaMax = Integer.parseInt(arrFechaMax[2]);

		String primerDia = Fechas.sumaDiasFechaStringtoString(fechaMaxMes, formatoFecha, 1);

		String[] arrFechaSol = fechaInicio.split("-");
		int diaFechaHabil = Integer.parseInt(arrFechaSol[2]);

//		logger.debug("-------------------------------> fechaInicio: " + primerDia);
		fechaInicio= primerDia;

		Calendar calendario = new GregorianCalendar();
		int lstHoraEvento = calendario.get(Calendar.HOUR_OF_DAY);
		int lstMinutoEvento = calendario.get(Calendar.MINUTE);

		/****VARIABLE DE PREUBA QUITAR**************************/
//		ZFechaAnticipoDto pruebaDto = zFechaAnticipoDAOImpl.getFechaDepPorExp("1");
//		if(pruebaDto != null) {
//			lstHoraEvento = Integer.parseInt(pruebaDto.getHoraDeposito().substring(0, 2));
//			lstMinutoEvento = Integer.parseInt(pruebaDto.getHoraDeposito().substring(3, 5));
//		}
		/****VARIABLE DE PREUBA QUITAR**************************/

		logger.debug("diaMax: " + diaMax);
		logger.debug("diaFechaHabil: " + diaFechaHabil);
		logger.debug("lstHoraEvento: " + lstHoraEvento);
		logger.debug("horaDeposito: " + horaDeposito);
		logger.debug("lstMinutoEvento: " + lstMinutoEvento);

		fechaInicio = getFechaDepositoHabil(listDiasDescanso, fechaInicio, formatoFecha, listDiasSinBanco);

		if(diaMax == diaFechaHabil && lstHoraEvento>=horaDeposito) {
			logger.debug("Es ultimo dia del mes y posterior a las 13 hrs.");
			fechaInicio = sumaDiasFechaStringtoString(fechaInicio, formatoFecha, 1);
			fechaInicio = getFechaDepositoHabil(listDiasDescanso, fechaInicio, formatoFecha, listDiasSinBanco);
		}
		logger.debug("fechaInicio: " + fechaInicio);
		return fechaInicio;

		/*
		while(true) {
//			logger.debug("-------------------------------> fechaInicio: " + primerDia);
//			fechaInicio= primerDia;
			int diaHabil = 0;
			Boolean boDiaSinBanco = false;
			if(listDiasDescanso != null)
				diaHabil = esDiaHabil(fechaInicio, formatoFecha, listDiasDescanso);

			if(listDiasSinBanco != null)
				boDiaSinBanco = esDiaSinBanco(fechaInicio, formatoFecha, listDiasSinBanco);

//			logger.debug("diaHabil: " + diaHabil);
//			logger.debug("boDiaSinBanco: " + boDiaSinBanco);

			if(diaHabil > 0 && boDiaSinBanco == false)
				return fechaInicio;

			fechaInicio = sumaDiasFechaStringtoString(fechaInicio, formatoFecha, 1);
		}*/

	}

	public static String getFechaDepositoHabil(List<Integer> listDiasDescanso, String fechaInicio, String formatoFecha,
			List<String> listDiasSinBanco) {
		logger.debug("getFechaDepositoHabil()");
		while(true) {
//			logger.debug("-------------------------------> fechaInicio: " + primerDia);
//			fechaInicio= primerDia;
			int diaHabil = 0;
			Boolean boDiaSinBanco = false;
			if(listDiasDescanso != null)
				diaHabil = esDiaHabil(fechaInicio, formatoFecha, listDiasDescanso);

			if(listDiasSinBanco != null)
				boDiaSinBanco = esDiaSinBanco(fechaInicio, formatoFecha, listDiasSinBanco);

//			logger.debug("diaHabil: " + diaHabil);
//			logger.debug("boDiaSinBanco: " + boDiaSinBanco);

			if(diaHabil > 0 && boDiaSinBanco == false)
				return fechaInicio;

			fechaInicio = sumaDiasFechaStringtoString(fechaInicio, formatoFecha, 1);
		}
	}

	public static String obtenerUltimoDiaHabilPermitido(String fechaInicio, String formatoEntrada, String formatoSalida,
			Integer diasPermitidos, List<Integer> listDiasDescanso, List<String> listDiasSinBanco) {
//		logger.debug("obtenerUltimoDiaHabilPermitido");
//		logger.debug("fechaInicio: " + fechaInicio);
//		logger.debug("formatoEntrada: " + formatoEntrada);
//		logger.debug("formatoSalida: " + formatoSalida);
//		logger.debug("diasPermitidos: " + diasPermitidos);
//		logger.debug("listDiasDescanso: " + listDiasDescanso);
//		logger.debug("listDiasSinBanco: " + listDiasSinBanco);

		diasPermitidos+=1;

		String diaMaxMes = obtenerDiaMaximoDeMes(fechaInicio, formatoEntrada, formatoEntrada);
		int numDiaHabil = 0;
		String fechaFinal = null;
		fechaInicio = diaMaxMes;

		while (numDiaHabil < diasPermitidos) {
//			logger.debug("fechaInicio : " + fechaInicio);
			Integer diaHabil = esDiaHabil(fechaInicio, formatoEntrada, listDiasDescanso);
			Boolean boDiaSinBanco = esDiaSinBanco(fechaInicio, formatoEntrada, listDiasSinBanco);
			if(boDiaSinBanco == false)
				numDiaHabil+= diaHabil;
//			logger.debug("numDiaHabil : " + numDiaHabil);
			fechaFinal = fechaInicio;
			fechaInicio = sumaDiasFechaStringtoString(fechaInicio, formatoEntrada, -1);
//			logger.debug("--------------------------------------------------------------------------------");
		}
//		logger.debug("fechaInicioFinal : " + fechaFinal);
		fechaFinal = fechaFormateadaStringtoString(fechaFinal, formatoEntrada, formatoSalida);
//		logger.debug("fechaFinal : " + fechaFinal);
		return fechaFinal;
	}

	public static Integer obtenerQuincenaAnio(String fechaInput, String formatoFecha) {
//		logger.debug("Fechas -> obtenerQuincenaAnio()");
//		logger.debug("fechaInput: " + fechaInput);
//		logger.debug("formatoFecha: " + formatoFecha);

		SimpleDateFormat formatStart = new SimpleDateFormat(formatoFecha);

		try {
//			logger.debug("fechaInput:" + fechaInput);
			Date fechaFormat = formatStart.parse(fechaInput);
			Calendar cal = Calendar.getInstance();
			cal.setTime(fechaFormat);
			cal.add(Calendar.DAY_OF_YEAR, 0);
			String diaMax = String.valueOf(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
//			logger.debug("dia max: " + diaMax);

			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH); // Jan = 0, dec = 11
			int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
//			logger.debug("year: " + year);
//			logger.debug("month: " + month);
//			logger.debug("dayOfMonth: " + dayOfMonth);

			Integer quincenaMes = 1;
			Integer quincenaAnual = 0;
			if(dayOfMonth >= 15)
				quincenaMes+=1;

			quincenaAnual = (month *2) + quincenaMes;
//			logger.debug("quincenaAnual:" + quincenaAnual);
			return quincenaAnual;
		} catch (ParseException e) {
			logger.error(
					"Ha sucedido una Excepcion en Fechas --> obtenerQuincenaAnio(): " + e.getMessage());
		}
		return null;
	}

	public static Map<String, String> obtenerQuincenaPorPeriodoAnio(Integer periodo, Integer anio, String formatoSalida) {
//		logger.debug("Fechas -> obtenerQuincenaPorPeriodoAnio()");
//		logger.debug("periodo: " + periodo);
//		logger.debug("anio: " + anio);
//		logger.debug("formatoSalida: " + formatoSalida);

		SimpleDateFormat formatStart = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat formatEnd = new SimpleDateFormat(formatoSalida, LOCALE_MX);

		try {

			String mes = null;
			String fechaInicio = null;
			String fechaFinal = null;
			if(periodo%2 != 0) {
				mes = (periodo/2 + 1) + "";
				mes = mes.length() > 1 ? mes : "0" + mes;
				fechaInicio = "01" + "-" + mes + "-" + anio;
				fechaFinal = "15" + "-" + mes + "-" + anio;
			}
			else {
				mes = (periodo/2) + "";
				mes = mes.length() > 1 ? mes : "0" + mes;
				fechaInicio = "16" + "-" + mes + "-" + anio;

				Date fechaFormat = formatStart.parse(fechaInicio);
				Calendar cal = Calendar.getInstance();
				cal.setTime(fechaFormat);
				cal.add(Calendar.DAY_OF_YEAR, 0);
				String diaMax = String.valueOf(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
				diaMax = diaMax.length() > 1 ? diaMax : "0" + diaMax;
				fechaFinal = diaMax + "-" + mes + "-" + anio;
			}

			fechaInicio = fechaFormateadaStringtoString(fechaInicio, "dd-MM-yyyy", formatoSalida);
			fechaFinal = fechaFormateadaStringtoString(fechaFinal, "dd-MM-yyyy", formatoSalida);

			Map<String, String> mapReturn = new HashMap<>();
			mapReturn.put("fechaInicio", fechaInicio);
			mapReturn.put("fechaFinal", fechaFinal);
//			logger.debug("mapReturn {}: \n" + mapReturn);
			return mapReturn;
		} catch (ParseException e) {
			logger.error(
					"Ha sucedido una Excepcion en Fechas --> obtenerQuincenaPorPeriodoAnio(): " + e.getMessage());
		}
		return null;
	}

}
