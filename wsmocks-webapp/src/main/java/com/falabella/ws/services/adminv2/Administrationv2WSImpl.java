package com.falabella.ws.services.adminv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import cl.taisa.scc.ws.adminv2.Administrationv2WS;
import cl.taisa.scc.ws.adminv2.AuthenticationPreferenceVO;
import cl.taisa.scc.ws.adminv2.ContactoInfoVO;
import cl.taisa.scc.ws.adminv2.DeviceTypeVO;
import cl.taisa.scc.ws.adminv2.DeviceVO;
import cl.taisa.scc.ws.adminv2.GetAvailableDeviceTypesParamVO;
import cl.taisa.scc.ws.adminv2.GetAvailableDeviceTypesResponseVO;
import cl.taisa.scc.ws.adminv2.GetPreferencesParamVO;
import cl.taisa.scc.ws.adminv2.GetPreferencesResponseVO;
import cl.taisa.scc.ws.adminv2.GetUserParamVO;
import cl.taisa.scc.ws.adminv2.GetUserResponseVO;
import cl.taisa.scc.ws.adminv2.MachineVO;
import cl.taisa.scc.ws.adminv2.QaSecretVO;
import cl.taisa.scc.ws.adminv2.SetAuthenticationPreferenceParamVO;
import cl.taisa.scc.ws.adminv2.SetAuthenticationPreferenceResponseVO;
import cl.taisa.scc.ws.adminv2.UserVO;

@Service("adminV2Service")
public class Administrationv2WSImpl implements Administrationv2WS {
    @Resource(name = "emailPairedByRut")
    private Map<String, String> emailPairedByRut;
    private static Logger logger;
    
    static{
	logger = LoggerFactory.getLogger(Administrationv2WSImpl.class);
    }

    @Override
    public GetUserResponseVO getUser(GetUserParamVO getUserParam) {
	logger.debug("Receiving following user data request: {}", ToStringBuilder.reflectionToString(getUserParam, ToStringStyle.MULTI_LINE_STYLE));
	GetUserResponseVO userResponse = new GetUserResponseVO();
	AuthenticationPreferenceVO devicePreferences1 = new AuthenticationPreferenceVO();
	AuthenticationPreferenceVO devicePreferences2 = new AuthenticationPreferenceVO();
	AuthenticationPreferenceVO devicePreferences3 = new AuthenticationPreferenceVO();
	DeviceTypeVO deviceType1 = new DeviceTypeVO();
	DeviceTypeVO deviceType2 = new DeviceTypeVO();
	DeviceTypeVO deviceType3 = new DeviceTypeVO();
	DeviceVO devices1 = new DeviceVO();
	DeviceVO devices2 = new DeviceVO();
	DeviceVO devices3 = new DeviceVO();
	MachineVO machines = new MachineVO();
	QaSecretVO qaSecrets = new QaSecretVO();
	UserVO user = new UserVO();
	ContactoInfoVO userInfo = new ContactoInfoVO();
	ContactoInfoVO userInfo2 = new ContactoInfoVO();
	List<AuthenticationPreferenceVO> authenticationPrefrences = new ArrayList<AuthenticationPreferenceVO>();
	List<DeviceVO> deviceVo = new ArrayList<DeviceVO>();
	List<MachineVO> machineVo = new ArrayList<MachineVO>();
	List<QaSecretVO> qASecretVo = new ArrayList<QaSecretVO>();
	List<ContactoInfoVO> contactoInfoVo = new ArrayList<ContactoInfoVO>();

	deviceType1.setCode("OTP_EMAIL");
	deviceType1.setDescription("OTP VIA GRID");
	deviceType1.setDeviceTypeId(3);

	devicePreferences1.setDeviceType(deviceType1);
	devicePreferences1.setPriority(4);
	authenticationPrefrences.add(devicePreferences1);

	devices1.setAttemptsRemaining(3);
	devices1.setSerialNumber("222");
	devices1.setState("HOLD");
	devices1.setType("GRID");
	deviceVo.add(devices1);

	deviceType3.setCode("OTP_SMS");
	deviceType3.setDescription("OTP VIA SMS");
	deviceType3.setDeviceTypeId(3);

	devicePreferences3.setDeviceType(deviceType3);
	devicePreferences3.setPriority(4);
	authenticationPrefrences.add(devicePreferences3);

	devicePreferences3.setDeviceType(deviceType3);
	devices3.setAttemptsRemaining(3);
	devices3.setSerialNumber("323");
	devices3.setState("CURRENT");
	devices3.setType("OTP_SMS");
	deviceVo.add(devices3);

	machines.setMachineLabel("Máquina 2");
	machines.setNonce("F850K/44a/nF4mgMhRBQGA==");
	machineVo.add(machines);

	qaSecrets.setAnswer("No");
	qaSecrets.setQuestion("¿Qué?");
	qASecretVo.add(qaSecrets);

	user.setGroupId("MCRCL");
	user.setUserId("CMRCL/1:159342387");

	userInfo.setLabel("EMAIL");
	userInfo.setValue(emailPairedByRut.get(getUserParam.getUserVO().getUserId()));
	userInfo.setOtpAttemptsRemaining(3);
	contactoInfoVo.add(userInfo);

	userInfo2.setLabel("MOBILE");
	userInfo2.setValue("57185199");
	contactoInfoVo.add(userInfo2);

	userResponse.setErrorCode(0);
	userResponse.getDevicePreferences().addAll(authenticationPrefrences);
	userResponse.getDevices().addAll(deviceVo);
	userResponse.getMachines().addAll(machineVo);
	userResponse.getQaSecrets().addAll(qASecretVo);
	userResponse.setFullName("Hermann Arriagada Méndez");
	userResponse.setUser(user);
	userResponse.getUserInfo().addAll(contactoInfoVo);
	
	logger.debug("Returning following user data response: {}", ToStringBuilder.reflectionToString(userResponse, ToStringStyle.MULTI_LINE_STYLE));
	return userResponse;
    }

    @Override
    public GetAvailableDeviceTypesResponseVO getAvailableDeviceTypes(
	    GetAvailableDeviceTypesParamVO params) {
	throw new UnsupportedOperationException("Not supported yet."); // To
								       // change
								       // body
								       // of
								       // generated
								       // methods,
								       // choose
								       // Tools
								       // |
								       // Templates.
    }

    @Override
    public GetPreferencesResponseVO getPreferences(
	    GetPreferencesParamVO getPreferencesParam) {
	throw new UnsupportedOperationException("Not supported yet."); // To
								       // change
								       // body
								       // of
								       // generated
								       // methods,
								       // choose
								       // Tools
								       // |
								       // Templates.
    }

    @Override
    public SetAuthenticationPreferenceResponseVO setAuthenticationPreference(
	    SetAuthenticationPreferenceParamVO params) {
	throw new UnsupportedOperationException("Not supported yet."); // To
								       // change
								       // body
								       // of
								       // generated
								       // methods,
								       // choose
								       // Tools
								       // |
								       // Templates.
    }

}
