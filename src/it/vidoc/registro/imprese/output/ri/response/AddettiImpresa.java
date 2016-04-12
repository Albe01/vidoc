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
 * <p>Java class for addetti-impresa element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="addetti-impresa">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}info-mesi" minOccurs="0"/>
 *           &lt;element ref="{}valori-medi" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="anno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="c-rilevazione-dipendenti" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="c-tipo-informazione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-dichiarazione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-rilevazione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-dipendenti" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-indipendenti" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-totale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="tipo-informazione" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "infoMesi",
    "valoriMedi"
})
@XmlRootElement(name = "addetti-impresa")
public class AddettiImpresa {

    @XmlElement(name = "info-mesi")
    protected InfoMesi infoMesi;
    @XmlElement(name = "valori-medi")
    protected ValoriMedi valoriMedi;
    @XmlAttribute
    protected String anno;
    @XmlAttribute(name = "c-rilevazione-dipendenti")
    protected String cRilevazioneDipendenti;
    @XmlAttribute(name = "c-tipo-informazione")
    protected String cTipoInformazione;
    @XmlAttribute(name = "dt-dichiarazione")
    protected String dtDichiarazione;
    @XmlAttribute(name = "dt-rilevazione")
    protected String dtRilevazione;
    @XmlAttribute(name = "n-dipendenti")
    protected String nDipendenti;
    @XmlAttribute(name = "n-indipendenti")
    protected String nIndipendenti;
    @XmlAttribute(name = "n-totale")
    protected String nTotale;
    @XmlAttribute(name = "tipo-informazione")
    protected String tipoInformazione;

    /**
     * Gets the value of the infoMesi property.
     * 
     * @return
     *     possible object is
     *     {@link InfoMesi }
     *     
     */
    public InfoMesi getInfoMesi() {
        return infoMesi;
    }

    /**
     * Sets the value of the infoMesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoMesi }
     *     
     */
    public void setInfoMesi(InfoMesi value) {
        this.infoMesi = value;
    }

    /**
     * Gets the value of the valoriMedi property.
     * 
     * @return
     *     possible object is
     *     {@link ValoriMedi }
     *     
     */
    public ValoriMedi getValoriMedi() {
        return valoriMedi;
    }

    /**
     * Sets the value of the valoriMedi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValoriMedi }
     *     
     */
    public void setValoriMedi(ValoriMedi value) {
        this.valoriMedi = value;
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
     * Gets the value of the cRilevazioneDipendenti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRilevazioneDipendenti() {
        return cRilevazioneDipendenti;
    }

    /**
     * Sets the value of the cRilevazioneDipendenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRilevazioneDipendenti(String value) {
        this.cRilevazioneDipendenti = value;
    }

    /**
     * Gets the value of the cTipoInformazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTipoInformazione() {
        return cTipoInformazione;
    }

    /**
     * Sets the value of the cTipoInformazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTipoInformazione(String value) {
        this.cTipoInformazione = value;
    }

    /**
     * Gets the value of the dtDichiarazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtDichiarazione() {
        return dtDichiarazione;
    }

    /**
     * Sets the value of the dtDichiarazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtDichiarazione(String value) {
        this.dtDichiarazione = value;
    }

    /**
     * Gets the value of the dtRilevazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtRilevazione() {
        return dtRilevazione;
    }

    /**
     * Sets the value of the dtRilevazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtRilevazione(String value) {
        this.dtRilevazione = value;
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

    /**
     * Gets the value of the tipoInformazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoInformazione() {
        return tipoInformazione;
    }

    /**
     * Sets the value of the tipoInformazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoInformazione(String value) {
        this.tipoInformazione = value;
    }

}