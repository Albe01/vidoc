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
 * <p>Java class for protocollo-ri element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="protocollo-ri">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}modelli-trascrizioni" minOccurs="0"/>
 *           &lt;element ref="{}atti-trascrizioni" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="anno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-protocollo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-protocollo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-protocollo-ufficio" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "modelliTrascrizioni",
    "attiTrascrizioni"
})
@XmlRootElement(name = "protocollo-ri")
public class ProtocolloRi {

    @XmlElement(name = "modelli-trascrizioni")
    protected ModelliTrascrizioni modelliTrascrizioni;
    @XmlElement(name = "atti-trascrizioni")
    protected AttiTrascrizioni attiTrascrizioni;
    @XmlAttribute
    protected String anno;
    @XmlAttribute(name = "dt-protocollo")
    protected String dtProtocollo;
    @XmlAttribute(name = "n-protocollo")
    protected String nProtocollo;
    @XmlAttribute(name = "n-protocollo-ufficio")
    protected String nProtocolloUfficio;

    /**
     * Gets the value of the modelliTrascrizioni property.
     * 
     * @return
     *     possible object is
     *     {@link ModelliTrascrizioni }
     *     
     */
    public ModelliTrascrizioni getModelliTrascrizioni() {
        return modelliTrascrizioni;
    }

    /**
     * Sets the value of the modelliTrascrizioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelliTrascrizioni }
     *     
     */
    public void setModelliTrascrizioni(ModelliTrascrizioni value) {
        this.modelliTrascrizioni = value;
    }

    /**
     * Gets the value of the attiTrascrizioni property.
     * 
     * @return
     *     possible object is
     *     {@link AttiTrascrizioni }
     *     
     */
    public AttiTrascrizioni getAttiTrascrizioni() {
        return attiTrascrizioni;
    }

    /**
     * Sets the value of the attiTrascrizioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttiTrascrizioni }
     *     
     */
    public void setAttiTrascrizioni(AttiTrascrizioni value) {
        this.attiTrascrizioni = value;
    }

    /**
     * Gets the value of the anno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnno() {
        return anno;
    }

    /**
     * Sets the value of the anno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnno(String value) {
        this.anno = value;
    }

    /**
     * Gets the value of the dtProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtProtocollo() {
        return dtProtocollo;
    }

    /**
     * Sets the value of the dtProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtProtocollo(String value) {
        this.dtProtocollo = value;
    }

    /**
     * Gets the value of the nProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNProtocollo() {
        return nProtocollo;
    }

    /**
     * Sets the value of the nProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNProtocollo(String value) {
        this.nProtocollo = value;
    }

    /**
     * Gets the value of the nProtocolloUfficio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNProtocolloUfficio() {
        return nProtocolloUfficio;
    }

    /**
     * Sets the value of the nProtocolloUfficio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNProtocolloUfficio(String value) {
        this.nProtocolloUfficio = value;
    }

}