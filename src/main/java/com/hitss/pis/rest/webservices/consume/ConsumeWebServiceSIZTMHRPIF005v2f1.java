package com.hitss.pis.rest.webservices.consume;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.util.PropertiesBean;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF005_v2_f1.DTZTMHRPIE003;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF005_v2_f1.DTZTMHRPIF005Request;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF005_v2_f1.DTZTMHRPIF005Request.TENTRADA;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF005_v2_f1.DTZTMHRPIF005Response;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF005_v2_f1.SIZTMHRPIF005;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF005_v2_f1.SIZTMHRPIF005Service;


@Component
public class ConsumeWebServiceSIZTMHRPIF005v2f1 {

	private static final Logger logger = LogManager.getLogger(ConsumeWebServiceDatoMaestro.class);

	@Autowired
	private PropertiesBean propertiesBean;
	
	private static URL localizacion = null;

	private static TENTRADA entrada = new TENTRADA();

	/**
	 * @param args
	 * @throws MalformedURLException
	 */
	public DTZTMHRPIF005Response respuestaSIZTMHRPIF005(String expSolicita, String pernr, TENTRADA entrada)
			throws MalformedURLException {
		logger.debug("ConsumeWebServiceDatoMaestro -> respuestaDatoMaestro(...)");

		String localizacionWsdl = propertiesBean.getPathPi() + propertiesBean.getPathZHRATT010V2();
		logger.debug("Ruta del PI ZHRATT010: {}", localizacionWsdl);

		String servicioConsumo = propertiesBean.getUrlZHRATT010V2();
		logger.debug("URL DE SERVICIO DE CONSUMO: {}", servicioConsumo);
		String usuario = propertiesBean.getUsuario();
		String password = propertiesBean.getPassword();


		localizacion = new URL(localizacionWsdl);

		SIZTMHRPIF005Service servicio;
		servicio = new SIZTMHRPIF005Service(localizacion);

		SIZTMHRPIF005 conector;
		conector = servicio.getSIZTMHRPIF005Port();

		BindingProvider bp = (BindingProvider) conector;

		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, usuario);
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servicioConsumo);

		DTZTMHRPIF005Response respuesta;
		respuesta = null;

		DTZTMHRPIF005Request solicitud;
		solicitud = new DTZTMHRPIF005Request();

		solicitud.setTENTRADA(entrada);

		solicitud.setEXPSOLICITA(expSolicita);
		solicitud.setIDMOVIMIENTO("");
		solicitud.setBLOQUEONOM("");
		solicitud.setCANDOC("");
		solicitud.setINDCARGA("");
		solicitud.setTIPFORM("");

		respuesta = conector.siZTMHRPIF005(solicitud);

		return respuesta;

	}

	public static void generaEntrada(String pernr) {
		DTZTMHRPIE003 item = new DTZTMHRPIE003();
		item.setPERNR(pernr);
		entrada.setItem(item);
	}

}
