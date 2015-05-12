
package cl.taisa.scc.ws.adminv2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for abstractParamVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="abstractParamVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextVO" type="{http://ws.scc.taisachile.cl/}contextVO" minOccurs="0"/>
 *         &lt;element name="userVO" type="{http://ws.scc.taisachile.cl/}userVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractParamVO", propOrder = {
    "contextVO",
    "userVO"
})
@XmlSeeAlso({
    SetAuthenticationPreferenceParamVO.class,
    GetPreferencesParamVO.class,
    GetUserParamVO.class,
    GetAvailableDeviceTypesParamVO.class
})
public abstract class AbstractParamVO {

    protected ContextVO contextVO;
    protected UserVO userVO;

    /**
     * Gets the value of the contextVO property.
     * 
     * @return
     *     possible object is
     *     {@link ContextVO }
     *     
     */
    public ContextVO getContextVO() {
        return contextVO;
    }

    /**
     * Sets the value of the contextVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextVO }
     *     
     */
    public void setContextVO(ContextVO value) {
        this.contextVO = value;
    }

    /**
     * Gets the value of the userVO property.
     * 
     * @return
     *     possible object is
     *     {@link UserVO }
     *     
     */
    public UserVO getUserVO() {
        return userVO;
    }

    /**
     * Sets the value of the userVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserVO }
     *     
     */
    public void setUserVO(UserVO value) {
        this.userVO = value;
    }

}
