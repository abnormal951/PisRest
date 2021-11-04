package com.hitss.pis.rest.webservices.consume;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.util.PropertiesBean;
import com.hitss.pis.rest.webservices.stubs.PI_IT008.DTZTMHRPIE004;
import com.hitss.pis.rest.webservices.stubs.PI_IT008.DTZTMHRPIF004Request;
import com.hitss.pis.rest.webservices.stubs.PI_IT008.DTZTMHRPIF004Request.TENTRADA;
import com.hitss.pis.rest.webservices.stubs.PI_IT008.DTZTMHRPIF004Response;
import com.hitss.pis.rest.webservices.stubs.PI_IT008.SIZTMHRPIF004;
import com.hitss.pis.rest.webservices.stubs.PI_IT008.SIZTMHRPIF004Service;

@Component
public class ConsumeWebServicePIIT2008v2 {

	@Autowired
	private PropertiesBean propertiesBean;
	
	private static URL localizacion = null;

	private static TENTRADA entrada = new TENTRADA();

	/**
	 * @param args
	 * @throws MalformedURLException
	 */
	public DTZTMHRPIF004Response respuestaPIIT2008v2(String expSolicita, String fechaRef, String sprps,
			TENTRADA entrada) throws MalformedURLException {


		String localizacionWsdl = propertiesBean.getPathPi() + propertiesBean.getPathZTMHRPIF004V2();
		String servicioCSonsumo = propertiesBean.getUrlZTMHRPIF004V2();
		String usuario = propertiesBean.getUsuario();
		String password = propertiesBean.getPassword();

		localizacion = new URL(localizacionWsdl);

		SIZTMHRPIF004Service servicio;
		servicio = new SIZTMHRPIF004Service(localizacion);

		SIZTMHRPIF004 conector;
		conector = servicio.getSIZTMHRPIF004Port();

		BindingProvider bp = (BindingProvider) conector;

		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, usuario);
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servicioCSonsumo);

		DTZTMHRPIF004Response respuesta;
		respuesta = null;

		DTZTMHRPIF004Request solicitud;
		solicitud = new DTZTMHRPIF004Request();

		solicitud.setTENTRADA(entrada);

		solicitud.setEXPSOLICITA(expSolicita);
		solicitud.setFECHAREF(fechaRef);
		solicitud.setIDMOVIMIENTO("");
		solicitud.setSPRPS(sprps);

		respuesta = conector.siZTMHRPIF004(solicitud);

		return respuesta;

	}

	public static void generaEntrada(String pernr) {
		DTZTMHRPIE004 item = new DTZTMHRPIE004();
		item.setPERNR(pernr);
		entrada.setItem(item);
	}

}