//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 06:16:18 PM CEST 
//


package it.vidoc.registro.imprese.output.ri.request;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerChiaveReaListaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerChiaveReaListaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cciaa" type="{}CciaaType"/>
 *         &lt;element name="NRea" type="{}NReaType"/>
 *         &lt;element name="IdeRich" type="{}IdeRichType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerChiaveReaListaType", propOrder = {
    "cciaa",
    "nRea",
    "ideRich"
})
public class PerChiaveReaListaType {

    @XmlElement(name = "Cciaa", required = true)
    protected String cciaa;
    @XmlElement(name = "NRea", required = true)
    protected BigInteger nRea;
    @XmlElement(name = "IdeRich")
    protected String ideRich;

    /**
     * Gets the value of the cciaa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCciaa() {
        return cciaa;
    }

    /**
     * Sets the value of the cciaa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCciaa(String value) {
        this.cciaa = value;
    }

    /**
     * Gets the value of the nRea property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNRea() {
        return nRea;
    }

    /**
     * Sets the value of the nRea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNRea(BigInteger value) {
        this.nRea = value;
    }

    /**
     * Gets the value of the ideRich property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdeRich() {
        return ideRich;
    }

    /**
     * Sets the value of the ideRich property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdeRich(String value) {
        this.ideRich = value;
    }

}
