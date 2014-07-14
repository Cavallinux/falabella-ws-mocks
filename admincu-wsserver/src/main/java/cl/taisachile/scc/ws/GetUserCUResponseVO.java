
package cl.taisachile.scc.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserCUResponseVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserCUResponseVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.scc.taisachile.cl/}abstractResponseVO">
 *       &lt;sequence>
 *         &lt;element name="avatar" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="avatarType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="devices" type="{http://ws.scc.taisachile.cl/}deviceVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="firstnames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastname1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastname2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="levelSecurity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="options" type="{http://ws.scc.taisachile.cl/}genericOptionVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="questionsAnswers" type="{http://ws.scc.taisachile.cl/}questionAnswerVO" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getUserCUResponseVO", propOrder = {
    "avatar",
    "avatarType",
    "devices",
    "firstnames",
    "lastname1",
    "lastname2",
    "levelSecurity",
    "options",
    "questionsAnswers",
    "user",
    "userInfo"
})
public class GetUserCUResponseVO
    extends AbstractResponseVO
{

    protected byte[] avatar;
    protected String avatarType;
    @XmlElement(nillable = true)
    protected List<DeviceVO> devices;
    protected String firstnames;
    protected String lastname1;
    protected String lastname2;
    protected String levelSecurity;
    @XmlElement(nillable = true)
    protected List<GenericOptionVO> options;
    @XmlElement(nillable = true)
    protected List<QuestionAnswerVO> questionsAnswers;
    protected UserVO user;
    @XmlElement(nillable = true)
    protected List<ContactoInfoVO> userInfo;

    /**
     * Gets the value of the avatar property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAvatar() {
        return avatar;
    }

    /**
     * Sets the value of the avatar property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAvatar(byte[] value) {
        this.avatar = ((byte[]) value);
    }

    /**
     * Gets the value of the avatarType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvatarType() {
        return avatarType;
    }

    /**
     * Sets the value of the avatarType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvatarType(String value) {
        this.avatarType = value;
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
     * Gets the value of the firstnames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstnames() {
        return firstnames;
    }

    /**
     * Sets the value of the firstnames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstnames(String value) {
        this.firstnames = value;
    }

    /**
     * Gets the value of the lastname1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname1() {
        return lastname1;
    }

    /**
     * Sets the value of the lastname1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname1(String value) {
        this.lastname1 = value;
    }

    /**
     * Gets the value of the lastname2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname2() {
        return lastname2;
    }

    /**
     * Sets the value of the lastname2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname2(String value) {
        this.lastname2 = value;
    }

    /**
     * Gets the value of the levelSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelSecurity() {
        return levelSecurity;
    }

    /**
     * Sets the value of the levelSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelSecurity(String value) {
        this.levelSecurity = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericOptionVO }
     * 
     * 
     */
    public List<GenericOptionVO> getOptions() {
        if (options == null) {
            options = new ArrayList<GenericOptionVO>();
        }
        return this.options;
    }

    /**
     * Gets the value of the questionsAnswers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionsAnswers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionsAnswers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuestionAnswerVO }
     * 
     * 
     */
    public List<QuestionAnswerVO> getQuestionsAnswers() {
        if (questionsAnswers == null) {
            questionsAnswers = new ArrayList<QuestionAnswerVO>();
        }
        return this.questionsAnswers;
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
