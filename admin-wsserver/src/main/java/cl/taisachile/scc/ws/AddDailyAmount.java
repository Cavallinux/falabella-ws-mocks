
package cl.taisachile.scc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addDailyAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addDailyAmount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addDailyAmountParam" type="{http://ws.scc.taisachile.cl/}addDailyAmountParamVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addDailyAmount", propOrder = {
    "addDailyAmountParam"
})
public class AddDailyAmount {

    protected AddDailyAmountParamVO addDailyAmountParam;

    /**
     * Gets the value of the addDailyAmountParam property.
     * 
     * @return
     *     possible object is
     *     {@link AddDailyAmountParamVO }
     *     
     */
    public AddDailyAmountParamVO getAddDailyAmountParam() {
        return addDailyAmountParam;
    }

    /**
     * Sets the value of the addDailyAmountParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddDailyAmountParamVO }
     *     
     */
    public void setAddDailyAmountParam(AddDailyAmountParamVO value) {
        this.addDailyAmountParam = value;
    }

}
