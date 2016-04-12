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
 * <p>Java class for info-patrimoniali-finanziarie element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="info-patrimoniali-finanziarie">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}capitale-investito" minOccurs="0"/>
 *           &lt;element ref="{}fondo-consortile" minOccurs="0"/>
 *           &lt;element ref="{}valore-nominale-conferimenti" minOccurs="0"/>
 *           &lt;element ref="{}capitale-sociale" minOccurs="0"/>
 *           &lt;element ref="{}composizione-quote" minOccurs="0"/>
 *           &lt;element ref="{}conferimenti-benefici" minOccurs="0"/>
 *           &lt;element ref="{}strumenti-finanziari" minOccurs="0"/>
 *           &lt;element ref="{}diminuzione-capitale" minOccurs="0"/>
 *           &lt;element ref="{}offerta-azioni" minOccurs="0"/>
 *           &lt;element ref="{}anticipata-conversione" minOccurs="0"/>
 *           &lt;element ref="{}patrimonio-specifico-affare" minOccurs="0"/>
 *           &lt;element ref="{}finanziamento-specifico-affare" minOccurs="0"/>
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
    "capitaleInvestito",
    "fondoConsortile",
    "valoreNominaleConferimenti",
    "capitaleSociale",
    "composizioneQuote",
    "conferimentiBenefici",
    "strumentiFinanziari",
    "diminuzioneCapitale",
    "offertaAzioni",
    "anticipataConversione",
    "patrimonioSpecificoAffare",
    "finanziamentoSpecificoAffare"
})
@XmlRootElement(name = "info-patrimoniali-finanziarie")
public class InfoPatrimonialiFinanziarie {

    @XmlElement(name = "capitale-investito")
    protected CapitaleInvestito capitaleInvestito;
    @XmlElement(name = "fondo-consortile")
    protected FondoConsortile fondoConsortile;
    @XmlElement(name = "valore-nominale-conferimenti")
    protected ValoreNominaleConferimenti valoreNominaleConferimenti;
    @XmlElement(name = "capitale-sociale")
    protected CapitaleSociale capitaleSociale;
    @XmlElement(name = "composizione-quote")
    protected ComposizioneQuote composizioneQuote;
    @XmlElement(name = "conferimenti-benefici")
    protected ConferimentiBenefici conferimentiBenefici;
    @XmlElement(name = "strumenti-finanziari")
    protected StrumentiFinanziari strumentiFinanziari;
    @XmlElement(name = "diminuzione-capitale")
    protected String diminuzioneCapitale;
    @XmlElement(name = "offerta-azioni")
    protected String offertaAzioni;
    @XmlElement(name = "anticipata-conversione")
    protected String anticipataConversione;
    @XmlElement(name = "patrimonio-specifico-affare")
    protected PatrimonioSpecificoAffare patrimonioSpecificoAffare;
    @XmlElement(name = "finanziamento-specifico-affare")
    protected FinanziamentoSpecificoAffare finanziamentoSpecificoAffare;

    /**
     * Gets the value of the capitaleInvestito property.
     * 
     * @return
     *     possible object is
     *     {@link CapitaleInvestito }
     *     
     */
    public CapitaleInvestito getCapitaleInvestito() {
        return capitaleInvestito;
    }

    /**
     * Sets the value of the capitaleInvestito property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapitaleInvestito }
     *     
     */
    public void setCapitaleInvestito(CapitaleInvestito value) {
        this.capitaleInvestito = value;
    }

    /**
     * Gets the value of the fondoConsortile property.
     * 
     * @return
     *     possible object is
     *     {@link FondoConsortile }
     *     
     */
    public FondoConsortile getFondoConsortile() {
        return fondoConsortile;
    }

    /**
     * Sets the value of the fondoConsortile property.
     * 
     * @param value
     *     allowed object is
     *     {@link FondoConsortile }
     *     
     */
    public void setFondoConsortile(FondoConsortile value) {
        this.fondoConsortile = value;
    }

    /**
     * Gets the value of the valoreNominaleConferimenti property.
     * 
     * @return
     *     possible object is
     *     {@link ValoreNominaleConferimenti }
     *     
     */
    public ValoreNominaleConferimenti getValoreNominaleConferimenti() {
        return valoreNominaleConferimenti;
    }

    /**
     * Sets the value of the valoreNominaleConferimenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValoreNominaleConferimenti }
     *     
     */
    public void setValoreNominaleConferimenti(ValoreNominaleConferimenti value) {
        this.valoreNominaleConferimenti = value;
    }

    /**
     * Gets the value of the capitaleSociale property.
     * 
     * @return
     *     possible object is
     *     {@link CapitaleSociale }
     *     
     */
    public CapitaleSociale getCapitaleSociale() {
        return capitaleSociale;
    }

    /**
     * Sets the value of the capitaleSociale property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapitaleSociale }
     *     
     */
    public void setCapitaleSociale(CapitaleSociale value) {
        this.capitaleSociale = value;
    }

    /**
     * Gets the value of the composizioneQuote property.
     * 
     * @return
     *     possible object is
     *     {@link ComposizioneQuote }
     *     
     */
    public ComposizioneQuote getComposizioneQuote() {
        return composizioneQuote;
    }

    /**
     * Sets the value of the composizioneQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComposizioneQuote }
     *     
     */
    public void setComposizioneQuote(ComposizioneQuote value) {
        this.composizioneQuote = value;
    }

    /**
     * Gets the value of the conferimentiBenefici property.
     * 
     * @return
     *     possible object is
     *     {@link ConferimentiBenefici }
     *     
     */
    public ConferimentiBenefici getConferimentiBenefici() {
        return conferimentiBenefici;
    }

    /**
     * Sets the value of the conferimentiBenefici property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConferimentiBenefici }
     *     
     */
    public void setConferimentiBenefici(ConferimentiBenefici value) {
        this.conferimentiBenefici = value;
    }

    /**
     * Gets the value of the strumentiFinanziari property.
     * 
     * @return
     *     possible object is
     *     {@link StrumentiFinanziari }
     *     
     */
    public StrumentiFinanziari getStrumentiFinanziari() {
        return strumentiFinanziari;
    }

    /**
     * Sets the value of the strumentiFinanziari property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrumentiFinanziari }
     *     
     */
    public void setStrumentiFinanziari(StrumentiFinanziari value) {
        this.strumentiFinanziari = value;
    }

    /**
     * Gets the value of the diminuzioneCapitale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiminuzioneCapitale() {
        return diminuzioneCapitale;
    }

    /**
     * Sets the value of the diminuzioneCapitale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiminuzioneCapitale(String value) {
        this.diminuzioneCapitale = value;
    }

    /**
     * Gets the value of the offertaAzioni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffertaAzioni() {
        return offertaAzioni;
    }

    /**
     * Sets the value of the offertaAzioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffertaAzioni(String value) {
        this.offertaAzioni = value;
    }

    /**
     * Gets the value of the anticipataConversione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnticipataConversione() {
        return anticipataConversione;
    }

    /**
     * Sets the value of the anticipataConversione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnticipataConversione(String value) {
        this.anticipataConversione = value;
    }

    /**
     * Gets the value of the patrimonioSpecificoAffare property.
     * 
     * @return
     *     possible object is
     *     {@link PatrimonioSpecificoAffare }
     *     
     */
    public PatrimonioSpecificoAffare getPatrimonioSpecificoAffare() {
        return patrimonioSpecificoAffare;
    }

    /**
     * Sets the value of the patrimonioSpecificoAffare property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatrimonioSpecificoAffare }
     *     
     */
    public void setPatrimonioSpecificoAffare(PatrimonioSpecificoAffare value) {
        this.patrimonioSpecificoAffare = value;
    }

    /**
     * Gets the value of the finanziamentoSpecificoAffare property.
     * 
     * @return
     *     possible object is
     *     {@link FinanziamentoSpecificoAffare }
     *     
     */
    public FinanziamentoSpecificoAffare getFinanziamentoSpecificoAffare() {
        return finanziamentoSpecificoAffare;
    }

    /**
     * Sets the value of the finanziamentoSpecificoAffare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinanziamentoSpecificoAffare }
     *     
     */
    public void setFinanziamentoSpecificoAffare(FinanziamentoSpecificoAffare value) {
        this.finanziamentoSpecificoAffare = value;
    }

}
