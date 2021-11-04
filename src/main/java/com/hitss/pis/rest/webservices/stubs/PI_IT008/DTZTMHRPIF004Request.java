
package com.hitss.pis.rest.webservices.stubs.PI_IT008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_ZTMHRPIF004_request complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_ZTMHRPIF004_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXPSOLICITA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FECHA_REF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDMOVIMIENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SPRPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="T_ENTRADA">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Item" type="{http://consultas.modernizacion.hr/ZTMHRPIF004}DT_ZTMHRPIE004"/>
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
@XmlType(name = "DT_ZTMHRPIF004_request", propOrder = {
    "expsolicita",
    "fecharef",
    "idmovimiento",
    "sprps",
    "tentrada"
})
public class DTZTMHRPIF004Request {

    @XmlElement(name = "EXPSOLICITA", required = true)
    protected String expsolicita;
    @XmlElement(name = "FECHA_REF", required = true)
    protected String fecharef;
    @XmlElement(name = "IDMOVIMIENTO", required = true)
    protected String idmovimiento;
    @XmlElement(name = "SPRPS")
    protected String sprps;
    @XmlElement(name = "T_ENTRADA", required = true)
    protected DTZTMHRPIF004Request.TENTRADA tentrada;

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
     * Obtiene el valor de la propiedad fecharef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAREF() {
        return fecharef;
    }

    /**
     * Define el valor de la propiedad fecharef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAREF(String value) {
        this.fecharef = value;
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
     * Obtiene el valor de la propiedad tentrada.
     * 
     * @return
     *     possible object is
     *     {@link DTZTMHRPIF004Request.TENTRADA }
     *     
     */
    public DTZTMHRPIF004Request.TENTRADA getTENTRADA() {
        return tentrada;
    }

    /**
     * Define el valor de la propiedad tentrada.
     * 
     * @param value
     *     allowed object is
     *     {@link DTZTMHRPIF004Request.TENTRADA }
     *     
     */
    public void setTENTRADA(DTZTMHRPIF004Request.TENTRADA value) {
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
     *         &lt;element name="Item" type="{http://consultas.modernizacion.hr/ZTMHRPIF004}DT_ZTMHRPIE004"/>
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
        protected DTZTMHRPIE004 item;

        /**
         * Obtiene el valor de la propiedad item.
         * 
         * @return
         *     possible object is
         *     {@link DTZTMHRPIE004 }
         *     
         */
        public DTZTMHRPIE004 getItem() {
            return item;
        }

        /**
         * Define el valor de la propiedad item.
         * 
         * @param value
         *     allowed object is
         *     {@link DTZTMHRPIE004 }
         *     
         */
        public void setItem(DTZTMHRPIE004 value) {
            this.item = value;
        }

    }

}
