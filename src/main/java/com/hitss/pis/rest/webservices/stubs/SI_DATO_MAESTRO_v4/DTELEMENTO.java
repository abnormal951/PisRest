
package com.hitss.pis.rest.webservices.stubs.SI_DATO_MAESTRO_v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_ELEMENTO complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DT_ELEMENTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXPSOLICITA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d+"/>
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IDMOVIMIENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="T_ENTRADA">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BUKRS" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PERNR" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "DT_ELEMENTO", propOrder = {
    "expsolicita",
    "idmovimiento",
    "tentrada"
})
public class DTELEMENTO {

    @XmlElement(name = "EXPSOLICITA", required = true)
    protected String expsolicita;
    @XmlElement(name = "IDMOVIMIENTO", required = true)
    protected String idmovimiento;
    @XmlElement(name = "T_ENTRADA", required = true)
    protected DTELEMENTO.TENTRADA tentrada;

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
     *     {@link DTELEMENTO.TENTRADA }
     *
     */
    public DTELEMENTO.TENTRADA getTENTRADA() {
        return tentrada;
    }

    /**
     * Define el valor de la propiedad tentrada.
     *
     * @param value
     *     allowed object is
     *     {@link DTELEMENTO.TENTRADA }
     *
     */
    public void setTENTRADA(DTELEMENTO.TENTRADA value) {
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
     *         &lt;element name="item" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BUKRS" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PERNR" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
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
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class TENTRADA {

        @XmlElement(required = true)
        protected List<DTELEMENTO.TENTRADA.Item> item;

//        public void setItem(DTELEMENTO.TENTRADA.Item elemento) {
//			if (item == null) {
//				item = new ArrayList<DTELEMENTO.TENTRADA.Item>();
//			}
//
//			if (elemento != null) {
//				item.add(elemento);
//			}
//		}
        public void setItem(List<DTELEMENTO.TENTRADA.Item> item) {
			this.item = item;
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
         * {@link DTELEMENTO.TENTRADA.Item }
         *
         *
         */
        public List<DTELEMENTO.TENTRADA.Item> getItem() {
            if (item == null) {
                item = new ArrayList<DTELEMENTO.TENTRADA.Item>();
            }
            return this.item;
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
         *         &lt;element name="BUKRS" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PERNR" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
        @XmlType(name = "", propOrder = {
            "bukrs",
            "pernr"
        })
        public static class Item {

            @XmlElement(name = "BUKRS")
            protected String bukrs;
            @XmlElement(name = "PERNR")
            protected String pernr;

            /**
             * Obtiene el valor de la propiedad bukrs.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBUKRS() {
                return bukrs;
            }

            /**
             * Define el valor de la propiedad bukrs.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBUKRS(String value) {
                this.bukrs = value;
            }

            /**
             * Obtiene el valor de la propiedad pernr.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPERNR() {
                return pernr;
            }

            /**
             * Define el valor de la propiedad pernr.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPERNR(String value) {
                this.pernr = value;
            }

			@Override
			public String toString() {
				return "Item [bukrs=" + bukrs + ", pernr=" + pernr + "]";
			}

        }


		@Override
		public String toString() {
			return "TENTRADA [item=" + item + "]";
		}

    }


	@Override
	public String toString() {
		return "DTELEMENTO [expsolicita=" + expsolicita + ", idmovimiento=" + idmovimiento + ", tentrada=" + tentrada
				+ "]";
	}

}
