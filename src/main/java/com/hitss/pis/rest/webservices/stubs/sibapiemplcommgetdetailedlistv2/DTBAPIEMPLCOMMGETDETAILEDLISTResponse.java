
package com.hitss.pis.rest.webservices.stubs.sibapiemplcommgetdetailedlistv2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_BAPI_EMPLCOMM_GETDETAILEDLIST_response complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_BAPI_EMPLCOMM_GETDETAILEDLIST_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RETURN" type="{http://etelmex.jubilados.rh.telmex/PA0105}DT_BAPIRETURN1"/>
 *         &lt;element name="COMMUNICATION">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{http://etelmex.jubilados.rh.telmex/PA0105}DT_BAPIP0105NL" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DT_BAPI_EMPLCOMM_GETDETAILEDLIST_response", propOrder = {
    "_return",
    "communication"
})
public class DTBAPIEMPLCOMMGETDETAILEDLISTResponse {

    @XmlElement(name = "RETURN", required = true)
    protected DTBAPIRETURN1 _return;
    @XmlElement(name = "COMMUNICATION", required = true)
    protected DTBAPIEMPLCOMMGETDETAILEDLISTResponse.COMMUNICATION communication;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link DTBAPIRETURN1 }
     *     
     */
    public DTBAPIRETURN1 getRETURN() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link DTBAPIRETURN1 }
     *     
     */
    public void setRETURN(DTBAPIRETURN1 value) {
        this._return = value;
    }

    /**
     * Obtiene el valor de la propiedad communication.
     * 
     * @return
     *     possible object is
     *     {@link DTBAPIEMPLCOMMGETDETAILEDLISTResponse.COMMUNICATION }
     *     
     */
    public DTBAPIEMPLCOMMGETDETAILEDLISTResponse.COMMUNICATION getCOMMUNICATION() {
        return communication;
    }

    /**
     * Define el valor de la propiedad communication.
     * 
     * @param value
     *     allowed object is
     *     {@link DTBAPIEMPLCOMMGETDETAILEDLISTResponse.COMMUNICATION }
     *     
     */
    public void setCOMMUNICATION(DTBAPIEMPLCOMMGETDETAILEDLISTResponse.COMMUNICATION value) {
        this.communication = value;
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
     *         &lt;element name="item" type="{http://etelmex.jubilados.rh.telmex/PA0105}DT_BAPIP0105NL" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class COMMUNICATION {

        protected List<DTBAPIP0105NL> item;

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
         * {@link DTBAPIP0105NL }
         * 
         * 
         */
        public List<DTBAPIP0105NL> getItem() {
            if (item == null) {
                item = new ArrayList<DTBAPIP0105NL>();
            }
            return this.item;
        }

    }

}
