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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for indirizzo-sede-estero element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="indirizzo-sede-estero">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}info-trasferimento" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="c-stato" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="indirizzo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="stato" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "infoTrasferimento"
})
@XmlRootElement(name = "indirizzo-sede-estero")
public class IndirizzoSedeEstero {

    @XmlElement(name = "info-trasferimento")
    protected String infoTrasferimento;
    @XmlAttribute(name = "c-stato")
    protected String cStato;
    @XmlAttribute
    protected String indirizzo;
    @XmlAttribute
    protected String stato;

    /**
     * Gets the value of the infoTrasferimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoTrasferimento() {
        return infoTrasferimento;
    }

    /**
     * Sets the value of the infoTrasferimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoTrasferimento(String value) {
        this.infoTrasferimento = value;
    }

    /**
     * Gets the value of the cStato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCStato() {
        return cStato;
    }

    /**
     * Sets the value of the cStato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCStato(String value) {
        this.cStato = value;
    }

    /**
     * Gets the value of the indirizzo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * Sets the value of the indirizzo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirizzo(String value) {
        this.indirizzo = value;
    }

    /**
     * Gets the value of the stato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStato() {
        return stato;
    }

    /**
     * Sets the value of the stato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStato(String value) {
        this.stato = value;
    }

}
