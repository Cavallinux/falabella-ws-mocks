package com.falabella.ws.services.admincu.impl;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Service;

import com.falabella.ws.services.admincu.base.AdministrationCUWSBase;

import cl.taisachile.scc.ws.GetUserCUParamVO;
import cl.taisachile.scc.ws.GetUserCUResponseVO;
import cl.taisachile.scc.ws.QuestionAnswerVO;

@Service("adminCUService")
public class AdministrationCUWSImpl extends AdministrationCUWSBase {
    @Override
    public GetUserCUResponseVO getUserCU(GetUserCUParamVO params) {
	GetUserCUResponseVO response = new GetUserCUResponseVO();
	String userId = params.getUserVO().getUserId();
	boolean isValid = ArrayUtils.contains(RUT_VALIDOS, userId);
	response.setErrorCode(isValid ? 0 : -1);
	QuestionAnswerVO questionAnswer = new QuestionAnswerVO();
	questionAnswer.setAnswer("Prueba");
	questionAnswer.setGroupId("CMRCL");
	questionAnswer.setQuestion("Pregunta?");
	questionAnswer.setUserId(userId);
	questionAnswer.setUserIdType(params.getUserVO().getUserIdType());
	response.getQuestionsAnswers().add(questionAnswer);
	response.setUser(params.getUserVO());
	return response;
    }
}