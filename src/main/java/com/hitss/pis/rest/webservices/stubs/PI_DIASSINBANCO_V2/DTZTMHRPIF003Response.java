
package com.hitss.pis.rest.webservices.stubs.PI_DIASSINBANCO_V2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_ZTMHRPIF003_response complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_ZTMHRPIF003_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TI_ZTMHRPYT122" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Item" type="{http://consultas.modernizacion.hr/ZTMHRPIF003}DT_ZTMHRPYT122" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="T_MENSAJES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Item" type="{http://consultas.modernizacion.hr/ZTMHRPIF003}DT_ZMENSAJESPI3" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DT_ZTMHRPIF003_response", propOrder = {
    "tiztmhrpyt122",
    "tmensajes"
})
public class DTZTMHRPIF003Response {

    @XmlElement(name = "TI_ZTMHRPYT122")
    protected DTZTMHRPIF003Response.TIZTMHRPYT122 tiztmhrpyt122;
    @XmlElement(name = "T_MENSAJES")
    protected DTZTMHRPIF003Response.TMENSAJES tmensajes;

    /**
     * Obtiene el valor de la propiedad tiztmhrpyt122.
     * 
     * @return
     *     possible object is
     *     {@link DTZTMHRPIF003Response.TIZTMHRPYT122 }
     *     
     */
    public DTZTMHRPIF003Response.TIZTMHRPYT122 getTIZTMHRPYT122() {
        return tiztmhrpyt122;
    }

    /**
     * Define el valor de la propiedad tiztmhrpyt122.
     * 
     * @param value
     *     allowed object is
     *     {@link DTZTMHRPIF003Response.TIZTMHRPYT122 }
     *     
     */
    public void setTIZTMHRPYT122(DTZTMHRPIF003Response.TIZTMHRPYT122 value) {
        this.tiztmhrpyt122 = value;
    }

    /**
     * Obtiene el valor de la propiedad tmensajes.
     * 
     * @return
     *     possible object is
     *     {@link DTZTMHRPIF003Response.TMENSAJES }
     *     
     */
    public DTZTMHRPIF003Response.TMENSAJES getTMENSAJES() {
        return tmensajes;
    }

    /**
     * Define el valor de la propiedad tmensajes.
     * 
     * @param value
     *     allowed object is
     *     {@link DTZTMHRPIF003Response.TMENSAJES }
     *     
     */
    public void setTMENSAJES(DTZTMHRPIF003Response.TMENSAJES value) {
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
     *         &lt;element name="Item" type="{http://consultas.modernizacion.hr/ZTMHRPIF003}DT_ZTMHRPYT122" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class TIZTMHRPYT122 {

        @XmlElement(name = "Item")
        protected List<DTZTMHRPYT122> item;

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
         * {@link DTZTMHRPYT122 }
         * 
         * 
         */
        public List<DTZTMHRPYT122> getItem() {
            if (item == null) {
                item = new ArrayList<DTZTMHRPYT122>();
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
     *         &lt;element name="Item" type="{http://consultas.modernizacion.hr/ZTMHRPIF003}DT_ZMENSAJESPI3" maxOccurs="unbounded" minOccurs="0"/>
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
        protected List<DTZMENSAJESPI3> item;

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
         * {@link DTZMENSAJESPI3 }
         * 
         * 
         */
        public List<DTZMENSAJESPI3> getItem() {
            if (item == null) {
                item = new ArrayList<DTZMENSAJESPI3>();
            }
            return this.item;
        }

    }

}
