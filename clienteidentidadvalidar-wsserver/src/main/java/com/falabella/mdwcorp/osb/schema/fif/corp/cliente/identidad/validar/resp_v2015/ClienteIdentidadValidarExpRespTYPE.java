
package com.falabella.mdwcorp.osb.schema.fif.corp.cliente.identidad.validar.resp_v2015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clienteIdentidadValidarExpResp_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clienteIdentidadValidarExpResp_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="respuesta" type="{http://mdwcorp.falabella.com/OSB/schema/FIF/CORP/cliente/identidad/validar/Resp-v2015.08}respuesta_TYPE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clienteIdentidadValidarExpResp_TYPE", propOrder = {
    "respuesta"
})
public class ClienteIdentidadValidarExpRespTYPE {

    @XmlElement(required = true)
    protected RespuestaTYPE respuesta;

    /**
     * Gets the value of the respuesta property.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaTYPE }
     *     
     */
    public RespuestaTYPE getRespuesta() {
        return respuesta;
    }

    /**
     * Sets the value of the respuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaTYPE }
     *     
     */
    public void setRespuesta(RespuestaTYPE value) {
        this.respuesta = value;
    }

}
