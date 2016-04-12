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
 * <p>Java class for comunicazione-curatore element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="comunicazione-curatore">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}estremi-udienza" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="cognome-giudice" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-provvedimento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-provvedimento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="nome-giudice" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="tribunale" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "estremiUdienza"
})
@XmlRootElement(name = "comunicazione-curatore")
public class ComunicazioneCuratore {

    @XmlElement(name = "estremi-udienza")
    protected EstremiUdienza estremiUdienza;
    @XmlAttribute(name = "cognome-giudice")
    protected String cognomeGiudice;
    @XmlAttribute(name = "dt-provvedimento")
    protected String dtProvvedimento;
    @XmlAttribute(name = "n-provvedimento")
    protected String nProvvedimento;
    @XmlAttribute(name = "nome-giudice")
    protected String nomeGiudice;
    @XmlAttribute
    protected String tribunale;

    /**
     * Gets the value of the estremiUdienza property.
     * 
     * @return
     *     possible object is
     *     {@link EstremiUdienza }
     *     
     */
    public EstremiUdienza getEstremiUdienza() {
        return estremiUdienza;
    }

    /**
     * Sets the value of the estremiUdienza property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstremiUdienza }
     *     
     */
    public void setEstremiUdienza(EstremiUdienza value) {
        this.estremiUdienza = value;
    }

    /**
     * Gets the value of the cognomeGiudice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognomeGiudice() {
        return cognomeGiudice;
    }

    /**
     * Sets the value of the cognomeGiudice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognomeGiudice(String value) {
        this.cognomeGiudice = value;
    }

    /**
     * Gets the value of the dtProvvedimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtProvvedimento() {
        return dtProvvedimento;
    }

    /**
     * Sets the value of the dtProvvedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtProvvedimento(String value) {
        this.dtProvvedimento = value;
    }

    /**
     * Gets the value of the nProvvedimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNProvvedimento() {
        return nProvvedimento;
    }

    /**
     * Sets the value of the nProvvedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNProvvedimento(String value) {
        this.nProvvedimento = value;
    }

    /**
     * Gets the value of the nomeGiudice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeGiudice() {
        return nomeGiudice;
    }

    /**
     * Sets the value of the nomeGiudice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeGiudice(String value) {
        this.nomeGiudice = value;
    }

    /**
     * Gets the value of the tribunale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTribunale() {
        return tribunale;
    }

    /**
     * Sets the value of the tribunale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTribunale(String value) {
        this.tribunale = value;
    }

}
