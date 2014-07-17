package com.falabella.ws.services.panquery;

import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.falabella.mdwcorp.common.schema.clientservice.ClientServiceTYPE;
import com.falabella.mdwcorp.osb.schema.cmr.corp.tarjeta.consultaridclientepan.req_v2012.ConsultarIDClientePANRequestTYPE;
import com.falabella.mdwcorp.osb.schema.cmr.corp.tarjeta.consultaridclientepan.resp_v2012.ConsultarIDClientePANResponseTYPE;
import com.falabella.mdwcorp.osb.schema.cmr.corp.tarjeta.consultaridclientepan.resp_v2012.ConsultarIDClientePANResponseTYPE.OperacionStatus;
import com.falabella.mdwcorp.osb.wsdl.cmr.corp.satif.tarjeta.consultaridclientepan.consulta_v1_0.ConsultarIDClientePANPt;
import com.falabella.mdwcorp.osb.wsdl.cmr.corp.satif.tarjeta.consultaridclientepan.consulta_v1_0.FaultMsg;
import com.falabella.mdwcorp.schema.cmr.cliente.v2012.DocumentoIdentidadType;
import com.falabella.mdwcorp.schema.cmr.cliente.v2012.TipoDocumentoIdentidadTYPE;
import com.falabella.ws.utils.RUTUtils;

@Service("panQueryService")
public class PanQueryServiceImpl implements ConsultarIDClientePANPt {
    @Resource(name = "rutCreditCardsMap")
    private Map<String, String> rutCreditCards;

    @Override
    public ConsultarIDClientePANResponseTYPE consultaIDClientePANOp(ConsultarIDClientePANRequestTYPE clienteReqParam, ClientServiceTYPE clientServiceParam) throws FaultMsg {
	ConsultarIDClientePANResponseTYPE response = new ConsultarIDClientePANResponseTYPE();
	String creditCardNumber = clienteReqParam.getPAN();
	response.setPAN(creditCardNumber);
	Set<String> creditCards = rutCreditCards.keySet();

	if (creditCards.contains(creditCardNumber)) {
	    String rut = rutCreditCards.get(creditCardNumber);
	    
	    DocumentoIdentidadType documentoIdentidad = new DocumentoIdentidadType();
	    documentoIdentidad.setTipoDocumentoIdentidad(TipoDocumentoIdentidadTYPE.RUT);
	    documentoIdentidad.setNumeroDocumentoIdentidad(rut);
	    documentoIdentidad.setVerificadorDocumentoIdentidad(RUTUtils.getDV(Integer.parseInt(rut)));
	    
	    /*if ("6271801052479391".equals(creditCardNumber)) {
		documentoIdentidad.setNumeroDocumentoIdentidad("15956647");
		documentoIdentidad.setVerificadorDocumentoIdentidad("1");
	    } else if ("6271801077438026".equals(creditCardNumber)) {
		documentoIdentidad.setNumeroDocumentoIdentidad("22222222");
		documentoIdentidad.setVerificadorDocumentoIdentidad("2");
	    } else if ("4600720010114113".equals(creditCardNumber)) {
		documentoIdentidad.setNumeroDocumentoIdentidad("15956647");
		documentoIdentidad.setVerificadorDocumentoIdentidad("1");
	    } else if ("4051880400349994".equals(creditCardNumber)) {
		documentoIdentidad.setNumeroDocumentoIdentidad("18117235");
		documentoIdentidad.setVerificadorDocumentoIdentidad("5");
	    } else if ("4051885600446623".equals(creditCardNumber)) {
		documentoIdentidad.setNumeroDocumentoIdentidad("17671685");
		documentoIdentidad.setVerificadorDocumentoIdentidad("1");
	    } else if ("6271801077438025".equals(creditCardNumber)) {
		documentoIdentidad.setNumeroDocumentoIdentidad("1");
		documentoIdentidad.setVerificadorDocumentoIdentidad("9");
	    }*/
	    
	    OperacionStatus operacionStatus = new OperacionStatus();
	    operacionStatus.setCodigoStatus("00");
	    operacionStatus.setGlosaStatus("PAN Ok");

	    response.setDocumentoIdentidad(documentoIdentidad);
	    response.setOperacionStatus(operacionStatus);

	} else {
	    OperacionStatus operacionStatus = new OperacionStatus();
	    operacionStatus.setCodigoStatus("05");
	    operacionStatus.setGlosaStatus("Error de validacion");
	    response.setOperacionStatus(operacionStatus);
	}
	
	return response;
    }
}
