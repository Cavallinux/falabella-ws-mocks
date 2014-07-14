package com.falabella.ws.services.validatetoken;

import org.springframework.stereotype.Service;

import com.falabella.mdwcorp.common.schema.clientservice.ClientServiceTYPE;
import com.falabella.mdwcorp.osb.schema.cmr.cl.cliente.validartoken.req_v2014.ValidarTokenRequestExp;
import com.falabella.mdwcorp.osb.schema.cmr.cl.cliente.validartoken.resp_v2014.ValidarTokenResponseExp;
import com.falabella.mdwcorp.osb.wsdl.cmr.cl.cliente.validartoken_v1_0.FaultMsg;
import com.falabella.mdwcorp.osb.wsdl.cmr.cl.cliente.validartoken_v1_0.ValidarTokenPt;

@Service("validateTokenService")
public class ValidateTokenServiceImpl implements ValidarTokenPt {

    @Override
    public ValidarTokenResponseExp validarTokenOp(ValidarTokenRequestExp parameters, ClientServiceTYPE clientServiceParam) throws FaultMsg {
	return new ValidarTokenResponseExp();
    }
}