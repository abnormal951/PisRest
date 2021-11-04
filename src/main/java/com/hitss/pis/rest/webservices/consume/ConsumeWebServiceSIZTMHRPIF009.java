package com.hitss.pis.rest.webservices.consume;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.util.PropertiesBean;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF009.DTZTMHRPIE008;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF009.DTZTMHRPIF009Request;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF009.DTZTMHRPIF009Request.TENTRADA;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF009.DTZTMHRPIF009Response;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF009.SIZTMHRPIF009;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF009.SIZTMHRPIF009Service;

@Component
public class ConsumeWebServiceSIZTMHRPIF009 {

	@Autowired
	private PropertiesBean propertiesBean;

	private static URL localizacion = null;

	private static TENTRADA entrada = new TENTRADA();

	/**
	 * @param args
	 * @throws MalformedURLException
	 */
	public DTZTMHRPIF009Response respuestaSIZTMHRPIF008(String expSolicita, String sprps, String subty,
			String tprog, TENTRADA entrada) throws MalformedURLException {

		String localizacionWsdl = propertiesBean.getPathPi() + propertiesBean.getPathZTMHRPIF009();
		String servicioConsumo = propertiesBean.getUrlZTMHRPIF009();
		String usuario = propertiesBean.getUsuario();
		String password = propertiesBean.getPassword();

		localizacion = new URL(localizacionWsdl);

		SIZTMHRPIF009Service servicio;
		servicio = new SIZTMHRPIF009Service(localizacion);

		SIZTMHRPIF009 conector;
		conector = servicio.getSIZTMHRPIF009Port();

		BindingProvider bp = (BindingProvider) conector;

		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, usuario);
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servicioConsumo);

		DTZTMHRPIF009Response respuesta;
		respuesta = null;

		DTZTMHRPIF009Request solicitud;
		solicitud = new DTZTMHRPIF009Request();

		solicitud.setTENTRADA(entrada);

		solicitud.setEXPSOLICITA(expSolicita);
		solicitud.setIDMOVIMIENTO("");
		solicitud.setSPRPS(sprps);
		solicitud.setSUBTY(subty);
		solicitud.setTPROG(tprog);

		respuesta = conector.siZTMHRPIF009(solicitud);

		return respuesta;

	}

	public static void generaEntrada(String pernr) {
		DTZTMHRPIE008 item = new DTZTMHRPIE008();
		item.setPERNR(pernr);
		entrada.setItem(item);
	}

}
