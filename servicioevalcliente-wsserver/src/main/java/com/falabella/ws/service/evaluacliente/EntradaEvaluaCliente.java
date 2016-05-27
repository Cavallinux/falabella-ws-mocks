
package com.falabella.ws.service.evaluacliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para entradaEvaluaCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="entradaEvaluaCliente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CLI_PRODUCTO" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="CLI_ORIGEN_EVALUACION" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="CLI_RUT" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CLI_DIGVER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CLI_RTA_TIPO" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="CLI_RTA_MONTO" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="CLI_FECHANACIMIENTO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CLI_SEXOX" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="CLI_TIPO_EMPLEO" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="CLI_NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CLI_APELLIDOPATERNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CLI_APELLIDOMATERNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CANAL" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entradaEvaluaCliente", propOrder = {
    "cliproducto",
    "cliorigenevaluacion",
    "clirut",
    "clidigver",
    "clirtatipo",
    "clirtamonto",
    "clifechanacimiento",
    "clisexox",
    "clitipoempleo",
    "clinombre",
    "cliapellidopaterno",
    "cliapellidomaterno",
    "canal"
})
public class EntradaEvaluaCliente {

    @XmlElement(name = "CLI_PRODUCTO")
    protected short cliproducto;
    @XmlElement(name = "CLI_ORIGEN_EVALUACION")
    protected short cliorigenevaluacion;
    @XmlElement(name = "CLI_RUT")
    protected int clirut;
    @XmlElement(name = "CLI_DIGVER", required = true)
    protected String clidigver;
    @XmlElement(name = "CLI_RTA_TIPO")
    protected short clirtatipo;
    @XmlElement(name = "CLI_RTA_MONTO")
    protected double clirtamonto;
    @XmlElement(name = "CLI_FECHANACIMIENTO", required = true)
    protected String clifechanacimiento;
    @XmlElement(name = "CLI_SEXOX")
    protected short clisexox;
    @XmlElement(name = "CLI_TIPO_EMPLEO")
    protected short clitipoempleo;
    @XmlElement(name = "CLI_NOMBRE", required = true)
    protected String clinombre;
    @XmlElement(name = "CLI_APELLIDOPATERNO", required = true)
    protected String cliapellidopaterno;
    @XmlElement(name = "CLI_APELLIDOMATERNO", required = true)
    protected String cliapellidomaterno;
    @XmlElement(name = "CANAL")
    protected short canal;

    /**
     * Obtiene el valor de la propiedad cliproducto.
     * 
     */
    public short getCLIPRODUCTO() {
        return cliproducto;
    }

    /**
     * Define el valor de la propiedad cliproducto.
     * 
     */
    public void setCLIPRODUCTO(short value) {
        this.cliproducto = value;
    }

    /**
     * Obtiene el valor de la propiedad cliorigenevaluacion.
     * 
     */
    public short getCLIORIGENEVALUACION() {
        return cliorigenevaluacion;
    }

    /**
     * Define el valor de la propiedad cliorigenevaluacion.
     * 
     */
    public void setCLIORIGENEVALUACION(short value) {
        this.cliorigenevaluacion = value;
    }

    /**
     * Obtiene el valor de la propiedad clirut.
     * 
     */
    public int getCLIRUT() {
        return clirut;
    }

    /**
     * Define el valor de la propiedad clirut.
     * 
     */
    public void setCLIRUT(int value) {
        this.clirut = value;
    }

    /**
     * Obtiene el valor de la propiedad clidigver.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIDIGVER() {
        return clidigver;
    }

    /**
     * Define el valor de la propiedad clidigver.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIDIGVER(String value) {
        this.clidigver = value;
    }

    /**
     * Obtiene el valor de la propiedad clirtatipo.
     * 
     */
    public short getCLIRTATIPO() {
        return clirtatipo;
    }

    /**
     * Define el valor de la propiedad clirtatipo.
     * 
     */
    public void setCLIRTATIPO(short value) {
        this.clirtatipo = value;
    }

    /**
     * Obtiene el valor de la propiedad clirtamonto.
     * 
     */
    public double getCLIRTAMONTO() {
        return clirtamonto;
    }

    /**
     * Define el valor de la propiedad clirtamonto.
     * 
     */
    public void setCLIRTAMONTO(double value) {
        this.clirtamonto = value;
    }

    /**
     * Obtiene el valor de la propiedad clifechanacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIFECHANACIMIENTO() {
        return clifechanacimiento;
    }

    /**
     * Define el valor de la propiedad clifechanacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIFECHANACIMIENTO(String value) {
        this.clifechanacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad clisexox.
     * 
     */
    public short getCLISEXOX() {
        return clisexox;
    }

    /**
     * Define el valor de la propiedad clisexox.
     * 
     */
    public void setCLISEXOX(short value) {
        this.clisexox = value;
    }

    /**
     * Obtiene el valor de la propiedad clitipoempleo.
     * 
     */
    public short getCLITIPOEMPLEO() {
        return clitipoempleo;
    }

    /**
     * Define el valor de la propiedad clitipoempleo.
     * 
     */
    public void setCLITIPOEMPLEO(short value) {
        this.clitipoempleo = value;
    }

    /**
     * Obtiene el valor de la propiedad clinombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLINOMBRE() {
        return clinombre;
    }

    /**
     * Define el valor de la propiedad clinombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLINOMBRE(String value) {
        this.clinombre = value;
    }

    /**
     * Obtiene el valor de la propiedad cliapellidopaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIAPELLIDOPATERNO() {
        return cliapellidopaterno;
    }

    /**
     * Define el valor de la propiedad cliapellidopaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIAPELLIDOPATERNO(String value) {
        this.cliapellidopaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad cliapellidomaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIAPELLIDOMATERNO() {
        return cliapellidomaterno;
    }

    /**
     * Define el valor de la propiedad cliapellidomaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIAPELLIDOMATERNO(String value) {
        this.cliapellidomaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad canal.
     * 
     */
    public short getCANAL() {
        return canal;
    }

    /**
     * Define el valor de la propiedad canal.
     * 
     */
    public void setCANAL(short value) {
        this.canal = value;
    }

}
