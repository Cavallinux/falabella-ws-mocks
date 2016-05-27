package com.falabella.ws.utils;

import java.util.Random;

import com.falabella.ws.service.evaluacliente.ListaRechazos;
import com.falabella.ws.service.evaluacliente.Rechazo;
import com.falabella.ws.service.evaluacliente.RespEvaluaCliente;
import com.falabella.ws.service.evaluacliente.SalidaEvaluaCliente;

public class ListaRechazoUtils {
    public static ListaRechazos generateListaRechazos(boolean listaVacia, boolean semaforoRojoInmediato) {
	ListaRechazos listaRechazos = new ListaRechazos();
	
	if (!listaVacia) {
	    Rechazo rechazo = new Rechazo();
	    rechazo.setCODIGO((short) 1);
	    rechazo.setDESCRIPCION("No fue posible realizar la evaluacion");
	    rechazo.setPONDERACION((short) 5);
	    rechazo.setROJOINMEDIATO(semaforoRojoInmediato ? "S" : "N");
	    listaRechazos.getRECHAZO().add(rechazo);
	}
	
	return listaRechazos;
    }
    
    public static SalidaEvaluaCliente generateSalidaEvaluaCliente(String rutCliente, boolean positiveEvaluation){
	SalidaEvaluaCliente response = new SalidaEvaluaCliente();
	RespEvaluaCliente clientResponse = new RespEvaluaCliente();
	clientResponse.setCODIGO(positiveEvaluation ? 0 : -10);
	clientResponse.setRECHAZOS(generateListaRechazos(positiveEvaluation, new Random().nextBoolean()));
	clientResponse.setSEMAFORO(positiveEvaluation ? "Verde" : "Amarillo");
	clientResponse.setCLIENTEBANCO("S");
	clientResponse.setMENSAJE(positiveEvaluation ? "Exito" : "Cliente no es segmentable");
	response.setRESPUESTA(clientResponse);
	return response;	
    }
}