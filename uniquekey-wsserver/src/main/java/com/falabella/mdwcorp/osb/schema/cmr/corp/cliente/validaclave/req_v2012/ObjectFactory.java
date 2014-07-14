
package com.falabella.mdwcorp.osb.schema.cmr.corp.cliente.validaclave.req_v2012;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.falabella.mdwcorp.osb.schema.cmr.corp.cliente.validaclave.req_v2012 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidarClaveRequest_QNAME = new QName("http://mdwcorp.falabella.com/OSB/schema/CMR/CORP/cliente/validaClave/Req-v2012.06", "ValidarClaveRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.falabella.mdwcorp.osb.schema.cmr.corp.cliente.validaclave.req_v2012
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidarClaveRequestTYPE }
     * 
     */
    public ValidarClaveRequestTYPE createValidarClaveRequestTYPE() {
        return new ValidarClaveRequestTYPE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarClaveRequestTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/OSB/schema/CMR/CORP/cliente/validaClave/Req-v2012.06", name = "ValidarClaveRequest")
    public JAXBElement<ValidarClaveRequestTYPE> createValidarClaveRequest(ValidarClaveRequestTYPE value) {
        return new JAXBElement<ValidarClaveRequestTYPE>(_ValidarClaveRequest_QNAME, ValidarClaveRequestTYPE.class, null, value);
    }

}
