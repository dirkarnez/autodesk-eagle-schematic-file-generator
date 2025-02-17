//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.02.17 at 02:42:09 PM UTC 
//


package com.examples;

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
    "description",
    "ports",
    "variantdefs",
    "groups",
    "parts",
    "sheets"
})
@XmlRootElement(name = "module")
public class Module {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "prefix")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String prefix;
    @XmlAttribute(name = "dx", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dx;
    @XmlAttribute(name = "dy", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dy;
    protected Description description;
    protected Ports ports;
    protected Variantdefs variantdefs;
    protected Groups groups;
    protected Parts parts;
    protected Sheets sheets;

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
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        if (prefix == null) {
            return "";
        } else {
            return prefix;
        }
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the dx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDx() {
        return dx;
    }

    /**
     * Sets the value of the dx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDx(String value) {
        this.dx = value;
    }

    /**
     * Gets the value of the dy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDy() {
        return dy;
    }

    /**
     * Sets the value of the dy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDy(String value) {
        this.dy = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the ports property.
     * 
     * @return
     *     possible object is
     *     {@link Ports }
     *     
     */
    public Ports getPorts() {
        return ports;
    }

    /**
     * Sets the value of the ports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ports }
     *     
     */
    public void setPorts(Ports value) {
        this.ports = value;
    }

    /**
     * Gets the value of the variantdefs property.
     * 
     * @return
     *     possible object is
     *     {@link Variantdefs }
     *     
     */
    public Variantdefs getVariantdefs() {
        return variantdefs;
    }

    /**
     * Sets the value of the variantdefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Variantdefs }
     *     
     */
    public void setVariantdefs(Variantdefs value) {
        this.variantdefs = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * @return
     *     possible object is
     *     {@link Groups }
     *     
     */
    public Groups getGroups() {
        return groups;
    }

    /**
     * Sets the value of the groups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Groups }
     *     
     */
    public void setGroups(Groups value) {
        this.groups = value;
    }

    /**
     * Gets the value of the parts property.
     * 
     * @return
     *     possible object is
     *     {@link Parts }
     *     
     */
    public Parts getParts() {
        return parts;
    }

    /**
     * Sets the value of the parts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parts }
     *     
     */
    public void setParts(Parts value) {
        this.parts = value;
    }

    /**
     * Gets the value of the sheets property.
     * 
     * @return
     *     possible object is
     *     {@link Sheets }
     *     
     */
    public Sheets getSheets() {
        return sheets;
    }

    /**
     * Sets the value of the sheets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sheets }
     *     
     */
    public void setSheets(Sheets value) {
        this.sheets = value;
    }

}
