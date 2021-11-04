package com.hitss.pis.rest.webservices.consume;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.util.AnticiposConstantes;
import com.hitss.pis.rest.util.PropertiesBean;
import com.hitss.pis.rest.webservices.stubs.InfoT_PA9990_V2.DTTENTRADA;
import com.hitss.pis.rest.webservices.stubs.InfoT_PA9990_V2.DTTENTRADA.Item;
import com.hitss.pis.rest.webservices.stubs.InfoT_PA9990_V2.DTZTMHRPIF002Request;
import com.hitss.pis.rest.webservices.stubs.InfoT_PA9990_V2.DTZTMHRPIF002Response;
import com.hitss.pis.rest.webservices.stubs.InfoT_PA9990_V2.SIZTMHRPIF002;
import com.hitss.pis.rest.webservices.stubs.InfoT_PA9990_V2.SIZTMHRPIF002Service;


@Component
public class ConsumeWebServiceAnticipos9990V2 {

	private static final Logger logger = LogManager.getLogger(ConsumeWebServiceAnticipos9990V2.class);


	@Autowired
	private PropertiesBean propertiesBean;
	
	private static URL localizacion = null;

	private static DTTENTRADA entrada = new DTTENTRADA();

	/**
	 * @param args
	 * @throws MalformedURLException
	 */
	public DTZTMHRPIF002Response respuestaAnticipos(String sociedad, String expSolicita,  DTTENTRADA entrada) throws MalformedURLException {
		logger.debug("ConsumeWebServiceAnticipos9990V2 -> respuestaDatoMaestro(...)");

		String localizacionWsdl =  propertiesBean.getPathPi() + propertiesBean.getPathInfoTPA9990V2();
		logger.debug("Ruta del PI : {}", localizacionWsdl);

		String servicioConsumo = propertiesBean.getUrlInfoTPA9990V2();
		logger.debug("URL DE SERVICIO DE CONSUMO: {}", servicioConsumo);
		String usuario = propertiesBean.getUsuario();
		String password = propertiesBean.getPassword();

		localizacion = new URL(localizacionWsdl);

		SIZTMHRPIF002Service servicio;
		servicio = new SIZTMHRPIF002Service(localizacion);

		SIZTMHRPIF002 conector;
		conector = servicio.getSIZTMHRPIF002Port();

		BindingProvider bp = (BindingProvider) conector;

		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, usuario);
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servicioConsumo);

		DTZTMHRPIF002Response respuesta;
		respuesta = null;

		DTZTMHRPIF002Request solicitud;
		solicitud = new DTZTMHRPIF002Request();

		solicitud.setTENTRADA(entrada);

		solicitud.setSociedad(sociedad);
		solicitud.setExpSolicita(expSolicita);
		solicitud.setIDMOVIMIENTO("");
		solicitud.setSPRPS("");
		solicitud.setSUBTY("");
		solicitud.setENDDA(AnticiposConstantes.ENDDA);

		respuesta = conector.siZTMHRPIF002(solicitud);

		return respuesta;

	}

	public static void generaEntrada(String pernr) {
		Item item = new Item();
		item.setPERNR(pernr);
		entrada.setItem(item);

	}

}
