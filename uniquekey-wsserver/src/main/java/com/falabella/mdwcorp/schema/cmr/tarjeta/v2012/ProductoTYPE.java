
package com.falabella.mdwcorp.schema.cmr.tarjeta.v2012;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for producto_TYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="producto_TYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VISA"/>
 *     &lt;enumeration value="CLASICA"/>
 *     &lt;enumeration value="MASTERCARD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "producto_TYPE")
@XmlEnum
public enum ProductoTYPE {

    VISA,
    CLASICA,
    MASTERCARD;

    public String value() {
        return name();
    }

    public static ProductoTYPE fromValue(String v) {
        return valueOf(v);
    }

}
