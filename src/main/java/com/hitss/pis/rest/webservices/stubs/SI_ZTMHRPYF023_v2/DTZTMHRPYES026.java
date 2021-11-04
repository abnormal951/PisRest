
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF023_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_ZTMHRPYES026 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_ZTMHRPYES026">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXPSOLICITA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDMOVIMIENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MANDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUBTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="D_DERECHO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="D_DISFRUTADOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="D_VENCIDOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEEND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_ZTMHRPYES026", propOrder = {
    "expsolicita",
    "idmovimiento",
    "mandt",
    "pernr",
    "subty",
    "dderecho",
    "ddisfrutados",
    "dvencidos",
    "desta",
    "deend"
})
public class DTZTMHRPYES026 {

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
    @XmlElement(name = "D_DERECHO")
    protected String dderecho;
    @XmlElement(name = "D_DISFRUTADOS")
    protected String ddisfrutados;
    @XmlElement(name = "D_VENCIDOS")
    protected String dvencidos;
    @XmlElement(name = "DESTA")
    protected String desta;
    @XmlElement(name = "DEEND")
    protected String deend;

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
     * Obtiene el valor de la propiedad dderecho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDERECHO() {
        return dderecho;
    }

    /**
     * Define el valor de la propiedad dderecho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDERECHO(String value) {
        this.dderecho = value;
    }

    /**
     * Obtiene el valor de la propiedad ddisfrutados.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDISFRUTADOS() {
        return ddisfrutados;
    }

    /**
     * Define el valor de la propiedad ddisfrutados.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDISFRUTADOS(String value) {
        this.ddisfrutados = value;
    }

    /**
     * Obtiene el valor de la propiedad dvencidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVENCIDOS() {
        return dvencidos;
    }

    /**
     * Define el valor de la propiedad dvencidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVENCIDOS(String value) {
        this.dvencidos = value;
    }

    /**
     * Obtiene el valor de la propiedad desta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESTA() {
        return desta;
    }

    /**
     * Define el valor de la propiedad desta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESTA(String value) {
        this.desta = value;
    }

    /**
     * Obtiene el valor de la propiedad deend.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEEND() {
        return deend;
    }

    /**
     * Define el valor de la propiedad deend.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEEND(String value) {
        this.deend = value;
    }

}
