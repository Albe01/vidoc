//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 06:18:12 PM CEST 
//


package it.vidoc.registro.imprese.output.ri.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for elenco-soci element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="elenco-soci">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}estremi-pratica" minOccurs="0"/>
 *           &lt;element ref="{}estremi-pratica-riconfermata" minOccurs="0"/>
 *           &lt;element ref="{}capitale-sociale" minOccurs="0"/>
 *           &lt;element ref="{}riquadri" minOccurs="0"/>
 *           &lt;element ref="{}note" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{}note-pratica-riconfermata" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;attribute name="c-riferimento-legge" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-soci-titolari-al" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-soci-titolari-dal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="f-consorzio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="f-ultimo-elenco-soci" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="riferimento-legge" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "elenco-soci")
public class ElencoSoci {

    @XmlElementRefs({
        @XmlElementRef(name = "riquadri", type = Riquadri.class),
        @XmlElementRef(name = "note-pratica-riconfermata", type = JAXBElement.class),
        @XmlElementRef(name = "estremi-pratica-riconfermata", type = EstremiPraticaRiconfermata.class),
        @XmlElementRef(name = "note", type = JAXBElement.class),
        @XmlElementRef(name = "capitale-sociale", type = CapitaleSociale.class),
        @XmlElementRef(name = "estremi-pratica", type = EstremiPratica.class)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "c-riferimento-legge")
    protected String cRiferimentoLegge;
    @XmlAttribute(name = "dt-soci-titolari-al")
    protected String dtSociTitolariAl;
    @XmlAttribute(name = "dt-soci-titolari-dal")
    protected String dtSociTitolariDal;
    @XmlAttribute(name = "f-consorzio")
    protected String fConsorzio;
    @XmlAttribute(name = "f-ultimo-elenco-soci")
    protected String fUltimoElencoSoci;
    @XmlAttribute(name = "riferimento-legge")
    protected String riferimentoLegge;

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
     * {@link Riquadri }
     * {@link String }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link EstremiPraticaRiconfermata }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link CapitaleSociale }
     * {@link EstremiPratica }
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
     * Gets the value of the cRiferimentoLegge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRiferimentoLegge() {
        return cRiferimentoLegge;
    }

    /**
     * Sets the value of the cRiferimentoLegge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRiferimentoLegge(String value) {
        this.cRiferimentoLegge = value;
    }

    /**
     * Gets the value of the dtSociTitolariAl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtSociTitolariAl() {
        return dtSociTitolariAl;
    }

    /**
     * Sets the value of the dtSociTitolariAl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtSociTitolariAl(String value) {
        this.dtSociTitolariAl = value;
    }

    /**
     * Gets the value of the dtSociTitolariDal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtSociTitolariDal() {
        return dtSociTitolariDal;
    }

    /**
     * Sets the value of the dtSociTitolariDal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtSociTitolariDal(String value) {
        this.dtSociTitolariDal = value;
    }

    /**
     * Gets the value of the fConsorzio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFConsorzio() {
        return fConsorzio;
    }

    /**
     * Sets the value of the fConsorzio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFConsorzio(String value) {
        this.fConsorzio = value;
    }

    /**
     * Gets the value of the fUltimoElencoSoci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUltimoElencoSoci() {
        return fUltimoElencoSoci;
    }

    /**
     * Sets the value of the fUltimoElencoSoci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUltimoElencoSoci(String value) {
        this.fUltimoElencoSoci = value;
    }

    /**
     * Gets the value of the riferimentoLegge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiferimentoLegge() {
        return riferimentoLegge;
    }

    /**
     * Sets the value of the riferimentoLegge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiferimentoLegge(String value) {
        this.riferimentoLegge = value;
    }

}
