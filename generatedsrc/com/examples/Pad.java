//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.02.03 at 07:45:01 PM UTC 
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
@XmlRootElement(name = "pad")
public class Pad {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String x;
    @XmlAttribute(name = "y", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String y;
    @XmlAttribute(name = "drill", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String drill;
    @XmlAttribute(name = "diameter")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String diameter;
    @XmlAttribute(name = "shape")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shape;
    @XmlAttribute(name = "rot")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rot;
    @XmlAttribute(name = "stop")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stop;
    @XmlAttribute(name = "thermals")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String thermals;
    @XmlAttribute(name = "first")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String first;

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
     * Gets the value of the drill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrill() {
        return drill;
    }

    /**
     * Sets the value of the drill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrill(String value) {
        this.drill = value;
    }

    /**
     * Gets the value of the diameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiameter() {
        if (diameter == null) {
            return "0";
        } else {
            return diameter;
        }
    }

    /**
     * Sets the value of the diameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiameter(String value) {
        this.diameter = value;
    }

    /**
     * Gets the value of the shape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShape() {
        if (shape == null) {
            return "round";
        } else {
            return shape;
        }
    }

    /**
     * Sets the value of the shape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShape(String value) {
        this.shape = value;
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
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirst() {
        if (first == null) {
            return "no";
        } else {
            return first;
        }
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirst(String value) {
        this.first = value;
    }

}
