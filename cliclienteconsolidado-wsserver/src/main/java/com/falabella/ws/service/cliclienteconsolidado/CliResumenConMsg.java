
package com.falabella.ws.service.cliclienteconsolidado;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CliResumenConMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CliResumenConMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLI_CODIGO_MONEDA" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CLI_CODIGO_PARIDAD" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CLI_CUOTAS_TOTALES" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CLI_CUOTA_A_PAGAR" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CLI_CUPO_AUTORIZADO" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CLI_CUPO_AUTORIZADO_1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CLI_CUPO_AUTORIZADO_2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CLI_CUPO_AUTORIZADO_3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CLI_CUPO_UTILIZADO_1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CLI_CUPO_UTILIZADO_2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CLI_CUPO_UTILIZADO_3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CLI_DEUDA_UTILIZADA" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CLI_DISPONIBLE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CLI_DISPONIBLE_1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CLI_DISPONIBLE_2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CLI_DISPONIBLE_3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CLI_FECHA_VENCIMIENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CLI_FECHA_VENCIMIENTO_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CLI_MONTO_INVERSION" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CLI_OPERACION_CODIGO" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CLI_PRODUCTO_CODIGO" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CLI_SALDO_CONTABLE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CLI_SALDO_DISPONIBLE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CLI_SUBPRODUCTO_CODIGO" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CLI_SUBPRODUCTO_NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CLI_TIPO" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CLI_VALOR_CUOTA" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CliResumenConMsg", propOrder = {
    "clicodigomoneda",
    "clicodigoparidad",
    "clicuotastotales",
    "clicuotaapagar",
    "clicupoautorizado",
    "clicupoautorizado1",
    "clicupoautorizado2",
    "clicupoautorizado3",
    "clicupoutilizado1",
    "clicupoutilizado2",
    "clicupoutilizado3",
    "clideudautilizada",
    "clidisponible",
    "clidisponible1",
    "clidisponible2",
    "clidisponible3",
    "clifechavencimiento",
    "clifechavencimiento2",
    "climontoinversion",
    "clioperacioncodigo",
    "cliproductocodigo",
    "clisaldocontable",
    "clisaldodisponible",
    "clisubproductocodigo",
    "clisubproductonombre",
    "clitipo",
    "clivalorcuota"
})
public class CliResumenConMsg {

    @XmlElement(name = "CLI_CODIGO_MONEDA")
    protected short clicodigomoneda;
    @XmlElement(name = "CLI_CODIGO_PARIDAD")
    protected short clicodigoparidad;
    @XmlElement(name = "CLI_CUOTAS_TOTALES")
    protected short clicuotastotales;
    @XmlElement(name = "CLI_CUOTA_A_PAGAR")
    protected short clicuotaapagar;
    @XmlElement(name = "CLI_CUPO_AUTORIZADO", required = true, nillable = true)
    protected BigDecimal clicupoautorizado;
    @XmlElement(name = "CLI_CUPO_AUTORIZADO_1", required = true, nillable = true)
    protected BigDecimal clicupoautorizado1;
    @XmlElement(name = "CLI_CUPO_AUTORIZADO_2", required = true, nillable = true)
    protected BigDecimal clicupoautorizado2;
    @XmlElement(name = "CLI_CUPO_AUTORIZADO_3", required = true, nillable = true)
    protected BigDecimal clicupoautorizado3;
    @XmlElement(name = "CLI_CUPO_UTILIZADO_1", required = true, nillable = true)
    protected BigDecimal clicupoutilizado1;
    @XmlElement(name = "CLI_CUPO_UTILIZADO_2", required = true, nillable = true)
    protected BigDecimal clicupoutilizado2;
    @XmlElement(name = "CLI_CUPO_UTILIZADO_3", required = true, nillable = true)
    protected BigDecimal clicupoutilizado3;
    @XmlElement(name = "CLI_DEUDA_UTILIZADA", required = true, nillable = true)
    protected BigDecimal clideudautilizada;
    @XmlElement(name = "CLI_DISPONIBLE", required = true, nillable = true)
    protected BigDecimal clidisponible;
    @XmlElement(name = "CLI_DISPONIBLE_1", required = true, nillable = true)
    protected BigDecimal clidisponible1;
    @XmlElement(name = "CLI_DISPONIBLE_2", required = true, nillable = true)
    protected BigDecimal clidisponible2;
    @XmlElement(name = "CLI_DISPONIBLE_3", required = true, nillable = true)
    protected BigDecimal clidisponible3;
    @XmlElement(name = "CLI_FECHA_VENCIMIENTO", required = true, nillable = true)
    protected String clifechavencimiento;
    @XmlElement(name = "CLI_FECHA_VENCIMIENTO_2", required = true, nillable = true)
    protected String clifechavencimiento2;
    @XmlElement(name = "CLI_MONTO_INVERSION", required = true, nillable = true)
    protected BigDecimal climontoinversion;
    @XmlElement(name = "CLI_OPERACION_CODIGO")
    protected long clioperacioncodigo;
    @XmlElement(name = "CLI_PRODUCTO_CODIGO")
    protected short cliproductocodigo;
    @XmlElement(name = "CLI_SALDO_CONTABLE", required = true, nillable = true)
    protected BigDecimal clisaldocontable;
    @XmlElement(name = "CLI_SALDO_DISPONIBLE", required = true, nillable = true)
    protected BigDecimal clisaldodisponible;
    @XmlElement(name = "CLI_SUBPRODUCTO_CODIGO")
    protected short clisubproductocodigo;
    @XmlElement(name = "CLI_SUBPRODUCTO_NOMBRE", required = true, nillable = true)
    protected String clisubproductonombre;
    @XmlElement(name = "CLI_TIPO")
    protected short clitipo;
    @XmlElement(name = "CLI_VALOR_CUOTA", required = true, nillable = true)
    protected BigDecimal clivalorcuota;

    /**
     * Gets the value of the clicodigomoneda property.
     * 
     */
    public short getCLICODIGOMONEDA() {
        return clicodigomoneda;
    }

    /**
     * Sets the value of the clicodigomoneda property.
     * 
     */
    public void setCLICODIGOMONEDA(short value) {
        this.clicodigomoneda = value;
    }

    /**
     * Gets the value of the clicodigoparidad property.
     * 
     */
    public short getCLICODIGOPARIDAD() {
        return clicodigoparidad;
    }

    /**
     * Sets the value of the clicodigoparidad property.
     * 
     */
    public void setCLICODIGOPARIDAD(short value) {
        this.clicodigoparidad = value;
    }

    /**
     * Gets the value of the clicuotastotales property.
     * 
     */
    public short getCLICUOTASTOTALES() {
        return clicuotastotales;
    }

    /**
     * Sets the value of the clicuotastotales property.
     * 
     */
    public void setCLICUOTASTOTALES(short value) {
        this.clicuotastotales = value;
    }

    /**
     * Gets the value of the clicuotaapagar property.
     * 
     */
    public short getCLICUOTAAPAGAR() {
        return clicuotaapagar;
    }

    /**
     * Sets the value of the clicuotaapagar property.
     * 
     */
    public void setCLICUOTAAPAGAR(short value) {
        this.clicuotaapagar = value;
    }

    /**
     * Gets the value of the clicupoautorizado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLICUPOAUTORIZADO() {
        return clicupoautorizado;
    }

    /**
     * Sets the value of the clicupoautorizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLICUPOAUTORIZADO(BigDecimal value) {
        this.clicupoautorizado = value;
    }

    /**
     * Gets the value of the clicupoautorizado1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLICUPOAUTORIZADO1() {
        return clicupoautorizado1;
    }

    /**
     * Sets the value of the clicupoautorizado1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLICUPOAUTORIZADO1(BigDecimal value) {
        this.clicupoautorizado1 = value;
    }

    /**
     * Gets the value of the clicupoautorizado2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLICUPOAUTORIZADO2() {
        return clicupoautorizado2;
    }

    /**
     * Sets the value of the clicupoautorizado2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLICUPOAUTORIZADO2(BigDecimal value) {
        this.clicupoautorizado2 = value;
    }

    /**
     * Gets the value of the clicupoautorizado3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLICUPOAUTORIZADO3() {
        return clicupoautorizado3;
    }

    /**
     * Sets the value of the clicupoautorizado3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLICUPOAUTORIZADO3(BigDecimal value) {
        this.clicupoautorizado3 = value;
    }

    /**
     * Gets the value of the clicupoutilizado1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLICUPOUTILIZADO1() {
        return clicupoutilizado1;
    }

    /**
     * Sets the value of the clicupoutilizado1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLICUPOUTILIZADO1(BigDecimal value) {
        this.clicupoutilizado1 = value;
    }

    /**
     * Gets the value of the clicupoutilizado2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLICUPOUTILIZADO2() {
        return clicupoutilizado2;
    }

    /**
     * Sets the value of the clicupoutilizado2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLICUPOUTILIZADO2(BigDecimal value) {
        this.clicupoutilizado2 = value;
    }

    /**
     * Gets the value of the clicupoutilizado3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLICUPOUTILIZADO3() {
        return clicupoutilizado3;
    }

    /**
     * Sets the value of the clicupoutilizado3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLICUPOUTILIZADO3(BigDecimal value) {
        this.clicupoutilizado3 = value;
    }

    /**
     * Gets the value of the clideudautilizada property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLIDEUDAUTILIZADA() {
        return clideudautilizada;
    }

    /**
     * Sets the value of the clideudautilizada property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLIDEUDAUTILIZADA(BigDecimal value) {
        this.clideudautilizada = value;
    }

    /**
     * Gets the value of the clidisponible property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLIDISPONIBLE() {
        return clidisponible;
    }

    /**
     * Sets the value of the clidisponible property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLIDISPONIBLE(BigDecimal value) {
        this.clidisponible = value;
    }

    /**
     * Gets the value of the clidisponible1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLIDISPONIBLE1() {
        return clidisponible1;
    }

    /**
     * Sets the value of the clidisponible1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLIDISPONIBLE1(BigDecimal value) {
        this.clidisponible1 = value;
    }

    /**
     * Gets the value of the clidisponible2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLIDISPONIBLE2() {
        return clidisponible2;
    }

    /**
     * Sets the value of the clidisponible2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLIDISPONIBLE2(BigDecimal value) {
        this.clidisponible2 = value;
    }

    /**
     * Gets the value of the clidisponible3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLIDISPONIBLE3() {
        return clidisponible3;
    }

    /**
     * Sets the value of the clidisponible3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLIDISPONIBLE3(BigDecimal value) {
        this.clidisponible3 = value;
    }

    /**
     * Gets the value of the clifechavencimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIFECHAVENCIMIENTO() {
        return clifechavencimiento;
    }

    /**
     * Sets the value of the clifechavencimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIFECHAVENCIMIENTO(String value) {
        this.clifechavencimiento = value;
    }

    /**
     * Gets the value of the clifechavencimiento2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIFECHAVENCIMIENTO2() {
        return clifechavencimiento2;
    }

    /**
     * Sets the value of the clifechavencimiento2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIFECHAVENCIMIENTO2(String value) {
        this.clifechavencimiento2 = value;
    }

    /**
     * Gets the value of the climontoinversion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLIMONTOINVERSION() {
        return climontoinversion;
    }

    /**
     * Sets the value of the climontoinversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLIMONTOINVERSION(BigDecimal value) {
        this.climontoinversion = value;
    }

    /**
     * Gets the value of the clioperacioncodigo property.
     * 
     */
    public long getCLIOPERACIONCODIGO() {
        return clioperacioncodigo;
    }

    /**
     * Sets the value of the clioperacioncodigo property.
     * 
     */
    public void setCLIOPERACIONCODIGO(long value) {
        this.clioperacioncodigo = value;
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
     * Gets the value of the clisaldocontable property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLISALDOCONTABLE() {
        return clisaldocontable;
    }

    /**
     * Sets the value of the clisaldocontable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLISALDOCONTABLE(BigDecimal value) {
        this.clisaldocontable = value;
    }

    /**
     * Gets the value of the clisaldodisponible property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLISALDODISPONIBLE() {
        return clisaldodisponible;
    }

    /**
     * Sets the value of the clisaldodisponible property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLISALDODISPONIBLE(BigDecimal value) {
        this.clisaldodisponible = value;
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
     * Gets the value of the clitipo property.
     * 
     */
    public short getCLITIPO() {
        return clitipo;
    }

    /**
     * Sets the value of the clitipo property.
     * 
     */
    public void setCLITIPO(short value) {
        this.clitipo = value;
    }

    /**
     * Gets the value of the clivalorcuota property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLIVALORCUOTA() {
        return clivalorcuota;
    }

    /**
     * Sets the value of the clivalorcuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLIVALORCUOTA(BigDecimal value) {
        this.clivalorcuota = value;
    }

}
