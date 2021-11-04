
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF007;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_ZTMHRPIF007_request complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DT_ZTMHRPIF007_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CICLO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EXPSOLICITA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDMOVIMIENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="T_ENTRADA">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Item" type="{http://consultas.modernizacion.hr/Programa_Anual_Vacaciones}DT_ZTMHRPITT006" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DT_ZTMHRPIF007_request", propOrder = {
    "ciclo",
    "expsolicita",
    "idmovimiento",
    "tentrada"
})
public class DTZTMHRPIF007Request {

    @XmlElement(name = "CICLO", required = true)
    protected String ciclo;
    @XmlElement(name = "EXPSOLICITA")
    protected String expsolicita;
    @XmlElement(name = "IDMOVIMIENTO", required = true)
    protected String idmovimiento;
    @XmlElement(name = "T_ENTRADA", required = true)
    protected DTZTMHRPIF007Request.TENTRADA tentrada;

    /**
     * Obtiene el valor de la propiedad ciclo.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCICLO() {
        return ciclo;
    }

    /**
     * Define el valor de la propiedad ciclo.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCICLO(String value) {
        this.ciclo = value;
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
     * Obtiene el valor de la propiedad tentrada.
     *
     * @return
     *     possible object is
     *     {@link DTZTMHRPIF007Request.TENTRADA }
     *
     */
    public DTZTMHRPIF007Request.TENTRADA getTENTRADA() {
        return tentrada;
    }

    /**
     * Define el valor de la propiedad tentrada.
     *
     * @param value
     *     allowed object is
     *     {@link DTZTMHRPIF007Request.TENTRADA }
     *
     */
    public void setTENTRADA(DTZTMHRPIF007Request.TENTRADA value) {
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
     *         &lt;element name="Item" type="{http://consultas.modernizacion.hr/Programa_Anual_Vacaciones}DT_ZTMHRPITT006" maxOccurs="unbounded" minOccurs="0"/>
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

        @XmlElement(name = "Item")
        protected List<DTZTMHRPITT006> item;

        public void setItem(DTZTMHRPITT006 elemento) {
			if (item == null) {
				item = new ArrayList<DTZTMHRPITT006>();
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
         * {@link DTZTMHRPITT006 }
         *
         *
         */
        public List<DTZTMHRPITT006> getItem() {
            if (item == null) {
                item = new ArrayList<DTZTMHRPITT006>();
            }
            return this.item;
        }

    }

}
