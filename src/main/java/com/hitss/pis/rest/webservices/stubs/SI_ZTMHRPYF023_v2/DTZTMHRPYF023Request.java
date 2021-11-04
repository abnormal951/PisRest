
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF023_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_ZTMHRPYF023_request complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_ZTMHRPYF023_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXPSOLICITA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDMOVIMIENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SPRPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUBTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="T_ENTRADA">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Item" type="{http://consultas.modernizacion.hr/ZTMHRPYF023}DT_ZTMHRPYES025"/>
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
@XmlType(name = "DT_ZTMHRPYF023_request", propOrder = {
    "expsolicita",
    "idmovimiento",
    "sprps",
    "subty",
    "tentrada"
})
public class DTZTMHRPYF023Request {

    @XmlElement(name = "EXPSOLICITA", required = true)
    protected String expsolicita;
    @XmlElement(name = "IDMOVIMIENTO", required = true)
    protected String idmovimiento;
    @XmlElement(name = "SPRPS")
    protected String sprps;
    @XmlElement(name = "SUBTY")
    protected String subty;
    @XmlElement(name = "T_ENTRADA", required = true)
    protected DTZTMHRPYF023Request.TENTRADA tentrada;

    /**
     * Obtiene el valor de la propiedad expsolicita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPSOLICITA() {
        return expsolicita;
    }

    /**
     * Define el valor de la propiedad expsolicita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPSOLICITA(String value) {
        this.expsolicita = value;
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
     * Obtiene el valor de la propiedad tentrada.
     * 
     * @return
     *     possible object is
     *     {@link DTZTMHRPYF023Request.TENTRADA }
     *     
     */
    public DTZTMHRPYF023Request.TENTRADA getTENTRADA() {
        return tentrada;
    }

    /**
     * Define el valor de la propiedad tentrada.
     * 
     * @param value
     *     allowed object is
     *     {@link DTZTMHRPYF023Request.TENTRADA }
     *     
     */
    public void setTENTRADA(DTZTMHRPYF023Request.TENTRADA value) {
        this.tentrada = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Item" type="{http://consultas.modernizacion.hr/ZTMHRPYF023}DT_ZTMHRPYES025"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class TENTRADA {

        @XmlElement(name = "Item", required = true)
        protected DTZTMHRPYES025 item;

        /**
         * Obtiene el valor de la propiedad item.
         * 
         * @return
         *     possible object is
         *     {@link DTZTMHRPYES025 }
         *     
         */
        public DTZTMHRPYES025 getItem() {
            return item;
        }

        /**
         * Define el valor de la propiedad item.
         * 
         * @param value
         *     allowed object is
         *     {@link DTZTMHRPYES025 }
         *     
         */
        public void setItem(DTZTMHRPYES025 value) {
            this.item = value;
        }

    }

}
