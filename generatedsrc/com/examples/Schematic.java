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
    "libraries",
    "attributes",
    "variantdefs",
    "classes",
    "modules",
    "groups",
    "parts",
    "sheets",
    "errors"
})
@XmlRootElement(name = "schematic")
public class Schematic {

    @XmlAttribute(name = "xreflabel")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xreflabel;
    @XmlAttribute(name = "xrefpart")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xrefpart;
    protected Description description;
    protected Libraries libraries;
    protected Attributes attributes;
    protected Variantdefs variantdefs;
    protected Classes classes;
    protected Modules modules;
    protected Groups groups;
    protected Parts parts;
    protected Sheets sheets;
    protected Errors errors;

    /**
     * Gets the value of the xreflabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXreflabel() {
        return xreflabel;
    }

    /**
     * Sets the value of the xreflabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXreflabel(String value) {
        this.xreflabel = value;
    }

    /**
     * Gets the value of the xrefpart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXrefpart() {
        return xrefpart;
    }

    /**
     * Sets the value of the xrefpart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXrefpart(String value) {
        this.xrefpart = value;
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
     * Gets the value of the libraries property.
     * 
     * @return
     *     possible object is
     *     {@link Libraries }
     *     
     */
    public Libraries getLibraries() {
        return libraries;
    }

    /**
     * Sets the value of the libraries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Libraries }
     *     
     */
    public void setLibraries(Libraries value) {
        this.libraries = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link Attributes }
     *     
     */
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attributes }
     *     
     */
    public void setAttributes(Attributes value) {
        this.attributes = value;
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
     * Gets the value of the classes property.
     * 
     * @return
     *     possible object is
     *     {@link Classes }
     *     
     */
    public Classes getClasses() {
        return classes;
    }

    /**
     * Sets the value of the classes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Classes }
     *     
     */
    public void setClasses(Classes value) {
        this.classes = value;
    }

    /**
     * Gets the value of the modules property.
     * 
     * @return
     *     possible object is
     *     {@link Modules }
     *     
     */
    public Modules getModules() {
        return modules;
    }

    /**
     * Sets the value of the modules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modules }
     *     
     */
    public void setModules(Modules value) {
        this.modules = value;
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

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link Errors }
     *     
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Errors }
     *     
     */
    public void setErrors(Errors value) {
        this.errors = value;
    }

}
