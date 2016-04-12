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
 * <p>Java class for protocollo element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="protocollo">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}modelli" minOccurs="0"/>
 *           &lt;element ref="{}atti" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="anno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="c-albo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="c-stato-avanzamento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="c-stato-pratica" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="cciaa-intercamerale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-protocollo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-ultima-modifica" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="stato-avanzamento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="stato-pratica" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "modelli",
    "atti"
})
@XmlRootElement(name = "protocollo")
public class Protocollo {

    protected Modelli modelli;
    protected Atti atti;
    @XmlAttribute
    protected String anno;
    @XmlAttribute(name = "c-albo")
    protected String cAlbo;
    @XmlAttribute(name = "c-stato-avanzamento")
    protected String cStatoAvanzamento;
    @XmlAttribute(name = "c-stato-pratica")
    protected String cStatoPratica;
    @XmlAttribute(name = "cciaa-intercamerale")
    protected String cciaaIntercamerale;
    @XmlAttribute(name = "dt-protocollo")
    protected String dtProtocollo;
    @XmlAttribute(name = "dt-ultima-modifica")
    protected String dtUltimaModifica;
    @XmlAttribute
    protected String n;
    @XmlAttribute(name = "stato-avanzamento")
    protected String statoAvanzamento;
    @XmlAttribute(name = "stato-pratica")
    protected String statoPratica;

    /**
     * Gets the value of the modelli property.
     * 
     * @return
     *     possible object is
     *     {@link Modelli }
     *     
     */
    public Modelli getModelli() {
        return modelli;
    }

    /**
     * Sets the value of the modelli property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modelli }
     *     
     */
    public void setModelli(Modelli value) {
        this.modelli = value;
    }

    /**
     * Gets the value of the atti property.
     * 
     * @return
     *     possible object is
     *     {@link Atti }
     *     
     */
    public Atti getAtti() {
        return atti;
    }

    /**
     * Sets the value of the atti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Atti }
     *     
     */
    public void setAtti(Atti value) {
        this.atti = value;
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
     * Gets the value of the cAlbo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAlbo() {
        return cAlbo;
    }

    /**
     * Sets the value of the cAlbo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAlbo(String value) {
        this.cAlbo = value;
    }

    /**
     * Gets the value of the cStatoAvanzamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCStatoAvanzamento() {
        return cStatoAvanzamento;
    }

    /**
     * Sets the value of the cStatoAvanzamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCStatoAvanzamento(String value) {
        this.cStatoAvanzamento = value;
    }

    /**
     * Gets the value of the cStatoPratica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCStatoPratica() {
        return cStatoPratica;
    }

    /**
     * Sets the value of the cStatoPratica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCStatoPratica(String value) {
        this.cStatoPratica = value;
    }

    /**
     * Gets the value of the cciaaIntercamerale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCciaaIntercamerale() {
        return cciaaIntercamerale;
    }

    /**
     * Sets the value of the cciaaIntercamerale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCciaaIntercamerale(String value) {
        this.cciaaIntercamerale = value;
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
     * Gets the value of the dtUltimaModifica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtUltimaModifica() {
        return dtUltimaModifica;
    }

    /**
     * Sets the value of the dtUltimaModifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtUltimaModifica(String value) {
        this.dtUltimaModifica = value;
    }

    /**
     * Gets the value of the n property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getN() {
        return n;
    }

    /**
     * Sets the value of the n property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setN(String value) {
        this.n = value;
    }

    /**
     * Gets the value of the statoAvanzamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatoAvanzamento() {
        return statoAvanzamento;
    }

    /**
     * Sets the value of the statoAvanzamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatoAvanzamento(String value) {
        this.statoAvanzamento = value;
    }

    /**
     * Gets the value of the statoPratica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatoPratica() {
        return statoPratica;
    }

    /**
     * Sets the value of the statoPratica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatoPratica(String value) {
        this.statoPratica = value;
    }

}
