//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 05:57:20 PM CEST 
//


package it.vidoc.registro.imprese.ricerca.anagrafica.request;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerPIvaImpresaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerPIvaImpresaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PIva" type="{}PIvaType"/>
 *         &lt;element name="Cciaa" type="{}CciaaType" maxOccurs="15" minOccurs="0"/>
 *         &lt;element name="IStatoImpresa" type="{}IStatoImpresaType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="FSoloSedi" type="{}FSoloSediType" minOccurs="0"/>
 *         &lt;element name="FNoRd" type="{}FNoRdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerPIvaImpresaType", propOrder = {
    "pIva",
    "cciaa",
    "iStatoImpresa",
    "fSoloSedi",
    "fNoRd"
})
public class PerPIvaImpresaType {

    @XmlElement(name = "PIva", required = true)
    protected BigInteger pIva;
    @XmlElement(name = "Cciaa", required = true)
    protected List<String> cciaa;
    @XmlElement(name = "IStatoImpresa", required = true)
    protected List<IStatoImpresaType> iStatoImpresa;
    @XmlElement(name = "FSoloSedi")
    protected String fSoloSedi;
    @XmlElement(name = "FNoRd")
    protected String fNoRd;

    /**
     * Gets the value of the pIva property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPIva() {
        return pIva;
    }

    /**
     * Sets the value of the pIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPIva(BigInteger value) {
        this.pIva = value;
    }

    /**
     * Gets the value of the cciaa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cciaa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCciaa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCciaa() {
        if (cciaa == null) {
            cciaa = new ArrayList<String>();
        }
        return this.cciaa;
    }

    /**
     * Gets the value of the iStatoImpresa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iStatoImpresa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIStatoImpresa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IStatoImpresaType }
     * 
     * 
     */
    public List<IStatoImpresaType> getIStatoImpresa() {
        if (iStatoImpresa == null) {
            iStatoImpresa = new ArrayList<IStatoImpresaType>();
        }
        return this.iStatoImpresa;
    }

    /**
     * Gets the value of the fSoloSedi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSoloSedi() {
        return fSoloSedi;
    }

    /**
     * Sets the value of the fSoloSedi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSoloSedi(String value) {
        this.fSoloSedi = value;
    }

    /**
     * Gets the value of the fNoRd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNoRd() {
        return fNoRd;
    }

    /**
     * Sets the value of the fNoRd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNoRd(String value) {
        this.fNoRd = value;
    }

}