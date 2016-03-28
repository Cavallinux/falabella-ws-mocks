
package com.falabella.ws.service.cliclienteconsolidado;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCliResumenConMsg_literal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCliResumenConMsg_literal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CliResumenConMsg" type="{java:cl.bancofalabella.ebanking.message.cliClienteConsolidado}CliResumenConMsg" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCliResumenConMsg_literal", propOrder = {
    "cliResumenConMsg"
})
public class ArrayOfCliResumenConMsgLiteral {

    @XmlElement(name = "CliResumenConMsg", nillable = true)
    protected List<CliResumenConMsg> cliResumenConMsg;

    /**
     * Gets the value of the cliResumenConMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cliResumenConMsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCliResumenConMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CliResumenConMsg }
     * 
     * 
     */
    public List<CliResumenConMsg> getCliResumenConMsg() {
        if (cliResumenConMsg == null) {
            cliResumenConMsg = new ArrayList<CliResumenConMsg>();
        }
        return this.cliResumenConMsg;
    }

}
