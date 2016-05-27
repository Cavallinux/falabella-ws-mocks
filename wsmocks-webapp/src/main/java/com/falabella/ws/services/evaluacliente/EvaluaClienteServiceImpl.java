package com.falabella.ws.services.evaluacliente;

import java.util.Random;

import javax.jws.WebService;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.falabella.ws.service.evaluacliente.EntradaEvaluaCliente;
import com.falabella.ws.service.evaluacliente.SalidaEvaluaCliente;
import com.falabella.ws.service.evaluacliente.ServicioEvalCliente;
import com.falabella.ws.utils.ListaRechazoUtils;

@WebService(targetNamespace = "http://control.evaluacionEnlinea.ws.bancofalabella.cl/", name = "ServicioEvalCliente")
@Service("evaluaClienteService")
public class EvaluaClienteServiceImpl implements ServicioEvalCliente {
    private static Random random;
    private static Logger logger;
    
    static {
	random = new Random();
	logger = LoggerFactory.getLogger(EvaluaClienteServiceImpl.class);
    }

    @Override
    public SalidaEvaluaCliente evaGenPondera(EntradaEvaluaCliente parameters) {
	logger.debug("Parametros recibidos: {}", ReflectionToStringBuilder.toString(parameters, ToStringStyle.MULTI_LINE_STYLE));
	SalidaEvaluaCliente response = ListaRechazoUtils.generateSalidaEvaluaCliente(String.valueOf(parameters.getCLIRUT()), random.nextBoolean());
	logger.debug("Respuesta enviada: {}", ReflectionToStringBuilder.toString(response, ToStringStyle.MULTI_LINE_STYLE));
	return response;
    }
}