package com.falabella.ws.services.admin;

import org.springframework.stereotype.Service;

import cl.taisachile.scc.ws.ActivateSoftTokenParamVO;
import cl.taisachile.scc.ws.ActivateSoftTokenResponseVO;
import cl.taisachile.scc.ws.AddDailyAmountParamVO;
import cl.taisachile.scc.ws.AddDailyAmountResponseVO;
import cl.taisachile.scc.ws.AdministrationWS;
import cl.taisachile.scc.ws.AssignGridParamVO;
import cl.taisachile.scc.ws.AssignGridResponseVO;
import cl.taisachile.scc.ws.AssignTokenParamVO;
import cl.taisachile.scc.ws.AssignTokenResponseVO;
import cl.taisachile.scc.ws.ContactoInfoVO;
import cl.taisachile.scc.ws.CreateSoftTokenParamVO;
import cl.taisachile.scc.ws.CreateSoftTokenResponseVO;
import cl.taisachile.scc.ws.DeviceVO;
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

@Service("administrationService")
public class AdministrationWSImpl implements AdministrationWS {
	@Override
	public GetUserResponseVO getUser(GetUserParamVO getUserParam) {
		GetUserResponseVO response = new GetUserResponseVO();
		ContactoInfoVO contactInfo = new ContactoInfoVO();
		contactInfo.setLabel("EMAIL");
		contactInfo.setValue("pmezzano@experti.cl");
		response.getUserInfo().add(contactInfo);

		DeviceVO device = new DeviceVO();
		device.setAttemptsRemaining(3);
		device.setState("CURRENT");

		String userId = getUserParam.getUserVO().getUserId();
		if ("19".equals(userId) || "13450594k".equalsIgnoreCase(userId) || "176716851".equalsIgnoreCase(userId)) {
			device.setType("GRID");
			device.setAttemptsRemaining(1);
		} else if ("12345678".equals(userId)) {
			device.setType("OTP");
		} else if ("159566471".equals(userId)) {
			device.setType("OTP");
		} else if ("222222222".equals(userId)) {
			device.setType("OTP_SMS");
		} else {
			device.setType("GRID");
		}

		response.setFullName("Rodrigo Villablanca");
		response.setErrorCode(0);
		response.setErrorMessage("Ok");
		response.setUser(getUserParam.getUserVO());
		response.getDevices().add(device);
		return response;
	}

	@Override
	public CreateSoftTokenResponseVO createSoftToken(CreateSoftTokenParamVO params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AssignTokenResponseVO assignToken(AssignTokenParamVO params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AssignGridResponseVO assignGrid(AssignGridParamVO params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetTransaResponseVO getGeneratedChallengeByClient(GetTransaParamVO params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetUserResponseMGVO getUserMG(GetUserParamVO getUserParam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddDailyAmountResponseVO addDailyAmount(AddDailyAmountParamVO addDailyAmountParam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActivateSoftTokenResponseVO activateSoftToken(ActivateSoftTokenParamVO params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LockDeviceResponseVO lockDevice(LockDeviceParamVO params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetCellsResponseVO getCells(GetCellsParamVO params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UnlockDeviceResponseVO unlockDevice(UnlockDeviceParamVO params) {
		// TODO Auto-generated method stub
		return null;
	}
}