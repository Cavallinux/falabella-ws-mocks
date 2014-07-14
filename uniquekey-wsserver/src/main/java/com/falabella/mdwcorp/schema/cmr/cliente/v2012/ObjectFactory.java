
package com.falabella.mdwcorp.schema.cmr.cliente.v2012;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.falabella.mdwcorp.schema.cmr.cliente.v2012 package. 
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

    private final static QName _FechaNacimiento_QNAME = new QName("http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", "fechaNacimiento");
    private final static QName _ApellidoPaterno_QNAME = new QName("http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", "apellidoPaterno");
    private final static QName _NombreCompleto_QNAME = new QName("http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", "nombreCompleto");
    private final static QName _CantidadContratos_QNAME = new QName("http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", "cantidadContratos");
    private final static QName _VerificadorDocumentoIdentidad_QNAME = new QName("http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", "verificadorDocumentoIdentidad");
    private final static QName _DocumentoIdentidad_QNAME = new QName("http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", "documentoIdentidad");
    private final static QName _TipoDocumentoIdentidad_QNAME = new QName("http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", "tipoDocumentoIdentidad");
    private final static QName _TipoCliente_QNAME = new QName("http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", "tipoCliente");
    private final static QName _NivelSeguridad_QNAME = new QName("http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", "nivelSeguridad");
    private final static QName _ApellidoMaterno_QNAME = new QName("http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", "apellidoMaterno");
    private final static QName _NumeroDocumentoIdentidad_QNAME = new QName("http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", "numeroDocumentoIdentidad");
    private final static QName _Nombres_QNAME = new QName("http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", "nombres");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.falabella.mdwcorp.schema.cmr.cliente.v2012
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NombreCompletoType }
     * 
     */
    public NombreCompletoType createNombreCompletoType() {
        return new NombreCompletoType();
    }

    /**
     * Create an instance of {@link DocumentoIdentidadType }
     * 
     */
    public DocumentoIdentidadType createDocumentoIdentidadType() {
        return new DocumentoIdentidadType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", name = "fechaNacimiento")
    public JAXBElement<XMLGregorianCalendar> createFechaNacimiento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FechaNacimiento_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", name = "apellidoPaterno")
    public JAXBElement<String> createApellidoPaterno(String value) {
        return new JAXBElement<String>(_ApellidoPaterno_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NombreCompletoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", name = "nombreCompleto")
    public JAXBElement<NombreCompletoType> createNombreCompleto(NombreCompletoType value) {
        return new JAXBElement<NombreCompletoType>(_NombreCompleto_QNAME, NombreCompletoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", name = "cantidadContratos")
    public JAXBElement<BigInteger> createCantidadContratos(BigInteger value) {
        return new JAXBElement<BigInteger>(_CantidadContratos_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", name = "verificadorDocumentoIdentidad")
    public JAXBElement<String> createVerificadorDocumentoIdentidad(String value) {
        return new JAXBElement<String>(_VerificadorDocumentoIdentidad_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentoIdentidadType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", name = "documentoIdentidad")
    public JAXBElement<DocumentoIdentidadType> createDocumentoIdentidad(DocumentoIdentidadType value) {
        return new JAXBElement<DocumentoIdentidadType>(_DocumentoIdentidad_QNAME, DocumentoIdentidadType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoDocumentoIdentidadTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", name = "tipoDocumentoIdentidad")
    public JAXBElement<TipoDocumentoIdentidadTYPE> createTipoDocumentoIdentidad(TipoDocumentoIdentidadTYPE value) {
        return new JAXBElement<TipoDocumentoIdentidadTYPE>(_TipoDocumentoIdentidad_QNAME, TipoDocumentoIdentidadTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoClienteTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", name = "tipoCliente")
    public JAXBElement<TipoClienteTYPE> createTipoCliente(TipoClienteTYPE value) {
        return new JAXBElement<TipoClienteTYPE>(_TipoCliente_QNAME, TipoClienteTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NivelSeguridadTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", name = "nivelSeguridad")
    public JAXBElement<NivelSeguridadTYPE> createNivelSeguridad(NivelSeguridadTYPE value) {
        return new JAXBElement<NivelSeguridadTYPE>(_NivelSeguridad_QNAME, NivelSeguridadTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", name = "apellidoMaterno")
    public JAXBElement<String> createApellidoMaterno(String value) {
        return new JAXBElement<String>(_ApellidoMaterno_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", name = "numeroDocumentoIdentidad")
    public JAXBElement<String> createNumeroDocumentoIdentidad(String value) {
        return new JAXBElement<String>(_NumeroDocumentoIdentidad_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/schema/CMR/cliente/v2012.6", name = "nombres")
    public JAXBElement<String> createNombres(String value) {
        return new JAXBElement<String>(_Nombres_QNAME, String.class, null, value);
    }

}
