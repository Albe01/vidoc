//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 06:18:12 PM CEST 
//


package it.vidoc.registro.imprese.output.ri.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for info-mese element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="info-mese">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;attribute name="c-mese" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="mese" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-dipendenti" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-indipendenti" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-totale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "info-mese")
public class InfoMese {

    @XmlAttribute(name = "c-mese")
    protected String cMese;
    @XmlAttribute
    protected String mese;
    @XmlAttribute(name = "n-dipendenti")
    protected String nDipendenti;
    @XmlAttribute(name = "n-indipendenti")
    protected String nIndipendenti;
    @XmlAttribute(name = "n-totale")
    protected String nTotale;

    /**
     * Gets the value of the cMese property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMese() {
        return cMese;
    }

    /**
     * Sets the value of the cMese property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMese(String value) {
        this.cMese = value;
    }

    /**
     * Gets the value of the mese property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMese() {
        return mese;
    }

    /**
     * Sets the value of the mese property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMese(String value) {
        this.mese = value;
    }

    /**
     * Gets the value of the nDipendenti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNDipendenti() {
        return nDipendenti;
    }

    /**
     * Sets the value of the nDipendenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNDipendenti(String value) {
        this.nDipendenti = value;
    }

    /**
     * Gets the value of the nIndipendenti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIndipendenti() {
        return nIndipendenti;
    }

    /**
     * Sets the value of the nIndipendenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIndipendenti(String value) {
        this.nIndipendenti = value;
    }

    /**
     * Gets the value of the nTotale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTotale() {
        return nTotale;
    }

    /**
     * Sets the value of the nTotale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTotale(String value) {
        this.nTotale = value;
    }

}