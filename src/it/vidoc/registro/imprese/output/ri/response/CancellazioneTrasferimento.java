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
 * <p>Java class for cancellazione-trasferimento element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="cancellazione-trasferimento">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}cancellazione" minOccurs="0"/>
 *           &lt;element ref="{}indirizzo-sede-estero" minOccurs="0"/>
 *           &lt;element ref="{}trasferimento-sede" minOccurs="0"/>
 *           &lt;element ref="{}trasferimento-sede-ul-attiva" minOccurs="0"/>
 *           &lt;element ref="{}info-altro-registro" minOccurs="0"/>
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
    "cancellazione",
    "indirizzoSedeEstero",
    "trasferimentoSede",
    "trasferimentoSedeUlAttiva",
    "infoAltroRegistro"
})
@XmlRootElement(name = "cancellazione-trasferimento")
public class CancellazioneTrasferimento {

    protected Cancellazione cancellazione;
    @XmlElement(name = "indirizzo-sede-estero")
    protected IndirizzoSedeEstero indirizzoSedeEstero;
    @XmlElement(name = "trasferimento-sede")
    protected TrasferimentoSede trasferimentoSede;
    @XmlElement(name = "trasferimento-sede-ul-attiva")
    protected TrasferimentoSedeUlAttiva trasferimentoSedeUlAttiva;
    @XmlElement(name = "info-altro-registro")
    protected InfoAltroRegistro infoAltroRegistro;

    /**
     * Gets the value of the cancellazione property.
     * 
     * @return
     *     possible object is
     *     {@link Cancellazione }
     *     
     */
    public Cancellazione getCancellazione() {
        return cancellazione;
    }

    /**
     * Sets the value of the cancellazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cancellazione }
     *     
     */
    public void setCancellazione(Cancellazione value) {
        this.cancellazione = value;
    }

    /**
     * Gets the value of the indirizzoSedeEstero property.
     * 
     * @return
     *     possible object is
     *     {@link IndirizzoSedeEstero }
     *     
     */
    public IndirizzoSedeEstero getIndirizzoSedeEstero() {
        return indirizzoSedeEstero;
    }

    /**
     * Sets the value of the indirizzoSedeEstero property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndirizzoSedeEstero }
     *     
     */
    public void setIndirizzoSedeEstero(IndirizzoSedeEstero value) {
        this.indirizzoSedeEstero = value;
    }

    /**
     * Gets the value of the trasferimentoSede property.
     * 
     * @return
     *     possible object is
     *     {@link TrasferimentoSede }
     *     
     */
    public TrasferimentoSede getTrasferimentoSede() {
        return trasferimentoSede;
    }

    /**
     * Sets the value of the trasferimentoSede property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrasferimentoSede }
     *     
     */
    public void setTrasferimentoSede(TrasferimentoSede value) {
        this.trasferimentoSede = value;
    }

    /**
     * Gets the value of the trasferimentoSedeUlAttiva property.
     * 
     * @return
     *     possible object is
     *     {@link TrasferimentoSedeUlAttiva }
     *     
     */
    public TrasferimentoSedeUlAttiva getTrasferimentoSedeUlAttiva() {
        return trasferimentoSedeUlAttiva;
    }

    /**
     * Sets the value of the trasferimentoSedeUlAttiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrasferimentoSedeUlAttiva }
     *     
     */
    public void setTrasferimentoSedeUlAttiva(TrasferimentoSedeUlAttiva value) {
        this.trasferimentoSedeUlAttiva = value;
    }

    /**
     * Gets the value of the infoAltroRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link InfoAltroRegistro }
     *     
     */
    public InfoAltroRegistro getInfoAltroRegistro() {
        return infoAltroRegistro;
    }

    /**
     * Sets the value of the infoAltroRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoAltroRegistro }
     *     
     */
    public void setInfoAltroRegistro(InfoAltroRegistro value) {
        this.infoAltroRegistro = value;
    }

}
