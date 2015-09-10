package com.falabella.ws.services.clienteidentidadvalidar;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.falabella.mdwcorp.common.schema.clientservice.ClientServiceTYPE;
import com.falabella.mdwcorp.osb.schema.fif.corp.cliente.identidad.validar.req_v2015.ClienteIdentidadValidarExpReqTYPE;
import com.falabella.mdwcorp.osb.schema.fif.corp.cliente.identidad.validar.resp_v2015.ClienteIdentidadValidarExpRespTYPE;
import com.falabella.mdwcorp.osb.wsdl.fif.corp.cliente.identidad.validar_v1_0.ClienteIdentidadValidarPt;
import com.falabella.mdwcorp.osb.wsdl.fif.corp.cliente.identidad.validar_v1_0.FaultMsg;

public class ClienteIdentidadValidarServiceImpl implements ClienteIdentidadValidarPt {
	private static Logger logger;
	
	static {
		logger = LoggerFactory.getLogger(ClienteIdentidadValidarServiceImpl.class);
	}

	@Override
	public ClienteIdentidadValidarExpRespTYPE clienteIdentidadValidarOp(ClienteIdentidadValidarExpReqTYPE clienteIdentidadValidarReqParam, ClientServiceTYPE clientServiceParam) throws FaultMsg {
		logger.debug("Parametros recibidos: {}", ReflectionToStringBuilder.toString(clienteIdentidadValidarReqParam, ToStringStyle.MULTI_LINE_STYLE));
		return new ClienteIdentidadValidarExpRespTYPE();
	}

}
