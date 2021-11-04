
package com.hitss.pis.rest.webservices.stubs.SI_ZRFCCAPMASIVA;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_Z_RFC_CAPMASIVA_response complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_Z_RFC_CAPMASIVA_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="T_ERRSAL">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CAPMASIVA}DT_ZHRAITE001" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DT_Z_RFC_CAPMASIVA_response", propOrder = {
    "terrsal"
})
public class DTZRFCCAPMASIVAResponse {

    @XmlElement(name = "T_ERRSAL", required = true)
    protected DTZRFCCAPMASIVAResponse.TERRSAL terrsal;

    /**
     * Obtiene el valor de la propiedad terrsal.
     * 
     * @return
     *     possible object is
     *     {@link DTZRFCCAPMASIVAResponse.TERRSAL }
     *     
     */
    public DTZRFCCAPMASIVAResponse.TERRSAL getTERRSAL() {
        return terrsal;
    }

    /**
     * Define el valor de la propiedad terrsal.
     * 
     * @param value
     *     allowed object is
     *     {@link DTZRFCCAPMASIVAResponse.TERRSAL }
     *     
     */
    public void setTERRSAL(DTZRFCCAPMASIVAResponse.TERRSAL value) {
        this.terrsal = value;
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
     *         &lt;element name="item" type="{http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CAPMASIVA}DT_ZHRAITE001" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class TERRSAL {

        protected List<DTZHRAITE001> item;

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
         * {@link DTZHRAITE001 }
         * 
         * 
         */
        public List<DTZHRAITE001> getItem() {
            if (item == null) {
                item = new ArrayList<DTZHRAITE001>();
            }
            return this.item;
        }

    }

}
