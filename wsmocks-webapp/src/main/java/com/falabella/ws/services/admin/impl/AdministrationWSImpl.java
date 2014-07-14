package com.falabella.ws.services.admin.impl;

import org.springframework.stereotype.Service;

import cl.taisachile.scc.ws.ContactoInfoVO;
import cl.taisachile.scc.ws.DeviceVO;
import cl.taisachile.scc.ws.GetUserParamVO;
import cl.taisachile.scc.ws.GetUserResponseVO;

import com.falabella.ws.services.admin.base.AdministrationWSBase;

@Service("administrationService")
public class AdministrationWSImpl extends AdministrationWSBase {
    //private static int stolen = 0;
    
    @Override
    public GetUserResponseVO getUser(GetUserParamVO getUserParam) {
	GetUserResponseVO response = new GetUserResponseVO();
	ContactoInfoVO contactInfo = new ContactoInfoVO();
	contactInfo.setLabel("EMAIL");
	contactInfo.setValue("rvillablanca@orangepeople.cl");
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
	    //stolen++;
	    /*
	     * if (stolen == 5) { device.setState("CANCELED"); stolen = 0; }
	     */
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
}