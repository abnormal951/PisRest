
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF028;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_ZTMHRPYES032 complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DT_ZTMHRPYES032">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PERNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d+"/>
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LIFNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BUKRS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "DT_ZTMHRPYES032", propOrder = {
    "pernr",
    "lifnr",
    "bukrs"
})
public class DTZTMHRPYES032 {

    @XmlElement(name = "PERNR")
    protected String pernr;
    @XmlElement(name = "LIFNR")
    protected String lifnr;
    @XmlElement(name = "BUKRS")
    protected String bukrs;

    public DTZTMHRPYES032() {
		super();
	}

	public DTZTMHRPYES032(String pernr, String lifnr, String bukrs) {
		super();
		this.pernr = pernr;
		this.lifnr = lifnr;
		this.bukrs = bukrs;
	}

	/**
     * Obtiene el valor de la propiedad pernr.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPERNR() {
        return pernr;
    }

    /**
     * Define el valor de la propiedad pernr.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPERNR(String value) {
        this.pernr = value;
    }

    /**
     * Obtiene el valor de la propiedad lifnr.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLIFNR() {
        return lifnr;
    }

    /**
     * Define el valor de la propiedad lifnr.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLIFNR(String value) {
        this.lifnr = value;
    }

    /**
     * Obtiene el valor de la propiedad bukrs.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBUKRS() {
        return bukrs;
    }

    /**
     * Define el valor de la propiedad bukrs.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBUKRS(String value) {
        this.bukrs = value;
    }

}
