package com.falabella.ws.services.clienteidentidadvalidar;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.falabella.mdwcorp.common.schema.clientservice.ClientServiceTYPE;
import com.falabella.mdwcorp.osb.schema.fif.corp.cliente.identidad.validar.req_v2015.ClienteIdentidadValidarExpReqTYPE;
import com.falabella.mdwcorp.osb.schema.fif.corp.cliente.identidad.validar.req_v2015.ClienteTYPE;
import com.falabella.mdwcorp.osb.schema.fif.corp.cliente.identidad.validar.resp_v2015.ClienteIdentidadValidarExpRespTYPE;
import com.falabella.mdwcorp.osb.schema.fif.corp.cliente.identidad.validar.resp_v2015.RespuestaTYPE;
import com.falabella.mdwcorp.osb.wsdl.fif.corp.cliente.identidad.validar_v1_0.ClienteIdentidadValidarPt;
import com.falabella.mdwcorp.osb.wsdl.fif.corp.cliente.identidad.validar_v1_0.FaultMsg;

@Service("robustAuthenticationService")
public class ClienteIdentidadValidarServiceImpl implements ClienteIdentidadValidarPt {
    @Resource(name = "rutAndPasswords")
    private Map<String, String> rutAndPasswords;
    private Pattern pattern;
    private static Logger logger;

    @PostConstruct
    public void init() {
	pattern = Pattern.compile("^[a-zA-Z0-9]$");
    }

    static {
	logger = LoggerFactory.getLogger(ClienteIdentidadValidarServiceImpl.class);
    }

    @Override
    public ClienteIdentidadValidarExpRespTYPE clienteIdentidadValidarOp(ClienteIdentidadValidarExpReqTYPE clienteIdentidadValidarReqParam, ClientServiceTYPE clientServiceParam) throws FaultMsg {
	logger.debug("Parametros recibidos: {}", ReflectionToStringBuilder.toString(clienteIdentidadValidarReqParam, ToStringStyle.MULTI_LINE_STYLE));
	ClienteIdentidadValidarExpRespTYPE response = new ClienteIdentidadValidarExpRespTYPE();
	RespuestaTYPE authResponse = new RespuestaTYPE();
	ClienteTYPE datosCliente = clienteIdentidadValidarReqParam.getCliente();
	List<String> listaClaves = datosCliente.getClave();
	String clave = listaClaves.get(0);

	if (rutAndPasswords.containsKey(datosCliente.getNumeroDocumento())) {
	    String passwordMap = rutAndPasswords.get(datosCliente.getNumeroDocumento());
	    if (StringUtils.equals(clave, passwordMap)) {
		authResponse.setCodigoRespuesta("201");
		authResponse.setGlosaRespuesta("Operaci\u00f3n realizada satisfactoriamente.");
	    } else {
		int passwordLength = clave.length();

		if (passwordLength < 6) {
		    authResponse.setCodigoRespuesta("412");
		    authResponse.setGlosaRespuesta("La contrase\u00d1a debe tener 6 d\u00edgitos.");
		} else {
		    Matcher matcher = pattern.matcher(clave);
		    if (matcher.matches()) {
			authResponse.setCodigoRespuesta("753");
			authResponse.setGlosaRespuesta("Autenticaci\u00f3n fallida.");
		    } else {
			authResponse.setCodigoRespuesta("468");
			authResponse.setGlosaRespuesta("Contrase\u00d1a bloqueada por reintentos fallidos");
		    }
		}
	    }
	} else {
	    authResponse.setCodigoRespuesta("410");
	    authResponse.setGlosaRespuesta("Usuario inexistente");
	}

	response.setRespuesta(authResponse);
	logger.debug("Respuesta a enviar: {}", ReflectionToStringBuilder.toString(response, ToStringStyle.MULTI_LINE_STYLE));
	return response;
    }
}
