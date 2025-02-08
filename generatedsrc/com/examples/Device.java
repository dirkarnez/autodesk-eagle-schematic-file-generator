//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.02.08 at 12:43:50 PM UTC 
//


package com.examples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "connects",
    "package3Dinstances",
    "technologies"
})
@XmlRootElement(name = "device")
public class Device {

    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "package")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String _package;
    protected Connects connects;
    @XmlElement(name = "package3dinstances")
    protected Package3Dinstances package3Dinstances;
    protected Technologies technologies;

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
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackage(String value) {
        this._package = value;
    }

    /**
     * Gets the value of the connects property.
     * 
     * @return
     *     possible object is
     *     {@link Connects }
     *     
     */
    public Connects getConnects() {
        return connects;
    }

    /**
     * Sets the value of the connects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Connects }
     *     
     */
    public void setConnects(Connects value) {
        this.connects = value;
    }

    /**
     * Gets the value of the package3Dinstances property.
     * 
     * @return
     *     possible object is
     *     {@link Package3Dinstances }
     *     
     */
    public Package3Dinstances getPackage3Dinstances() {
        return package3Dinstances;
    }

    /**
     * Sets the value of the package3Dinstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Package3Dinstances }
     *     
     */
    public void setPackage3Dinstances(Package3Dinstances value) {
        this.package3Dinstances = value;
    }

    /**
     * Gets the value of the technologies property.
     * 
     * @return
     *     possible object is
     *     {@link Technologies }
     *     
     */
    public Technologies getTechnologies() {
        return technologies;
    }

    /**
     * Sets the value of the technologies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Technologies }
     *     
     */
    public void setTechnologies(Technologies value) {
        this.technologies = value;
    }

}
