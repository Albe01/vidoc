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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for caratteristiche-impianto-2 element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="caratteristiche-impianto-2">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;attribute name="quintali-potenza-nominale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="tipo-combustibile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="tipo-riscaldamento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "caratteristiche-impianto-2")
public class CaratteristicheImpianto2 {

    @XmlAttribute(name = "quintali-potenza-nominale")
    protected String quintaliPotenzaNominale;
    @XmlAttribute(name = "tipo-combustibile")
    protected String tipoCombustibile;
    @XmlAttribute(name = "tipo-riscaldamento")
    protected String tipoRiscaldamento;

    /**
     * Gets the value of the quintaliPotenzaNominale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuintaliPotenzaNominale() {
        return quintaliPotenzaNominale;
    }

    /**
     * Sets the value of the quintaliPotenzaNominale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuintaliPotenzaNominale(String value) {
        this.quintaliPotenzaNominale = value;
    }

    /**
     * Gets the value of the tipoCombustibile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCombustibile() {
        return tipoCombustibile;
    }

    /**
     * Sets the value of the tipoCombustibile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCombustibile(String value) {
        this.tipoCombustibile = value;
    }

    /**
     * Gets the value of the tipoRiscaldamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRiscaldamento() {
        return tipoRiscaldamento;
    }

    /**
     * Sets the value of the tipoRiscaldamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRiscaldamento(String value) {
        this.tipoRiscaldamento = value;
    }

}
