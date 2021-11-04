package com.hitss.pis.rest.webservices.consume;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.util.PropertiesBean;
import com.hitss.pis.rest.webservices.stubs.PI_IT2006.DTZTMHRPIE002;
import com.hitss.pis.rest.webservices.stubs.PI_IT2006.DTZTMHRPIF006Request;
import com.hitss.pis.rest.webservices.stubs.PI_IT2006.DTZTMHRPIF006Request.TENTRADA;
import com.hitss.pis.rest.webservices.stubs.PI_IT2006.DTZTMHRPIF006Response;
import com.hitss.pis.rest.webservices.stubs.PI_IT2006.SIZTMHRPIF006;
import com.hitss.pis.rest.webservices.stubs.PI_IT2006.SIZTMHRPIF006Service;

@Component
public class ConsumeWebServicePIIT2006 {
	
	@Autowired
	private PropertiesBean propertiesBean;


	private static URL localizacion = null;

	private static  TENTRADA entrada = new TENTRADA();

	/**
	 * @param args
	 * @throws MalformedURLException
	 */
	public DTZTMHRPIF006Response respuestaPIIT2006(String begda, String deend, String desta, String endda,
			String expSolicita, String subty, TENTRADA entrada) throws MalformedURLException {

		String localizacionWsdl = propertiesBean.getPathPi() + propertiesBean.getPathZTMHRPIF006();
		String servicioConsumo = propertiesBean.getUrlZTMHRPIF006();
		String usuario = propertiesBean.getUsuario();
		String password = propertiesBean.getPassword();

		localizacion = new URL(localizacionWsdl);

		SIZTMHRPIF006Service servicio;
		servicio = new SIZTMHRPIF006Service(localizacion);

		SIZTMHRPIF006 conector;
		conector = servicio.getSIZTMHRPIF006Port();

		BindingProvider bp = (BindingProvider) conector;

		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, usuario);
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servicioConsumo);

		DTZTMHRPIF006Response respuesta;
		respuesta = null;

		DTZTMHRPIF006Request solicitud;
		solicitud = new DTZTMHRPIF006Request();

		solicitud.setTENTRADA(entrada);

		solicitud.setBEGDA(begda);
		solicitud.setDEEND(deend);
		solicitud.setDESTA(desta);
		solicitud.setENDDA(endda);
		solicitud.setEXPSOLICITA(expSolicita);
		solicitud.setIDMOVIMIENTO("");
		solicitud.setSUBTY(subty);

		respuesta = conector.siZTMHRPIF006(solicitud);

		return respuesta;

	}

	public static void generaEntrada(String pernr) {
		DTZTMHRPIE002 item = new DTZTMHRPIE002();
		item.setPERNR(pernr);
		entrada.setItem(item);
	}

}
