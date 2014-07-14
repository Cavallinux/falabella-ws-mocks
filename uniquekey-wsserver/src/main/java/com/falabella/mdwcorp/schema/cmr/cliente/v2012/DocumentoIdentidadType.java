
package com.falabella.mdwcorp.schema.cmr.cliente.v2012;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentoIdentidad_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentoIdentidad_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6}tipoDocumentoIdentidad"/>
 *         &lt;element ref="{http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6}numeroDocumentoIdentidad"/>
 *         &lt;element ref="{http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6}verificadorDocumentoIdentidad" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentoIdentidad_Type", propOrder = {
    "tipoDocumentoIdentidad",
    "numeroDocumentoIdentidad",
    "verificadorDocumentoIdentidad"
})
public class DocumentoIdentidadType {

    @XmlElement(required = true)
    protected TipoDocumentoIdentidadTYPE tipoDocumentoIdentidad;
    @XmlElement(required = true)
    protected String numeroDocumentoIdentidad;
    protected String verificadorDocumentoIdentidad;

    /**
     * Gets the value of the tipoDocumentoIdentidad property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoIdentidadTYPE }
     *     
     */
    public TipoDocumentoIdentidadTYPE getTipoDocumentoIdentidad() {
        return tipoDocumentoIdentidad;
    }

    /**
     * Sets the value of the tipoDocumentoIdentidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoIdentidadTYPE }
     *     
     */
    public void setTipoDocumentoIdentidad(TipoDocumentoIdentidadTYPE value) {
        this.tipoDocumentoIdentidad = value;
    }

    /**
     * Gets the value of the numeroDocumentoIdentidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumentoIdentidad() {
        return numeroDocumentoIdentidad;
    }

    /**
     * Sets the value of the numeroDocumentoIdentidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumentoIdentidad(String value) {
        this.numeroDocumentoIdentidad = value;
    }

    /**
     * Gets the value of the verificadorDocumentoIdentidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificadorDocumentoIdentidad() {
        return verificadorDocumentoIdentidad;
    }

    /**
     * Sets the value of the verificadorDocumentoIdentidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificadorDocumentoIdentidad(String value) {
        this.verificadorDocumentoIdentidad = value;
    }

}
