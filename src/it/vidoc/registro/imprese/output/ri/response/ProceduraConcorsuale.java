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
 * <p>Java class for procedura-concorsuale element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="procedura-concorsuale">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}estremi-atto" minOccurs="0"/>
 *           &lt;element ref="{}comunicazioni-curatore" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="c-tipo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-atto" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-chiusura" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-esecuzione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-iscrizione-procedura" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-omologazione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-provvedimento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-revoca" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-termine" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-udienza" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "estremiAtto",
    "comunicazioniCuratore"
})
@XmlRootElement(name = "procedura-concorsuale")
public class ProceduraConcorsuale {

    @XmlElement(name = "estremi-atto")
    protected EstremiAtto estremiAtto;
    @XmlElement(name = "comunicazioni-curatore")
    protected ComunicazioniCuratore comunicazioniCuratore;
    @XmlAttribute(name = "c-tipo")
    protected String cTipo;
    @XmlAttribute(name = "dt-atto")
    protected String dtAtto;
    @XmlAttribute(name = "dt-chiusura")
    protected String dtChiusura;
    @XmlAttribute(name = "dt-esecuzione")
    protected String dtEsecuzione;
    @XmlAttribute(name = "dt-iscrizione-procedura")
    protected String dtIscrizioneProcedura;
    @XmlAttribute(name = "dt-omologazione")
    protected String dtOmologazione;
    @XmlAttribute(name = "dt-provvedimento")
    protected String dtProvvedimento;
    @XmlAttribute(name = "dt-revoca")
    protected String dtRevoca;
    @XmlAttribute(name = "dt-termine")
    protected String dtTermine;
    @XmlAttribute(name = "dt-udienza")
    protected String dtUdienza;
    @XmlAttribute
    protected String tipo;

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
     * Gets the value of the comunicazioniCuratore property.
     * 
     * @return
     *     possible object is
     *     {@link ComunicazioniCuratore }
     *     
     */
    public ComunicazioniCuratore getComunicazioniCuratore() {
        return comunicazioniCuratore;
    }

    /**
     * Sets the value of the comunicazioniCuratore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComunicazioniCuratore }
     *     
     */
    public void setComunicazioniCuratore(ComunicazioniCuratore value) {
        this.comunicazioniCuratore = value;
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
     * Gets the value of the dtAtto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtAtto() {
        return dtAtto;
    }

    /**
     * Sets the value of the dtAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtAtto(String value) {
        this.dtAtto = value;
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
     * Gets the value of the dtEsecuzione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtEsecuzione() {
        return dtEsecuzione;
    }

    /**
     * Sets the value of the dtEsecuzione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtEsecuzione(String value) {
        this.dtEsecuzione = value;
    }

    /**
     * Gets the value of the dtIscrizioneProcedura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtIscrizioneProcedura() {
        return dtIscrizioneProcedura;
    }

    /**
     * Sets the value of the dtIscrizioneProcedura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtIscrizioneProcedura(String value) {
        this.dtIscrizioneProcedura = value;
    }

    /**
     * Gets the value of the dtOmologazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtOmologazione() {
        return dtOmologazione;
    }

    /**
     * Sets the value of the dtOmologazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtOmologazione(String value) {
        this.dtOmologazione = value;
    }

    /**
     * Gets the value of the dtProvvedimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtProvvedimento() {
        return dtProvvedimento;
    }

    /**
     * Sets the value of the dtProvvedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtProvvedimento(String value) {
        this.dtProvvedimento = value;
    }

    /**
     * Gets the value of the dtRevoca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtRevoca() {
        return dtRevoca;
    }

    /**
     * Sets the value of the dtRevoca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtRevoca(String value) {
        this.dtRevoca = value;
    }

    /**
     * Gets the value of the dtTermine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtTermine() {
        return dtTermine;
    }

    /**
     * Sets the value of the dtTermine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtTermine(String value) {
        this.dtTermine = value;
    }

    /**
     * Gets the value of the dtUdienza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtUdienza() {
        return dtUdienza;
    }

    /**
     * Sets the value of the dtUdienza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtUdienza(String value) {
        this.dtUdienza = value;
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

}