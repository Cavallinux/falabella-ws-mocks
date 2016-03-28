
package com.falabella.ws.service.cliclienteconsolidado;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CliOfertasClienteMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CliOfertasClienteMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLI_CAPACIDAD_PAGO_MENSUAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CLI_CODIGO_OFERTA" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CLI_CODIGO_PROMOCION" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CLI_DESTINO" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CLI_DESTINO_PROMOCION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CLI_MONTO_CUOTAS" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CLI_MONTO_DOLARES" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CLI_NOMBRE_PROMOCION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CLI_OPERACION_CODIGO" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CLI_OPERACION_MONTO" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CLI_PRODUCTO_CODIGO" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CLI_PRODUCTO_NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CLI_SEGMENTO_CODIGO" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CLI_SOLICITUD_CODIGO" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CLI_SOLICITUD_DESCRIPCION_ESTADO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CLI_SOLICITUD_ESTADO" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CLI_SOLICITUD_FECHA_CREACION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CLI_SOLICITUD_FECHA_EXPIRACION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CLI_SOLICITUD_MONTO" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CLI_SUBPRODUCTO_CODIGO" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CLI_SUBPRODUCTO_NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CLI_SUB_PRODUCTO" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CliOfertasClienteMsg", propOrder = {
    "clicapacidadpagomensual",
    "clicodigooferta",
    "clicodigopromocion",
    "clidestino",
    "clidestinopromocion",
    "climontocuotas",
    "climontodolares",
    "clinombrepromocion",
    "clioperacioncodigo",
    "clioperacionmonto",
    "cliproductocodigo",
    "cliproductonombre",
    "clisegmentocodigo",
    "clisolicitudcodigo",
    "clisolicituddescripcionestado",
    "clisolicitudestado",
    "clisolicitudfechacreacion",
    "clisolicitudfechaexpiracion",
    "clisolicitudmonto",
    "clisubproductocodigo",
    "clisubproductonombre",
    "clisubproducto"
})
public class CliOfertasClienteMsg {

    @XmlElement(name = "CLI_CAPACIDAD_PAGO_MENSUAL", required = true, nillable = true)
    protected BigDecimal clicapacidadpagomensual;
    @XmlElement(name = "CLI_CODIGO_OFERTA")
    protected short clicodigooferta;
    @XmlElement(name = "CLI_CODIGO_PROMOCION")
    protected short clicodigopromocion;
    @XmlElement(name = "CLI_DESTINO")
    protected short clidestino;
    @XmlElement(name = "CLI_DESTINO_PROMOCION", required = true, nillable = true)
    protected String clidestinopromocion;
    @XmlElement(name = "CLI_MONTO_CUOTAS", required = true, nillable = true)
    protected BigDecimal climontocuotas;
    @XmlElement(name = "CLI_MONTO_DOLARES", required = true, nillable = true)
    protected BigDecimal climontodolares;
    @XmlElement(name = "CLI_NOMBRE_PROMOCION", required = true, nillable = true)
    protected String clinombrepromocion;
    @XmlElement(name = "CLI_OPERACION_CODIGO", required = true, nillable = true)
    protected BigDecimal clioperacioncodigo;
    @XmlElement(name = "CLI_OPERACION_MONTO", required = true, nillable = true)
    protected BigDecimal clioperacionmonto;
    @XmlElement(name = "CLI_PRODUCTO_CODIGO")
    protected short cliproductocodigo;
    @XmlElement(name = "CLI_PRODUCTO_NOMBRE", required = true, nillable = true)
    protected String cliproductonombre;
    @XmlElement(name = "CLI_SEGMENTO_CODIGO")
    protected short clisegmentocodigo;
    @XmlElement(name = "CLI_SOLICITUD_CODIGO")
    protected long clisolicitudcodigo;
    @XmlElement(name = "CLI_SOLICITUD_DESCRIPCION_ESTADO", required = true, nillable = true)
    protected String clisolicituddescripcionestado;
    @XmlElement(name = "CLI_SOLICITUD_ESTADO")
    protected short clisolicitudestado;
    @XmlElement(name = "CLI_SOLICITUD_FECHA_CREACION", required = true, nillable = true)
    protected String clisolicitudfechacreacion;
    @XmlElement(name = "CLI_SOLICITUD_FECHA_EXPIRACION", required = true, nillable = true)
    protected String clisolicitudfechaexpiracion;
    @XmlElement(name = "CLI_SOLICITUD_MONTO", required = true, nillable = true)
    protected BigDecimal clisolicitudmonto;
    @XmlElement(name = "CLI_SUBPRODUCTO_CODIGO")
    protected short clisubproductocodigo;
    @XmlElement(name = "CLI_SUBPRODUCTO_NOMBRE", required = true, nillable = true)
    protected String clisubproductonombre;
    @XmlElement(name = "CLI_SUB_PRODUCTO")
    protected short clisubproducto;

    /**
     * Gets the value of the clicapacidadpagomensual property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLICAPACIDADPAGOMENSUAL() {
        return clicapacidadpagomensual;
    }

    /**
     * Sets the value of the clicapacidadpagomensual property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLICAPACIDADPAGOMENSUAL(BigDecimal value) {
        this.clicapacidadpagomensual = value;
    }

    /**
     * Gets the value of the clicodigooferta property.
     * 
     */
    public short getCLICODIGOOFERTA() {
        return clicodigooferta;
    }

    /**
     * Sets the value of the clicodigooferta property.
     * 
     */
    public void setCLICODIGOOFERTA(short i) {
        this.clicodigooferta = i;
    }

    /**
     * Gets the value of the clicodigopromocion property.
     * 
     */
    public short getCLICODIGOPROMOCION() {
        return clicodigopromocion;
    }

    /**
     * Sets the value of the clicodigopromocion property.
     * 
     */
    public void setCLICODIGOPROMOCION(short value) {
        this.clicodigopromocion = value;
    }

    /**
     * Gets the value of the clidestino property.
     * 
     */
    public short getCLIDESTINO() {
        return clidestino;
    }

    /**
     * Sets the value of the clidestino property.
     * 
     */
    public void setCLIDESTINO(short value) {
        this.clidestino = value;
    }

    /**
     * Gets the value of the clidestinopromocion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIDESTINOPROMOCION() {
        return clidestinopromocion;
    }

    /**
     * Sets the value of the clidestinopromocion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIDESTINOPROMOCION(String value) {
        this.clidestinopromocion = value;
    }

    /**
     * Gets the value of the climontocuotas property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLIMONTOCUOTAS() {
        return climontocuotas;
    }

    /**
     * Sets the value of the climontocuotas property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLIMONTOCUOTAS(BigDecimal value) {
        this.climontocuotas = value;
    }

    /**
     * Gets the value of the climontodolares property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLIMONTODOLARES() {
        return climontodolares;
    }

    /**
     * Sets the value of the climontodolares property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLIMONTODOLARES(BigDecimal value) {
        this.climontodolares = value;
    }

    /**
     * Gets the value of the clinombrepromocion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLINOMBREPROMOCION() {
        return clinombrepromocion;
    }

    /**
     * Sets the value of the clinombrepromocion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLINOMBREPROMOCION(String value) {
        this.clinombrepromocion = value;
    }

    /**
     * Gets the value of the clioperacioncodigo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLIOPERACIONCODIGO() {
        return clioperacioncodigo;
    }

    /**
     * Sets the value of the clioperacioncodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLIOPERACIONCODIGO(BigDecimal value) {
        this.clioperacioncodigo = value;
    }

    /**
     * Gets the value of the clioperacionmonto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLIOPERACIONMONTO() {
        return clioperacionmonto;
    }

    /**
     * Sets the value of the clioperacionmonto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLIOPERACIONMONTO(BigDecimal value) {
        this.clioperacionmonto = value;
    }

    /**
     * Gets the value of the cliproductocodigo property.
     * 
     */
    public short getCLIPRODUCTOCODIGO() {
        return cliproductocodigo;
    }

    /**
     * Sets the value of the cliproductocodigo property.
     * 
     */
    public void setCLIPRODUCTOCODIGO(short value) {
        this.cliproductocodigo = value;
    }

    /**
     * Gets the value of the cliproductonombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIPRODUCTONOMBRE() {
        return cliproductonombre;
    }

    /**
     * Sets the value of the cliproductonombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIPRODUCTONOMBRE(String value) {
        this.cliproductonombre = value;
    }

    /**
     * Gets the value of the clisegmentocodigo property.
     * 
     */
    public short getCLISEGMENTOCODIGO() {
        return clisegmentocodigo;
    }

    /**
     * Sets the value of the clisegmentocodigo property.
     * 
     */
    public void setCLISEGMENTOCODIGO(short value) {
        this.clisegmentocodigo = value;
    }

    /**
     * Gets the value of the clisolicitudcodigo property.
     * 
     */
    public long getCLISOLICITUDCODIGO() {
        return clisolicitudcodigo;
    }

    /**
     * Sets the value of the clisolicitudcodigo property.
     * 
     */
    public void setCLISOLICITUDCODIGO(long value) {
        this.clisolicitudcodigo = value;
    }

    /**
     * Gets the value of the clisolicituddescripcionestado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLISOLICITUDDESCRIPCIONESTADO() {
        return clisolicituddescripcionestado;
    }

    /**
     * Sets the value of the clisolicituddescripcionestado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLISOLICITUDDESCRIPCIONESTADO(String value) {
        this.clisolicituddescripcionestado = value;
    }

    /**
     * Gets the value of the clisolicitudestado property.
     * 
     */
    public short getCLISOLICITUDESTADO() {
        return clisolicitudestado;
    }

    /**
     * Sets the value of the clisolicitudestado property.
     * 
     */
    public void setCLISOLICITUDESTADO(short value) {
        this.clisolicitudestado = value;
    }

    /**
     * Gets the value of the clisolicitudfechacreacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLISOLICITUDFECHACREACION() {
        return clisolicitudfechacreacion;
    }

    /**
     * Sets the value of the clisolicitudfechacreacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLISOLICITUDFECHACREACION(String value) {
        this.clisolicitudfechacreacion = value;
    }

    /**
     * Gets the value of the clisolicitudfechaexpiracion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLISOLICITUDFECHAEXPIRACION() {
        return clisolicitudfechaexpiracion;
    }

    /**
     * Sets the value of the clisolicitudfechaexpiracion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLISOLICITUDFECHAEXPIRACION(String value) {
        this.clisolicitudfechaexpiracion = value;
    }

    /**
     * Gets the value of the clisolicitudmonto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLISOLICITUDMONTO() {
        return clisolicitudmonto;
    }

    /**
     * Sets the value of the clisolicitudmonto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLISOLICITUDMONTO(BigDecimal value) {
        this.clisolicitudmonto = value;
    }

    /**
     * Gets the value of the clisubproductocodigo property.
     * 
     */
    public short getCLISUBPRODUCTOCODIGO() {
        return clisubproductocodigo;
    }

    /**
     * Sets the value of the clisubproductocodigo property.
     * 
     */
    public void setCLISUBPRODUCTOCODIGO(short value) {
        this.clisubproductocodigo = value;
    }

    /**
     * Gets the value of the clisubproductonombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLISUBPRODUCTONOMBRE() {
        return clisubproductonombre;
    }

    /**
     * Sets the value of the clisubproductonombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLISUBPRODUCTONOMBRE(String value) {
        this.clisubproductonombre = value;
    }

    /**
     * Gets the value of the clisubproducto property.
     * 
     */
    public short getCLISUBPRODUCTO() {
        return clisubproducto;
    }

    /**
     * Sets the value of the clisubproducto property.
     * 
     */
    public void setCLISUBPRODUCTO(short value) {
        this.clisubproducto = value;
    }

}
