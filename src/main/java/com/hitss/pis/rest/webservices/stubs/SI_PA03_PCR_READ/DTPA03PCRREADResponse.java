
package com.hitss.pis.rest.webservices.stubs.SI_PA03_PCR_READ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para DT_PA03_PCR_READ_response complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_PA03_PCR_READ_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="F_STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="F_CURRENT_PERIOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="F_CURRENT_YEAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="F_PERMO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="F_DATMO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="F_CURRENT_BEGDA" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="F_CURRENT_ENDDA" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="F_FOLLOWING_PERIOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="F_FOLLOWING_YEAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="F_FOLLOWING_BEGDA" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="F_FOLLOWING_ENDDA" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="F_TWM_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="F_ABKRS_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="F_STATE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_PA03_PCR_READ_response", propOrder = {
    "fstate",
    "fcurrentperiod",
    "fcurrentyear",
    "fpermo",
    "fdatmo",
    "fcurrentbegda",
    "fcurrentendda",
    "ffollowingperiod",
    "ffollowingyear",
    "ffollowingbegda",
    "ffollowingendda",
    "ftwmdate",
    "fabkrstext",
    "fstatetext"
})
public class DTPA03PCRREADResponse {

    @XmlElement(name = "F_STATE")
    protected String fstate;
    @XmlElement(name = "F_CURRENT_PERIOD")
    protected String fcurrentperiod;
    @XmlElement(name = "F_CURRENT_YEAR")
    protected String fcurrentyear;
    @XmlElement(name = "F_PERMO")
    protected String fpermo;
    @XmlElement(name = "F_DATMO")
    protected String fdatmo;
    @XmlElement(name = "F_CURRENT_BEGDA")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fcurrentbegda;
    @XmlElement(name = "F_CURRENT_ENDDA")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fcurrentendda;
    @XmlElement(name = "F_FOLLOWING_PERIOD")
    protected String ffollowingperiod;
    @XmlElement(name = "F_FOLLOWING_YEAR")
    protected String ffollowingyear;
    @XmlElement(name = "F_FOLLOWING_BEGDA")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ffollowingbegda;
    @XmlElement(name = "F_FOLLOWING_ENDDA")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ffollowingendda;
    @XmlElement(name = "F_TWM_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ftwmdate;
    @XmlElement(name = "F_ABKRS_TEXT")
    protected String fabkrstext;
    @XmlElement(name = "F_STATE_TEXT")
    protected String fstatetext;

    /**
     * Obtiene el valor de la propiedad fstate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSTATE() {
        return fstate;
    }

    /**
     * Define el valor de la propiedad fstate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSTATE(String value) {
        this.fstate = value;
    }

    /**
     * Obtiene el valor de la propiedad fcurrentperiod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCURRENTPERIOD() {
        return fcurrentperiod;
    }

    /**
     * Define el valor de la propiedad fcurrentperiod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCURRENTPERIOD(String value) {
        this.fcurrentperiod = value;
    }

    /**
     * Obtiene el valor de la propiedad fcurrentyear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCURRENTYEAR() {
        return fcurrentyear;
    }

    /**
     * Define el valor de la propiedad fcurrentyear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCURRENTYEAR(String value) {
        this.fcurrentyear = value;
    }

    /**
     * Obtiene el valor de la propiedad fpermo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFPERMO() {
        return fpermo;
    }

    /**
     * Define el valor de la propiedad fpermo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFPERMO(String value) {
        this.fpermo = value;
    }

    /**
     * Obtiene el valor de la propiedad fdatmo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFDATMO() {
        return fdatmo;
    }

    /**
     * Define el valor de la propiedad fdatmo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFDATMO(String value) {
        this.fdatmo = value;
    }

    /**
     * Obtiene el valor de la propiedad fcurrentbegda.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFCURRENTBEGDA() {
        return fcurrentbegda;
    }

    /**
     * Define el valor de la propiedad fcurrentbegda.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFCURRENTBEGDA(XMLGregorianCalendar value) {
        this.fcurrentbegda = value;
    }

    /**
     * Obtiene el valor de la propiedad fcurrentendda.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFCURRENTENDDA() {
        return fcurrentendda;
    }

    /**
     * Define el valor de la propiedad fcurrentendda.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFCURRENTENDDA(XMLGregorianCalendar value) {
        this.fcurrentendda = value;
    }

    /**
     * Obtiene el valor de la propiedad ffollowingperiod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFOLLOWINGPERIOD() {
        return ffollowingperiod;
    }

    /**
     * Define el valor de la propiedad ffollowingperiod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFOLLOWINGPERIOD(String value) {
        this.ffollowingperiod = value;
    }

    /**
     * Obtiene el valor de la propiedad ffollowingyear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFOLLOWINGYEAR() {
        return ffollowingyear;
    }

    /**
     * Define el valor de la propiedad ffollowingyear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFOLLOWINGYEAR(String value) {
        this.ffollowingyear = value;
    }

    /**
     * Obtiene el valor de la propiedad ffollowingbegda.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFFOLLOWINGBEGDA() {
        return ffollowingbegda;
    }

    /**
     * Define el valor de la propiedad ffollowingbegda.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFFOLLOWINGBEGDA(XMLGregorianCalendar value) {
        this.ffollowingbegda = value;
    }

    /**
     * Obtiene el valor de la propiedad ffollowingendda.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFFOLLOWINGENDDA() {
        return ffollowingendda;
    }

    /**
     * Define el valor de la propiedad ffollowingendda.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFFOLLOWINGENDDA(XMLGregorianCalendar value) {
        this.ffollowingendda = value;
    }

    /**
     * Obtiene el valor de la propiedad ftwmdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFTWMDATE() {
        return ftwmdate;
    }

    /**
     * Define el valor de la propiedad ftwmdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFTWMDATE(XMLGregorianCalendar value) {
        this.ftwmdate = value;
    }

    /**
     * Obtiene el valor de la propiedad fabkrstext.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFABKRSTEXT() {
        return fabkrstext;
    }

    /**
     * Define el valor de la propiedad fabkrstext.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFABKRSTEXT(String value) {
        this.fabkrstext = value;
    }

    /**
     * Obtiene el valor de la propiedad fstatetext.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSTATETEXT() {
        return fstatetext;
    }

    /**
     * Define el valor de la propiedad fstatetext.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSTATETEXT(String value) {
        this.fstatetext = value;
    }

}
