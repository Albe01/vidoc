//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 05:57:20 PM CEST 
//


package it.vidoc.registro.imprese.ricerca.anagrafica.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerCodFiscImpresaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerCodFiscImpresaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KCodFisc" type="{}KCodFiscType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerCodFiscImpresaType", propOrder = {
    "kCodFisc"
})
public class PerCodFiscImpresaType {

    @XmlElement(name = "KCodFisc", required = true)
    protected KCodFiscType kCodFisc;

    /**
     * Gets the value of the kCodFisc property.
     * 
     * @return
     *     possible object is
     *     {@link KCodFiscType }
     *     
     */
    public KCodFiscType getKCodFisc() {
        return kCodFisc;
    }

    /**
     * Sets the value of the kCodFisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link KCodFiscType }
     *     
     */
    public void setKCodFisc(KCodFiscType value) {
        this.kCodFisc = value;
    }

}