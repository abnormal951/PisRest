
package com.hitss.pis.rest.webservices.stubs.SI_DATO_MAESTRO_v4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DT_ELEMENTO_response complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DT_ELEMENTO_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="T_MENSAJES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BUKRS" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PERNR" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="STATUS" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="MSJ" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="180"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CVE_MSJ" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
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
 *         &lt;element name="T_SALIDA" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="EXPSOLICITA" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="IDMOVIMIENTO" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="MANDT" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PERNR" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="NACHN" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="NACH2" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="VORNA" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PERSG" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DE_PERSG" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PERSK" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DE_PERSK" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="STAT2" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DE_STAT2" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="25"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="STAT1" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DE_STAT1" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="25"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TP_EMPLEADO" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="BUKRS" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DE_BUKRS" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="25"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="GSBER" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="WERKS" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DE_WERKS" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="30"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="KOSTL" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="10"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="VDSK1" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ORGEH" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ORGTX" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="SHORT" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="12"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="STEXT" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CVEL1" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="5"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DESLO" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="30"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="RPHT" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="STELL" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DE_STELL" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PLANS" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="MASSN" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DE_MASSN" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="30"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="MASSG" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DE_MASSG" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="30"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZSM" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="LGA01" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="BET01" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;totalDigits value="13"/>
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="SDIMX" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;totalDigits value="15"/>
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="VIDCA" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="C160" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;totalDigits value="7"/>
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="BANKL" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="15"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="BANKN" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="18"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="FEALTEC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GBDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GBORT" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="FEANCOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FEDEBA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FECASU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FECAPU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FEANEFJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FEREANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FESUPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FEREVAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FECTEMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FECDEF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ICNUM" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="30"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="NIMSS" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="11"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PERID" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="REGPA" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="11"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="BRFGN" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CUOTA_E" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *                             &lt;element name="GESCH" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DE_GESCH" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="9"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="FAMST" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DE_FAMST" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="23"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ANSVH" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DE_ANSVH" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="15"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ABKRS" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="MSTBR" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="SACHA" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="SACHZ" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="SACHP" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ZCLAV" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="12"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="EDIFICIO" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CVE_PISO" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CVE_ALA" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="OFICINA" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="USRID1" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="12"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="USRID2" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="12"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="USRID3" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="12"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="NUM01" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="EMAIL" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="P_EMAIL" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TELNR" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="12"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="NUM02" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="10"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TEL_CUOTA" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="10"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CARRIER" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CELULAR" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="13"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="STRAS_H" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="70"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ORT02" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PSTLZ" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="10"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ORT01" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DIREC" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ID_DIREC" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="SUBDIR" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ID_SUBDIR" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="GEREN" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="E_DIRE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="E_SUBD" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="E_GERE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="E_JEFE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="N_JEFE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="30"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="NIVEL4" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="NIVEL5" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="NIVEL6" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="E_NIV4" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="E_NIV5" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="E_NIV6" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="BTRTL" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="BTEXT" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="15"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="FECJUB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PENSALI" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DEMAEMP" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CREDINFO" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CREDFONA" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="UNIDAD" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="AREA" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="POBLACION" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DESTIPCT" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DIVNUM" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d+"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="FSIST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NATIO" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DE_NATIO" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="15"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_ELEMENTO_response", propOrder = {
    "tmensajes",
    "tsalida"
})
public class DTELEMENTOResponse {

    @XmlElement(name = "T_MENSAJES")
    protected DTELEMENTOResponse.TMENSAJES tmensajes;
    @XmlElement(name = "T_SALIDA")
    protected DTELEMENTOResponse.TSALIDA tsalida;

    /**
     * Obtiene el valor de la propiedad tmensajes.
     *
     * @return
     *     possible object is
     *     {@link DTELEMENTOResponse.TMENSAJES }
     *
     */
    public DTELEMENTOResponse.TMENSAJES getTMENSAJES() {
        return tmensajes;
    }

    /**
     * Define el valor de la propiedad tmensajes.
     *
     * @param value
     *     allowed object is
     *     {@link DTELEMENTOResponse.TMENSAJES }
     *
     */
    public void setTMENSAJES(DTELEMENTOResponse.TMENSAJES value) {
        this.tmensajes = value;
    }

    /**
     * Obtiene el valor de la propiedad tsalida.
     *
     * @return
     *     possible object is
     *     {@link DTELEMENTOResponse.TSALIDA }
     *
     */
    public DTELEMENTOResponse.TSALIDA getTSALIDA() {
        return tsalida;
    }

    /**
     * Define el valor de la propiedad tsalida.
     *
     * @param value
     *     allowed object is
     *     {@link DTELEMENTOResponse.TSALIDA }
     *
     */
    public void setTSALIDA(DTELEMENTOResponse.TSALIDA value) {
        this.tsalida = value;
    }

    @Override
	public String toString() {
		return "DTELEMENTOResponse [tmensajes=" + tmensajes + ", tsalida=" + tsalida + "]";
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
     *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BUKRS" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PERNR" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="STATUS" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="MSJ" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="180"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CVE_MSJ" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
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
    public static class TMENSAJES {

        protected List<DTELEMENTOResponse.TMENSAJES.Item> item;

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
         * {@link DTELEMENTOResponse.TMENSAJES.Item }
         *
         *
         */
        public List<DTELEMENTOResponse.TMENSAJES.Item> getItem() {
            if (item == null) {
                item = new ArrayList<DTELEMENTOResponse.TMENSAJES.Item>();
            }
            return this.item;
        }



        @Override
		public String toString() {
			return "TMENSAJES [item=" + item + "]";
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
         *         &lt;element name="BUKRS" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PERNR" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="STATUS" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="MSJ" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="180"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CVE_MSJ" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "bukrs",
            "pernr",
            "status",
            "msj",
            "cvemsj"
        })
        public static class Item {

            @XmlElement(name = "BUKRS")
            protected String bukrs;
            @XmlElement(name = "PERNR")
            protected String pernr;
            @XmlElement(name = "STATUS")
            protected String status;
            @XmlElement(name = "MSJ")
            protected String msj;
            @XmlElement(name = "CVE_MSJ")
            protected String cvemsj;

            /**
             * Obtiene el valor de la propiedad bukrs.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBUKRS() {
                return bukrs;
            }

            /**
             * Define el valor de la propiedad bukrs.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBUKRS(String value) {
                this.bukrs = value;
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
             * Obtiene el valor de la propiedad status.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSTATUS() {
                return status;
            }

            /**
             * Define el valor de la propiedad status.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSTATUS(String value) {
                this.status = value;
            }

            /**
             * Obtiene el valor de la propiedad msj.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getMSJ() {
                return msj;
            }

            /**
             * Define el valor de la propiedad msj.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setMSJ(String value) {
                this.msj = value;
            }

            /**
             * Obtiene el valor de la propiedad cvemsj.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCVEMSJ() {
                return cvemsj;
            }

            /**
             * Define el valor de la propiedad cvemsj.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCVEMSJ(String value) {
                this.cvemsj = value;
            }

			@Override
			public String toString() {
				return "Item [bukrs=" + bukrs + ", pernr=" + pernr + ", status=" + status + ", msj=" + msj + ", cvemsj="
						+ cvemsj + "]";
			}



        }

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
     *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="EXPSOLICITA" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="IDMOVIMIENTO" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="MANDT" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PERNR" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="NACHN" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="NACH2" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="VORNA" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PERSG" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DE_PERSG" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PERSK" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DE_PERSK" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="STAT2" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DE_STAT2" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="25"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="STAT1" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DE_STAT1" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="25"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TP_EMPLEADO" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="BUKRS" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DE_BUKRS" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="25"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="GSBER" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="WERKS" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DE_WERKS" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="KOSTL" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="10"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="VDSK1" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ORGEH" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ORGTX" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SHORT" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="12"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="STEXT" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CVEL1" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="5"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DESLO" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="RPHT" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="STELL" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DE_STELL" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PLANS" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="MASSN" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DE_MASSN" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="MASSG" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DE_MASSG" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZSM" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="LGA01" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="BET01" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;totalDigits value="13"/>
     *                         &lt;fractionDigits value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SDIMX" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;totalDigits value="15"/>
     *                         &lt;fractionDigits value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="VIDCA" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="C160" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;totalDigits value="7"/>
     *                         &lt;fractionDigits value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="BANKL" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="15"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="BANKN" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="18"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FEALTEC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GBDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GBORT" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FEANCOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FEDEBA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FECASU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FECAPU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FEANEFJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FEREANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FESUPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FEREVAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FECTEMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FECDEF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ICNUM" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="NIMSS" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="11"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PERID" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="REGPA" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="11"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="BRFGN" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CUOTA_E" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
     *                   &lt;element name="GESCH" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DE_GESCH" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="9"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FAMST" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DE_FAMST" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="23"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ANSVH" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DE_ANSVH" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="15"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ABKRS" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="MSTBR" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SACHA" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SACHZ" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SACHP" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ZCLAV" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="12"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="EDIFICIO" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="60"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CVE_PISO" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CVE_ALA" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="OFICINA" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="6"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="USRID1" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="12"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="USRID2" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="12"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="USRID3" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="12"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="NUM01" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="EMAIL" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="P_EMAIL" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TELNR" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="12"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="NUM02" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="10"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TEL_CUOTA" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="10"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CARRIER" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CELULAR" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="13"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="STRAS_H" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="70"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ORT02" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PSTLZ" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="10"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ORT01" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DIREC" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ID_DIREC" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SUBDIR" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ID_SUBDIR" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="GEREN" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="E_DIRE" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="E_SUBD" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="E_GERE" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="E_JEFE" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="N_JEFE" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="NIVEL4" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="NIVEL5" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="NIVEL6" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="E_NIV4" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="E_NIV5" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="E_NIV6" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="BTRTL" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="BTEXT" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="15"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FECJUB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PENSALI" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DEMAEMP" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CREDINFO" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CREDFONA" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="UNIDAD" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AREA" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="POBLACION" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DESTIPCT" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DIVNUM" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d+"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FSIST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NATIO" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DE_NATIO" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="15"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
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

        protected List<DTELEMENTOResponse.TSALIDA.Item> item;

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
         * {@link DTELEMENTOResponse.TSALIDA.Item }
         *
         *
         */
        public List<DTELEMENTOResponse.TSALIDA.Item> getItem() {
            if (item == null) {
                item = new ArrayList<DTELEMENTOResponse.TSALIDA.Item>();
            }
            return this.item;
        }




        @Override
		public String toString() {
			return "TSALIDA [item=" + item + "]";
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
         *         &lt;element name="EXPSOLICITA" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="IDMOVIMIENTO" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="MANDT" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PERNR" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="NACHN" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="NACH2" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="VORNA" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PERSG" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DE_PERSG" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PERSK" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DE_PERSK" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="STAT2" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DE_STAT2" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="25"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="STAT1" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DE_STAT1" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="25"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TP_EMPLEADO" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="BUKRS" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DE_BUKRS" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="25"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="GSBER" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="WERKS" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DE_WERKS" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="KOSTL" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="10"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="VDSK1" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ORGEH" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ORGTX" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SHORT" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="12"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="STEXT" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CVEL1" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="5"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DESLO" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="RPHT" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="STELL" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DE_STELL" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PLANS" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="MASSN" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DE_MASSN" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="MASSG" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DE_MASSG" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZSM" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="LGA01" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="BET01" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;totalDigits value="13"/>
         *               &lt;fractionDigits value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SDIMX" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;totalDigits value="15"/>
         *               &lt;fractionDigits value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="VIDCA" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="C160" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;totalDigits value="7"/>
         *               &lt;fractionDigits value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="BANKL" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="15"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="BANKN" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="18"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FEALTEC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GBDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GBORT" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FEANCOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FEDEBA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FECASU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FECAPU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FEANEFJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FEREANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FESUPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FEREVAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FECTEMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FECDEF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ICNUM" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="NIMSS" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="11"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PERID" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="REGPA" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="11"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="BRFGN" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CUOTA_E" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
         *         &lt;element name="GESCH" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DE_GESCH" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="9"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FAMST" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DE_FAMST" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="23"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ANSVH" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DE_ANSVH" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="15"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ABKRS" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="MSTBR" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SACHA" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SACHZ" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SACHP" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ZCLAV" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="12"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="EDIFICIO" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CVE_PISO" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CVE_ALA" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="OFICINA" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="6"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="USRID1" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="12"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="USRID2" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="12"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="USRID3" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="12"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="NUM01" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="EMAIL" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="P_EMAIL" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TELNR" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="12"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="NUM02" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="10"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TEL_CUOTA" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="10"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CARRIER" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CELULAR" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="13"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="STRAS_H" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="70"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ORT02" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PSTLZ" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="10"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ORT01" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DIREC" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ID_DIREC" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SUBDIR" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ID_SUBDIR" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="GEREN" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="E_DIRE" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="E_SUBD" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="E_GERE" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="E_JEFE" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="N_JEFE" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="NIVEL4" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="NIVEL5" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="NIVEL6" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="E_NIV4" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="E_NIV5" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="E_NIV6" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="BTRTL" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="BTEXT" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="15"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FECJUB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PENSALI" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DEMAEMP" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CREDINFO" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CREDFONA" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="UNIDAD" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="AREA" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="POBLACION" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DESTIPCT" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DIVNUM" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d+"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FSIST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NATIO" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DE_NATIO" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="15"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "expsolicita",
            "idmovimiento",
            "mandt",
            "pernr",
            "nachn",
            "nach2",
            "vorna",
            "persg",
            "depersg",
            "persk",
            "depersk",
            "stat2",
            "destat2",
            "stat1",
            "destat1",
            "tpempleado",
            "bukrs",
            "debukrs",
            "gsber",
            "werks",
            "dewerks",
            "kostl",
            "vdsk1",
            "orgeh",
            "orgtx",
            "_short",
            "stext",
            "cvel1",
            "deslo",
            "rpht",
            "stell",
            "destell",
            "plans",
            "massn",
            "demassn",
            "massg",
            "demassg",
            "zsm",
            "lga01",
            "bet01",
            "sdimx",
            "vidca",
            "c160",
            "bankl",
            "bankn",
            "fealtec",
            "gbdat",
            "gbort",
            "feancob",
            "fedeba",
            "fecasu",
            "fecapu",
            "feanefj",
            "fereant",
            "fesupe",
            "ferevac",
            "fectemp",
            "fecdef",
            "icnum",
            "nimss",
            "perid",
            "regpa",
            "brfgn",
            "cuotae",
            "gesch",
            "degesch",
            "famst",
            "defamst",
            "ansvh",
            "deansvh",
            "abkrs",
            "mstbr",
            "sacha",
            "sachz",
            "sachp",
            "zclav",
            "edificio",
            "cvepiso",
            "cveala",
            "oficina",
            "usrid1",
            "usrid2",
            "usrid3",
            "num01",
            "email",
            "pemail",
            "telnr",
            "num02",
            "telcuota",
            "carrier",
            "celular",
            "strash",
            "ort02",
            "pstlz",
            "ort01",
            "direc",
            "iddirec",
            "subdir",
            "idsubdir",
            "geren",
            "edire",
            "esubd",
            "egere",
            "ejefe",
            "njefe",
            "nivel4",
            "nivel5",
            "nivel6",
            "eniv4",
            "eniv5",
            "eniv6",
            "btrtl",
            "btext",
            "fecjub",
            "pensali",
            "demaemp",
            "credinfo",
            "credfona",
            "unidad",
            "area",
            "poblacion",
            "destipct",
            "divnum",
            "fsist",
            "natio",
            "denatio"
        })
        public static class Item {

            @XmlElement(name = "EXPSOLICITA")
            protected String expsolicita;
            @XmlElement(name = "IDMOVIMIENTO")
            protected String idmovimiento;
            @XmlElement(name = "MANDT")
            protected String mandt;
            @XmlElement(name = "PERNR")
            protected String pernr;
            @XmlElement(name = "NACHN")
            protected String nachn;
            @XmlElement(name = "NACH2")
            protected String nach2;
            @XmlElement(name = "VORNA")
            protected String vorna;
            @XmlElement(name = "PERSG")
            protected String persg;
            @XmlElement(name = "DE_PERSG")
            protected String depersg;
            @XmlElement(name = "PERSK")
            protected String persk;
            @XmlElement(name = "DE_PERSK")
            protected String depersk;
            @XmlElement(name = "STAT2")
            protected String stat2;
            @XmlElement(name = "DE_STAT2")
            protected String destat2;
            @XmlElement(name = "STAT1")
            protected String stat1;
            @XmlElement(name = "DE_STAT1")
            protected String destat1;
            @XmlElement(name = "TP_EMPLEADO")
            protected String tpempleado;
            @XmlElement(name = "BUKRS")
            protected String bukrs;
            @XmlElement(name = "DE_BUKRS")
            protected String debukrs;
            @XmlElement(name = "GSBER")
            protected String gsber;
            @XmlElement(name = "WERKS")
            protected String werks;
            @XmlElement(name = "DE_WERKS")
            protected String dewerks;
            @XmlElement(name = "KOSTL")
            protected String kostl;
            @XmlElement(name = "VDSK1")
            protected String vdsk1;
            @XmlElement(name = "ORGEH")
            protected String orgeh;
            @XmlElement(name = "ORGTX")
            protected String orgtx;
            @XmlElement(name = "SHORT")
            protected String _short;
            @XmlElement(name = "STEXT")
            protected String stext;
            @XmlElement(name = "CVEL1")
            protected String cvel1;
            @XmlElement(name = "DESLO")
            protected String deslo;
            @XmlElement(name = "RPHT")
            protected String rpht;
            @XmlElement(name = "STELL")
            protected String stell;
            @XmlElement(name = "DE_STELL")
            protected String destell;
            @XmlElement(name = "PLANS")
            protected String plans;
            @XmlElement(name = "MASSN")
            protected String massn;
            @XmlElement(name = "DE_MASSN")
            protected String demassn;
            @XmlElement(name = "MASSG")
            protected String massg;
            @XmlElement(name = "DE_MASSG")
            protected String demassg;
            @XmlElement(name = "ZSM")
            protected String zsm;
            @XmlElement(name = "LGA01")
            protected String lga01;
            @XmlElement(name = "BET01")
            protected BigDecimal bet01;
            @XmlElement(name = "SDIMX")
            protected BigDecimal sdimx;
            @XmlElement(name = "VIDCA")
            protected String vidca;
            @XmlElement(name = "C160")
            protected BigDecimal c160;
            @XmlElement(name = "BANKL")
            protected String bankl;
            @XmlElement(name = "BANKN")
            protected String bankn;
            @XmlElement(name = "FEALTEC")
            protected String fealtec;
            @XmlElement(name = "GBDAT")
            protected String gbdat;
            @XmlElement(name = "GBORT")
            protected String gbort;
            @XmlElement(name = "FEANCOB")
            protected String feancob;
            @XmlElement(name = "FEDEBA")
            protected String fedeba;
            @XmlElement(name = "FECASU")
            protected String fecasu;
            @XmlElement(name = "FECAPU")
            protected String fecapu;
            @XmlElement(name = "FEANEFJ")
            protected String feanefj;
            @XmlElement(name = "FEREANT")
            protected String fereant;
            @XmlElement(name = "FESUPE")
            protected String fesupe;
            @XmlElement(name = "FEREVAC")
            protected String ferevac;
            @XmlElement(name = "FECTEMP")
            protected String fectemp;
            @XmlElement(name = "FECDEF")
            protected String fecdef;
            @XmlElement(name = "ICNUM")
            protected String icnum;
            @XmlElement(name = "NIMSS")
            protected String nimss;
            @XmlElement(name = "PERID")
            protected String perid;
            @XmlElement(name = "REGPA")
            protected String regpa;
            @XmlElement(name = "BRFGN")
            protected String brfgn;
            @XmlElement(name = "CUOTA_E")
            @XmlSchemaType(name = "unsignedByte")
            protected Short cuotae;
            @XmlElement(name = "GESCH")
            protected String gesch;
            @XmlElement(name = "DE_GESCH")
            protected String degesch;
            @XmlElement(name = "FAMST")
            protected String famst;
            @XmlElement(name = "DE_FAMST")
            protected String defamst;
            @XmlElement(name = "ANSVH")
            protected String ansvh;
            @XmlElement(name = "DE_ANSVH")
            protected String deansvh;
            @XmlElement(name = "ABKRS")
            protected String abkrs;
            @XmlElement(name = "MSTBR")
            protected String mstbr;
            @XmlElement(name = "SACHA")
            protected String sacha;
            @XmlElement(name = "SACHZ")
            protected String sachz;
            @XmlElement(name = "SACHP")
            protected String sachp;
            @XmlElement(name = "ZCLAV")
            protected String zclav;
            @XmlElement(name = "EDIFICIO")
            protected String edificio;
            @XmlElement(name = "CVE_PISO")
            protected String cvepiso;
            @XmlElement(name = "CVE_ALA")
            protected String cveala;
            @XmlElement(name = "OFICINA")
            protected String oficina;
            @XmlElement(name = "USRID1")
            protected String usrid1;
            @XmlElement(name = "USRID2")
            protected String usrid2;
            @XmlElement(name = "USRID3")
            protected String usrid3;
            @XmlElement(name = "NUM01")
            protected String num01;
            @XmlElement(name = "EMAIL")
            protected String email;
            @XmlElement(name = "P_EMAIL")
            protected String pemail;
            @XmlElement(name = "TELNR")
            protected String telnr;
            @XmlElement(name = "NUM02")
            protected String num02;
            @XmlElement(name = "TEL_CUOTA")
            protected String telcuota;
            @XmlElement(name = "CARRIER")
            protected String carrier;
            @XmlElement(name = "CELULAR")
            protected String celular;
            @XmlElement(name = "STRAS_H")
            protected String strash;
            @XmlElement(name = "ORT02")
            protected String ort02;
            @XmlElement(name = "PSTLZ")
            protected String pstlz;
            @XmlElement(name = "ORT01")
            protected String ort01;
            @XmlElement(name = "DIREC")
            protected String direc;
            @XmlElement(name = "ID_DIREC")
            protected String iddirec;
            @XmlElement(name = "SUBDIR")
            protected String subdir;
            @XmlElement(name = "ID_SUBDIR")
            protected String idsubdir;
            @XmlElement(name = "GEREN")
            protected String geren;
            @XmlElement(name = "E_DIRE")
            protected String edire;
            @XmlElement(name = "E_SUBD")
            protected String esubd;
            @XmlElement(name = "E_GERE")
            protected String egere;
            @XmlElement(name = "E_JEFE")
            protected String ejefe;
            @XmlElement(name = "N_JEFE")
            protected String njefe;
            @XmlElement(name = "NIVEL4")
            protected String nivel4;
            @XmlElement(name = "NIVEL5")
            protected String nivel5;
            @XmlElement(name = "NIVEL6")
            protected String nivel6;
            @XmlElement(name = "E_NIV4")
            protected String eniv4;
            @XmlElement(name = "E_NIV5")
            protected String eniv5;
            @XmlElement(name = "E_NIV6")
            protected String eniv6;
            @XmlElement(name = "BTRTL")
            protected String btrtl;
            @XmlElement(name = "BTEXT")
            protected String btext;
            @XmlElement(name = "FECJUB")
            protected String fecjub;
            @XmlElement(name = "PENSALI")
            protected String pensali;
            @XmlElement(name = "DEMAEMP")
            protected String demaemp;
            @XmlElement(name = "CREDINFO")
            protected String credinfo;
            @XmlElement(name = "CREDFONA")
            protected String credfona;
            @XmlElement(name = "UNIDAD")
            protected String unidad;
            @XmlElement(name = "AREA")
            protected String area;
            @XmlElement(name = "POBLACION")
            protected String poblacion;
            @XmlElement(name = "DESTIPCT")
            protected String destipct;
            @XmlElement(name = "DIVNUM")
            protected String divnum;
            @XmlElement(name = "FSIST")
            protected String fsist;
            @XmlElement(name = "NATIO")
            protected String natio;
            @XmlElement(name = "DE_NATIO")
            protected String denatio;

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
             * Obtiene el valor de la propiedad nachn.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNACHN() {
                return nachn;
            }

            /**
             * Define el valor de la propiedad nachn.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNACHN(String value) {
                this.nachn = value;
            }

            /**
             * Obtiene el valor de la propiedad nach2.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNACH2() {
                return nach2;
            }

            /**
             * Define el valor de la propiedad nach2.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNACH2(String value) {
                this.nach2 = value;
            }

            /**
             * Obtiene el valor de la propiedad vorna.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getVORNA() {
                return vorna;
            }

            /**
             * Define el valor de la propiedad vorna.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setVORNA(String value) {
                this.vorna = value;
            }

            /**
             * Obtiene el valor de la propiedad persg.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPERSG() {
                return persg;
            }

            /**
             * Define el valor de la propiedad persg.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPERSG(String value) {
                this.persg = value;
            }

            /**
             * Obtiene el valor de la propiedad depersg.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDEPERSG() {
                return depersg;
            }

            /**
             * Define el valor de la propiedad depersg.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDEPERSG(String value) {
                this.depersg = value;
            }

            /**
             * Obtiene el valor de la propiedad persk.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPERSK() {
                return persk;
            }

            /**
             * Define el valor de la propiedad persk.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPERSK(String value) {
                this.persk = value;
            }

            /**
             * Obtiene el valor de la propiedad depersk.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDEPERSK() {
                return depersk;
            }

            /**
             * Define el valor de la propiedad depersk.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDEPERSK(String value) {
                this.depersk = value;
            }

            /**
             * Obtiene el valor de la propiedad stat2.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSTAT2() {
                return stat2;
            }

            /**
             * Define el valor de la propiedad stat2.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSTAT2(String value) {
                this.stat2 = value;
            }

            /**
             * Obtiene el valor de la propiedad destat2.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDESTAT2() {
                return destat2;
            }

            /**
             * Define el valor de la propiedad destat2.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDESTAT2(String value) {
                this.destat2 = value;
            }

            /**
             * Obtiene el valor de la propiedad stat1.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSTAT1() {
                return stat1;
            }

            /**
             * Define el valor de la propiedad stat1.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSTAT1(String value) {
                this.stat1 = value;
            }

            /**
             * Obtiene el valor de la propiedad destat1.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDESTAT1() {
                return destat1;
            }

            /**
             * Define el valor de la propiedad destat1.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDESTAT1(String value) {
                this.destat1 = value;
            }

            /**
             * Obtiene el valor de la propiedad tpempleado.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTPEMPLEADO() {
                return tpempleado;
            }

            /**
             * Define el valor de la propiedad tpempleado.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTPEMPLEADO(String value) {
                this.tpempleado = value;
            }

            /**
             * Obtiene el valor de la propiedad bukrs.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBUKRS() {
                return bukrs;
            }

            /**
             * Define el valor de la propiedad bukrs.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBUKRS(String value) {
                this.bukrs = value;
            }

            /**
             * Obtiene el valor de la propiedad debukrs.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDEBUKRS() {
                return debukrs;
            }

            /**
             * Define el valor de la propiedad debukrs.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDEBUKRS(String value) {
                this.debukrs = value;
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
             * Obtiene el valor de la propiedad werks.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getWERKS() {
                return werks;
            }

            /**
             * Define el valor de la propiedad werks.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setWERKS(String value) {
                this.werks = value;
            }

            /**
             * Obtiene el valor de la propiedad dewerks.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDEWERKS() {
                return dewerks;
            }

            /**
             * Define el valor de la propiedad dewerks.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDEWERKS(String value) {
                this.dewerks = value;
            }

            /**
             * Obtiene el valor de la propiedad kostl.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getKOSTL() {
                return kostl;
            }

            /**
             * Define el valor de la propiedad kostl.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setKOSTL(String value) {
                this.kostl = value;
            }

            /**
             * Obtiene el valor de la propiedad vdsk1.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getVDSK1() {
                return vdsk1;
            }

            /**
             * Define el valor de la propiedad vdsk1.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setVDSK1(String value) {
                this.vdsk1 = value;
            }

            /**
             * Obtiene el valor de la propiedad orgeh.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getORGEH() {
                return orgeh;
            }

            /**
             * Define el valor de la propiedad orgeh.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setORGEH(String value) {
                this.orgeh = value;
            }

            /**
             * Obtiene el valor de la propiedad orgtx.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getORGTX() {
                return orgtx;
            }

            /**
             * Define el valor de la propiedad orgtx.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setORGTX(String value) {
                this.orgtx = value;
            }

            /**
             * Obtiene el valor de la propiedad short.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSHORT() {
                return _short;
            }

            /**
             * Define el valor de la propiedad short.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSHORT(String value) {
                this._short = value;
            }

            /**
             * Obtiene el valor de la propiedad stext.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSTEXT() {
                return stext;
            }

            /**
             * Define el valor de la propiedad stext.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSTEXT(String value) {
                this.stext = value;
            }

            /**
             * Obtiene el valor de la propiedad cvel1.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCVEL1() {
                return cvel1;
            }

            /**
             * Define el valor de la propiedad cvel1.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCVEL1(String value) {
                this.cvel1 = value;
            }

            /**
             * Obtiene el valor de la propiedad deslo.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDESLO() {
                return deslo;
            }

            /**
             * Define el valor de la propiedad deslo.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDESLO(String value) {
                this.deslo = value;
            }

            /**
             * Obtiene el valor de la propiedad rpht.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getRPHT() {
                return rpht;
            }

            /**
             * Define el valor de la propiedad rpht.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setRPHT(String value) {
                this.rpht = value;
            }

            /**
             * Obtiene el valor de la propiedad stell.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSTELL() {
                return stell;
            }

            /**
             * Define el valor de la propiedad stell.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSTELL(String value) {
                this.stell = value;
            }

            /**
             * Obtiene el valor de la propiedad destell.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDESTELL() {
                return destell;
            }

            /**
             * Define el valor de la propiedad destell.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDESTELL(String value) {
                this.destell = value;
            }

            /**
             * Obtiene el valor de la propiedad plans.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPLANS() {
                return plans;
            }

            /**
             * Define el valor de la propiedad plans.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPLANS(String value) {
                this.plans = value;
            }

            /**
             * Obtiene el valor de la propiedad massn.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getMASSN() {
                return massn;
            }

            /**
             * Define el valor de la propiedad massn.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setMASSN(String value) {
                this.massn = value;
            }

            /**
             * Obtiene el valor de la propiedad demassn.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDEMASSN() {
                return demassn;
            }

            /**
             * Define el valor de la propiedad demassn.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDEMASSN(String value) {
                this.demassn = value;
            }

            /**
             * Obtiene el valor de la propiedad massg.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getMASSG() {
                return massg;
            }

            /**
             * Define el valor de la propiedad massg.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setMASSG(String value) {
                this.massg = value;
            }

            /**
             * Obtiene el valor de la propiedad demassg.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDEMASSG() {
                return demassg;
            }

            /**
             * Define el valor de la propiedad demassg.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDEMASSG(String value) {
                this.demassg = value;
            }

            /**
             * Obtiene el valor de la propiedad zsm.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getZSM() {
                return zsm;
            }

            /**
             * Define el valor de la propiedad zsm.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setZSM(String value) {
                this.zsm = value;
            }

            /**
             * Obtiene el valor de la propiedad lga01.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getLGA01() {
                return lga01;
            }

            /**
             * Define el valor de la propiedad lga01.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLGA01(String value) {
                this.lga01 = value;
            }

            /**
             * Obtiene el valor de la propiedad bet01.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getBET01() {
                return bet01;
            }

            /**
             * Define el valor de la propiedad bet01.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setBET01(BigDecimal value) {
                this.bet01 = value;
            }

            /**
             * Obtiene el valor de la propiedad sdimx.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getSDIMX() {
                return sdimx;
            }

            /**
             * Define el valor de la propiedad sdimx.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setSDIMX(BigDecimal value) {
                this.sdimx = value;
            }

            /**
             * Obtiene el valor de la propiedad vidca.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getVIDCA() {
                return vidca;
            }

            /**
             * Define el valor de la propiedad vidca.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setVIDCA(String value) {
                this.vidca = value;
            }

            /**
             * Obtiene el valor de la propiedad c160.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getC160() {
                return c160;
            }

            /**
             * Define el valor de la propiedad c160.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setC160(BigDecimal value) {
                this.c160 = value;
            }

            /**
             * Obtiene el valor de la propiedad bankl.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBANKL() {
                return bankl;
            }

            /**
             * Define el valor de la propiedad bankl.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBANKL(String value) {
                this.bankl = value;
            }

            /**
             * Obtiene el valor de la propiedad bankn.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBANKN() {
                return bankn;
            }

            /**
             * Define el valor de la propiedad bankn.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBANKN(String value) {
                this.bankn = value;
            }

            /**
             * Obtiene el valor de la propiedad fealtec.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFEALTEC() {
                return fealtec;
            }

            /**
             * Define el valor de la propiedad fealtec.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFEALTEC(String value) {
                this.fealtec = value;
            }

            /**
             * Obtiene el valor de la propiedad gbdat.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getGBDAT() {
                return gbdat;
            }

            /**
             * Define el valor de la propiedad gbdat.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setGBDAT(String value) {
                this.gbdat = value;
            }

            /**
             * Obtiene el valor de la propiedad gbort.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getGBORT() {
                return gbort;
            }

            /**
             * Define el valor de la propiedad gbort.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setGBORT(String value) {
                this.gbort = value;
            }

            /**
             * Obtiene el valor de la propiedad feancob.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFEANCOB() {
                return feancob;
            }

            /**
             * Define el valor de la propiedad feancob.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFEANCOB(String value) {
                this.feancob = value;
            }

            /**
             * Obtiene el valor de la propiedad fedeba.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFEDEBA() {
                return fedeba;
            }

            /**
             * Define el valor de la propiedad fedeba.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFEDEBA(String value) {
                this.fedeba = value;
            }

            /**
             * Obtiene el valor de la propiedad fecasu.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFECASU() {
                return fecasu;
            }

            /**
             * Define el valor de la propiedad fecasu.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFECASU(String value) {
                this.fecasu = value;
            }

            /**
             * Obtiene el valor de la propiedad fecapu.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFECAPU() {
                return fecapu;
            }

            /**
             * Define el valor de la propiedad fecapu.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFECAPU(String value) {
                this.fecapu = value;
            }

            /**
             * Obtiene el valor de la propiedad feanefj.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFEANEFJ() {
                return feanefj;
            }

            /**
             * Define el valor de la propiedad feanefj.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFEANEFJ(String value) {
                this.feanefj = value;
            }

            /**
             * Obtiene el valor de la propiedad fereant.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFEREANT() {
                return fereant;
            }

            /**
             * Define el valor de la propiedad fereant.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFEREANT(String value) {
                this.fereant = value;
            }

            /**
             * Obtiene el valor de la propiedad fesupe.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFESUPE() {
                return fesupe;
            }

            /**
             * Define el valor de la propiedad fesupe.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFESUPE(String value) {
                this.fesupe = value;
            }

            /**
             * Obtiene el valor de la propiedad ferevac.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFEREVAC() {
                return ferevac;
            }

            /**
             * Define el valor de la propiedad ferevac.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFEREVAC(String value) {
                this.ferevac = value;
            }

            /**
             * Obtiene el valor de la propiedad fectemp.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFECTEMP() {
                return fectemp;
            }

            /**
             * Define el valor de la propiedad fectemp.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFECTEMP(String value) {
                this.fectemp = value;
            }

            /**
             * Obtiene el valor de la propiedad fecdef.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFECDEF() {
                return fecdef;
            }

            /**
             * Define el valor de la propiedad fecdef.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFECDEF(String value) {
                this.fecdef = value;
            }

            /**
             * Obtiene el valor de la propiedad icnum.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getICNUM() {
                return icnum;
            }

            /**
             * Define el valor de la propiedad icnum.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setICNUM(String value) {
                this.icnum = value;
            }

            /**
             * Obtiene el valor de la propiedad nimss.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNIMSS() {
                return nimss;
            }

            /**
             * Define el valor de la propiedad nimss.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNIMSS(String value) {
                this.nimss = value;
            }

            /**
             * Obtiene el valor de la propiedad perid.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPERID() {
                return perid;
            }

            /**
             * Define el valor de la propiedad perid.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPERID(String value) {
                this.perid = value;
            }

            /**
             * Obtiene el valor de la propiedad regpa.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getREGPA() {
                return regpa;
            }

            /**
             * Define el valor de la propiedad regpa.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setREGPA(String value) {
                this.regpa = value;
            }

            /**
             * Obtiene el valor de la propiedad brfgn.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBRFGN() {
                return brfgn;
            }

            /**
             * Define el valor de la propiedad brfgn.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBRFGN(String value) {
                this.brfgn = value;
            }

            /**
             * Obtiene el valor de la propiedad cuotae.
             *
             * @return
             *     possible object is
             *     {@link Short }
             *
             */
            public Short getCUOTAE() {
                return cuotae;
            }

            /**
             * Define el valor de la propiedad cuotae.
             *
             * @param value
             *     allowed object is
             *     {@link Short }
             *
             */
            public void setCUOTAE(Short value) {
                this.cuotae = value;
            }

            /**
             * Obtiene el valor de la propiedad gesch.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getGESCH() {
                return gesch;
            }

            /**
             * Define el valor de la propiedad gesch.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setGESCH(String value) {
                this.gesch = value;
            }

            /**
             * Obtiene el valor de la propiedad degesch.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDEGESCH() {
                return degesch;
            }

            /**
             * Define el valor de la propiedad degesch.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDEGESCH(String value) {
                this.degesch = value;
            }

            /**
             * Obtiene el valor de la propiedad famst.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFAMST() {
                return famst;
            }

            /**
             * Define el valor de la propiedad famst.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFAMST(String value) {
                this.famst = value;
            }

            /**
             * Obtiene el valor de la propiedad defamst.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDEFAMST() {
                return defamst;
            }

            /**
             * Define el valor de la propiedad defamst.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDEFAMST(String value) {
                this.defamst = value;
            }

            /**
             * Obtiene el valor de la propiedad ansvh.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getANSVH() {
                return ansvh;
            }

            /**
             * Define el valor de la propiedad ansvh.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setANSVH(String value) {
                this.ansvh = value;
            }

            /**
             * Obtiene el valor de la propiedad deansvh.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDEANSVH() {
                return deansvh;
            }

            /**
             * Define el valor de la propiedad deansvh.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDEANSVH(String value) {
                this.deansvh = value;
            }

            /**
             * Obtiene el valor de la propiedad abkrs.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getABKRS() {
                return abkrs;
            }

            /**
             * Define el valor de la propiedad abkrs.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setABKRS(String value) {
                this.abkrs = value;
            }

            /**
             * Obtiene el valor de la propiedad mstbr.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getMSTBR() {
                return mstbr;
            }

            /**
             * Define el valor de la propiedad mstbr.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setMSTBR(String value) {
                this.mstbr = value;
            }

            /**
             * Obtiene el valor de la propiedad sacha.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSACHA() {
                return sacha;
            }

            /**
             * Define el valor de la propiedad sacha.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSACHA(String value) {
                this.sacha = value;
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
             * Obtiene el valor de la propiedad sachp.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSACHP() {
                return sachp;
            }

            /**
             * Define el valor de la propiedad sachp.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSACHP(String value) {
                this.sachp = value;
            }

            /**
             * Obtiene el valor de la propiedad zclav.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getZCLAV() {
                return zclav;
            }

            /**
             * Define el valor de la propiedad zclav.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setZCLAV(String value) {
                this.zclav = value;
            }

            /**
             * Obtiene el valor de la propiedad edificio.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getEDIFICIO() {
                return edificio;
            }

            /**
             * Define el valor de la propiedad edificio.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setEDIFICIO(String value) {
                this.edificio = value;
            }

            /**
             * Obtiene el valor de la propiedad cvepiso.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCVEPISO() {
                return cvepiso;
            }

            /**
             * Define el valor de la propiedad cvepiso.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCVEPISO(String value) {
                this.cvepiso = value;
            }

            /**
             * Obtiene el valor de la propiedad cveala.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCVEALA() {
                return cveala;
            }

            /**
             * Define el valor de la propiedad cveala.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCVEALA(String value) {
                this.cveala = value;
            }

            /**
             * Obtiene el valor de la propiedad oficina.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getOFICINA() {
                return oficina;
            }

            /**
             * Define el valor de la propiedad oficina.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setOFICINA(String value) {
                this.oficina = value;
            }

            /**
             * Obtiene el valor de la propiedad usrid1.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUSRID1() {
                return usrid1;
            }

            /**
             * Define el valor de la propiedad usrid1.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUSRID1(String value) {
                this.usrid1 = value;
            }

            /**
             * Obtiene el valor de la propiedad usrid2.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUSRID2() {
                return usrid2;
            }

            /**
             * Define el valor de la propiedad usrid2.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUSRID2(String value) {
                this.usrid2 = value;
            }

            /**
             * Obtiene el valor de la propiedad usrid3.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUSRID3() {
                return usrid3;
            }

            /**
             * Define el valor de la propiedad usrid3.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUSRID3(String value) {
                this.usrid3 = value;
            }

            /**
             * Obtiene el valor de la propiedad num01.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNUM01() {
                return num01;
            }

            /**
             * Define el valor de la propiedad num01.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNUM01(String value) {
                this.num01 = value;
            }

            /**
             * Obtiene el valor de la propiedad email.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getEMAIL() {
                return email;
            }

            /**
             * Define el valor de la propiedad email.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setEMAIL(String value) {
                this.email = value;
            }

            /**
             * Obtiene el valor de la propiedad pemail.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPEMAIL() {
                return pemail;
            }

            /**
             * Define el valor de la propiedad pemail.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPEMAIL(String value) {
                this.pemail = value;
            }

            /**
             * Obtiene el valor de la propiedad telnr.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTELNR() {
                return telnr;
            }

            /**
             * Define el valor de la propiedad telnr.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTELNR(String value) {
                this.telnr = value;
            }

            /**
             * Obtiene el valor de la propiedad num02.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNUM02() {
                return num02;
            }

            /**
             * Define el valor de la propiedad num02.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNUM02(String value) {
                this.num02 = value;
            }

            /**
             * Obtiene el valor de la propiedad telcuota.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTELCUOTA() {
                return telcuota;
            }

            /**
             * Define el valor de la propiedad telcuota.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTELCUOTA(String value) {
                this.telcuota = value;
            }

            /**
             * Obtiene el valor de la propiedad carrier.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCARRIER() {
                return carrier;
            }

            /**
             * Define el valor de la propiedad carrier.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCARRIER(String value) {
                this.carrier = value;
            }

            /**
             * Obtiene el valor de la propiedad celular.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCELULAR() {
                return celular;
            }

            /**
             * Define el valor de la propiedad celular.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCELULAR(String value) {
                this.celular = value;
            }

            /**
             * Obtiene el valor de la propiedad strash.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSTRASH() {
                return strash;
            }

            /**
             * Define el valor de la propiedad strash.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSTRASH(String value) {
                this.strash = value;
            }

            /**
             * Obtiene el valor de la propiedad ort02.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getORT02() {
                return ort02;
            }

            /**
             * Define el valor de la propiedad ort02.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setORT02(String value) {
                this.ort02 = value;
            }

            /**
             * Obtiene el valor de la propiedad pstlz.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPSTLZ() {
                return pstlz;
            }

            /**
             * Define el valor de la propiedad pstlz.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPSTLZ(String value) {
                this.pstlz = value;
            }

            /**
             * Obtiene el valor de la propiedad ort01.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getORT01() {
                return ort01;
            }

            /**
             * Define el valor de la propiedad ort01.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setORT01(String value) {
                this.ort01 = value;
            }

            /**
             * Obtiene el valor de la propiedad direc.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDIREC() {
                return direc;
            }

            /**
             * Define el valor de la propiedad direc.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDIREC(String value) {
                this.direc = value;
            }

            /**
             * Obtiene el valor de la propiedad iddirec.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getIDDIREC() {
                return iddirec;
            }

            /**
             * Define el valor de la propiedad iddirec.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setIDDIREC(String value) {
                this.iddirec = value;
            }

            /**
             * Obtiene el valor de la propiedad subdir.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSUBDIR() {
                return subdir;
            }

            /**
             * Define el valor de la propiedad subdir.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSUBDIR(String value) {
                this.subdir = value;
            }

            /**
             * Obtiene el valor de la propiedad idsubdir.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getIDSUBDIR() {
                return idsubdir;
            }

            /**
             * Define el valor de la propiedad idsubdir.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setIDSUBDIR(String value) {
                this.idsubdir = value;
            }

            /**
             * Obtiene el valor de la propiedad geren.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getGEREN() {
                return geren;
            }

            /**
             * Define el valor de la propiedad geren.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setGEREN(String value) {
                this.geren = value;
            }

            /**
             * Obtiene el valor de la propiedad edire.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getEDIRE() {
                return edire;
            }

            /**
             * Define el valor de la propiedad edire.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setEDIRE(String value) {
                this.edire = value;
            }

            /**
             * Obtiene el valor de la propiedad esubd.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getESUBD() {
                return esubd;
            }

            /**
             * Define el valor de la propiedad esubd.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setESUBD(String value) {
                this.esubd = value;
            }

            /**
             * Obtiene el valor de la propiedad egere.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getEGERE() {
                return egere;
            }

            /**
             * Define el valor de la propiedad egere.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setEGERE(String value) {
                this.egere = value;
            }

            /**
             * Obtiene el valor de la propiedad ejefe.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getEJEFE() {
                return ejefe;
            }

            /**
             * Define el valor de la propiedad ejefe.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setEJEFE(String value) {
                this.ejefe = value;
            }

            /**
             * Obtiene el valor de la propiedad njefe.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNJEFE() {
                return njefe;
            }

            /**
             * Define el valor de la propiedad njefe.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNJEFE(String value) {
                this.njefe = value;
            }

            /**
             * Obtiene el valor de la propiedad nivel4.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNIVEL4() {
                return nivel4;
            }

            /**
             * Define el valor de la propiedad nivel4.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNIVEL4(String value) {
                this.nivel4 = value;
            }

            /**
             * Obtiene el valor de la propiedad nivel5.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNIVEL5() {
                return nivel5;
            }

            /**
             * Define el valor de la propiedad nivel5.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNIVEL5(String value) {
                this.nivel5 = value;
            }

            /**
             * Obtiene el valor de la propiedad nivel6.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNIVEL6() {
                return nivel6;
            }

            /**
             * Define el valor de la propiedad nivel6.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNIVEL6(String value) {
                this.nivel6 = value;
            }

            /**
             * Obtiene el valor de la propiedad eniv4.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getENIV4() {
                return eniv4;
            }

            /**
             * Define el valor de la propiedad eniv4.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setENIV4(String value) {
                this.eniv4 = value;
            }

            /**
             * Obtiene el valor de la propiedad eniv5.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getENIV5() {
                return eniv5;
            }

            /**
             * Define el valor de la propiedad eniv5.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setENIV5(String value) {
                this.eniv5 = value;
            }

            /**
             * Obtiene el valor de la propiedad eniv6.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getENIV6() {
                return eniv6;
            }

            /**
             * Define el valor de la propiedad eniv6.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setENIV6(String value) {
                this.eniv6 = value;
            }

            /**
             * Obtiene el valor de la propiedad btrtl.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBTRTL() {
                return btrtl;
            }

            /**
             * Define el valor de la propiedad btrtl.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBTRTL(String value) {
                this.btrtl = value;
            }

            /**
             * Obtiene el valor de la propiedad btext.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBTEXT() {
                return btext;
            }

            /**
             * Define el valor de la propiedad btext.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBTEXT(String value) {
                this.btext = value;
            }

            /**
             * Obtiene el valor de la propiedad fecjub.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFECJUB() {
                return fecjub;
            }

            /**
             * Define el valor de la propiedad fecjub.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFECJUB(String value) {
                this.fecjub = value;
            }

            /**
             * Obtiene el valor de la propiedad pensali.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPENSALI() {
                return pensali;
            }

            /**
             * Define el valor de la propiedad pensali.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPENSALI(String value) {
                this.pensali = value;
            }

            /**
             * Obtiene el valor de la propiedad demaemp.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDEMAEMP() {
                return demaemp;
            }

            /**
             * Define el valor de la propiedad demaemp.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDEMAEMP(String value) {
                this.demaemp = value;
            }

            /**
             * Obtiene el valor de la propiedad credinfo.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCREDINFO() {
                return credinfo;
            }

            /**
             * Define el valor de la propiedad credinfo.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCREDINFO(String value) {
                this.credinfo = value;
            }

            /**
             * Obtiene el valor de la propiedad credfona.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCREDFONA() {
                return credfona;
            }

            /**
             * Define el valor de la propiedad credfona.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCREDFONA(String value) {
                this.credfona = value;
            }

            /**
             * Obtiene el valor de la propiedad unidad.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUNIDAD() {
                return unidad;
            }

            /**
             * Define el valor de la propiedad unidad.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUNIDAD(String value) {
                this.unidad = value;
            }

            /**
             * Obtiene el valor de la propiedad area.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getAREA() {
                return area;
            }

            /**
             * Define el valor de la propiedad area.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setAREA(String value) {
                this.area = value;
            }

            /**
             * Obtiene el valor de la propiedad poblacion.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPOBLACION() {
                return poblacion;
            }

            /**
             * Define el valor de la propiedad poblacion.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPOBLACION(String value) {
                this.poblacion = value;
            }

            /**
             * Obtiene el valor de la propiedad destipct.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDESTIPCT() {
                return destipct;
            }

            /**
             * Define el valor de la propiedad destipct.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDESTIPCT(String value) {
                this.destipct = value;
            }

            /**
             * Obtiene el valor de la propiedad divnum.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDIVNUM() {
                return divnum;
            }

            /**
             * Define el valor de la propiedad divnum.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDIVNUM(String value) {
                this.divnum = value;
            }

            /**
             * Obtiene el valor de la propiedad fsist.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFSIST() {
                return fsist;
            }

            /**
             * Define el valor de la propiedad fsist.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFSIST(String value) {
                this.fsist = value;
            }

            /**
             * Obtiene el valor de la propiedad natio.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNATIO() {
                return natio;
            }

            /**
             * Define el valor de la propiedad natio.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNATIO(String value) {
                this.natio = value;
            }

            /**
             * Obtiene el valor de la propiedad denatio.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDENATIO() {
                return denatio;
            }

            /**
             * Define el valor de la propiedad denatio.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDENATIO(String value) {
                this.denatio = value;
            }

			@Override
			public String toString() {
				return "Item [expsolicita=" + expsolicita + ", idmovimiento=" + idmovimiento + ", mandt=" + mandt
						+ ", pernr=" + pernr + ", nachn=" + nachn + ", nach2=" + nach2 + ", vorna=" + vorna + ", persg="
						+ persg + ", depersg=" + depersg + ", persk=" + persk + ", depersk=" + depersk + ", stat2="
						+ stat2 + ", destat2=" + destat2 + ", stat1=" + stat1 + ", destat1=" + destat1 + ", tpempleado="
						+ tpempleado + ", bukrs=" + bukrs + ", debukrs=" + debukrs + ", gsber=" + gsber + ", werks="
						+ werks + ", dewerks=" + dewerks + ", kostl=" + kostl + ", vdsk1=" + vdsk1 + ", orgeh=" + orgeh
						+ ", orgtx=" + orgtx + ", _short=" + _short + ", stext=" + stext + ", cvel1=" + cvel1
						+ ", deslo=" + deslo + ", rpht=" + rpht + ", stell=" + stell + ", destell=" + destell
						+ ", plans=" + plans + ", massn=" + massn + ", demassn=" + demassn + ", massg=" + massg
						+ ", demassg=" + demassg + ", zsm=" + zsm + ", lga01=" + lga01 + ", bet01=" + bet01 + ", sdimx="
						+ sdimx + ", vidca=" + vidca + ", c160=" + c160 + ", bankl=" + bankl + ", bankn=" + bankn
						+ ", fealtec=" + fealtec + ", gbdat=" + gbdat + ", gbort=" + gbort + ", feancob=" + feancob
						+ ", fedeba=" + fedeba + ", fecasu=" + fecasu + ", fecapu=" + fecapu + ", feanefj=" + feanefj
						+ ", fereant=" + fereant + ", fesupe=" + fesupe + ", ferevac=" + ferevac + ", fectemp="
						+ fectemp + ", fecdef=" + fecdef + ", icnum=" + icnum + ", nimss=" + nimss + ", perid=" + perid
						+ ", regpa=" + regpa + ", brfgn=" + brfgn + ", cuotae=" + cuotae + ", gesch=" + gesch
						+ ", degesch=" + degesch + ", famst=" + famst + ", defamst=" + defamst + ", ansvh=" + ansvh
						+ ", deansvh=" + deansvh + ", abkrs=" + abkrs + ", mstbr=" + mstbr + ", sacha=" + sacha
						+ ", sachz=" + sachz + ", sachp=" + sachp + ", zclav=" + zclav + ", edificio=" + edificio
						+ ", cvepiso=" + cvepiso + ", cveala=" + cveala + ", oficina=" + oficina + ", usrid1=" + usrid1
						+ ", usrid2=" + usrid2 + ", usrid3=" + usrid3 + ", num01=" + num01 + ", email=" + email
						+ ", pemail=" + pemail + ", telnr=" + telnr + ", num02=" + num02 + ", telcuota=" + telcuota
						+ ", carrier=" + carrier + ", celular=" + celular + ", strash=" + strash + ", ort02=" + ort02
						+ ", pstlz=" + pstlz + ", ort01=" + ort01 + ", direc=" + direc + ", iddirec=" + iddirec
						+ ", subdir=" + subdir + ", idsubdir=" + idsubdir + ", geren=" + geren + ", edire=" + edire
						+ ", esubd=" + esubd + ", egere=" + egere + ", ejefe=" + ejefe + ", njefe=" + njefe
						+ ", nivel4=" + nivel4 + ", nivel5=" + nivel5 + ", nivel6=" + nivel6 + ", eniv4=" + eniv4
						+ ", eniv5=" + eniv5 + ", eniv6=" + eniv6 + ", btrtl=" + btrtl + ", btext=" + btext
						+ ", fecjub=" + fecjub + ", pensali=" + pensali + ", demaemp=" + demaemp + ", credinfo="
						+ credinfo + ", credfona=" + credfona + ", unidad=" + unidad + ", area=" + area + ", poblacion="
						+ poblacion + ", destipct=" + destipct + ", divnum=" + divnum + ", fsist=" + fsist + ", natio="
						+ natio + ", denatio=" + denatio + "]";
			}


        }

    }

}
