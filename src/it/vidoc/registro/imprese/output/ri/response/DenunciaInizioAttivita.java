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
 * <p>Java class for denuncia-inizio-attivita element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="denuncia-inizio-attivita">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;attribute name="c-ente-rilascio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="c-tipo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-denuncia" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="ente-rilascio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "denuncia-inizio-attivita")
public class DenunciaInizioAttivita {

    @XmlAttribute(name = "c-ente-rilascio")
    protected String cEnteRilascio;
    @XmlAttribute(name = "c-tipo")
    protected String cTipo;
    @XmlAttribute(name = "dt-denuncia")
    protected String dtDenuncia;
    @XmlAttribute(name = "ente-rilascio")
    protected String enteRilascio;
    @XmlAttribute
    protected String tipo;

    /**
     * Gets the value of the cEnteRilascio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEnteRilascio() {
        return cEnteRilascio;
    }

    /**
     * Sets the value of the cEnteRilascio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEnteRilascio(String value) {
        this.cEnteRilascio = value;
    }

    /**
     * Gets the value of the cTipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTipo() {
        return cTipo;
    }

    /**
     * Sets the value of the cTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTipo(String value) {
        this.cTipo = value;
    }

    /**
     * Gets the value of the dtDenuncia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtDenuncia() {
        return dtDenuncia;
    }

    /**
     * Sets the value of the dtDenuncia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtDenuncia(String value) {
        this.dtDenuncia = value;
    }

    /**
     * Gets the value of the enteRilascio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnteRilascio() {
        return enteRilascio;
    }

    /**
     * Sets the value of the enteRilascio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnteRilascio(String value) {
        this.enteRilascio = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

}
