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
 * <p>Java class for resultset-element complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultset-element">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="return-scalar" type="{http://www.hibernate.org/xsd/hibernate-mapping}return-scalar-element"/>
 *         &lt;element name="return" type="{http://www.hibernate.org/xsd/hibernate-mapping}return-element"/>
 *         &lt;element name="return-join" type="{http://www.hibernate.org/xsd/hibernate-mapping}return-join-element"/>
 *         &lt;element name="load-collection" type="{http://www.hibernate.org/xsd/hibernate-mapping}load-collection-element"/>
 *       &lt;/choice>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultset-element", propOrder = {
    "returnScalarOrReturnOrReturnJoin"
})
public class JaxbResultsetElement {

    @XmlElements({
        @XmlElement(name = "load-collection", type = JaxbLoadCollectionElement.class),
        @XmlElement(name = "return-join", type = JaxbReturnJoinElement.class),
        @XmlElement(name = "return-scalar", type = JaxbReturnScalarElement.class),
        @XmlElement(name = "return", type = JaxbReturnElement.class)
    })
    protected List<Object> returnScalarOrReturnOrReturnJoin;
    @XmlAttribute(required = true)
    protected String name;

    /**
     * Gets the value of the returnScalarOrReturnOrReturnJoin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnScalarOrReturnOrReturnJoin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnScalarOrReturnOrReturnJoin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbLoadCollectionElement }
     * {@link JaxbReturnJoinElement }
     * {@link JaxbReturnScalarElement }
     * {@link JaxbReturnElement }
     * 
     * 
     */
    public List<Object> getReturnScalarOrReturnOrReturnJoin() {
        if (returnScalarOrReturnOrReturnJoin == null) {
            returnScalarOrReturnOrReturnJoin = new ArrayList<Object>();
        }
        return this.returnScalarOrReturnOrReturnJoin;
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

}
