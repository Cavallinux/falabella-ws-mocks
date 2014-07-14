
package cl.taisachile.scc.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPreferencesResponseVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPreferencesResponseVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.scc.taisachile.cl/}abstractResponseVO">
 *       &lt;sequence>
 *         &lt;element name="devicePreferences" type="{http://ws.scc.taisachile.cl/}authenticationPreferenceVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user" type="{http://ws.scc.taisachile.cl/}userVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPreferencesResponseVO", propOrder = {
    "devicePreferences",
    "fullName",
    "user"
})
public class GetPreferencesResponseVO
    extends AbstractResponseVO
{

    @XmlElement(nillable = true)
    protected List<AuthenticationPreferenceVO> devicePreferences;
    protected String fullName;
    protected UserVO user;

    /**
     * Gets the value of the devicePreferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devicePreferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevicePreferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthenticationPreferenceVO }
     * 
     * 
     */
    public List<AuthenticationPreferenceVO> getDevicePreferences() {
        if (devicePreferences == null) {
            devicePreferences = new ArrayList<AuthenticationPreferenceVO>();
        }
        return this.devicePreferences;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserVO }
     *     
     */
    public UserVO getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserVO }
     *     
     */
    public void setUser(UserVO value) {
        this.user = value;
    }

}
