package com.falabella.ws.services.uniquekey;

import org.springframework.stereotype.Service;

import com.falabella.mdwcorp.common.schema.clientservice.ClientServiceTYPE;
import com.falabella.mdwcorp.osb.schema.cmr.corp.cliente.validaclave.req_v2012.ValidarClaveRequestTYPE;
import com.falabella.mdwcorp.osb.schema.cmr.corp.cliente.validaclave.resp_v2012.ValidarClaveResponseTYPE;
import com.falabella.mdwcorp.osb.schema.cmr.corp.cliente.validaclave.resp_v2012.ValidarClaveResponseTYPE.OperacionStatus;
import com.falabella.mdwcorp.osb.wsdl.cmr.corp.switchriesgo.cliente.validaclave.valida_v1_0.FaultMsg;
import com.falabella.mdwcorp.osb.wsdl.cmr.corp.switchriesgo.cliente.validaclave.valida_v1_0.ValidarClavePt;

@Service("validateKeyService")
public class UniqueKeyServiceImpl implements ValidarClavePt {

    @Override
    public ValidarClaveResponseTYPE validaClaveOp(ValidarClaveRequestTYPE claveReqParam, ClientServiceTYPE clientServiceParam) throws FaultMsg {
	OperacionStatus operacionStatus = new OperacionStatus();
        String password = claveReqParam.getClave();
        
	if ("1234".endsWith(password) || "1234567890".endsWith(password)) {
            operacionStatus.setCodigoStatus("00");
            operacionStatus.setGlosaStatus("Ok");
        } else if ("9999999999".equals(password)) {
            operacionStatus.setCodigoStatus("06");
            operacionStatus.setGlosaStatus("Hack para parsear 55 en la glosa");
        } else if ("8888888888".equals(password)) {
            operacionStatus.setCodigoStatus("55");
            operacionStatus.setGlosaStatus("Hola");
        } else {
            operacionStatus.setCodigoStatus("90");
            operacionStatus.setGlosaStatus("Denied");
        }
        
        ValidarClaveResponseTYPE response = new ValidarClaveResponseTYPE();
        response.setSistemaResolutor("Switch CMR");
        response.setNivelDeSeguridad("HIGH");
        response.setOperacionStatus(operacionStatus);
        return response;
    }
}