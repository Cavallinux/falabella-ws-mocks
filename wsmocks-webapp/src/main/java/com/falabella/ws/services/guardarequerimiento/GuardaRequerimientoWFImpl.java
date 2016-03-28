package com.falabella.ws.services.guardarequerimiento;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.falabella.ws.service.guardarequerimiento.WSGuardaRequerimientoWF;

@Service("guardaRequerimientoWFService")
public class GuardaRequerimientoWFImpl implements WSGuardaRequerimientoWF {

    @Override
    public String requerimientoWF(String rut, String nombres, String apellidoPATERNO, String apellidoMATERNO,
	    String telefonoPARTICULAR, String celular, String descCIUDAD, String codCIUDAD, String mail,
	    String tipoREQUERIMIENTO, String concepto, String producto, String tipo, String motivo, String codSEGMENTO,
	    String areaINGRESO, String codOFICINA, String originador, String tipoFORMULARIO, String comentarios,
	    String malaATENCION, String ejecMALAATENCION, String sucMALAATENCION, String ejecSOLPGO) {
	StringBuilder response = new StringBuilder();
	Random random = new Random(100000);
	response.append("<WSGuardaSolicitudProd>");
	response.append("<RESPUESTA>");
	response.append(random.nextBoolean() ? "0" : "190");
	response.append("</RESPUESTA>");
	response.append("<NUM_REQUERIMIENTOWF>");
	response.append(random.nextLong() + 1);
	response.append("</NUM_REQUERIMIENTOWF>");
	response.append("<FECHA_INGRESO>");
	response.append(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
	response.append("</FECHA_INGRESO>");
	response.append("<FECHA_VENCIMIENTO>");
	response.append(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
	response.append("</FECHA_VENCIMIENTO>");
	response.append("<DEF_FLUJO>");
	response.append("Solicitud ingresada");
	response.append("</DEF_FLUJO>");
	response.append("<ERROR>");
	response.append("");
	response.append("</ERROR>");
	response.append("</WSGuardaSolicitudProd>");
	return response.toString();
    }
}
