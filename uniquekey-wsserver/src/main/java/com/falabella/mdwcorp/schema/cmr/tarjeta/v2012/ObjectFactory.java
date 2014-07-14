
package com.falabella.mdwcorp.schema.cmr.tarjeta.v2012;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.falabella.mdwcorp.schema.cmr.tarjeta.v2012 package. 
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

    private final static QName _Año_QNAME = new QName("http://mdwcorp.falabella.com/schema/CMR/tarjeta/v2012.6", "a\u00f1o");
    private final static QName _PAN_QNAME = new QName("http://mdwcorp.falabella.com/schema/CMR/tarjeta/v2012.6", "PAN");
    private final static QName _CVV_QNAME = new QName("http://mdwcorp.falabella.com/schema/CMR/tarjeta/v2012.6", "CVV");
    private final static QName _Producto_QNAME = new QName("http://mdwcorp.falabella.com/schema/CMR/tarjeta/v2012.6", "producto");
    private final static QName _TipoTarjeta_QNAME = new QName("http://mdwcorp.falabella.com/schema/CMR/tarjeta/v2012.6", "tipoTarjeta");
    private final static QName _Mes_QNAME = new QName("http://mdwcorp.falabella.com/schema/CMR/tarjeta/v2012.6", "mes");
    private final static QName _FechaExpiracion_QNAME = new QName("http://mdwcorp.falabella.com/schema/CMR/tarjeta/v2012.6", "fechaExpiracion");
    private final static QName _Estado_QNAME = new QName("http://mdwcorp.falabella.com/schema/CMR/tarjeta/v2012.6", "estado");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.falabella.mdwcorp.schema.cmr.tarjeta.v2012
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FechaExpiracionTYPE }
     * 
     */
    public FechaExpiracionTYPE createFechaExpiracionTYPE() {
        return new FechaExpiracionTYPE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/schema/CMR/tarjeta/v2012.6", name = "a\u00f1o")
    public JAXBElement<String> createAño(String value) {
        return new JAXBElement<String>(_Año_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/schema/CMR/tarjeta/v2012.6", name = "PAN")
    public JAXBElement<String> createPAN(String value) {
        return new JAXBElement<String>(_PAN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/schema/CMR/tarjeta/v2012.6", name = "CVV")
    public JAXBElement<String> createCVV(String value) {
        return new JAXBElement<String>(_CVV_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/schema/CMR/tarjeta/v2012.6", name = "producto")
    public JAXBElement<ProductoTYPE> createProducto(ProductoTYPE value) {
        return new JAXBElement<ProductoTYPE>(_Producto_QNAME, ProductoTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoTarjetaTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/schema/CMR/tarjeta/v2012.6", name = "tipoTarjeta")
    public JAXBElement<TipoTarjetaTYPE> createTipoTarjeta(TipoTarjetaTYPE value) {
        return new JAXBElement<TipoTarjetaTYPE>(_TipoTarjeta_QNAME, TipoTarjetaTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/schema/CMR/tarjeta/v2012.6", name = "mes")
    public JAXBElement<String> createMes(String value) {
        return new JAXBElement<String>(_Mes_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FechaExpiracionTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/schema/CMR/tarjeta/v2012.6", name = "fechaExpiracion")
    public JAXBElement<FechaExpiracionTYPE> createFechaExpiracion(FechaExpiracionTYPE value) {
        return new JAXBElement<FechaExpiracionTYPE>(_FechaExpiracion_QNAME, FechaExpiracionTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstadoTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/schema/CMR/tarjeta/v2012.6", name = "estado")
    public JAXBElement<EstadoTYPE> createEstado(EstadoTYPE value) {
        return new JAXBElement<EstadoTYPE>(_Estado_QNAME, EstadoTYPE.class, null, value);
    }

}
