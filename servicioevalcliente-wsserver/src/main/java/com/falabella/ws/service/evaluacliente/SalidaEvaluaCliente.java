
package com.falabella.ws.service.evaluacliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para salidaEvaluaCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="salidaEvaluaCliente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RESPUESTA" type="{http://control.evaluacionEnlinea.ws.bancofalabella.cl/}respEvaluaCliente"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salidaEvaluaCliente", propOrder = {
    "respuesta"
})
public class SalidaEvaluaCliente {

    @XmlElement(name = "RESPUESTA", required = true)
    protected RespEvaluaCliente respuesta;

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     * @return
     *     possible object is
     *     {@link RespEvaluaCliente }
     *     
     */
    public RespEvaluaCliente getRESPUESTA() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link RespEvaluaCliente }
     *     
     */
    public void setRESPUESTA(RespEvaluaCliente value) {
        this.respuesta = value;
    }

}
