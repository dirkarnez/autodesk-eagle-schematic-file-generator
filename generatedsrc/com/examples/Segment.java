//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.02.08 at 01:58:07 PM UTC 
//


package com.examples;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pinrefOrPortrefOrWireOrJunctionOrLabelOrProbe"
})
@XmlRootElement(name = "segment")
public class Segment {

    @XmlElements({
        @XmlElement(name = "pinref", type = Pinref.class),
        @XmlElement(name = "portref", type = Portref.class),
        @XmlElement(name = "wire", type = Wire.class),
        @XmlElement(name = "junction", type = Junction.class),
        @XmlElement(name = "label", type = Label.class),
        @XmlElement(name = "probe", type = Probe.class)
    })
    protected List<Object> pinrefOrPortrefOrWireOrJunctionOrLabelOrProbe;

    /**
     * Gets the value of the pinrefOrPortrefOrWireOrJunctionOrLabelOrProbe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pinrefOrPortrefOrWireOrJunctionOrLabelOrProbe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPinrefOrPortrefOrWireOrJunctionOrLabelOrProbe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pinref }
     * {@link Portref }
     * {@link Wire }
     * {@link Junction }
     * {@link Label }
     * {@link Probe }
     * 
     * 
     */
    public List<Object> getPinrefOrPortrefOrWireOrJunctionOrLabelOrProbe() {
        if (pinrefOrPortrefOrWireOrJunctionOrLabelOrProbe == null) {
            pinrefOrPortrefOrWireOrJunctionOrLabelOrProbe = new ArrayList<Object>();
        }
        return this.pinrefOrPortrefOrWireOrJunctionOrLabelOrProbe;
    }

}
