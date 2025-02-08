//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.02.08 at 02:14:33 PM UTC 
//


package com.examples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "packageinstances"
})
@XmlRootElement(name = "package3d")
public class Package3D {

    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "urn", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String urn;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "library_version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String libraryVersion;
    @XmlAttribute(name = "library_locally_modified")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String libraryLocallyModified;
    protected Description description;
    protected Packageinstances packageinstances;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        if (name == null) {
            return "";
        } else {
            return name;
        }
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
     * Gets the value of the urn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrn() {
        return urn;
    }

    /**
     * Sets the value of the urn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrn(String value) {
        this.urn = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the libraryVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryVersion() {
        if (libraryVersion == null) {
            return "";
        } else {
            return libraryVersion;
        }
    }

    /**
     * Sets the value of the libraryVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryVersion(String value) {
        this.libraryVersion = value;
    }

    /**
     * Gets the value of the libraryLocallyModified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryLocallyModified() {
        if (libraryLocallyModified == null) {
            return "no";
        } else {
            return libraryLocallyModified;
        }
    }

    /**
     * Sets the value of the libraryLocallyModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryLocallyModified(String value) {
        this.libraryLocallyModified = value;
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
     * Gets the value of the packageinstances property.
     * 
     * @return
     *     possible object is
     *     {@link Packageinstances }
     *     
     */
    public Packageinstances getPackageinstances() {
        return packageinstances;
    }

    /**
     * Sets the value of the packageinstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Packageinstances }
     *     
     */
    public void setPackageinstances(Packageinstances value) {
        this.packageinstances = value;
    }

}
