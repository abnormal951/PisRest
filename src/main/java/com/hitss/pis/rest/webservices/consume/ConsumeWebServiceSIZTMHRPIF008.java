package com.hitss.pis.rest.webservices.consume;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.util.PropertiesBean;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF008.DTZTMHRPIE007;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF008.DTZTMHRPIF008Request;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF008.DTZTMHRPIF008Request.TENTRADA;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF008.DTZTMHRPIF008Response;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF008.SIZTMHRPIF008;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF008.SIZTMHRPIF008Service;

@Component
public class ConsumeWebServiceSIZTMHRPIF008 {

	@Autowired
	private PropertiesBean propertiesBean;

	private static URL localizacion = null;

	private static TENTRADA entrada = new TENTRADA();

	/**
	 * @param args
	 * @throws MalformedURLException
	 */
	public DTZTMHRPIF008Response respuestaSIZTMHRPIF008(String expSolicita, TENTRADA entrada)
			throws MalformedURLException {

		String localizacionWsdl = propertiesBean.getPathPi() + propertiesBean.getPathZTMHRPIF008();
		String servicioConsumo = propertiesBean.getUrlZTMHRPIF008();
		String usuario = propertiesBean.getUsuario();
		String password = propertiesBean.getPassword();

		localizacion = new URL(localizacionWsdl);

		SIZTMHRPIF008Service servicio;
		servicio = new SIZTMHRPIF008Service(localizacion);

		SIZTMHRPIF008 conector;
		conector = servicio.getSIZTMHRPIF008Port();

		BindingProvider bp = (BindingProvider) conector;

		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, usuario);
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servicioConsumo);

		DTZTMHRPIF008Response respuesta;
		respuesta = null;

		DTZTMHRPIF008Request solicitud;
		solicitud = new DTZTMHRPIF008Request();

		solicitud.setTENTRADA(entrada);

		solicitud.setEXPSOLICITA(expSolicita);
		solicitud.setIDMOVIMIENTO("");

		respuesta = conector.siZTMHRPIF008(solicitud);

		return respuesta;

	}

	public static void generaEntrada(String pernr) {
		DTZTMHRPIE007 item = new DTZTMHRPIE007();
		item.setPERNR(pernr);
		entrada.setItem(item);
	}

}
