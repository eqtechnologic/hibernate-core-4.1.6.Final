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
 *                 @Target({TYPE, METHOD, FIELD}) @Retention(RUNTIME) public @interface TableGenerator {
 *                 }
 *                 String name(); String table() default ""; String catalog() default ""; String schema() default "";
 *                 String
 *                 pkColumnName() default ""; String valueColumnName() default ""; String pkColumnValue() default ""; int
 *                 initialValue() default 0; int allocationSize() default 50; UniqueConstraint[] uniqueConstraints()
 *                 default {};
 *             
 * 
 * <p>Java class for table-generator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="table-generator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unique-constraint" type="{http://java.sun.com/xml/ns/persistence/orm}unique-constraint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="table" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="catalog" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schema" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pk-column-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="value-column-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pk-column-value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="initial-value" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="allocation-size" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "table-generator", propOrder = {
    "description",
    "uniqueConstraint"
})
public class JaxbTableGenerator {

    protected String description;
    @XmlElement(name = "unique-constraint")
    protected List<JaxbUniqueConstraint> uniqueConstraint;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute
    protected String table;
    @XmlAttribute
    protected String catalog;
    @XmlAttribute
    protected String schema;
    @XmlAttribute(name = "pk-column-name")
    protected String pkColumnName;
    @XmlAttribute(name = "value-column-name")
    protected String valueColumnName;
    @XmlAttribute(name = "pk-column-value")
    protected String pkColumnValue;
    @XmlAttribute(name = "initial-value")
    protected Integer initialValue;
    @XmlAttribute(name = "allocation-size")
    protected Integer allocationSize;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTable(String value) {
        this.table = value;
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

    /**
     * Gets the value of the pkColumnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkColumnName() {
        return pkColumnName;
    }

    /**
     * Sets the value of the pkColumnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkColumnName(String value) {
        this.pkColumnName = value;
    }

    /**
     * Gets the value of the valueColumnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueColumnName() {
        return valueColumnName;
    }

    /**
     * Sets the value of the valueColumnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueColumnName(String value) {
        this.valueColumnName = value;
    }

    /**
     * Gets the value of the pkColumnValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkColumnValue() {
        return pkColumnValue;
    }

    /**
     * Sets the value of the pkColumnValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkColumnValue(String value) {
        this.pkColumnValue = value;
    }

    /**
     * Gets the value of the initialValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInitialValue() {
        return initialValue;
    }

    /**
     * Sets the value of the initialValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInitialValue(Integer value) {
        this.initialValue = value;
    }

    /**
     * Gets the value of the allocationSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAllocationSize() {
        return allocationSize;
    }

    /**
     * Sets the value of the allocationSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAllocationSize(Integer value) {
        this.allocationSize = value;
    }

}
