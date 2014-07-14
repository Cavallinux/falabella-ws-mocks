
package cl.taisachile.scc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authenticateOTPCorp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authenticateOTPCorp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authenticateOTPCorpParam" type="{http://ws.scc.taisachile.cl/}authenticateOTPParamVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authenticateOTPCorp", propOrder = {
    "authenticateOTPCorpParam"
})
public class AuthenticateOTPCorp {

    protected AuthenticateOTPParamVO authenticateOTPCorpParam;

    /**
     * Gets the value of the authenticateOTPCorpParam property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticateOTPParamVO }
     *     
     */
    public AuthenticateOTPParamVO getAuthenticateOTPCorpParam() {
        return authenticateOTPCorpParam;
    }

    /**
     * Sets the value of the authenticateOTPCorpParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticateOTPParamVO }
     *     
     */
    public void setAuthenticateOTPCorpParam(AuthenticateOTPParamVO value) {
        this.authenticateOTPCorpParam = value;
    }

}
