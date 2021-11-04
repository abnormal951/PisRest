
package com.hitss.pis.rest.webservices.stubs.InfoT_PA9990_V2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_ZTMHRPIF002_response complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_ZTMHRPIF002_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="T_SALIDA">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="EXPSOLICITA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="IDMOVIMIENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="MANDT">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PERNR">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="SUBTY">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="OBJPS">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="SPRPS">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ENDDA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="BEGDA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="SEQNR">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="AEDTM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="UNAME">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="12"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="HISTO">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ITXEX">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="REFEX">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ORDEX">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ITBLD">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PREAS">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="FLAG1">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="FLAG2">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="FLAG3">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="FLAG4">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="RESE1">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="RESE2">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="GJAHR">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZFOLINT">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZCNPTO">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZFOLIO">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZDATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ZLOTE">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZMOVIM">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZREGIS">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZREFER">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="10"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZFUENT">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZCVEMT">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZNOMBR">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZCTACTB">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZUNDNEG">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZUNDGEO">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZNVLAFE">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZLUGPAG">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="5"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZSWAUS">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZRELLEN">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="29"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZUORD">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZFECHA_INT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ZCLAVE_INT">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZFAUT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ZOBS">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="VERSN">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CERRADO">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZZIDCR">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="FCIERRE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="T_MENSAJES" type="{http://consultas.modernizacion.hr/InfoT_PA9990}DT_T_MENSAJES"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_ZTMHRPIF002_response", propOrder = {
    "tsalida",
    "tmensajes"
})
public class DTZTMHRPIF002Response {

    @XmlElement(name = "T_SALIDA", required = true)
    protected DTZTMHRPIF002Response.TSALIDA tsalida;
    @XmlElement(name = "T_MENSAJES", required = true)
    protected DTTMENSAJES tmensajes;

    /**
     * Obtiene el valor de la propiedad tsalida.
     * 
     * @return
     *     possible object is
     *     {@link DTZTMHRPIF002Response.TSALIDA }
     *     
     */
    public DTZTMHRPIF002Response.TSALIDA getTSALIDA() {
        return tsalida;
    }

    /**
     * Define el valor de la propiedad tsalida.
     * 
     * @param value
     *     allowed object is
     *     {@link DTZTMHRPIF002Response.TSALIDA }
     *     
     */
    public void setTSALIDA(DTZTMHRPIF002Response.TSALIDA value) {
        this.tsalida = value;
    }

    /**
     * Obtiene el valor de la propiedad tmensajes.
     * 
     * @return
     *     possible object is
     *     {@link DTTMENSAJES }
     *     
     */
    public DTTMENSAJES getTMENSAJES() {
        return tmensajes;
    }

    /**
     * Define el valor de la propiedad tmensajes.
     * 
     * @param value
     *     allowed object is
     *     {@link DTTMENSAJES }
     *     
     */
    public void setTMENSAJES(DTTMENSAJES value) {
        this.tmensajes = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="EXPSOLICITA" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="IDMOVIMIENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="MANDT">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PERNR">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SUBTY">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="OBJPS">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SPRPS">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ENDDA" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="BEGDA" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="SEQNR">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AEDTM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="UNAME">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="12"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="HISTO">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ITXEX">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="REFEX">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ORDEX">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ITBLD">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PREAS">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FLAG1">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FLAG2">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FLAG3">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FLAG4">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="RESE1">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="RESE2">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="GJAHR">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZFOLINT">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZCNPTO">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZFOLIO">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="6"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZDATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ZLOTE">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZMOVIM">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZREGIS">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZREFER">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="10"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZFUENT">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZCVEMT">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZNOMBR">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="6"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZCTACTB">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZUNDNEG">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZUNDGEO">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZNVLAFE">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZLUGPAG">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="5"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZSWAUS">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZRELLEN">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="29"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZUORD">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZFECHA_INT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ZCLAVE_INT">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZFAUT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ZOBS">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="60"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="VERSN">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CERRADO">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZZIDCR">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FCIERRE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class TSALIDA {

        @XmlElement(required = true)
        protected List<DTZTMHRPIF002Response.TSALIDA.Item> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTZTMHRPIF002Response.TSALIDA.Item }
         * 
         * 
         */
        public List<DTZTMHRPIF002Response.TSALIDA.Item> getItem() {
            if (item == null) {
                item = new ArrayList<DTZTMHRPIF002Response.TSALIDA.Item>();
            }
            return this.item;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="EXPSOLICITA" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="IDMOVIMIENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="MANDT">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PERNR">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SUBTY">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="OBJPS">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SPRPS">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ENDDA" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="BEGDA" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="SEQNR">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="AEDTM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="UNAME">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="12"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="HISTO">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ITXEX">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="REFEX">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ORDEX">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ITBLD">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PREAS">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FLAG1">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FLAG2">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FLAG3">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FLAG4">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="RESE1">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="RESE2">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="GJAHR">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZFOLINT">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZCNPTO">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZFOLIO">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="6"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZDATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ZLOTE">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZMOVIM">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZREGIS">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZREFER">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="10"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZFUENT">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZCVEMT">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZNOMBR">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="6"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZCTACTB">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZUNDNEG">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZUNDGEO">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZNVLAFE">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZLUGPAG">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="5"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZSWAUS">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZRELLEN">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="29"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZUORD">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZFECHA_INT" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ZCLAVE_INT">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZFAUT" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ZOBS">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="VERSN">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CERRADO">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZZIDCR">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FCIERRE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "expsolicita",
            "idmovimiento",
            "mandt",
            "pernr",
            "subty",
            "objps",
            "sprps",
            "endda",
            "begda",
            "seqnr",
            "aedtm",
            "uname",
            "histo",
            "itxex",
            "refex",
            "ordex",
            "itbld",
            "preas",
            "flag1",
            "flag2",
            "flag3",
            "flag4",
            "rese1",
            "rese2",
            "gjahr",
            "zfolint",
            "zcnpto",
            "zfolio",
            "zdate",
            "zlote",
            "zmovim",
            "zregis",
            "zrefer",
            "zfuent",
            "zcvemt",
            "znombr",
            "zctactb",
            "zundneg",
            "zundgeo",
            "znvlafe",
            "zlugpag",
            "zswaus",
            "zrellen",
            "zuord",
            "zfechaint",
            "zclaveint",
            "zfaut",
            "zobs",
            "versn",
            "cerrado",
            "zzidcr",
            "fcierre"
        })
        public static class Item {

            @XmlElement(name = "EXPSOLICITA", required = true)
            protected String expsolicita;
            @XmlElement(name = "IDMOVIMIENTO", required = true)
            protected String idmovimiento;
            @XmlElement(name = "MANDT", required = true)
            protected String mandt;
            @XmlElement(name = "PERNR", required = true)
            protected String pernr;
            @XmlElement(name = "SUBTY", required = true)
            protected String subty;
            @XmlElement(name = "OBJPS", required = true)
            protected String objps;
            @XmlElement(name = "SPRPS", required = true)
            protected String sprps;
            @XmlElement(name = "ENDDA", required = true)
            protected String endda;
            @XmlElement(name = "BEGDA", required = true)
            protected String begda;
            @XmlElement(name = "SEQNR", required = true)
            protected String seqnr;
            @XmlElement(name = "AEDTM", required = true)
            protected String aedtm;
            @XmlElement(name = "UNAME", required = true)
            protected String uname;
            @XmlElement(name = "HISTO", required = true)
            protected String histo;
            @XmlElement(name = "ITXEX", required = true)
            protected String itxex;
            @XmlElement(name = "REFEX", required = true)
            protected String refex;
            @XmlElement(name = "ORDEX", required = true)
            protected String ordex;
            @XmlElement(name = "ITBLD", required = true)
            protected String itbld;
            @XmlElement(name = "PREAS", required = true)
            protected String preas;
            @XmlElement(name = "FLAG1", required = true)
            protected String flag1;
            @XmlElement(name = "FLAG2", required = true)
            protected String flag2;
            @XmlElement(name = "FLAG3", required = true)
            protected String flag3;
            @XmlElement(name = "FLAG4", required = true)
            protected String flag4;
            @XmlElement(name = "RESE1", required = true)
            protected String rese1;
            @XmlElement(name = "RESE2", required = true)
            protected String rese2;
            @XmlElement(name = "GJAHR", required = true)
            protected String gjahr;
            @XmlElement(name = "ZFOLINT", required = true)
            protected String zfolint;
            @XmlElement(name = "ZCNPTO", required = true)
            protected String zcnpto;
            @XmlElement(name = "ZFOLIO", required = true)
            protected String zfolio;
            @XmlElement(name = "ZDATE", required = true)
            protected String zdate;
            @XmlElement(name = "ZLOTE", required = true)
            protected String zlote;
            @XmlElement(name = "ZMOVIM", required = true)
            protected String zmovim;
            @XmlElement(name = "ZREGIS", required = true)
            protected String zregis;
            @XmlElement(name = "ZREFER", required = true)
            protected String zrefer;
            @XmlElement(name = "ZFUENT", required = true)
            protected String zfuent;
            @XmlElement(name = "ZCVEMT", required = true)
            protected String zcvemt;
            @XmlElement(name = "ZNOMBR", required = true)
            protected String znombr;
            @XmlElement(name = "ZCTACTB", required = true)
            protected String zctactb;
            @XmlElement(name = "ZUNDNEG", required = true)
            protected String zundneg;
            @XmlElement(name = "ZUNDGEO", required = true)
            protected String zundgeo;
            @XmlElement(name = "ZNVLAFE", required = true)
            protected String znvlafe;
            @XmlElement(name = "ZLUGPAG", required = true)
            protected String zlugpag;
            @XmlElement(name = "ZSWAUS", required = true)
            protected String zswaus;
            @XmlElement(name = "ZRELLEN", required = true)
            protected String zrellen;
            @XmlElement(name = "ZUORD", required = true)
            protected String zuord;
            @XmlElement(name = "ZFECHA_INT", required = true)
            protected String zfechaint;
            @XmlElement(name = "ZCLAVE_INT", required = true)
            protected String zclaveint;
            @XmlElement(name = "ZFAUT", required = true)
            protected String zfaut;
            @XmlElement(name = "ZOBS", required = true)
            protected String zobs;
            @XmlElement(name = "VERSN", required = true)
            protected String versn;
            @XmlElement(name = "CERRADO", required = true)
            protected String cerrado;
            @XmlElement(name = "ZZIDCR", required = true)
            protected String zzidcr;
            @XmlElement(name = "FCIERRE", required = true)
            protected String fcierre;

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
             * Obtiene el valor de la propiedad objps.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOBJPS() {
                return objps;
            }

            /**
             * Define el valor de la propiedad objps.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOBJPS(String value) {
                this.objps = value;
            }

            /**
             * Obtiene el valor de la propiedad sprps.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSPRPS() {
                return sprps;
            }

            /**
             * Define el valor de la propiedad sprps.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSPRPS(String value) {
                this.sprps = value;
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
             * Obtiene el valor de la propiedad seqnr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSEQNR() {
                return seqnr;
            }

            /**
             * Define el valor de la propiedad seqnr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSEQNR(String value) {
                this.seqnr = value;
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

            /**
             * Obtiene el valor de la propiedad histo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHISTO() {
                return histo;
            }

            /**
             * Define el valor de la propiedad histo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHISTO(String value) {
                this.histo = value;
            }

            /**
             * Obtiene el valor de la propiedad itxex.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getITXEX() {
                return itxex;
            }

            /**
             * Define el valor de la propiedad itxex.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setITXEX(String value) {
                this.itxex = value;
            }

            /**
             * Obtiene el valor de la propiedad refex.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREFEX() {
                return refex;
            }

            /**
             * Define el valor de la propiedad refex.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREFEX(String value) {
                this.refex = value;
            }

            /**
             * Obtiene el valor de la propiedad ordex.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getORDEX() {
                return ordex;
            }

            /**
             * Define el valor de la propiedad ordex.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setORDEX(String value) {
                this.ordex = value;
            }

            /**
             * Obtiene el valor de la propiedad itbld.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getITBLD() {
                return itbld;
            }

            /**
             * Define el valor de la propiedad itbld.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setITBLD(String value) {
                this.itbld = value;
            }

            /**
             * Obtiene el valor de la propiedad preas.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPREAS() {
                return preas;
            }

            /**
             * Define el valor de la propiedad preas.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPREAS(String value) {
                this.preas = value;
            }

            /**
             * Obtiene el valor de la propiedad flag1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFLAG1() {
                return flag1;
            }

            /**
             * Define el valor de la propiedad flag1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFLAG1(String value) {
                this.flag1 = value;
            }

            /**
             * Obtiene el valor de la propiedad flag2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFLAG2() {
                return flag2;
            }

            /**
             * Define el valor de la propiedad flag2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFLAG2(String value) {
                this.flag2 = value;
            }

            /**
             * Obtiene el valor de la propiedad flag3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFLAG3() {
                return flag3;
            }

            /**
             * Define el valor de la propiedad flag3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFLAG3(String value) {
                this.flag3 = value;
            }

            /**
             * Obtiene el valor de la propiedad flag4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFLAG4() {
                return flag4;
            }

            /**
             * Define el valor de la propiedad flag4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFLAG4(String value) {
                this.flag4 = value;
            }

            /**
             * Obtiene el valor de la propiedad rese1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRESE1() {
                return rese1;
            }

            /**
             * Define el valor de la propiedad rese1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRESE1(String value) {
                this.rese1 = value;
            }

            /**
             * Obtiene el valor de la propiedad rese2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRESE2() {
                return rese2;
            }

            /**
             * Define el valor de la propiedad rese2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRESE2(String value) {
                this.rese2 = value;
            }

            /**
             * Obtiene el valor de la propiedad gjahr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGJAHR() {
                return gjahr;
            }

            /**
             * Define el valor de la propiedad gjahr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGJAHR(String value) {
                this.gjahr = value;
            }

            /**
             * Obtiene el valor de la propiedad zfolint.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZFOLINT() {
                return zfolint;
            }

            /**
             * Define el valor de la propiedad zfolint.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZFOLINT(String value) {
                this.zfolint = value;
            }

            /**
             * Obtiene el valor de la propiedad zcnpto.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZCNPTO() {
                return zcnpto;
            }

            /**
             * Define el valor de la propiedad zcnpto.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZCNPTO(String value) {
                this.zcnpto = value;
            }

            /**
             * Obtiene el valor de la propiedad zfolio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZFOLIO() {
                return zfolio;
            }

            /**
             * Define el valor de la propiedad zfolio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZFOLIO(String value) {
                this.zfolio = value;
            }

            /**
             * Obtiene el valor de la propiedad zdate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZDATE() {
                return zdate;
            }

            /**
             * Define el valor de la propiedad zdate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZDATE(String value) {
                this.zdate = value;
            }

            /**
             * Obtiene el valor de la propiedad zlote.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZLOTE() {
                return zlote;
            }

            /**
             * Define el valor de la propiedad zlote.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZLOTE(String value) {
                this.zlote = value;
            }

            /**
             * Obtiene el valor de la propiedad zmovim.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZMOVIM() {
                return zmovim;
            }

            /**
             * Define el valor de la propiedad zmovim.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZMOVIM(String value) {
                this.zmovim = value;
            }

            /**
             * Obtiene el valor de la propiedad zregis.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZREGIS() {
                return zregis;
            }

            /**
             * Define el valor de la propiedad zregis.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZREGIS(String value) {
                this.zregis = value;
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
             * Obtiene el valor de la propiedad zfuent.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZFUENT() {
                return zfuent;
            }

            /**
             * Define el valor de la propiedad zfuent.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZFUENT(String value) {
                this.zfuent = value;
            }

            /**
             * Obtiene el valor de la propiedad zcvemt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZCVEMT() {
                return zcvemt;
            }

            /**
             * Define el valor de la propiedad zcvemt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZCVEMT(String value) {
                this.zcvemt = value;
            }

            /**
             * Obtiene el valor de la propiedad znombr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZNOMBR() {
                return znombr;
            }

            /**
             * Define el valor de la propiedad znombr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZNOMBR(String value) {
                this.znombr = value;
            }

            /**
             * Obtiene el valor de la propiedad zctactb.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZCTACTB() {
                return zctactb;
            }

            /**
             * Define el valor de la propiedad zctactb.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZCTACTB(String value) {
                this.zctactb = value;
            }

            /**
             * Obtiene el valor de la propiedad zundneg.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZUNDNEG() {
                return zundneg;
            }

            /**
             * Define el valor de la propiedad zundneg.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZUNDNEG(String value) {
                this.zundneg = value;
            }

            /**
             * Obtiene el valor de la propiedad zundgeo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZUNDGEO() {
                return zundgeo;
            }

            /**
             * Define el valor de la propiedad zundgeo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZUNDGEO(String value) {
                this.zundgeo = value;
            }

            /**
             * Obtiene el valor de la propiedad znvlafe.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZNVLAFE() {
                return znvlafe;
            }

            /**
             * Define el valor de la propiedad znvlafe.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZNVLAFE(String value) {
                this.znvlafe = value;
            }

            /**
             * Obtiene el valor de la propiedad zlugpag.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZLUGPAG() {
                return zlugpag;
            }

            /**
             * Define el valor de la propiedad zlugpag.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZLUGPAG(String value) {
                this.zlugpag = value;
            }

            /**
             * Obtiene el valor de la propiedad zswaus.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZSWAUS() {
                return zswaus;
            }

            /**
             * Define el valor de la propiedad zswaus.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZSWAUS(String value) {
                this.zswaus = value;
            }

            /**
             * Obtiene el valor de la propiedad zrellen.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZRELLEN() {
                return zrellen;
            }

            /**
             * Define el valor de la propiedad zrellen.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZRELLEN(String value) {
                this.zrellen = value;
            }

            /**
             * Obtiene el valor de la propiedad zuord.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZUORD() {
                return zuord;
            }

            /**
             * Define el valor de la propiedad zuord.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZUORD(String value) {
                this.zuord = value;
            }

            /**
             * Obtiene el valor de la propiedad zfechaint.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZFECHAINT() {
                return zfechaint;
            }

            /**
             * Define el valor de la propiedad zfechaint.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZFECHAINT(String value) {
                this.zfechaint = value;
            }

            /**
             * Obtiene el valor de la propiedad zclaveint.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZCLAVEINT() {
                return zclaveint;
            }

            /**
             * Define el valor de la propiedad zclaveint.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZCLAVEINT(String value) {
                this.zclaveint = value;
            }

            /**
             * Obtiene el valor de la propiedad zfaut.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZFAUT() {
                return zfaut;
            }

            /**
             * Define el valor de la propiedad zfaut.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZFAUT(String value) {
                this.zfaut = value;
            }

            /**
             * Obtiene el valor de la propiedad zobs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZOBS() {
                return zobs;
            }

            /**
             * Define el valor de la propiedad zobs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZOBS(String value) {
                this.zobs = value;
            }

            /**
             * Obtiene el valor de la propiedad versn.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVERSN() {
                return versn;
            }

            /**
             * Define el valor de la propiedad versn.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVERSN(String value) {
                this.versn = value;
            }

            /**
             * Obtiene el valor de la propiedad cerrado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCERRADO() {
                return cerrado;
            }

            /**
             * Define el valor de la propiedad cerrado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCERRADO(String value) {
                this.cerrado = value;
            }

            /**
             * Obtiene el valor de la propiedad zzidcr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZZIDCR() {
                return zzidcr;
            }

            /**
             * Define el valor de la propiedad zzidcr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZZIDCR(String value) {
                this.zzidcr = value;
            }

            /**
             * Obtiene el valor de la propiedad fcierre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFCIERRE() {
                return fcierre;
            }

            /**
             * Define el valor de la propiedad fcierre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFCIERRE(String value) {
                this.fcierre = value;
            }

        }

    }

}
