
package com.hitss.pis.rest.webservices.stubs.sibapiemplcommgetdetailedlistv2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_BAPI_EMPLCOMM_GETDETAILEDLIST_request complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_BAPI_EMPLCOMM_GETDETAILEDLIST_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPLOYEENUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SUBTYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TIMEINTERVALLOW" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TIMEINTERVALHIGH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_BAPI_EMPLCOMM_GETDETAILEDLIST_request", propOrder = {
    "employeenumber",
    "subtype",
    "timeintervallow",
    "timeintervalhigh"
})
public class DTBAPIEMPLCOMMGETDETAILEDLISTRequest {

    @XmlElement(name = "EMPLOYEENUMBER", required = true)
    protected String employeenumber;
    @XmlElement(name = "SUBTYPE", required = true)
    protected String subtype;
    @XmlElement(name = "TIMEINTERVALLOW", required = true)
    protected String timeintervallow;
    @XmlElement(name = "TIMEINTERVALHIGH", required = true)
    protected String timeintervalhigh;

    /**
     * Obtiene el valor de la propiedad employeenumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPLOYEENUMBER() {
        return employeenumber;
    }

    /**
     * Define el valor de la propiedad employeenumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPLOYEENUMBER(String value) {
        this.employeenumber = value;
    }

    /**
     * Obtiene el valor de la propiedad subtype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBTYPE() {
        return subtype;
    }

    /**
     * Define el valor de la propiedad subtype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBTYPE(String value) {
        this.subtype = value;
    }

    /**
     * Obtiene el valor de la propiedad timeintervallow.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIMEINTERVALLOW() {
        return timeintervallow;
    }

    /**
     * Define el valor de la propiedad timeintervallow.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIMEINTERVALLOW(String value) {
        this.timeintervallow = value;
    }

    /**
     * Obtiene el valor de la propiedad timeintervalhigh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIMEINTERVALHIGH() {
        return timeintervalhigh;
    }

    /**
     * Define el valor de la propiedad timeintervalhigh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIMEINTERVALHIGH(String value) {
        this.timeintervalhigh = value;
    }

}
