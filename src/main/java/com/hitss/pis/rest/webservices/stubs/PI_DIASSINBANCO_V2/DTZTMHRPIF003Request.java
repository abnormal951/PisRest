
package com.hitss.pis.rest.webservices.stubs.PI_DIASSINBANCO_V2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_ZTMHRPIF003_request complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_ZTMHRPIF003_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ANIO_FIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ANIO_INI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_ZTMHRPIF003_request", propOrder = {
    "aniofin",
    "anioini"
})
public class DTZTMHRPIF003Request {

    @XmlElement(name = "ANIO_FIN", required = true)
    protected String aniofin;
    @XmlElement(name = "ANIO_INI", required = true)
    protected String anioini;

    /**
     * Obtiene el valor de la propiedad aniofin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANIOFIN() {
        return aniofin;
    }

    /**
     * Define el valor de la propiedad aniofin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANIOFIN(String value) {
        this.aniofin = value;
    }

    /**
     * Obtiene el valor de la propiedad anioini.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANIOINI() {
        return anioini;
    }

    /**
     * Define el valor de la propiedad anioini.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANIOINI(String value) {
        this.anioini = value;
    }

}
