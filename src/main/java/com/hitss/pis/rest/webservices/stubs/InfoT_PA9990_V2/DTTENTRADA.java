
package com.hitss.pis.rest.webservices.stubs.InfoT_PA9990_V2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>Clase Java para DT_T_ENTRADA complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DT_T_ENTRADA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "DT_T_ENTRADA", propOrder = {
    "item"
})
public class DTTENTRADA {

    protected List<DTTENTRADA.Item> item;

    public void setItem(DTTENTRADA.Item elemento) {
		if (item == null) {
			item = new ArrayList<DTTENTRADA.Item>();
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
     * {@link DTTENTRADA.Item }
     *
     *
     */
    public List<DTTENTRADA.Item> getItem() {
        if (item == null) {
            item = new ArrayList<DTTENTRADA.Item>();
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
     *         &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "pernr"
    })
    public static class Item {

        @XmlElement(name = "PERNR", required = true)
        protected String pernr;

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

    }

}
