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
 * <p>Java class for patrimonio-specifico-affare element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="patrimonio-specifico-affare">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}costituzione" minOccurs="0"/>
 *           &lt;element ref="{}modifica" minOccurs="0"/>
 *           &lt;element ref="{}cessazione" minOccurs="0"/>
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
    "costituzione",
    "modifica",
    "cessazione"
})
@XmlRootElement(name = "patrimonio-specifico-affare")
public class PatrimonioSpecificoAffare {

    protected String costituzione;
    protected Modifica modifica;
    protected String cessazione;

    /**
     * Gets the value of the costituzione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostituzione() {
        return costituzione;
    }

    /**
     * Sets the value of the costituzione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostituzione(String value) {
        this.costituzione = value;
    }

    /**
     * Gets the value of the modifica property.
     * 
     * @return
     *     possible object is
     *     {@link Modifica }
     *     
     */
    public Modifica getModifica() {
        return modifica;
    }

    /**
     * Sets the value of the modifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modifica }
     *     
     */
    public void setModifica(Modifica value) {
        this.modifica = value;
    }

    /**
     * Gets the value of the cessazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCessazione() {
        return cessazione;
    }

    /**
     * Sets the value of the cessazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCessazione(String value) {
        this.cessazione = value;
    }

}
