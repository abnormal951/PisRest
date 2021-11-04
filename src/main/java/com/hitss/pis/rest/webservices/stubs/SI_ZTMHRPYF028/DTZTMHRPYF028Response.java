
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF028;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_ZTMHRPYF028_response complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_ZTMHRPYF028_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="T_LFB1">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{http://etelmex.jubilados.rh.telmex/consultaLFB1}DT_ZTMHRPYES030" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="T_MENSAJES">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{http://etelmex.jubilados.rh.telmex/consultaLFB1}DT_ZTMHRPYES031" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DT_ZTMHRPYF028_response", propOrder = {
    "tlfb1",
    "tmensajes"
})
public class DTZTMHRPYF028Response {

    @XmlElement(name = "T_LFB1", required = true)
    protected DTZTMHRPYF028Response.TLFB1 tlfb1;
    @XmlElement(name = "T_MENSAJES", required = true)
    protected DTZTMHRPYF028Response.TMENSAJES tmensajes;

    /**
     * Obtiene el valor de la propiedad tlfb1.
     * 
     * @return
     *     possible object is
     *     {@link DTZTMHRPYF028Response.TLFB1 }
     *     
     */
    public DTZTMHRPYF028Response.TLFB1 getTLFB1() {
        return tlfb1;
    }

    /**
     * Define el valor de la propiedad tlfb1.
     * 
     * @param value
     *     allowed object is
     *     {@link DTZTMHRPYF028Response.TLFB1 }
     *     
     */
    public void setTLFB1(DTZTMHRPYF028Response.TLFB1 value) {
        this.tlfb1 = value;
    }

    /**
     * Obtiene el valor de la propiedad tmensajes.
     * 
     * @return
     *     possible object is
     *     {@link DTZTMHRPYF028Response.TMENSAJES }
     *     
     */
    public DTZTMHRPYF028Response.TMENSAJES getTMENSAJES() {
        return tmensajes;
    }

    /**
     * Define el valor de la propiedad tmensajes.
     * 
     * @param value
     *     allowed object is
     *     {@link DTZTMHRPYF028Response.TMENSAJES }
     *     
     */
    public void setTMENSAJES(DTZTMHRPYF028Response.TMENSAJES value) {
        this.tmensajes = value;
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
     *         &lt;element name="item" type="{http://etelmex.jubilados.rh.telmex/consultaLFB1}DT_ZTMHRPYES030" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class TLFB1 {

        protected List<DTZTMHRPYES030> item;

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
         * {@link DTZTMHRPYES030 }
         * 
         * 
         */
        public List<DTZTMHRPYES030> getItem() {
            if (item == null) {
                item = new ArrayList<DTZTMHRPYES030>();
            }
            return this.item;
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
     *         &lt;element name="item" type="{http://etelmex.jubilados.rh.telmex/consultaLFB1}DT_ZTMHRPYES031" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class TMENSAJES {

        protected List<DTZTMHRPYES031> item;

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
         * {@link DTZTMHRPYES031 }
         * 
         * 
         */
        public List<DTZTMHRPYES031> getItem() {
            if (item == null) {
                item = new ArrayList<DTZTMHRPYES031>();
            }
            return this.item;
        }

    }

}
