
package com.hitss.pis.rest.webservices.stubs.SI_PA03_PCR_READ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_PA03_PCR_READ_request complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_PA03_PCR_READ_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="F_ABKRS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ERROR_NO_ACCOUNTING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_PA03_PCR_READ_request", propOrder = {
    "fabkrs",
    "errornoaccounting"
})
public class DTPA03PCRREADRequest {

    @XmlElement(name = "F_ABKRS", required = true)
    protected String fabkrs;
    @XmlElement(name = "ERROR_NO_ACCOUNTING")
    protected String errornoaccounting;

    /**
     * Obtiene el valor de la propiedad fabkrs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFABKRS() {
        return fabkrs;
    }

    /**
     * Define el valor de la propiedad fabkrs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFABKRS(String value) {
        this.fabkrs = value;
    }

    /**
     * Obtiene el valor de la propiedad errornoaccounting.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRORNOACCOUNTING() {
        return errornoaccounting;
    }

    /**
     * Define el valor de la propiedad errornoaccounting.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRORNOACCOUNTING(String value) {
        this.errornoaccounting = value;
    }

}
