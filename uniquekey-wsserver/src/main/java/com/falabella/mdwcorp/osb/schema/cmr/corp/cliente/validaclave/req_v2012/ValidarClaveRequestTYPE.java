
package com.falabella.mdwcorp.osb.schema.cmr.corp.cliente.validaclave.req_v2012;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.falabella.mdwcorp.schema.cmr.cliente.v2012.DocumentoIdentidadType;


/**
 * <p>Java class for ValidarClaveRequest_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidarClaveRequest_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6}documentoIdentidad"/>
 *           &lt;element ref="{http://mdwcorp.falabella.com/schema/CMR/tarjeta/v2012.6}PAN"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://mdwcorp.falabella.com/schema/CMR/clave/v2012.6}clave"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidarClaveRequest_TYPE", propOrder = {
    "documentoIdentidad",
    "pan",
    "clave"
})
public class ValidarClaveRequestTYPE {

    @XmlElement(namespace = "http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6")
    protected DocumentoIdentidadType documentoIdentidad;
    @XmlElement(name = "PAN", namespace = "http://mdwcorp.falabella.com/schema/CMR/tarjeta/v2012.6")
    protected String pan;
    @XmlElement(namespace = "http://mdwcorp.falabella.com/schema/CMR/clave/v2012.6", required = true)
    protected String clave;

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
     * Gets the value of the clave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Sets the value of the clave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

}
