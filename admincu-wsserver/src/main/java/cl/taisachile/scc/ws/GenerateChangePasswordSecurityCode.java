
package cl.taisachile.scc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generateChangePasswordSecurityCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generateChangePasswordSecurityCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="params" type="{http://ws.scc.taisachile.cl/}generateChangePasswordSecurityCodeParamVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generateChangePasswordSecurityCode", propOrder = {
    "params"
})
public class GenerateChangePasswordSecurityCode {

    protected GenerateChangePasswordSecurityCodeParamVO params;

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link GenerateChangePasswordSecurityCodeParamVO }
     *     
     */
    public GenerateChangePasswordSecurityCodeParamVO getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenerateChangePasswordSecurityCodeParamVO }
     *     
     */
    public void setParams(GenerateChangePasswordSecurityCodeParamVO value) {
        this.params = value;
    }

}
