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
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for compromissorie element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="compromissorie">
 *   &lt;complexType>
 *     &lt;simpleContent>
 *       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *         &lt;attribute name="f-presenza-nello-statuto" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;/extension>
 *     &lt;/simpleContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "compromissorie")
public class Compromissorie {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "f-presenza-nello-statuto")
    protected String fPresenzaNelloStatuto;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the fPresenzaNelloStatuto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFPresenzaNelloStatuto() {
        return fPresenzaNelloStatuto;
    }

    /**
     * Sets the value of the fPresenzaNelloStatuto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFPresenzaNelloStatuto(String value) {
        this.fPresenzaNelloStatuto = value;
    }

}
