
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPIF007;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_ZHRATT030E complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_ZHRATT030E">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXPSOLICITA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDMOVIMIENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MANDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CICLO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PERIODO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BEGDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENDDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPERI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FPERI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SACHZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AEDTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_ZHRATT030E", propOrder = {
    "expsolicita",
    "idmovimiento",
    "mandt",
    "pernr",
    "ciclo",
    "periodo",
    "begda",
    "endda",
    "iperi",
    "fperi",
    "sachz",
    "aedtm",
    "uname"
})
public class DTZHRATT030E {

    @XmlElement(name = "EXPSOLICITA")
    protected String expsolicita;
    @XmlElement(name = "IDMOVIMIENTO")
    protected String idmovimiento;
    @XmlElement(name = "MANDT")
    protected String mandt;
    @XmlElement(name = "PERNR")
    protected String pernr;
    @XmlElement(name = "CICLO")
    protected String ciclo;
    @XmlElement(name = "PERIODO")
    protected String periodo;
    @XmlElement(name = "BEGDA")
    protected String begda;
    @XmlElement(name = "ENDDA")
    protected String endda;
    @XmlElement(name = "IPERI")
    protected String iperi;
    @XmlElement(name = "FPERI")
    protected String fperi;
    @XmlElement(name = "SACHZ")
    protected String sachz;
    @XmlElement(name = "AEDTM")
    protected String aedtm;
    @XmlElement(name = "UNAME")
    protected String uname;

    /**
     * Obtiene el valor de la propiedad expsolicita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPSOLICITA() {
        return expsolicita;
    }

    /**
     * Define el valor de la propiedad expsolicita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPSOLICITA(String value) {
        this.expsolicita = value;
    }

    /**
     * Obtiene el valor de la propiedad idmovimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDMOVIMIENTO() {
        return idmovimiento;
    }

    /**
     * Define el valor de la propiedad idmovimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDMOVIMIENTO(String value) {
        this.idmovimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad mandt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANDT() {
        return mandt;
    }

    /**
     * Define el valor de la propiedad mandt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANDT(String value) {
        this.mandt = value;
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
     * Obtiene el valor de la propiedad ciclo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCICLO() {
        return ciclo;
    }

    /**
     * Define el valor de la propiedad ciclo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCICLO(String value) {
        this.ciclo = value;
    }

    /**
     * Obtiene el valor de la propiedad periodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERIODO() {
        return periodo;
    }

    /**
     * Define el valor de la propiedad periodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERIODO(String value) {
        this.periodo = value;
    }

    /**
     * Obtiene el valor de la propiedad begda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEGDA() {
        return begda;
    }

    /**
     * Define el valor de la propiedad begda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEGDA(String value) {
        this.begda = value;
    }

    /**
     * Obtiene el valor de la propiedad endda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDDA() {
        return endda;
    }

    /**
     * Define el valor de la propiedad endda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDDA(String value) {
        this.endda = value;
    }

    /**
     * Obtiene el valor de la propiedad iperi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPERI() {
        return iperi;
    }

    /**
     * Define el valor de la propiedad iperi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPERI(String value) {
        this.iperi = value;
    }

    /**
     * Obtiene el valor de la propiedad fperi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFPERI() {
        return fperi;
    }

    /**
     * Define el valor de la propiedad fperi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFPERI(String value) {
        this.fperi = value;
    }

    /**
     * Obtiene el valor de la propiedad sachz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSACHZ() {
        return sachz;
    }

    /**
     * Define el valor de la propiedad sachz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSACHZ(String value) {
        this.sachz = value;
    }

    /**
     * Obtiene el valor de la propiedad aedtm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAEDTM() {
        return aedtm;
    }

    /**
     * Define el valor de la propiedad aedtm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAEDTM(String value) {
        this.aedtm = value;
    }

    /**
     * Obtiene el valor de la propiedad uname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNAME() {
        return uname;
    }

    /**
     * Define el valor de la propiedad uname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNAME(String value) {
        this.uname = value;
    }

}
