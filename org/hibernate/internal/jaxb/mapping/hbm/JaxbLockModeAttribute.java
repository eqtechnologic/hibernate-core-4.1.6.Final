//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.08 at 01:37:41 PM EDT 
//


package org.hibernate.internal.jaxb.mapping.hbm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lock-mode-attribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="lock-mode-attribute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="read"/>
 *     &lt;enumeration value="upgrade"/>
 *     &lt;enumeration value="upgrade-nowait"/>
 *     &lt;enumeration value="write"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "lock-mode-attribute")
@XmlEnum
public enum JaxbLockModeAttribute {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("read")
    READ("read"),
    @XmlEnumValue("upgrade")
    UPGRADE("upgrade"),
    @XmlEnumValue("upgrade-nowait")
    UPGRADE_NOWAIT("upgrade-nowait"),
    @XmlEnumValue("write")
    WRITE("write");
    private final String value;

    JaxbLockModeAttribute(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JaxbLockModeAttribute fromValue(String v) {
        for (JaxbLockModeAttribute c: JaxbLockModeAttribute.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
