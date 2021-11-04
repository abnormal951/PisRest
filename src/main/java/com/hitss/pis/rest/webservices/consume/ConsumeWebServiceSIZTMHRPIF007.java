package com.hitss.pis.rest.webservices.consume;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.pis.rest.util.PropertiesBean;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF007.DTZTMHRPIF007Request;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF007.DTZTMHRPIF007Request.TENTRADA;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF007.DTZTMHRPIF007Response;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF007.DTZTMHRPITT006;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF007.SIZTMHRPIF007;
import com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF007.SIZTMHRPIF007Service;

@Component
public class ConsumeWebServiceSIZTMHRPIF007 {

	@Autowired
	private PropertiesBean propertiesBean;

	private static URL localizacion = null;

	private static TENTRADA entrada = new TENTRADA();

	/**
	 * @param args
	 * @throws MalformedURLException
	 */
	public DTZTMHRPIF007Response respuestaSIZTMHRPIF007(String ciclo, String expSolicita, TENTRADA entrada)
			throws MalformedURLException {

		String localizacionWsdl = propertiesBean.getPathPi() + propertiesBean.getPathZTMHRPIF007();
		String servicioConsumo = propertiesBean.getUrlZTMHRPIF007();
		String usuario = propertiesBean.getUsuario();
		String password = propertiesBean.getPassword();

		localizacion = new URL(localizacionWsdl);

		SIZTMHRPIF007Service servicio;
		servicio = new SIZTMHRPIF007Service(localizacion);

		SIZTMHRPIF007 conector;
		conector = servicio.getSIZTMHRPIF007Port();

		BindingProvider bp = (BindingProvider) conector;

		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, usuario);
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servicioConsumo);

		DTZTMHRPIF007Response respuesta;
		respuesta = null;

		DTZTMHRPIF007Request solicitud;
		solicitud = new DTZTMHRPIF007Request();

		solicitud.setTENTRADA(entrada);

		solicitud.setCICLO(ciclo);
		solicitud.setEXPSOLICITA(expSolicita);
		solicitud.setIDMOVIMIENTO("");

		respuesta = conector.siZTMHRPIF007(solicitud);

		return respuesta;

	}

	public static void generaEntrada(String pernr) {
		DTZTMHRPITT006 item = new DTZTMHRPITT006();
		item.setPERNR(pernr);
		entrada.setItem(item);
	}

}
