
package com.falabella.mdwcorp.schema.cmr.cliente.v2012;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nivelSeguridad_TYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="nivelSeguridad_TYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Alto"/>
 *     &lt;enumeration value="Bajo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "nivelSeguridad_TYPE")
@XmlEnum
public enum NivelSeguridadTYPE {

    @XmlEnumValue("Alto")
    ALTO("Alto"),
    @XmlEnumValue("Bajo")
    BAJO("Bajo");
    private final String value;

    NivelSeguridadTYPE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NivelSeguridadTYPE fromValue(String v) {
        for (NivelSeguridadTYPE c: NivelSeguridadTYPE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
