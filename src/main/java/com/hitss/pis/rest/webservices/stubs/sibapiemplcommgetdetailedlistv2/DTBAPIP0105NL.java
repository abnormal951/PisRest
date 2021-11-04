
package com.hitss.pis.rest.webservices.stubs.sibapiemplcommgetdetailedlistv2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_BAPIP0105NL complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_BAPIP0105NL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPLOYEENO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d+"/>
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SUBTYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OBJECTID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LOCKINDIC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALIDEND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VALIDBEGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECORDNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d+"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COMMTYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NAMEOFCOMMTYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="241"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DELIMIT_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_BAPIP0105NL", propOrder = {
    "employeeno",
    "subtype",
    "objectid",
    "lockindic",
    "validend",
    "validbegin",
    "recordnr",
    "commtype",
    "nameofcommtype",
    "id",
    "delimitdate"
})
public class DTBAPIP0105NL {

    @XmlElement(name = "EMPLOYEENO")
    protected String employeeno;
    @XmlElement(name = "SUBTYPE")
    protected String subtype;
    @XmlElement(name = "OBJECTID")
    protected String objectid;
    @XmlElement(name = "LOCKINDIC")
    protected String lockindic;
    @XmlElement(name = "VALIDEND")
    protected String validend;
    @XmlElement(name = "VALIDBEGIN")
    protected String validbegin;
    @XmlElement(name = "RECORDNR")
    protected String recordnr;
    @XmlElement(name = "COMMTYPE")
    protected String commtype;
    @XmlElement(name = "NAMEOFCOMMTYPE")
    protected String nameofcommtype;
    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "DELIMIT_DATE")
    protected String delimitdate;

    /**
     * Obtiene el valor de la propiedad employeeno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPLOYEENO() {
        return employeeno;
    }

    /**
     * Define el valor de la propiedad employeeno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPLOYEENO(String value) {
        this.employeeno = value;
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
     * Obtiene el valor de la propiedad objectid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBJECTID() {
        return objectid;
    }

    /**
     * Define el valor de la propiedad objectid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBJECTID(String value) {
        this.objectid = value;
    }

    /**
     * Obtiene el valor de la propiedad lockindic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCKINDIC() {
        return lockindic;
    }

    /**
     * Define el valor de la propiedad lockindic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCKINDIC(String value) {
        this.lockindic = value;
    }

    /**
     * Obtiene el valor de la propiedad validend.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALIDEND() {
        return validend;
    }

    /**
     * Define el valor de la propiedad validend.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALIDEND(String value) {
        this.validend = value;
    }

    /**
     * Obtiene el valor de la propiedad validbegin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALIDBEGIN() {
        return validbegin;
    }

    /**
     * Define el valor de la propiedad validbegin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALIDBEGIN(String value) {
        this.validbegin = value;
    }

    /**
     * Obtiene el valor de la propiedad recordnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECORDNR() {
        return recordnr;
    }

    /**
     * Define el valor de la propiedad recordnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECORDNR(String value) {
        this.recordnr = value;
    }

    /**
     * Obtiene el valor de la propiedad commtype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMTYPE() {
        return commtype;
    }

    /**
     * Define el valor de la propiedad commtype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMTYPE(String value) {
        this.commtype = value;
    }

    /**
     * Obtiene el valor de la propiedad nameofcommtype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAMEOFCOMMTYPE() {
        return nameofcommtype;
    }

    /**
     * Define el valor de la propiedad nameofcommtype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAMEOFCOMMTYPE(String value) {
        this.nameofcommtype = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad delimitdate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIMITDATE() {
        return delimitdate;
    }

    /**
     * Define el valor de la propiedad delimitdate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIMITDATE(String value) {
        this.delimitdate = value;
    }

}
