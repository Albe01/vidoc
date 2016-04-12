//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 06:18:12 PM CEST 
//


package it.vidoc.registro.imprese.output.ri.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for diritto-partecipazione element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="diritto-partecipazione">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}ruolo-partecipazione" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;attribute name="c-tipo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="c-valuta" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="frazione-denominatore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="frazione-numeratore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="percentuale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="valore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="valuta" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "content"
})
@XmlRootElement(name = "diritto-partecipazione")
public class DirittoPartecipazione {

    @XmlElementRef(name = "ruolo-partecipazione", type = RuoloPartecipazione.class)
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "c-tipo")
    protected String cTipo;
    @XmlAttribute(name = "c-valuta")
    protected String cValuta;
    @XmlAttribute(name = "frazione-denominatore")
    protected String frazioneDenominatore;
    @XmlAttribute(name = "frazione-numeratore")
    protected String frazioneNumeratore;
    @XmlAttribute
    protected String percentuale;
    @XmlAttribute
    protected String tipo;
    @XmlAttribute
    protected String valore;
    @XmlAttribute
    protected String valuta;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link RuoloPartecipazione }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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
     * Gets the value of the cValuta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCValuta() {
        return cValuta;
    }

    /**
     * Sets the value of the cValuta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCValuta(String value) {
        this.cValuta = value;
    }

    /**
     * Gets the value of the frazioneDenominatore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrazioneDenominatore() {
        return frazioneDenominatore;
    }

    /**
     * Sets the value of the frazioneDenominatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrazioneDenominatore(String value) {
        this.frazioneDenominatore = value;
    }

    /**
     * Gets the value of the frazioneNumeratore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrazioneNumeratore() {
        return frazioneNumeratore;
    }

    /**
     * Sets the value of the frazioneNumeratore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrazioneNumeratore(String value) {
        this.frazioneNumeratore = value;
    }

    /**
     * Gets the value of the percentuale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentuale() {
        return percentuale;
    }

    /**
     * Sets the value of the percentuale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentuale(String value) {
        this.percentuale = value;
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

    /**
     * Gets the value of the valore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValore() {
        return valore;
    }

    /**
     * Sets the value of the valore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValore(String value) {
        this.valore = value;
    }

    /**
     * Gets the value of the valuta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuta() {
        return valuta;
    }

    /**
     * Sets the value of the valuta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuta(String value) {
        this.valuta = value;
    }

}