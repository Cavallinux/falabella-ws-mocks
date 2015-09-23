package com.falabella.ws.services.adminv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import cl.taisa.scc.ws.adminv2.Administrationv2WS;
import cl.taisa.scc.ws.adminv2.AuthenticationPreferenceVO;
import cl.taisa.scc.ws.adminv2.DeviceTypeVO;
import cl.taisa.scc.ws.adminv2.DeviceVO;
import cl.taisa.scc.ws.adminv2.GetAvailableDeviceTypesParamVO;
import cl.taisa.scc.ws.adminv2.GetAvailableDeviceTypesResponseVO;
import cl.taisa.scc.ws.adminv2.GetPreferencesParamVO;
import cl.taisa.scc.ws.adminv2.GetPreferencesResponseVO;
import cl.taisa.scc.ws.adminv2.GetUserParamVO;
import cl.taisa.scc.ws.adminv2.GetUserResponseVO;
import cl.taisa.scc.ws.adminv2.SetAuthenticationPreferenceParamVO;
import cl.taisa.scc.ws.adminv2.SetAuthenticationPreferenceResponseVO;

@Service("adminV2Service")
public class Administrationv2WSImpl implements Administrationv2WS {
    @Resource(name = "emailPairedByRut")
    private Map<String, String> emailPairedByRut;
    private static Logger logger;
    
	static {
		logger = LoggerFactory.getLogger(Administrationv2WSImpl.class);
	}

    @Override
    public GetUserResponseVO getUser(GetUserParamVO getUserParam) {
		logger.debug("Receiving following user data request: {}", ToStringBuilder.reflectionToString(getUserParam, ToStringStyle.MULTI_LINE_STYLE));
		GetUserResponseVO userResponse = new GetUserResponseVO();
		List<AuthenticationPreferenceVO> devicePreferences = new ArrayList<AuthenticationPreferenceVO>();
		List<DeviceVO> devices = new ArrayList<DeviceVO>();
		
		AuthenticationPreferenceVO authPreference = new AuthenticationPreferenceVO();
		authPreference.setPriority(1);
		DeviceTypeVO deviceTypeVO = new DeviceTypeVO();
		deviceTypeVO.setCode("GRID");
		deviceTypeVO.setDeviceTypeId(1);
		authPreference.setDeviceType(deviceTypeVO);
		devicePreferences.add(authPreference);
		
		authPreference = new AuthenticationPreferenceVO();
		authPreference.setPriority(2);
		deviceTypeVO = new DeviceTypeVO();
		deviceTypeVO.setCode("OTP_SMS");
		deviceTypeVO.setDeviceTypeId(2);
		authPreference.setDeviceType(deviceTypeVO);
		devicePreferences.add(authPreference);
		
		DeviceVO device = new DeviceVO();
		device.setAttemptsRemaining(0);
		device.setSerialNumber("12345678");
		device.setType("GRID");
		device.setState("CURRENT");
		devices.add(device);
		device = new DeviceVO();
		device.setAttemptsRemaining(3);
		device.setSerialNumber(StringUtils.EMPTY);
		device.setType("OTP_SMS");
		device.setState("CURRENT");
		devices.add(device);
		
		logger.debug("Returning following user data response: {}", ToStringBuilder.reflectionToString(userResponse, ToStringStyle.MULTI_LINE_STYLE));
		return userResponse;
	}

    @Override
    public GetAvailableDeviceTypesResponseVO getAvailableDeviceTypes(GetAvailableDeviceTypesParamVO params) {
    	throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public GetPreferencesResponseVO getPreferences( GetPreferencesParamVO getPreferencesParam) {
    	throw new UnsupportedOperationException("Not supported yet.");
    }

	@Override
	public SetAuthenticationPreferenceResponseVO setAuthenticationPreference(SetAuthenticationPreferenceParamVO params) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}