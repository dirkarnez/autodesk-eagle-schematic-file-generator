//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.02.08 at 12:43:50 PM UTC 
//


package com.examples;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clearance"
})
@XmlRootElement(name = "class")
public class Class {

    @XmlAttribute(name = "number", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String number;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "width")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String width;
    @XmlAttribute(name = "drill")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String drill;
    protected List<Clearance> clearance;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
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
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        if (width == null) {
            return "0";
        } else {
            return width;
        }
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the drill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrill() {
        if (drill == null) {
            return "0";
        } else {
            return drill;
        }
    }

    /**
     * Sets the value of the drill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrill(String value) {
        this.drill = value;
    }

    /**
     * Gets the value of the clearance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clearance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClearance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Clearance }
     * 
     * 
     */
    public List<Clearance> getClearance() {
        if (clearance == null) {
            clearance = new ArrayList<Clearance>();
        }
        return this.clearance;
    }

}
