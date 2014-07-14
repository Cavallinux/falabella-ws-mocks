
package cl.taisachile.scc.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setAuthenticationPreferenceParamVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setAuthenticationPreferenceParamVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.scc.taisachile.cl/}abstractParamVO">
 *       &lt;sequence>
 *         &lt;element name="authenticationPreferences" type="{http://ws.scc.taisachile.cl/}authenticationPreferenceVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setAuthenticationPreferenceParamVO", propOrder = {
    "authenticationPreferences"
})
public class SetAuthenticationPreferenceParamVO
    extends AbstractParamVO
{

    @XmlElement(nillable = true)
    protected List<AuthenticationPreferenceVO> authenticationPreferences;

    /**
     * Gets the value of the authenticationPreferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authenticationPreferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthenticationPreferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthenticationPreferenceVO }
     * 
     * 
     */
    public List<AuthenticationPreferenceVO> getAuthenticationPreferences() {
        if (authenticationPreferences == null) {
            authenticationPreferences = new ArrayList<AuthenticationPreferenceVO>();
        }
        return this.authenticationPreferences;
    }

}
