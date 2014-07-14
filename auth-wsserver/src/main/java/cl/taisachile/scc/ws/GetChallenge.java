
package cl.taisachile.scc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getChallenge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getChallenge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getChallengeParam" type="{http://ws.scc.taisachile.cl/}getChallengeParamVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getChallenge", propOrder = {
    "getChallengeParam"
})
public class GetChallenge {

    protected GetChallengeParamVO getChallengeParam;

    /**
     * Gets the value of the getChallengeParam property.
     * 
     * @return
     *     possible object is
     *     {@link GetChallengeParamVO }
     *     
     */
    public GetChallengeParamVO getGetChallengeParam() {
        return getChallengeParam;
    }

    /**
     * Sets the value of the getChallengeParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetChallengeParamVO }
     *     
     */
    public void setGetChallengeParam(GetChallengeParamVO value) {
        this.getChallengeParam = value;
    }

}
