//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.24 at 08:35:14 PM CEST 
//


package it.vidoc.registro.protesti.visura.effetto.response;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormatoDocumentoAllegatoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FormatoDocumentoAllegatoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="X"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="R"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FormatoDocumentoAllegatoType")
@XmlEnum
public enum FormatoDocumentoAllegatoType {

    X,
    T,
    H,
    P,
    R;

    public String value() {
        return name();
    }

    public static FormatoDocumentoAllegatoType fromValue(String v) {
        return valueOf(v);
    }

}
