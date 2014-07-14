package com.falabella.ws.services.getpreferences.impl;

import org.springframework.stereotype.Service;

import cl.taisachile.scc.ws.GetPreferencesParamVO;
import cl.taisachile.scc.ws.GetPreferencesResponseVO;

import com.falabella.ws.services.getpreferences.base.GetPreferencesServiceBase;

@Service("getPreferencesService")
public class GetPreferencesServiceImpl extends GetPreferencesServiceBase {
    @Override
    public GetPreferencesResponseVO getPreferences(GetPreferencesParamVO getPreferencesParam) {
        return super.getPreferences(getPreferencesParam);
    }
}