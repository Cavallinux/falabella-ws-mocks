package com.falabella.ws.services.aumentocupo;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.falabella.ws.service.aumentocupo.AumentoCupoImpl;
import com.falabella.ws.service.aumentocupo.RespuestaVO;

@Service("aumentoCupoService")
public class AumentoCupoServiceImpl implements AumentoCupoImpl {
    private static Logger logger;
    
    static{
	logger = LoggerFactory.getLogger(AumentoCupoServiceImpl.class);
    }

    @Override
    public RespuestaVO aplicarAumentoCupoLC(Integer rut, Double numeroCuenta, Short sucursal, Integer usuario, Double monto) {
	RespuestaVO response = new RespuestaVO();
	boolean applyOffer = (new Random().nextBoolean());
	logger.debug("Apply LC offer? {}", applyOffer);
	response.setCodigoRespuesta(applyOffer ? (short) 0 : (short) 1);
	response.setMensajeRespuesta(applyOffer ? "Aumento de cupo aplicado" : "No se pudo aplicar oferta");
	return response;
    }

    @Override
    public RespuestaVO aplicarAumentoCupoTC(Integer rut, String numeroTarjeta, Short sucursal, Integer usuario, Double cupoOtorgado, Double cupoActual, String flagDolar) { 
	RespuestaVO response = new RespuestaVO();
	boolean applyOffer = new Random().nextBoolean();
	logger.debug("Apply TC offer? {}", applyOffer);
	response.setCodigoRespuesta(applyOffer ? (short) 0 : (short) 1);
	response.setMensajeRespuesta(applyOffer ? "Aumento de cupo aplicado" : "No se pudo aplicar oferta");
	return response;
    }
}
