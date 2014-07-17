
package com.falabella.mdwcorp.common.schema.clientservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Commerce_TYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Commerce_TYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Banco"/>
 *     &lt;enumeration value="CMR"/>
 *     &lt;enumeration value="Falabella"/>
 *     &lt;enumeration value="Seguros"/>
 *     &lt;enumeration value="Sodimac"/>
 *     &lt;enumeration value="Tottus"/>
 *     &lt;enumeration value="Viajes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Commerce_TYPE")
@XmlEnum
public enum CommerceTYPE {

    @XmlEnumValue("Banco")
    BANCO("Banco"),
    CMR("CMR"),
    @XmlEnumValue("Falabella")
    FALABELLA("Falabella"),
    @XmlEnumValue("Seguros")
    SEGUROS("Seguros"),
    @XmlEnumValue("Sodimac")
    SODIMAC("Sodimac"),
    @XmlEnumValue("Tottus")
    TOTTUS("Tottus"),
    @XmlEnumValue("Viajes")
    VIAJES("Viajes");
    private final String value;

    CommerceTYPE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommerceTYPE fromValue(String v) {
        for (CommerceTYPE c: CommerceTYPE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}