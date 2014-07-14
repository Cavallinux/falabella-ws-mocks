
package cl.taisachile.scc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validateChangePasswordSecurityCodeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validateChangePasswordSecurityCodeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.scc.taisachile.cl/}validateChangePasswordSecurityCodeResponseVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateChangePasswordSecurityCodeResponse", propOrder = {
    "_return"
})
public class ValidateChangePasswordSecurityCodeResponse {

    @XmlElement(name = "return")
    protected ValidateChangePasswordSecurityCodeResponseVO _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateChangePasswordSecurityCodeResponseVO }
     *     
     */
    public ValidateChangePasswordSecurityCodeResponseVO getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateChangePasswordSecurityCodeResponseVO }
     *     
     */
    public void setReturn(ValidateChangePasswordSecurityCodeResponseVO value) {
        this._return = value;
    }

}
