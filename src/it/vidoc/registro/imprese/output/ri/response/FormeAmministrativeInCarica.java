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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for forme-amministrative-in-carica element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="forme-amministrative-in-carica">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}forma-amministrativa-in-carica" maxOccurs="unbounded"/>
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
    "formaAmministrativaInCarica"
})
@XmlRootElement(name = "forme-amministrative-in-carica")
public class FormeAmministrativeInCarica {

    @XmlElement(name = "forma-amministrativa-in-carica", required = true)
    protected List<FormaAmministrativaInCarica> formaAmministrativaInCarica;

    /**
     * Gets the value of the formaAmministrativaInCarica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formaAmministrativaInCarica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormaAmministrativaInCarica().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormaAmministrativaInCarica }
     * 
     * 
     */
    public List<FormaAmministrativaInCarica> getFormaAmministrativaInCarica() {
        if (formaAmministrativaInCarica == null) {
            formaAmministrativaInCarica = new ArrayList<FormaAmministrativaInCarica>();
        }
        return this.formaAmministrativaInCarica;
    }

}
