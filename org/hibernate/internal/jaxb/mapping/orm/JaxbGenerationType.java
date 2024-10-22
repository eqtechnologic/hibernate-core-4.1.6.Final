//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.08 at 01:37:42 PM EDT 
//


package org.hibernate.internal.jaxb.mapping.orm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generation-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="generation-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="TABLE"/>
 *     &lt;enumeration value="SEQUENCE"/>
 *     &lt;enumeration value="IDENTITY"/>
 *     &lt;enumeration value="AUTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "generation-type")
@XmlEnum
public enum JaxbGenerationType {

    TABLE,
    SEQUENCE,
    IDENTITY,
    AUTO;

    public String value() {
        return name();
    }

    public static JaxbGenerationType fromValue(String v) {
        return valueOf(v);
    }

}
