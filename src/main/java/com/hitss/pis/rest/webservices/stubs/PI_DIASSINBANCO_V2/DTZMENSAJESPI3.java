
package com.hitss.pis.rest.webservices.stubs.PI_DIASSINBANCO_V2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_ZMENSAJESPI3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_ZMENSAJESPI3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "DT_ZMENSAJESPI3", propOrder = {
    "status",
    "msj",
    "cvemsj"
})
public class DTZMENSAJESPI3 {

    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "MSJ")
    protected String msj;
    @XmlElement(name = "CVE_MSJ")
    protected String cvemsj;

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
