//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.02.08 at 12:43:50 PM UTC 
//


package com.examples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pinmapping",
    "model"
})
@XmlRootElement(name = "spice")
public class Spice {

    @XmlElement(required = true)
    protected Pinmapping pinmapping;
    @XmlElement(required = true)
    protected Model model;

    /**
     * Gets the value of the pinmapping property.
     * 
     * @return
     *     possible object is
     *     {@link Pinmapping }
     *     
     */
    public Pinmapping getPinmapping() {
        return pinmapping;
    }

    /**
     * Sets the value of the pinmapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pinmapping }
     *     
     */
    public void setPinmapping(Pinmapping value) {
        this.pinmapping = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link Model }
     *     
     */
    public Model getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link Model }
     *     
     */
    public void setModel(Model value) {
        this.model = value;
    }

}
