
package cl.taisachile.scc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authenticateOTP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authenticateOTP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authenticateOTPParam" type="{http://ws.scc.taisachile.cl/}authenticateOTPParamVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authenticateOTP", propOrder = {
    "authenticateOTPParam"
})
public class AuthenticateOTP {

    protected AuthenticateOTPParamVO authenticateOTPParam;

    /**
     * Gets the value of the authenticateOTPParam property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticateOTPParamVO }
     *     
     */
    public AuthenticateOTPParamVO getAuthenticateOTPParam() {
        return authenticateOTPParam;
    }

    /**
     * Sets the value of the authenticateOTPParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticateOTPParamVO }
     *     
     */
    public void setAuthenticateOTPParam(AuthenticateOTPParamVO value) {
        this.authenticateOTPParam = value;
    }

}
