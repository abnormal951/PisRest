
package com.hitss.pis.rest.webservices.stubs.SI_ZRFCCREADOCFIF47V2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_PARTIDA complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DT_PARTIDA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NEWKO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZUMSK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WRBTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMWST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GSBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZFBDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZLSPR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZLSCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PYCUR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ZBD1P" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WSKTO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ZUONR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SGTXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_PARTIDA", propOrder = {
    "newko",
    "zumsk",
    "wrbtr",
    "xmwst",
    "gsber",
    "zfbdt",
    "zlspr",
    "zlsch",
    "pycur",
    "zbd1P",
    "wskto",
    "zuonr",
    "sgtxt"
})
public class DTPARTIDA {

    @XmlElement(name = "NEWKO")
    protected String newko;
    @XmlElement(name = "ZUMSK")
    protected String zumsk;
    @XmlElement(name = "WRBTR")
    protected String wrbtr;
    @XmlElement(name = "XMWST")
    protected String xmwst;
    @XmlElement(name = "GSBER")
    protected String gsber;
    @XmlElement(name = "ZFBDT")
    protected String zfbdt;
    @XmlElement(name = "ZLSPR")
    protected String zlspr;
    @XmlElement(name = "ZLSCH")
    protected String zlsch;
    @XmlElement(name = "PYCUR")
    protected BigDecimal pycur;
    @XmlElement(name = "ZBD1P")
    protected BigDecimal zbd1P;
    @XmlElement(name = "WSKTO")
    protected BigDecimal wskto;
    @XmlElement(name = "ZUONR")
    protected String zuonr;
    @XmlElement(name = "SGTXT")
    protected String sgtxt;

    /**
     * Obtiene el valor de la propiedad newko.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNEWKO() {
        return newko;
    }

    /**
     * Define el valor de la propiedad newko.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNEWKO(String value) {
        this.newko = value;
    }

    /**
     * Obtiene el valor de la propiedad zumsk.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZUMSK() {
        return zumsk;
    }

    /**
     * Define el valor de la propiedad zumsk.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZUMSK(String value) {
        this.zumsk = value;
    }

    /**
     * Obtiene el valor de la propiedad wrbtr.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWRBTR() {
        return wrbtr;
    }

    /**
     * Define el valor de la propiedad wrbtr.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWRBTR(String value) {
        this.wrbtr = value;
    }

    /**
     * Obtiene el valor de la propiedad xmwst.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getXMWST() {
        return xmwst;
    }

    /**
     * Define el valor de la propiedad xmwst.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setXMWST(String value) {
        this.xmwst = value;
    }

    /**
     * Obtiene el valor de la propiedad gsber.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGSBER() {
        return gsber;
    }

    /**
     * Define el valor de la propiedad gsber.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGSBER(String value) {
        this.gsber = value;
    }

    /**
     * Obtiene el valor de la propiedad zfbdt.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZFBDT() {
        return zfbdt;
    }

    /**
     * Define el valor de la propiedad zfbdt.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZFBDT(String value) {
        this.zfbdt = value;
    }

    /**
     * Obtiene el valor de la propiedad zlspr.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZLSPR() {
        return zlspr;
    }

    /**
     * Define el valor de la propiedad zlspr.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZLSPR(String value) {
        this.zlspr = value;
    }

    /**
     * Obtiene el valor de la propiedad zlsch.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZLSCH() {
        return zlsch;
    }

    /**
     * Define el valor de la propiedad zlsch.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZLSCH(String value) {
        this.zlsch = value;
    }

    /**
     * Obtiene el valor de la propiedad pycur.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPYCUR() {
        return pycur;
    }

    /**
     * Define el valor de la propiedad pycur.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPYCUR(BigDecimal value) {
        this.pycur = value;
    }

    /**
     * Obtiene el valor de la propiedad zbd1P.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getZBD1P() {
        return zbd1P;
    }

    /**
     * Define el valor de la propiedad zbd1P.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setZBD1P(BigDecimal value) {
        this.zbd1P = value;
    }

    /**
     * Obtiene el valor de la propiedad wskto.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getWSKTO() {
        return wskto;
    }

    /**
     * Define el valor de la propiedad wskto.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setWSKTO(BigDecimal value) {
        this.wskto = value;
    }

    /**
     * Obtiene el valor de la propiedad zuonr.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZUONR() {
        return zuonr;
    }

    /**
     * Define el valor de la propiedad zuonr.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZUONR(String value) {
        this.zuonr = value;
    }

    /**
     * Obtiene el valor de la propiedad sgtxt.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSGTXT() {
        return sgtxt;
    }

    /**
     * Define el valor de la propiedad sgtxt.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSGTXT(String value) {
        this.sgtxt = value;
    }

	@Override
	public String toString() {
		return "DTPARTIDA [newko=" + newko + ", zumsk=" + zumsk + ", wrbtr=" + wrbtr + ", xmwst=" + xmwst + ", gsber="
				+ gsber + ", zfbdt=" + zfbdt + ", zlspr=" + zlspr + ", zlsch=" + zlsch + ", pycur=" + pycur + ", zbd1P="
				+ zbd1P + ", wskto=" + wskto + ", zuonr=" + zuonr + ", sgtxt=" + sgtxt + "]";
	}

}
