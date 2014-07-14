
package cl.taisachile.scc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPreferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPreferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getPreferencesParam" type="{http://ws.scc.taisachile.cl/}getPreferencesParamVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPreferences", propOrder = {
    "getPreferencesParam"
})
public class GetPreferences {

    protected GetPreferencesParamVO getPreferencesParam;

    /**
     * Gets the value of the getPreferencesParam property.
     * 
     * @return
     *     possible object is
     *     {@link GetPreferencesParamVO }
     *     
     */
    public GetPreferencesParamVO getGetPreferencesParam() {
        return getPreferencesParam;
    }

    /**
     * Sets the value of the getPreferencesParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPreferencesParamVO }
     *     
     */
    public void setGetPreferencesParam(GetPreferencesParamVO value) {
        this.getPreferencesParam = value;
    }

}
