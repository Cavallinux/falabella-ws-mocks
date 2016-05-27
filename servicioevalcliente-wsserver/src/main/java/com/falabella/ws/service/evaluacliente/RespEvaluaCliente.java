
package com.falabella.ws.service.evaluacliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respEvaluaCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respEvaluaCliente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODIGO" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MENSAJE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CLIENTE_BANCO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SEMAFORO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RECHAZOS" type="{http://control.evaluacionEnlinea.ws.bancofalabella.cl/}listaRechazos"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respEvaluaCliente", propOrder = {
    "codigo",
    "mensaje",
    "clientebanco",
    "semaforo",
    "rechazos"
})
public class RespEvaluaCliente {

    @XmlElement(name = "CODIGO")
    protected int codigo;
    @XmlElement(name = "MENSAJE", required = true)
    protected String mensaje;
    @XmlElement(name = "CLIENTE_BANCO", required = true)
    protected String clientebanco;
    @XmlElement(name = "SEMAFORO", required = true)
    protected String semaforo;
    @XmlElement(name = "RECHAZOS", required = true)
    protected ListaRechazos rechazos;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     */
    public int getCODIGO() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     */
    public void setCODIGO(int value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMENSAJE() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMENSAJE(String value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad clientebanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIENTEBANCO() {
        return clientebanco;
    }

    /**
     * Define el valor de la propiedad clientebanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIENTEBANCO(String value) {
        this.clientebanco = value;
    }

    /**
     * Obtiene el valor de la propiedad semaforo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEMAFORO() {
        return semaforo;
    }

    /**
     * Define el valor de la propiedad semaforo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEMAFORO(String value) {
        this.semaforo = value;
    }

    /**
     * Obtiene el valor de la propiedad rechazos.
     * 
     * @return
     *     possible object is
     *     {@link ListaRechazos }
     *     
     */
    public ListaRechazos getRECHAZOS() {
        return rechazos;
    }

    /**
     * Define el valor de la propiedad rechazos.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaRechazos }
     *     
     */
    public void setRECHAZOS(ListaRechazos value) {
        this.rechazos = value;
    }

}
