
package fr.lip6.org.calculatrice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for multiplierResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multiplierResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Resultat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiplierResponse", propOrder = {
    "resultat"
})
public class MultiplierResponse {

    @XmlElement(name = "Resultat")
    protected double resultat;

    /**
     * Gets the value of the resultat property.
     * 
     */
    public double getResultat() {
        return resultat;
    }

    /**
     * Sets the value of the resultat property.
     * 
     */
    public void setResultat(double value) {
        this.resultat = value;
    }

}
