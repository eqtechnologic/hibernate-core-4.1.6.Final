//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.08 at 01:37:41 PM EDT 
//


package org.hibernate.internal.jaxb.mapping.hbm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for return-element complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="return-element">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="return-discriminator" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="column" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="return-property" type="{http://www.hibernate.org/xsd/hibernate-mapping}return-property-element"/>
 *       &lt;/sequence>
 *       &lt;attribute name="alias" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="entity-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lock-mode" type="{http://www.hibernate.org/xsd/hibernate-mapping}lock-mode-attribute" default="read" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "return-element", propOrder = {
    "returnDiscriminatorAndReturnProperty"
})
public class JaxbReturnElement {

    @XmlElements({
        @XmlElement(name = "return-property", type = JaxbReturnPropertyElement.class),
        @XmlElement(name = "return-discriminator", type = JaxbReturnElement.JaxbReturnDiscriminator.class)
    })
    protected List<Object> returnDiscriminatorAndReturnProperty;
    @XmlAttribute
    protected String alias;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "entity-name")
    protected String entityName;
    @XmlAttribute(name = "lock-mode")
    protected JaxbLockModeAttribute lockMode;

    /**
     * Gets the value of the returnDiscriminatorAndReturnProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnDiscriminatorAndReturnProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnDiscriminatorAndReturnProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbReturnPropertyElement }
     * {@link JaxbReturnElement.JaxbReturnDiscriminator }
     * 
     * 
     */
    public List<Object> getReturnDiscriminatorAndReturnProperty() {
        if (returnDiscriminatorAndReturnProperty == null) {
            returnDiscriminatorAndReturnProperty = new ArrayList<Object>();
        }
        return this.returnDiscriminatorAndReturnProperty;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the lockMode property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbLockModeAttribute }
     *     
     */
    public JaxbLockModeAttribute getLockMode() {
        if (lockMode == null) {
            return JaxbLockModeAttribute.READ;
        } else {
            return lockMode;
        }
    }

    /**
     * Sets the value of the lockMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbLockModeAttribute }
     *     
     */
    public void setLockMode(JaxbLockModeAttribute value) {
        this.lockMode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="column" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class JaxbReturnDiscriminator {

        @XmlAttribute(required = true)
        protected String column;

        /**
         * Gets the value of the column property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColumn() {
            return column;
        }

        /**
         * Sets the value of the column property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColumn(String value) {
            this.column = value;
        }

    }

}
