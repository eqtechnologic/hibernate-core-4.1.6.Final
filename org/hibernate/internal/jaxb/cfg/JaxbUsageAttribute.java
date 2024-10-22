//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.08 at 01:37:38 PM EDT 
//


package org.hibernate.internal.jaxb.cfg;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for usage-attribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="usage-attribute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="nonstrict-read-write"/>
 *     &lt;enumeration value="read-only"/>
 *     &lt;enumeration value="read-write"/>
 *     &lt;enumeration value="transactional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "usage-attribute")
@XmlEnum
public enum JaxbUsageAttribute {

    @XmlEnumValue("nonstrict-read-write")
    NONSTRICT_READ_WRITE("nonstrict-read-write"),
    @XmlEnumValue("read-only")
    READ_ONLY("read-only"),
    @XmlEnumValue("read-write")
    READ_WRITE("read-write"),
    @XmlEnumValue("transactional")
    TRANSACTIONAL("transactional");
    private final String value;

    JaxbUsageAttribute(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JaxbUsageAttribute fromValue(String v) {
        for (JaxbUsageAttribute c: JaxbUsageAttribute.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
