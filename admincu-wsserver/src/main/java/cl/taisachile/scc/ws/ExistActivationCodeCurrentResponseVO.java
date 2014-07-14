
package cl.taisachile.scc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for existActivationCodeCurrentResponseVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="existActivationCodeCurrentResponseVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.scc.taisachile.cl/}abstractResponseVO">
 *       &lt;sequence>
 *         &lt;element name="exist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "existActivationCodeCurrentResponseVO", propOrder = {
    "exist"
})
public class ExistActivationCodeCurrentResponseVO
    extends AbstractResponseVO
{

    protected boolean exist;

    /**
     * Gets the value of the exist property.
     * 
     */
    public boolean isExist() {
        return exist;
    }

    /**
     * Sets the value of the exist property.
     * 
     */
    public void setExist(boolean value) {
        this.exist = value;
    }

}
