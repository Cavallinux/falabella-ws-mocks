
package com.falabella.mdwcorp.schema.cmr.cliente.v2012;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoDocumentoIdentidad_TYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoDocumentoIdentidad_TYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RUT"/>
 *     &lt;enumeration value="NIT"/>
 *     &lt;enumeration value="CEDULA_DE_CIUDADANIA"/>
 *     &lt;enumeration value="CEDULA_DE_EXTRANJERIA"/>
 *     &lt;enumeration value="TARJETA_DE_IDENTIDAD"/>
 *     &lt;enumeration value="PASAPORTE"/>
 *     &lt;enumeration value="CARNET_DIPLOMATICO"/>
 *     &lt;enumeration value="DNI"/>
 *     &lt;enumeration value="CARNET_DE_EXTRANJERIA"/>
 *     &lt;enumeration value="CARNET_FFPP"/>
 *     &lt;enumeration value="CARNET_FFAA"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="RUC"/>
 *     &lt;enumeration value="LIBRETA_CIVICA"/>
 *     &lt;enumeration value="LIBRETA_ENROLAMIENTO"/>
 *     &lt;enumeration value="PRESTAMOS_SODIMAC_MUTUAL"/>
 *     &lt;enumeration value="CUIT"/>
 *     &lt;enumeration value="CUIL"/>
 *     &lt;enumeration value="CI"/>
 *     &lt;enumeration value="CIU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoDocumentoIdentidad_TYPE")
@XmlEnum
public enum TipoDocumentoIdentidadTYPE {


    /**
     * CL Rol Unico Tributario
     * 
     */
    RUT,

    /**
     * CO Numero de Identificacion Tributaria 
     * 
     */
    NIT,

    /**
     * CO Cedula de ciudadania
     * 
     */
    CEDULA_DE_CIUDADANIA,

    /**
     * CO Cedula de extranjeria
     * 
     */
    CEDULA_DE_EXTRANJERIA,

    /**
     * CO Tarjeta de identidad (menores)
     * 
     */
    TARJETA_DE_IDENTIDAD,

    /**
     * CORP Pasaporte
     * 
     */
    PASAPORTE,

    /**
     * CORP Carnet diplomatico
     * 
     */
    CARNET_DIPLOMATICO,

    /**
     * PE, AR Documento nacional de identidad
     * 
     */
    DNI,

    /**
     * PE Carnet de extranjeria
     * 
     */
    CARNET_DE_EXTRANJERIA,

    /**
     * PE Carnet de fuerzas policiales
     * 
     */
    CARNET_FFPP,

    /**
     * PE Carnet de fuerzas armadas
     * 
     */
    CARNET_FFAA,

    /**
     * PE Libreta tributaria
     * 
     */
    LT,

    /**
     * PE registro unico de contribuyentes
     * 
     */
    RUC,

    /**
     * AR Libreta civica
     * 
     */
    LIBRETA_CIVICA,

    /**
     * AR Libreta de enrolamiento
     * 
     */
    LIBRETA_ENROLAMIENTO,

    /**
     * NO DEFINIDO
     * 
     */
    PRESTAMOS_SODIMAC_MUTUAL,

    /**
     * AR Codigo unico de identificacion tributaria
     * 
     */
    CUIT,

    /**
     * AR Codigo unico de identificacion laboral
     * 
     */
    CUIL,

    /**
     * AR Cedula de identidad
     * 
     */
    CI,

    /**
     * AR Clave de identificacion unica
     * 
     */
    CIU;

    public String value() {
        return name();
    }

    public static TipoDocumentoIdentidadTYPE fromValue(String v) {
        return valueOf(v);
    }

}
