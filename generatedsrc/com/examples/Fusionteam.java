//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.02.10 at 04:17:06 PM UTC 
//


package com.examples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "fusionteam")
public class Fusionteam {

    @XmlAttribute(name = "huburn", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String huburn;
    @XmlAttribute(name = "projecturn", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String projecturn;
    @XmlAttribute(name = "folderUrn", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String folderUrn;
    @XmlAttribute(name = "urn", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String urn;
    @XmlAttribute(name = "versionUrn", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String versionUrn;
    @XmlAttribute(name = "camFileUrn", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String camFileUrn;
    @XmlAttribute(name = "camFileVersionUrn", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String camFileVersionUrn;
    @XmlAttribute(name = "lastpublishedchangeguid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lastpublishedchangeguid;

    /**
     * Gets the value of the huburn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuburn() {
        return huburn;
    }

    /**
     * Sets the value of the huburn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuburn(String value) {
        this.huburn = value;
    }

    /**
     * Gets the value of the projecturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjecturn() {
        return projecturn;
    }

    /**
     * Sets the value of the projecturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjecturn(String value) {
        this.projecturn = value;
    }

    /**
     * Gets the value of the folderUrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderUrn() {
        return folderUrn;
    }

    /**
     * Sets the value of the folderUrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderUrn(String value) {
        this.folderUrn = value;
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
        return urn;
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
     * Gets the value of the versionUrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionUrn() {
        return versionUrn;
    }

    /**
     * Sets the value of the versionUrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionUrn(String value) {
        this.versionUrn = value;
    }

    /**
     * Gets the value of the camFileUrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCamFileUrn() {
        return camFileUrn;
    }

    /**
     * Sets the value of the camFileUrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCamFileUrn(String value) {
        this.camFileUrn = value;
    }

    /**
     * Gets the value of the camFileVersionUrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCamFileVersionUrn() {
        return camFileVersionUrn;
    }

    /**
     * Sets the value of the camFileVersionUrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCamFileVersionUrn(String value) {
        this.camFileVersionUrn = value;
    }

    /**
     * Gets the value of the lastpublishedchangeguid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastpublishedchangeguid() {
        return lastpublishedchangeguid;
    }

    /**
     * Sets the value of the lastpublishedchangeguid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastpublishedchangeguid(String value) {
        this.lastpublishedchangeguid = value;
    }

}
