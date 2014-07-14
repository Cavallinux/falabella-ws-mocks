
package com.falabella.mdwcorp.osb.schema.cmr.corp.cliente.validaclave.resp_v2012;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidarClaveResponse_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidarClaveResponse_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operacionStatus">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigoStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="glosaStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="nivelDeSeguridad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sistemaResolutor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidarClaveResponse_TYPE", propOrder = {
    "operacionStatus",
    "nivelDeSeguridad",
    "sistemaResolutor"
})
public class ValidarClaveResponseTYPE {

    @XmlElement(required = true)
    protected ValidarClaveResponseTYPE.OperacionStatus operacionStatus;
    @XmlElement(required = true)
    protected String nivelDeSeguridad;
    @XmlElement(required = true)
    protected String sistemaResolutor;

    /**
     * Gets the value of the operacionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ValidarClaveResponseTYPE.OperacionStatus }
     *     
     */
    public ValidarClaveResponseTYPE.OperacionStatus getOperacionStatus() {
        return operacionStatus;
    }

    /**
     * Sets the value of the operacionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidarClaveResponseTYPE.OperacionStatus }
     *     
     */
    public void setOperacionStatus(ValidarClaveResponseTYPE.OperacionStatus value) {
        this.operacionStatus = value;
    }

    /**
     * Gets the value of the nivelDeSeguridad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelDeSeguridad() {
        return nivelDeSeguridad;
    }

    /**
     * Sets the value of the nivelDeSeguridad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelDeSeguridad(String value) {
        this.nivelDeSeguridad = value;
    }

    /**
     * Gets the value of the sistemaResolutor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemaResolutor() {
        return sistemaResolutor;
    }

    /**
     * Sets the value of the sistemaResolutor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaResolutor(String value) {
        this.sistemaResolutor = value;
    }


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
     *         &lt;element name="codigoStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="glosaStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "codigoStatus",
        "glosaStatus"
    })
    public static class OperacionStatus {

        @XmlElement(required = true)
        protected String codigoStatus;
        @XmlElement(required = true)
        protected String glosaStatus;

        /**
         * Gets the value of the codigoStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoStatus() {
            return codigoStatus;
        }

        /**
         * Sets the value of the codigoStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoStatus(String value) {
            this.codigoStatus = value;
        }

        /**
         * Gets the value of the glosaStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGlosaStatus() {
            return glosaStatus;
        }

        /**
         * Sets the value of the glosaStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGlosaStatus(String value) {
            this.glosaStatus = value;
        }

    }

}
