package com.falabella.ws.services.getpreferences.base;

import cl.taisachile.scc.ws.Administrationv2WS;
import cl.taisachile.scc.ws.GetAvailableDeviceTypesParamVO;
import cl.taisachile.scc.ws.GetAvailableDeviceTypesResponseVO;
import cl.taisachile.scc.ws.GetPreferencesParamVO;
import cl.taisachile.scc.ws.GetPreferencesResponseVO;
import cl.taisachile.scc.ws.GetUserParamVO;
import cl.taisachile.scc.ws.GetUserResponseVO;
import cl.taisachile.scc.ws.SetAuthenticationPreferenceParamVO;
import cl.taisachile.scc.ws.SetAuthenticationPreferenceResponseVO;

public abstract class GetPreferencesServiceBase implements Administrationv2WS {
    @Override
    public GetAvailableDeviceTypesResponseVO getAvailableDeviceTypes(GetAvailableDeviceTypesParamVO params) {
        return new GetAvailableDeviceTypesResponseVO();
    }
    
    @Override
    public GetPreferencesResponseVO getPreferences(GetPreferencesParamVO getPreferencesParam) {
        return new GetPreferencesResponseVO();
    }
    
    @Override
    public GetUserResponseVO getUser(GetUserParamVO getUserParam) {
        return new GetUserResponseVO();
    }
    
    @Override
    public SetAuthenticationPreferenceResponseVO setAuthenticationPreference(SetAuthenticationPreferenceParamVO params) {
        return new SetAuthenticationPreferenceResponseVO();
    }
}