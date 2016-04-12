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
 * <p>Java class for atto-conferimento-cariche element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="atto-conferimento-cariche">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}cariche" minOccurs="0"/>
 *           &lt;element ref="{}poteri-persona" minOccurs="0"/>
 *           &lt;element ref="{}estremi-atto" minOccurs="0"/>
 *           &lt;element ref="{}proprieta-quota" minOccurs="0"/>
 *           &lt;element ref="{}partecipazione-utili" minOccurs="0"/>
 *           &lt;element ref="{}conferimenti-prestazioni" minOccurs="0"/>
 *           &lt;element ref="{}abilitazioni-professionali" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="p-gruppo-cariche" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "cariche",
    "poteriPersona",
    "estremiAtto",
    "proprietaQuota",
    "partecipazioneUtili",
    "conferimentiPrestazioni",
    "abilitazioniProfessionali"
})
@XmlRootElement(name = "atto-conferimento-cariche")
public class AttoConferimentoCariche {

    protected Cariche cariche;
    @XmlElement(name = "poteri-persona")
    protected PoteriPersona poteriPersona;
    @XmlElement(name = "estremi-atto")
    protected EstremiAtto estremiAtto;
    @XmlElement(name = "proprieta-quota")
    protected ProprietaQuota proprietaQuota;
    @XmlElement(name = "partecipazione-utili")
    protected PartecipazioneUtili partecipazioneUtili;
    @XmlElement(name = "conferimenti-prestazioni")
    protected ConferimentiPrestazioni conferimentiPrestazioni;
    @XmlElement(name = "abilitazioni-professionali")
    protected AbilitazioniProfessionali abilitazioniProfessionali;
    @XmlAttribute(name = "p-gruppo-cariche")
    protected String pGruppoCariche;

    /**
     * Gets the value of the cariche property.
     * 
     * @return
     *     possible object is
     *     {@link Cariche }
     *     
     */
    public Cariche getCariche() {
        return cariche;
    }

    /**
     * Sets the value of the cariche property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cariche }
     *     
     */
    public void setCariche(Cariche value) {
        this.cariche = value;
    }

    /**
     * Gets the value of the poteriPersona property.
     * 
     * @return
     *     possible object is
     *     {@link PoteriPersona }
     *     
     */
    public PoteriPersona getPoteriPersona() {
        return poteriPersona;
    }

    /**
     * Sets the value of the poteriPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoteriPersona }
     *     
     */
    public void setPoteriPersona(PoteriPersona value) {
        this.poteriPersona = value;
    }

    /**
     * Gets the value of the estremiAtto property.
     * 
     * @return
     *     possible object is
     *     {@link EstremiAtto }
     *     
     */
    public EstremiAtto getEstremiAtto() {
        return estremiAtto;
    }

    /**
     * Sets the value of the estremiAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstremiAtto }
     *     
     */
    public void setEstremiAtto(EstremiAtto value) {
        this.estremiAtto = value;
    }

    /**
     * Gets the value of the proprietaQuota property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaQuota }
     *     
     */
    public ProprietaQuota getProprietaQuota() {
        return proprietaQuota;
    }

    /**
     * Sets the value of the proprietaQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaQuota }
     *     
     */
    public void setProprietaQuota(ProprietaQuota value) {
        this.proprietaQuota = value;
    }

    /**
     * Gets the value of the partecipazioneUtili property.
     * 
     * @return
     *     possible object is
     *     {@link PartecipazioneUtili }
     *     
     */
    public PartecipazioneUtili getPartecipazioneUtili() {
        return partecipazioneUtili;
    }

    /**
     * Sets the value of the partecipazioneUtili property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartecipazioneUtili }
     *     
     */
    public void setPartecipazioneUtili(PartecipazioneUtili value) {
        this.partecipazioneUtili = value;
    }

    /**
     * Gets the value of the conferimentiPrestazioni property.
     * 
     * @return
     *     possible object is
     *     {@link ConferimentiPrestazioni }
     *     
     */
    public ConferimentiPrestazioni getConferimentiPrestazioni() {
        return conferimentiPrestazioni;
    }

    /**
     * Sets the value of the conferimentiPrestazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConferimentiPrestazioni }
     *     
     */
    public void setConferimentiPrestazioni(ConferimentiPrestazioni value) {
        this.conferimentiPrestazioni = value;
    }

    /**
     * Gets the value of the abilitazioniProfessionali property.
     * 
     * @return
     *     possible object is
     *     {@link AbilitazioniProfessionali }
     *     
     */
    public AbilitazioniProfessionali getAbilitazioniProfessionali() {
        return abilitazioniProfessionali;
    }

    /**
     * Sets the value of the abilitazioniProfessionali property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbilitazioniProfessionali }
     *     
     */
    public void setAbilitazioniProfessionali(AbilitazioniProfessionali value) {
        this.abilitazioniProfessionali = value;
    }

    /**
     * Gets the value of the pGruppoCariche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPGruppoCariche() {
        return pGruppoCariche;
    }

    /**
     * Sets the value of the pGruppoCariche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPGruppoCariche(String value) {
        this.pGruppoCariche = value;
    }

}
