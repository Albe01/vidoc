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
 * <p>Java class for abilitazione-impiantisti element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="abilitazione-impiantisti">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;attribute name="c-ente-rilascio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="c-qualifica" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="descrizione-lettera" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-accertamento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-iscrizione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="ente-rilascio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="f-tutte-attivita-impresa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="lettera" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="lettere" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="limitazioni" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="provincia" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="qualifica" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "abilitazione-impiantisti")
public class AbilitazioneImpiantisti {

    @XmlAttribute(name = "c-ente-rilascio")
    protected String cEnteRilascio;
    @XmlAttribute(name = "c-qualifica")
    protected String cQualifica;
    @XmlAttribute(name = "descrizione-lettera")
    protected String descrizioneLettera;
    @XmlAttribute(name = "dt-accertamento")
    protected String dtAccertamento;
    @XmlAttribute(name = "dt-iscrizione")
    protected String dtIscrizione;
    @XmlAttribute(name = "ente-rilascio")
    protected String enteRilascio;
    @XmlAttribute(name = "f-tutte-attivita-impresa")
    protected String fTutteAttivitaImpresa;
    @XmlAttribute
    protected String lettera;
    @XmlAttribute
    protected String lettere;
    @XmlAttribute
    protected String limitazioni;
    @XmlAttribute
    protected String n;
    @XmlAttribute
    protected String provincia;
    @XmlAttribute
    protected String qualifica;

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
     * Gets the value of the cQualifica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCQualifica() {
        return cQualifica;
    }

    /**
     * Sets the value of the cQualifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCQualifica(String value) {
        this.cQualifica = value;
    }

    /**
     * Gets the value of the descrizioneLettera property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneLettera() {
        return descrizioneLettera;
    }

    /**
     * Sets the value of the descrizioneLettera property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneLettera(String value) {
        this.descrizioneLettera = value;
    }

    /**
     * Gets the value of the dtAccertamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtAccertamento() {
        return dtAccertamento;
    }

    /**
     * Sets the value of the dtAccertamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtAccertamento(String value) {
        this.dtAccertamento = value;
    }

    /**
     * Gets the value of the dtIscrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtIscrizione() {
        return dtIscrizione;
    }

    /**
     * Sets the value of the dtIscrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtIscrizione(String value) {
        this.dtIscrizione = value;
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
     * Gets the value of the fTutteAttivitaImpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTutteAttivitaImpresa() {
        return fTutteAttivitaImpresa;
    }

    /**
     * Sets the value of the fTutteAttivitaImpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTutteAttivitaImpresa(String value) {
        this.fTutteAttivitaImpresa = value;
    }

    /**
     * Gets the value of the lettera property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLettera() {
        return lettera;
    }

    /**
     * Sets the value of the lettera property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLettera(String value) {
        this.lettera = value;
    }

    /**
     * Gets the value of the lettere property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLettere() {
        return lettere;
    }

    /**
     * Sets the value of the lettere property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLettere(String value) {
        this.lettere = value;
    }

    /**
     * Gets the value of the limitazioni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitazioni() {
        return limitazioni;
    }

    /**
     * Sets the value of the limitazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitazioni(String value) {
        this.limitazioni = value;
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
     * Gets the value of the provincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Sets the value of the provincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Gets the value of the qualifica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifica() {
        return qualifica;
    }

    /**
     * Sets the value of the qualifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifica(String value) {
        this.qualifica = value;
    }

}
