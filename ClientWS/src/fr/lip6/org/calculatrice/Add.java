
package fr.lip6.org.calculatrice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for add complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="add">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operande1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Operande2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add", propOrder = {
    "operande1",
    "operande2"
})
public class Add {

    @XmlElement(name = "Operande1")
    protected double operande1;
    @XmlElement(name = "Operande2")
    protected double operande2;

    /**
     * Gets the value of the operande1 property.
     * 
     */
    public double getOperande1() {
        return operande1;
    }

    /**
     * Sets the value of the operande1 property.
     * 
     */
    public void setOperande1(double value) {
        this.operande1 = value;
    }

    /**
     * Gets the value of the operande2 property.
     * 
     */
    public double getOperande2() {
        return operande2;
    }

    /**
     * Sets the value of the operande2 property.
     * 
     */
    public void setOperande2(double value) {
        this.operande2 = value;
    }

}
