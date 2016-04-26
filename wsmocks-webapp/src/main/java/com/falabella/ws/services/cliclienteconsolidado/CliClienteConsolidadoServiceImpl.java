package com.falabella.ws.services.cliclienteconsolidado;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.falabella.ws.service.cliclienteconsolidado.ArrayOfCliOfertasClienteMsgLiteral;
import com.falabella.ws.service.cliclienteconsolidado.ArrayOfCliResumenConMsgLiteral;
import com.falabella.ws.service.cliclienteconsolidado.BancoFalabellaException_Exception;
import com.falabella.ws.service.cliclienteconsolidado.CliClienteConsolidado;
import com.falabella.ws.service.cliclienteconsolidado.CliOfertasClienteMsg;

@Service("cliClienteConsolidadoService")
public class CliClienteConsolidadoServiceImpl implements CliClienteConsolidado {
    private static Logger logger;
    
    static{
	logger = LoggerFactory.getLogger(CliClienteConsolidadoServiceImpl.class);
    }

    @Override
    public ArrayOfCliResumenConMsgLiteral cliResumenCon(long cliCLIENTERUT) throws BancoFalabellaException_Exception {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public ArrayOfCliOfertasClienteMsgLiteral cliOfertasCliente(long cliCLIENTERUT, String cliINCLUYETODASLASOFERTAS,
	    String cliINCLUYEOFERTAMANTENCION, String cliINCLUYELCC, String cliINCLUYELCD, String cliINCLUYECRC,
	    String cliINCLUYERDDCONSOLIDACION, String cliINCLUYEAPERTURALCC, String cliINCLUYETCR)
	    throws BancoFalabellaException_Exception {
	Random random = new Random();
	ArrayOfCliOfertasClienteMsgLiteral response = new ArrayOfCliOfertasClienteMsgLiteral();
	List<CliOfertasClienteMsg> offers = new ArrayList<CliOfertasClienteMsg>();
	CliOfertasClienteMsg lineOffer = new CliOfertasClienteMsg();
	lineOffer.setCLIPRODUCTOCODIGO((short) 19);
	boolean hasOffer = random.nextBoolean();
	Object[] logArguments = new Object[] { cliCLIENTERUT, hasOffer };
	logger.debug("Rut {} has Line Credit Offers? {}", logArguments);
	lineOffer.setCLISOLICITUDMONTO(new BigDecimal(hasOffer ? "600000" : "0"));
	CliOfertasClienteMsg creditOffer = new CliOfertasClienteMsg();
	creditOffer.setCLIPRODUCTOCODIGO((short) 18);
	hasOffer = true;random.nextBoolean();
	logArguments = new Object[] { cliCLIENTERUT, hasOffer };
	logger.debug("Rut {} has Credit Card Offers? {}", logArguments);
	creditOffer.setCLISOLICITUDMONTO(new BigDecimal(hasOffer ? "500000" : "0"));
	offers.add(creditOffer);
	offers.add(lineOffer);
	response.getCliOfertasClienteMsg().addAll(offers);
	return response;
    }
}
