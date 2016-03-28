
package com.falabella.ws.service.cliclienteconsolidado;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCliOfertasClienteMsg_literal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCliOfertasClienteMsg_literal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CliOfertasClienteMsg" type="{java:cl.bancofalabella.ebanking.message.cliClienteConsolidado}CliOfertasClienteMsg" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCliOfertasClienteMsg_literal", propOrder = {
    "cliOfertasClienteMsg"
})
public class ArrayOfCliOfertasClienteMsgLiteral {

    @XmlElement(name = "CliOfertasClienteMsg", nillable = true)
    protected List<CliOfertasClienteMsg> cliOfertasClienteMsg;

    /**
     * Gets the value of the cliOfertasClienteMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cliOfertasClienteMsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCliOfertasClienteMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CliOfertasClienteMsg }
     * 
     * 
     */
    public List<CliOfertasClienteMsg> getCliOfertasClienteMsg() {
        if (cliOfertasClienteMsg == null) {
            cliOfertasClienteMsg = new ArrayList<CliOfertasClienteMsg>();
        }
        return this.cliOfertasClienteMsg;
    }

}
