
package com.falabella.ws.service.cliclienteconsolidado;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="CLI_CLIENTE_RUT" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CLI_INCLUYE_TODAS_LAS_OFERTAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLI_INCLUYE_OFERTA_MANTENCION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLI_INCLUYE_LCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLI_INCLUYE_LCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLI_INCLUYE_CRC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLI_INCLUYE_RDD_CONSOLIDACION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLI_INCLUYE_APERTURA_LCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLI_INCLUYE_TCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cliclienterut",
    "cliincluyetodaslasofertas",
    "cliincluyeofertamantencion",
    "cliincluyelcc",
    "cliincluyelcd",
    "cliincluyecrc",
    "cliincluyerddconsolidacion",
    "cliincluyeaperturalcc",
    "cliincluyetcr"
})
@XmlRootElement(name = "CliOfertasCliente", namespace = "http://cl/bancofalabella/ebanking/service")
public class CliOfertasCliente {

    @XmlElement(name = "CLI_CLIENTE_RUT", namespace = "http://cl/bancofalabella/ebanking/service")
    protected long cliclienterut;
    @XmlElementRef(name = "CLI_INCLUYE_TODAS_LAS_OFERTAS", namespace = "http://cl/bancofalabella/ebanking/service", type = JAXBElement.class)
    protected JAXBElement<String> cliincluyetodaslasofertas;
    @XmlElementRef(name = "CLI_INCLUYE_OFERTA_MANTENCION", namespace = "http://cl/bancofalabella/ebanking/service", type = JAXBElement.class)
    protected JAXBElement<String> cliincluyeofertamantencion;
    @XmlElementRef(name = "CLI_INCLUYE_LCC", namespace = "http://cl/bancofalabella/ebanking/service", type = JAXBElement.class)
    protected JAXBElement<String> cliincluyelcc;
    @XmlElementRef(name = "CLI_INCLUYE_LCD", namespace = "http://cl/bancofalabella/ebanking/service", type = JAXBElement.class)
    protected JAXBElement<String> cliincluyelcd;
    @XmlElementRef(name = "CLI_INCLUYE_CRC", namespace = "http://cl/bancofalabella/ebanking/service", type = JAXBElement.class)
    protected JAXBElement<String> cliincluyecrc;
    @XmlElementRef(name = "CLI_INCLUYE_RDD_CONSOLIDACION", namespace = "http://cl/bancofalabella/ebanking/service", type = JAXBElement.class)
    protected JAXBElement<String> cliincluyerddconsolidacion;
    @XmlElementRef(name = "CLI_INCLUYE_APERTURA_LCC", namespace = "http://cl/bancofalabella/ebanking/service", type = JAXBElement.class)
    protected JAXBElement<String> cliincluyeaperturalcc;
    @XmlElementRef(name = "CLI_INCLUYE_TCR", namespace = "http://cl/bancofalabella/ebanking/service", type = JAXBElement.class)
    protected JAXBElement<String> cliincluyetcr;

    /**
     * Gets the value of the cliclienterut property.
     * 
     */
    public long getCLICLIENTERUT() {
        return cliclienterut;
    }

    /**
     * Sets the value of the cliclienterut property.
     * 
     */
    public void setCLICLIENTERUT(long value) {
        this.cliclienterut = value;
    }

    /**
     * Gets the value of the cliincluyetodaslasofertas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLIINCLUYETODASLASOFERTAS() {
        return cliincluyetodaslasofertas;
    }

    /**
     * Sets the value of the cliincluyetodaslasofertas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLIINCLUYETODASLASOFERTAS(JAXBElement<String> value) {
        this.cliincluyetodaslasofertas = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cliincluyeofertamantencion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLIINCLUYEOFERTAMANTENCION() {
        return cliincluyeofertamantencion;
    }

    /**
     * Sets the value of the cliincluyeofertamantencion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLIINCLUYEOFERTAMANTENCION(JAXBElement<String> value) {
        this.cliincluyeofertamantencion = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cliincluyelcc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLIINCLUYELCC() {
        return cliincluyelcc;
    }

    /**
     * Sets the value of the cliincluyelcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLIINCLUYELCC(JAXBElement<String> value) {
        this.cliincluyelcc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cliincluyelcd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLIINCLUYELCD() {
        return cliincluyelcd;
    }

    /**
     * Sets the value of the cliincluyelcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLIINCLUYELCD(JAXBElement<String> value) {
        this.cliincluyelcd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cliincluyecrc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLIINCLUYECRC() {
        return cliincluyecrc;
    }

    /**
     * Sets the value of the cliincluyecrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLIINCLUYECRC(JAXBElement<String> value) {
        this.cliincluyecrc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cliincluyerddconsolidacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLIINCLUYERDDCONSOLIDACION() {
        return cliincluyerddconsolidacion;
    }

    /**
     * Sets the value of the cliincluyerddconsolidacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLIINCLUYERDDCONSOLIDACION(JAXBElement<String> value) {
        this.cliincluyerddconsolidacion = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cliincluyeaperturalcc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLIINCLUYEAPERTURALCC() {
        return cliincluyeaperturalcc;
    }

    /**
     * Sets the value of the cliincluyeaperturalcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLIINCLUYEAPERTURALCC(JAXBElement<String> value) {
        this.cliincluyeaperturalcc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cliincluyetcr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLIINCLUYETCR() {
        return cliincluyetcr;
    }

    /**
     * Sets the value of the cliincluyetcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLIINCLUYETCR(JAXBElement<String> value) {
        this.cliincluyetcr = ((JAXBElement<String> ) value);
    }

}
