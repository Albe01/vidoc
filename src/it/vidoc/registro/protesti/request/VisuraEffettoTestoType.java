//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.27 at 11:18:10 AM CEST 
//


package it.vidoc.registro.protesti.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VisuraEffettoTestoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisuraEffettoTestoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="PerChiaveAnagraficaTesto" type="{}PerChiaveAnagraficaTestoType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisuraEffettoTestoType", propOrder = {
    "perChiaveAnagraficaTesto"
})
public class VisuraEffettoTestoType {

    @XmlElement(name = "PerChiaveAnagraficaTesto")
    protected PerChiaveAnagraficaTestoType perChiaveAnagraficaTesto;

    /**
     * Gets the value of the perChiaveAnagraficaTesto property.
     * 
     * @return
     *     possible object is
     *     {@link PerChiaveAnagraficaTestoType }
     *     
     */
    public PerChiaveAnagraficaTestoType getPerChiaveAnagraficaTesto() {
        return perChiaveAnagraficaTesto;
    }

    /**
     * Sets the value of the perChiaveAnagraficaTesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerChiaveAnagraficaTestoType }
     *     
     */
    public void setPerChiaveAnagraficaTesto(PerChiaveAnagraficaTestoType value) {
        this.perChiaveAnagraficaTesto = value;
    }

}
