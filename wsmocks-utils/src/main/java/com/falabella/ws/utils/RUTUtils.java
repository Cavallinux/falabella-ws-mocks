package com.falabella.ws.utils;

public class RUTUtils {
    
    /**
     * Obtiene el digito verificador del rut que se parsea
     * 
     * @param rut
     *            Rut a obtener digito verificador.
     * @return
     */
    public static String getDV(int rut) {
	int M = 0, S = 1, T = rut;
	for (; T != 0; T /= 10) {
	    S = (S + T % 10 * (9 - M++ % 6)) % 11;
	}
	char dv = (char) (S != 0 ? S + 47 : 75);
	return String.valueOf(dv);
    }
}