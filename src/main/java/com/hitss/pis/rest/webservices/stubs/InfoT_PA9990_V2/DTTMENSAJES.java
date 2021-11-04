
package com.hitss.pis.rest.webservices.stubs.InfoT_PA9990_V2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_T_MENSAJES complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_T_MENSAJES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BUKRS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MSJ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CVE_MSJ" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "DT_T_MENSAJES", propOrder = {
    "item"
})
public class DTTMENSAJES {

    protected List<DTTMENSAJES.Item> item;

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
     * {@link DTTMENSAJES.Item }
     * 
     * 
     */
    public List<DTTMENSAJES.Item> getItem() {
        if (item == null) {
            item = new ArrayList<DTTMENSAJES.Item>();
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
     *         &lt;element name="BUKRS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MSJ" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CVE_MSJ" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "pernr",
        "status",
        "msj",
        "cvemsj"
    })
    public static class Item {

        @XmlElement(name = "BUKRS", required = true)
        protected String bukrs;
        @XmlElement(name = "PERNR", required = true)
        protected String pernr;
        @XmlElement(name = "STATUS", required = true)
        protected String status;
        @XmlElement(name = "MSJ", required = true)
        protected String msj;
        @XmlElement(name = "CVE_MSJ", required = true)
        protected String cvemsj;

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

        /**
         * Obtiene el valor de la propiedad status.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATUS() {
            return status;
        }

        /**
         * Define el valor de la propiedad status.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATUS(String value) {
            this.status = value;
        }

        /**
         * Obtiene el valor de la propiedad msj.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMSJ() {
            return msj;
        }

        /**
         * Define el valor de la propiedad msj.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMSJ(String value) {
            this.msj = value;
        }

        /**
         * Obtiene el valor de la propiedad cvemsj.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCVEMSJ() {
            return cvemsj;
        }

        /**
         * Define el valor de la propiedad cvemsj.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCVEMSJ(String value) {
            this.cvemsj = value;
        }

    }

}
