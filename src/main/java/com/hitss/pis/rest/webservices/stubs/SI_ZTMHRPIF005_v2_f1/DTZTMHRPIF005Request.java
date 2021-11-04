
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF005_v2_f1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para DT_ZTMHRPIF005_request complex type.
 *
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DT_ZTMHRPIF005_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BLOQUEONOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CANDOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXPSOLICITA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDMOVIMIENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INDCARGA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPFORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="T_ENTRADA">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Item" type="{http://consultas.modernizacion.hr/ZHRATT010}DT_ZTMHRPIE003" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_ZTMHRPIF005_request", propOrder = { "bloqueonom", "candoc", "expsolicita", "idmovimiento",
		"indcarga", "tipform", "tentrada" })
public class DTZTMHRPIF005Request {

	@XmlElement(name = "BLOQUEONOM")
	protected String bloqueonom;
	@XmlElement(name = "CANDOC")
	protected String candoc;
	@XmlElement(name = "EXPSOLICITA", required = true)
	protected String expsolicita;
	@XmlElement(name = "IDMOVIMIENTO", required = true)
	protected String idmovimiento;
	@XmlElement(name = "INDCARGA")
	protected String indcarga;
	@XmlElement(name = "TIPFORM")
	protected String tipform;
	@XmlElement(name = "T_ENTRADA", required = true)
	protected DTZTMHRPIF005Request.TENTRADA tentrada;

	/**
	 * Obtiene el valor de la propiedad bloqueonom.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getBLOQUEONOM() {
		return bloqueonom;
	}

	/**
	 * Define el valor de la propiedad bloqueonom.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 *
	 */
	public void setBLOQUEONOM(String value) {
		this.bloqueonom = value;
	}

	/**
	 * Obtiene el valor de la propiedad candoc.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getCANDOC() {
		return candoc;
	}

	/**
	 * Define el valor de la propiedad candoc.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 *
	 */
	public void setCANDOC(String value) {
		this.candoc = value;
	}

	/**
	 * Obtiene el valor de la propiedad expsolicita.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getEXPSOLICITA() {
		return expsolicita;
	}

	/**
	 * Define el valor de la propiedad expsolicita.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 *
	 */
	public void setEXPSOLICITA(String value) {
		this.expsolicita = value;
	}

	/**
	 * Obtiene el valor de la propiedad idmovimiento.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getIDMOVIMIENTO() {
		return idmovimiento;
	}

	/**
	 * Define el valor de la propiedad idmovimiento.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 *
	 */
	public void setIDMOVIMIENTO(String value) {
		this.idmovimiento = value;
	}

	/**
	 * Obtiene el valor de la propiedad indcarga.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getINDCARGA() {
		return indcarga;
	}

	/**
	 * Define el valor de la propiedad indcarga.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 *
	 */
	public void setINDCARGA(String value) {
		this.indcarga = value;
	}

	/**
	 * Obtiene el valor de la propiedad tipform.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getTIPFORM() {
		return tipform;
	}

	/**
	 * Define el valor de la propiedad tipform.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 *
	 */
	public void setTIPFORM(String value) {
		this.tipform = value;
	}

	/**
	 * Obtiene el valor de la propiedad tentrada.
	 *
	 * @return possible object is {@link DTZTMHRPIF005Request.TENTRADA }
	 *
	 */
	public DTZTMHRPIF005Request.TENTRADA getTENTRADA() {
		return tentrada;
	}

	/**
	 * Define el valor de la propiedad tentrada.
	 *
	 * @param value
	 *            allowed object is {@link DTZTMHRPIF005Request.TENTRADA }
	 *
	 */
	public void setTENTRADA(DTZTMHRPIF005Request.TENTRADA value) {
		this.tentrada = value;
	}

	/**
	 * <p>
	 * Clase Java para anonymous complex type.
	 *
	 * <p>
	 * El siguiente fragmento de esquema especifica el contenido que se espera que
	 * haya en esta clase.
	 *
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="Item" type="{http://consultas.modernizacion.hr/ZHRATT010}DT_ZTMHRPIE003" maxOccurs="unbounded"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 *
	 *
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "item" })
	public static class TENTRADA {

		@XmlElement(name = "Item", required = true)
		protected List<DTZTMHRPIE003> item;

		public void setItem(DTZTMHRPIE003 elemento) {
			if (item == null) {
				item = new ArrayList<DTZTMHRPIE003>();
			}

			if (elemento != null) {
				item.add(elemento);
			}
		}

		/**
		 * Gets the value of the item property.
		 *
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot.
		 * Therefore any modification you make to the returned list will be present
		 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
		 * for the item property.
		 *
		 * <p>
		 * For example, to add a new item, do as follows:
		 *
		 * <pre>
		 * getItem().add(newItem);
		 * </pre>
		 *
		 *
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link DTZTMHRPIE003
		 * }
		 *
		 *
		 */
		public List<DTZTMHRPIE003> getItem() {
			if (item == null) {
				item = new ArrayList<DTZTMHRPIE003>();
			}
			return this.item;
		}

	}

}
