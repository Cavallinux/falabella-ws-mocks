
package cl.taisachile.scc.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAvailableDeviceTypesResponseVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAvailableDeviceTypesResponseVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.scc.taisachile.cl/}abstractResponseVO">
 *       &lt;sequence>
 *         &lt;element name="availableDeviceTypes" type="{http://ws.scc.taisachile.cl/}deviceTypeVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableDeviceTypesResponseVO", propOrder = {
    "availableDeviceTypes"
})
public class GetAvailableDeviceTypesResponseVO
    extends AbstractResponseVO
{

    @XmlElement(nillable = true)
    protected List<DeviceTypeVO> availableDeviceTypes;

    /**
     * Gets the value of the availableDeviceTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableDeviceTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableDeviceTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceTypeVO }
     * 
     * 
     */
    public List<DeviceTypeVO> getAvailableDeviceTypes() {
        if (availableDeviceTypes == null) {
            availableDeviceTypes = new ArrayList<DeviceTypeVO>();
        }
        return this.availableDeviceTypes;
    }

}
