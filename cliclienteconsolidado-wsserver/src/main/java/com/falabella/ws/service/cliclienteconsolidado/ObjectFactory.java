
package com.falabella.ws.service.cliclienteconsolidado;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.falabella.ws.service.cliclienteconsolidado package. 
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

    private final static QName _BancoFalabellaException_QNAME = new QName("java:cl.bancofalabella.ebanking.exception", "BancoFalabellaException");
    private final static QName _ArrayOfCliResumenConMsgLiteral_QNAME = new QName("java:cl.bancofalabella.ebanking.message.cliClienteConsolidado", "ArrayOfCliResumenConMsg_literal");
    private final static QName _ArrayOfCliOfertasClienteMsgLiteral_QNAME = new QName("java:cl.bancofalabella.ebanking.message.cliClienteConsolidado", "ArrayOfCliOfertasClienteMsg_literal");
    private final static QName _CliOfertasClienteCLIINCLUYELCC_QNAME = new QName("http://cl/bancofalabella/ebanking/service", "CLI_INCLUYE_LCC");
    private final static QName _CliOfertasClienteCLIINCLUYELCD_QNAME = new QName("http://cl/bancofalabella/ebanking/service", "CLI_INCLUYE_LCD");
    private final static QName _CliOfertasClienteCLIINCLUYEOFERTAMANTENCION_QNAME = new QName("http://cl/bancofalabella/ebanking/service", "CLI_INCLUYE_OFERTA_MANTENCION");
    private final static QName _CliOfertasClienteCLIINCLUYETCR_QNAME = new QName("http://cl/bancofalabella/ebanking/service", "CLI_INCLUYE_TCR");
    private final static QName _CliOfertasClienteCLIINCLUYEAPERTURALCC_QNAME = new QName("http://cl/bancofalabella/ebanking/service", "CLI_INCLUYE_APERTURA_LCC");
    private final static QName _CliOfertasClienteCLIINCLUYETODASLASOFERTAS_QNAME = new QName("http://cl/bancofalabella/ebanking/service", "CLI_INCLUYE_TODAS_LAS_OFERTAS");
    private final static QName _CliOfertasClienteCLIINCLUYERDDCONSOLIDACION_QNAME = new QName("http://cl/bancofalabella/ebanking/service", "CLI_INCLUYE_RDD_CONSOLIDACION");
    private final static QName _CliOfertasClienteCLIINCLUYECRC_QNAME = new QName("http://cl/bancofalabella/ebanking/service", "CLI_INCLUYE_CRC");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.falabella.ws.service.cliclienteconsolidado
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CliResumenCon }
     * 
     */
    public CliResumenCon createCliResumenCon() {
        return new CliResumenCon();
    }

    /**
     * Create an instance of {@link BancoFalabellaException }
     * 
     */
    public BancoFalabellaException createBancoFalabellaException() {
        return new BancoFalabellaException();
    }

    /**
     * Create an instance of {@link CliResumenConResponse }
     * 
     */
    public CliResumenConResponse createCliResumenConResponse() {
        return new CliResumenConResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCliResumenConMsgLiteral }
     * 
     */
    public ArrayOfCliResumenConMsgLiteral createArrayOfCliResumenConMsgLiteral() {
        return new ArrayOfCliResumenConMsgLiteral();
    }

    /**
     * Create an instance of {@link CliOfertasCliente }
     * 
     */
    public CliOfertasCliente createCliOfertasCliente() {
        return new CliOfertasCliente();
    }

    /**
     * Create an instance of {@link CliOfertasClienteResponse }
     * 
     */
    public CliOfertasClienteResponse createCliOfertasClienteResponse() {
        return new CliOfertasClienteResponse();
    }

    /**
     * Create an instance of {@link CliResumenConMsg }
     * 
     */
    public CliResumenConMsg createCliResumenConMsg() {
        return new CliResumenConMsg();
    }

    /**
     * Create an instance of {@link ArrayOfCliOfertasClienteMsgLiteral }
     * 
     */
    public ArrayOfCliOfertasClienteMsgLiteral createArrayOfCliOfertasClienteMsgLiteral() {
        return new ArrayOfCliOfertasClienteMsgLiteral();
    }

    /**
     * Create an instance of {@link CliOfertasClienteMsg }
     * 
     */
    public CliOfertasClienteMsg createCliOfertasClienteMsg() {
        return new CliOfertasClienteMsg();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BancoFalabellaException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:cl.bancofalabella.ebanking.exception", name = "BancoFalabellaException")
    public JAXBElement<BancoFalabellaException> createBancoFalabellaException(BancoFalabellaException value) {
        return new JAXBElement<BancoFalabellaException>(_BancoFalabellaException_QNAME, BancoFalabellaException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCliResumenConMsgLiteral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:cl.bancofalabella.ebanking.message.cliClienteConsolidado", name = "ArrayOfCliResumenConMsg_literal")
    public JAXBElement<ArrayOfCliResumenConMsgLiteral> createArrayOfCliResumenConMsgLiteral(ArrayOfCliResumenConMsgLiteral value) {
        return new JAXBElement<ArrayOfCliResumenConMsgLiteral>(_ArrayOfCliResumenConMsgLiteral_QNAME, ArrayOfCliResumenConMsgLiteral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCliOfertasClienteMsgLiteral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:cl.bancofalabella.ebanking.message.cliClienteConsolidado", name = "ArrayOfCliOfertasClienteMsg_literal")
    public JAXBElement<ArrayOfCliOfertasClienteMsgLiteral> createArrayOfCliOfertasClienteMsgLiteral(ArrayOfCliOfertasClienteMsgLiteral value) {
        return new JAXBElement<ArrayOfCliOfertasClienteMsgLiteral>(_ArrayOfCliOfertasClienteMsgLiteral_QNAME, ArrayOfCliOfertasClienteMsgLiteral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cl/bancofalabella/ebanking/service", name = "CLI_INCLUYE_LCC", scope = CliOfertasCliente.class)
    public JAXBElement<String> createCliOfertasClienteCLIINCLUYELCC(String value) {
        return new JAXBElement<String>(_CliOfertasClienteCLIINCLUYELCC_QNAME, String.class, CliOfertasCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cl/bancofalabella/ebanking/service", name = "CLI_INCLUYE_LCD", scope = CliOfertasCliente.class)
    public JAXBElement<String> createCliOfertasClienteCLIINCLUYELCD(String value) {
        return new JAXBElement<String>(_CliOfertasClienteCLIINCLUYELCD_QNAME, String.class, CliOfertasCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cl/bancofalabella/ebanking/service", name = "CLI_INCLUYE_OFERTA_MANTENCION", scope = CliOfertasCliente.class)
    public JAXBElement<String> createCliOfertasClienteCLIINCLUYEOFERTAMANTENCION(String value) {
        return new JAXBElement<String>(_CliOfertasClienteCLIINCLUYEOFERTAMANTENCION_QNAME, String.class, CliOfertasCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cl/bancofalabella/ebanking/service", name = "CLI_INCLUYE_TCR", scope = CliOfertasCliente.class)
    public JAXBElement<String> createCliOfertasClienteCLIINCLUYETCR(String value) {
        return new JAXBElement<String>(_CliOfertasClienteCLIINCLUYETCR_QNAME, String.class, CliOfertasCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cl/bancofalabella/ebanking/service", name = "CLI_INCLUYE_APERTURA_LCC", scope = CliOfertasCliente.class)
    public JAXBElement<String> createCliOfertasClienteCLIINCLUYEAPERTURALCC(String value) {
        return new JAXBElement<String>(_CliOfertasClienteCLIINCLUYEAPERTURALCC_QNAME, String.class, CliOfertasCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cl/bancofalabella/ebanking/service", name = "CLI_INCLUYE_TODAS_LAS_OFERTAS", scope = CliOfertasCliente.class)
    public JAXBElement<String> createCliOfertasClienteCLIINCLUYETODASLASOFERTAS(String value) {
        return new JAXBElement<String>(_CliOfertasClienteCLIINCLUYETODASLASOFERTAS_QNAME, String.class, CliOfertasCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cl/bancofalabella/ebanking/service", name = "CLI_INCLUYE_RDD_CONSOLIDACION", scope = CliOfertasCliente.class)
    public JAXBElement<String> createCliOfertasClienteCLIINCLUYERDDCONSOLIDACION(String value) {
        return new JAXBElement<String>(_CliOfertasClienteCLIINCLUYERDDCONSOLIDACION_QNAME, String.class, CliOfertasCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cl/bancofalabella/ebanking/service", name = "CLI_INCLUYE_CRC", scope = CliOfertasCliente.class)
    public JAXBElement<String> createCliOfertasClienteCLIINCLUYECRC(String value) {
        return new JAXBElement<String>(_CliOfertasClienteCLIINCLUYECRC_QNAME, String.class, CliOfertasCliente.class, value);
    }

}
