package com.generalseguros.seguridad;

import java.io.Serializable;

import com.generalseguros.db.CommonDB;
import com.generalseguros.dto.Usuario;

public interface IObtenUsuario extends Serializable {
	
	Usuario execute(String usuario, String sessionId, boolean bySession);
	
	public static final String OBTEN_USUARIO_SESSION = CommonDB.getPropertyValue("ObtenerUsuarioPorSession");
	public static final String OBTEN_TIPO_USUARIO = CommonDB.getPropertyValue("ObtenerTipoUsuario");
}
