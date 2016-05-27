
package com.falabella.ws.service.evaluacliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.falabella.ws.service.evaluacliente package. 
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

    private final static QName _EntradaEvaluaCliente_QNAME = new QName("http://control.evaluacionEnlinea.ws.bancofalabella.cl/", "entradaEvaluaCliente");
    private final static QName _ListaRechazos_QNAME = new QName("http://control.evaluacionEnlinea.ws.bancofalabella.cl/", "listaRechazos");
    private final static QName _Rechazo_QNAME = new QName("http://control.evaluacionEnlinea.ws.bancofalabella.cl/", "rechazo");
    private final static QName _RespEvaluaCliente_QNAME = new QName("http://control.evaluacionEnlinea.ws.bancofalabella.cl/", "respEvaluaCliente");
    private final static QName _SalidaEvaluaCliente_QNAME = new QName("http://control.evaluacionEnlinea.ws.bancofalabella.cl/", "salidaEvaluaCliente");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.falabella.ws.service.evaluacliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EntradaEvaluaCliente }
     * 
     */
    public EntradaEvaluaCliente createEntradaEvaluaCliente() {
        return new EntradaEvaluaCliente();
    }

    /**
     * Create an instance of {@link ListaRechazos }
     * 
     */
    public ListaRechazos createListaRechazos() {
        return new ListaRechazos();
    }

    /**
     * Create an instance of {@link Rechazo }
     * 
     */
    public Rechazo createRechazo() {
        return new Rechazo();
    }

    /**
     * Create an instance of {@link RespEvaluaCliente }
     * 
     */
    public RespEvaluaCliente createRespEvaluaCliente() {
        return new RespEvaluaCliente();
    }

    /**
     * Create an instance of {@link SalidaEvaluaCliente }
     * 
     */
    public SalidaEvaluaCliente createSalidaEvaluaCliente() {
        return new SalidaEvaluaCliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntradaEvaluaCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control.evaluacionEnlinea.ws.bancofalabella.cl/", name = "entradaEvaluaCliente")
    public JAXBElement<EntradaEvaluaCliente> createEntradaEvaluaCliente(EntradaEvaluaCliente value) {
        return new JAXBElement<EntradaEvaluaCliente>(_EntradaEvaluaCliente_QNAME, EntradaEvaluaCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaRechazos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control.evaluacionEnlinea.ws.bancofalabella.cl/", name = "listaRechazos")
    public JAXBElement<ListaRechazos> createListaRechazos(ListaRechazos value) {
        return new JAXBElement<ListaRechazos>(_ListaRechazos_QNAME, ListaRechazos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rechazo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control.evaluacionEnlinea.ws.bancofalabella.cl/", name = "rechazo")
    public JAXBElement<Rechazo> createRechazo(Rechazo value) {
        return new JAXBElement<Rechazo>(_Rechazo_QNAME, Rechazo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespEvaluaCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control.evaluacionEnlinea.ws.bancofalabella.cl/", name = "respEvaluaCliente")
    public JAXBElement<RespEvaluaCliente> createRespEvaluaCliente(RespEvaluaCliente value) {
        return new JAXBElement<RespEvaluaCliente>(_RespEvaluaCliente_QNAME, RespEvaluaCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalidaEvaluaCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control.evaluacionEnlinea.ws.bancofalabella.cl/", name = "salidaEvaluaCliente")
    public JAXBElement<SalidaEvaluaCliente> createSalidaEvaluaCliente(SalidaEvaluaCliente value) {
        return new JAXBElement<SalidaEvaluaCliente>(_SalidaEvaluaCliente_QNAME, SalidaEvaluaCliente.class, null, value);
    }

}
