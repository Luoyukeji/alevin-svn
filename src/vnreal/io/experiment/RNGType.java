//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.03 at 09:55:31 AM CEST 
//


package vnreal.io.experiment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RNGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RNGType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="Seed" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;/sequence>
 *         &lt;element name="RandomSeeds" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrderedSeeds" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RNGType", propOrder = {
    "seed",
    "randomSeeds",
    "orderedSeeds"
})
public class RNGType {

    @XmlElement(name = "Seed")
    protected List<String> seed;
    @XmlElement(name = "RandomSeeds")
    protected String randomSeeds;
    @XmlElement(name = "OrderedSeeds")
    protected String orderedSeeds;

    /**
     * Gets the value of the seed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeed() {
        if (seed == null) {
            seed = new ArrayList<String>();
        }
        return this.seed;
    }

    /**
     * Gets the value of the randomSeeds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRandomSeeds() {
        return randomSeeds;
    }

    /**
     * Sets the value of the randomSeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRandomSeeds(String value) {
        this.randomSeeds = value;
    }

    /**
     * Gets the value of the orderedSeeds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderedSeeds() {
        return orderedSeeds;
    }

    /**
     * Sets the value of the orderedSeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderedSeeds(String value) {
        this.orderedSeeds = value;
    }

}
