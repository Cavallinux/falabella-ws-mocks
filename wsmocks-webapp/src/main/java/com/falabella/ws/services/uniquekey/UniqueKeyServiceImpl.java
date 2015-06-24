package com.falabella.ws.services.uniquekey;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.falabella.mdwcorp.common.schema.clientservice.ClientServiceTYPE;
import com.falabella.mdwcorp.osb.schema.cmr.corp.cliente.validaclave.req_v2012.ValidarClaveRequestTYPE;
import com.falabella.mdwcorp.osb.schema.cmr.corp.cliente.validaclave.resp_v2012.ValidarClaveResponseTYPE;
import com.falabella.mdwcorp.osb.schema.cmr.corp.cliente.validaclave.resp_v2012.ValidarClaveResponseTYPE.OperacionStatus;
import com.falabella.mdwcorp.osb.wsdl.cmr.corp.switchriesgo.cliente.validaclave.valida_v1_0.FaultMsg;
import com.falabella.mdwcorp.osb.wsdl.cmr.corp.switchriesgo.cliente.validaclave.valida_v1_0.ValidarClavePt;

@Service("validateKeyService")
public class UniqueKeyServiceImpl implements ValidarClavePt {
    @Resource(name = "validPasswordsList")
    private List<String> validPasswords;
    private static Logger logger;
    
    static {
	logger = LoggerFactory.getLogger(UniqueKeyServiceImpl.class);
    }

    @Override
    public ValidarClaveResponseTYPE validaClaveOp(ValidarClaveRequestTYPE claveReqParam, ClientServiceTYPE clientServiceParam) throws FaultMsg {
	logger.debug("Params received: {}, {}", new Object[]{ToStringBuilder.reflectionToString(claveReqParam, ToStringStyle.MULTI_LINE_STYLE), ToStringBuilder.reflectionToString(clientServiceParam, ToStringStyle.MULTI_LINE_STYLE)});
	OperacionStatus operacionStatus = new OperacionStatus();
        String password = claveReqParam.getClave();
        
	if (validPasswords.contains(password)) {
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
        
        logger.debug("Response to be sent: {}", ToStringBuilder.reflectionToString(response, ToStringStyle.MULTI_LINE_STYLE));
        return response;
    }
}