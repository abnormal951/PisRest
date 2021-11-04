
package com.hitss.pis.rest.webservices.stubs.SI_ZRFCCAPMASIVA;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_ZHRAITE001 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_ZHRAITE001">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSGERREXP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HORAS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DIAS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_ZHRAITE001", propOrder = {
    "id2",
    "msgerrexp",
    "horas",
    "dias"
})
public class DTZHRAITE001 {

    @XmlElement(name = "ID2")
    protected String id2;
    @XmlElement(name = "MSGERREXP")
    protected String msgerrexp;
    @XmlElement(name = "HORAS")
    protected BigDecimal horas;
    @XmlElement(name = "DIAS")
    protected BigDecimal dias;

    /**
     * Obtiene el valor de la propiedad id2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID2() {
        return id2;
    }

    /**
     * Define el valor de la propiedad id2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID2(String value) {
        this.id2 = value;
    }

    /**
     * Obtiene el valor de la propiedad msgerrexp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGERREXP() {
        return msgerrexp;
    }

    /**
     * Define el valor de la propiedad msgerrexp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGERREXP(String value) {
        this.msgerrexp = value;
    }

    /**
     * Obtiene el valor de la propiedad horas.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHORAS() {
        return horas;
    }

    /**
     * Define el valor de la propiedad horas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHORAS(BigDecimal value) {
        this.horas = value;
    }

    /**
     * Obtiene el valor de la propiedad dias.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDIAS() {
        return dias;
    }

    /**
     * Define el valor de la propiedad dias.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDIAS(BigDecimal value) {
        this.dias = value;
    }

}
