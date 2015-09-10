
package com.falabella.mdwcorp.osb.schema.fif.corp.cliente.identidad.validar.req_v2015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clienteIdentidadValidarExpReq_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clienteIdentidadValidarExpReq_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cliente" type="{http://mdwcorp.falabella.com/OSB/schema/FIF/CORP/cliente/identidad/validar/Req-v2015.08}cliente_TYPE"/>
 *         &lt;element name="datosTransaccion" type="{http://mdwcorp.falabella.com/OSB/schema/FIF/CORP/cliente/identidad/validar/Req-v2015.08}datosTransaccion_TYPE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clienteIdentidadValidarExpReq_TYPE", propOrder = {
    "cliente",
    "datosTransaccion"
})
public class ClienteIdentidadValidarExpReqTYPE {

    @XmlElement(required = true)
    protected ClienteTYPE cliente;
    protected DatosTransaccionTYPE datosTransaccion;

    /**
     * Gets the value of the cliente property.
     * 
     * @return
     *     possible object is
     *     {@link ClienteTYPE }
     *     
     */
    public ClienteTYPE getCliente() {
        return cliente;
    }

    /**
     * Sets the value of the cliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClienteTYPE }
     *     
     */
    public void setCliente(ClienteTYPE value) {
        this.cliente = value;
    }

    /**
     * Gets the value of the datosTransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link DatosTransaccionTYPE }
     *     
     */
    public DatosTransaccionTYPE getDatosTransaccion() {
        return datosTransaccion;
    }

    /**
     * Sets the value of the datosTransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosTransaccionTYPE }
     *     
     */
    public void setDatosTransaccion(DatosTransaccionTYPE value) {
        this.datosTransaccion = value;
    }

}
