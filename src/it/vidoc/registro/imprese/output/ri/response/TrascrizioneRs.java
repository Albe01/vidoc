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
 * <p>Java class for trascrizione-rs element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="trascrizione-rs">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}persona" minOccurs="0"/>
 *           &lt;element ref="{}tipo-trascrizione" minOccurs="0"/>
 *           &lt;element ref="{}descrizioni" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="c-tipo-modifica" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="p-trascrizione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="tipo-modifica" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "persona",
    "tipoTrascrizione",
    "descrizioni"
})
@XmlRootElement(name = "trascrizione-rs")
public class TrascrizioneRs {

    protected Persona persona;
    @XmlElement(name = "tipo-trascrizione")
    protected TipoTrascrizione tipoTrascrizione;
    protected Descrizioni descrizioni;
    @XmlAttribute(name = "c-tipo-modifica")
    protected String cTipoModifica;
    @XmlAttribute(name = "p-trascrizione")
    protected String pTrascrizione;
    @XmlAttribute(name = "tipo-modifica")
    protected String tipoModifica;

    /**
     * Gets the value of the persona property.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Sets the value of the persona property.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setPersona(Persona value) {
        this.persona = value;
    }

    /**
     * Gets the value of the tipoTrascrizione property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTrascrizione }
     *     
     */
    public TipoTrascrizione getTipoTrascrizione() {
        return tipoTrascrizione;
    }

    /**
     * Sets the value of the tipoTrascrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTrascrizione }
     *     
     */
    public void setTipoTrascrizione(TipoTrascrizione value) {
        this.tipoTrascrizione = value;
    }

    /**
     * Gets the value of the descrizioni property.
     * 
     * @return
     *     possible object is
     *     {@link Descrizioni }
     *     
     */
    public Descrizioni getDescrizioni() {
        return descrizioni;
    }

    /**
     * Sets the value of the descrizioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descrizioni }
     *     
     */
    public void setDescrizioni(Descrizioni value) {
        this.descrizioni = value;
    }

    /**
     * Gets the value of the cTipoModifica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTipoModifica() {
        return cTipoModifica;
    }

    /**
     * Sets the value of the cTipoModifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTipoModifica(String value) {
        this.cTipoModifica = value;
    }

    /**
     * Gets the value of the pTrascrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTrascrizione() {
        return pTrascrizione;
    }

    /**
     * Sets the value of the pTrascrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTrascrizione(String value) {
        this.pTrascrizione = value;
    }

    /**
     * Gets the value of the tipoModifica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoModifica() {
        return tipoModifica;
    }

    /**
     * Sets the value of the tipoModifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoModifica(String value) {
        this.tipoModifica = value;
    }

}
