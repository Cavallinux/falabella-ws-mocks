
package com.falabella.ws.service.guardarequerimiento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="RUT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NOMBRES" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="APELLIDO_PATERNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="APELLIDO_MATERNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TELEFONO_PARTICULAR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CELULAR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESC_CIUDAD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COD_CIUDAD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MAIL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TIPO_REQUERIMIENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CONCEPTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRODUCTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TIPO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MOTIVO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COD_SEGMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AREA_INGRESO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COD_OFICINA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ORIGINADOR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TIPO_FORMULARIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COMENTARIOS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MALA_ATENCION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EJEC_MALA_ATENCION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SUC_MALA_ATENCION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EJEC_SOL_PGO" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "rut",
    "nombres",
    "apellidopaterno",
    "apellidomaterno",
    "telefonoparticular",
    "celular",
    "descciudad",
    "codciudad",
    "mail",
    "tiporequerimiento",
    "concepto",
    "producto",
    "tipo",
    "motivo",
    "codsegmento",
    "areaingreso",
    "codoficina",
    "originador",
    "tipoformulario",
    "comentarios",
    "malaatencion",
    "ejecmalaatencion",
    "sucmalaatencion",
    "ejecsolpgo"
})
@XmlRootElement(name = "RequerimientoWF")
public class RequerimientoWF {

    @XmlElement(name = "RUT", required = true)
    protected String rut;
    @XmlElement(name = "NOMBRES", required = true)
    protected String nombres;
    @XmlElement(name = "APELLIDO_PATERNO", required = true)
    protected String apellidopaterno;
    @XmlElement(name = "APELLIDO_MATERNO", required = true)
    protected String apellidomaterno;
    @XmlElement(name = "TELEFONO_PARTICULAR", required = true)
    protected String telefonoparticular;
    @XmlElement(name = "CELULAR", required = true)
    protected String celular;
    @XmlElement(name = "DESC_CIUDAD", required = true)
    protected String descciudad;
    @XmlElement(name = "COD_CIUDAD", required = true)
    protected String codciudad;
    @XmlElement(name = "MAIL", required = true)
    protected String mail;
    @XmlElement(name = "TIPO_REQUERIMIENTO", required = true)
    protected String tiporequerimiento;
    @XmlElement(name = "CONCEPTO", required = true)
    protected String concepto;
    @XmlElement(name = "PRODUCTO", required = true)
    protected String producto;
    @XmlElement(name = "TIPO", required = true)
    protected String tipo;
    @XmlElement(name = "MOTIVO", required = true)
    protected String motivo;
    @XmlElement(name = "COD_SEGMENTO", required = true)
    protected String codsegmento;
    @XmlElement(name = "AREA_INGRESO", required = true)
    protected String areaingreso;
    @XmlElement(name = "COD_OFICINA", required = true)
    protected String codoficina;
    @XmlElement(name = "ORIGINADOR", required = true)
    protected String originador;
    @XmlElement(name = "TIPO_FORMULARIO", required = true)
    protected String tipoformulario;
    @XmlElement(name = "COMENTARIOS", required = true)
    protected String comentarios;
    @XmlElement(name = "MALA_ATENCION", required = true)
    protected String malaatencion;
    @XmlElement(name = "EJEC_MALA_ATENCION", required = true)
    protected String ejecmalaatencion;
    @XmlElement(name = "SUC_MALA_ATENCION", required = true)
    protected String sucmalaatencion;
    @XmlElement(name = "EJEC_SOL_PGO", required = true)
    protected String ejecsolpgo;

    /**
     * Gets the value of the rut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUT() {
        return rut;
    }

    /**
     * Sets the value of the rut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUT(String value) {
        this.rut = value;
    }

    /**
     * Gets the value of the nombres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRES() {
        return nombres;
    }

    /**
     * Sets the value of the nombres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRES(String value) {
        this.nombres = value;
    }

    /**
     * Gets the value of the apellidopaterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPELLIDOPATERNO() {
        return apellidopaterno;
    }

    /**
     * Sets the value of the apellidopaterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPELLIDOPATERNO(String value) {
        this.apellidopaterno = value;
    }

    /**
     * Gets the value of the apellidomaterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPELLIDOMATERNO() {
        return apellidomaterno;
    }

    /**
     * Sets the value of the apellidomaterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPELLIDOMATERNO(String value) {
        this.apellidomaterno = value;
    }

    /**
     * Gets the value of the telefonoparticular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEFONOPARTICULAR() {
        return telefonoparticular;
    }

    /**
     * Sets the value of the telefonoparticular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEFONOPARTICULAR(String value) {
        this.telefonoparticular = value;
    }

    /**
     * Gets the value of the celular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCELULAR() {
        return celular;
    }

    /**
     * Sets the value of the celular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCELULAR(String value) {
        this.celular = value;
    }

    /**
     * Gets the value of the descciudad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCCIUDAD() {
        return descciudad;
    }

    /**
     * Sets the value of the descciudad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCCIUDAD(String value) {
        this.descciudad = value;
    }

    /**
     * Gets the value of the codciudad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCIUDAD() {
        return codciudad;
    }

    /**
     * Sets the value of the codciudad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCIUDAD(String value) {
        this.codciudad = value;
    }

    /**
     * Gets the value of the mail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAIL() {
        return mail;
    }

    /**
     * Sets the value of the mail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAIL(String value) {
        this.mail = value;
    }

    /**
     * Gets the value of the tiporequerimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOREQUERIMIENTO() {
        return tiporequerimiento;
    }

    /**
     * Sets the value of the tiporequerimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOREQUERIMIENTO(String value) {
        this.tiporequerimiento = value;
    }

    /**
     * Gets the value of the concepto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONCEPTO() {
        return concepto;
    }

    /**
     * Sets the value of the concepto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONCEPTO(String value) {
        this.concepto = value;
    }

    /**
     * Gets the value of the producto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCTO() {
        return producto;
    }

    /**
     * Sets the value of the producto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCTO(String value) {
        this.producto = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPO() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPO(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the motivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIVO() {
        return motivo;
    }

    /**
     * Sets the value of the motivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIVO(String value) {
        this.motivo = value;
    }

    /**
     * Gets the value of the codsegmento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSEGMENTO() {
        return codsegmento;
    }

    /**
     * Sets the value of the codsegmento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSEGMENTO(String value) {
        this.codsegmento = value;
    }

    /**
     * Gets the value of the areaingreso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAREAINGRESO() {
        return areaingreso;
    }

    /**
     * Sets the value of the areaingreso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAREAINGRESO(String value) {
        this.areaingreso = value;
    }

    /**
     * Gets the value of the codoficina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODOFICINA() {
        return codoficina;
    }

    /**
     * Sets the value of the codoficina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODOFICINA(String value) {
        this.codoficina = value;
    }

    /**
     * Gets the value of the originador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGINADOR() {
        return originador;
    }

    /**
     * Sets the value of the originador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGINADOR(String value) {
        this.originador = value;
    }

    /**
     * Gets the value of the tipoformulario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOFORMULARIO() {
        return tipoformulario;
    }

    /**
     * Sets the value of the tipoformulario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOFORMULARIO(String value) {
        this.tipoformulario = value;
    }

    /**
     * Gets the value of the comentarios property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMENTARIOS() {
        return comentarios;
    }

    /**
     * Sets the value of the comentarios property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMENTARIOS(String value) {
        this.comentarios = value;
    }

    /**
     * Gets the value of the malaatencion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMALAATENCION() {
        return malaatencion;
    }

    /**
     * Sets the value of the malaatencion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMALAATENCION(String value) {
        this.malaatencion = value;
    }

    /**
     * Gets the value of the ejecmalaatencion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEJECMALAATENCION() {
        return ejecmalaatencion;
    }

    /**
     * Sets the value of the ejecmalaatencion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEJECMALAATENCION(String value) {
        this.ejecmalaatencion = value;
    }

    /**
     * Gets the value of the sucmalaatencion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUCMALAATENCION() {
        return sucmalaatencion;
    }

    /**
     * Sets the value of the sucmalaatencion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUCMALAATENCION(String value) {
        this.sucmalaatencion = value;
    }

    /**
     * Gets the value of the ejecsolpgo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEJECSOLPGO() {
        return ejecsolpgo;
    }

    /**
     * Sets the value of the ejecsolpgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEJECSOLPGO(String value) {
        this.ejecsolpgo = value;
    }

}
