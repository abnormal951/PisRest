
package com.hitss.pis.rest.webservices.stubs.SI_ZRFCCAPMASIVA;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para DT_ZTIMPCAPMASIVA complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DT_ZTIMPCAPMASIVA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SUBTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BEGDA" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ENDDA" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PEPNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BEGUZ" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="ENDUZ" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="CAMPO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAMPO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAMPO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAMPO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAMPO5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAMPO6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAMPO7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAMPO8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAMPO9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_ZTIMPCAPMASIVA", propOrder = {
    "id",
    "subty",
    "begda",
    "endda",
    "pepnr",
    "beguz",
    "enduz",
    "campo1",
    "campo2",
    "campo3",
    "campo4",
    "campo5",
    "campo6",
    "campo7",
    "campo8",
    "campo9"
})
public class DTZTIMPCAPMASIVA {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "SUBTY")
    protected String subty;
    @XmlElement(name = "BEGDA")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar begda;
    @XmlElement(name = "ENDDA")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endda;
    @XmlElement(name = "PEPNR")
    protected String pepnr;
    @XmlElement(name = "BEGUZ")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar beguz;
    @XmlElement(name = "ENDUZ")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar enduz;
    @XmlElement(name = "CAMPO1")
    protected String campo1;
    @XmlElement(name = "CAMPO2")
    protected String campo2;
    @XmlElement(name = "CAMPO3")
    protected String campo3;
    @XmlElement(name = "CAMPO4")
    protected String campo4;
    @XmlElement(name = "CAMPO5")
    protected String campo5;
    @XmlElement(name = "CAMPO6")
    protected String campo6;
    @XmlElement(name = "CAMPO7")
    protected String campo7;
    @XmlElement(name = "CAMPO8")
    protected String campo8;
    @XmlElement(name = "CAMPO9")
    protected String campo9;

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
     * Obtiene el valor de la propiedad begda.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getBEGDA() {
        return begda;
    }

    /**
     * Define el valor de la propiedad begda.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setBEGDA(XMLGregorianCalendar value) {
        this.begda = value;
    }

    /**
     * Obtiene el valor de la propiedad endda.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getENDDA() {
        return endda;
    }

    /**
     * Define el valor de la propiedad endda.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setENDDA(XMLGregorianCalendar value) {
        this.endda = value;
    }

    /**
     * Obtiene el valor de la propiedad pepnr.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPEPNR() {
        return pepnr;
    }

    /**
     * Define el valor de la propiedad pepnr.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPEPNR(String value) {
        this.pepnr = value;
    }

    /**
     * Obtiene el valor de la propiedad beguz.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getBEGUZ() {
        return beguz;
    }

    /**
     * Define el valor de la propiedad beguz.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setBEGUZ(XMLGregorianCalendar value) {
        this.beguz = value;
    }

    /**
     * Obtiene el valor de la propiedad enduz.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getENDUZ() {
        return enduz;
    }

    /**
     * Define el valor de la propiedad enduz.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setENDUZ(XMLGregorianCalendar value) {
        this.enduz = value;
    }

    /**
     * Obtiene el valor de la propiedad campo1.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCAMPO1() {
        return campo1;
    }

    /**
     * Define el valor de la propiedad campo1.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCAMPO1(String value) {
        this.campo1 = value;
    }

    /**
     * Obtiene el valor de la propiedad campo2.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCAMPO2() {
        return campo2;
    }

    /**
     * Define el valor de la propiedad campo2.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCAMPO2(String value) {
        this.campo2 = value;
    }

    /**
     * Obtiene el valor de la propiedad campo3.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCAMPO3() {
        return campo3;
    }

    /**
     * Define el valor de la propiedad campo3.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCAMPO3(String value) {
        this.campo3 = value;
    }

    /**
     * Obtiene el valor de la propiedad campo4.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCAMPO4() {
        return campo4;
    }

    /**
     * Define el valor de la propiedad campo4.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCAMPO4(String value) {
        this.campo4 = value;
    }

    /**
     * Obtiene el valor de la propiedad campo5.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCAMPO5() {
        return campo5;
    }

    /**
     * Define el valor de la propiedad campo5.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCAMPO5(String value) {
        this.campo5 = value;
    }

    /**
     * Obtiene el valor de la propiedad campo6.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCAMPO6() {
        return campo6;
    }

    /**
     * Define el valor de la propiedad campo6.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCAMPO6(String value) {
        this.campo6 = value;
    }

    /**
     * Obtiene el valor de la propiedad campo7.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCAMPO7() {
        return campo7;
    }

    /**
     * Define el valor de la propiedad campo7.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCAMPO7(String value) {
        this.campo7 = value;
    }

    /**
     * Obtiene el valor de la propiedad campo8.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCAMPO8() {
        return campo8;
    }

    /**
     * Define el valor de la propiedad campo8.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCAMPO8(String value) {
        this.campo8 = value;
    }

    /**
     * Obtiene el valor de la propiedad campo9.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCAMPO9() {
        return campo9;
    }

    /**
     * Define el valor de la propiedad campo9.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCAMPO9(String value) {
        this.campo9 = value;
    }

	@Override
	public String toString() {
		return "DTZTIMPCAPMASIVA [id=" + id + ", subty=" + subty + ", begda=" + begda + ", endda=" + endda + ", pepnr="
				+ pepnr + ", beguz=" + beguz + ", enduz=" + enduz + ", campo1=" + campo1 + ", campo2=" + campo2
				+ ", campo3=" + campo3 + ", campo4=" + campo4 + ", campo5=" + campo5 + ", campo6=" + campo6
				+ ", campo7=" + campo7 + ", campo8=" + campo8 + ", campo9=" + campo9 + "]";
	}

}
