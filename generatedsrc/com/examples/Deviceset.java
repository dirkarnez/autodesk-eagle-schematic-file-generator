//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.02.08 at 01:58:07 PM UTC 
//


package com.examples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
    "gates",
    "devices",
    "spice"
})
@XmlRootElement(name = "deviceset")
public class Deviceset {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "urn")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String urn;
    @XmlAttribute(name = "locally_modified")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String locallyModified;
    @XmlAttribute(name = "prefix")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String prefix;
    @XmlAttribute(name = "uservalue")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String uservalue;
    @XmlAttribute(name = "library_version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String libraryVersion;
    @XmlAttribute(name = "library_locally_modified")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String libraryLocallyModified;
    protected Description description;
    @XmlElement(required = true)
    protected Gates gates;
    @XmlElement(required = true)
    protected Devices devices;
    protected Spice spice;

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
     * Gets the value of the urn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrn() {
        if (urn == null) {
            return "";
        } else {
            return urn;
        }
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
     * Gets the value of the locallyModified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocallyModified() {
        if (locallyModified == null) {
            return "no";
        } else {
            return locallyModified;
        }
    }

    /**
     * Sets the value of the locallyModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocallyModified(String value) {
        this.locallyModified = value;
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
     * Gets the value of the uservalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUservalue() {
        if (uservalue == null) {
            return "no";
        } else {
            return uservalue;
        }
    }

    /**
     * Sets the value of the uservalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUservalue(String value) {
        this.uservalue = value;
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
     * Gets the value of the gates property.
     * 
     * @return
     *     possible object is
     *     {@link Gates }
     *     
     */
    public Gates getGates() {
        return gates;
    }

    /**
     * Sets the value of the gates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gates }
     *     
     */
    public void setGates(Gates value) {
        this.gates = value;
    }

    /**
     * Gets the value of the devices property.
     * 
     * @return
     *     possible object is
     *     {@link Devices }
     *     
     */
    public Devices getDevices() {
        return devices;
    }

    /**
     * Sets the value of the devices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Devices }
     *     
     */
    public void setDevices(Devices value) {
        this.devices = value;
    }

    /**
     * Gets the value of the spice property.
     * 
     * @return
     *     possible object is
     *     {@link Spice }
     *     
     */
    public Spice getSpice() {
        return spice;
    }

    /**
     * Sets the value of the spice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spice }
     *     
     */
    public void setSpice(Spice value) {
        this.spice = value;
    }

}
