
package com.falabella.mdwcorp.osb.schema.cmr.corp.tarjeta.consultaridclientepan.resp_v2012;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.falabella.mdwcorp.schema.cmr.cliente.v2012.DocumentoIdentidadType;


/**
 * <p>Java class for consultarIDClientePANResponse_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarIDClientePANResponse_TYPE">
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
 *         &lt;element ref="{http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6}documentoIdentidad" minOccurs="0"/>
 *         &lt;element ref="{http://mdwcorp.falabella.com/schema/CMR/tarjeta/v2012.6}PAN"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarIDClientePANResponse_TYPE", propOrder = {
    "operacionStatus",
    "documentoIdentidad",
    "pan"
})
public class ConsultarIDClientePANResponseTYPE {

    @XmlElement(required = true)
    protected ConsultarIDClientePANResponseTYPE.OperacionStatus operacionStatus;
    @XmlElement(namespace = "http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6")
    protected DocumentoIdentidadType documentoIdentidad;
    @XmlElement(name = "PAN", namespace = "http://mdwcorp.falabella.com/schema/CMR/tarjeta/v2012.6", required = true)
    protected String pan;

    /**
     * Gets the value of the operacionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarIDClientePANResponseTYPE.OperacionStatus }
     *     
     */
    public ConsultarIDClientePANResponseTYPE.OperacionStatus getOperacionStatus() {
        return operacionStatus;
    }

    /**
     * Sets the value of the operacionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarIDClientePANResponseTYPE.OperacionStatus }
     *     
     */
    public void setOperacionStatus(ConsultarIDClientePANResponseTYPE.OperacionStatus value) {
        this.operacionStatus = value;
    }

    /**
     * Gets the value of the documentoIdentidad property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoIdentidadType }
     *     
     */
    public DocumentoIdentidadType getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    /**
     * Sets the value of the documentoIdentidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoIdentidadType }
     *     
     */
    public void setDocumentoIdentidad(DocumentoIdentidadType value) {
        this.documentoIdentidad = value;
    }

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAN() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAN(String value) {
        this.pan = value;
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
