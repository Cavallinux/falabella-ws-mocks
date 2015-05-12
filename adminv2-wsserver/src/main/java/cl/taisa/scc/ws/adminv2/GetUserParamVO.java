
package cl.taisa.scc.ws.adminv2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserParamVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserParamVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.scc.taisachile.cl/}abstractParamVO">
 *       &lt;sequence>
 *         &lt;element name="getContactInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="getDevicePreferences" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="getDevices" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserParamVO", propOrder = {
    "getContactInfo",
    "getDevicePreferences",
    "getDevices"
})
public class GetUserParamVO
    extends AbstractParamVO
{

    protected boolean getContactInfo;
    protected boolean getDevicePreferences;
    protected boolean getDevices;

    /**
     * Gets the value of the getContactInfo property.
     * 
     */
    public boolean isGetContactInfo() {
        return getContactInfo;
    }

    /**
     * Sets the value of the getContactInfo property.
     * 
     */
    public void setGetContactInfo(boolean value) {
        this.getContactInfo = value;
    }

    /**
     * Gets the value of the getDevicePreferences property.
     * 
     */
    public boolean isGetDevicePreferences() {
        return getDevicePreferences;
    }

    /**
     * Sets the value of the getDevicePreferences property.
     * 
     */
    public void setGetDevicePreferences(boolean value) {
        this.getDevicePreferences = value;
    }

    /**
     * Gets the value of the getDevices property.
     * 
     */
    public boolean isGetDevices() {
        return getDevices;
    }

    /**
     * Sets the value of the getDevices property.
     * 
     */
    public void setGetDevices(boolean value) {
        this.getDevices = value;
    }

}
