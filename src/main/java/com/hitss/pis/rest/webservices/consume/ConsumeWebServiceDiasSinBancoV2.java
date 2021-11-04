package com.hitss.pis.rest.webservices.consume;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.util.PropertiesBean;
import com.hitss.pis.rest.webservices.stubs.PI_DIASSINBANCO_V2.DTZTMHRPIF003Request;
import com.hitss.pis.rest.webservices.stubs.PI_DIASSINBANCO_V2.DTZTMHRPIF003Response;
import com.hitss.pis.rest.webservices.stubs.PI_DIASSINBANCO_V2.SIZTMHRPIF003;
import com.hitss.pis.rest.webservices.stubs.PI_DIASSINBANCO_V2.SIZTMHRPIF003Service;

@Component
public class ConsumeWebServiceDiasSinBancoV2 {

	private static final Logger logger = LogManager.getLogger(ConsumeWebServiceDiasSinBancoV2.class);

	@Autowired
	private PropertiesBean propertiesBean;

	private static URL localizacion = null;


	/**
	 * @param args
	 * @return
	 * @throws MalformedURLException
	 */
	public DTZTMHRPIF003Response respuestaBancos(String anioIni, String anioFin) throws MalformedURLException {
		logger.debug("ConsumeWebServiceDiasSinBancoV2 -> respuestaBancos(...)");


		String localizacionWsdl = propertiesBean.getPathPi() + propertiesBean.getPathDiasSinBancoV2();
		logger.debug("Ruta del PI dias sin banco: {}", localizacionWsdl);

		String servicioConsumo = propertiesBean.getUrlDiasSinBancoV2();
		logger.debug("URL DE SERVICIO DE CONSUMO: {}", servicioConsumo);
		String usuario = propertiesBean.getUsuario();
		String password = propertiesBean.getPassword();


		localizacion = new URL(localizacionWsdl);

		SIZTMHRPIF003Service servicio;
		servicio = new SIZTMHRPIF003Service(localizacion);

		SIZTMHRPIF003 conector;
		conector = servicio.getSIZTMHRPIF003Port();

		BindingProvider bp = (BindingProvider) conector;

		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, usuario);
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servicioConsumo);

		DTZTMHRPIF003Response respuesta;
		respuesta = null;

		DTZTMHRPIF003Request solicitud;
		solicitud = new DTZTMHRPIF003Request();

		solicitud.setANIOINI(anioIni);
		solicitud.setANIOFIN(anioFin);

		respuesta = conector.siZTMHRPIF003(solicitud);

		return respuesta;
	}

}
