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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mfgpreviewcolor"
})
@XmlRootElement(name = "mfgpreviewcolors")
public class Mfgpreviewcolors {

    protected List<Mfgpreviewcolor> mfgpreviewcolor;

    /**
     * Gets the value of the mfgpreviewcolor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mfgpreviewcolor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMfgpreviewcolor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mfgpreviewcolor }
     * 
     * 
     */
    public List<Mfgpreviewcolor> getMfgpreviewcolor() {
        if (mfgpreviewcolor == null) {
            mfgpreviewcolor = new ArrayList<Mfgpreviewcolor>();
        }
        return this.mfgpreviewcolor;
    }

}
