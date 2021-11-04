package com.hitss.pis.rest.webservices.consume;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.util.PropertiesBean;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF021_V2.DTZTMHRPYES024;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF021_V2.DTZTMHRPYF021Request;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF021_V2.DTZTMHRPYF021Request.TENTRADA;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF021_V2.DTZTMHRPYF021Response;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF021_V2.SIZTMHRPYF021;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF021_V2.SIZTMHRPYF021Service;

@Component
public class ConsumeWebServiceSIZTMHRPYF021 {

	private static final Logger logger = LogManager.getLogger(ConsumeWebServiceSIZTMHRPYF021.class);

	@Autowired
	private PropertiesBean propertiesBean;

	private static URL localizacion = null;

	private static TENTRADA entrada = new TENTRADA();

	/**
	 * @param args
	 * @throws MalformedURLException
	 */
	public DTZTMHRPYF021Response respuestaSIZTMHRPYF021(String expSolicita, String idMovimiento, TENTRADA entrada)
			throws MalformedURLException {
		logger.debug("ConsumeWebServiceSIZTMHRPYF021 -> respuestaSIZTMHRPYF021(...)");
		logger.info("expSolicita: {}", expSolicita);
		logger.info("idMovimiento: {}", idMovimiento);
		logger.debug("entrada: {}", entrada.getItem().get(0));

		String localizacionWsdl = propertiesBean.getPathPi() + propertiesBean.getPathC1PrestamoV1();
		String servicioConsumo = propertiesBean.getUrlC1PrestamoV1();
		String usuario = propertiesBean.getUsuario();
		String password = propertiesBean.getPassword();

		localizacion = new URL(localizacionWsdl);

		SIZTMHRPYF021Service servicio;
		servicio = new SIZTMHRPYF021Service(localizacion);

		SIZTMHRPYF021 conector;
		conector = servicio.getSIZTMHRPYF021Port();

		BindingProvider bp = (BindingProvider) conector;

		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, usuario);
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servicioConsumo);

		DTZTMHRPYF021Response respuesta;
		respuesta = null;

		DTZTMHRPYF021Request solicitud;
		solicitud = new DTZTMHRPYF021Request();

		solicitud.setTENTRADA(entrada);

		solicitud.setEXPSOLICITA(expSolicita);
		solicitud.setIDMOVIMIENTO("");

		respuesta = conector.siZTMHRPYF021(solicitud);

		return respuesta;

	}

	public static void generaEntrada(String pernr, String fechaRef) {
		DTZTMHRPYES024 item = new DTZTMHRPYES024();
		item.setPERNR(pernr);
		item.setFECHAREF(fechaRef);
		entrada.setItem(item);
	}

}
