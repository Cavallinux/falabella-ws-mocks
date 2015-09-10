
package com.falabella.mdwcorp.osb.schema.fif.corp.cliente.identidad.validar.req_v2015;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.falabella.mdwcorp.osb.schema.fif.corp.cliente.identidad.validar.req_v2015 package. 
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

    private final static QName _ClienteIdentidadValidarExpReq_QNAME = new QName("http://mdwcorp.falabella.com/OSB/schema/FIF/CORP/cliente/identidad/validar/Req-v2015.08", "clienteIdentidadValidarExpReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.falabella.mdwcorp.osb.schema.fif.corp.cliente.identidad.validar.req_v2015
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClienteIdentidadValidarExpReqTYPE }
     * 
     */
    public ClienteIdentidadValidarExpReqTYPE createClienteIdentidadValidarExpReqTYPE() {
        return new ClienteIdentidadValidarExpReqTYPE();
    }

    /**
     * Create an instance of {@link DatosTransaccionTYPE }
     * 
     */
    public DatosTransaccionTYPE createDatosTransaccionTYPE() {
        return new DatosTransaccionTYPE();
    }

    /**
     * Create an instance of {@link ClienteTYPE }
     * 
     */
    public ClienteTYPE createClienteTYPE() {
        return new ClienteTYPE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteIdentidadValidarExpReqTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/OSB/schema/FIF/CORP/cliente/identidad/validar/Req-v2015.08", name = "clienteIdentidadValidarExpReq")
    public JAXBElement<ClienteIdentidadValidarExpReqTYPE> createClienteIdentidadValidarExpReq(ClienteIdentidadValidarExpReqTYPE value) {
        return new JAXBElement<ClienteIdentidadValidarExpReqTYPE>(_ClienteIdentidadValidarExpReq_QNAME, ClienteIdentidadValidarExpReqTYPE.class, null, value);
    }

}
