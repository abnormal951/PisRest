
package com.hitss.pis.rest.webservices.stubs.SI_ZRFCCAPMASIVA;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>Clase Java para DT_Z_RFC_CAPMASIVA_request complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DT_Z_RFC_CAPMASIVA_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="I_INFTY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="I_CTAGEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="I_JEFE_IN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="I_CAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="T_EXPENT">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CAPMASIVA}DT_ZTIMPCAPMASIVA" maxOccurs="unbounded"/>
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
@XmlType(name = "DT_Z_RFC_CAPMASIVA_request", propOrder = {
    "iinfty",
    "ictagen",
    "ijefein",
    "icap",
    "texpent"
})
public class DTZRFCCAPMASIVARequest {

    @XmlElement(name = "I_INFTY", required = true)
    protected String iinfty;
    @XmlElement(name = "I_CTAGEN", required = true)
    protected String ictagen;
    @XmlElement(name = "I_JEFE_IN", required = true)
    protected String ijefein;
    @XmlElement(name = "I_CAP")
    protected String icap;
    @XmlElement(name = "T_EXPENT", required = true)
    protected DTZRFCCAPMASIVARequest.TEXPENT texpent;

    /**
     * Obtiene el valor de la propiedad iinfty.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIINFTY() {
        return iinfty;
    }

    /**
     * Define el valor de la propiedad iinfty.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIINFTY(String value) {
        this.iinfty = value;
    }

    /**
     * Obtiene el valor de la propiedad ictagen.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getICTAGEN() {
        return ictagen;
    }

    /**
     * Define el valor de la propiedad ictagen.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setICTAGEN(String value) {
        this.ictagen = value;
    }

    /**
     * Obtiene el valor de la propiedad ijefein.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIJEFEIN() {
        return ijefein;
    }

    /**
     * Define el valor de la propiedad ijefein.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIJEFEIN(String value) {
        this.ijefein = value;
    }

    /**
     * Obtiene el valor de la propiedad icap.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getICAP() {
        return icap;
    }

    /**
     * Define el valor de la propiedad icap.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setICAP(String value) {
        this.icap = value;
    }

    /**
     * Obtiene el valor de la propiedad texpent.
     *
     * @return
     *     possible object is
     *     {@link DTZRFCCAPMASIVARequest.TEXPENT }
     *
     */
    public DTZRFCCAPMASIVARequest.TEXPENT getTEXPENT() {
        return texpent;
    }

    /**
     * Define el valor de la propiedad texpent.
     *
     * @param value
     *     allowed object is
     *     {@link DTZRFCCAPMASIVARequest.TEXPENT }
     *
     */
    public void setTEXPENT(DTZRFCCAPMASIVARequest.TEXPENT value) {
        this.texpent = value;
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
     *         &lt;element name="item" type="{http://etelmex.prestamos.omsasi.rh.tmx/Z_RFC_CAPMASIVA}DT_ZTIMPCAPMASIVA" maxOccurs="unbounded"/>
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
    public static class TEXPENT {

        @XmlElement(required = true)
        protected List<DTZTIMPCAPMASIVA> item;

//        public void setItem(DTZTIMPCAPMASIVA elemento) {
//			if (item == null) {
//				item = new ArrayList<DTZTIMPCAPMASIVA>();
//			}
//			if (elemento != null) {
//				item.add(elemento);
//			}
//		}


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
         * {@link DTZTIMPCAPMASIVA }
         *
         *
         */
        public List<DTZTIMPCAPMASIVA> getItem() {
            if (item == null) {
                item = new ArrayList<DTZTIMPCAPMASIVA>();
            }
            return this.item;
        }

		public void setItem(List<DTZTIMPCAPMASIVA> item) {
			this.item = item;
		}

		@Override
		public String toString() {
			return "TEXPENT [item=" + item + "]";
		}

    }

}
