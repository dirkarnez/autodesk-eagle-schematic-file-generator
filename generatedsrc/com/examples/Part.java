//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.02.08 at 12:43:50 PM UTC 
//


package com.examples;

import java.util.ArrayList;
import java.util.List;
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
    "attribute",
    "variant",
    "spice"
})
@XmlRootElement(name = "part")
public class Part {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "library", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String library;
    @XmlAttribute(name = "library_urn")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String libraryUrn;
    @XmlAttribute(name = "deviceset", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String deviceset;
    @XmlAttribute(name = "device", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String device;
    @XmlAttribute(name = "package3d_urn")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String package3DUrn;
    @XmlAttribute(name = "override_package3d_urn")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String overridePackage3DUrn;
    @XmlAttribute(name = "override_package_urn")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String overridePackageUrn;
    @XmlAttribute(name = "override_locally_modified")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String overrideLocallyModified;
    @XmlAttribute(name = "technology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String technology;
    @XmlAttribute(name = "value")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    protected List<Attribute> attribute;
    protected List<Variant> variant;
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
     * Gets the value of the library property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrary() {
        return library;
    }

    /**
     * Sets the value of the library property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrary(String value) {
        this.library = value;
    }

    /**
     * Gets the value of the libraryUrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryUrn() {
        if (libraryUrn == null) {
            return "";
        } else {
            return libraryUrn;
        }
    }

    /**
     * Sets the value of the libraryUrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryUrn(String value) {
        this.libraryUrn = value;
    }

    /**
     * Gets the value of the deviceset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceset() {
        return deviceset;
    }

    /**
     * Sets the value of the deviceset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceset(String value) {
        this.deviceset = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevice(String value) {
        this.device = value;
    }

    /**
     * Gets the value of the package3DUrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackage3DUrn() {
        if (package3DUrn == null) {
            return "";
        } else {
            return package3DUrn;
        }
    }

    /**
     * Sets the value of the package3DUrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackage3DUrn(String value) {
        this.package3DUrn = value;
    }

    /**
     * Gets the value of the overridePackage3DUrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverridePackage3DUrn() {
        if (overridePackage3DUrn == null) {
            return "";
        } else {
            return overridePackage3DUrn;
        }
    }

    /**
     * Sets the value of the overridePackage3DUrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverridePackage3DUrn(String value) {
        this.overridePackage3DUrn = value;
    }

    /**
     * Gets the value of the overridePackageUrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverridePackageUrn() {
        if (overridePackageUrn == null) {
            return "";
        } else {
            return overridePackageUrn;
        }
    }

    /**
     * Sets the value of the overridePackageUrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverridePackageUrn(String value) {
        this.overridePackageUrn = value;
    }

    /**
     * Gets the value of the overrideLocallyModified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideLocallyModified() {
        if (overrideLocallyModified == null) {
            return "no";
        } else {
            return overrideLocallyModified;
        }
    }

    /**
     * Sets the value of the overrideLocallyModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideLocallyModified(String value) {
        this.overrideLocallyModified = value;
    }

    /**
     * Gets the value of the technology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnology() {
        if (technology == null) {
            return "";
        } else {
            return technology;
        }
    }

    /**
     * Sets the value of the technology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnology(String value) {
        this.technology = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
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
     * Gets the value of the variant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Variant }
     * 
     * 
     */
    public List<Variant> getVariant() {
        if (variant == null) {
            variant = new ArrayList<Variant>();
        }
        return this.variant;
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
