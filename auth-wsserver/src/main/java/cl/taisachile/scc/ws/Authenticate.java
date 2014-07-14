
package cl.taisachile.scc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authenticate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authenticate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authenticateParam" type="{http://ws.scc.taisachile.cl/}authenticateParamVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authenticate", propOrder = {
    "authenticateParam"
})
public class Authenticate {

    protected AuthenticateParamVO authenticateParam;

    /**
     * Gets the value of the authenticateParam property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticateParamVO }
     *     
     */
    public AuthenticateParamVO getAuthenticateParam() {
        return authenticateParam;
    }

    /**
     * Sets the value of the authenticateParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticateParamVO }
     *     
     */
    public void setAuthenticateParam(AuthenticateParamVO value) {
        this.authenticateParam = value;
    }

}
