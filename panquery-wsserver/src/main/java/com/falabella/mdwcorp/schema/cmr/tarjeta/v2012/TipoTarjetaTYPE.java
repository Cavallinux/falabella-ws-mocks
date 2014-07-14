
package com.falabella.mdwcorp.schema.cmr.tarjeta.v2012;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoTarjeta_TYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoTarjeta_TYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Titular"/>
 *     &lt;enumeration value="Adicional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoTarjeta_TYPE")
@XmlEnum
public enum TipoTarjetaTYPE {

    @XmlEnumValue("Titular")
    TITULAR("Titular"),
    @XmlEnumValue("Adicional")
    ADICIONAL("Adicional");
    private final String value;

    TipoTarjetaTYPE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoTarjetaTYPE fromValue(String v) {
        for (TipoTarjetaTYPE c: TipoTarjetaTYPE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
