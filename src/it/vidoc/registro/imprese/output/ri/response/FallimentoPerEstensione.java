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
 * <p>Java class for fallimento-per-estensione element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="fallimento-per-estensione">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}estremi-nascita" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="c-fiscale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="c-organo-giudiziario" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="cognome" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="curatore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-chiusura" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-fallimento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-sentenza" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-fallimento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-sentenza" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="nome" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="organo-giudiziario" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="provincia-tribunale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="sesso" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "estremiNascita"
})
@XmlRootElement(name = "fallimento-per-estensione")
public class FallimentoPerEstensione {

    @XmlElement(name = "estremi-nascita")
    protected EstremiNascita estremiNascita;
    @XmlAttribute(name = "c-fiscale")
    protected String cFiscale;
    @XmlAttribute(name = "c-organo-giudiziario")
    protected String cOrganoGiudiziario;
    @XmlAttribute
    protected String cognome;
    @XmlAttribute
    protected String curatore;
    @XmlAttribute(name = "dt-chiusura")
    protected String dtChiusura;
    @XmlAttribute(name = "dt-fallimento")
    protected String dtFallimento;
    @XmlAttribute(name = "dt-sentenza")
    protected String dtSentenza;
    @XmlAttribute(name = "n-fallimento")
    protected String nFallimento;
    @XmlAttribute(name = "n-sentenza")
    protected String nSentenza;
    @XmlAttribute
    protected String nome;
    @XmlAttribute(name = "organo-giudiziario")
    protected String organoGiudiziario;
    @XmlAttribute(name = "provincia-tribunale")
    protected String provinciaTribunale;
    @XmlAttribute
    protected String sesso;
    @XmlAttribute
    protected String tribunale;

    /**
     * Gets the value of the estremiNascita property.
     * 
     * @return
     *     possible object is
     *     {@link EstremiNascita }
     *     
     */
    public EstremiNascita getEstremiNascita() {
        return estremiNascita;
    }

    /**
     * Sets the value of the estremiNascita property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstremiNascita }
     *     
     */
    public void setEstremiNascita(EstremiNascita value) {
        this.estremiNascita = value;
    }

    /**
     * Gets the value of the cFiscale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFiscale() {
        return cFiscale;
    }

    /**
     * Sets the value of the cFiscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFiscale(String value) {
        this.cFiscale = value;
    }

    /**
     * Gets the value of the cOrganoGiudiziario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOrganoGiudiziario() {
        return cOrganoGiudiziario;
    }

    /**
     * Sets the value of the cOrganoGiudiziario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOrganoGiudiziario(String value) {
        this.cOrganoGiudiziario = value;
    }

    /**
     * Gets the value of the cognome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Sets the value of the cognome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognome(String value) {
        this.cognome = value;
    }

    /**
     * Gets the value of the curatore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuratore() {
        return curatore;
    }

    /**
     * Sets the value of the curatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuratore(String value) {
        this.curatore = value;
    }

    /**
     * Gets the value of the dtChiusura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtChiusura() {
        return dtChiusura;
    }

    /**
     * Sets the value of the dtChiusura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtChiusura(String value) {
        this.dtChiusura = value;
    }

    /**
     * Gets the value of the dtFallimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtFallimento() {
        return dtFallimento;
    }

    /**
     * Sets the value of the dtFallimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtFallimento(String value) {
        this.dtFallimento = value;
    }

    /**
     * Gets the value of the dtSentenza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtSentenza() {
        return dtSentenza;
    }

    /**
     * Sets the value of the dtSentenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtSentenza(String value) {
        this.dtSentenza = value;
    }

    /**
     * Gets the value of the nFallimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNFallimento() {
        return nFallimento;
    }

    /**
     * Sets the value of the nFallimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNFallimento(String value) {
        this.nFallimento = value;
    }

    /**
     * Gets the value of the nSentenza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSentenza() {
        return nSentenza;
    }

    /**
     * Sets the value of the nSentenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSentenza(String value) {
        this.nSentenza = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the organoGiudiziario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganoGiudiziario() {
        return organoGiudiziario;
    }

    /**
     * Sets the value of the organoGiudiziario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganoGiudiziario(String value) {
        this.organoGiudiziario = value;
    }

    /**
     * Gets the value of the provinciaTribunale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinciaTribunale() {
        return provinciaTribunale;
    }

    /**
     * Sets the value of the provinciaTribunale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinciaTribunale(String value) {
        this.provinciaTribunale = value;
    }

    /**
     * Gets the value of the sesso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSesso() {
        return sesso;
    }

    /**
     * Sets the value of the sesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSesso(String value) {
        this.sesso = value;
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