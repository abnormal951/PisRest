
package com.hitss.pis.rest.webservices.stubs.SI_ZRFCCREADOCFIF47V2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_MAESTRO complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DT_MAESTRO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BLDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BLART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUKRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MONAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WAERS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BELNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XBLNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BKTXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARGB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_MAESTRO", propOrder = {
    "bldat",
    "blart",
    "bukrs",
    "budat",
    "monat",
    "waers",
    "belnr",
    "xblnr",
    "bktxt",
    "pargb"
})
public class DTMAESTRO {

    @XmlElement(name = "BLDAT")
    protected String bldat;
    @XmlElement(name = "BLART")
    protected String blart;
    @XmlElement(name = "BUKRS")
    protected String bukrs;
    @XmlElement(name = "BUDAT")
    protected String budat;
    @XmlElement(name = "MONAT")
    protected String monat;
    @XmlElement(name = "WAERS")
    protected String waers;
    @XmlElement(name = "BELNR")
    protected String belnr;
    @XmlElement(name = "XBLNR")
    protected String xblnr;
    @XmlElement(name = "BKTXT")
    protected String bktxt;
    @XmlElement(name = "PARGB")
    protected String pargb;

    /**
     * Obtiene el valor de la propiedad bldat.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBLDAT() {
        return bldat;
    }

    /**
     * Define el valor de la propiedad bldat.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBLDAT(String value) {
        this.bldat = value;
    }

    /**
     * Obtiene el valor de la propiedad blart.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBLART() {
        return blart;
    }

    /**
     * Define el valor de la propiedad blart.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBLART(String value) {
        this.blart = value;
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

    /**
     * Obtiene el valor de la propiedad budat.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBUDAT() {
        return budat;
    }

    /**
     * Define el valor de la propiedad budat.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBUDAT(String value) {
        this.budat = value;
    }

    /**
     * Obtiene el valor de la propiedad monat.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMONAT() {
        return monat;
    }

    /**
     * Define el valor de la propiedad monat.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMONAT(String value) {
        this.monat = value;
    }

    /**
     * Obtiene el valor de la propiedad waers.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWAERS() {
        return waers;
    }

    /**
     * Define el valor de la propiedad waers.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWAERS(String value) {
        this.waers = value;
    }

    /**
     * Obtiene el valor de la propiedad belnr.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBELNR() {
        return belnr;
    }

    /**
     * Define el valor de la propiedad belnr.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBELNR(String value) {
        this.belnr = value;
    }

    /**
     * Obtiene el valor de la propiedad xblnr.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getXBLNR() {
        return xblnr;
    }

    /**
     * Define el valor de la propiedad xblnr.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setXBLNR(String value) {
        this.xblnr = value;
    }

    /**
     * Obtiene el valor de la propiedad bktxt.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBKTXT() {
        return bktxt;
    }

    /**
     * Define el valor de la propiedad bktxt.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBKTXT(String value) {
        this.bktxt = value;
    }

    /**
     * Obtiene el valor de la propiedad pargb.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPARGB() {
        return pargb;
    }

    /**
     * Define el valor de la propiedad pargb.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPARGB(String value) {
        this.pargb = value;
    }

	@Override
	public String toString() {
		return "DTMAESTRO [bldat=" + bldat + ", blart=" + blart + ", bukrs=" + bukrs + ", budat=" + budat + ", monat="
				+ monat + ", waers=" + waers + ", belnr=" + belnr + ", xblnr=" + xblnr + ", bktxt=" + bktxt + ", pargb="
				+ pargb + "]";
	}

}
