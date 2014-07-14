package com.falabella.ws.services.admincu.base;

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
import cl.taisachile.scc.ws.ValidateChangePasswordSecurityCodeParamVO;
import cl.taisachile.scc.ws.ValidateChangePasswordSecurityCodeResponseVO;
import cl.taisachile.scc.ws.ValidateSecurityCodeParamVO;
import cl.taisachile.scc.ws.ValidateSecurityCodeResponseVO;

public abstract class AdministrationCUWSBase implements AdministrationCUWS {
    protected String[] RUT_VALIDOS = new String[] { "159566471", "13450594K", "222222222", "19", "181172355" , "176716851"};

    @Override
    public ValidateSecurityCodeResponseVO validateSecurityCode(ValidateSecurityCodeParamVO params) {
	return null;
    }

    @Override
    public ChangeLevelSecurityResponseVO changeLevelSecurity(ChangeLevelSecurityParamVO params) {
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
    public GetUserCUResponseVO getUserCU(GetUserCUParamVO params) {
	return null;
    }

    @Override
    public GetGenericOptionsResponseVO getGenericOptions(GetGenericOptionsParamVO params) {
	return null;
    }
}