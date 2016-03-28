
package com.falabella.ws.service.aumentocupo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.falabella.ws.service.aumentocupo package. 
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

    private final static QName _AplicarAumentoCupoTC_QNAME = new QName("http://impl.ws.aumentocupo.trebolit.com/", "aplicarAumentoCupoTC");
    private final static QName _AplicarAumentoCupoTCResponse_QNAME = new QName("http://impl.ws.aumentocupo.trebolit.com/", "aplicarAumentoCupoTCResponse");
    private final static QName _AplicarAumentoCupoLC_QNAME = new QName("http://impl.ws.aumentocupo.trebolit.com/", "aplicarAumentoCupoLC");
    private final static QName _AplicarAumentoCupoLCResponse_QNAME = new QName("http://impl.ws.aumentocupo.trebolit.com/", "aplicarAumentoCupoLCResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.falabella.ws.service.aumentocupo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AplicarAumentoCupoTC }
     * 
     */
    public AplicarAumentoCupoTC createAplicarAumentoCupoTC() {
        return new AplicarAumentoCupoTC();
    }

    /**
     * Create an instance of {@link RespuestaVO }
     * 
     */
    public RespuestaVO createRespuestaVO() {
        return new RespuestaVO();
    }

    /**
     * Create an instance of {@link AplicarAumentoCupoLC }
     * 
     */
    public AplicarAumentoCupoLC createAplicarAumentoCupoLC() {
        return new AplicarAumentoCupoLC();
    }

    /**
     * Create an instance of {@link AplicarAumentoCupoLCResponse }
     * 
     */
    public AplicarAumentoCupoLCResponse createAplicarAumentoCupoLCResponse() {
        return new AplicarAumentoCupoLCResponse();
    }

    /**
     * Create an instance of {@link AplicarAumentoCupoTCResponse }
     * 
     */
    public AplicarAumentoCupoTCResponse createAplicarAumentoCupoTCResponse() {
        return new AplicarAumentoCupoTCResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AplicarAumentoCupoTC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.aumentocupo.trebolit.com/", name = "aplicarAumentoCupoTC")
    public JAXBElement<AplicarAumentoCupoTC> createAplicarAumentoCupoTC(AplicarAumentoCupoTC value) {
        return new JAXBElement<AplicarAumentoCupoTC>(_AplicarAumentoCupoTC_QNAME, AplicarAumentoCupoTC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AplicarAumentoCupoTCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.aumentocupo.trebolit.com/", name = "aplicarAumentoCupoTCResponse")
    public JAXBElement<AplicarAumentoCupoTCResponse> createAplicarAumentoCupoTCResponse(AplicarAumentoCupoTCResponse value) {
        return new JAXBElement<AplicarAumentoCupoTCResponse>(_AplicarAumentoCupoTCResponse_QNAME, AplicarAumentoCupoTCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AplicarAumentoCupoLC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.aumentocupo.trebolit.com/", name = "aplicarAumentoCupoLC")
    public JAXBElement<AplicarAumentoCupoLC> createAplicarAumentoCupoLC(AplicarAumentoCupoLC value) {
        return new JAXBElement<AplicarAumentoCupoLC>(_AplicarAumentoCupoLC_QNAME, AplicarAumentoCupoLC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AplicarAumentoCupoLCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.aumentocupo.trebolit.com/", name = "aplicarAumentoCupoLCResponse")
    public JAXBElement<AplicarAumentoCupoLCResponse> createAplicarAumentoCupoLCResponse(AplicarAumentoCupoLCResponse value) {
        return new JAXBElement<AplicarAumentoCupoLCResponse>(_AplicarAumentoCupoLCResponse_QNAME, AplicarAumentoCupoLCResponse.class, null, value);
    }

}
