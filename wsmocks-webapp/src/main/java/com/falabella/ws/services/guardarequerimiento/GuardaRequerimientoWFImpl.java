package com.falabella.ws.services.guardarequerimiento;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.falabella.ws.beans.wfguardarequerimiento.WFGuardaRequerimientoResponse;
import com.falabella.ws.service.guardarequerimiento.WSGuardaRequerimientoWF;
import com.thoughtworks.xstream.XStream;

@Service("guardaRequerimientoWFService")
public class GuardaRequerimientoWFImpl implements WSGuardaRequerimientoWF {
    @Resource(name = "wfGuardaReqMarshaller")
    private XStream marshaller;
    private static Random random;
    private static DateFormat formatter;
    private static Logger logger;
    
    static {
	random = new Random(System.currentTimeMillis());
	formatter = new SimpleDateFormat("dd/MM/yyyy");
	logger = LoggerFactory.getLogger(GuardaRequerimientoWFImpl.class);
    }

    @Override
    public String requerimientoWF(String rut, String nombres, String apellidoPATERNO, String apellidoMATERNO,
	    String telefonoPARTICULAR, String celular, String descCIUDAD, String codCIUDAD, String mail,
	    String tipoREQUERIMIENTO, String concepto, String producto, String tipo, String motivo, String codSEGMENTO,
	    String areaINGRESO, String codOFICINA, String originador, String tipoFORMULARIO, String comentarios,
	    String malaATENCION, String ejecMALAATENCION, String sucMALAATENCION, String ejecSOLPGO) {
	Object[] params = new Object[] { rut, nombres, apellidoPATERNO, apellidoMATERNO, telefonoPARTICULAR, celular,
		descCIUDAD, codCIUDAD, mail, tipoREQUERIMIENTO, concepto, producto, tipoFORMULARIO, comentarios,
		malaATENCION, ejecMALAATENCION, sucMALAATENCION, ejecSOLPGO };
	logger.debug("Realizando requerimiento con los siguientes parametros: {}", params);
	Date now = new Date();
	String dateFormatted = formatter.format(now);
	WFGuardaRequerimientoResponse response = new WFGuardaRequerimientoResponse();
	boolean acceptedRequest = random.nextBoolean();
	response.setResponseCode(acceptedRequest ? "0" : "190");
	response.setRequestNumber(String.valueOf(random.nextLong() + 1));
	response.setRequestDate(dateFormatted);
	response.setExpirationDate(dateFormatted);
	response.setFlowDescription(acceptedRequest ? "Solicitud aceptada" : "Solicitud rechazada");
	response.setErrorDescription(acceptedRequest ? StringUtils.EMPTY : "Error en la solicitud");
	logger.debug("Respuesta a requerimiento: {}", marshaller.toXML(response));
	return marshaller.toXML(response);
    }
}