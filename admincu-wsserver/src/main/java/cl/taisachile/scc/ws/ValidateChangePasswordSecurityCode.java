
package cl.taisachile.scc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validateChangePasswordSecurityCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validateChangePasswordSecurityCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="params" type="{http://ws.scc.taisachile.cl/}validateChangePasswordSecurityCodeParamVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateChangePasswordSecurityCode", propOrder = {
    "params"
})
public class ValidateChangePasswordSecurityCode {

    protected ValidateChangePasswordSecurityCodeParamVO params;

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateChangePasswordSecurityCodeParamVO }
     *     
     */
    public ValidateChangePasswordSecurityCodeParamVO getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateChangePasswordSecurityCodeParamVO }
     *     
     */
    public void setParams(ValidateChangePasswordSecurityCodeParamVO value) {
        this.params = value;
    }

}
