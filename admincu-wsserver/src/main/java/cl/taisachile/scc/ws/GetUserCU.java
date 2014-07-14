
package cl.taisachile.scc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserCU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserCU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="params" type="{http://ws.scc.taisachile.cl/}getUserCUParamVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserCU", propOrder = {
    "params"
})
public class GetUserCU {

    protected GetUserCUParamVO params;

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link GetUserCUParamVO }
     *     
     */
    public GetUserCUParamVO getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserCUParamVO }
     *     
     */
    public void setParams(GetUserCUParamVO value) {
        this.params = value;
    }

}
