package com.falabella.ws.beans.wfguardarequerimiento;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("WSGuardaSolicitudProd")
public class WFGuardaRequerimientoResponse implements Serializable {
    @XStreamAlias("RESPUESTA")
    private String responseCode;
    @XStreamAlias("NUM_REQUERIMIENTOWF")
    private String requestNumber;
    @XStreamAlias("FECHA_INGRESO")
    private String requestDate;
    @XStreamAlias("FECHA_VENCIMIENTO")
    private String expirationDate;
    @XStreamAlias("DEF_FLUJO")
    private String flowDescription;
    @XStreamAlias("ERROR")
    private String errorDescription;
    
    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getFlowDescription() {
        return flowDescription;
    }

    public void setFlowDescription(String flowDescription) {
        this.flowDescription = flowDescription;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public String getResponseCode() {
	return responseCode;
    }

    public void setResponseCode(String responseCode) {
	this.responseCode = responseCode;
    }

    public String getRequestNumber() {
	return requestNumber;
    }

    public void setRequestNumber(String requestNumber) {
	this.requestNumber = requestNumber;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }
}