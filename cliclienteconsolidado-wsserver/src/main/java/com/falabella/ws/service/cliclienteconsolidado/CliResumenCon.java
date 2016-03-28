
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
 *         &lt;element name="CLI_CLIENTE_RUT" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "cliclienterut"
})
@XmlRootElement(name = "CliResumenCon", namespace = "http://cl/bancofalabella/ebanking/service")
public class CliResumenCon {

    @XmlElement(name = "CLI_CLIENTE_RUT", namespace = "http://cl/bancofalabella/ebanking/service")
    protected long cliclienterut;

    /**
     * Gets the value of the cliclienterut property.
     * 
     */
    public long getCLICLIENTERUT() {
        return cliclienterut;
    }

    /**
     * Sets the value of the cliclienterut property.
     * 
     */
    public void setCLICLIENTERUT(long value) {
        this.cliclienterut = value;
    }

}
