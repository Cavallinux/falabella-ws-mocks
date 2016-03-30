package com.falabella.ws.services.validatetoken;

import java.util.Set;

import javax.annotation.Resource;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.falabella.mdwcorp.common.schema.clientservice.ClientServiceTYPE;
import com.falabella.mdwcorp.osb.schema.cmr.cl.cliente.validartoken.req_v2014.ValidarTokenRequestExp;
import com.falabella.mdwcorp.osb.schema.cmr.cl.cliente.validartoken.resp_v2014.ValidarTokenResponseExp;
import com.falabella.mdwcorp.osb.wsdl.cmr.cl.cliente.validartoken_v1_0.FaultMsg;
import com.falabella.mdwcorp.osb.wsdl.cmr.cl.cliente.validartoken_v1_0.ValidarTokenPt;

@Service("validateTokenService")
public class ValidateTokenServiceImpl implements ValidarTokenPt {
    @Resource(name = "validTokensSet")
    private Set<String> validTokens;
    private static Logger logger;

    static {
	logger = LoggerFactory.getLogger(ValidateTokenServiceImpl.class);
    }

    @Override
    public ValidarTokenResponseExp validarTokenOp(ValidarTokenRequestExp parameters,ClientServiceTYPE clientServiceParam) throws FaultMsg {
	logger.debug("Parameters received: {} {}", new Object[] { ToStringBuilder.reflectionToString(parameters, ToStringStyle.MULTI_LINE_STYLE), ToStringBuilder.reflectionToString(clientServiceParam, ToStringStyle.MULTI_LINE_STYLE) });
	String token = parameters.getToken();
	ValidarTokenResponseExp validarTokenResponseExp = new ValidarTokenResponseExp();

	if (validTokens.contains(token)) {
	    validarTokenResponseExp.setCodigo(new String("00"));
	    validarTokenResponseExp.setMensaje(new String("Login con éxito"));
	} else {
	    validarTokenResponseExp.setCodigo(new String("03"));
	    validarTokenResponseExp.setMensaje(new String("Error genérico"));
	}
	validarTokenResponseExp.setRut(new String("1-9"));
	validarTokenResponseExp.setUrlRespuesta(new String("http://respuesta.cl"));

	logger.debug("Response to be sent:_{}", ToStringBuilder.reflectionToString(validarTokenResponseExp, ToStringStyle.MULTI_LINE_STYLE));

	return validarTokenResponseExp;
    }
}