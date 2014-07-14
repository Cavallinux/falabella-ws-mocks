
package com.falabella.mdwcorp.osb.schema.cmr.corp.cliente.validaclave.resp_v2012;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.falabella.mdwcorp.osb.schema.cmr.corp.cliente.validaclave.resp_v2012 package. 
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

    private final static QName _ValidarClaveResponse_QNAME = new QName("http://mdwcorp.falabella.com/OSB/schema/CMR/CORP/cliente/validaClave/Resp-v2012.06", "ValidarClaveResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.falabella.mdwcorp.osb.schema.cmr.corp.cliente.validaclave.resp_v2012
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidarClaveResponseTYPE }
     * 
     */
    public ValidarClaveResponseTYPE createValidarClaveResponseTYPE() {
        return new ValidarClaveResponseTYPE();
    }

    /**
     * Create an instance of {@link ValidarClaveResponseTYPE.OperacionStatus }
     * 
     */
    public ValidarClaveResponseTYPE.OperacionStatus createValidarClaveResponseTYPEOperacionStatus() {
        return new ValidarClaveResponseTYPE.OperacionStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarClaveResponseTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/OSB/schema/CMR/CORP/cliente/validaClave/Resp-v2012.06", name = "ValidarClaveResponse")
    public JAXBElement<ValidarClaveResponseTYPE> createValidarClaveResponse(ValidarClaveResponseTYPE value) {
        return new JAXBElement<ValidarClaveResponseTYPE>(_ValidarClaveResponse_QNAME, ValidarClaveResponseTYPE.class, null, value);
    }

}
