
package cl.taisachile.scc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createSoftTokenParamVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createSoftTokenParamVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.scc.taisachile.cl/}abstractParamVO">
 *       &lt;sequence>
 *         &lt;element name="cellID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createSoftTokenParamVO", propOrder = {
    "cellID",
    "emailClient"
})
public class CreateSoftTokenParamVO
    extends AbstractParamVO
{

    protected String cellID;
    protected String emailClient;

    /**
     * Gets the value of the cellID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellID() {
        return cellID;
    }

    /**
     * Sets the value of the cellID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellID(String value) {
        this.cellID = value;
    }

    /**
     * Gets the value of the emailClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailClient() {
        return emailClient;
    }

    /**
     * Sets the value of the emailClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailClient(String value) {
        this.emailClient = value;
    }

}
