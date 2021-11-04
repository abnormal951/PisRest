
package com.hitss.pis.rest.webservices.stubs.InfoT_PA9990_V2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_ZTMHRPIF002_request complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_ZTMHRPIF002_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sociedad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExpSolicita" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDMOVIMIENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SPRPS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SUBTY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ENDDA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="T_ENTRADA" type="{http://consultas.modernizacion.hr/InfoT_PA9990}DT_T_ENTRADA"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_ZTMHRPIF002_request", propOrder = {
    "sociedad",
    "expSolicita",
    "idmovimiento",
    "sprps",
    "subty",
    "endda",
    "tentrada"
})
public class DTZTMHRPIF002Request {

    @XmlElement(required = true)
    protected String sociedad;
    @XmlElement(name = "ExpSolicita", required = true)
    protected String expSolicita;
    @XmlElement(name = "IDMOVIMIENTO", required = true)
    protected String idmovimiento;
    @XmlElement(name = "SPRPS", required = true)
    protected String sprps;
    @XmlElement(name = "SUBTY", required = true)
    protected String subty;
    @XmlElement(name = "ENDDA", required = true)
    protected String endda;
    @XmlElement(name = "T_ENTRADA", required = true)
    protected DTTENTRADA tentrada;

    /**
     * Obtiene el valor de la propiedad sociedad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSociedad() {
        return sociedad;
    }

    /**
     * Define el valor de la propiedad sociedad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSociedad(String value) {
        this.sociedad = value;
    }

    /**
     * Obtiene el valor de la propiedad expSolicita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpSolicita() {
        return expSolicita;
    }

    /**
     * Define el valor de la propiedad expSolicita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpSolicita(String value) {
        this.expSolicita = value;
    }

    /**
     * Obtiene el valor de la propiedad idmovimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDMOVIMIENTO() {
        return idmovimiento;
    }

    /**
     * Define el valor de la propiedad idmovimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDMOVIMIENTO(String value) {
        this.idmovimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad sprps.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPRPS() {
        return sprps;
    }

    /**
     * Define el valor de la propiedad sprps.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPRPS(String value) {
        this.sprps = value;
    }

    /**
     * Obtiene el valor de la propiedad subty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBTY() {
        return subty;
    }

    /**
     * Define el valor de la propiedad subty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBTY(String value) {
        this.subty = value;
    }

    /**
     * Obtiene el valor de la propiedad endda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDDA() {
        return endda;
    }

    /**
     * Define el valor de la propiedad endda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDDA(String value) {
        this.endda = value;
    }

    /**
     * Obtiene el valor de la propiedad tentrada.
     * 
     * @return
     *     possible object is
     *     {@link DTTENTRADA }
     *     
     */
    public DTTENTRADA getTENTRADA() {
        return tentrada;
    }

    /**
     * Define el valor de la propiedad tentrada.
     * 
     * @param value
     *     allowed object is
     *     {@link DTTENTRADA }
     *     
     */
    public void setTENTRADA(DTTENTRADA value) {
        this.tentrada = value;
    }

}
