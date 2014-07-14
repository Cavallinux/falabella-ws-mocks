
package com.falabella.mdwcorp.schema.cmr.cliente.v2012;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoCliente_TYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoCliente_TYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="PREMIUM"/>
 *     &lt;enumeration value="ELITE"/>
 *     &lt;enumeration value="NORMAL_EMPLOYEE"/>
 *     &lt;enumeration value="PREMIUM_EMPLOYEE"/>
 *     &lt;enumeration value="ELITE_EMPLOYEE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoCliente_TYPE")
@XmlEnum
public enum TipoClienteTYPE {

    NORMAL,
    PREMIUM,
    ELITE,
    NORMAL_EMPLOYEE,
    PREMIUM_EMPLOYEE,
    ELITE_EMPLOYEE;

    public String value() {
        return name();
    }

    public static TipoClienteTYPE fromValue(String v) {
        return valueOf(v);
    }

}
