
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF022;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_ZTMHRPYES023 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_ZTMHRPYES023">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXPSOLICITA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDMOVIMIENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MANDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUBTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZREFER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECPROC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMPANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PERLIQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_ZTMHRPYES023", propOrder = {
    "expsolicita",
    "idmovimiento",
    "mandt",
    "pernr",
    "subty",
    "zrefer",
    "fecproc",
    "impant",
    "perliq"
})
public class DTZTMHRPYES023 {

    @XmlElement(name = "EXPSOLICITA")
    protected String expsolicita;
    @XmlElement(name = "IDMOVIMIENTO")
    protected String idmovimiento;
    @XmlElement(name = "MANDT")
    protected String mandt;
    @XmlElement(name = "PERNR")
    protected String pernr;
    @XmlElement(name = "SUBTY")
    protected String subty;
    @XmlElement(name = "ZREFER")
    protected String zrefer;
    @XmlElement(name = "FECPROC")
    protected String fecproc;
    @XmlElement(name = "IMPANT")
    protected String impant;
    @XmlElement(name = "PERLIQ")
    protected String perliq;

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
     * Obtiene el valor de la propiedad subty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBTY() {
        return subty;
    }

    /**
     * Define el valor de la propiedad subty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBTY(String value) {
        this.subty = value;
    }

    /**
     * Obtiene el valor de la propiedad zrefer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZREFER() {
        return zrefer;
    }

    /**
     * Define el valor de la propiedad zrefer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZREFER(String value) {
        this.zrefer = value;
    }

    /**
     * Obtiene el valor de la propiedad fecproc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECPROC() {
        return fecproc;
    }

    /**
     * Define el valor de la propiedad fecproc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECPROC(String value) {
        this.fecproc = value;
    }

    /**
     * Obtiene el valor de la propiedad impant.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPANT() {
        return impant;
    }

    /**
     * Define el valor de la propiedad impant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPANT(String value) {
        this.impant = value;
    }

    /**
     * Obtiene el valor de la propiedad perliq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERLIQ() {
        return perliq;
    }

    /**
     * Define el valor de la propiedad perliq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERLIQ(String value) {
        this.perliq = value;
    }

}
