package com.falabella.ws.services.admin.base;

import cl.taisachile.scc.ws.ActivateSoftTokenParamVO;
import cl.taisachile.scc.ws.ActivateSoftTokenResponseVO;
import cl.taisachile.scc.ws.AddDailyAmountParamVO;
import cl.taisachile.scc.ws.AddDailyAmountResponseVO;
import cl.taisachile.scc.ws.AdministrationWS;
import cl.taisachile.scc.ws.AssignGridParamVO;
import cl.taisachile.scc.ws.AssignGridResponseVO;
import cl.taisachile.scc.ws.AssignTokenParamVO;
import cl.taisachile.scc.ws.AssignTokenResponseVO;
import cl.taisachile.scc.ws.CreateSoftTokenParamVO;
import cl.taisachile.scc.ws.CreateSoftTokenResponseVO;
import cl.taisachile.scc.ws.GetCellsParamVO;
import cl.taisachile.scc.ws.GetCellsResponseVO;
import cl.taisachile.scc.ws.GetTransaParamVO;
import cl.taisachile.scc.ws.GetTransaResponseVO;
import cl.taisachile.scc.ws.GetUserParamVO;
import cl.taisachile.scc.ws.GetUserResponseMGVO;
import cl.taisachile.scc.ws.GetUserResponseVO;
import cl.taisachile.scc.ws.LockDeviceParamVO;
import cl.taisachile.scc.ws.LockDeviceResponseVO;
import cl.taisachile.scc.ws.UnlockDeviceParamVO;
import cl.taisachile.scc.ws.UnlockDeviceResponseVO;

public abstract class AdministrationWSBase implements AdministrationWS {

    @Override
    public CreateSoftTokenResponseVO createSoftToken(CreateSoftTokenParamVO params) {
	return null;
    }

    @Override
    public AssignTokenResponseVO assignToken(AssignTokenParamVO params) {
	return null;
    }

    @Override
    public AssignGridResponseVO assignGrid(AssignGridParamVO params) {
	return null;
    }

    @Override
    public GetTransaResponseVO getGeneratedChallengeByClient(GetTransaParamVO params) {
	return null;
    }

    @Override
    public GetUserResponseMGVO getUserMG(GetUserParamVO getUserParam) {
	return null;
    }

    @Override
    public GetUserResponseVO getUser(GetUserParamVO getUserParam) {
	return null;
    }

    @Override
    public AddDailyAmountResponseVO addDailyAmount(AddDailyAmountParamVO addDailyAmountParam) {
	return null;
    }

    @Override
    public ActivateSoftTokenResponseVO activateSoftToken(ActivateSoftTokenParamVO params) {
	return null;
    }

    @Override
    public LockDeviceResponseVO lockDevice(LockDeviceParamVO params) {
	return null;
    }

    @Override
    public GetCellsResponseVO getCells(GetCellsParamVO params) {
	return null;
    }

    @Override
    public UnlockDeviceResponseVO unlockDevice(UnlockDeviceParamVO params) {
	return null;
    }
}