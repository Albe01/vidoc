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
 * <p>Java class for InformazioniReteImpresaHtmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformazioniReteImpresaHtmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;choice>
 *           &lt;element name="PerChiaveContrattoHtml" type="{}PerChiaveContrattoHtmlType"/>
 *           &lt;element name="PerCodFiscContrattoHtml" type="{}PerCodFiscContrattoHtmlType"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformazioniReteImpresaHtmlType", propOrder = {
    "perChiaveContrattoHtml",
    "perCodFiscContrattoHtml"
})
public class InformazioniReteImpresaHtmlType {

    @XmlElement(name = "PerChiaveContrattoHtml")
    protected PerChiaveContrattoHtmlType perChiaveContrattoHtml;
    @XmlElement(name = "PerCodFiscContrattoHtml")
    protected PerCodFiscContrattoHtmlType perCodFiscContrattoHtml;

    /**
     * Gets the value of the perChiaveContrattoHtml property.
     * 
     * @return
     *     possible object is
     *     {@link PerChiaveContrattoHtmlType }
     *     
     */
    public PerChiaveContrattoHtmlType getPerChiaveContrattoHtml() {
        return perChiaveContrattoHtml;
    }

    /**
     * Sets the value of the perChiaveContrattoHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerChiaveContrattoHtmlType }
     *     
     */
    public void setPerChiaveContrattoHtml(PerChiaveContrattoHtmlType value) {
        this.perChiaveContrattoHtml = value;
    }

    /**
     * Gets the value of the perCodFiscContrattoHtml property.
     * 
     * @return
     *     possible object is
     *     {@link PerCodFiscContrattoHtmlType }
     *     
     */
    public PerCodFiscContrattoHtmlType getPerCodFiscContrattoHtml() {
        return perCodFiscContrattoHtml;
    }

    /**
     * Sets the value of the perCodFiscContrattoHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerCodFiscContrattoHtmlType }
     *     
     */
    public void setPerCodFiscContrattoHtml(PerCodFiscContrattoHtmlType value) {
        this.perCodFiscContrattoHtml = value;
    }

}
