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
@XmlRootElement(name = "package3dinstance")
public class Package3Dinstance {

    @XmlAttribute(name = "package3d_urn", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String package3DUrn;

    /**
     * Gets the value of the package3DUrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackage3DUrn() {
        return package3DUrn;
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

}
