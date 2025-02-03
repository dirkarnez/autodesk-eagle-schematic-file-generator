//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.02.03 at 07:43:13 PM UTC 
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
@XmlType(name = "")
@XmlRootElement(name = "smd")
public class Smd {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String x;
    @XmlAttribute(name = "y", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String y;
    @XmlAttribute(name = "dx", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dx;
    @XmlAttribute(name = "dy", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dy;
    @XmlAttribute(name = "layer", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String layer;
    @XmlAttribute(name = "roundness")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String roundness;
    @XmlAttribute(name = "rot")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rot;
    @XmlAttribute(name = "stop")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stop;
    @XmlAttribute(name = "thermals")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String thermals;
    @XmlAttribute(name = "cream")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cream;

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
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX(String value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setY(String value) {
        this.y = value;
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
     * Gets the value of the roundness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoundness() {
        if (roundness == null) {
            return "0";
        } else {
            return roundness;
        }
    }

    /**
     * Sets the value of the roundness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoundness(String value) {
        this.roundness = value;
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
     * Gets the value of the stop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStop() {
        if (stop == null) {
            return "yes";
        } else {
            return stop;
        }
    }

    /**
     * Sets the value of the stop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStop(String value) {
        this.stop = value;
    }

    /**
     * Gets the value of the thermals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThermals() {
        if (thermals == null) {
            return "yes";
        } else {
            return thermals;
        }
    }

    /**
     * Sets the value of the thermals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThermals(String value) {
        this.thermals = value;
    }

    /**
     * Gets the value of the cream property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCream() {
        if (cream == null) {
            return "yes";
        } else {
            return cream;
        }
    }

    /**
     * Sets the value of the cream property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCream(String value) {
        this.cream = value;
    }

}
