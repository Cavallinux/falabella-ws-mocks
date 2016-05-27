
package com.falabella.ws.service.evaluacliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rechazo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rechazo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODIGO" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="DESCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PONDERACION" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="ROJO_INMEDIATO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechazo", propOrder = {
    "codigo",
    "descripcion",
    "ponderacion",
    "rojoinmediato"
})
public class Rechazo {

    @XmlElement(name = "CODIGO")
    protected short codigo;
    @XmlElement(name = "DESCRIPCION", required = true)
    protected String descripcion;
    @XmlElement(name = "PONDERACION")
    protected short ponderacion;
    @XmlElement(name = "ROJO_INMEDIATO", required = true)
    protected String rojoinmediato;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     */
    public short getCODIGO() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     */
    public void setCODIGO(short value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPCION() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPCION(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad ponderacion.
     * 
     */
    public short getPONDERACION() {
        return ponderacion;
    }

    /**
     * Define el valor de la propiedad ponderacion.
     * 
     */
    public void setPONDERACION(short value) {
        this.ponderacion = value;
    }

    /**
     * Obtiene el valor de la propiedad rojoinmediato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROJOINMEDIATO() {
        return rojoinmediato;
    }

    /**
     * Define el valor de la propiedad rojoinmediato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROJOINMEDIATO(String value) {
        this.rojoinmediato = value;
    }

}
