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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "setting")
public class Setting {

    @XmlAttribute(name = "alwaysvectorfont")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String alwaysvectorfont;
    @XmlAttribute(name = "verticaltext")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String verticaltext;
    @XmlAttribute(name = "keepoldvectorfont")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String keepoldvectorfont;

    /**
     * Gets the value of the alwaysvectorfont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlwaysvectorfont() {
        return alwaysvectorfont;
    }

    /**
     * Sets the value of the alwaysvectorfont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlwaysvectorfont(String value) {
        this.alwaysvectorfont = value;
    }

    /**
     * Gets the value of the verticaltext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerticaltext() {
        if (verticaltext == null) {
            return "up";
        } else {
            return verticaltext;
        }
    }

    /**
     * Sets the value of the verticaltext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerticaltext(String value) {
        this.verticaltext = value;
    }

    /**
     * Gets the value of the keepoldvectorfont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeepoldvectorfont() {
        if (keepoldvectorfont == null) {
            return "no";
        } else {
            return keepoldvectorfont;
        }
    }

    /**
     * Sets the value of the keepoldvectorfont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeepoldvectorfont(String value) {
        this.keepoldvectorfont = value;
    }

}
