
package cl.taisachile.scc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getChallengeOTPCorp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getChallengeOTPCorp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getChallengeParamOTPCorp" type="{http://ws.scc.taisachile.cl/}getChallengeOTPParamVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getChallengeOTPCorp", propOrder = {
    "getChallengeParamOTPCorp"
})
public class GetChallengeOTPCorp {

    protected GetChallengeOTPParamVO getChallengeParamOTPCorp;

    /**
     * Gets the value of the getChallengeParamOTPCorp property.
     * 
     * @return
     *     possible object is
     *     {@link GetChallengeOTPParamVO }
     *     
     */
    public GetChallengeOTPParamVO getGetChallengeParamOTPCorp() {
        return getChallengeParamOTPCorp;
    }

    /**
     * Sets the value of the getChallengeParamOTPCorp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetChallengeOTPParamVO }
     *     
     */
    public void setGetChallengeParamOTPCorp(GetChallengeOTPParamVO value) {
        this.getChallengeParamOTPCorp = value;
    }

}
