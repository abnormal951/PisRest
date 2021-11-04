
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF008;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_ZTMHRPIF008_response complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_ZTMHRPIF008_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="T_MENSAJES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Item" type="{http://consultas.modernizacion.hr/FechaPPV}DT_ZMENSAJESPI2" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="T_SALIDA" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Item" type="{http://consultas.modernizacion.hr/FechaPPV}DT_ZPA0019E" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DT_ZTMHRPIF008_response", propOrder = {
    "tmensajes",
    "tsalida"
})
public class DTZTMHRPIF008Response {

    @XmlElement(name = "T_MENSAJES")
    protected DTZTMHRPIF008Response.TMENSAJES tmensajes;
    @XmlElement(name = "T_SALIDA")
    protected DTZTMHRPIF008Response.TSALIDA tsalida;

    /**
     * Obtiene el valor de la propiedad tmensajes.
     * 
     * @return
     *     possible object is
     *     {@link DTZTMHRPIF008Response.TMENSAJES }
     *     
     */
    public DTZTMHRPIF008Response.TMENSAJES getTMENSAJES() {
        return tmensajes;
    }

    /**
     * Define el valor de la propiedad tmensajes.
     * 
     * @param value
     *     allowed object is
     *     {@link DTZTMHRPIF008Response.TMENSAJES }
     *     
     */
    public void setTMENSAJES(DTZTMHRPIF008Response.TMENSAJES value) {
        this.tmensajes = value;
    }

    /**
     * Obtiene el valor de la propiedad tsalida.
     * 
     * @return
     *     possible object is
     *     {@link DTZTMHRPIF008Response.TSALIDA }
     *     
     */
    public DTZTMHRPIF008Response.TSALIDA getTSALIDA() {
        return tsalida;
    }

    /**
     * Define el valor de la propiedad tsalida.
     * 
     * @param value
     *     allowed object is
     *     {@link DTZTMHRPIF008Response.TSALIDA }
     *     
     */
    public void setTSALIDA(DTZTMHRPIF008Response.TSALIDA value) {
        this.tsalida = value;
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
     *         &lt;element name="Item" type="{http://consultas.modernizacion.hr/FechaPPV}DT_ZMENSAJESPI2" maxOccurs="unbounded" minOccurs="0"/>
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

        @XmlElement(name = "Item")
        protected List<DTZMENSAJESPI2> item;

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
         * {@link DTZMENSAJESPI2 }
         * 
         * 
         */
        public List<DTZMENSAJESPI2> getItem() {
            if (item == null) {
                item = new ArrayList<DTZMENSAJESPI2>();
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
     *         &lt;element name="Item" type="{http://consultas.modernizacion.hr/FechaPPV}DT_ZPA0019E" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class TSALIDA {

        @XmlElement(name = "Item")
        protected List<DTZPA0019E> item;

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
         * {@link DTZPA0019E }
         * 
         * 
         */
        public List<DTZPA0019E> getItem() {
            if (item == null) {
                item = new ArrayList<DTZPA0019E>();
            }
            return this.item;
        }

    }

}
