
package com.hitss.pis.rest.webservices.stubs.SI_ZTMHRPYF021_V2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_ZTMHRPYES022 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_ZTMHRPYES022">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXPSOLICITA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDMOVIMIENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MANDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECHA_CIERRE_NOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECHA_PRIMER_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="S_MENSUAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="S_DIARIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ANZ02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ANZ03" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="V_PAGO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_ZTMHRPYES022", propOrder = {
    "expsolicita",
    "idmovimiento",
    "mandt",
    "pernr",
    "fechacierrenom",
    "fechaprimerdesc",
    "smensual",
    "sdiario",
    "anz02",
    "anz03",
    "vpago"
})
public class DTZTMHRPYES022 {

    @XmlElement(name = "EXPSOLICITA")
    protected String expsolicita;
    @XmlElement(name = "IDMOVIMIENTO")
    protected String idmovimiento;
    @XmlElement(name = "MANDT")
    protected String mandt;
    @XmlElement(name = "PERNR")
    protected String pernr;
    @XmlElement(name = "FECHA_CIERRE_NOM")
    protected String fechacierrenom;
    @XmlElement(name = "FECHA_PRIMER_DESC")
    protected String fechaprimerdesc;
    @XmlElement(name = "S_MENSUAL")
    protected String smensual;
    @XmlElement(name = "S_DIARIO")
    protected String sdiario;
    @XmlElement(name = "ANZ02")
    protected String anz02;
    @XmlElement(name = "ANZ03")
    protected String anz03;
    @XmlElement(name = "V_PAGO")
    protected String vpago;

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
     * Obtiene el valor de la propiedad fechacierrenom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHACIERRENOM() {
        return fechacierrenom;
    }

    /**
     * Define el valor de la propiedad fechacierrenom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHACIERRENOM(String value) {
        this.fechacierrenom = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaprimerdesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAPRIMERDESC() {
        return fechaprimerdesc;
    }

    /**
     * Define el valor de la propiedad fechaprimerdesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAPRIMERDESC(String value) {
        this.fechaprimerdesc = value;
    }

    /**
     * Obtiene el valor de la propiedad smensual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMENSUAL() {
        return smensual;
    }

    /**
     * Define el valor de la propiedad smensual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMENSUAL(String value) {
        this.smensual = value;
    }

    /**
     * Obtiene el valor de la propiedad sdiario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDIARIO() {
        return sdiario;
    }

    /**
     * Define el valor de la propiedad sdiario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDIARIO(String value) {
        this.sdiario = value;
    }

    /**
     * Obtiene el valor de la propiedad anz02.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ02() {
        return anz02;
    }

    /**
     * Define el valor de la propiedad anz02.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ02(String value) {
        this.anz02 = value;
    }

    /**
     * Obtiene el valor de la propiedad anz03.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ03() {
        return anz03;
    }

    /**
     * Define el valor de la propiedad anz03.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ03(String value) {
        this.anz03 = value;
    }

    /**
     * Obtiene el valor de la propiedad vpago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVPAGO() {
        return vpago;
    }

    /**
     * Define el valor de la propiedad vpago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVPAGO(String value) {
        this.vpago = value;
    }

}
