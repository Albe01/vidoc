//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 06:16:18 PM CEST 
//


package it.vidoc.registro.imprese.output.ri.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RicPerDenomContrattoXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RicPerDenomContrattoXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DenominazioneContratto" type="{}DenominazioneContrattoType"/>
 *         &lt;element name="FDenomEsatta" type="{}FDenomEsattaType" minOccurs="0"/>
 *         &lt;element name="FParolaTronca" type="{}FParolaTroncaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RicPerDenomContrattoXmlType", propOrder = {
    "denominazioneContratto",
    "fDenomEsatta",
    "fParolaTronca"
})
public class RicPerDenomContrattoXmlType {

    @XmlElement(name = "DenominazioneContratto", required = true)
    protected String denominazioneContratto;
    @XmlElement(name = "FDenomEsatta")
    protected String fDenomEsatta;
    @XmlElement(name = "FParolaTronca")
    protected String fParolaTronca;

    /**
     * Gets the value of the denominazioneContratto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominazioneContratto() {
        return denominazioneContratto;
    }

    /**
     * Sets the value of the denominazioneContratto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominazioneContratto(String value) {
        this.denominazioneContratto = value;
    }

    /**
     * Gets the value of the fDenomEsatta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFDenomEsatta() {
        return fDenomEsatta;
    }

    /**
     * Sets the value of the fDenomEsatta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFDenomEsatta(String value) {
        this.fDenomEsatta = value;
    }

    /**
     * Gets the value of the fParolaTronca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFParolaTronca() {
        return fParolaTronca;
    }

    /**
     * Sets the value of the fParolaTronca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFParolaTronca(String value) {
        this.fParolaTronca = value;
    }

}