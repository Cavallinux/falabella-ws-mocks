
package com.falabella.ws.service.aumentocupo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for aplicarAumentoCupoTC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aplicarAumentoCupoTC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rut" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numeroTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sucursal" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cupoOtorgado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cupoActual" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="flagDolar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aplicarAumentoCupoTC", propOrder = {
    "rut",
    "numeroTarjeta",
    "sucursal",
    "usuario",
    "cupoOtorgado",
    "cupoActual",
    "flagDolar"
})
public class AplicarAumentoCupoTC {

    protected Integer rut;
    protected String numeroTarjeta;
    protected Short sucursal;
    protected Integer usuario;
    protected Double cupoOtorgado;
    protected Double cupoActual;
    protected String flagDolar;

    /**
     * Gets the value of the rut property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRut() {
        return rut;
    }

    /**
     * Sets the value of the rut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRut(Integer value) {
        this.rut = value;
    }

    /**
     * Gets the value of the numeroTarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Sets the value of the numeroTarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTarjeta(String value) {
        this.numeroTarjeta = value;
    }

    /**
     * Gets the value of the sucursal property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSucursal() {
        return sucursal;
    }

    /**
     * Sets the value of the sucursal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSucursal(Short value) {
        this.sucursal = value;
    }

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsuario(Integer value) {
        this.usuario = value;
    }

    /**
     * Gets the value of the cupoOtorgado property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCupoOtorgado() {
        return cupoOtorgado;
    }

    /**
     * Sets the value of the cupoOtorgado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCupoOtorgado(Double value) {
        this.cupoOtorgado = value;
    }

    /**
     * Gets the value of the cupoActual property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCupoActual() {
        return cupoActual;
    }

    /**
     * Sets the value of the cupoActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCupoActual(Double value) {
        this.cupoActual = value;
    }

    /**
     * Gets the value of the flagDolar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagDolar() {
        return flagDolar;
    }

    /**
     * Sets the value of the flagDolar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagDolar(String value) {
        this.flagDolar = value;
    }

}
