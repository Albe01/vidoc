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
 * <p>Java class for InformazioniImpresaXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformazioniImpresaXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="PerChiaveReaXml" type="{}PerChiaveReaXmlType"/>
 *         &lt;element name="PerCodFiscSedeXml" type="{}PerCodFiscSedeXmlType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformazioniImpresaXmlType", propOrder = {
    "perChiaveReaXml",
    "perCodFiscSedeXml"
})
public class InformazioniImpresaXmlType {

    @XmlElement(name = "PerChiaveReaXml")
    protected PerChiaveReaXmlType perChiaveReaXml;
    @XmlElement(name = "PerCodFiscSedeXml")
    protected PerCodFiscSedeXmlType perCodFiscSedeXml;

    /**
     * Gets the value of the perChiaveReaXml property.
     * 
     * @return
     *     possible object is
     *     {@link PerChiaveReaXmlType }
     *     
     */
    public PerChiaveReaXmlType getPerChiaveReaXml() {
        return perChiaveReaXml;
    }

    /**
     * Sets the value of the perChiaveReaXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerChiaveReaXmlType }
     *     
     */
    public void setPerChiaveReaXml(PerChiaveReaXmlType value) {
        this.perChiaveReaXml = value;
    }

    /**
     * Gets the value of the perCodFiscSedeXml property.
     * 
     * @return
     *     possible object is
     *     {@link PerCodFiscSedeXmlType }
     *     
     */
    public PerCodFiscSedeXmlType getPerCodFiscSedeXml() {
        return perCodFiscSedeXml;
    }

    /**
     * Sets the value of the perCodFiscSedeXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerCodFiscSedeXmlType }
     *     
     */
    public void setPerCodFiscSedeXml(PerCodFiscSedeXmlType value) {
        this.perCodFiscSedeXml = value;
    }

}
