
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF009;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_ZTMHRPIF009_request complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DT_ZTMHRPIF009_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXPSOLICITA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDMOVIMIENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SPRPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUBTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TPROG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="T_ENTRADA">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Item" type="{http://consultas.modernizacion.hr/ZTMHRPIF009}DT_ZTMHRPIE008" maxOccurs="unbounded"/>
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
@XmlType(name = "DT_ZTMHRPIF009_request", propOrder = {
    "expsolicita",
    "idmovimiento",
    "sprps",
    "subty",
    "tprog",
    "tentrada"
})
public class DTZTMHRPIF009Request {

    @XmlElement(name = "EXPSOLICITA", required = true)
    protected String expsolicita;
    @XmlElement(name = "IDMOVIMIENTO", required = true)
    protected String idmovimiento;
    @XmlElement(name = "SPRPS")
    protected String sprps;
    @XmlElement(name = "SUBTY")
    protected String subty;
    @XmlElement(name = "TPROG")
    protected String tprog;
    @XmlElement(name = "T_ENTRADA", required = true)
    protected DTZTMHRPIF009Request.TENTRADA tentrada;

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
     * Obtiene el valor de la propiedad tprog.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTPROG() {
        return tprog;
    }

    /**
     * Define el valor de la propiedad tprog.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTPROG(String value) {
        this.tprog = value;
    }

    /**
     * Obtiene el valor de la propiedad tentrada.
     *
     * @return
     *     possible object is
     *     {@link DTZTMHRPIF009Request.TENTRADA }
     *
     */
    public DTZTMHRPIF009Request.TENTRADA getTENTRADA() {
        return tentrada;
    }

    /**
     * Define el valor de la propiedad tentrada.
     *
     * @param value
     *     allowed object is
     *     {@link DTZTMHRPIF009Request.TENTRADA }
     *
     */
    public void setTENTRADA(DTZTMHRPIF009Request.TENTRADA value) {
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
     *         &lt;element name="Item" type="{http://consultas.modernizacion.hr/ZTMHRPIF009}DT_ZTMHRPIE008" maxOccurs="unbounded"/>
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
        protected List<DTZTMHRPIE008> item;

        public void setItem(DTZTMHRPIE008 elemento) {
			if (item == null) {
				item = new ArrayList<DTZTMHRPIE008>();
			}

			if (elemento != null) {
				item.add(elemento);
			}
		}

        /**
         * Gets the value of the item property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTZTMHRPIE008 }
         *
         *
         */
        public List<DTZTMHRPIE008> getItem() {
            if (item == null) {
                item = new ArrayList<DTZTMHRPIE008>();
            }
            return this.item;
        }

    }

}
