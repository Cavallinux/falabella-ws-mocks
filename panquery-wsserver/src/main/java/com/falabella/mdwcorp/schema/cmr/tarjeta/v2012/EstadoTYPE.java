
package com.falabella.mdwcorp.schema.cmr.tarjeta.v2012;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for estado_TYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="estado_TYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Activa"/>
 *     &lt;enumeration value="Bloqueada"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "estado_TYPE")
@XmlEnum
public enum EstadoTYPE {

    @XmlEnumValue("Activa")
    ACTIVA("Activa"),
    @XmlEnumValue("Bloqueada")
    BLOQUEADA("Bloqueada");
    private final String value;

    EstadoTYPE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EstadoTYPE fromValue(String v) {
        for (EstadoTYPE c: EstadoTYPE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
