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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sessione-aa element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="sessione-aa">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}modifiche" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="c-movimentazione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-delibera" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-domanda-accertamento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="movimentazione" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "modifiche"
})
@XmlRootElement(name = "sessione-aa")
public class SessioneAa {

    @XmlElement(required = true)
    protected List<Modifiche> modifiche;
    @XmlAttribute(name = "c-movimentazione")
    protected String cMovimentazione;
    @XmlAttribute(name = "dt-delibera")
    protected String dtDelibera;
    @XmlAttribute(name = "dt-domanda-accertamento")
    protected String dtDomandaAccertamento;
    @XmlAttribute
    protected String movimentazione;

    /**
     * Gets the value of the modifiche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifiche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifiche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Modifiche }
     * 
     * 
     */
    public List<Modifiche> getModifiche() {
        if (modifiche == null) {
            modifiche = new ArrayList<Modifiche>();
        }
        return this.modifiche;
    }

    /**
     * Gets the value of the cMovimentazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMovimentazione() {
        return cMovimentazione;
    }

    /**
     * Sets the value of the cMovimentazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMovimentazione(String value) {
        this.cMovimentazione = value;
    }

    /**
     * Gets the value of the dtDelibera property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtDelibera() {
        return dtDelibera;
    }

    /**
     * Sets the value of the dtDelibera property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtDelibera(String value) {
        this.dtDelibera = value;
    }

    /**
     * Gets the value of the dtDomandaAccertamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtDomandaAccertamento() {
        return dtDomandaAccertamento;
    }

    /**
     * Sets the value of the dtDomandaAccertamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtDomandaAccertamento(String value) {
        this.dtDomandaAccertamento = value;
    }

    /**
     * Gets the value of the movimentazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovimentazione() {
        return movimentazione;
    }

    /**
     * Sets the value of the movimentazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovimentazione(String value) {
        this.movimentazione = value;
    }

}
