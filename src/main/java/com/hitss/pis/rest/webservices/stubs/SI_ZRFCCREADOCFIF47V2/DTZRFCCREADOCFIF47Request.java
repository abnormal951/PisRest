
package com.hitss.pis.rest.webservices.stubs.SI_ZRFCCREADOCFIF47V2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_Z_RFC_CREA_DOC_FI_F47_request complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DT_Z_RFC_CREA_DOC_FI_F47_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IMODO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MAESTRO">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CREA_DOC_FI_F47}DT_MAESTRO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PARTIDA">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CREA_DOC_FI_F47}DT_PARTIDA" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DT_Z_RFC_CREA_DOC_FI_F47_request", propOrder = {
    "imodo",
    "maestro",
    "partida"
})
public class DTZRFCCREADOCFIF47Request {

    @XmlElement(name = "IMODO", required = true)
    protected String imodo;
    @XmlElement(name = "MAESTRO", required = true)
    protected DTZRFCCREADOCFIF47Request.MAESTRO maestro;
    @XmlElement(name = "PARTIDA", required = true)
    protected DTZRFCCREADOCFIF47Request.PARTIDA partida;

    /**
     * Obtiene el valor de la propiedad imodo.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIMODO() {
        return imodo;
    }

    /**
     * Define el valor de la propiedad imodo.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIMODO(String value) {
        this.imodo = value;
    }

    /**
     * Obtiene el valor de la propiedad maestro.
     *
     * @return
     *     possible object is
     *     {@link DTZRFCCREADOCFIF47Request.MAESTRO }
     *
     */
    public DTZRFCCREADOCFIF47Request.MAESTRO getMAESTRO() {
        return maestro;
    }

    /**
     * Define el valor de la propiedad maestro.
     *
     * @param value
     *     allowed object is
     *     {@link DTZRFCCREADOCFIF47Request.MAESTRO }
     *
     */
    public void setMAESTRO(DTZRFCCREADOCFIF47Request.MAESTRO value) {
        this.maestro = value;
    }

    /**
     * Obtiene el valor de la propiedad partida.
     *
     * @return
     *     possible object is
     *     {@link DTZRFCCREADOCFIF47Request.PARTIDA }
     *
     */
    public DTZRFCCREADOCFIF47Request.PARTIDA getPARTIDA() {
        return partida;
    }

    /**
     * Define el valor de la propiedad partida.
     *
     * @param value
     *     allowed object is
     *     {@link DTZRFCCREADOCFIF47Request.PARTIDA }
     *
     */
    public void setPARTIDA(DTZRFCCREADOCFIF47Request.PARTIDA value) {
        this.partida = value;
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
     *         &lt;element name="item" type="{http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CREA_DOC_FI_F47}DT_MAESTRO" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class MAESTRO {

        protected List<DTMAESTRO> item;


        public void setItem(List<DTMAESTRO> item) {
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
         * {@link DTMAESTRO }
         *
         *
         */
        public List<DTMAESTRO> getItem() {
            if (item == null) {
                item = new ArrayList<DTMAESTRO>();
            }
            return this.item;
        }


		@Override
		public String toString() {
			return "MAESTRO [item=" + item + "]";
		}

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
     *         &lt;element name="item" type="{http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CREA_DOC_FI_F47}DT_PARTIDA" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class PARTIDA {

        protected List<DTPARTIDA> item;



        public void setItem(List<DTPARTIDA> item) {
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
         * {@link DTPARTIDA }
         *
         *
         */
        public List<DTPARTIDA> getItem() {
            if (item == null) {
                item = new ArrayList<DTPARTIDA>();
            }
            return this.item;
        }



		@Override
		public String toString() {
			return "PARTIDA [item=" + item + "]";
		}

    }


	@Override
	public String toString() {
		return "DTZRFCCREADOCFIF47Request [imodo=" + imodo + ", maestro=" + maestro + ", partida=" + partida + "]";
	}

}
