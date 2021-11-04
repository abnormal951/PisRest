package com.hitss.pis.rest.webservices.consume;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.util.PropertiesBean;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF023_v2.DTZTMHRPYES025;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF023_v2.DTZTMHRPYF023Request;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF023_v2.DTZTMHRPYF023Request.TENTRADA;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF023_v2.DTZTMHRPYF023Response;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF023_v2.SIZTMHRPYF023;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF023_v2.SIZTMHRPYF023Service;

@Component
public class ConsumeWebServiceSIZTMHRPYF023v2 {
	
	@Autowired
	private PropertiesBean propertiesBean;

	private static URL localizacion = null;

	private static TENTRADA entrada = new TENTRADA();

	/**
	 * @param args
	 * @throws MalformedURLException
	 */
	public DTZTMHRPYF023Response respuestaSIZTMHRPYF023v2(String expSolicita, String sprps, String subty,
			TENTRADA entrada) throws MalformedURLException {

		String localizacionWsdl = propertiesBean.getPathPi() + propertiesBean.getPathZTMHRPYF023V2();
		String servicioConsumo = propertiesBean.getUrlZTMHRPYF023V2();
		String usuario = propertiesBean.getUsuario();
		String password = propertiesBean.getPassword();

		localizacion = new URL(localizacionWsdl);

		SIZTMHRPYF023Service servicio;
		servicio = new SIZTMHRPYF023Service(localizacion);

		SIZTMHRPYF023 conector;
		conector = servicio.getSIZTMHRPYF023Port();

		BindingProvider bp = (BindingProvider) conector;

		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, usuario);
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servicioConsumo);

		DTZTMHRPYF023Response respuesta;
		respuesta = null;

		DTZTMHRPYF023Request solicitud;
		solicitud = new DTZTMHRPYF023Request();

		solicitud.setTENTRADA(entrada);

		solicitud.setEXPSOLICITA(expSolicita);
		solicitud.setIDMOVIMIENTO("");
		solicitud.setSPRPS(sprps);
		solicitud.setSUBTY(subty);

		respuesta = conector.siZTMHRPYF023(solicitud);

		return respuesta;

	}

	public static void generaEntrada(String pernr, String fechaRef) {
		DTZTMHRPYES025 item = new DTZTMHRPYES025();
		item.setPERNR(pernr);
		item.setFECHAREF(fechaRef);
		entrada.setItem(item);
	}

}
