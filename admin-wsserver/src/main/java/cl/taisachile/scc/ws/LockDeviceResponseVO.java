
package cl.taisachile.scc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lockDeviceResponseVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lockDeviceResponseVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.scc.taisachile.cl/}abstractResponseVO">
 *       &lt;sequence>
 *         &lt;element name="correlative" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lockDeviceResponseVO", propOrder = {
    "correlative"
})
public class LockDeviceResponseVO
    extends AbstractResponseVO
{

    protected long correlative;

    /**
     * Gets the value of the correlative property.
     * 
     */
    public long getCorrelative() {
        return correlative;
    }

    /**
     * Sets the value of the correlative property.
     * 
     */
    public void setCorrelative(long value) {
        this.correlative = value;
    }

}
