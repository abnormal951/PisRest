package com.hitss.pis.rest.webservices.consume;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.util.PropertiesBean;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF022.DTZTMHRPYES027;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF022.DTZTMHRPYF022Request;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF022.DTZTMHRPYF022Request.TENTRADA;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF022.DTZTMHRPYF022Response;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF022.SIZTMHRPYF022;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF022.SIZTMHRPYF022Service;

@Component
public class ConsumeWebServiceSI_ZTMHRPYF022 {

	private static final Logger logger = LogManager.getLogger(ConsumeWebServiceSI_ZTMHRPYF022.class);

	@Autowired
	private PropertiesBean propertiesBean;

	private static URL localizacion = null;

	private static TENTRADA entrada = new TENTRADA();

	/**
	 * @param args
	 * @throws MalformedURLException
	 */
	public DTZTMHRPYF022Response respuestaSIZTMHRPYF022(String expSolicita, String fechaRef, String idMovimiento,
			TENTRADA entrada) throws MalformedURLException {
		logger.debug("ConsumeWebServiceSI_ZTMHRPYF022 -> respuestaSIZTMHRPYF022(...)");
		logger.info("expSolicita: {}", expSolicita);
		logger.info("fechaRef: {}", fechaRef);
		logger.info("idMovimiento: {}", idMovimiento);
		logger.info("entrada: {}", entrada);

		String localizacionWsdl = propertiesBean.getPathPi() + propertiesBean.getPathC2PrestamoV1();
		logger.debug("Ruta del PI_C2_PRESTAMO: {}", localizacionWsdl);

		String servicioConsumo = propertiesBean.getUrlC2PrestamoV1();
		logger.debug("URL DE SERVICIO DE CONSUMO: {}", servicioConsumo);
		String usuario = propertiesBean.getUsuario();
		String password = propertiesBean.getPassword();

		localizacion = new URL(localizacionWsdl);

		SIZTMHRPYF022Service servicio;
		servicio = new SIZTMHRPYF022Service(localizacion);

		SIZTMHRPYF022 conector;
		conector = servicio.getSIZTMHRPYF022Port();

		BindingProvider bp = (BindingProvider) conector;

		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, usuario);
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servicioConsumo);

		DTZTMHRPYF022Response respuesta;
		respuesta = null;

		DTZTMHRPYF022Request solicitud;
		solicitud = new DTZTMHRPYF022Request();

		solicitud.setTENTRADA(entrada);

		solicitud.setEXPSOLICITA(expSolicita);
		solicitud.setFECHAREF(fechaRef);
		solicitud.setIDMOVIMIENTO(idMovimiento);

		respuesta = conector.siZTMHRPYF022(solicitud);

		return respuesta;

	}

	public static void generaEntrada(String pernr, String subty) {
		DTZTMHRPYES027 item = new DTZTMHRPYES027();
		item.setPERNR(pernr);
		item.setSUBTY(subty);
		entrada.setItem(item);
	}

}