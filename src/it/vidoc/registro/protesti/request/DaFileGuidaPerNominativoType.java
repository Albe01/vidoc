//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.27 at 11:18:10 AM CEST 
//


package it.vidoc.registro.protesti.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DaFileGuidaPerNominativoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DaFileGuidaPerNominativoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NomeFileGuida" type="{}NomeFileGuidaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DaFileGuidaPerNominativoType", propOrder = {
    "nomeFileGuida"
})
public class DaFileGuidaPerNominativoType {

    @XmlElement(name = "NomeFileGuida", required = true)
    protected String nomeFileGuida;

    /**
     * Gets the value of the nomeFileGuida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFileGuida() {
        return nomeFileGuida;
    }

    /**
     * Sets the value of the nomeFileGuida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFileGuida(String value) {
        this.nomeFileGuida = value;
    }

}
