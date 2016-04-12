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
 * <p>Java class for strumenti-finanziari element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="strumenti-finanziari">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}azioni-ordinarie" minOccurs="0"/>
 *           &lt;element ref="{}altre-azioni" minOccurs="0"/>
 *           &lt;element ref="{}obbligazioni" minOccurs="0"/>
 *           &lt;element ref="{}obbligazioni-convertibili" minOccurs="0"/>
 *           &lt;element ref="{}titoli-debito" minOccurs="0"/>
 *           &lt;element ref="{}altri-strumenti" minOccurs="0"/>
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
    "azioniOrdinarie",
    "altreAzioni",
    "obbligazioni",
    "obbligazioniConvertibili",
    "titoliDebito",
    "altriStrumenti"
})
@XmlRootElement(name = "strumenti-finanziari")
public class StrumentiFinanziari {

    @XmlElement(name = "azioni-ordinarie")
    protected String azioniOrdinarie;
    @XmlElement(name = "altre-azioni")
    protected String altreAzioni;
    protected String obbligazioni;
    @XmlElement(name = "obbligazioni-convertibili")
    protected String obbligazioniConvertibili;
    @XmlElement(name = "titoli-debito")
    protected String titoliDebito;
    @XmlElement(name = "altri-strumenti")
    protected String altriStrumenti;

    /**
     * Gets the value of the azioniOrdinarie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAzioniOrdinarie() {
        return azioniOrdinarie;
    }

    /**
     * Sets the value of the azioniOrdinarie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAzioniOrdinarie(String value) {
        this.azioniOrdinarie = value;
    }

    /**
     * Gets the value of the altreAzioni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltreAzioni() {
        return altreAzioni;
    }

    /**
     * Sets the value of the altreAzioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltreAzioni(String value) {
        this.altreAzioni = value;
    }

    /**
     * Gets the value of the obbligazioni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObbligazioni() {
        return obbligazioni;
    }

    /**
     * Sets the value of the obbligazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObbligazioni(String value) {
        this.obbligazioni = value;
    }

    /**
     * Gets the value of the obbligazioniConvertibili property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObbligazioniConvertibili() {
        return obbligazioniConvertibili;
    }

    /**
     * Sets the value of the obbligazioniConvertibili property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObbligazioniConvertibili(String value) {
        this.obbligazioniConvertibili = value;
    }

    /**
     * Gets the value of the titoliDebito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitoliDebito() {
        return titoliDebito;
    }

    /**
     * Sets the value of the titoliDebito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitoliDebito(String value) {
        this.titoliDebito = value;
    }

    /**
     * Gets the value of the altriStrumenti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltriStrumenti() {
        return altriStrumenti;
    }

    /**
     * Sets the value of the altriStrumenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltriStrumenti(String value) {
        this.altriStrumenti = value;
    }

}