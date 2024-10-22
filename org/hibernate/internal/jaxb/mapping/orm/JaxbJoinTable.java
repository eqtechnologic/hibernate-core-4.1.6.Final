//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.08 at 01:37:42 PM EDT 
//


package org.hibernate.internal.jaxb.mapping.orm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 @Target({METHOD, FIELD}) @Retention(RUNTIME) public @interface JoinTable {
 *                 }
 *                 String name() default ""; String catalog() default ""; String schema() default ""; JoinColumn[]
 *                 joinColumns()
 *                 default {}; JoinColumn[] inverseJoinColumns() default {}; UniqueConstraint[] uniqueConstraints() default
 *                 {};
 *             
 * 
 * <p>Java class for join-table complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="join-table">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="join-column" type="{http://java.sun.com/xml/ns/persistence/orm}join-column" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inverse-join-column" type="{http://java.sun.com/xml/ns/persistence/orm}join-column" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="unique-constraint" type="{http://java.sun.com/xml/ns/persistence/orm}unique-constraint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="catalog" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schema" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "join-table", propOrder = {
    "joinColumn",
    "inverseJoinColumn",
    "uniqueConstraint"
})
public class JaxbJoinTable {

    @XmlElement(name = "join-column")
    protected List<JaxbJoinColumn> joinColumn;
    @XmlElement(name = "inverse-join-column")
    protected List<JaxbJoinColumn> inverseJoinColumn;
    @XmlElement(name = "unique-constraint")
    protected List<JaxbUniqueConstraint> uniqueConstraint;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected String catalog;
    @XmlAttribute
    protected String schema;

    /**
     * Gets the value of the joinColumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the joinColumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJoinColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbJoinColumn }
     * 
     * 
     */
    public List<JaxbJoinColumn> getJoinColumn() {
        if (joinColumn == null) {
            joinColumn = new ArrayList<JaxbJoinColumn>();
        }
        return this.joinColumn;
    }

    /**
     * Gets the value of the inverseJoinColumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inverseJoinColumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInverseJoinColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbJoinColumn }
     * 
     * 
     */
    public List<JaxbJoinColumn> getInverseJoinColumn() {
        if (inverseJoinColumn == null) {
            inverseJoinColumn = new ArrayList<JaxbJoinColumn>();
        }
        return this.inverseJoinColumn;
    }

    /**
     * Gets the value of the uniqueConstraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uniqueConstraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniqueConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbUniqueConstraint }
     * 
     * 
     */
    public List<JaxbUniqueConstraint> getUniqueConstraint() {
        if (uniqueConstraint == null) {
            uniqueConstraint = new ArrayList<JaxbUniqueConstraint>();
        }
        return this.uniqueConstraint;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the catalog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * Sets the value of the catalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalog(String value) {
        this.catalog = value;
    }

    /**
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchema(String value) {
        this.schema = value;
    }

}
