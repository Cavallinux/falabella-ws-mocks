package com.falabella.ws.services.auth;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.taisachile.scc.ws.AuthenticateOTPParamVO;
import cl.taisachile.scc.ws.AuthenticateParamVO;
import cl.taisachile.scc.ws.AuthenticateResponseCUVO;
import cl.taisachile.scc.ws.AuthenticateResponseVO;
import cl.taisachile.scc.ws.AuthenticationWS;
import cl.taisachile.scc.ws.GetChallengeOTPParamVO;
import cl.taisachile.scc.ws.GetChallengeParamVO;
import cl.taisachile.scc.ws.GetChallengeResponseVO;

import com.falabella.ws.utils.RandomUtils;

@Service("authenticationService")
public class AuthenticationWSImpl implements AuthenticationWS {

    public GetChallengeResponseVO getChallengeOTPCorp(GetChallengeOTPParamVO getChallengeParamOTPCorp) {
	GetChallengeResponseVO response = new GetChallengeResponseVO();
	response.setErrorCode(0);
	response.setErrorMessage("Ok");
	response.setDeviceType("OTP");
	return response;
    }

    public AuthenticateResponseVO authenticateOTPCorp(AuthenticateOTPParamVO authenticateOTPCorpParam) {
	AuthenticateResponseVO response = new AuthenticateResponseVO();
	String challengeResponse = authenticateOTPCorpParam.getChallengeResponse().get(0);

	if ("1234".equals(challengeResponse)) {
	    response.setErrorCode(0);
	    response.setErrorMessage("OK");
	} else {
	    response.setErrorCode(1);
	    response.setErrorMessage("Contraseña incorrecta");
	}
	return response;
    }

    public GetChallengeResponseVO getChallengeOTP(GetChallengeOTPParamVO getChallengeParamOTP) {
	GetChallengeResponseVO response = new GetChallengeResponseVO();
	response.setErrorCode(0);
	response.setErrorMessage("OK");
	response.setDeviceType("OTP");
	return response;
    }

    public GetChallengeResponseVO getChallenge(GetChallengeParamVO getChallengeParam) {
	GetChallengeResponseVO response = new GetChallengeResponseVO();
	response.setErrorCode(0);
	response.setErrorMessage("OK");
	response.setDeviceType("GRID");
	response.getChallenge().addAll(RandomUtils.generateGridChallenge());

	return response;
    }

    public AuthenticateResponseCUVO authenticateCU(AuthenticateParamVO authenticateParam) {
	return null;
    }

    public AuthenticateResponseVO authenticateOTP(AuthenticateOTPParamVO authenticateOTPParam) {
	List<String> responses = authenticateOTPParam.getChallengeResponse();

	String respond = responses.get(0);
	AuthenticateResponseVO response = new AuthenticateResponseVO();
	if ("1234".equalsIgnoreCase(respond)) {
	    response.setErrorCode(0);
	    response.setErrorMessage("OK");
	} else {
	    response.setErrorCode(-1);
	    response.setErrorMessage("No ok");
	}

	return response;
    }

    public AuthenticateResponseVO authenticate(AuthenticateParamVO authenticateParam) {
	List<String> responses = authenticateParam.getChallengeResponse();
	AuthenticateResponseVO response = new AuthenticateResponseVO();
	boolean isValid = true;
	for (String stringResponse : responses) {
	    if (!"12".equals(stringResponse)) {
		isValid = false;
		break;
	    }
	}

	if (responses.get(0).equals("00")) {
	    response.setErrorCode(13);
	    response.setErrorMessage("Max attempts exceeded");
	    return response;
	} else if (responses.get(0).equals("01")) {
	    response.setErrorCode(11);
	    response.setErrorMessage("Retry");
	} else {
	    response.setErrorCode(isValid ? 0 : -1);
	    response.setErrorMessage(isValid ? "Ok" : "Denied");
	}
	return response;
    }
}