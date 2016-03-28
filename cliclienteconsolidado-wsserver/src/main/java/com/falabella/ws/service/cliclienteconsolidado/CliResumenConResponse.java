
package com.falabella.ws.service.cliclienteconsolidado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{java:cl.bancofalabella.ebanking.message.cliClienteConsolidado}ArrayOfCliResumenConMsg_literal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "_return"
})
@XmlRootElement(name = "CliResumenConResponse", namespace = "http://cl/bancofalabella/ebanking/service")
public class CliResumenConResponse {

    @XmlElement(name = "return", namespace = "http://cl/bancofalabella/ebanking/service", required = true)
    protected ArrayOfCliResumenConMsgLiteral _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCliResumenConMsgLiteral }
     *     
     */
    public ArrayOfCliResumenConMsgLiteral getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCliResumenConMsgLiteral }
     *     
     */
    public void setReturn(ArrayOfCliResumenConMsgLiteral value) {
        this._return = value;
    }

}
