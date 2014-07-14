
package com.falabella.mdwcorp.common.schema.clientservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Country_TYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Country_TYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="CL"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="PE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Country_TYPE")
@XmlEnum
public enum CountryTYPE {

    AR,
    CL,
    CO,
    PE;

    public String value() {
        return name();
    }

    public static CountryTYPE fromValue(String v) {
        return valueOf(v);
    }

}
