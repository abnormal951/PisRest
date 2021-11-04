
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF028;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>Clase Java para DT_ZTMHRPYF028_request complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DT_ZTMHRPYF028_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXPSOLICITA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_MOVIMIENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="T_CONSULTA">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{http://etelmex.jubilados.rh.telmex/consultaLFB1}DT_ZTMHRPYES032" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DT_ZTMHRPYF028_request", propOrder = {
    "expsolicita",
    "idmovimiento",
    "tconsulta"
})
public class DTZTMHRPYF028Request {

    @XmlElement(name = "EXPSOLICITA", required = true)
    protected String expsolicita;
    @XmlElement(name = "ID_MOVIMIENTO", required = true)
    protected String idmovimiento;
    @XmlElement(name = "T_CONSULTA", required = true)
    protected DTZTMHRPYF028Request.TCONSULTA tconsulta;

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
     * Obtiene el valor de la propiedad tconsulta.
     *
     * @return
     *     possible object is
     *     {@link DTZTMHRPYF028Request.TCONSULTA }
     *
     */
    public DTZTMHRPYF028Request.TCONSULTA getTCONSULTA() {
        return tconsulta;
    }

    /**
     * Define el valor de la propiedad tconsulta.
     *
     * @param value
     *     allowed object is
     *     {@link DTZTMHRPYF028Request.TCONSULTA }
     *
     */
    public void setTCONSULTA(DTZTMHRPYF028Request.TCONSULTA value) {
        this.tconsulta = value;
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
     *         &lt;element name="item" type="{http://etelmex.jubilados.rh.telmex/consultaLFB1}DT_ZTMHRPYES032" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class TCONSULTA {

        protected List<DTZTMHRPYES032> item;

//        public void setItem(DTZTMHRPYES032 elemento) {
//			if (item == null) {
//				item = new ArrayList<DTZTMHRPYES032>();
//			}
//
//			if (elemento != null) {
//				item.add(elemento);
//			}
//		}
        public List<DTZTMHRPYES032> getItem() {
            if (item == null) {
                item = new ArrayList<DTZTMHRPYES032>();
            }
            return this.item;
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
         * {@link DTZTMHRPYES032 }
         *
         *
         */

		public void setItem(List<DTZTMHRPYES032> item) {
			this.item = item;
		}

    }

}
