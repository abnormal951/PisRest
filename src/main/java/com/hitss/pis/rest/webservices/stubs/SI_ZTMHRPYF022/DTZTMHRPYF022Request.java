
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF022;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_ZTMHRPYF022_request complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DT_ZTMHRPYF022_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXPSOLICITA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FECHA_REF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDMOVIMIENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="T_ENTRADA">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Item" type="{http://consultas.modernizacion.hr/ZTMHRPYF022}DT_ZTMHRPYES027" maxOccurs="unbounded"/>
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
@XmlType(name = "DT_ZTMHRPYF022_request", propOrder = {
    "expsolicita",
    "fecharef",
    "idmovimiento",
    "tentrada"
})
public class DTZTMHRPYF022Request {

    @XmlElement(name = "EXPSOLICITA", required = true)
    protected String expsolicita;
    @XmlElement(name = "FECHA_REF", required = true)
    protected String fecharef;
    @XmlElement(name = "IDMOVIMIENTO", required = true)
    protected String idmovimiento;
    @XmlElement(name = "T_ENTRADA", required = true)
    protected DTZTMHRPYF022Request.TENTRADA tentrada;

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
     * Obtiene el valor de la propiedad tentrada.
     *
     * @return
     *     possible object is
     *     {@link DTZTMHRPYF022Request.TENTRADA }
     *
     */
    public DTZTMHRPYF022Request.TENTRADA getTENTRADA() {
        return tentrada;
    }

    /**
     * Define el valor de la propiedad tentrada.
     *
     * @param value
     *     allowed object is
     *     {@link DTZTMHRPYF022Request.TENTRADA }
     *
     */
    public void setTENTRADA(DTZTMHRPYF022Request.TENTRADA value) {
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
     *         &lt;element name="Item" type="{http://consultas.modernizacion.hr/ZTMHRPYF022}DT_ZTMHRPYES027" maxOccurs="unbounded"/>
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
        protected List<DTZTMHRPYES027> item;

        public void setItem(DTZTMHRPYES027 elemento) {
			if (item == null) {
				item = new ArrayList<DTZTMHRPYES027>();
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
         * {@link DTZTMHRPYES027 }
         *
         *
         */
        public List<DTZTMHRPYES027> getItem() {
            if (item == null) {
                item = new ArrayList<DTZTMHRPYES027>();
            }
            return this.item;
        }

    }

}
