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
 * <p>Java class for info-sede element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="info-sede">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}telefono" minOccurs="0"/>
 *           &lt;element ref="{}telex" minOccurs="0"/>
 *           &lt;element ref="{}telefax" minOccurs="0"/>
 *           &lt;element ref="{}indirizzo-posta-certificata" minOccurs="0"/>
 *           &lt;element ref="{}sito-internet" minOccurs="0"/>
 *           &lt;element ref="{}email" minOccurs="0"/>
 *           &lt;element ref="{}legal-mail" minOccurs="0"/>
 *           &lt;element ref="{}altre-funzioni-sede" minOccurs="0"/>
 *           &lt;element ref="{}dati-iscrizione-rea-rd" minOccurs="0"/>
 *           &lt;element ref="{}persona-giuridica-privata" minOccurs="0"/>
 *           &lt;element ref="{}sede-fuori-provincia" minOccurs="0"/>
 *           &lt;element ref="{}partita-iva" minOccurs="0"/>
 *           &lt;element ref="{}insegna" minOccurs="0"/>
 *           &lt;element ref="{}sede-secondaria-rs" minOccurs="0"/>
 *           &lt;element ref="{}provenienza-trasferimento" minOccurs="0"/>
 *           &lt;element ref="{}informazioni-supplementari" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="f-scritture-contabili" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "telefono",
    "telex",
    "telefax",
    "indirizzoPostaCertificata",
    "sitoInternet",
    "email",
    "legalMail",
    "altreFunzioniSede",
    "datiIscrizioneReaRd",
    "personaGiuridicaPrivata",
    "sedeFuoriProvincia",
    "partitaIva",
    "insegna",
    "sedeSecondariaRs",
    "provenienzaTrasferimento",
    "informazioniSupplementari"
})
@XmlRootElement(name = "info-sede")
public class InfoSede {

    protected Telefono telefono;
    protected String telex;
    protected Telefax telefax;
    @XmlElement(name = "indirizzo-posta-certificata")
    protected IndirizzoPostaCertificata indirizzoPostaCertificata;
    @XmlElement(name = "sito-internet")
    protected String sitoInternet;
    protected String email;
    @XmlElement(name = "legal-mail")
    protected String legalMail;
    @XmlElement(name = "altre-funzioni-sede")
    protected String altreFunzioniSede;
    @XmlElement(name = "dati-iscrizione-rea-rd")
    protected DatiIscrizioneReaRd datiIscrizioneReaRd;
    @XmlElement(name = "persona-giuridica-privata")
    protected PersonaGiuridicaPrivata personaGiuridicaPrivata;
    @XmlElement(name = "sede-fuori-provincia")
    protected SedeFuoriProvincia sedeFuoriProvincia;
    @XmlElement(name = "partita-iva")
    protected String partitaIva;
    protected String insegna;
    @XmlElement(name = "sede-secondaria-rs")
    protected SedeSecondariaRs sedeSecondariaRs;
    @XmlElement(name = "provenienza-trasferimento")
    protected ProvenienzaTrasferimento provenienzaTrasferimento;
    @XmlElement(name = "informazioni-supplementari")
    protected InformazioniSupplementari informazioniSupplementari;
    @XmlAttribute(name = "f-scritture-contabili")
    protected String fScrittureContabili;

    /**
     * Gets the value of the telefono property.
     * 
     * @return
     *     possible object is
     *     {@link Telefono }
     *     
     */
    public Telefono getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     * 
     * @param value
     *     allowed object is
     *     {@link Telefono }
     *     
     */
    public void setTelefono(Telefono value) {
        this.telefono = value;
    }

    /**
     * Gets the value of the telex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelex() {
        return telex;
    }

    /**
     * Sets the value of the telex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelex(String value) {
        this.telex = value;
    }

    /**
     * Gets the value of the telefax property.
     * 
     * @return
     *     possible object is
     *     {@link Telefax }
     *     
     */
    public Telefax getTelefax() {
        return telefax;
    }

    /**
     * Sets the value of the telefax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Telefax }
     *     
     */
    public void setTelefax(Telefax value) {
        this.telefax = value;
    }

    /**
     * Gets the value of the indirizzoPostaCertificata property.
     * 
     * @return
     *     possible object is
     *     {@link IndirizzoPostaCertificata }
     *     
     */
    public IndirizzoPostaCertificata getIndirizzoPostaCertificata() {
        return indirizzoPostaCertificata;
    }

    /**
     * Sets the value of the indirizzoPostaCertificata property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndirizzoPostaCertificata }
     *     
     */
    public void setIndirizzoPostaCertificata(IndirizzoPostaCertificata value) {
        this.indirizzoPostaCertificata = value;
    }

    /**
     * Gets the value of the sitoInternet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitoInternet() {
        return sitoInternet;
    }

    /**
     * Sets the value of the sitoInternet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitoInternet(String value) {
        this.sitoInternet = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the legalMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalMail() {
        return legalMail;
    }

    /**
     * Sets the value of the legalMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalMail(String value) {
        this.legalMail = value;
    }

    /**
     * Gets the value of the altreFunzioniSede property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltreFunzioniSede() {
        return altreFunzioniSede;
    }

    /**
     * Sets the value of the altreFunzioniSede property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltreFunzioniSede(String value) {
        this.altreFunzioniSede = value;
    }

    /**
     * Gets the value of the datiIscrizioneReaRd property.
     * 
     * @return
     *     possible object is
     *     {@link DatiIscrizioneReaRd }
     *     
     */
    public DatiIscrizioneReaRd getDatiIscrizioneReaRd() {
        return datiIscrizioneReaRd;
    }

    /**
     * Sets the value of the datiIscrizioneReaRd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiIscrizioneReaRd }
     *     
     */
    public void setDatiIscrizioneReaRd(DatiIscrizioneReaRd value) {
        this.datiIscrizioneReaRd = value;
    }

    /**
     * Gets the value of the personaGiuridicaPrivata property.
     * 
     * @return
     *     possible object is
     *     {@link PersonaGiuridicaPrivata }
     *     
     */
    public PersonaGiuridicaPrivata getPersonaGiuridicaPrivata() {
        return personaGiuridicaPrivata;
    }

    /**
     * Sets the value of the personaGiuridicaPrivata property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaGiuridicaPrivata }
     *     
     */
    public void setPersonaGiuridicaPrivata(PersonaGiuridicaPrivata value) {
        this.personaGiuridicaPrivata = value;
    }

    /**
     * Gets the value of the sedeFuoriProvincia property.
     * 
     * @return
     *     possible object is
     *     {@link SedeFuoriProvincia }
     *     
     */
    public SedeFuoriProvincia getSedeFuoriProvincia() {
        return sedeFuoriProvincia;
    }

    /**
     * Sets the value of the sedeFuoriProvincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link SedeFuoriProvincia }
     *     
     */
    public void setSedeFuoriProvincia(SedeFuoriProvincia value) {
        this.sedeFuoriProvincia = value;
    }

    /**
     * Gets the value of the partitaIva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitaIva() {
        return partitaIva;
    }

    /**
     * Sets the value of the partitaIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartitaIva(String value) {
        this.partitaIva = value;
    }

    /**
     * Gets the value of the insegna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsegna() {
        return insegna;
    }

    /**
     * Sets the value of the insegna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsegna(String value) {
        this.insegna = value;
    }

    /**
     * Gets the value of the sedeSecondariaRs property.
     * 
     * @return
     *     possible object is
     *     {@link SedeSecondariaRs }
     *     
     */
    public SedeSecondariaRs getSedeSecondariaRs() {
        return sedeSecondariaRs;
    }

    /**
     * Sets the value of the sedeSecondariaRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SedeSecondariaRs }
     *     
     */
    public void setSedeSecondariaRs(SedeSecondariaRs value) {
        this.sedeSecondariaRs = value;
    }

    /**
     * Gets the value of the provenienzaTrasferimento property.
     * 
     * @return
     *     possible object is
     *     {@link ProvenienzaTrasferimento }
     *     
     */
    public ProvenienzaTrasferimento getProvenienzaTrasferimento() {
        return provenienzaTrasferimento;
    }

    /**
     * Sets the value of the provenienzaTrasferimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvenienzaTrasferimento }
     *     
     */
    public void setProvenienzaTrasferimento(ProvenienzaTrasferimento value) {
        this.provenienzaTrasferimento = value;
    }

    /**
     * Gets the value of the informazioniSupplementari property.
     * 
     * @return
     *     possible object is
     *     {@link InformazioniSupplementari }
     *     
     */
    public InformazioniSupplementari getInformazioniSupplementari() {
        return informazioniSupplementari;
    }

    /**
     * Sets the value of the informazioniSupplementari property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformazioniSupplementari }
     *     
     */
    public void setInformazioniSupplementari(InformazioniSupplementari value) {
        this.informazioniSupplementari = value;
    }

    /**
     * Gets the value of the fScrittureContabili property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFScrittureContabili() {
        return fScrittureContabili;
    }

    /**
     * Sets the value of the fScrittureContabili property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFScrittureContabili(String value) {
        this.fScrittureContabili = value;
    }

}