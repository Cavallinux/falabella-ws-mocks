
package cl.taisachile.scc.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserResponseVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserResponseVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.scc.taisachile.cl/}abstractResponseVO">
 *       &lt;sequence>
 *         &lt;element name="devicePreferences" type="{http://ws.scc.taisachile.cl/}authenticationPreferenceVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="devices" type="{http://ws.scc.taisachile.cl/}deviceVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="machines" type="{http://ws.scc.taisachile.cl/}machineVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="qaSecrets" type="{http://ws.scc.taisachile.cl/}qaSecretVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="user" type="{http://ws.scc.taisachile.cl/}userVO" minOccurs="0"/>
 *         &lt;element name="userInfo" type="{http://ws.scc.taisachile.cl/}contactoInfoVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserResponseVO", propOrder = {
    "devicePreferences",
    "devices",
    "fullName",
    "machines",
    "qaSecrets",
    "user",
    "userInfo"
})
public class GetUserResponseVO
    extends AbstractResponseVO
{

    @XmlElement(nillable = true)
    protected List<AuthenticationPreferenceVO> devicePreferences;
    @XmlElement(nillable = true)
    protected List<DeviceVO> devices;
    protected String fullName;
    @XmlElement(nillable = true)
    protected List<MachineVO> machines;
    @XmlElement(nillable = true)
    protected List<QaSecretVO> qaSecrets;
    protected UserVO user;
    @XmlElement(nillable = true)
    protected List<ContactoInfoVO> userInfo;

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
     * Gets the value of the devices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceVO }
     * 
     * 
     */
    public List<DeviceVO> getDevices() {
        if (devices == null) {
            devices = new ArrayList<DeviceVO>();
        }
        return this.devices;
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
     * Gets the value of the machines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the machines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMachines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MachineVO }
     * 
     * 
     */
    public List<MachineVO> getMachines() {
        if (machines == null) {
            machines = new ArrayList<MachineVO>();
        }
        return this.machines;
    }

    /**
     * Gets the value of the qaSecrets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qaSecrets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQaSecrets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QaSecretVO }
     * 
     * 
     */
    public List<QaSecretVO> getQaSecrets() {
        if (qaSecrets == null) {
            qaSecrets = new ArrayList<QaSecretVO>();
        }
        return this.qaSecrets;
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

    /**
     * Gets the value of the userInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactoInfoVO }
     * 
     * 
     */
    public List<ContactoInfoVO> getUserInfo() {
        if (userInfo == null) {
            userInfo = new ArrayList<ContactoInfoVO>();
        }
        return this.userInfo;
    }

}
