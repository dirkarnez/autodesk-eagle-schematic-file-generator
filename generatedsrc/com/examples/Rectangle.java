//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.02.10 at 04:17:06 PM UTC 
//


package com.examples;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "rectangle")
public class Rectangle {

    @XmlAttribute(name = "x1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String x1;
    @XmlAttribute(name = "y1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String y1;
    @XmlAttribute(name = "x2", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String x2;
    @XmlAttribute(name = "y2", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String y2;
    @XmlAttribute(name = "layer", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String layer;
    @XmlAttribute(name = "rot")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rot;
    @XmlAttribute(name = "grouprefs")
    @XmlIDREF
    protected List<Object> grouprefs;

    /**
     * Gets the value of the x1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX1() {
        return x1;
    }

    /**
     * Sets the value of the x1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX1(String value) {
        this.x1 = value;
    }

    /**
     * Gets the value of the y1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getY1() {
        return y1;
    }

    /**
     * Sets the value of the y1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setY1(String value) {
        this.y1 = value;
    }

    /**
     * Gets the value of the x2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX2() {
        return x2;
    }

    /**
     * Sets the value of the x2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX2(String value) {
        this.x2 = value;
    }

    /**
     * Gets the value of the y2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getY2() {
        return y2;
    }

    /**
     * Sets the value of the y2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setY2(String value) {
        this.y2 = value;
    }

    /**
     * Gets the value of the layer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayer() {
        return layer;
    }

    /**
     * Sets the value of the layer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayer(String value) {
        this.layer = value;
    }

    /**
     * Gets the value of the rot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRot() {
        if (rot == null) {
            return "R0";
        } else {
            return rot;
        }
    }

    /**
     * Sets the value of the rot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRot(String value) {
        this.rot = value;
    }

    /**
     * Gets the value of the grouprefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grouprefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrouprefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGrouprefs() {
        if (grouprefs == null) {
            grouprefs = new ArrayList<Object>();
        }
        return this.grouprefs;
    }

}
