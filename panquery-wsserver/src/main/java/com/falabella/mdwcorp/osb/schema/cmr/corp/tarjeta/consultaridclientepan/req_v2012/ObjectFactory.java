
package com.falabella.mdwcorp.osb.schema.cmr.corp.tarjeta.consultaridclientepan.req_v2012;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.falabella.mdwcorp.osb.schema.cmr.corp.tarjeta.consultaridclientepan.req_v2012 package. 
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

    private final static QName _ConsultarIDClientePANRequest_QNAME = new QName("http://mdwcorp.falabella.com/OSB/schema/CMR/CORP/tarjeta/consultarIDClientePAN/Req-v2012.08", "consultarIDClientePANRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.falabella.mdwcorp.osb.schema.cmr.corp.tarjeta.consultaridclientepan.req_v2012
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarIDClientePANRequestTYPE }
     * 
     */
    public ConsultarIDClientePANRequestTYPE createConsultarIDClientePANRequestTYPE() {
        return new ConsultarIDClientePANRequestTYPE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarIDClientePANRequestTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/OSB/schema/CMR/CORP/tarjeta/consultarIDClientePAN/Req-v2012.08", name = "consultarIDClientePANRequest")
    public JAXBElement<ConsultarIDClientePANRequestTYPE> createConsultarIDClientePANRequest(ConsultarIDClientePANRequestTYPE value) {
        return new JAXBElement<ConsultarIDClientePANRequestTYPE>(_ConsultarIDClientePANRequest_QNAME, ConsultarIDClientePANRequestTYPE.class, null, value);
    }

}
