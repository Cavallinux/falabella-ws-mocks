
package cl.taisachile.scc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for existChangePasswordSecurityCodeCurrentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="existChangePasswordSecurityCodeCurrentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.scc.taisachile.cl/}existActivationCodeCurrentResponseVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "existChangePasswordSecurityCodeCurrentResponse", propOrder = {
    "_return"
})
public class ExistChangePasswordSecurityCodeCurrentResponse {

    @XmlElement(name = "return")
    protected ExistActivationCodeCurrentResponseVO _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ExistActivationCodeCurrentResponseVO }
     *     
     */
    public ExistActivationCodeCurrentResponseVO getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistActivationCodeCurrentResponseVO }
     *     
     */
    public void setReturn(ExistActivationCodeCurrentResponseVO value) {
        this._return = value;
    }

}
