//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 05:57:20 PM CEST 
//


package it.vidoc.registro.imprese.ricerca.anagrafica.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaImpreseRIType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaImpreseRIType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="PerChiaveRea" type="{}PerChiaveReaType"/>
 *         &lt;element name="PerDenominazione" type="{}PerDenominazioneType"/>
 *         &lt;element name="PerCodFiscImpresa" type="{}PerCodFiscImpresaType"/>
 *         &lt;element name="PerDenominazioneEComuneSede" type="{}PerDenominazioneEComuneSedeType"/>
 *         &lt;element name="PerDenominazioneOld" type="{}PerDenominazioneOldType"/>
 *         &lt;element name="PerCognomeNomeDenom" type="{}PerCognomeNomeDenomType"/>
 *         &lt;element name="AvanzataPerCodFiscImpresa" type="{}AvanzataPerCodFiscImpresaType"/>
 *         &lt;element name="PerPIvaImpresa" type="{}PerPIvaImpresaType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaImpreseRIType", propOrder = {
    "perChiaveRea",
    "perDenominazione",
    "perCodFiscImpresa",
    "perDenominazioneEComuneSede",
    "perDenominazioneOld",
    "perCognomeNomeDenom",
    "avanzataPerCodFiscImpresa",
    "perPIvaImpresa"
})
public class ListaImpreseRIType {

    @XmlElement(name = "PerChiaveRea")
    protected PerChiaveReaType perChiaveRea;
    @XmlElement(name = "PerDenominazione")
    protected PerDenominazioneType perDenominazione;
    @XmlElement(name = "PerCodFiscImpresa")
    protected PerCodFiscImpresaType perCodFiscImpresa;
    @XmlElement(name = "PerDenominazioneEComuneSede")
    protected PerDenominazioneEComuneSedeType perDenominazioneEComuneSede;
    @XmlElement(name = "PerDenominazioneOld")
    protected PerDenominazioneOldType perDenominazioneOld;
    @XmlElement(name = "PerCognomeNomeDenom")
    protected PerCognomeNomeDenomType perCognomeNomeDenom;
    @XmlElement(name = "AvanzataPerCodFiscImpresa")
    protected AvanzataPerCodFiscImpresaType avanzataPerCodFiscImpresa;
    @XmlElement(name = "PerPIvaImpresa")
    protected PerPIvaImpresaType perPIvaImpresa;

    /**
     * Gets the value of the perChiaveRea property.
     * 
     * @return
     *     possible object is
     *     {@link PerChiaveReaType }
     *     
     */
    public PerChiaveReaType getPerChiaveRea() {
        return perChiaveRea;
    }

    /**
     * Sets the value of the perChiaveRea property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerChiaveReaType }
     *     
     */
    public void setPerChiaveRea(PerChiaveReaType value) {
        this.perChiaveRea = value;
    }

    /**
     * Gets the value of the perDenominazione property.
     * 
     * @return
     *     possible object is
     *     {@link PerDenominazioneType }
     *     
     */
    public PerDenominazioneType getPerDenominazione() {
        return perDenominazione;
    }

    /**
     * Sets the value of the perDenominazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerDenominazioneType }
     *     
     */
    public void setPerDenominazione(PerDenominazioneType value) {
        this.perDenominazione = value;
    }

    /**
     * Gets the value of the perCodFiscImpresa property.
     * 
     * @return
     *     possible object is
     *     {@link PerCodFiscImpresaType }
     *     
     */
    public PerCodFiscImpresaType getPerCodFiscImpresa() {
        return perCodFiscImpresa;
    }

    /**
     * Sets the value of the perCodFiscImpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerCodFiscImpresaType }
     *     
     */
    public void setPerCodFiscImpresa(PerCodFiscImpresaType value) {
        this.perCodFiscImpresa = value;
    }

    /**
     * Gets the value of the perDenominazioneEComuneSede property.
     * 
     * @return
     *     possible object is
     *     {@link PerDenominazioneEComuneSedeType }
     *     
     */
    public PerDenominazioneEComuneSedeType getPerDenominazioneEComuneSede() {
        return perDenominazioneEComuneSede;
    }

    /**
     * Sets the value of the perDenominazioneEComuneSede property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerDenominazioneEComuneSedeType }
     *     
     */
    public void setPerDenominazioneEComuneSede(PerDenominazioneEComuneSedeType value) {
        this.perDenominazioneEComuneSede = value;
    }

    /**
     * Gets the value of the perDenominazioneOld property.
     * 
     * @return
     *     possible object is
     *     {@link PerDenominazioneOldType }
     *     
     */
    public PerDenominazioneOldType getPerDenominazioneOld() {
        return perDenominazioneOld;
    }

    /**
     * Sets the value of the perDenominazioneOld property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerDenominazioneOldType }
     *     
     */
    public void setPerDenominazioneOld(PerDenominazioneOldType value) {
        this.perDenominazioneOld = value;
    }

    /**
     * Gets the value of the perCognomeNomeDenom property.
     * 
     * @return
     *     possible object is
     *     {@link PerCognomeNomeDenomType }
     *     
     */
    public PerCognomeNomeDenomType getPerCognomeNomeDenom() {
        return perCognomeNomeDenom;
    }

    /**
     * Sets the value of the perCognomeNomeDenom property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerCognomeNomeDenomType }
     *     
     */
    public void setPerCognomeNomeDenom(PerCognomeNomeDenomType value) {
        this.perCognomeNomeDenom = value;
    }

    /**
     * Gets the value of the avanzataPerCodFiscImpresa property.
     * 
     * @return
     *     possible object is
     *     {@link AvanzataPerCodFiscImpresaType }
     *     
     */
    public AvanzataPerCodFiscImpresaType getAvanzataPerCodFiscImpresa() {
        return avanzataPerCodFiscImpresa;
    }

    /**
     * Sets the value of the avanzataPerCodFiscImpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvanzataPerCodFiscImpresaType }
     *     
     */
    public void setAvanzataPerCodFiscImpresa(AvanzataPerCodFiscImpresaType value) {
        this.avanzataPerCodFiscImpresa = value;
    }

    /**
     * Gets the value of the perPIvaImpresa property.
     * 
     * @return
     *     possible object is
     *     {@link PerPIvaImpresaType }
     *     
     */
    public PerPIvaImpresaType getPerPIvaImpresa() {
        return perPIvaImpresa;
    }

    /**
     * Sets the value of the perPIvaImpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerPIvaImpresaType }
     *     
     */
    public void setPerPIvaImpresa(PerPIvaImpresaType value) {
        this.perPIvaImpresa = value;
    }

}