
package com.hitss.pis.rest.webservices.stubs.SI_ZRFCCREADOCFIF47V2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_Z_RFC_CREA_DOC_FI_F47_response complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DT_Z_RFC_CREA_DOC_FI_F47_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RESULTADO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="E_ERROR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="E_DOCUMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_Z_RFC_CREA_DOC_FI_F47_response", propOrder = {
    "resultado",
    "eerror",
    "edocumento"
})
public class DTZRFCCREADOCFIF47Response {

    @XmlElement(name = "RESULTADO", required = true)
    protected String resultado;
    @XmlElement(name = "E_ERROR", required = true)
    protected String eerror;
    @XmlElement(name = "E_DOCUMENTO", required = true)
    protected String edocumento;

    /**
     * Obtiene el valor de la propiedad resultado.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRESULTADO() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRESULTADO(String value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad eerror.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEERROR() {
        return eerror;
    }

    /**
     * Define el valor de la propiedad eerror.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEERROR(String value) {
        this.eerror = value;
    }

    /**
     * Obtiene el valor de la propiedad edocumento.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEDOCUMENTO() {
        return edocumento;
    }

    /**
     * Define el valor de la propiedad edocumento.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEDOCUMENTO(String value) {
        this.edocumento = value;
    }

	@Override
	public String toString() {
		return "DTZRFCCREADOCFIF47Response [resultado=" + resultado + ", eerror=" + eerror + ", edocumento="
				+ edocumento + "]";
	}

}
