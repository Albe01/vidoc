//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 06:18:12 PM CEST 
//


package it.vidoc.registro.imprese.output.ri.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for esiti-controllo element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="esiti-controllo">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}esito-controllo"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "esitoControllo"
})
@XmlRootElement(name = "esiti-controllo")
public class EsitiControllo {

    @XmlElement(name = "esito-controllo", required = true)
    protected EsitoControllo esitoControllo;

    /**
     * Gets the value of the esitoControllo property.
     * 
     * @return
     *     possible object is
     *     {@link EsitoControllo }
     *     
     */
    public EsitoControllo getEsitoControllo() {
        return esitoControllo;
    }

    /**
     * Sets the value of the esitoControllo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsitoControllo }
     *     
     */
    public void setEsitoControllo(EsitoControllo value) {
        this.esitoControllo = value;
    }

}