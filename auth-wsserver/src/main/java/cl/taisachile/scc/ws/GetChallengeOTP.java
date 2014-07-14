
package cl.taisachile.scc.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getChallengeOTP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getChallengeOTP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getChallengeParamOTP" type="{http://ws.scc.taisachile.cl/}getChallengeOTPParamVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getChallengeOTP", propOrder = {
    "getChallengeParamOTP"
})
public class GetChallengeOTP {

    protected GetChallengeOTPParamVO getChallengeParamOTP;

    /**
     * Gets the value of the getChallengeParamOTP property.
     * 
     * @return
     *     possible object is
     *     {@link GetChallengeOTPParamVO }
     *     
     */
    public GetChallengeOTPParamVO getGetChallengeParamOTP() {
        return getChallengeParamOTP;
    }

    /**
     * Sets the value of the getChallengeParamOTP property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetChallengeOTPParamVO }
     *     
     */
    public void setGetChallengeParamOTP(GetChallengeOTPParamVO value) {
        this.getChallengeParamOTP = value;
    }

}
