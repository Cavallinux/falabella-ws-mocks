package com.falabella.ws.services.uniquekey;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
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
import com.falabella.mdwcorp.schema.cmr.cliente.v2012.DocumentoIdentidadType;

@Service("validateKeyService")
public class UniqueKeyServiceImpl implements ValidarClavePt {
    @Resource(name = "validPasswordsList")
    private List<String> validPasswords;
    @Resource(name = "rutAndPasswords")
    private Map<String, String> rutAndPasswords;
    private static Logger logger;

    static {
	logger = LoggerFactory.getLogger(UniqueKeyServiceImpl.class);
    }

    @Override
    public ValidarClaveResponseTYPE validaClaveOp(ValidarClaveRequestTYPE claveReqParam, ClientServiceTYPE clientServiceParam) throws FaultMsg {
	logger.debug("Params received: {}, {}", new Object[] { ToStringBuilder.reflectionToString(claveReqParam, ToStringStyle.MULTI_LINE_STYLE), ToStringBuilder.reflectionToString(clientServiceParam, ToStringStyle.MULTI_LINE_STYLE) });
	OperacionStatus operacionStatus = new OperacionStatus();
	DocumentoIdentidadType documentoIdentidad = claveReqParam.getDocumentoIdentidad();
	String dv = documentoIdentidad.getVerificadorDocumentoIdentidad();
	String rutAndDV = documentoIdentidad.getNumeroDocumentoIdentidad().concat(dv);

	if (rutAndPasswords.containsKey(rutAndDV)) {
	    String password = claveReqParam.getClave();
	    String passwordMap = rutAndPasswords.get(rutAndDV);
	    if (StringUtils.equals(password, passwordMap)) {
		operacionStatus.setCodigoStatus("00");
		operacionStatus.setGlosaStatus("Ok");
	    } else {
		operacionStatus.setCodigoStatus("90");
		operacionStatus.setGlosaStatus("Denied");
	    }
	} else {
	    operacionStatus.setCodigoStatus("06");
	    operacionStatus.setGlosaStatus("Hack para parsear 55 en la glosa");
	}

	ValidarClaveResponseTYPE response = new ValidarClaveResponseTYPE();
	response.setSistemaResolutor("Switch CMR");
	response.setNivelDeSeguridad("HIGH");
	response.setOperacionStatus(operacionStatus);

	logger.debug("Response to be sent: {}", ToStringBuilder.reflectionToString(response, ToStringStyle.MULTI_LINE_STYLE));
	return response;
    }
}