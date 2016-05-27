package com.falabella.ws.service.evaluacliente;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-27T13:49:44.532-03:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "WSEvaluaCliente", 
                  wsdlLocation = "file:/home/cavallinux/dev/src/bancofalabella/falabella-ws-mocks/servicioevalcliente-wsserver/src/main/wsdl/WSEvaluaCliente_1.wsdl",
                  targetNamespace = "http://control.evaluacionEnlinea.ws.bancofalabella.cl/") 
public class WSEvaluaCliente extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://control.evaluacionEnlinea.ws.bancofalabella.cl/", "WSEvaluaCliente");
    public final static QName Operaciones = new QName("http://control.evaluacionEnlinea.ws.bancofalabella.cl/", "Operaciones");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/cavallinux/dev/src/bancofalabella/falabella-ws-mocks/servicioevalcliente-wsserver/src/main/wsdl/WSEvaluaCliente_1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WSEvaluaCliente.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/cavallinux/dev/src/bancofalabella/falabella-ws-mocks/servicioevalcliente-wsserver/src/main/wsdl/WSEvaluaCliente_1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WSEvaluaCliente(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WSEvaluaCliente(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSEvaluaCliente() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public WSEvaluaCliente(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WSEvaluaCliente(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WSEvaluaCliente(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ServicioEvalCliente
     */
    @WebEndpoint(name = "Operaciones")
    public ServicioEvalCliente getOperaciones() {
        return super.getPort(Operaciones, ServicioEvalCliente.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioEvalCliente
     */
    @WebEndpoint(name = "Operaciones")
    public ServicioEvalCliente getOperaciones(WebServiceFeature... features) {
        return super.getPort(Operaciones, ServicioEvalCliente.class, features);
    }

}
