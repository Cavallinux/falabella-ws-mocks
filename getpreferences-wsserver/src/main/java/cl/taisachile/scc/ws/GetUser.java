
package cl.taisachile.scc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getUserParam" type="{http://ws.scc.taisachile.cl/}getUserParamVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUser", propOrder = {
    "getUserParam"
})
public class GetUser {

    protected GetUserParamVO getUserParam;

    /**
     * Gets the value of the getUserParam property.
     * 
     * @return
     *     possible object is
     *     {@link GetUserParamVO }
     *     
     */
    public GetUserParamVO getGetUserParam() {
        return getUserParam;
    }

    /**
     * Sets the value of the getUserParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserParamVO }
     *     
     */
    public void setGetUserParam(GetUserParamVO value) {
        this.getUserParam = value;
    }

}
