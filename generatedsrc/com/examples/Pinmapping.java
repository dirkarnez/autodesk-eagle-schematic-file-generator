//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.02.17 at 02:42:09 PM UTC 
//


package com.examples;

import java.util.ArrayList;
import java.util.List;
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
    "pinmap"
})
@XmlRootElement(name = "pinmapping")
public class Pinmapping {

    @XmlAttribute(name = "isusermap")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isusermap;
    @XmlAttribute(name = "iddevicewide")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String iddevicewide;
    @XmlAttribute(name = "spiceprefix")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String spiceprefix;
    @XmlElement(required = true)
    protected List<Pinmap> pinmap;

    /**
     * Gets the value of the isusermap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsusermap() {
        if (isusermap == null) {
            return "no";
        } else {
            return isusermap;
        }
    }

    /**
     * Sets the value of the isusermap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsusermap(String value) {
        this.isusermap = value;
    }

    /**
     * Gets the value of the iddevicewide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIddevicewide() {
        if (iddevicewide == null) {
            return "yes";
        } else {
            return iddevicewide;
        }
    }

    /**
     * Sets the value of the iddevicewide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIddevicewide(String value) {
        this.iddevicewide = value;
    }

    /**
     * Gets the value of the spiceprefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpiceprefix() {
        if (spiceprefix == null) {
            return "";
        } else {
            return spiceprefix;
        }
    }

    /**
     * Sets the value of the spiceprefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpiceprefix(String value) {
        this.spiceprefix = value;
    }

    /**
     * Gets the value of the pinmap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pinmap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPinmap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pinmap }
     * 
     * 
     */
    public List<Pinmap> getPinmap() {
        if (pinmap == null) {
            pinmap = new ArrayList<Pinmap>();
        }
        return this.pinmap;
    }

}
