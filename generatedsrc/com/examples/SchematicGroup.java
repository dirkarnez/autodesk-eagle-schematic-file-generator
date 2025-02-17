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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
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
    "attribute",
    "description"
})
@XmlRootElement(name = "schematic_group")
public class SchematicGroup {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String name;
    @XmlAttribute(name = "selectable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String selectable;
    @XmlAttribute(name = "width")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String width;
    @XmlAttribute(name = "titleSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String titleSize;
    @XmlAttribute(name = "titleFont")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String titleFont;
    @XmlAttribute(name = "style")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String style;
    @XmlAttribute(name = "showAnnotations")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String showAnnotations;
    @XmlAttribute(name = "layer")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String layer;
    @XmlAttribute(name = "grouprefs")
    @XmlIDREF
    protected List<Object> grouprefs;
    protected List<Attribute> attribute;
    protected Description description;

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
     * Gets the value of the selectable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectable() {
        return selectable;
    }

    /**
     * Sets the value of the selectable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectable(String value) {
        this.selectable = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the titleSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleSize() {
        return titleSize;
    }

    /**
     * Sets the value of the titleSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleSize(String value) {
        this.titleSize = value;
    }

    /**
     * Gets the value of the titleFont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleFont() {
        return titleFont;
    }

    /**
     * Sets the value of the titleFont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleFont(String value) {
        this.titleFont = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the showAnnotations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowAnnotations() {
        return showAnnotations;
    }

    /**
     * Sets the value of the showAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowAnnotations(String value) {
        this.showAnnotations = value;
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

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attribute }
     * 
     * 
     */
    public List<Attribute> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<Attribute>();
        }
        return this.attribute;
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

}
