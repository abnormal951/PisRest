
package com.hitss.pis.rest.webservices.stubs.PI_IT2006;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>Clase Java para DT_ZTMHRPIF006_request complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DT_ZTMHRPIF006_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BEGDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEEND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENDDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXPSOLICITA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDMOVIMIENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SUBTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="T_ENTRADA">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Item" type="{http://consultas.modernizacion.hr/ZTMHRPIF006}DT_ZTMHRPIE002"/>
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
@XmlType(name = "DT_ZTMHRPIF006_request", propOrder = {
    "begda",
    "deend",
    "desta",
    "endda",
    "expsolicita",
    "idmovimiento",
    "subty",
    "tentrada"
})
public class DTZTMHRPIF006Request {

    @XmlElement(name = "BEGDA")
    protected String begda;
    @XmlElement(name = "DEEND")
    protected String deend;
    @XmlElement(name = "DESTA")
    protected String desta;
    @XmlElement(name = "ENDDA")
    protected String endda;
    @XmlElement(name = "EXPSOLICITA", required = true)
    protected String expsolicita;
    @XmlElement(name = "IDMOVIMIENTO", required = true)
    protected String idmovimiento;
    @XmlElement(name = "SUBTY")
    protected String subty;
    @XmlElement(name = "T_ENTRADA", required = true)
    protected DTZTMHRPIF006Request.TENTRADA tentrada;

    /**
     * Obtiene el valor de la propiedad begda.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBEGDA() {
        return begda;
    }

    /**
     * Define el valor de la propiedad begda.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBEGDA(String value) {
        this.begda = value;
    }

    /**
     * Obtiene el valor de la propiedad deend.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDEEND() {
        return deend;
    }

    /**
     * Define el valor de la propiedad deend.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDEEND(String value) {
        this.deend = value;
    }

    /**
     * Obtiene el valor de la propiedad desta.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDESTA() {
        return desta;
    }

    /**
     * Define el valor de la propiedad desta.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDESTA(String value) {
        this.desta = value;
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
     *     {@link DTZTMHRPIF006Request.TENTRADA }
     *
     */
    public DTZTMHRPIF006Request.TENTRADA getTENTRADA() {
        return tentrada;
    }

    /**
     * Define el valor de la propiedad tentrada.
     *
     * @param value
     *     allowed object is
     *     {@link DTZTMHRPIF006Request.TENTRADA }
     *
     */
    public void setTENTRADA(DTZTMHRPIF006Request.TENTRADA value) {
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
     *         &lt;element name="Item" type="{http://consultas.modernizacion.hr/ZTMHRPIF006}DT_ZTMHRPIE002"/>
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
        protected List<DTZTMHRPIE002> item;

        /**
         * Obtiene el valor de la propiedad item.
         *
         * @return
         *     possible object is
         *     {@link DTZTMHRPIE002 }
         *
         */
        public List<DTZTMHRPIE002> getItem() {
        	if (item == null) {
                item = new ArrayList<DTZTMHRPIE002>();
            }
            return item;
        }

        /**
         * Define el valor de la propiedad item.
         *
         * @param value
         *     allowed object is
         *     {@link DTZTMHRPIE002 }
         *
         */
        public void setItem(DTZTMHRPIE002 elemento) {
        	if (item == null) {
				item = new ArrayList<DTZTMHRPIE002>();
			}
			if (elemento != null) {
				item.add(elemento);
			}
        }

    }

}
