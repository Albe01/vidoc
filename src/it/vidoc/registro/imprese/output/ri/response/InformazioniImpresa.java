//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 06:18:12 PM CEST 
//


package it.vidoc.registro.imprese.output.ri.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for informazioni-impresa element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="informazioni-impresa">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}statuto" minOccurs="0"/>
 *           &lt;element ref="{}bilancio" minOccurs="0"/>
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
    "statuto",
    "bilancio"
})
@XmlRootElement(name = "informazioni-impresa")
public class InformazioniImpresa {

    protected Statuto statuto;
    protected Bilancio bilancio;

    /**
     * Gets the value of the statuto property.
     * 
     * @return
     *     possible object is
     *     {@link Statuto }
     *     
     */
    public Statuto getStatuto() {
        return statuto;
    }

    /**
     * Sets the value of the statuto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statuto }
     *     
     */
    public void setStatuto(Statuto value) {
        this.statuto = value;
    }

    /**
     * Gets the value of the bilancio property.
     * 
     * @return
     *     possible object is
     *     {@link Bilancio }
     *     
     */
    public Bilancio getBilancio() {
        return bilancio;
    }

    /**
     * Sets the value of the bilancio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bilancio }
     *     
     */
    public void setBilancio(Bilancio value) {
        this.bilancio = value;
    }

}