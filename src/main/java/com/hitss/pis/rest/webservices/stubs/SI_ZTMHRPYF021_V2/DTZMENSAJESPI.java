
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF021_V2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_ZMENSAJESPI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_ZMENSAJESPI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BUKRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CVE_MSJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_ZMENSAJESPI", propOrder = {
    "bukrs",
    "pernr",
    "status",
    "msj",
    "cvemsj"
})
public class DTZMENSAJESPI {

    @XmlElement(name = "BUKRS")
    protected String bukrs;
    @XmlElement(name = "PERNR")
    protected String pernr;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "MSJ")
    protected String msj;
    @XmlElement(name = "CVE_MSJ")
    protected String cvemsj;

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
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad msj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSJ() {
        return msj;
    }

    /**
     * Define el valor de la propiedad msj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSJ(String value) {
        this.msj = value;
    }

    /**
     * Obtiene el valor de la propiedad cvemsj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVEMSJ() {
        return cvemsj;
    }

    /**
     * Define el valor de la propiedad cvemsj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVEMSJ(String value) {
        this.cvemsj = value;
    }

}
