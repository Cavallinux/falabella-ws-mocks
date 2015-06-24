package com.falabella.ws.services.admincu;

import java.util.Set;

import javax.annotation.Resource;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import cl.taisachile.scc.ws.AdministrationCUWS;
import cl.taisachile.scc.ws.ChangeLevelSecurityParamVO;
import cl.taisachile.scc.ws.ChangeLevelSecurityResponseVO;
import cl.taisachile.scc.ws.ChangePasswordParamVO;
import cl.taisachile.scc.ws.ChangePasswordResponseVO;
import cl.taisachile.scc.ws.CreateUserParamVO;
import cl.taisachile.scc.ws.CreateUserResponseVO;
import cl.taisachile.scc.ws.DeleteUserCUParamVO;
import cl.taisachile.scc.ws.DeleteUserCUResponseVO;
import cl.taisachile.scc.ws.ExistActivationCodeCurrentParamVO;
import cl.taisachile.scc.ws.ExistActivationCodeCurrentResponseVO;
import cl.taisachile.scc.ws.GenerateChangePasswordSecurityCodeParamVO;
import cl.taisachile.scc.ws.GenerateChangePasswordSecurityCodeResponseVO;
import cl.taisachile.scc.ws.GetGenericOptionsParamVO;
import cl.taisachile.scc.ws.GetGenericOptionsResponseVO;
import cl.taisachile.scc.ws.GetUserCUParamVO;
import cl.taisachile.scc.ws.GetUserCUResponseVO;
import cl.taisachile.scc.ws.LockUserParamVO;
import cl.taisachile.scc.ws.LockUserResponseVO;
import cl.taisachile.scc.ws.QuestionAnswerVO;
import cl.taisachile.scc.ws.UserVO;
import cl.taisachile.scc.ws.ValidateChangePasswordSecurityCodeParamVO;
import cl.taisachile.scc.ws.ValidateChangePasswordSecurityCodeResponseVO;
import cl.taisachile.scc.ws.ValidateSecurityCodeParamVO;
import cl.taisachile.scc.ws.ValidateSecurityCodeResponseVO;

@Service("adminCUService")
public class AdministrationCUWSImpl implements AdministrationCUWS {
    @Resource(name = "validRutSet")
    private Set<String> validRuts;
    private static Logger logger;
    
    static {
	logger = LoggerFactory.getLogger(AdministrationCUWSImpl.class);
    }
    
    @Override
    public GetUserCUResponseVO getUserCU(GetUserCUParamVO params) {
	logger.debug("Param received: {}", ToStringBuilder.reflectionToString(params, ToStringStyle.MULTI_LINE_STYLE));
	GetUserCUResponseVO response = new GetUserCUResponseVO();
	UserVO userVO = params.getUserVO();
	String userId = userVO.getUserId();
	boolean isValid = validRuts.contains(userId);
	response.setErrorCode(isValid ? 0 : 14);
	QuestionAnswerVO questionAnswer = new QuestionAnswerVO();
	questionAnswer.setAnswer("Prueba");
	questionAnswer.setGroupId("CMRCL");
	questionAnswer.setQuestion("Pregunta?");
	questionAnswer.setUserId(userId);
	questionAnswer.setUserIdType(userVO.getUserIdType());
	response.getQuestionsAnswers().add(questionAnswer);
	response.setUser(userVO);
	logger.debug("Response to be sent: {}", ToStringBuilder.reflectionToString(params, ToStringStyle.MULTI_LINE_STYLE));
	return response;
    }

    @Override
    public ValidateSecurityCodeResponseVO validateSecurityCode(ValidateSecurityCodeParamVO params) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public ChangeLevelSecurityResponseVO changeLevelSecurity(ChangeLevelSecurityParamVO params) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public ChangePasswordResponseVO changePassword(ChangePasswordParamVO params) {
	return null;
    }

    @Override
    public CreateUserResponseVO createUser(CreateUserParamVO params) {
	return null;
    }

    @Override
    public ValidateChangePasswordSecurityCodeResponseVO validateChangePasswordSecurityCode(ValidateChangePasswordSecurityCodeParamVO params) {
	return null;
    }

    @Override
    public DeleteUserCUResponseVO deleteUserCU(DeleteUserCUParamVO params) {
	return null;
    }

    @Override
    public LockUserResponseVO lockUserByDevice(LockUserParamVO params) {
	return null;
    }

    @Override
    public ExistActivationCodeCurrentResponseVO existChangePasswordSecurityCodeCurrent(ExistActivationCodeCurrentParamVO params) {
	return null;
    }

    @Override
    public GenerateChangePasswordSecurityCodeResponseVO generateChangePasswordSecurityCode(GenerateChangePasswordSecurityCodeParamVO params) {
	return null;
    }

    @Override
    public GetGenericOptionsResponseVO getGenericOptions(GetGenericOptionsParamVO params) {
	return null;
    }
}